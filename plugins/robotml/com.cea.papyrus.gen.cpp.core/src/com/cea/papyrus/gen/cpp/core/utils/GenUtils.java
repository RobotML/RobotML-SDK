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
package com.cea.papyrus.gen.cpp.core.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationTemplateParameter;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;

import com.cea.papyrus.gen.cpp.core.CppStereo;


/**
 * Some utilities: a set of static method for C++ code generator
 * Mainly "Template" related methods
 * Should probably be put in com.cea.utils in next release
 * 
 * @author wassim
 * 
 */
public class GenUtils {

	/**
	 * Retrieve template bindings for the class passed as a Parameter
	 * only one template binding can exist for an element
	 * 
	 * @param current
	 *        Class on which the template binding is searched
	 * @return the template binding of current Class
	 */
	public static TemplateBinding getTemplateBindings(Class current)
	{
		TemplateBinding binding = null;
		if(current.getTemplateBindings().size() == 1) {
			binding = current.getTemplateBindings().get(0);
		}

		return binding;
	}

	public static boolean isTemplateBoundElement(Class uml2Class) {
		boolean result = false;
		EList<TemplateBinding> tb = uml2Class.getTemplateBindings();
		if(tb != null) {
			Iterator<TemplateBinding> itb = tb.iterator();
			while(itb.hasNext()) {
				TemplateBinding currentTb = itb.next();
				result = currentTb.getBoundElement() == uml2Class;
			}
		}
		return result;
	}

	public static Collection<TemplateParameter> getTemplateParameters(
		Classifier classifier)
	{

		Collection<TemplateParameter> params = new ArrayList<TemplateParameter>();
		TemplateSignature ts = classifier.getOwnedTemplateSignature();
		if(ts != null) {
			params.addAll(ts.getOwnedParameters());
		}

		return params;
	}

	public static Collection<ParameterableElement> getTemplateParameteredElements(
		Classifier classifier)
	{

		Collection<ParameterableElement> params = new ArrayList<ParameterableElement>();
		TemplateSignature ts = classifier.getOwnedTemplateSignature();
		if(ts != null) {
			for(TemplateParameter tp : ts.getOwnedParameters()) {
				if(tp != null) {
					params.add(tp.getParameteredElement());
				}
			}
		}

		return params;
	}

	/**
	 * Return a list of template parameters without type
	 * 
	 * @param classifier
	 * @return
	 */
	public static String getTemplateParametersWoType(Classifier classifier)
	{
		String tparamWoType = "";

		Iterator<TemplateParameter> it = GenUtils.getTemplateParameters(
			classifier).iterator();

		while(it.hasNext()) {
			TemplateParameter currentTParam = it.next();
			tparamWoType = tparamWoType + GenUtils.getname(currentTParam);

			if(it.hasNext()) {
				tparamWoType = tparamWoType + ", ";
			}
		}
		return tparamWoType;
	}

	/**
	 * Gives the type of the parameter or null for void.
	 * (used in particular in the context of template parameters
	 * TODO: redundant with qualifiedName??)
	 * 
	 * @return the template type formated as string
	 */
	public static String getType(TemplateParameter templateParam)
	{
		String type = "", name = "";

		// Retrieve name of the ParameteredElement (when possible = it is a NamedElement
		ParameterableElement pElt = templateParam.getParameteredElement();
		if((pElt != null) && (pElt instanceof NamedElement)) {
			name = ((NamedElement)pElt).getName();
			if(templateParam instanceof ClassifierTemplateParameter) {
				type = "class";
			}
			else if(templateParam instanceof OperationTemplateParameter) {
				type = "";
			}
			else if(templateParam instanceof ConnectableElementTemplateParameter) {
				type = "";
			}
			else {// uml2TemplateParameter instanceof TemplateParameter
				if(pElt instanceof LiteralInteger) {
					type = "int";
				}
				else if(pElt instanceof LiteralString) {
					type = "String";
				} else if(pElt instanceof LiteralBoolean) {
					type = "Boolean";
				} else if(pElt instanceof LiteralUnlimitedNatural) {
					type = "UnlimitedNatural";
				} else {
					type = pElt.eClass().getName();
				}
			}

		} else {
			name = "undefined";
		}

		// Retrieve the name of the type
		/*
		 * if (templateParam instanceof ClassifierTemplateParameter) {
		 * type = "class";
		 * } else
		 * {
		 * if ((pElt != null) && (pElt instanceof LiteralInteger)) {
		 * type = "int";
		 * } else {
		 * // Need test the other cases (LiteralBoolean ? LiteralString ?)
		 * type = "undefined";
		 * }
		 * }
		 */

		return (type + " " + name);
	}

