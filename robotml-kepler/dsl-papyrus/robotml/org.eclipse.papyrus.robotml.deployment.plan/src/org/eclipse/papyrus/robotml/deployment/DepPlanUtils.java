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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.papyrus.RobotML.DeploymentPlan;
import org.eclipse.papyrus.robotml.deployment.core.StUtils;
import org.eclipse.papyrus.robotml.deployment.core.Utils;

public class DepPlanUtils {

	public static final String depPlanFolder = "DeploymentPlans";

	/**
	 * Return the package in which deployment plans are stored. Caveat: needs to be executed within a
	 * transition, since the deployment plan package will be created, if it does not exist yet.
	 * 
	 * @param element
	 *        an arbitrary element of the source model (i.e. the model that will
	 *        store the deployment plan
	 * @return package in which deployment plans are stored
	 */
	public static Package getDepPlanRoot(Element element) {
		return Utils.getRoot(element, depPlanFolder);
	}

	/**
	 * Return all deployment plans
	 * 
	 * @param element
	 *        an arbitrary element of the source model (i.e. the model that will
	 *        store the deployment plan
	 * @return
	 */
	public static EList<Package> getAllDepPlans(Element element) {
		Package root = Utils.getTop(element);
		Package depPlanRoot = root.getNestedPackage(depPlanFolder);
		EList<Package> depPlanList = new BasicEList<Package>();
		if(depPlanRoot != null) {
			for(Package pkg : depPlanRoot.getNestedPackages()) {
				if(StUtils.isApplied(pkg, DeploymentPlan.class)) {
					depPlanList.add(pkg);
				}
			}
		}
		return depPlanList;
	}

	public static void delDepPlan(InstanceSpecification is) {
		Iterator<Slot> slots = is.getSlots().iterator();
		while(slots.hasNext()) {
			Slot slot = slots.next();
			InstanceSpecification subInstance = getInstance(slot);
			if(subInstance != null) {
				delDepPlan(subInstance);
			}
		}
		Element owner = is.getOwner();
		if(owner instanceof Package) {
			((Package)owner).getPackagedElements().remove(is);
		}
	}

	/**
	 * Return the instance that is defined by a slot value
	 * 
	 * @param slot
	 * @return the first slot that corresponds to an instance specification
	 */
	public static InstanceSpecification getInstance(Slot slot) {
		Iterator<ValueSpecification> values = slot.getValues().iterator();
		while(values.hasNext()) {
			ValueSpecification value = values.next();
			// instances are accessible via ValueSpecification subclass InstanceValue
			if(value instanceof InstanceValue) {
				return ((InstanceValue)value).getInstance();
			}
		}
		return null;
	}

	/**
	 * create a slot for a given sub-instance specification.
	 * 
	 * @param cdp
	 *        a deployment plan
	 * @param is
	 *        an instance specification for a composite class
	 * @param partIS
	 *        the instance specification of a part within the composite
	 * @param part
	 *        the part within the composite
	 */
	public static Slot createSlot(Package cdp, InstanceSpecification is, InstanceSpecification partIS, Property part) {
		// the instance specification of the composite has a slot for each part and it points
		// to the instance specification associated with the part.
		Slot slot = is.createSlot();
		slot.setDefiningFeature(part);

		InstanceValue iv = (InstanceValue)
			slot.createValue(null, null, UMLPackage.eINSTANCE.getInstanceValue());
		iv.setInstance(partIS);
		return slot;

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
		DeploymentPlan cdpApp = StUtils.applyApp(cdp, DeploymentPlan.class);
		if(cdpApp != null) {
			cdpApp.setMainInstance(mainInstance);
		}
	}

	/**
	 * Automatically choose an implementation, i.e. choose the first implementation
	 * within the component model that implements a given component type.
	 */
	public static Class autoChooseImplementation(Classifier componentType) {
		// choose implementation automatically: get the first one that implements the passed type
		// (problem: further tree expansion might depend on chosen implementation)
		// get reference to component model, then search all classes contained in it.
		Package compModel = Utils.getRoot(componentType, "ComponentModel");
		Iterator<Element> elements = compModel.allOwnedElements().iterator();
		while(elements.hasNext()) {
			Element element = elements.next();
			if(element instanceof Class) {
				Class candidate = (Class)element;
				if(candidate.getSuperClass(componentType.getName()) != null) {
					return candidate;
				}
			}
		}
		return null;
	}

	/**
	 * create a deployment plan, i.e. a set of instances
	 * Automatic choice of implementations (otherwise leave unassigned)
	 * 
	 * @param composite
	 *        System composite
	 */
	public static InstanceSpecification createDepPlan(Package cdp, Classifier composite, String name) {
		// create an instance specification for the composite
		InstanceSpecification is = (InstanceSpecification)
			cdp.createPackagedElement(name, UMLPackage.eINSTANCE.getInstanceSpecification());

		if(name == "mainInstance") {
			setMainInstance(cdp, is);
		}

		Class implementation = null;

		if(Utils.isCompImpl(composite)) {
			// implementation is known => must be able to do this.
			if(composite instanceof Class) {
				implementation = (Class)composite;
			}
		} else {
			// TODO: really need that? (better indicate to user that he needs to choose?)
			// need hint on type level (if we want to avoid loosing information)
			implementation = autoChooseImplementation(composite);
		}

		if(!(implementation instanceof Class)) {
			return is;
		}
		// else implementation is instance of Class (and not null)

		is.getClassifiers().add(implementation);
		/*
		 * if (hasStereotype (composite), containerImplementation) {
		 * is.getClassifiers ().add (containerImplem);
		 * }
		 */

		for(Property part : Utils.getParts(implementation)) {
			if(part instanceof Port) {
				continue;
			}
			InstanceSpecification partIS =
				createDepPlan(cdp, (Classifier)part.getType(), name + "." + part.getName());

			createSlot(cdp, is, partIS, part);
		}
		return is;
	}

	public static void configureProperty(InstanceSpecification instance, Classifier extension, String propertyName, String value) {
		Property attribute = extension.getAttribute(propertyName, null);
		if(attribute == null) {
			return;
		}
		// create a slot for a string value
		Slot slotStringVal = DepCreation.createSlotForConfigProp(instance, attribute);
		((LiteralString)slotStringVal.getValues().get(0)).setValue(value);

	}

	public static void configureProperty(InstanceSpecification instance, Classifier extension, String propertyName, int value) {
		Property attribute = extension.getAttribute(propertyName, null);
		if(attribute == null) {
			return;
		}
		Slot slotIntVal = instance.createSlot();
		slotIntVal.setDefiningFeature(attribute);
		slotIntVal.createValue("value for " + attribute.getName(), attribute.getType(), UMLPackage.eINSTANCE.getLiteralInteger());
		((LiteralInteger)slotIntVal.getValues().get(0)).setValue(value);

	}
}
