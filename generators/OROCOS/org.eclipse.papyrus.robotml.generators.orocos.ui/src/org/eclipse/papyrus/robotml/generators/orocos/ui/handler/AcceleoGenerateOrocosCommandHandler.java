/*****************************************************************************
 * Copyright (c) 2013 LIP6.
 *
 * This software is a computer program whose purpose is to transform RobotML models
 * into OROCOS-RTT or RTT-LUA components via source code generation techniques.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Selma Kchir (LIP6) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.robotml.generators.orocos.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.robotml.generators.orocos.ui.Activator;
import org.eclipse.ui.handlers.HandlerUtil;



// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoGenerateOrocosCommandHandler.
 */
public class AcceleoGenerateOrocosCommandHandler extends AbstractHandler {

	/** The orocos folder. */
	private final String orocosFolder = "orocos-generated-files";

	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			EObject selectedElement = EMFHelper.getEObject(structuredSelection.getFirstElement());
			if(selectedElement == null) {
				return null;
			}

			URI resourceURI = selectedElement.eResource().getURI();
			//int lastSegment = resourceURI.segmentCount() - 1;
			URI targetFolderURI = resourceURI.trimSegments(1).appendSegment(orocosFolder);

			try {
				TransactionalEditingDomain editingDomain = ServiceUtilsForEObject.getInstance().getTransactionalEditingDomain(selectedElement);

				ICommand generationCommand = new GenerateOrocosCodeCommand("Generate Orocos code command", editingDomain, selectedElement, targetFolderURI.toPlatformString(true));

				if(generationCommand.canExecute()) {
					generationCommand.execute(new NullProgressMonitor(), null);
				}
			} catch (ServiceException ex) {
				Activator.log.error(ex);
			}
		}

		return null;
	}

}
