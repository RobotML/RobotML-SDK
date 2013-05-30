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
package org.eclipse.papyrus.robotml.diagram.interfacedef.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.robotml.diagram.interfacedef.Activator;

public class InterfaceDefPreferenceInitializer extends AbstractPreferenceInitializer {

	protected IPreferenceStore getPreferenceStore() {
		return Activator.getInstance().getPreferenceStore();
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();

		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.PackagePreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.CommentPreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.ConstraintPreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.PackagePreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.InterfacePreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.InterfacePreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.DiagramPreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.PackageImportPreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.CommentAnnotatedElementPreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.ConstraintConstrainedElementPreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.PackageMergePreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.GeneralizationPreferencePage.initDefaults(store);
		org.eclipse.papyrus.robotml.diagram.interfacedef.preferences.InterfaceRealizationPreferencePage.initDefaults(store);
	}
}
