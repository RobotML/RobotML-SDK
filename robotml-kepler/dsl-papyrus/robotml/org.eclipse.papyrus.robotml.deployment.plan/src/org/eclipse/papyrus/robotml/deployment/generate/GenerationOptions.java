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
package org.eclipse.papyrus.robotml.deployment.generate;

/**
 * Constants for generation options (must be powers of 2)
 * 
 * @author ansgar
 * 
 */
public interface GenerationOptions {

	final public static int REWRITE_SETTINGS = 1;

	final public static int ONLY_CHANGED = 2;

	final public static int MODEL_ONLY = 4;

};
