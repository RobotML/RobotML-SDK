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
package com.cea.ec3m.gentools.core.transformations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import FCM.ContainerRule;
import FCM.InteractionComponent;
import FCM.InterceptionKind;
import FCM.InterceptionRule;

import com.cea.ec3m.gentools.core.ConnectorUtils;
import com.cea.ec3m.gentools.core.Log;
import com.cea.ec3m.gentools.core.PortUtils;
import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.Utils;
import com.cea.ec3m.gentools.core.acceleo.UMLTool;
import com.cea.ec3m.gentools.core.deployment.DepCreation;
import com.cea.ec3m.gentools.core.deployment.DepUtils;
import com.cea.ec3m.gentools.core.extensions.InstanceConfigurator;
import com.cea.ec3m.gentools.core.templates.TemplateInstantiation;
import com.cea.ec3m.gentools.core.templates.TemplateUtils;

public class ContainerTrafo {

	public static final String executorPartName = "_executor";

	public static final String interceptorName = "intercept ";

	/**
	 * Constructor
	 * 
	 * @param sat
	 *        information about source and target model
	 * @param tmCDP
	 *        deployment plan within target model
	 */
	public ContainerTrafo(Copy copy, Package tmCDP, StructuralFeature smDF) {
		this.copy = copy;
		this.tmCDP = tmCDP;
		if(smDF instanceof Property) {
			smPart = (Property)smDF;
		}
		else {
			smPart = null;
		}
		configureOnly = false;
	}

	public static void init() {
		containers = new HashMap<Class, ContainerTrafo>();
	}

	/**
	 * return the container trafo associated with the tmComponent
	 * 
	 * @param tmComponent
	 * @return Container-trafo instance of null
	 */
	public static ContainerTrafo get(Class tmComponent) {
		return containers.get(tmComponent);
	}

	/**
	 * creates the executor. Needs to be called *before* the other operations of
	 * this class.
	 * 
	 * @param tmComponent
	 *        the implementation of a component
	 * @param tmIS
	 *        the instance specification of the component (in the target
	 *        model) which will become the executor's instance specification
	 * @throws TransformationException
	 */
	void createContainer(Class tmComponent) throws TransformationException {
		Package tmPkgOwner = (Package)tmComponent.getOwner();
		tmContainerImpl = tmPkgOwner.createOwnedClass(tmComponent.getName() + "_cc", false);
		Copy.copyID(tmComponent, tmContainerImpl, "c");

		// add part and slot corresponding to component;
		executorPart = tmContainerImpl.createOwnedAttribute(executorPartName, tmComponent);
		Copy.copyID(tmComponent, executorPart, "e");
		executorPart.setIsComposite(true);

		// copy ports from the executor (tmComponent) to the container
		// (tmContainerImpl)
		// It is not problematic that the ports from connectors within the
		// containing composite don't match (have another identity
		// compare to the ports of the executor)
		// since these are copied to the target model based on matching names.
		for(Port port : PortUtils.getAllPorts(tmComponent)) {
			// copy port
			Port newPort = EcoreUtil.copy(port); // don't use E3CM copy, since this is not a copy from source to target model
			tmContainerImpl.getOwnedAttributes().add(newPort); // bad idea: has already been copied (but not from target model??)
			StUtils.copyStereotypes(port, newPort);

			// create delegation for application port
			Connector containerDelegation = tmContainerImpl.createOwnedConnector("delegation " + port.getName());
			Copy.copyID(tmContainerImpl, containerDelegation);
			ConnectorEnd end1 = containerDelegation.createEnd();
			end1.setRole(newPort);
			ConnectorEnd end2 = containerDelegation.createEnd();
			end2.setPartWithPort(executorPart);
			end2.setRole(port);
		}
	}

	/**
	 * Only configure the instances, i.e. avoid re-creating elements of the container, but create
	 * the UML instance specifications
	 */
	public void configureOnly() {
		configureOnly = true;
	}

