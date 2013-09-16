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
package org.eclipse.papyrus.robotml.deployment.filters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.robotml.deployment.listeners.CopyListener;
import org.eclipse.papyrus.robotml.deployment.transformations.Copy;
import org.eclipse.uml2.uml.Comment;

/**
 * Do not copy comments
 * 
 * @author ansgar
 * 
 */
public class FilterComments implements CopyListener {

	public static FilterComments getInstance() {
		if(instance == null) {
			instance = new FilterComments();
		}
		return instance;
	}

	public EObject copyEObject(Copy copy, EObject sourceEObj) {
		if(sourceEObj instanceof Comment) {
			return null;
		}
		return sourceEObj;
	}

	private static FilterComments instance = null;
}
