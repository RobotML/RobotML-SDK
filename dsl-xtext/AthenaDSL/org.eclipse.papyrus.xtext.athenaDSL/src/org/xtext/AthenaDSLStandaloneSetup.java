/*****************************************************************************
 * This code allows to trigger generation without a specific registration to equinox database
 * 
 * Copyright (c) 2013 Dassault Aviation.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Stephane Millet (Dassault Aviation) stephane.millet@dassault-aviation.com - Initial implementation
 *  Nicolas Brodnan (Dassault Aviation) nicolas.brodnan@gmail.com - update due to update of athena grammar
 *****************************************************************************/


package org.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AthenaDSLStandaloneSetup extends AthenaDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new AthenaDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

