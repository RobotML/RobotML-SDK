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

import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;


// TODO: Auto-generated Javadoc
/**
 * The Class GenerateOrocosCodeCommand.
 */
public class GenerateOrocosCodeCommand extends AbstractTransactionalCommand {

	/** The transactional edition domain. */
	private final TransactionalEditingDomain domain;

	/** The selected element. */
	private final EObject selectedElement;

	/** The orocos target folder path. */
	private final String orocosTargetFolderPath;
	
	/**
	 * Instantiates a new generate orocos code command.
	 *
	 * @param label the label
	 * @param domain the domain
	 * @param selectedElement the selected element
	 * @param orocosTargetFolderPath the orocos target folder path
	 */
	public GenerateOrocosCodeCommand(String label, TransactionalEditingDomain domain, EObject selectedElement, String orocosTargetFolderPath) {
		super(domain, label, Collections.EMPTY_LIST);
		// TODO Auto-generated constructor stub
		this.domain = domain;
		this.selectedElement = selectedElement;
		this.orocosTargetFolderPath = orocosTargetFolderPath;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		System.err.println("Model Exlorer generation menu Orocos");
		AcceleoOrocosCodeGenerator codeGenerator = new AcceleoOrocosCodeGenerator();
		codeGenerator.runAcceleoTransformation(selectedElement, orocosTargetFolderPath);

		return CommandResult.newOKCommandResult();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean canExecute() {

		return (selectedElement != null && orocosTargetFolderPath != null && domain != null);
	}

}
