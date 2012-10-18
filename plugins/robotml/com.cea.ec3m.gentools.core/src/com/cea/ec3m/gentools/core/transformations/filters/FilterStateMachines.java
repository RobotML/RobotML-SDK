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
package com.cea.ec3m.gentools.core.transformations.filters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;

import com.cea.ec3m.gentools.core.listeners.CopyListener;
import com.cea.ec3m.gentools.core.transformations.Copy;


public class FilterStateMachines implements CopyListener {

	public static FilterStateMachines getInstance() {
		if(instance == null) {
			instance = new FilterStateMachines();
		}
		return instance;
	}

	public EObject copyEObject(Copy copy, EObject sourceEObj) {
		if(sourceEObj instanceof StateMachine) {
			StateMachine sm = (StateMachine)sourceEObj;
			Class tmClass = getTargetClass(copy, sm);

			// copy opaque behavior in state machine to class level
			for(Region region : sm.getRegions()) {
				for(Transition transition : region.getTransitions()) {
					Behavior effect = transition.getEffect();
					if(effect != null) {
						if(tmClass != null) {
							String newName = sm.getName() + "_" + transition.getName() + "_" + effect.getName();
							moveBehavior(newName, tmClass, effect);
						}
					}
				}
			}
			// remove state machine
			return null;
		}
		return sourceEObj;
	}

	public Class getTargetClass(Copy copy, StateMachine sm) {
		Element smOwner = sm.getOwner();
		EObject tmOwner = copy.getMap(smOwner).get(smOwner);
		if(tmOwner instanceof Class) {
			return (Class)tmOwner;
		}
		return null;
	}

	public void moveBehavior(String newName, Class tmClass, Behavior effect) {
		Behavior copiedEffect = EcoreUtil.copy(effect);
		if(tmClass.getOwnedOperation(newName, null, null) != null) {
			// has already been added
			return;
		}
		Operation operation = tmClass.createOwnedOperation(newName, null, null);
		copiedEffect.setSpecification(operation);
		copiedEffect.setName(newName);
		tmClass.getOwnedBehaviors().add(copiedEffect);

	}

	private static FilterStateMachines instance = null;
}
