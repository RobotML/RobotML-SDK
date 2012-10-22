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
package org.eclipse.robotml.generators.acceleo.aroccam.ui.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.modelexplorer.handler.AbstractCommandHandler;




// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoGenerateAroccamCommandHandler.
 */
public class AcceleoGenerateAroccamCommandHandler extends AbstractCommandHandler {

	/** The aroccam folder. */
	private final String aroccamFolder = "/aroccam-generated-files";

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
		int lastindex = targetFolderURI.toPlatformString(false).lastIndexOf("/");
		String targetPath = targetFolderURI.toPlatformString(false).substring(0, lastindex);

		return new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(new GenerateAroccamCodeCommand("Generate Aroccam code command", editingDomain, selectedObject, targetPath + aroccamFolder));

	}


}
