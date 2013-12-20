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

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;


// TODO: Auto-generated Javadoc
/**
 * The Class GenerateRTMapsCodeCommand.
 */
public class GenerateAthenaCodeCommand extends AbstractTransactionalCommand {

	/** The transactional edition domain. */
	private final TransactionalEditingDomain domain;

	/** The selected element. */
	private final EObject selectedElement;

	/** The athena target folder path. */
	private final String athenaTargetFolderPath;


	/**
	 * Instantiates a new generate rt maps code command.
	 * 
	 * @param label
	 *        the label
	 * @param domain
	 *        the domain
	 * @param selectedElement
	 *        the selected element
	 * @param athenaTargetFolderPath
	 *        the rtmaps target folder path
	 */
	public GenerateAthenaCodeCommand(String label, TransactionalEditingDomain domain, EObject selectedElement, String athenaTargetFolderPath) {
		super(domain, label, Collections.EMPTY_LIST);
		this.domain = domain;
		this.selectedElement = selectedElement;
		this.athenaTargetFolderPath = athenaTargetFolderPath;
	}


	/**
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor,
	 *      org.eclipse.core.runtime.IAdaptable)
	 * 
	 * @param monitor
	 * @param info
	 * @return
	 * @throws ExecutionException
	 */

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		//System.err.println("Model Exlorer generation menu Athena");
		
		AcceleoAthenaCodeGenerator codeGenerator = new AcceleoAthenaCodeGenerator();
		codeGenerator.runAcceleoTransformation(monitor, selectedElement, athenaTargetFolderPath);

		return CommandResult.newOKCommandResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean canExecute() {

		return (selectedElement != null && athenaTargetFolderPath != null && domain != null);
	}
}
