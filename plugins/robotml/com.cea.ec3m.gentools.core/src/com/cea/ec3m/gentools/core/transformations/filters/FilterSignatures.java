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
package com.cea.ec3m.gentools.core.transformations.filters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.TemplateSignature;

import com.cea.ec3m.gentools.core.listeners.CopyListener;
import com.cea.ec3m.gentools.core.transformations.Copy;


/**
 * Remove signatures from package template (only remove signatures within the
 * template, not others)
 * 
 * @author ansgar
 * 
 */
public class FilterSignatures implements CopyListener {

	public static FilterSignatures getInstance() {
		if(instance == null) {
			instance = new FilterSignatures();
		}
		return instance;
	}

	public EObject copyEObject(Copy copy, EObject sourceEObj) {
		if(sourceEObj instanceof TemplateSignature) {
			if(copy.withinTemplate(sourceEObj)) {
				return null;
			}
		}
		return sourceEObj;
	}

	private static FilterSignatures instance = null;
}
