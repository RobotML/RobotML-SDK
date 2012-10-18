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
package com.cea.ec3m.gentools.core.acceleo;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.Stereotypes;
import com.cea.ec3m.gentools.core.Utils;
import com.cea.ec3m.gentools.core.templates.TemplateInstantiation;
import com.cea.ec3m.gentools.core.templates.TemplateUtils;
import com.cea.ec3m.gentools.core.transformations.TransformationContext;


/**
 * Collection of utility functions. In contrast to core.Utils, it is chiefly used by Acceleo
 * scripts
 * 
 * @author ansgar
 * 
 */

public class UMLTool {

	/**
	 * @param operation
	 * @return all in and inout parameters of an operation
	 */
	public static EList<Parameter> parametersInInout(Operation operation) {
		EList<Parameter> list = new BasicEList<Parameter>();
		for(Parameter parameter : operation.getOwnedParameters()) {
			if((parameter.getDirection().getValue() == ParameterDirectionKind.IN) ||
				(parameter.getDirection().getValue() == ParameterDirectionKind.INOUT)) {
				list.add(parameter);
			}
		}
		return list;
	}

	/**
	 * @param operation
	 * @return all out, inout and return parameters of an operation
	 */
	public static EList<Parameter> parametersOutInout(Operation operation) {
		EList<Parameter> list = new BasicEList<Parameter>();
		for(Parameter parameter : operation.getOwnedParameters()) {
			if((parameter.getDirection().getValue() == ParameterDirectionKind.OUT) ||
				(parameter.getDirection().getValue() == ParameterDirectionKind.RETURN) ||
				(parameter.getDirection().getValue() == ParameterDirectionKind.INOUT)) {
				list.add(parameter);
			}
		}
		return list;
	}

	/**
	 * A small helper function that makes names compliant with variable
	 * names in programming languages such as C++ or Java
	 * Unlike varName2, replace scoping signs as well
	 */
	public static String varName(NamedElement element) {
		return varName(element.getName());
	}

	/**
	 * A small helper function that makes names compliant with variable
	 * names in programming languages such as C++ or Java
	 * Unlike varName2, replace scoping signs as well
	 */
	public static String varName(String umlName) {
		umlName = umlName.replace(".", "_");
		umlName = umlName.replace("::", "_");
		return varName2(umlName);
	}

	/**
	 * A small helper function that makes names compliant with variable
	 * names in programming languages such as C++ or Java
	 * TODO: obviously, it is not complete (e.g. in case of "$", national characters ("ä", "é", ...) , ...)
	 */
	public static String varName2(NamedElement element) {
		String umlName = element.getName();
		return varName2(umlName);
	}

	/**
	 * Like varName, but does not replace "." with "_"
	 * 
	 * @param umlName
	 * @return
	 */
	public static String varName2(String umlName) {
		umlName = umlName.replace(" ", "_");
		umlName = umlName.replace("-", "_");
		umlName = umlName.replace("+", "_");
		umlName = umlName.replace("?", "_");
		return umlName;
	}

	public static EList<Namespace> usedNamespaces(NamedElement element) {
		EList<Namespace> list = new BasicEList<Namespace>(element.allNamespaces());

		if(list.size() < 1) {
			return null;
		}
		list.remove(list.size() - 1); // remove last element (top-level)
		return list;
	}

	/**
	 * Return a sequence of namespaces for a given element, starting from the "bottom"
	 * one, i.e. the one in which the element is contained. It will end before the
	 * searchNS namespace is reached. Returns null, if the element is not contained
	 * within the search namespace.
	 * 
	 * @param element
	 * @param searchNS
	 * @return
	 */
	public static EList<Namespace> relativePath(Element element, Namespace searchNS) {
		EList<Namespace> pathList = new BasicEList<Namespace>();
		Element owner = element.getOwner();
		if(!(owner instanceof Namespace)) {
			// happens, if element is contained in a template signature
			return null;
		}
		Namespace ns = (Namespace)owner;
		while(ns != null) {
			if(ns == searchNS) {
				return pathList;
			}
			pathList.add(ns);

			// TODO. Hack: if package import exists, follow it instead of taking owner
			if(ns instanceof Package) {
				Package pkg = (Package)ns;
				Iterator<PackageImport> pkgImports = pkg.getPackageImports().iterator();
				if(pkgImports.hasNext()) {
					PackageImport pkgImport = pkgImports.next();
					Package importedPkg = pkgImport.getImportedPackage();
					ns = importedPkg;
					continue;
				}
			}

			ns = (Namespace)ns.getOwner();
		}
		return null;
	}

