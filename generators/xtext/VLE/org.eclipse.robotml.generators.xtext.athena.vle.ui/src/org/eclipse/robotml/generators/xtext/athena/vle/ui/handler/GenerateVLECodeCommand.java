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
 * The Class GenerateVLECodeCommand.
 */
public class GenerateVLECodeCommand extends AbstractTransactionalCommand {

	/** The transactional edition domain. */
	private final TransactionalEditingDomain domain;

	/** The selected element. */
	private final EObject selectedElement;

	/** The VLE target folder path. */
	private final String vleTargetFolderPath;


	/**
	 * Instantiates a new generate rt maps code command.
	 * 
	 * @param label
	 *        the label
	 * @param domain
	 *        the domain
	 * @param selectedElement
	 *        the selected element
	 * @param vleTargetFolderPath
	 *        the VLE target folder path
	 */
	public GenerateVLECodeCommand(String label, TransactionalEditingDomain domain, EObject selectedElement, String vleTargetFolderPath) {
		super(domain, label, Collections.EMPTY_LIST);
		this.domain = domain;
		this.selectedElement = selectedElement;
		this.vleTargetFolderPath = vleTargetFolderPath;
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
		
		AcceleoVLECodeGenerator codeGenerator = new AcceleoVLECodeGenerator();
		codeGenerator.runAcceleoTransformation(monitor, selectedElement, vleTargetFolderPath);

		return CommandResult.newOKCommandResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean canExecute() {

		return (selectedElement != null && vleTargetFolderPath != null && domain != null);
	}
}
