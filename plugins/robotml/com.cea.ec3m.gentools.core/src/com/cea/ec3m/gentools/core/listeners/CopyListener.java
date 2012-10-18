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
package com.cea.ec3m.gentools.core.listeners;

import org.eclipse.emf.ecore.EObject;

import com.cea.ec3m.gentools.core.transformations.Copy;

/**
 * Interface for listeners that are notified for the addition of a classifier
 * via copy
 * 
 * @see com.cea.ec3m.gentools.core.transformations.Copy
 */
public interface CopyListener {

	/**
	 * Is called for each EObject that is copied. If it returns null, the
	 * indicated object should not be copied. If it returns a different object
	 * than the passed EObject, this object is used (the returned object of the
	 * first listener is used).
	 * 
	 * @param sourceEObj
	 *        the added classifier
	 */
	public EObject copyEObject(Copy copy, EObject sourceEObj);
}
