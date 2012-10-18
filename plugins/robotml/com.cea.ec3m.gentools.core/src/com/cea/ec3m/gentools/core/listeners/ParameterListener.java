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
package com.cea.ec3m.gentools.core.listeners;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.papyrus.infra.core.listenerservice.IPapyrusListener;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;

import com.cea.ec3m.gentools.core.Log;
import com.cea.ec3m.gentools.core.sync.CompImplSync;

public class ParameterListener implements IPapyrusListener {

	public static ParameterListener getInstance() {
		if(instance == null) {
			instance = new ParameterListener();
		}
		return instance;
	}

	private static ParameterListener instance = null;

	public void notifyChanged(Notification notification) {
		int evtType = notification.getEventType();
		Object notifier = notification.getNotifier();
		String name = "";
		if(notifier instanceof NamedElement) {
			name = ((NamedElement)notifier).getName();
		}
		if((evtType == Notification.SET) || (evtType == Notification.ADD)) {
			Log.log(Log.INFO_MSG, Log.TRAFO_SYNC, "Parameter.adapter, set " + name);

			if(notifier instanceof Parameter) {
				Element owner = ((Parameter)notifier).getOwner();
				if(owner instanceof Operation) {
					owner = owner.getOwner();
					if(owner instanceof Interface) {
						CompImplSync.syncViaInterface((Interface)owner);
					}
				}
			}
		} else {
			Log.log(Log.INFO_MSG, Log.TRAFO_SYNC, "Parameter.adapter, code: " + notification.getEventType() + ", name: " + name);
		}
	}
}
