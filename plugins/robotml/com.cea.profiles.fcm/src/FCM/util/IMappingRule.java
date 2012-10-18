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
package FCM.util;

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interface;

import FCM.Port;

/**
 * Interface used by extension point for evaluation of interface mappings
 *
 */
public interface IMappingRule {
	static final int NONE = 0;
	static final int PROVIDED = 1;
	static final int REQUIRED = 2;
	static final int BOTH = 3;
	
	/**
	 * return true, if the getProvided call below needs a transaction, i.e.
	 * potentially modifies the model
	 */
	public int needsTransaction ();
		
	/**
	 * Return a list of provided interfaces for a given p (and in
	 * the context of a configuration c)
	 * @param p the port
	 * @param config the configuration
	 * @return the list of provided interfaces
	 */
	public Interface getProvided(Port p, InstanceSpecification config);

	/**
	 * Return a list of provided interfaces for a given p (and in
	 * the context of a configuration c)
	 * @param p the port
	 * @param config the configuration
	 * @return the list of provided interfaces
	 */	
	public Interface getRequired(Port p, InstanceSpecification config);
}
