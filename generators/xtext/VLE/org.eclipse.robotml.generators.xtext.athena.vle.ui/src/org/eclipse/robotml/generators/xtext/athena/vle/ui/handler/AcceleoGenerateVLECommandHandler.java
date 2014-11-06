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
package org.eclipse.robotml.generators.xtext.athena.vle.ui.handler;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler;


// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoGenerateVLECommandHandler.
 */
public class AcceleoGenerateVLECommandHandler extends AbstractCommandHandler {

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
		
		String folderName = File.separator + tmp[1] + File.separator + tmp[1] + "vleFiles" + date;

		return new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(new GenerateVLECodeCommand("Generate VLE code command", editingDomain, selectedObject, folderName));

	}


}
