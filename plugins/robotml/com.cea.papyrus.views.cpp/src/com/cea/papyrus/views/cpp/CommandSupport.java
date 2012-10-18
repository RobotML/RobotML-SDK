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

package com.cea.papyrus.views.cpp;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.papyrus.infra.core.utils.EditorUtils;

/**
 * Utility function. Allow adaption to command stack
 *
 * @author ansgar
 *
 */
public class CommandSupport
{
	/**
	 * Execute the passed Runnable within a command
	 * @param label
	 * @param command
	 */
	public static void exec (String label, final Runnable command)
	{
		TransactionalEditingDomain domain = EditorUtils.getTransactionalEditingDomain();
		IOperationHistory history = OperationHistoryFactory.getOperationHistory();
		try {
			history.execute ( new AbstractTransactionalCommand (domain, label, Collections.EMPTY_LIST) {
				public CommandResult doExecuteWithResult (IProgressMonitor dummy, IAdaptable info) {
					command.run ();
	                return CommandResult.newOKCommandResult();
				}
			}, null, null);
		}
		catch (ExecutionException e) {
			e.printStackTrace ();
		}
	}
	
	/**
	 * Execute the passed Runnable within a command
	 * @param label
	 * @param command
	 */
	public static void exec (TransactionalEditingDomain domain, String label, final Runnable command)
	{
		// do works, undo does not (but is selectable in Papyrus Model explorer)
		IOperationHistory history = OperationHistoryFactory.getOperationHistory();
		try {
			history.execute ( new AbstractTransactionalCommand (domain, label, Collections.EMPTY_LIST) {
				public CommandResult doExecuteWithResult (IProgressMonitor dummy, IAdaptable info) {
					command.run ();
		               return CommandResult.newOKCommandResult();
				}
			}, null, null);
		}
		catch (ExecutionException e) {
			e.printStackTrace ();
		}
	}
	
}
