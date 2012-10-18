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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;

import com.cea.ec3m.gentools.core.ConnectorUtils;
import com.cea.ec3m.gentools.core.CreationUtils;
import com.cea.ec3m.gentools.core.Log;
import com.cea.ec3m.gentools.core.PortUtils;
import com.cea.ec3m.gentools.core.transformations.TransformationException;

public class ConnectorBinding {

	/**
	 * Helper function for getActual
	 * 
	 * @param port
	 *        a port of the the connector template (not evaluated except for debugging output)
	 * @param connector
	 *        the connector that is checked for reification
	 * @param composite
	 *        a composite class
	 * @param actual
	 *        the current candidate for an actual, i.e. result of previous attempts to bind (at different connector ends)
	 * @param isProvided
	 *        is an interface provided or required.
	 * @return the type at the "other" (makes sense for property connector only) end of a connector
	 * @throws TransformationException
	 */
	private static Type matchOtherEnd(Port port, Feature connector, Type actual, boolean isProvided)
		throws TransformationException {
		if(connector instanceof Connector) {
			return matchOtherEnd(port, (Connector)connector, actual, isProvided);
		}
		else if(connector instanceof Property) {
			return matchOtherEnd(port, (Property)connector, actual, isProvided);
		}
		return null;
	}

	private static Type matchOtherEnd(Port port, Connector connector, Type actual, boolean isProvided)
		throws TransformationException {
		// the template provides the formal parameter at one of its ports. Now examine
		// with whom this port is connected, i.e. examine all connectorEnds
		// The type of the connected port determines the binding.
		Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "  getActual: " + (isProvided ? "provided" : "required") +
			" port type matches, port = " + port.getName());