	public static String getname(TemplateParameter templateParam)
	{
		String name = "";
		ParameterableElement pElt = templateParam.getParameteredElement();
		if((pElt != null) && (pElt instanceof NamedElement)) {
			name = ((NamedElement)pElt).getName();
		} else {
			name = "undefined";
		}

		return name;
	}

	/**
	 * Retrieve a list of types that belong to by a classifier in the current class
	 * 
	 * @param current
	 *        Class on which the attributes are searched
	 * @return collection of classes which are the type of the attributes
	 */
	public static EList<Classifier> getOwnedAttributeTypes(Classifier current)
	{
		EList<Classifier> result = new UniqueEList<Classifier>();

		Iterator<Property> attributes;
		attributes = current.getAttributes().iterator();
		while(attributes.hasNext()) {
			Property currentAttribute = attributes.next();
			Type type = currentAttribute.getType();
			if(type instanceof Classifier) {
				Classifier attrType = (Classifier)type;
				result.add(attrType);
			}
		}
		return result;
	}

	/**
	 * Retrieve the operations in the current class then for each
	 * operation it finds the parameters that have a class type
	 * 
	 * @param current
	 *        Class on which the attributes are searched
	 * @return collection of classes which are the types of the operations parameters
	 */
	public static EList<Classifier> getIncludesFromOperations(Classifier current)
	{
		EList<Classifier> result = new UniqueEList<Classifier>();
		Iterator<Operation> operations = current.getOperations().iterator();
		while(operations.hasNext()) {
			Operation op = operations.next();
			Iterator<Parameter> i = op.getOwnedParameters().iterator();
			while(i.hasNext()) {
				Parameter param = i.next();
				Type type = param.getType();
				if(type instanceof Classifier) {
					Classifier paramType = (Classifier)type;
					result.add(paramType);
				}
			}
		}
		return result;
	}

	public static EList<Interface> getImplementedInterfaces(Class current)
	{
		EList<Interface> interfaces = new UniqueEList<Interface>();
		Iterator<Interface> interfacesIt = current.getImplementedInterfaces().iterator();
		Interface currentInterface;
		while(interfacesIt.hasNext()) {
			currentInterface = (Interface)interfacesIt.next();
			interfaces.add(currentInterface);
		}
		return interfaces;
	}

	/**
	 * Return a list of classifiers that are referenced by relationships, i.e.
	 * dependencies or associations
	 * 
	 * @param current
	 * @return
	 */
	public static EList<Classifier> getRelationships(Classifier current)
	{
		EList<Classifier> classifiers = new UniqueEList<Classifier>();

		for(DirectedRelationship relationship : current.getSourceDirectedRelationships()) {

			if(relationship.getTargets().size() > 0) {
				// there should always be at least one element in the target
				// list and it should be a classifier, but better check.
				Element element = relationship.getTargets().get(0);
				if(element instanceof Classifier) {
					classifiers.add((Classifier)element);
				}
			}
		}
		return classifiers;
	}

	/**
	 * Return a list of classifiers that are referenced via dependencies
	 * 
	 * @param current
	 * @return
	 */
	public static EList<Classifier> getDependencies(Classifier current)
	{
		EList<Classifier> classifiers = new UniqueEList<Classifier>();

		for(DirectedRelationship relationship : current.getSourceDirectedRelationships()) {
			if(relationship instanceof Dependency) {
				if(relationship.getTargets().size() > 0) {
					// there should always be at least one element in the target
					// list and it should be a classifier, but better check.
					Element element = relationship.getTargets().get(0);
					if(element instanceof Classifier) {
						classifiers.add((Classifier)element);
					}
				}
			}
		}
		return classifiers;
	}

	/**
	 * Return a list of classifiers that are referenced via all kinds of relations except
	 * dependencies
	 * 
	 * @param current
	 * @return
	 */
	public static EList<Classifier> getRelationshipsNoDeps(Classifier current)
	{
		EList<Classifier> classifiers = new UniqueEList<Classifier>();

		for(DirectedRelationship relationship : current.getSourceDirectedRelationships()) {
			if(!(relationship instanceof Dependency)) {
				if(relationship.getTargets().size() > 0) {
					// there should always be at least one element in the target
					// list and it should be a classifier, but better check.
					Element element = relationship.getTargets().get(0);
					if(element instanceof Classifier) {
						classifiers.add((Classifier)element);
					}
				}
			}
		}
		return classifiers;
	}

