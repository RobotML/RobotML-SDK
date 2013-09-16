/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *
 *****************************************************************************/
package org.eclipse.papyrus.robotml.deployment;

import java.util.Iterator;
import java.util.Stack;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.papyrus.RobotML.DeploymentPlan;
//import FCM.ImplementationGroup;
//import FCM.ImplementationProperties;
//import FCM.InteractionComponent;
//import FCM.Target;

import org.eclipse.papyrus.robotml.deployment.core.StUtils;
import org.eclipse.papyrus.robotml.deployment.core.Utils;

/**
 * Utilities around instances (within deployment plan)
 * [DepPlanUtils?]
 * [but missing: creation, ..., allocation?]
 * Structuration ??
 * 
 * @author ansgar
 * 
 */
public class DepUtils {

	/**
	 * Check whether a class is an eligible implementation for a certain node, i.e.
	 * has compatible requirements.
	 * Requires that setCurrentNode has been called earlier
	 * TODO: how does that work with connector reification between distributeToNode has been
	 * called??!
	 * 
	 * @param implemCandidate
	 * @return
	 */
	public static boolean isImplEligible(Class implemCandidate, EList<InstanceSpecification> nodes) {
		if(!Utils.isCompImpl(implemCandidate)) {
			return false;
		}
		if(nodes != null) {
			// now check properties
//			if(nodes.size() > 1) {
//				// indicates distribution
//				InteractionComponent connImpl = StUtils.getApplication(implemCandidate, InteractionComponent.class);
//				// if a connector implementation, it must support distribution (in case of multiple nodes)
//				// TODO: criteria is not optimal, since a composite may be deployed on multiple nodes,
//				//   but a contained connector might still only connect local parts.
//				if(connImpl != null) {
//					if(!connImpl.isForDistribution()) {
//						return false;
//					}
//				}
//			}
			// must fit requirements of all nodes
//			for(InstanceSpecification nodeInstance : nodes) {
//				Target target = StUtils.getApplication(nodeInstance, Target.class);
//				if(target == null) {
//					// no target information on instance => try to get this
//					// information from the node referenced by the instance
//					target = StUtils.getApplication(DepUtils.getClassifier(nodeInstance), Target.class);
//				}
//				if(target != null) {
//					ImplementationProperties implProps = StUtils.getApplication(implemCandidate, ImplementationProperties.class);
//					if(implProps != null) {
//						if(!implProps.getArch().contains(target.getTargetArch())) {
//							return false;
//						}
//						// TODO: check OS and size as well!
//					}
//				}
//			}
		}
		return true;
	}