		for(ConnectorEnd connEnd : connector.getEnds()) {
			// the connector end targets a port of a part or the composite (in case of delegation)
			ConnectableElement connElem = connEnd.getRole();
			if(connElem instanceof Port) {
				Port otherPort = (Port)connElem;
				Interface otherInterface;

				// distinction between assembly or delegation (other end is null) connectors
				boolean isAssembly = (connEnd.getPartWithPort() != null);

				if(isProvided == isAssembly) {
					// need required for other, if first port isProvided and assembly, or if first port isRequired and delegation
					otherInterface = PortUtils.getRequired(otherPort);
				} else {
					otherInterface = PortUtils.getProvided(otherPort);
				}
				Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "connects port, otherInterface = " + otherInterface);
				if(otherInterface != null) {
					if(actual == null) {
						actual = otherInterface;
						Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "actual return interface: " + actual.getQualifiedName());
					} else if(actual != otherInterface) {
						throw new TransformationException("cannot find a consistent binding for port " + port.getName() +
							" of connector " + connector.getName() + ". Formal already bound to type \"" + actual.getName() + "\"");
					}
				}
			}
		}
		return actual;
	}

	private static Type matchOtherEnd(Port port, Property partConnector, Type actual, boolean isProvided)
		throws TransformationException {
		// the template provides the formal parameter at one of its ports. Now examine
		// with whom this port is connected, i.e. examine all connectors of the
		// composite. The type of the connected port determines the binding.
		Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "  getActual: " + (isProvided ? "provided" : "required") +
			" port type matches, port = " + port.getName());

		for(Connector connector : partConnector.getClass_().getOwnedConnectors()) {
			if(ConnectorUtils.connectsPart(connector, partConnector)) {
				// the connector end targets a port of a part or the composite (in case of delegation)
				ConnectorEnd connEnd = ConnectorUtils.connEndNotPart(connector, partConnector);
				ConnectableElement connElem = connEnd.getRole();
				if(connElem instanceof Port) {
					Port otherPort = (Port)connElem;
					Interface otherInterface;

					// distinction between assembly or delegation (other end is null) connectors
					boolean isAssembly = (connEnd.getPartWithPort() != null);

					if(isProvided == isAssembly) {
						// need required for other, if first port isProvided and assembly, or if first port isRequired and delegation
						otherInterface = PortUtils.getRequired(otherPort);
					} else {
						otherInterface = PortUtils.getProvided(otherPort);
					}
					Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "connects port, otherInterface = " + otherInterface);
					if(otherInterface != null) {
						if(actual == null) {
							actual = otherInterface;
							Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "actual return interface: " + actual.getQualifiedName());
						} else if(actual != otherInterface) {
							throw new TransformationException("cannot find a consistent binding for port " + port.getName() +
								" of connector " + connector.getName() + ". Formal already bound to type \"" + actual.getName() + "\"");
						}
					}
				}
			}
		}
		return actual;
	}


	/**
	 * This function tries to bind a formal template parameter to an "actual". The criterion
	 * for a successful binding is that the (primitive) connections of the reified connector
	 * part have a matching port kind.
	 * The function makes a matching based on (1) either provided and required interfaces (2)
	 * or identical portKinds and different conjugations
	 * 
	 * @param composite
	 *        The composite in which a binding should be determined.
	 * @param part
	 *        the part within the composite for which we try to find a binding,
	 *        The information about the part is used to determine which connection
	 *        end belongs to the template part and which to another part/port (which
	 *        determines the binding).
	 * @param template
	 *        A template class
	 * @param formal
	 *        the formal template parameter
	 * @throws TransformationException
	 *         if no consistent binding can be found
	 * @return the actual
	 */
	public static Type getActual(Feature partOrConnector, Class template, ParameterableElement formal)
		throws TransformationException {
		Type actual = null;

		// loop through all ports of the template, use getAllPorts to include inherited ports as well.
		for(Port port : PortUtils.getAllPorts(template)) {
			Interface providedIntf = PortUtils.getProvided(port);

			// need to check, if the port at the opposite connector is matching, provided that we use a specific
			// value for the the formal. Typically, ports of the template are typed with the formal parameter. Thus,
			// we  would have to infer the formal from a given provided or required interface. This is not possible
			// in general (no inverse mapping operation), but the simple case that either the provided or required
			// interface is identical to the formal parameter are checked.
			//
			// 1. provided interface is formal
			if(providedIntf == formal) {
				actual = matchOtherEnd(port, partOrConnector, actual, true);
			}

			// 2. required interface is formal
			Interface requiredIntf = PortUtils.getRequired(port);
			if(requiredIntf == formal) {
				actual = matchOtherEnd(port, partOrConnector, actual, false);
			}

			// 3. port type is formal (but none of the two cases above)
			// this check is stronger than the first two, since it requires port kind identity.
			// If none of the first two variants holds, the port is translating interfaces
			// for which this stronger condition holds.
			Type type = port.getType();
			if((providedIntf != formal) && (requiredIntf != formal) && (type == formal)) {
				// the template provides the formal parameter at one of its ports. Now examine
				// with whom this port is connected, i.e. examine all ends of the
				// connector. The type of the connected port determines the binding.
				Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "  getActual: provided port type matches, port = " + port.getName());
				boolean found = false;

				if(partOrConnector instanceof Property) {
					Property partConnector = (Property)partOrConnector;
					// iterate over the connectors of the composite containing the part
					for(Connector connector : partConnector.getClass_().getOwnedConnectors()) {
						if(ConnectorUtils.connectsPart(connector, partConnector)) {
							// the connector end targets a port of a part or the composite (in case of delegation)
							ConnectorEnd connEnd = ConnectorUtils.connEndNotPart(connector, partConnector);
							actual = matchViaEnd(connEnd, port, partOrConnector, actual);
							if(actual != null) {
								found = true;
								break;
							}
						}
					}
				}
				else {
					for(ConnectorEnd connEnd : ((Connector)partOrConnector).getEnds()) {
						actual = matchViaEnd(connEnd, port, partOrConnector, actual);
						if(actual != null) {
							found = true;
							break;
						}
					}
				}
				if(!found) {
					// TODO: duplication with matchViaEnd below
					String errorMsg = "cannot find a binding for port " + port.getName() + " of connector " + partOrConnector.getName() + ". ";
					throw new TransformationException(errorMsg);
				}
			}
		}
		return actual;
	}

	private static Type matchViaEnd(ConnectorEnd connEnd, Port port, Feature partOrConnector, Type actual) throws
		TransformationException {
		String errorMsg = "cannot find a binding for port " + port.getName() + " of connector " + partOrConnector.getName() + ". ";
		Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "port: " + port);
		// Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "role1: " + connector.getEnds().get(0).getRole());
		// Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "role2: " + connector.getEnds().get(1).getRole());

		ConnectableElement connElem = connEnd.getRole();
		if(connElem instanceof Port) {
			Port otherPort = (Port)connElem;

			Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "  getActual, connector port <" + port.getName() + "> is connected via <" +
				partOrConnector.getName() + ">");
			Type otherType = otherPort.getType();


			// type must be the same, kind as well. But depending on delegation or not, one of the ports
			// must be conjugated  
			// TODO: isAssembly check will wrongly return false, if no port is connected [well, in this case, the role is not a port but a part]
			boolean isAssembly = (connEnd.getPartWithPort() != null);
			boolean sameConjugation = (PortUtils.isConjugated(otherPort) == PortUtils.isConjugated(port));
			// if assembly connection, conjugations must be different.
			if(isAssembly == sameConjugation) {
				return actual; // was: continue
			}

			// now compare kinds
			if(!PortUtils.sameKinds(port, otherPort)) {
				// no match, try next end
				return actual; // was: continue
			}

			if(otherType != null) {
				if(actual == null) {
					actual = otherType;
					Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "actual return interface: " + actual.getQualifiedName());
				} else if(actual != otherType) {
					throw new TransformationException(errorMsg + ". Formal already bound to type " + actual.getName() + ".");
				}
			}
		}
		return actual;
	}

	/**
	 * The objective of this function is to find a suitable binding for a part
	 * typed with a template class (connector) based compatible port types. The binding
	 * is obtained by examining the connections between the composite and the contained
	 * part.
	 * 
	 * @param composite
	 *        the composite which owns the part
	 * @param containedPart
	 *        the part which represents the connector
	 * @param template
	 *        an element within a package template (might be deeply nested) which
	 *        has ports that depend on a template parameter. This method tries to find a binding
	 *        for the template parameters that renders the ports of this element compatible with
	 *        the ports of the composition context.
	 * @return the bound package
	 *         ? binding information, i.e. information about the bound package, whether already bound and the binding.
	 */
	public static TemplateBinding obtainBinding(Class composite,
		Feature connector, Class template, boolean createBinding) throws TransformationException {
		// obtain the signature of an element within a package template.

		TemplateSignature signature = TemplateUtils.getSignature(template);
		if(signature == null) {
			// not a template, retain original name
			System.err.println("no template signature found for " + template.getName());
			return null;
		}

		EList<Type> actuals = new BasicEList<Type>();

		Package pkgTemplate = (Package)signature.getOwner();
		String name = pkgTemplate.getName();

		/*
		 * Signature extension - useful?? (since binding has to be made as well)
		 * Stereotype sigExtSt = signature.getAppliedStereotype ("FCM::SignatureExt");
		 * SignatureExt sigExt = null;
		 * if (sigExtSt != null) {
		 * sigExt = (SignatureExt) signature.getStereotypeApplication (sigExtSt);
		 * }
		 * 
		 * for (TemplateSignature sig : sigExt.getExtension ()) {
		 * bindFormal ();
		 * }
		 */

		// loop on template parameters
		boolean firstTP = true;
		for(TemplateParameter parameter : signature.getParameters()) {
			ParameterableElement formal = parameter.getParameteredElement();

			// now obtain suitable binding for this parameter - look for ports that are typed with
			// the formal template parameter
			Type actual = null;
			if(firstTP) {
				// only try to match the first template parameter based on ports.
				actual = getActual(connector, template, formal);
				firstTP = false;
			} else {
				// additional template parameters that are bound automatically based on their name
				// (this might be considered as a hack, it is merely a convention for automatic template
				// binding within the eC3M context.
				if(formal instanceof NamedElement) {
					NamedElement formalNE = (NamedElement)formal;
					if((formal instanceof Class) && (formalNE.getName().equals("T"))) {
						actual = composite;
					}
					if((formal instanceof Port) && (formalNE.getName().equals("P"))) {
						// port (but not available?)
					}
				}
			}
			if(actual != null) {
				actuals.add(actual);
				name = name + "_" + actual.getName();
			} else {
				String reason = "error: can not find a binding for formal parameter " +
					((NamedElement)formal).getName() + " in the context of ";
				reason += "composite " + composite.getName() +
					", connector " + connector.getName() +
					" and (connector) template " + template.getName();
				throw new TransformationException(reason);
			}
		}

		// the bound package is instantiated in the same model, in which the
		// composite can be found (avoid modifying an imported model).

		if(!createBinding)
			return null;

		Namespace owner = (Namespace)pkgTemplate.getOwner();
		owner = CreationUtils.getAndCreate(composite.getModel(), owner.allNamespaces());

		Package boundPackage = (Package)owner.getMember(name);
		if(boundPackage == null) {
			// class does not exist yet, needs to be created.
			boundPackage = ((Package)owner).createNestedPackage(name);

			Log.log(Log.INFO_MSG, Log.TEMPLATE_BINDING, "create bound package: " + name +
				" within " + owner.getName());
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
				TemplateParameterSubstitution substitution = binding.createParameterSubstitution();
				substitution.setFormal(parameter);

				// now obtain suitable binding for this parameter - look for ports that are typed with
				// the formal template parameter
				Type actual = actualsIter.next();
				// for UML <= 2.1
				// substitution.getActuals ().add ((ParameterableElement) actual);
				// for UML > 2.2
				substitution.setActual((ParameterableElement)actual);
			}
		}
		return binding;
	}
}