	/**
	 * Create an instance of the container (UML instance specification)
	 * 
	 * @param tmComponent
	 * @param tmIS
	 */
	public void createContainerInstance(Class tmComponent, InstanceSpecification tmIS) {
		// create an instance specification for the container
		containerIS = (InstanceSpecification)tmCDP.createPackagedElement(tmIS.getName(), UMLPackage.eINSTANCE.getInstanceSpecification());
		// assign new name to original instance specification which reflects
		// role within containment hierarchy
		tmIS.setName(tmIS.getName() + "._executor");
		containerIS.getClassifiers().add(tmContainerImpl);
		// existing instance specification (tmIS) is the executor instance specification
		DepCreation.createSlot(containerIS, tmIS, executorPart);
		executorIS = tmIS;
		counter = 0;
		containers.put(tmComponent, this);
		/*
		 * // now create instances for the contained elements
		 * for(Property extensionPart : tmContainerImpl.getAttributes()) {
		 * Type tmContainerExtImpl = extensionPart.getType();
		 * if(tmContainerExtImpl instanceof Class) {
		 * InstanceSpecification containerExtIS = DepCreation.createDepPlan(tmCDP, (Class)tmContainerExtImpl, containerIS.getName() + "." +
		 * extensionPart.getName(), false);
		 * // configure extension
		 * InstanceConfigurator.configureInstance(executorIS, smPart, containerExtIS, null);
		 * DepCreation.createSlot(containerIS, containerExtIS, extensionPart);
		 * }
		 * }
		 */
	}

