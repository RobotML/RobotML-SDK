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
package com.cea.ec3m.gentools.core.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;

import FCM.DeploymentPlan;

import com.cea.ec3m.gentools.core.CommandSupport;
import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.Utils;
import com.cea.ec3m.gentools.core.sync.CompImplSync;
import com.cea.ec3m.gentools.core.sync.DepPlanSync;

public class SyncHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		EObject selectedObj = getSelectedEObject();
		if(selectedObj instanceof Class) {
			if(Utils.isComponent((Class)selectedObj)) {
				return true;
			}
		}
		if(selectedObj instanceof Package) {
			if(StUtils.isApplied((Package)selectedObj, org.eclipse.papyrus.RobotML.DeploymentPlan.class)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//only one model is selected
		if(getSelectedEObject() instanceof Class) {
			final Class selectedClass = (Class)getSelectedEObject();
			if(Utils.isCompImpl(selectedClass)) {
				CommandSupport.exec("Synchronize component via implementation", new Runnable() {

					public void run() {
						CompImplSync.syncRealizations(selectedClass);
						// CompImplSync.syncContextOps (selectedClass, true);
						CompImplSync.interfaceModifications(selectedClass, null);
					}
				});
			} else if(Utils.isCompType(selectedClass)) {
				CommandSupport.exec("Synchronize component via type", new Runnable() {

					public void run() {
						CompImplSync.syncViaType(selectedClass, false);
						// CompImplSync.syncContextOps (selectedClass, true);
					}
				});
			}
		}
		else if(getSelectedEObject() instanceof Package) {
			CommandSupport.exec("Synchronize deployment plan", new Runnable() {

				public void run() {
					DepPlanSync.syncDepPlan((Package)getSelectedEObject());
				}
			});
		}
		return null;
	}
}
