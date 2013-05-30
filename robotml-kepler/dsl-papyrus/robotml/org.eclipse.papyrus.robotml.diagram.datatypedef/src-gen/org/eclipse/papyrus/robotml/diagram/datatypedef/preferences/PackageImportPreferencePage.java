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
package org.eclipse.papyrus.robotml.diagram.datatypedef.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.robotml.diagram.datatypedef.edit.part.DatatypeDefEditPart;

public class PackageImportPreferencePage extends DatatypeDefLinkPreferencePage {

	public static String prefKey = DatatypeDefEditPart.DIAGRAM_ID + "_PackageImport";

	public PackageImportPreferencePage() {
		super();
		setPreferenceKey(DatatypeDefEditPart.DIAGRAM_ID + "_PackageImport"); //$NON-NLS-1$
	}

	public static void initDefaults(IPreferenceStore store) {

	}
}
