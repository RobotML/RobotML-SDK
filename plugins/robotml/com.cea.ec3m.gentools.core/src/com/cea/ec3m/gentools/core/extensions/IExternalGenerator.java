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

package com.cea.ec3m.gentools.core.extensions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;

/**
 * Interface used by eC3M extensions that supports specific external code generators, e.g. CORBA and DDS
 */
public interface IExternalGenerator {

	/**
	 * generate a class by means of an external generator
	 * @param source A source element for the generator, e.g. an interface for a CORBA generator
	 * @returns a list of generated classifiers:
	 * 	Even, if the external generator produces code directly, the Java wrapper should return a set
	 *  model elements (may be incomplete) that represent the generated elements. For instance, in case
	 *  of C++, an empty class with the stereotype "extern C" could be returned 
	 */
	public EList<Classifier> generate (Classifier source);
}