	/**
	 * Return the qualified name of a named element, but use "_" instead of "::" as separator
	 * 
	 * @param ne
	 *        a named element
	 * @return the fully qualified name with "_" as separator character
	 */
	public static String getFullName(NamedElement ne) {
		return ne.getQualifiedName().replace("::", "_");
	}

	/**
	 * Return a C++ namespace definition for a named element
	 * 
	 * @param ne
	 *        a named element
	 * @return a C++ namespace definition for a named element
	 */
	public static String getNamespace(NamedElement ne) {
		String namespace = "";
		for(Namespace ns : ne.allNamespaces()) {
			if(ns.getOwner() != null) {
				String nsName = ns.getName();
				if(!namespace.equals("")) {
					nsName += "::";
				}
				namespace = nsName + namespace;
			}
		}
		if(!namespace.equals("")) {
			namespace = "\n" +
				"using namespace " + namespace + ";\n";
		}
		return namespace;
	}

	/**
	 * Return a C++ open-namespace definition for a named element
	 * 
	 * @param ne
	 *        a named element
	 * @return a C++ open-namespace definition for a named element
	 */
	public static String openNS(NamedElement ne) {
		String openNS = "";
		currentNS = ne.getNamespace();
		for(Namespace ns : ne.allNamespaces()) {
			if(ns.getOwner() != null) {
				openNS = "namespace " + ns.getName() + " {\n" + openNS;
			}
		}
		return openNS;
	}

	/**
	 * Return a C++ close-namespace definition for a named element
	 * 
	 * @param ne
	 *        a named element
	 * @return a C++ close-namespace definition for a named element
	 */
	public static String closeNS(NamedElement ne) {
		String closeNS = "";
		for(Namespace ns : ne.allNamespaces()) {
			if(ns.getOwner() != null) {
				closeNS += "} // of namespace " + ns.getName() + "\n";
			}
		}
		return closeNS;
	}

	public static String qualifiedName(NamedElement ne) {
		Object owner = ne.getOwner();
		String owningPkgName = "";
		if(owner instanceof Package) {
			owningPkgName = ((Package)owner).getName();
		}
		if((hasStereotype(ne, CppStereo.externClass)) || (hasStereotype(ne, CppStereo.noCodeGen))) {
			return ne.getName();
		}
		else if(owningPkgName.equals("AnsiCLibrary")) {
			// always use the short name for types within the ANSI C library
			// TODO: hack to pass all types defined in ANSI C model library 
			if(ne.getName().startsWith("u")) {
				return "unsigned " + ne.getName().substring(1);
			}
			return ne.getName();
		}
		else if(owningPkgName.equals("UMLPrimitiveTypes") ||
			owningPkgName.equals("MARTE_PrimitivesTypes")) {
			if(ne.getName().equals("Boolean")) {
				return "bool";
			}
			else if(ne.getName().equals("Integer")) {
				return "int";
			}
			else if(ne.getName().equals("String")) {
				return "const char *";
			}
			else if(ne.getName().equals("Unlimited Natural")) {
				return "unsigned long";
			}
			// else unknown within UMLPrimitiveTypes, treat in standard way
		}

		String qName = ne.getName();
		if(currentNS == ne.getNamespace()) {
			// return simple name, if in current namespace
			return qName;
		}
		if(ne instanceof PrimitiveType) {
			if(!hasStereotype(ne, CppStereo.type)) {
				// if a primitive type without further definition, assume that
				// it is a external type without namespace
				// TODO: cleaner: put in a "default" namespace
				return qName;
			}
		}
		for(Namespace ns : ne.allNamespaces()) {
			// don't add top-level
			if(ns.getOwner() != null) {
				qName = ns.getName() + "::" + qName;
			}
		}
		if(qName.contains("::")) {
			// is a qualified name => make path absolute
			return "::" + qName;
		}
		else {
			return qName;
		}
	}

	public static String getComments(Element element) {
		String comments = "";
		Iterator<Comment> commentsIterator = element.getOwnedComments().iterator();
		while(commentsIterator.hasNext()) {
			Comment currentComment = (Comment)commentsIterator.next();
			comments += currentComment.getBody();
		}
		return comments;
	}

	/**
	 * Return a list of dependent package (the list of dependent
	 * elements filtered for packages)
	 * 
	 * @param pkg
	 * @return
	 */
	public static EList<Package> getUsedPackages(Package pkg) {
		EList<Package> result = new BasicEList<Package>();
		for(Element depElement : pkg.getClientDependencies()) {
			if(depElement instanceof Package) {
				result.add((Package)depElement);
			}
		}
		return result;
	}