	/**
	 * Find a sub instance via its name. This is in particular useful for connectors that cannot be
	 * found via a slot, since UML only supports structural features (a connector is only a feature)
	 * in the definingFeature attribute of a slot.
	 * 
	 * @param owningInstance
	 *        an owning instance
	 * @param name
	 *        name of the sub-element (unqualified)
	 * @return the found sub-instance or null
	 */
	public static InstanceSpecification getNamedSubInstance(InstanceSpecification owningInstance, String name) {
		Element cdp = owningInstance.getOwner();
		String candidateName = owningInstance.getName() + "." + name;
		if(cdp instanceof Package) {
			for(PackageableElement instance : ((Package)cdp).getPackagedElements()) {
				if(instance instanceof InstanceSpecification) {
					InstanceSpecification candidate = (InstanceSpecification)instance;

					if(candidateName != null) {
						if(candidateName.equals(candidate.getName())) {
							return candidate;
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Automatically choose an implementation, i.e. if the passed classifier
	 * (1) is already an implementation, simply return it
	 * (2) is an implementation group, choose the first implementation that fits the requirements
	 * (3) is a type: choose the first implementation among the heirs that fits the requirements
	 */
	public static Class chooseImplementation(Class componentType, EList<InstanceSpecification> nodes, boolean interactive) {
		// choose implementation automatically: get the first one that implements the passed type
		// get reference to component model, then search all classes contained in it.
		// TODO: assumption that implementations are in same package as type;

		EList<Class> implList = new BasicEList<Class>();
		
//		if(StUtils.isApplied(componentType, ImplementationGroup.class)) {
//			for(Property groupAttribute : componentType.getAttributes()) {
//				Type implClass = groupAttribute.getType();
//				if((implClass instanceof Class) && isImplEligible((Class)implClass, nodes)) {
//					implList.add((Class)implClass);
//				}
//			}
//		} 
//		else 
			if(Utils.isCompImpl(componentType)) {
			// check this after implementation group, since the latter inherits from component implementation
			return componentType;
		} else if(Utils.isCompType(componentType)) {
			for(DirectedRelationship relship : componentType.getTargetDirectedRelationships()) {
				if(relship instanceof Generalization) {
					Classifier source = ((Generalization)relship).getSpecific();
					if(source instanceof Class) {
						Class implClass = (Class)source;
						if(isImplEligible(implClass, nodes)) {
							implList.add(implClass);
						}
					}
				}
			}
		}
		if(implList.size() == 0) {
			return null;
		} else if(implList.size() == 1) {
			return implList.get(0);
		} else if(interactive) {
			// SelectionDialog = SelectionDialog.
			ILabelProvider ilabel = new LabelProvider() {

				public String getText(Object element) {
					return ((NamedElement)element).getQualifiedName();
				}
			};
			ElementListSelectionDialog dialog =
				new ElementListSelectionDialog(new Shell(), ilabel);

			dialog.setTitle("Multiple implementations found");
			dialog.setMessage("Select an implementation for component type " + componentType.getName());

			dialog.setElements(implList.toArray());

			dialog.open();
			Object[] selection = dialog.getResult();
			if(selection.length == 1) {
				if(selection[0] instanceof Class) {
					return (Class)selection[0];
				}
			}
		} else if(implList.size() > 0) {
			return implList.get(0);
		}
		return null;
	}

	/**
	 * return an instance specification for the main instance within
	 * a package.
	 * 
	 * @param cdp
	 *        the deployment plan
	 */
	public static InstanceSpecification getMainInstance(Package cdp) {
		DeploymentPlan dp = StUtils.getApplication(cdp, DeploymentPlan.class);
		return dp.getMainInstance();
	}

	/**
	 * Apply the stereotype deployment plan and set the mainInstance value
	 * 
	 * @param cdp
	 *        the deployment plan
	 * @param main
	 *        instance the top-level instance specification of the plan
	 */
	public static void setMainInstance(Package cdp, InstanceSpecification mainInstance) {
		StUtils.apply(cdp, DeploymentPlan.class);
		DeploymentPlan dp = StUtils.getApplication(cdp, DeploymentPlan.class);
		dp.setMainInstance(mainInstance);
	}

	/**
	 * return the implementation associated with an instance specification, i.e. a
	 * Class.
	 * 
	 * @param instance
	 * @return
	 */
	public static Class getImplementation(InstanceSpecification instance) {
		Classifier cl = getClassifier(instance);
		if(cl instanceof Class) {
			return (Class)cl;
		}
		return null;
	}

	/**
	 * Small helper function
	 * 
	 * @param instance
	 *        an instance specification
	 * @return returns true, if the stereotype ConnectorComp
	 *         is applied to the classifier associated with an instance specification
	 */
	public static boolean isConnector(InstanceSpecification instance) {
//		Classifier cl = getClassifier(instance);
//		return StUtils.isApplied(cl, InteractionComponent.class);
		return true;
	}

	/**
	 * Return the first classifier referenced by an instance specification. Whereas UML supports
	 * a set of classifiers, we assume that that an instance specification has only one.
	 * 
	 * @param instance
	 *        the instance, for which we are interested in type information
	 */
	public static Classifier getClassifier(InstanceSpecification instance) {
		Iterator<Classifier> classifierIt = instance.getClassifiers().iterator();
		// simply return the first element (if there is any)
		if(classifierIt.hasNext()) {
			return classifierIt.next();
		}
		return null;
	}

	/**
	 * Return the (unique) list of implementations that are contained within an
	 * instance specification
	 */
	public static EList<Classifier> getContainedImplementations(InstanceSpecification is) {
		Iterator<InstanceSpecification> instances = getContainedInstances(is).iterator();
		EList<Classifier> list = new UniqueEList<Classifier>();
		while(instances.hasNext()) {
			Classifier implementation = getClassifier(instances.next());
			list.add(implementation);
		}
		return list;
	}

	/**
	 * Return the slot that is associated with a property
	 * 
	 * @param is
	 *        an instance specification (of a class having properties)
	 * @param property
	 *        A property of the classifier associated with the passed instance specification
	 * @return the associated slot or null, if it does not exist
	 */
	public static Slot getSlot(InstanceSpecification is, Property property) {
		Iterator<Slot> slots = is.getSlots().iterator();
		while(slots.hasNext()) {
			Slot slot = slots.next();
			if(slot.getDefiningFeature() == property) {
				return slot;
			}
		}
		return null;
	}

	/**
	 * Return the instance referenced by a slot value, i.e. the first instance value associated
	 * with a slot
	 * 
	 * @param slot
	 * @return
	 */
	public static InstanceSpecification getInstance(Slot slot) {
		Iterator<ValueSpecification> values = slot.getValues().iterator();
		while(values.hasNext()) {
			ValueSpecification value = values.next();
			// instances are accessible via ValueSpecification subclass InstanceValue
			if(value instanceof InstanceValue) {
				return (((InstanceValue)value).getInstance());
			}
		}
		return null;
	}

	/**
	 * This method returns the instances contained within a composite instance
	 * specification for an assembly.
	 */
	public static EList<InstanceSpecification> getContainedInstances(InstanceSpecification is) {
		EList<InstanceSpecification> contained = new BasicEList<InstanceSpecification>();
		for(Slot slot : is.getSlots()) {
			InstanceSpecification instance = getInstance(slot);
			if(instance != null) {
				contained.add(instance);
			}
		}
		return contained;
	}

	/**
	 * return all slots that reference an instance specification
	 * 
	 * @param is
	 * @return
	 */
	public static EList<Slot> getReferencingSlots(InstanceSpecification is) {
		EList<Slot> list = new BasicEList<Slot>();
		for(Setting setting : UML2Util.getNonNavigableInverseReferences(is)) {
			// no trigger is referencing the event any more, delete call event
			EObject eObj = setting.getEObject();
			if(eObj instanceof ValueSpecification) {
				ValueSpecification vs = (ValueSpecification)eObj;
				Element owner = vs.getOwner();
				if(owner instanceof Slot)
					list.add((Slot)owner);
			}
		}
		return list;
	}

	/**
	 * Return an instance specification that refers to the composite in which the
	 * passed instance is contained
	 * 
	 * @param is
	 *        an instance that is contained within an composite (i.e. that
	 *        belongs to a part of this composite).
	 * @return
	 */
	public static Slot getParentSlot(InstanceSpecification is) {
		for(Slot slot : getReferencingSlots(is)) {
			// no trigger is referencing the event any more, delete call event
			if(slot.getDefiningFeature() instanceof Property) {
				if(((Property)slot.getDefiningFeature()).getAggregation() == AggregationKind.COMPOSITE_LITERAL) {
					return slot;
				}
			}
		}
		return null;
	}

	/**
	 * Return an instance specification that refers to the composite in which the
	 * passed instance is contained
	 * 
	 * @param is
	 *        an instance that is contained within an composite (i.e. that
	 *        belongs to a part of this composite).
	 * @return
	 */
	public static InstanceSpecification getParentIS(InstanceSpecification is) {
		Slot parentSlot = getParentSlot(is);
		if(parentSlot != null) {
			return parentSlot.getOwningInstance();
		}
		return null;
	}

	public static Stack<Slot> getAccessPath(InstanceSpecification is) {
		Stack<Slot> path = new Stack<Slot>();
		while(is != null) {
			Slot parentSlot = getParentSlot(is);
			if(parentSlot == null) {
				break;
			}
			path.insertElementAt(parentSlot, 0);
			is = parentSlot.getOwningInstance();
		}
		return path;
	}

	public static boolean isShared(Slot slot) {
		StructuralFeature df = slot.getDefiningFeature();
		if(df instanceof Property) {
			return ((Property)df).getAggregation() == AggregationKind.SHARED_LITERAL;
		}
		return false;
	}
}
