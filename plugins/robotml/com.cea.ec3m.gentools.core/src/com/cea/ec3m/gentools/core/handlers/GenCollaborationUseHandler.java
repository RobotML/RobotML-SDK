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

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IViewPart;

import FCM.Connector;
import FCM.util.FCMUtil;

import com.cea.ec3m.gentools.core.StUtils;

/**
 * currently unused
 * 
 * @author ansgar
 */
public class GenCollaborationUseHandler extends CmdHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
	 */
	public void init(IViewPart view) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		updateSelectedEObject();

		org.eclipse.uml2.uml.Connector selectedConnector = (org.eclipse.uml2.uml.Connector)getSelectedEObject();
		Connector fcmConn = StUtils.getApplication(selectedConnector, Connector.class);
		FCMUtil.generateCollaborationUse(fcmConn);
	}
}
