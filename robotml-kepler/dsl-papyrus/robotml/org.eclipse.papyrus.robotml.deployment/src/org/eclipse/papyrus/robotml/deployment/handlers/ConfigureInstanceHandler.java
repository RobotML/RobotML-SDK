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

package org.eclipse.papyrus.robotml.deployment.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.papyrus.robotml.deployment.CommandSupport;
import org.eclipse.papyrus.robotml.deployment.RunnableWithResult;
import org.eclipse.papyrus.robotml.deployment.dialog.ConfigureInstanceDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * Implementation class for ClassAction action
 */
public class ConfigureInstanceHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		EObject selectedObj = getSelectedEObject();
		if((selectedObj instanceof Class) ||
			(selectedObj instanceof Connector) ||
			(selectedObj instanceof Property) ||
			(selectedObj instanceof InstanceSpecification)) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public Object execute(ExecutionEvent event) {
		if(!(getSelectedEObject() instanceof NamedElement)) {
			return null;
		}

		final NamedElement element = (NamedElement)getSelectedEObject();
		final Shell shell = new Shell();

		// 1. select possible connectors according to port types
		// (only show compatible connectors check-box?)
		// 2. select implementation group according to connector type

		if(element instanceof Class) {
			// container dialog: either extension, rule or interceptor
			// howto select? which? (and howto add/remove?) - Std - dialog is good?
			CommandSupport.exec("Configure associated component instance", new RunnableWithResult() {

				public CommandResult run() {
					ConfigureInstanceDialog configureInstanceDialog =
						new ConfigureInstanceDialog(shell);
					if (configureInstanceDialog.init((Class)element)) {
						configureInstanceDialog.setTitle("Configure instance");
						configureInstanceDialog.setMessage("Configure instance for component " + element.getName());
						configureInstanceDialog.open();
						if(configureInstanceDialog.getReturnCode() == IDialogConstants.OK_ID) {
							return CommandResult.newOKCommandResult();
						}
					}
					return CommandResult.newCancelledCommandResult();
				}
			});
		} else if(element instanceof Feature) {
			// container dialog: either extension, rule or interceptor
			// howto select? which? (and howto add/remove?) - Std - dialog is good?
			CommandSupport.exec("Configure associated instance", new RunnableWithResult() {

				public CommandResult run() {
					ConfigureInstanceDialog configureInstanceDialog =
						new ConfigureInstanceDialog(shell);
					if (configureInstanceDialog.init((Feature)element)) {
						configureInstanceDialog.setTitle("Configure instance");
						configureInstanceDialog.setMessage("Configure instance for property/connector " + element.getName());
						configureInstanceDialog.open();
						if(configureInstanceDialog.getReturnCode() == IDialogConstants.OK_ID) {
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
