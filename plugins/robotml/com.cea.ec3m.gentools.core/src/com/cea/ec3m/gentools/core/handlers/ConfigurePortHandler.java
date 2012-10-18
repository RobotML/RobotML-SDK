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
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Port;

import com.cea.ec3m.gentools.core.CommandSupport;
import com.cea.ec3m.gentools.core.RunnableWithResult;
import com.cea.ec3m.gentools.core.dialogs.ConfigureInstanceDialog;
import com.cea.ec3m.gentools.core.dialogs.ConfigurePortDialog;

/**
 * Implementation class for ClassAction action
 */
public class ConfigurePortHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		EObject selectedObj = getSelectedEObject();
		if((selectedObj instanceof Class) ||
			(selectedObj instanceof Port)) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(!(getSelectedEObject() instanceof NamedElement)) {
			return null;
		}

		final NamedElement element = (NamedElement)getSelectedEObject();
		final Shell shell = new Shell();

		// 1. select possible connectors according to port types
		// (only show compatible connectors check-box?)
		// 2. select implementation group according to connector type

		if(element instanceof Class) {
			CommandSupport.exec("Configure ports", new RunnableWithResult() {

				public CommandResult run() {
					ConfigurePortDialog configureInstanceDialog =
						new ConfigurePortDialog(shell);
					if (configureInstanceDialog.init((Class)element)) {
						configureInstanceDialog.setTitle("Configure ports");
						configureInstanceDialog.setMessage("Configure ports of component " + element.getName());
						configureInstanceDialog.open();
						if(configureInstanceDialog.getReturnCode() == IDialogConstants.OK_ID) {
							return CommandResult.newOKCommandResult();
						}
					}
					return CommandResult.newCancelledCommandResult();
				}
			});
		} else if(element instanceof Port) {
			CommandSupport.exec("Configure ports", new RunnableWithResult() {

				public CommandResult run() {
					ConfigurePortDialog configurePortDialog =
						new ConfigurePortDialog(shell);
					if (configurePortDialog.init((Port)element)) {
						configurePortDialog.setTitle("Configure ports");
						configurePortDialog.setMessage("Configure port " + element.getName());
						configurePortDialog.open();
						if(configurePortDialog.getReturnCode() == IDialogConstants.OK_ID) {
							return CommandResult.newOKCommandResult();
						}
					}
					return CommandResult.newCancelledCommandResult();
				}
			});

			
		} else if(element instanceof InstanceSpecification) {

			CommandSupport.exec("Configure instance", new RunnableWithResult() {

				public CommandResult run() {
					ConfigureInstanceDialog configureInstanceDialog =
						new ConfigureInstanceDialog(shell);
					if (configureInstanceDialog.init((InstanceSpecification)element)) {
						configureInstanceDialog.setMessage("Configure instance " + element.getName());
						configureInstanceDialog.open();
						if(configureInstanceDialog.getReturnCode() == IDialogConstants.OK_ID) {
							return CommandResult.newOKCommandResult();
						}
					}
					return CommandResult.newCancelledCommandResult();
				}
			});
		}
		return null;
	}
}