	/**
	 * set the port associated with an operation (used within implementation templates).
	 * 
	 * @param port
	 */
	public static void setOpPort(Port port) {
		m_port = port;
	}

	/**
	 * Return the port associated with an operation. It is not dependent on the
	 * passed operation, but a previously registered port is returned earlier.
	 * 
	 * @param op
	 * @return
	 */
	public static Port getOpPort(Operation op) {
		return m_port;
	}

	public static String portName(Operation op) {
		if(m_port != null) {
			return m_port.getName();
		}
		return null;
	}

	public static String portName(Parameter param) {
		return portName((Operation)null);
	}

	/**
	 * This method returns all parameters of an operation in a flat way,
	 * i.e. for parameters typed by a data-type, multiple parameters are
	 * returned.
	 * TODO: support arbitrary nesting (recursive function)
	 */
	public EList<Parameter> flatParameters(Operation operation) {
		EList<Parameter> parameters = new BasicEList<Parameter>();

		for(Parameter parameter : operation.getOwnedParameters()) {
			Type type = parameter.getType();
			if(parameter.getUpper() == -1) {
				// multiplicity = "*"
				Parameter containedParam = UMLFactory.eINSTANCE.createParameter();
				containedParam.setName(parameter.getName() + "_length");
				NamedElement basicTypes = type.getModel().getMember("CORBA");
				if(basicTypes instanceof Package) {
					NamedElement ulong = ((Package)basicTypes).getMember("ULong");
					if(ulong instanceof Type) {
						containedParam.setType((Type)ulong);
					}
				}
				parameters.add(containedParam);
			}
			if((type instanceof PrimitiveType) || (type instanceof Enumeration)) {
				// these two are sub-types of DataType and are therefore checked before 
				parameters.add(parameter);
			}
			if(type instanceof DataType) {
				for(Property property : ((DataType)type).getAttributes()) {
					Parameter containedParam = UMLFactory.eINSTANCE.createParameter();
					containedParam.setName(parameter.getName() + "_" + property.getName());
					containedParam.setType(property.getType());
					parameters.add(containedParam);
				}
			} else {
				parameters.add(parameter);
			}
		}
		return parameters;
	}

	private static Port m_port = null;

	/**
	 * This method returns all types that are referenced by a classifier. This includes
	 * attribute types, types within operations as well as inherited types.
	 * This is useful to generate the #includes
	 * (which is used by the Acceleo code within the packaging plugin)
	 */
	public static EList<Classifier> getReferencedClassifiers(Classifier classifier) {
		EList<Classifier> list = new UniqueEList<Classifier>();
		list.addAll(classifier.parents());

		if(classifier instanceof Class) {
			// get classifiers referenced by attributes
			for(Operation operation : ((Class)classifier).getOwnedOperations()) {
				for(Parameter parameter : operation.getOwnedParameters()) {
					Type type = parameter.getType();
					if(type instanceof Classifier) {
						list.add((Classifier)type);
					}
				}
			}

			// get classifiers referenced by attributes
			for(Property attribute : ((Class)classifier).getOwnedAttributes()) {
				Type type = attribute.getType();
				if(type instanceof Classifier) {
					list.add((Classifier)type);
				}
			}
		}
		return list;
	}

	/**
	 * TODO: copy&paste from C++ generator
	 * 
	 * @param ne
	 * @return
	 */
	public static String cppQName(NamedElement ne) {
		if((StUtils.isApplied(ne, Stereotypes.cppExternClass)) || (StUtils.isApplied(ne, Stereotypes.cppNoCodeGen))) {
			return ne.getName();
		} else {
			String qName = ne.getName();
			for(Namespace ns : ne.allNamespaces()) {
				if(!(ns instanceof Model)) {
					qName = ns.getName() + "::" + qName;
				}
			}
			return qName;
		}
	}

	/**
	 * Set sat and binding context for pkgTemplateParameter function
	 * 
	 * @param sat
	 * @param binding
	 */
	public static void setTemplateInstantiation(TemplateInstantiation ti) {
		m_ti = ti;
	}

	static TemplateInstantiation m_ti;

