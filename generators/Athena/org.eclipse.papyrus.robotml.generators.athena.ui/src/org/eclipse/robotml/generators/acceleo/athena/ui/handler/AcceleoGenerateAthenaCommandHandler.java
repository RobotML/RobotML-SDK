/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Saadia DHOUIB (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.robotml.generators.acceleo.athena.ui.handler;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler;


// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoGenerateRTMapsCommandHandler.
 */
public class AcceleoGenerateAthenaCommandHandler extends AbstractCommandHandler {

	/**
	 * @see org.eclipse.papyrus.modelexplorer.handler.AbstractCommandHandler#getCommand()
	 * 
	 * @return
	 */

	@Override
	protected Command getCommand() {
		EObject selectedObject = getSelectedElement();
		TransactionalEditingDomain editingDomain = getEditingDomain();
				
		URI targetFolderURI = selectedObject.eResource().getURI();
		String[] tmp = targetFolderURI.toPlatformString(false).split("/");
		Date date1 = new Date();
		SimpleDateFormat  simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = simpleFormat.format(date1);
		
		String folderName = File.separator + tmp[1] + File.separator + tmp[1] + "athenaFiles" + date;

		return new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(new GenerateAthenaCodeCommand("Generate Athena code command", editingDomain, selectedObject, folderName));

	}


}
