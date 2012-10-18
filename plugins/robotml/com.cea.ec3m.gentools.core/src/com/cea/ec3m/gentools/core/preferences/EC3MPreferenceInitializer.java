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
package com.cea.ec3m.gentools.core.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class EC3MPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = com.cea.ec3m.gentools.core.Activator.getDefault().getPreferenceStore();
		store.setDefault(EC3MPreferenceConstants.P_SHOW_PROV_REQ_AS_PORT_ICONS, false);
		store.setDefault(EC3MPreferenceConstants.P_ALL_ATTRIBUTES_ARE_CONFIG_ATTRIBUTES, true);
		store.setDefault(EC3MPreferenceConstants.P_TREAT_NONE_AS_COMPOSITE, true);
		store.setDefault(EC3MPreferenceConstants.P_CODE_GEN_PREFIX, "// generated with eC3M toolchain");
	}

}
