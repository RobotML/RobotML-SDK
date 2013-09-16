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
package org.eclipse.papyrus.robotml.deployment.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.papyrus.robotml.deployment.core.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class represents the EC3M preference page
 * <p>
 * This page is used to modify preferences only. They are stored in the preference store that belongs to the main plug-in class. That way, preferences
 * can be accessed directly via the preference store.
 */

public class EC3MPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public EC3MPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("eC3M options");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(
			EC3MPreferenceConstants.P_SHOW_PROV_REQ_AS_PORT_ICONS,
			"&Show icons associated with derived provided/required interfaces instead of kind",
			getFieldEditorParent()));

		addField(new BooleanFieldEditor(
			EC3MPreferenceConstants.P_TREAT_NONE_AS_COMPOSITE,
			"Treat aggregation kind \"&None\" as \"Composite\"",
			getFieldEditorParent()));

		addField(new BooleanFieldEditor(
			EC3MPreferenceConstants.P_ALL_ATTRIBUTES_ARE_CONFIG_ATTRIBUTES,
			"Treat all attributes as configuration attributes (if false, only attributes of abstract classes and attributes explicitly tagged as FCM::ConfigurationProperty will be considered as configuration attribute",
			getFieldEditorParent()));

		addField(new StringFieldEditor(
			EC3MPreferenceConstants.P_CODE_GEN_PREFIX,
			"Code generation prefix: ", getFieldEditorParent()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
}
