/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 *
 *****************************************************************************/
package com.cea.ec3m.gentools.core.templates;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;

import com.cea.ec3m.gentools.core.CreationUtils;
import com.cea.ec3m.gentools.core.Log;
import com.cea.ec3m.gentools.core.transformations.Copy;
import com.cea.ec3m.gentools.core.transformations.TransformationException;

public class TemplateUtils {

	/**
	 * Get the template signature of a classifier. If the classifier does not
	 * himself have a signature, look also if the owning class provides one (
	 * 
	 * @param template
	 *        The potential template
	 * @return the signature or null, if none can be found.
	 */
	public static TemplateSignature getSignature(TemplateableElement template) {
		TemplateSignature signature = getSignatureDirect(template);
		if(signature != null) {
			return signature;
		}

		// no signature found, try signature of owning classifier (nested class)
		// or package
		Element owner = template.getOwner();
		if(owner instanceof TemplateableElement) {
			// owned by a classifier, not a package
			return getSignature((TemplateableElement)owner);
		} else {
			return null;
		}
	}

	public static Element getTemplateOwner(Element ne, TemplateSignature signature) {
		if((ne instanceof TemplateableElement) && getSignatureDirect((TemplateableElement)ne) == signature) {
			return ne;
		}
		Element owner = ne.getOwner();
		if(owner != null) {
			return getTemplateOwner(owner, signature);
		}
		return null;
	}

	/**
	 * Get the template signature of a classifier. The class must own the
	 * signature itself (besides the import), not the owner
	 * 
	 * @param template
	 *        The potential template
	 * @return the signature or null, if none can be found.
	 */

	public static TemplateSignature getSignatureDirect(TemplateableElement template) {
		for(Element element : template.getOwnedElements()) {
			if(element instanceof TemplateSignature) {
				return (TemplateSignature)element;
			}
		}

		// hack to enable multiple package template definitions which share the
		// same template signature.
		if(template instanceof Package) {
			Package pkg = (Package)template;
			for(PackageImport pkgImport : pkg.getPackageImports()) {
				Package importedPkg = pkgImport.getImportedPackage();
				return getSignature(importedPkg);
			}
		}
		return null;
	}

	/**
	 * Create a template binding by using a single, fixed actual (used within
	 * eC3M for the binding of container extensions depending on the component
	 * executor)
	 * 
	 * @param model
	 *        : target model in which to create the bound package
	 * @param template
	 * @param fixedActual
	 * @return
	 * @throws TransformationException
	 */
	public static TemplateBinding fixedBinding(Package model, TemplateableElement template, Classifier fixedActual)
		throws TransformationException {
		// obtain the signature of an element within a package template.

		TemplateSignature signature = getSignature(template);
		if(signature == null) {
			// not a template, retain original name
			Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING,
				"no template signature found" + (template instanceof NamedElement ?
					" for " + ((NamedElement)template).getName() :
					""));
			return null;
		}

		EList<Type> actuals = new BasicEList<Type>();

		Package pkgTemplate = (Package)signature.getOwner();
		String name = pkgTemplate.getName();

		// loop on template parameters;
		// for (TemplateParameter parameter : signature.getOwnedParameters ()) {
		// ParameterableElement formal = parameter.getParameteredElement();

		// now obtain suitable binding for this parameter - look for ports that
		// are typed with the formal template parameter

		actuals.add(fixedActual);
		name = name + "_" + fixedActual.getName();
		// }

		// the bound package is instantiated in the same model, in which the
		// composite can be found (avoid modifying an imported model).
		// todo: root model as an additional parameter?
		Namespace owner = (Namespace)pkgTemplate.getOwner();
		owner = CreationUtils.getAndCreate(model, owner.allNamespaces());

		Package boundPackage = (Package)owner.getMember(name);
		if(boundPackage == null) {
			// class does not exist yet, needs to be created.
			boundPackage = ((Package)owner).createNestedPackage(name);

			Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING,
				"create bound package (fixed binding): " + name
					+ " within " + owner.getName());
		}

		TemplateBinding binding = boundPackage.getTemplateBinding(signature);
		if(binding == null) {
			// binding is not existing yet (should normally only happen, if the class has
			// just been created - but it's better to re-check, even if the bound package
			// was already there)
			binding = boundPackage.createTemplateBinding(signature);

			Iterator<Type> actualsIter = actuals.iterator();

			// loop on template parameters;
			for(TemplateParameter parameter : signature.getOwnedParameters()) {

				TemplateParameterSubstitution substitution =
					binding.createParameterSubstitution();
				substitution.setFormal(parameter);

				// now obtain suitable binding for this parameter - look for
				// ports that are typed with
				// the formal template parameter
				Type actual = actualsIter.next();
				substitution.setActual((ParameterableElement)actual);
			}
		}
		return binding;
	}

	/**
	 * create a "sub" binding in which the first parameter of type Cl is assumed
	 * to bind the sub-signature TODO: compared type and name of parameters in
	 * two signatures TODO: support more than one template parameter
	 * 
	 * @param model
	 * @param te
	 * @param existingBinding
	 * @return
	 * @throws TransformationException
	 */
	public static TemplateBinding getSubBinding(Package model,
		TemplateableElement te, TemplateBinding existingBinding)
		throws TransformationException {

		for(TemplateParameterSubstitution tps : existingBinding.getParameterSubstitutions()) {
			ParameterableElement pe = tps.getActual();
			if(pe instanceof Classifier) {
				return fixedBinding(model, te, (Classifier)pe);
			}
		}
		return null;
	}

	/**
	 * Adapt the actuals within the binding (which correspond either to an
	 * element of the source model or an imported element) to the target model.
	 * 
	 * @param sat
	 * @param binding
	 */
	public static void adaptActualsToTargetModel(Copy copy, TemplateBinding binding) {
		for(TemplateParameterSubstitution substitution : binding.getParameterSubstitutions()) {
			substitution.setActual(copy.getCopy(substitution.getActual()));
		}
	}

	/**
	 * Return the actual for a potential formal parameter within a
	 * templateBinding (move to TemplateUtils?)
	 * 
	 * @param binding
	 *        a template binding
	 * @param formal
	 *        a potential formal parameter, i.e. a parameter for which we
	 *        check, if it really corresponds to a formal parameter within
	 *        the template binding.
	 * @return the actual parameter that is associated with the potential formal
	 *         parameter, or null if the 2nd parameter does not correspond to a
	 *         formal parameter of the binding.
	 */
	public static Classifier getActualFromBinding(
		TemplateBinding binding, Type formal) {
		for(TemplateParameterSubstitution substitution : binding.getParameterSubstitutions()) {
			ParameterableElement pe = substitution.getFormal().getParameteredElement();
			if(pe == formal) {
				Log.log(Log.INFO_MSG, Log.TEMPLATE_INSTANTIATION,
					"TemplateInstantiation.getActualFromBinding: substitution formal = " + pe);
				return (Classifier)substitution.getActual();
			}
		}
		return null;
	}

	public static Classifier getActualFromBinding(
		TemplateBinding binding, String formalName) {
		for(TemplateParameterSubstitution substitution : binding.getParameterSubstitutions()) {
			ParameterableElement pe = substitution.getFormal().getParameteredElement();
			Log.log(Log.INFO_MSG, Log.TEMPLATE_INSTANTIATION,
				"TemplateInstantiation.getActualFromBinding: substitution formal = " + pe);
			if((pe instanceof NamedElement)
				&& ((NamedElement)pe).getName().equals(formalName)) {
				return (Classifier)substitution.getActual();
			}
		}
		return null;
	}
}
