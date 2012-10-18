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

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;

import FCM.Template;
import FCM.TemplateKind;

import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.acceleo.UMLTool;
import com.cea.ec3m.gentools.core.transformations.Copy;
import com.cea.ec3m.gentools.core.transformations.TransformationException;
import com.cea.ec3m.gentools.core.transformations.filters.FilterSignatures;
import com.cea.ec3m.gentools.core.transformations.filters.FilterTemplate;
import com.cea.ec3m.gentools.core.transformations.filters.FixTemplateSync;

/**
 * This class encapsulated functions around template instantiation.
 * 
 * With respect to composite structures, we need to consider two different
 * cases: (1) the type of a property is a template class itself (2) the type of
 * a property is a sub-class (nesting) of the template class. We consider that
 * such a class inherits the template signature of its owner, i.e. it can access
 * formal parameters of the owning template class. (3) the type of a property is
 * a normal class
 */

public class TemplateInstantiation {

	public TemplateInstantiation(Copy copy, TemplateBinding binding) throws TransformationException {
		this(copy, binding, null);
	}

	public TemplateInstantiation(final Copy copy_, final TemplateBinding binding, Object args[]) throws TransformationException {
		if(binding == null) {
			// user should never see this exception
			throw new TransformationException("Passed binding is null");
		}
		signature = binding.getSignature();
		if(signature == null) {
			throw new TransformationException("Passed template binding does not have a signature");
		}
		packageTemplate = (Package)signature.getOwner();
		/*
		 * copy = (Copy)copy_.clone();
		 * // make copy of copy listeners (clone alone does not duplicate contained lists)
		 * copy.preCopyListeners = new BasicEList<CopyListener>();
		 * copy.preCopyListeners.addAll(copy_.preCopyListeners);
		 * copy.postCopyListeners = new BasicEList<CopyListener>();
		 * copy.postCopyListeners.addAll(copy_.postCopyListeners);
		 */
		copy = copy_;

		Package boundPackage = (Package)binding.getBoundElement();
		// set template instantiation parameter. Used by acceleo templates to get relation between
		// formal and actual parameters
		UMLTool.setTemplateInstantiation(this);

		copy.setPackageTemplate(packageTemplate, boundPackage);
		this.binding = binding;
		this.args = args;

		// register a combination of formal/actual in the hashmap
		// => copy will replace actual with formal
		for(TemplateParameterSubstitution substitution : binding.getParameterSubstitutions()) {
			ParameterableElement formal = substitution.getFormal().getParameteredElement();
			ParameterableElement actual = substitution.getActual();
			copy.put(formal, actual);
		}

		// add copy listeners ---
		// remove template signature
		if(!copy.preCopyListeners.contains(FilterSignatures.getInstance())) {
			copy.preCopyListeners.add(FilterSignatures.getInstance());
		}

		// 2. special treatment for elements stereotyped with template parameter
		if(!copy.preCopyListeners.contains(TemplateInstantiationListener.getInstance())) {
			copy.preCopyListeners.add(TemplateInstantiationListener.getInstance());
		}
		TemplateInstantiationListener.getInstance().init(copy, binding, args);

		if(!copy.postCopyListeners.contains(FixTemplateSync.getInstance())) {
			copy.postCopyListeners.add(FixTemplateSync.getInstance());
		}
	}


	Package packageTemplate;

	public TemplateBinding binding;

	public Copy copy;

	TemplateSignature signature;

	Object[] args;

	/**
	 * Bind a named element. Besides of binding the passed element, this
	 * operation will bind all elements that are referenced (required) by the
	 * passed element.
	 * 
	 * In consequence, typically only a small part of a package template is
	 * actually created within the bound package. We call this mechanism lazy
	 * instantiation/binding
	 * 
	 * @param copy
	 *        Source and target model
	 * @param namedElement
	 *        A member within the package template which should be bound,
	 *        i.e. for which template instantiation should be performed.
	 * @param binding
	 *        The binding between the bound package and the package template
	 * @param args
	 *        Acceleo arguments
	 */
	public <T extends NamedElement> T bindNamedElement(T namedElement) throws TransformationException {
		if(namedElement == null) {
			// user should never see this exception
			throw new TransformationException("Passed template elements is null");
		}

		Package boundPackage = (Package)binding.getBoundElement();
		EList<Namespace> path = UMLTool.relativePath(namedElement, packageTemplate);
		Template template = StUtils.getApplication(namedElement, Template.class);
		TemplateKind templateKind = (template != null) ?
			templateKind = template.getKind() :
			TemplateKind.PASS_FORMAL;

		boolean dontBind = false;
		if((templateKind == TemplateKind.ACCUMULATE) || (templateKind == TemplateKind.LATE_EVALUATION)) {
			// TODO: not very clean yet
			path = UMLTool.relativePath(namedElement, copy.source);
			if(path == null) {
				// element is imported
				path = namedElement.allNamespaces();
			}
			boundPackage = copy.target; // CreationUtils.getAndCreate
										// (sat.target, "accumulate");
		}

		if(path != null) {
			// register owning package template (template can be defined in
			// multiple packages)
			// TODO: need to have TemplateUtils function to get "up" until package template

			Element owner = TemplateUtils.getTemplateOwner(namedElement, signature);
			if(owner != null) {
				// note that we might overwrite an existing value
				copy.put(owner, boundPackage);
			}
		}
		else {
			// element is not part of the package template referenced by the
			// binding
			if(namedElement instanceof TemplateableElement) {
				// check whether the referenced element is part of another
				// package template,
				// (for which we allow for implicit binding with the first
				// template parameter)
				TemplateSignature signatureOfNE = TemplateUtils.getSignature((TemplateableElement)namedElement);
				if((signatureOfNE != null) && (signature != signatureOfNE)) {
					TemplateBinding subBinding = TemplateUtils.getSubBinding(copy.target, (TemplateableElement)namedElement, binding);
					TemplateInstantiation ti = new TemplateInstantiation(copy, subBinding, args);
					NamedElement ret = ti.bindNamedElement(namedElement);
					return (T)ret;
				}
			}

			// => nothing to do with respect to template instantiation, but
			// since the template is potentially instantiated in another model,
			// (see sat info) the referenced element might need to be copied.

			return copy.getCopy(namedElement);
		}
		// element is contained in the template package, examine whether it
		// already exists in the
		// bound package.

		NamedElement existingMember = (NamedElement)copy.get(namedElement);
		if((existingMember != null) && (templateKind != TemplateKind.ACCUMULATE)) {
			// element is already existing (and thus bound), nothing to do
			// additional check, whether the ACCUMULATE information is unset)
			// however: if the element is a package, existence is not sufficient
			// since it might have been created via getAndCreate above
			/*
			 * if(namedElement instanceof Package) {
			 * bindPackage((Package)namedElement);
			 * }
			 */
			return (T)existingMember;
		}

		if(existingMember == null) {
			FilterTemplate.getInstance().setActive(false);
			T copiedElement = copy.getCopy(namedElement);
			FilterTemplate.getInstance().setActive(true);
			copy.setPackageTemplate(null, null);
			return copiedElement;
		}
		return (T)existingMember;
	}

}
