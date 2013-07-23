package org.eclipse.papyrus.robotml.deployment;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;

public interface RunnableWithResult {

	/**
	 * Execute a commad
	 * 
	 * @return CommandResult.newOKCommandResult() if successful
	 *         CommandResult.newErrorCommandResult(..) or
	 *         CommandReuslt.newCancelCommandResult(..) otherwise
	 */
	public CommandResult run();
}
