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
import org.eclipse.uml2.uml.Class;

import com.cea.ec3m.gentools.core.Utils;
import com.cea.ec3m.gentools.core.listeners.CopyListener;
import com.cea.ec3m.gentools.core.sync.CompImplSync;
import com.cea.ec3m.gentools.core.transformations.Copy;

/**
 * Synchronize derived realizations (after copying). If re-synchronization is not done, the
 * relationship would point to wrong interface, if it is derived and depending on a formal parameter
 * (e.g. derived push interface with formal parameter T would be at wrong location).
 * => TODO: incomplete explication, re-think about location of derived interface
 * 
 * @author ansgar
 * 
 */
public class FixTemplateSync implements CopyListener {

	public static FixTemplateSync getInstance() {
		if(instance == null) {
			instance = new FixTemplateSync();
		}
		return instance;
	}

	public EObject copyEObject(Copy copy, EObject targetEObj) {
		// if (copy.get(sourceEObj) isWithinTemplate)
		if((targetEObj instanceof Class) && Utils.isCompImpl((Class)targetEObj)) {
			CompImplSync.syncRealizations((Class)targetEObj);
		}
		return targetEObj;
	}

	private static FixTemplateSync instance = null;
}
