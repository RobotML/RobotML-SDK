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

/**
 * This file is part of eC3M GenTools
 * Copyright (C) 2008 CEA LIST (http://www-list.cea.fr/)

 * initial developer : Christophe JOUVRAY from CEA LIST 
 * Major contributions: Ansgar Radermacher from CEA LIST
 */

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import FCM.ConfigOption;
import FCM.Configuration;
import FCM.ContainerRule;
import FCM.InteractionComponent;
import FCM.RuleApplication;

import com.cea.ec3m.gentools.core.Log;
import com.cea.ec3m.gentools.core.PortUtils;
import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.acceleo.UMLTool;
import com.cea.ec3m.gentools.core.deployment.AllocUtils;
import com.cea.ec3m.gentools.core.deployment.DepCreation;
import com.cea.ec3m.gentools.core.deployment.DepUtils;
import com.cea.ec3m.gentools.core.extensions.InstanceConfigurator;

/**
 * This class provides model information around connectors ... Many classes are
 * currently commented, since it is not clear if we really need these
 */
public class MainModelTrafo {

	private static Configuration m_config;

	public static void setConfiguration(Configuration config) {
		m_config = config;
	}

	/**
	 * Return an instance specification that corresponds to a part. This
	 * function is useful in the connector context, since it allows to retrieve
	 * the instance specification that is reference by a connection end-point
	 * (which points to the part).
	 * 
	 * @param system
	 *        the instance specification for the assembly
	 * @param part
	 *        the part within a class
	 * @return The instance specification for the passed part
	 */
	public static InstanceSpecification getInstanceForPart(
		InstanceSpecification system, Property part) {
		for(Slot slot : system.getSlots()) {
			if(slot.getDefiningFeature() == part) {
				for(ValueSpecification value : slot.getValues()) {
					// instances are accessible via ValueSpecification subclass
					// InstanceValue
					if(value instanceof InstanceValue) {
						return (((InstanceValue)value).getInstance());
					}
				}
			}
		}
		return null;
	}

	/**
	 * Find a port that would match a connection
	 * 
	 * @param connectorType
	 *        a connector type, i.e. a component with ports
	 * @param the
	 *        port on the other side of the connection
	 * @return the first port (of all ports owned or inherited by the type) that
	 *         is compatible with the passed otherPort.
	 */
	public static Port getConnectorPort(EncapsulatedClassifier connectorType,
		Port otherPort, boolean isAssembly) {
		EList<Port> ports = PortUtils.getAllPorts(connectorType);
		// try to find match via kind
		for(Port port : ports) {
			if(PortUtils.matches(port, otherPort, isAssembly)) {
				return port;
			}
		}
		// no match found, try weaker condition: find 1st match for provided ...
		boolean otherEndProvides = PortUtils.getProvided(otherPort) != null;
		for(Port port : ports) {
			Interface intf;
			// if isAssembly: take "opposite" port
			if(otherEndProvides != isAssembly) {
				intf = PortUtils.getProvided(port);
			} else {
				intf = PortUtils.getRequired(port);
			}
			if(intf != null) {
				return port;
			}
		}
		return null;
	}

	/**
	 * check whether a rule is active in a given configuration
	 * 
	 * @param aRule
	 * @return
	 */
	private static boolean isRuleActive(ContainerRule rule) {
		if(m_config != null) {
			for(ConfigOption option : m_config.getConfigOptions()) {
				if(rule.getForConfig().contains(option)) {
					return true;
				}
			}
		}
		// not already true via specific configuration.
		// => Also turn on rules by default that are not for a specific configuration option
		return (rule.getForConfig().size() == 0);
	}

