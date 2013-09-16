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
package org.eclipse.papyrus.robotml.deployment;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.robotml.deployment.extensions.ILangSupport;
import org.eclipse.papyrus.robotml.deployment.listeners.CopyListener;
import org.eclipse.papyrus.robotml.deployment.transformations.Copy;
import org.eclipse.uml2.uml.Class;

/**
 * Gather configuration data for a code generation project
 * In particular, a class might be stereotyped to provide additional information
 * about required compilation options (in case of C++ include paths, libraries, ...)
 * 
 * @author ansgar
 */
public class GatherConfigData implements CopyListener {

	/**
	 * Gather configuration data for a code generation project
	 * Constructor.
	 * 
	 * @param langSupport
	 *        A reference to a class providing the language support interface
	 */
	public GatherConfigData(ILangSupport langSupport) {
		this.langSupport = langSupport;
	}

	public EObject copyEObject(Copy copy, EObject sourceEObj) {
		if(sourceEObj instanceof Class) {
			langSupport.gatherConfigData((Class)sourceEObj);
		}
		return sourceEObj;
	}

	private ILangSupport langSupport;
}
