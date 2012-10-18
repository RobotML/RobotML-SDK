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
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;

import FCM.InteractionComponent;

import com.cea.ec3m.gentools.core.CommandSupport;
import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.dialogs.ConnectorSelectionDialog;

/**
 * Implementation class for ClassAction action
 */
public class SelectConnectorHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		EObject selectedObj = getSelectedEObject();
		if((selectedObj instanceof Connector) || (selectedObj instanceof Property)) {
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
		// feature is a common superclass of Connector and Property
		if(!(getSelectedEObject() instanceof Feature)) {
			return null;
		}
		// get selected connector
		final Feature selectedConnector = (Feature)getSelectedEObject();
		Shell shell = new Shell();

		// 1. select possible connectors according to port types
		// (only show compatible connectors check-box?)
		// 2. select implementation group according to connector type

		Model model = selectedConnector.getModel();

		ConnectorSelectionDialog elementSelector =
			new ConnectorSelectionDialog(shell, model, selectedConnector);
		elementSelector.setTitle("Select connector");
		elementSelector.setMessage("Select an implementation for connector " + selectedConnector.getName());
		elementSelector.open();
		if(elementSelector.getReturnCode() == IDialogConstants.OK_ID) {
			final Object[] result = elementSelector.getResult();
			if((result.length == 1) && (result[0] instanceof Class)) {
				CommandSupport.exec("Select connector", new Runnable() {

					public void run() {
						FCM.Connector fcmSelectedConnector = StUtils.applyApp(selectedConnector, FCM.Connector.class);
						InteractionComponent newConnType = StUtils.getApplication((Class)result[0], InteractionComponent.class);
						fcmSelectedConnector.setIc(newConnType);
					}
				});
			}
		}
		return null;
	}
}