	/**
	 * apply a container rule, i.e. add either a container extension or an
	 * interceptor to the container
	 * 
	 * @param smContainerRule
	 *        An container rule
	 * @param smComponent
	 *        the application component in the source model
	 * @param tmComponent
	 *        the application component in the target model
	 * @param tmIS
	 *        the instance specification for the application component in the target model
	 * @throws TransformationException
	 */
	void applyRule(ContainerRule smContainerRule, Class smComponent, Class tmComponent, InstanceSpecification tmIS)
		throws TransformationException
	{
		Map<Property, EList<Property>> interceptorPartsMap = new HashMap<Property, EList<Property>>();

		for(Property part : smContainerRule.getBase_Class().getAllAttributes()) {
			Type type = part.getType();
			if(type == null) {
				String ruleName = (smContainerRule.getBase_Class() != null) ? smContainerRule.getBase_Class().getName() : "undefined";
				throw new TransformationException("Cannot apply container rule <" + ruleName + ">, since the type of one of its parts is undefined. Check for unresolved proxies in imports");
			}
			if(part instanceof Port) {
				Port newPort = tmContainerImpl.createOwnedPort(part.getName(), part.getType());
				StUtils.copyStereotypes(part, newPort);
			}
			else if(type instanceof Class) {
				Class extOrInterceptor = (Class)type;
				// DepUtils.chooseImplementation((Class) type,
				// new BasicEList<InstanceSpecification>(), false);

				if(StUtils.isApplied(extOrInterceptor, InteractionComponent.class)) {

					InterceptionRule interceptionRule = StUtils.getApplication(part, InterceptionRule.class);
					InterceptionKind interceptionKind = InterceptionKind.INTERCEPT_ALL_PORTS; // default: intercept all ports
					EList<FCM.Port> fcmPorts = null;
					if(interceptionRule != null) {
						interceptionKind = interceptionRule.getInterceptionKind();
						fcmPorts = interceptionRule.getPortSet();
					}
					EList<Port> ports = new BasicEList<Port>();
					if(fcmPorts != null) {
						for(FCM.Port fcmPort : fcmPorts) {
							ports.add(fcmPort.getBase_Port());
						}
					}

					EList<Property> interceptorParts =
						expandInterceptorExtension(interceptionKind, ports, extOrInterceptor, tmComponent);
					interceptorPartsMap.put(part, interceptorParts);
				}
				else {
					Property extensionPart =
						expandAggregationExtension(part.getName(), extOrInterceptor, tmComponent);
					// register relation to facilitate connector copy
					copy.setPackageTemplate(smContainerRule.getBase_Class(), tmContainerImpl);
					copy.put(part, extensionPart);
					copy.setPackageTemplate(null, null);
				}
			}
		}
		createConnectorForAssociations();
		// tell copy that tmcontainerImpl is associated with the smContainerRule
		// register a package template (although it is not a template) to assure that the connectors
		// get copied, although they are in a different resource (only the connectors are copied, not
		// the types of the referenced parts).
		// [main issue here: properties of container rule are not copies in the sense of identical
		// copies]
		copy.setPackageTemplate(smContainerRule.getBase_Class(), tmContainerImpl);

		for(Connector connector : smContainerRule.getBase_Class().getOwnedConnectors()) {
			Property ruleInterceptorPart = null;
			for(Property part : interceptorPartsMap.keySet()) {
				if(ConnectorUtils.connectsPart(connector, part)) {
					// this connector is a connection between an interceptor (and another part which may not
					// be an interceptor => TODO: validation rule yet to write
					// we need to copy this connector multiple times, once for each associated interceptor part
					ruleInterceptorPart = part;
					break;
				}
			}
			if(ruleInterceptorPart != null) {
				for(Property interceptorPart : interceptorPartsMap.get(ruleInterceptorPart)) {
					// map an interceptor part within rule successively to to an interceptor part
					// within the container
					copy.put(ruleInterceptorPart, interceptorPart);
					copy.removeForCopy(connector);
					copy.getCopy(connector);
				}
			}
			else {
				// check whether FCM connector
				FCM.Connector fcmConn = StUtils.getConnector(connector);
				if(fcmConn != null) {
					Property connectorPart = ConnectorReification.reifyConnector(copy, tmContainerImpl,
						UMLTool.varName(connector), connector, containerIS, null);
					// don't create specific configuration slots (don't know how to specific in source model)
					InstanceSpecification tmReifiedConnectorIS = DepCreation.createDepPlan(
						tmCDP, (Class)connectorPart.getType(),
						tmIS.getName() + "." + connector.getName(), false);
				}
				else {
					copy.remove(connector);
					copy.getCopy(connector);
				}
			}
		}
		copy.setPackageTemplate(null, null);
	}

	/**
	 * This container expansion does not create a new composite. Instead, it
	 * adds the extension as a part to the copied application component. The
	 * application component also inherits from the type of the container
	 * extension in order to avoid copying ports.
	 */
	Property expandAggregationExtension(String name, Class smContainerExtImpl, Class tmComponent) throws TransformationException {
		Property extensionPart;
		Class tmContainerExtImpl = null;
		if(configureOnly) {
			extensionPart = tmContainerImpl.getAttribute(name, null);
			if((extensionPart != null) && extensionPart.getType() instanceof Class) {
				tmContainerExtImpl = (Class)extensionPart.getType();
			}
		}
		else {
			TemplateSignature signature = TemplateUtils.getSignature(smContainerExtImpl);
			if(signature == null) {
				// no template signature, just copy the container extension into the target model
				tmContainerExtImpl = copy.getCopy(smContainerExtImpl);
			} else {
				// template signature found, instantiate container extension via the
				// template binding mechanism
				TemplateBinding binding = TemplateUtils.fixedBinding(copy.target, smContainerExtImpl, tmComponent);
				Object[] args = new Object[]{};
				TemplateInstantiation ti = new TemplateInstantiation(copy, binding, args);
				tmContainerExtImpl = (Class)ti.bindNamedElement(smContainerExtImpl);
			}

			// add part associated with the extension to the container
			extensionPart = tmContainerImpl.createOwnedAttribute(name, tmContainerExtImpl);
		}
		// problem: would not be unique in case of multiple extensions
		// Copy.copyID(tmComponent, extensionPart, "a");
		extensionPart.setIsComposite(true);
		// TODO separation of container creation and instance creation
		InstanceSpecification containerExtIS = DepCreation.createDepPlan(tmCDP, tmContainerExtImpl, containerIS.getName() + "." + extensionPart.getName(), false);
		// configure extension
		InstanceConfigurator.configureInstance(executorIS, smPart, containerExtIS, null);
		DepCreation.createSlot(containerIS, containerExtIS, extensionPart);

		return extensionPart;
	}

