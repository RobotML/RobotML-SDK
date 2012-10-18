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
package org.eclipse.papyrus.robotml.diagram.componentdef.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.PreferenceConstantHelper;
import org.eclipse.papyrus.robotml.diagram.componentdef.edit.part.ComponentdefDiagramEditPart;

public class PropertyPreferencePage extends ComponentdefDiagramNodePreferencePage {

	public static String prefKey = ComponentdefDiagramEditPart.DIAGRAM_ID + "_Property";

	/**
	 * the list of the compartments for this node
	 */
	public static final String compartments[] = { "PropertyPartCompartment" };

	public PropertyPreferencePage() {
		super();
		setPreferenceKey(ComponentdefDiagramEditPart.DIAGRAM_ID + "_Property"); //$NON-NLS-1$
	}

	public static void initDefaults(IPreferenceStore store) {
		// set the true value for the compartment visibility
		for(String name : compartments) {
			String preferenceName = PreferenceConstantHelper.getCompartmentElementConstant(prefKey, name, PreferenceConstantHelper.COMPARTMENT_VISIBILITY);
			store.setDefault(preferenceName, true);
		}
	}

	/**
	 * 
	 * @see org.eclipse.papyrus.preferences.pages.AbstractPapyrusNodePreferencePage#initializeCompartmentsList()
	 * 
	 */
	@Override
	protected void initializeCompartmentsList() {
		for(String name : compartments) {
			this.compartmentsList.add(name);
		}
	}
}
