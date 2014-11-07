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
package org.eclipse.papyrus.robotml.generators.acceleo.morse.ui.handler;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

/**
 * The Class GenerateMorseCodeCommand.
 */
public class GenerateMorseCodeCommand extends AbstractTransactionalCommand {

	/** The transactional edition domain. */
	private final TransactionalEditingDomain domain;

	/** The selected element. */
	private final EObject selectedElement;

	/** The morse target folder path. */
	private final String morseTargetFolderPath;

	/**
	 * Instantiates a new generate Morse code command.
	 * 
	 * @param label
	 *        the label
	 * @param domain
	 *        the domain
	 * @param selectedElement
	 *        the selected element
	 * @param morseTargetFolderPath
	 *        the morse target folder path
	 */
	public GenerateMorseCodeCommand(String label, TransactionalEditingDomain domain, EObject selectedElement, String morseTargetFolderPath) {
		super(domain, label, Collections.EMPTY_LIST);
		this.domain = domain;
		this.selectedElement = selectedElement;
		this.morseTargetFolderPath = morseTargetFolderPath;
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

		System.err.println("monitor");
		AcceleoMorseCodeGenerator codeGenerator = new AcceleoMorseCodeGenerator();
		codeGenerator.runAcceleoTransformation(selectedElement, morseTargetFolderPath);

		return CommandResult.newOKCommandResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean canExecute() {
		return (selectedElement != null && morseTargetFolderPath != null && domain != null);
	}
}
