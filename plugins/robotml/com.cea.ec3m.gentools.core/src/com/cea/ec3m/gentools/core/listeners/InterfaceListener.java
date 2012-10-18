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
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;

import com.cea.ec3m.gentools.core.Log;
import com.cea.ec3m.gentools.core.sync.CompImplSync;

public class InterfaceListener implements IPapyrusListener {

	public static InterfaceListener getInstance() {
		if(instance == null) {
			instance = new InterfaceListener();
		}
		return instance;
	}

	private static InterfaceListener instance = null;

	public void notifyChanged(Notification notification) {
		Log.log(Log.INFO_MSG, Log.TRAFO_SYNC, "Interface adapter");
		int evtType = notification.getEventType();
		Object notifier = notification.getNotifier();
		String name = "";
		if(notifier instanceof NamedElement) {
			name = ((NamedElement)notifier).getName();
		}
		if(evtType == Notification.SET) {
			Log.log(Log.INFO_MSG, Log.TRAFO_SYNC, "Interface.adapter, set " + name);
			if(notifier instanceof Class) {
				// UMLExecutor.addCCM_intf ((Class) notifier);
			}
		} else if(evtType == Notification.ADD) {
			Log.log(Log.INFO_MSG, Log.TRAFO_SYNC, "Interface.adapter, add " + name);

			if(notifier instanceof Interface) {
				// Interface intf = (Interface) notifier;

				// never executed? (since name is always unset when
				// an operation is newly added)
				/*
				 * Object obj = notification.getNewValue ();
				 * if (obj instanceof Operation) {
				 * Operation operation = (Operation) obj;
				 * 
				 * if (operation.getName () == null) {
				 * // no name yet, don't try to create behavior for it.
				 * }
				 * else {
				 * CompTypeSync.delegateImplSync (intf, null);
				 * }
				 * }
				 */
				// registerOperations (intf);
			}
		} else if(evtType == Notification.REMOVE) {
			Object oldValue = notification.getOldValue();
			if(oldValue instanceof BehavioralFeature) {
				BehavioralFeature toBeRemoved = (BehavioralFeature)oldValue;

				Log.log(Log.INFO_MSG, Log.TRAFO_SYNC, "Interface.adapter, remove " + toBeRemoved.getName() + " from " + name);

				Interface intf = (Interface)notifier;
				// TODO: share code? with UMLExecutor
				CompImplSync.syncViaInterface(intf, toBeRemoved);
			}
		} else {
			Log.log(Log.INFO_MSG, Log.TRAFO_SYNC, "Interface.adapter, code: " + notification.getEventType() + ", name: " + name);
		}
	}
}
