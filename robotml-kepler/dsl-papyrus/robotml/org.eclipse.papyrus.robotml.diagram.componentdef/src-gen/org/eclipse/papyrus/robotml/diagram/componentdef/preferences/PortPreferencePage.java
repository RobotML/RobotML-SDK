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

public class PortPreferencePage extends ComponentdefDiagramNodePreferencePage {

	public static String prefKey = ComponentdefDiagramEditPart.DIAGRAM_ID + "_Port";


	public PortPreferencePage() {
		super();
		setPreferenceKey(ComponentdefDiagramEditPart.DIAGRAM_ID + "_Port"); //$NON-NLS-1$
	}

	public static void initDefaults(IPreferenceStore store) {
		store.setDefault(PreferenceConstantHelper.getElementConstant(prefKey, PreferenceConstantHelper.WIDTH), 20);
		store.setDefault(PreferenceConstantHelper.getElementConstant(prefKey, PreferenceConstantHelper.HEIGHT), 20);
	}

}