	/**
	 * This method performs a model transformation that replaces an eC3M
	 * connector by a property and a set of simple connectors. The type of the
	 * newly added connector must be instantiated from its template definition
	 * in order to adapt the connector to its context. This is done in a
	 * recursive manner on a compositeInstance. The result is a (composite)
	 * class which has the added connector. The function will also trigger
	 * container expansion, if necessary. Please note that we use the naming
	 * convention to prefix elements of the source model (wrt. to the
	 * transformation) with sm and elements of the target model with tm.
	 * 
	 * @param copy
	 *        Copier
	 * @param tmCDP
	 *        deployment plan in target model
	 * @param smIS
	 *        source model instance specification
	 * @param smDF
	 *        source model defining feature (null for top-level instance).
	 * @param inheritedRules
	 *        container rules inherited from containing composite
	 * @return new instance specification in traget model
	 * 
	 * @throws TransformationException
	 */
	public static InstanceSpecification mainModelTrafo(Copy copy, Package tmCDP,
		InstanceSpecification smIS, StructuralFeature smDF, EList<ContainerRule> inheritedRules) throws TransformationException {
		Class smComponent = null;
		Classifier smCl = DepUtils.getClassifier(smIS);
		if(smCl instanceof Class) {
			smComponent = (Class)smCl;
		} else {
			// should not happen
			return null;
		}

		String instName = smIS.getName();
		InstanceSpecification tmIS = (InstanceSpecification)
			tmCDP.createPackagedElement(instName, UMLPackage.eINSTANCE.getInstanceSpecification());

		Class tmComponent = copy.getCopy(smComponent);
		if(tmComponent == null) {
			return null;
		}
		tmIS.getClassifiers().add(tmComponent);

		// retrieve the component type object from the static profile (in order
		// to process rules)
		RuleApplication ruleApplication = StUtils.getApplication(smComponent, RuleApplication.class);
		// get container trafo instance, if already existing
		ContainerTrafo containerTrafo = ContainerTrafo.get(tmComponent);
		// make copy of inheritedRule list (avoid that added elements remain in single rule list passed to all)
		EList<ContainerRule> inheritedRulesCopy =
			new UniqueEList<ContainerRule>(inheritedRules);

		if(containerTrafo != null) {
			// only create instance, if container exists already
			containerTrafo.configureOnly();
			containerTrafo.createContainerInstance(tmComponent, tmIS);
		}
		// process container rules
		EList<ContainerRule> rules = new BasicEList<ContainerRule>();
		Iterator<Boolean> propagateRuleI = null;

		if(ruleApplication != null) {
			rules.addAll(ruleApplication.getContainerRule());
			propagateRuleI = ruleApplication.getPropagateRule().iterator();
		}
		rules.addAll(inheritedRules);
		for(ContainerRule rule : rules) {
			boolean propagate = false;
			if((propagateRuleI != null) && propagateRuleI.hasNext()) {
				propagate = propagateRuleI.next();
			}
			if(isRuleActive(rule)) {
				if(propagate) {
					inheritedRulesCopy.add(rule);
				}
				if(containerTrafo == null) {
					// at least one active rule => create container (or get previously instantiated))
					containerTrafo = new ContainerTrafo(copy, tmCDP, smDF);
					containerTrafo.createContainer(tmComponent);
					containerTrafo.createContainerInstance(tmComponent, tmIS);
				}
				containerTrafo.applyRule(rule, smComponent, tmComponent, tmIS);
			}
			// TODO(?) check if rule has already been applied (don't mix-up instances/classes)
		}

		// copy node allocation
		for(InstanceSpecification smNode : AllocUtils.getNodes(smIS)) {
			InstanceSpecification tmNode = copy.getCopy(smNode);
			AllocUtils.allocate(tmIS, tmNode);
		}

		// reread instName (may have been changed by container transformation).
		instName = tmIS.getName();

		// copy parts, i.e. referenced slots
		// loop on instances (instead of parts), since reification needs to be
		// based on used implementations.
		for(Slot slot : smIS.getSlots()) {
			if(slot.getDefiningFeature() == null) {
				throw new TransformationException(
					"Error: no defining feature associated with \""
						+ smIS.getName() + "\"");
			}
			StructuralFeature smPartDF = slot.getDefiningFeature();
			if(StUtils.isApplied(smPartDF.getType(), InteractionComponent.class)) {
				if(smPartDF instanceof Property) {
					Property tmPart = ConnectorReification.reifyConnector(copy, tmComponent, (Property)smPartDF, tmIS, null);
					// update value specification (to the one just created)
					Type type = tmPart.getType();
					InstanceSpecification tmPartIS = EcoreUtil.copy(DepUtils.getInstance(slot));
					tmCDP.getPackagedElements().add(tmPartIS);
					if(type instanceof Classifier) {
						if(tmPartIS.getClassifiers().size() > 0) {
							tmPartIS.getClassifiers().set(0, (Classifier)type);
						}
					}
					DepCreation.createSlot(tmIS, tmPartIS, tmPart);
				}
			}
			else if(smPartDF.getType() instanceof Class) {

				InstanceSpecification smPartIS = DepUtils.getInstance(slot);
				if(smPartIS == null) {
					throw new TransformationException(
						"Error: no instance is associated with slot for feature \""
							+ smPartDF.getName() + "\"");
				}

				// recursive reification
				// returned instance specification in target model is an instance specification for the part
				// or for a container for that part.
				InstanceSpecification tmPartIS = mainModelTrafo(copy, tmCDP, smPartIS, smPartDF, inheritedRulesCopy);
				// AllocUtils.propagateNodesViaPort (tmPartIS, null, AllocUtils.getNodes(containedInstance));

				// retrieve part in the target model (it has been created during
				// the copyClassifier operation before)
				// TODO: avoid cast (use StructuralFeature instead)
				Property tmPart = (Property)copy.getCopy(smPartDF);

				// check whether the instance specification has been modified
				// (due to a container transformation)
				// modification would not be required, if 
				if((smPartIS != null) && (tmPartIS != null)) {
					if(!DepUtils.getClassifier(smPartIS).getName().equals(
						DepUtils.getClassifier(tmPartIS).getName())) {
						Log.log(Log.INFO_MSG, Log.TRAFO_CONNECTOR, "change part type from: " +
							DepUtils.getClassifier(smPartIS).getQualifiedName() + "  to : " +
							DepUtils.getClassifier(tmPartIS).getQualifiedName());
						tmPart.setType(DepUtils.getClassifier(tmPartIS));
					}
				}
				DepCreation.createSlot(tmIS, tmPartIS, tmPart);
			} else {
				// assume primitive type, copy slot values
				// don't use "copy" to avoid duplicate entries (since not all instance specification created
				// before are correctly inserted into the map of "copy").
				Slot tmSlot = EcoreUtil.copy(slot);
				tmSlot.setDefiningFeature(copy.getCopy(slot.getDefiningFeature()));
				tmIS.getSlots().add(tmSlot);
			}

		}

		// loop on connectors
		// TODO: check, if true (no instance specification exists for these - unlike a connector which is explicitly specified via a part)
		for(Connector connector : smComponent.getOwnedConnectors()) {
			if(StUtils.isConnector(connector)) {
				FCM.Connector fcmConn = StUtils.getConnector(connector);
				if(fcmConn != null) {
					// found an eC3M connector, connector type is specified.
					// => Reify the connector within the target component, i.e. create a new part and
					//    additional connections for it.
					Property connectorPart = ConnectorReification.reifyConnector(copy, tmComponent,
						UMLTool.varName(connector), connector, tmIS, null);

					if(connectorPart == null) {
						continue;
					}
					// Now create an instance specification for the reified connector
					InstanceSpecification tmReifiedConnectorIS = DepCreation.createDepPlan(
						tmCDP, (Class)connectorPart.getType(),
						instName + "." + connector.getName(), false);

					// copy slots from the source deployment plan that are related to connector configuration
					InstanceSpecification smConnectorIS = DepUtils.getNamedSubInstance(smIS, connector.getName());
					if(smConnectorIS != null) {
						copy.put(smConnectorIS, tmReifiedConnectorIS);
						for(Slot smSlot : smConnectorIS.getSlots()) {
							copy.getCopy(smSlot);
						}
						/*
						 * InstanceSpecification tmConnectorIS = copy.getCopy(smConnectorIS);
						 * Iterator<Slot> tmSlotIter = tmConnectorIS.getSlots().iterator();
						 * while(tmSlotIter.hasNext()) {
						 * Slot tmSlot = tmSlotIter.next();
						 * tmReifiedConnectorIS.getSlots().add(hhtmSlot);
						 * }
						 * tmConnectorIS.getSlots().clear();
						 */
					}

					// configure connector
					InstanceConfigurator.configureInstance(tmIS, null, tmReifiedConnectorIS, null);

					Slot partSlot =
						DepCreation.createSlot(tmIS, tmReifiedConnectorIS, connectorPart);

					ConnectorReification.propagateNodeAllocation(tmComponent, tmIS, partSlot);
				}
			}
		}
		/*
		 * for(Property part : smComponent.getOwnedAttributes()) {
		 * Type type = part.getType();
		 * if(type != null) {
		 * if(StUtils.isApplied(type, InteractionComponent.class)) {
		 * ConnectorReification.reifyConnector(copy, tmComponent, part, tmIS, null);
		 * }
		 * }
		 * }
		 */

		// needs to be called independently
		// propagateNodeAllocation (cdp, compositeInstance);

		if(containerTrafo != null) {
			// return containerIS
			containerTrafo.moveSlots();
			return containerTrafo.getContainerIS();
		} else {
			return tmIS;
		}
	}
}
