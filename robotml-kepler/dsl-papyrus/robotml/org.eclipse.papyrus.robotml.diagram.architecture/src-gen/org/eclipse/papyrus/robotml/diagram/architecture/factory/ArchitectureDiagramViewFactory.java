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
package org.eclipse.papyrus.robotml.diagram.architecture.factory;

import org.eclipse.gmf.runtime.diagram.ui.view.factories.DiagramViewFactory;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;

public class ArchitectureDiagramViewFactory extends DiagramViewFactory {

	protected MeasurementUnit getMeasurementUnit() {
		return MeasurementUnit.PIXEL_LITERAL;
	}
}
