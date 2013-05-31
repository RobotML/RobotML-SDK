/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 * Contributors:
 *  Saadia DHOUIB (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.robotml.validation;

import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.PackageImport;

public class ValidationDelegateClientSelector implements IClientSelector {

	/**
	 * Queries whether I select the specified object, which indicates that it
	 * belongs to my client context.
	 * 
	 * @param object
	 *        a model element of some kind
	 * @return <code>true</code> if the <code>object</code> matches my client
	 *         context; <code>false</code>, otherwise
	 */
	public boolean selects(Object object) {
		if(object instanceof PackageImport) {
			// return false;
		}
		return (object instanceof Element);
	}
}
