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
import org.eclipse.uml2.uml.Class;

import FCM.InteractionComponent;
import FCM.util.FCMUtil;

import com.cea.ec3m.gentools.core.Log;
import com.cea.ec3m.gentools.core.StUtils;

public class GenConnectionPatternHandler extends CmdHandler {

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
		//only one model is selected
		Class selectedClass = (Class)getSelectedEObject();
		Log.log(Log.INFO_MSG, Log.DIALOGS, "GenConnectionPattern.run: " + selectedClass.getName());
		InteractionComponent connType = StUtils.getApplication(selectedClass, InteractionComponent.class);
		FCMUtil.generateDefaultConnectionPattern(connType);
	}
}
