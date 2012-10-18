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

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;


/**
 * This class encapsulates an <code>org.eclipse.uml2.uml.Transition</code><BR>
 * 
 * @author Remi SCHNEKENBURGER
 */
public class TransitionService {

	/**
	 * Get the transition number within the state machine
	 * BEWARE: this method works only with Accord|UML compliant State Machines,
	 * with no parallel processing, i.e. a single region
	 * 
	 * @return Returns the transition number, returns 0 if pb
	 */
	public int getNumber(Transition transition) {
		int nb = 0;
		StateMachine theUml2SM = transition.containingStateMachine();
		EList<Region> SMRegions = theUml2SM.getRegions();
		if(SMRegions.size() >= 2) {
			// TODO error message
		} else {
			Region theRegion = SMRegions.get(0);
			for (Transition currentTrans : theRegion.getTransitions()) {
				nb = nb + 1;
				if(currentTrans == transition) {
					break;
				}
			}
		}
		return nb;
	}
}