	/**
	 * Return a list of dependent classes (the list of dependent
	 * elements filtered for classes)
	 * 
	 * @param pkg
	 * @return
	 */
	public static EList<Classifier> getUsedClassifiers(Classifier cls) {
		EList<Classifier> result = new BasicEList<Classifier>();
		for(Element depElement : cls.getClientDependencies()) {
			if(depElement instanceof Classifier) {
				result.add((Classifier)depElement);
			}
		}
		return result;
	}

	/**
	 * Return the qualified name of a package, but use "/" instead of "::" as separator
	 * 
	 * @param pkg
	 * @return
	 */
	public static String getFullPath(Package pkg) {
		return pkg.getQualifiedName().replace("::", "/");
	}

	/**
	 * Is a certain stereotype applied?
	 * 
	 * @param element
	 * @param stereotype
	 *        fully qualified stereotype name
	 * @return
	 */
	public static boolean hasStereotype(Element element, String stereotName) {
		return element.getAppliedStereotype(stereotName) != null;
	}

	/**
	 * Is a certain stereotype applied?
	 * 
	 * @param element
	 * @param stereotype
	 *        fully qualified stereotype name
	 * @return
	 */
	public static void setStereotype(Element element, String stereotName, boolean apply) {
		Stereotype stereotype = element.getApplicableStereotype(stereotName);
		if(stereotype != null) {
			if(apply) {
				if(!element.isStereotypeApplied(stereotype)) {
					element.applyStereotype(stereotype);
				}
			}
			else {
				if(element.isStereotypeApplied(stereotype)) {
					element.unapplyStereotype(stereotype);
				}
			}
		}
	}

	/**
	 * This method returns the stereotype applied to a certain element when given its name.
	 * Returns null, if a stereotype of that name does not exist.
	 * This function is quite similar to getAppliedStereotype, the difference is that it
	 * is not based on fully qualified name.
	 */
	public static String getTaggedValue(Element element, String stereo_name, String attrib_name)
	{
		Stereotype stereotype = element.getAppliedStereotype(stereo_name);
		if(stereotype == null) {
			return "";
		}
		Object value = element.getValue(stereotype, attrib_name);
		if(value == null) {
			return "";
		}

		if(value instanceof NamedElement) {
			return ((NamedElement)value).getName();
		} else if(value instanceof String) {
			return (String)value;
		} else {
			return value.toString();
		}
	}

	/**
	 * This method returns the stereotype applied to a certain element when given its name.
	 * Returns null, if a stereotype of that name does not exist.
	 * This function is quite similar to getAppliedStereotype, the difference is that it
	 * is not based on fully qualified name.
	 */
	public static void setTaggedValue(Element element, String stereo_name, String attrib_name, Object value)
	{
		Stereotype stereotype = element.getAppliedStereotype(stereo_name);
		if(stereotype != null) {
			element.setValue(stereotype, attrib_name, value);
		}
	}

	/**
	 * @param operation
	 *        the operation
	 * @param selectedLanguage
	 *        the selected language
	 * @return Return the first body of a selected language that is provided by
	 *         one of the operation's methods
	 */
	public static String getBody(Operation operation, String selectedLanguage) {
		for(Behavior behavior : operation.getMethods()) {
			if(behavior instanceof OpaqueBehavior) {
				OpaqueBehavior ob = (OpaqueBehavior)behavior;
				Iterator<String> bodies = ob.getBodies().iterator();
				for(String language : ob.getLanguages()) {
					String body = bodies.next();
					if(language.equals(selectedLanguage)) {
						return indent(body, "\t");
					}
				}
			}
		}
		return "";
	}

	/**
	 * Format text output, indent each line with the passed string
	 * 
	 * @param source
	 * @param indentStr
	 * @return
	 */
	public static String indent(String source, String indentStr) {
		String result = "";
		String[] lines = source.split("\n");
		for(int i = 0; i < lines.length; i++) {
			result += indentStr + lines[i];
			if(i < lines.length - 1) {
				result += "\n";
			}
		}
		return result;
	}

	/**
	 * return true, if shared aggregation (no composition).
	 * TODO: consider whether used as association?
	 * 
	 * @param p
	 * @return
	 */
	public static boolean isAggregation(Property p) {
		return /* (p.getAssociation() != null) && */
		(p.getAggregation() == AggregationKind.SHARED_LITERAL);
	}

	private static Namespace currentNS;
}
