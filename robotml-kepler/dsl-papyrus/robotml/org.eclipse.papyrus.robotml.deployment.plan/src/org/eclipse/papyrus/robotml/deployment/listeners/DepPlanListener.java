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
package org.eclipse.papyrus.robotml.deployment.listeners;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.papyrus.infra.core.listenerservice.IPapyrusListener;
import org.eclipse.papyrus.robotml.deployment.core.StUtils;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Package;
import org.eclipse.papyrus.RobotML.DeploymentPlan;

/**
 * A model listener that updates a deployment plan, e.g. add, remove or
 * rename instance specifications , if the composites referenced
 * by a deployment plan change. Since the code is very incomplete, it is
 * currently not used. It needs to be clarified what changes are useful,
 * in particular whether delete operations in a composite should immediately
 * remove the associate slot in instance specifications of the composite and the
 * referenced instance specifications.
 * 
 * @author ansgar
 * 
 */
public class DepPlanListener implements IPapyrusListener {

	public void notifyChanged(Notification notification) {
		// TODO Auto-generated method stub
		int evtType = notification.getEventType();
		Object notifier = notification.getNotifier();
		// String name = "";

		if(evtType == Notification.SET) {
			// Object oldValue = notification.getOldValue ();
			if(notifier instanceof Package) {
				org.eclipse.papyrus.RobotML.DeploymentPlan de = StUtils.getApplication((Package) notifier, org.eclipse.papyrus.RobotML.DeploymentPlan.class);
				Object mainInstance = (de != null) ? de.getMainInstance() : null;
				if(mainInstance instanceof InstanceSpecification) {
					// TODO user wants to declare the system component, the instance specification should be created
					// automatically

				}
				// if ((oldValue instanceof ) && (notifier instanceof Class)) {
			}
		}
	}
}
