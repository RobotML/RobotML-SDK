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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

import FCM.Configuration;
import FCM.DeploymentPlan;

import com.cea.ec3m.gentools.core.ProjectManagement;
import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.dialogs.GenerationOptionsDialog;
import com.cea.ec3m.gentools.core.transformations.InstantiateDepPlan;

/**
 * Implementation class for ClassAction action
 */
public class InstantiateDepPlanHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		EObject selectedObj = getSelectedEObject();
		if(selectedObj instanceof Element) {
			if(StUtils.isApplied((Element)selectedObj, org.eclipse.papyrus.RobotML.DeploymentPlan.class) ||
				StUtils.isApplied((Element)selectedObj, Configuration.class)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// only one model is selected
		EObject selectedObj = getSelectedEObject();
		selectedCDP = null;
		if((selectedObj instanceof Package) || (selectedObj instanceof Class)) {
			selectedCDP = (Element)getSelectedEObject();
		} else {
			return null;
		}
		project = ProjectManagement.getCurrentProject();

		GenerationOptionsDialog optionsDialog = new GenerationOptionsDialog(new Shell());
		optionsDialog.open();
		if(optionsDialog.getReturnCode() == IDialogConstants.OK_ID) {

			final int genOptions = (Integer)optionsDialog.getResult()[0];
			Job job = new Job("Create deployment model (OO)") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					// execute the task ...
					//The command is deactivated, It is not used in the case or RobotML, RobotML generators are used instead
					//InstantiateDepPlan.instantiate(selectedCDP, monitor, project, genOptions);
					monitor.done();
					return Status.OK_STATUS;
				}
			};
			job.setUser(true);
			job.schedule();
		}

		return null;
	}

	private Element selectedCDP;

	private IProject project;
}
