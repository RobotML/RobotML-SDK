/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *
 *****************************************************************************/
package org.eclipse.papyrus.robotml.deployment.core;

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