	/**
	 * Expand an interceptor definition between the container and the executor.
	 * 
	 * @param extKind
	 *        the interception kind (intercept which ports: all, some, out, ...)
	 * @param ports
	 *        The set of ports to intercept (In case of "some" above)
	 * @param smContainerConnImpl
	 *        The connector (interceptor) implementation in the source model
	 * @param tmComponent
	 *        the application component (executor) in the target model
	 * @return
	 * @throws TransformationException
	 */
	EList<Property> expandInterceptorExtension(InterceptionKind extKind, EList<Port> ports, Class smContainerConnImpl, Class tmComponent)
		throws TransformationException
	{
		EList<Property> connectorParts = new BasicEList<Property>();
		// replace delegation connectors with extension connector
		for(Port port : PortUtils.getAllPorts(tmComponent)) {
			// delegate to component via connector
			boolean match = true;
			if(extKind == InterceptionKind.INTERCEPT_ALL_IN_PORTS) {
				// IN-PORT = provided port
				match = (PortUtils.getProvided(port) != null);
			} else if(extKind == InterceptionKind.INTERCEPT_ALL_OUT_PORTS) {
				// IN-PORT = provided port
				match = (PortUtils.getRequired(port) != null);
			} else if(extKind == InterceptionKind.INTERCEPT_SOME_PORTS) {
				// comparison based on name, since in different models
				match = (Utils.getNamedElementFromList(ports, port.getName()) != null);
			}
			// else INTERCEPT_ALL_PORT => match remains true
			if(!match) {
				// port does not match criterion, continue with next port
				continue;
			}

			Property connectorPart;
			String interceptionName = interceptorName + port.getName() + counter;
			if(configureOnly) {
				// counter is reset before instance configuration
				connectorPart = tmContainerImpl.getAttribute(interceptionName, null);
			}
			else {
				Connector interceptionConnector = null;
				// get delegation connector
				for(Connector connector : tmContainerImpl.getOwnedConnectors()) {
					if(ConnectorUtils.connectsPort(connector, port)) {
						interceptionConnector = connector;
						break;
					}
				}
				// interceptionConnector = tmContainerImpl.getOwnedConnector
				// ("delegation " + port.getName ());
				if(interceptionConnector == null) {
					throw new TransformationException("(during interceptor transformation for container): cannot find existing delegation connector");
				}

				interceptionConnector.setName(interceptorName + port.getName() + counter);
				FCM.Connector fcmConn = StUtils.applyApp(interceptionConnector, FCM.Connector.class);
				InteractionComponent fcmConnType = StUtils.getApplication(smContainerConnImpl, InteractionComponent.class);
				fcmConn.setIc(fcmConnType);

				// pass target component and port to interceptor (not clean, define
				// suitable template signature as for instance in methodCall_comp
				Object[] args = new Object[]{ executorIS, port };
				TransformationContext.instance = executorIS;
				TransformationContext.port = port;
				connectorPart = ConnectorReification.reifyConnector(copy, tmContainerImpl, UMLTool.varName(interceptionConnector), interceptionConnector, executorIS, args);
				connectorParts.add(connectorPart);
				interceptionConnector.destroy();
			}
			// Now create an instance specification for the reified connector
			InstanceSpecification reifiedConnectorIS = DepCreation.createDepPlan(tmCDP, (Class)connectorPart.getType(),
				containerIS.getName() + "." + interceptionName, false);
			// configure connector
			InstanceConfigurator.configureInstance(executorIS, smPart, reifiedConnectorIS, port);

			Slot partSlot = DepCreation.createSlot(containerIS, reifiedConnectorIS, connectorPart);

			// delete intermediate connector (has been replaced by two
			// connections to the reified connector)

			ConnectorReification.propagateNodeAllocation(tmComponent, executorIS, partSlot);
		}
		counter++;
		return connectorParts;
	}

