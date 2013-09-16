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
