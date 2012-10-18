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

package org.eclipse.papyrus.robotml.diagram.architecture.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.robotml.diagram.architecture.edit.part.ArchitectureDiagramEditPart;

public class CommentPreferencePage extends ArchitectureDiagramNodePreferencePage {

	public static String prefKey = ArchitectureDiagramEditPart.DIAGRAM_ID + "_Comment";


	public CommentPreferencePage() {
		super();
		setPreferenceKey(ArchitectureDiagramEditPart.DIAGRAM_ID + "_Comment"); //$NON-NLS-1$
	}

	public static void initDefaults(IPreferenceStore store) {
	}

}