	/**
	 * Move a slot from the executor instance specification to an instance
	 * specification of an extension/interceptor This is required, since the
	 * users cannot configure containers directly. The modification is done in
	 * the target model, i.e. the user model is not affected.
	 */
	void moveSlots() {
		Log.log(Log.INFO_MSG, Log.TRAFO_CONTAINER, "Move slots for instance: " + executorIS.getQualifiedName());
		Classifier mainCl = DepUtils.getClassifier(executorIS);
		Iterator<Slot> slotIt = executorIS.getSlots().iterator();
		while(slotIt.hasNext()) {
			Slot slot = slotIt.next();
			String featureName = slot.getDefiningFeature().getName();
			if(!mainCl.getAllAttributes().contains(slot.getDefiningFeature())) {
				// defining feature does not belong to main classifier
				// => move it to first matching instance specification
				for(InstanceSpecification is : DepUtils.getContainedInstances(containerIS)) {
					Classifier containedCl = DepUtils.getClassifier(is);
					if(Utils.getNamedElementFromList(containedCl.getAllAttributes(), featureName) != null) {
						if(executorIS != is) {
							// remove slot first from iterator, as addition below removes it from the list (slots are owned)
							slotIt.remove();
							is.getSlots().add(slot);
							break;
						}
					}
				}
			}
		}
	}

	/**
	 * Create an connector for parts that have an association. The rationale
	 * behind this is
	 * 
	 */
	public void createConnectorForAssociations() {
		// TODO: keep list of added parts, only recheck those!

		for(Property part : Utils.getParts(tmContainerImpl)) {
			if(part.getType() == null) {
				continue;
			}
			for(Association association : part.getType().getAssociations()) {
				// Part has an association. Check if the other association end
				// targets one of
				// other parts within the container
				for(Property end : association.getMemberEnds()) {
					Type type = end.getType();
					if((type != null) && (type != part.getType())) {
						// end is not typed with the part we are currently
						// examining
						// thus, it might belong to another part of the
						// composite
						for(Property checkPart : Utils.getParts(tmContainerImpl)) {
							if(type == checkPart.getType()) {
								// found an association between two parts of the
								// container => create connection,
								// unless already existing.
								if(!ConnectorUtils.existsConnector(tmContainerImpl, part, checkPart)) {
									Connector conn = tmContainerImpl.createOwnedConnector(part.getName() + "_" + checkPart.getName());
									conn.setType(association);
									conn.createEnd().setRole(part);
									conn.createEnd().setRole(checkPart);
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * @return the instance specification of the created container
	 */
	public InstanceSpecification getContainerIS() {
		return containerIS;
	}

	/**
	 * The attribute within the container that holds the executor, i.e. the
	 * original component
	 */
	private Property executorPart;

	/**
	 * The instance specification of the created container
	 */
	private InstanceSpecification containerIS;

	private InstanceSpecification executorIS;

	/**
	 * The created container implementation (prefixed with tm, since part of
	 * target model)
	 */
	private Class tmContainerImpl;

	/**
	 * A counter which is used to manage unique names for interceptors (if
	 * multiple interceptors are applied)
	 */
	private int counter;

	/**
	 * Store source and target model
	 */
	private Copy copy;

	/**
	 * deployment plan within target model
	 */
	private Package tmCDP;

	/**
	 * Structural feature (property) in source model for the component
	 */
	private Property smPart;

	private static Map<Class, ContainerTrafo> containers;

	private boolean configureOnly;
}