	/**
	 * Return actual (in the current binding context) from a named package template parameter
	 * Use during template instantiation: code can access actual template parameter via formal
	 * 
	 * @param formal
	 *        the name of the formal parameter
	 * @return the actual
	 */
	public static String pkgTemplateParameter(String formal) {
		Classifier actual = TemplateUtils.getActualFromBinding(m_ti.binding, formal);
		if(actual != null) {
			return actual.getQualifiedName();
		}
		else {
			return "";
		}
	}

	public static String pkgTemplateParameter(Element dummy, String formal) {
		return pkgTemplateParameter(formal);
	}

	/**
	 * Return the name of a parameter. In case of a return parameter, always return the name
	 * "retValue". This quite useful for marshalling operations
	 * 
	 * @param parameter
	 * @return
	 */
	public static String paramName(Parameter parameter) {
		if(parameter.getDirection().getValue() == ParameterDirectionKind.RETURN) {
			return "retValue";
		} else {
			return parameter.getName();
		}
	}

	/**
	 * Return the interface which owns an operation that is implemented by a class operation.
	 * Context: a class might implement several interfaces and thus the interface's operations
	 * using its own operations.
	 * 
	 * @param operation
	 * @return the interface which the interface belongs
	 */
	public static Interface implementsInterface(Operation operation) {
		Element owner = operation.getOwner();
		if(owner instanceof Class) {
			String name = operation.getName();
			EList<Type> types = new BasicEList<Type>();
			for(Parameter parameter : operation.getOwnedParameters()) {
				types.add(parameter.getType());
			}
			// loop over implemented realizations. Do not rely on FCM derivedElement information
			// as it might be missing on some models (it would point from an operation of the class
			// to the associated operation of the interface)
			for(InterfaceRealization ir : ((Class)owner).getInterfaceRealizations()) {
				// check for types to allow for overloading
				Operation candidate = ir.getContract().getOwnedOperation(name, null, types);
				if(candidate != null) {
					return ir.getContract();
				}
			}
		}
		else if(owner instanceof Interface) {
			return (Interface)owner;
		}
		return null;
	}

	/**
	 * Return the bound package in the context of template instantiation for a given actual
	 * This is required by the state machine template which needs to access operation IDs
	 * provided by the call interceptor.
	 * 
	 * @param actual
	 * @return
	 */
	public static Package boundPackageRef(Type actual) {
		String suffix = "_" + actual.getName();
		for(Package nestedPkg : Utils.getTop(actual).getNestedPackages()) {
			if(nestedPkg.getName().endsWith(suffix)) {
				// TODO: code in Acceleo code does not work
				PackageableElement type = nestedPkg.getPackagedElement("OperationIDs");
				if(type instanceof Type) {
					declareDependency((Type)type);
				}
				return nestedPkg;
			}
		}
		return null;
	}

	/**
	 * Declare a dependency between the current classifier in the transformation
	 * context and the passed type.
	 * 
	 * @param type
	 */
	public static void declareDependency(Type type) {
		// check, if a relationship already exists
		for(Relationship dependency : TransformationContext.classifier.getRelationships(UMLPackage.eINSTANCE.getDependency())) {
			if(((Dependency)dependency).getSuppliers().contains(type)) {
				return;
			}
		}
		TransformationContext.classifier.createDependency(type);
	}

	/**
	 * Get the URI fragment of an element within your model
	 * Useful for transmitting model references
	 * 
	 * @param element
	 *        a uml element
	 * @return
	 */
	public static String fragment(Element element) {
		Resource resource = element.eResource();
		// TODO: use EcoreUtil getURI (InternalEObject) instead?

		if(resource instanceof XMLResource) {
			XMLResource xmlResource = (XMLResource)resource;
			return "\"" + xmlResource.getURIFragment(element) + "\"";
		}
		return null;
	}

	/**
	 * Get the XML (URI) Id of an element within your model
	 * Useful for transmitting model references
	 * 
	 * @param element
	 *        a UML element
	 * @return
	 */
	public static String xmlID(Element element) {
		Resource resource = element.eResource();
		// TODO: use EcoreUtil getURI (InternalEObject) instead?

		if(resource instanceof XMLResource) {
			XMLResource xmlResource = (XMLResource)resource;
			return xmlResource.getID(element);
		}
		return null;
	}
}
