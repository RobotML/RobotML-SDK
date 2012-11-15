/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
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
package org.eclipse.acceleo.module.OrocosGenerator.ui.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler;

import org.eclipse.papyrus.commands.wrappers.*;


// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoGenerateOrocosCommandHandler.
 */
public class AcceleoGenerateOrocosCommandHandler extends AbstractCommandHandler{

	/** The rtmaps folder. */
	private final String orocosFolder = "/orocos-generated-files";
	
	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.modelexplorer.handler.AbstractCommandHandler#getCommand()
	 */
	@Override
	protected Command getCommand() {
		// TODO Auto-generated method stub
		EObject selectedObject = getSelectedElement();
		TransactionalEditingDomain editingDomain = getEditingDomain();

		URI targetFolderURI = selectedObject.eResource().getURI();
		int lastindex = targetFolderURI.toPlatformString(false).lastIndexOf("/");
		String targetPath = targetFolderURI.toPlatformString(false).substring(0, lastindex);

		return new GMFtoEMFCommandWrapper(new GenerateOrocosCodeCommand("Generate RTMaps code command", editingDomain, selectedObject, targetPath + orocosFolder));
	}

}
