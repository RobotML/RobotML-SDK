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
package org.eclipse.papyrus.robotml.diagram.datatypedef;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.papyrus.infra.gmfdiag.common.AbstractPapyrusGmfCreateDiagramCommandHandler;
import org.eclipse.papyrus.robotml.diagram.datatypedef.edit.part.DatatypeDefEditPart;

public class DatatypeDefCreateCommand extends AbstractPapyrusGmfCreateDiagramCommandHandler {

	@Override
	protected String getDefaultDiagramName() {
		return "DataTypesDiagram";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getDiagramNotationID() {
		return DatatypeDefEditPart.DIAGRAM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected PreferencesHint getPreferenceHint() {
		return Activator.DIAGRAM_PREFERENCES_HINT;
	}
	
	public String getCreatedDiagramType() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isParentReassignable() {
		// TODO Auto-generated method stub
		return false;
	}

}
