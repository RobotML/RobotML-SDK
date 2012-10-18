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
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import com.cea.ec3m.gentools.core.CommandSupport;
import com.cea.ec3m.gentools.core.RunnableWithResult;
import com.cea.ec3m.gentools.core.dialogs.ContainerDialog;

/**
 * Implementation class for ClassAction action
 */
public class SelectContainerHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		EObject selectedObj = getSelectedEObject();
		if((selectedObj instanceof Class) ||
			(selectedObj instanceof InstanceSpecification)) {
			return true;
		}
		if(selectedObj instanceof Property) {
			Type type = ((Property)selectedObj).getType();
			if(type instanceof Class) {
				return true;
			}
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

		NamedElement ne = (NamedElement)getSelectedEObject();
		final Shell shell = new Shell();

		if(ne instanceof Property) {
			// treat property as the associated type
			Type type = ((Property)ne).getType();
			if(type instanceof Class) {
				ne = (Class)type;
			}
		}
		final NamedElement element = ne;

		// 1. select possible connectors according to port types
		// (only show compatible connectors check-box?)
		// 2. select implementation group according to connector type

		if(element instanceof Class) {
			// container dialog: either extension, rule or interceptor
			// howto select? which? (and howto add/remove?) - Std - dialog is good?
			CommandSupport.exec("Select container", new RunnableWithResult() {

				public CommandResult run() {
					ContainerDialog elementSelector =
						new ContainerDialog(shell, (Class)element);
					elementSelector.setTitle("Select container rules for component " + element.getName());
					elementSelector.open();
					if(elementSelector.getReturnCode() == IDialogConstants.OK_ID) {
						return CommandResult.newOKCommandResult();
					}
					else {
						return CommandResult.newCancelledCommandResult();
					}
				}
			});
		} else if(element instanceof InstanceSpecification) {
			/*
			 * ConnectorSelectionDialog elementSelector =
			 * new ConnectorSelectionDialog (shell, model, (InstanceSpecification) element);
			 * elementSelector.setTitle("Select connector");
			 * elementSelector.setMessage("Select an implementation for connector " + selectedConnector.getName ());
			 * elementSelector.open();
			 * if (elementSelector.getReturnCode () == IDialogConstants.OK_ID) {
			 * final Object[] result = elementSelector.getResult ();
			 * if ((result.length == 2) && (result[0] instanceof Class) && (result[1] instanceof Class)) {
			 * CommandSupport.exec ("Select connector", new Runnable () {
			 * public void run () {
			 * Object newConnType = StUtils.getApplication ((Class) result[0], ConnectorType.class);
			 * Object newConnImpl = StUtils.getApplication ((Class) result[1], ConnectorImpl.class);
			 * }
			 * });
			 * }
			 * }
			 */
		}
		return null;
	}
}
