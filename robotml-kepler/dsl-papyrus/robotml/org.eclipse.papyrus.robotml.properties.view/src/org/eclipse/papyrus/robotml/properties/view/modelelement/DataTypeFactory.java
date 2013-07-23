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
package org.eclipse.papyrus.robotml.properties.view.modelelement;

import org.eclipse.papyrus.robotml.properties.view.Activator;
import org.eclipse.papyrus.uml.properties.datatype.StringDataTypeObservableValue;
import org.eclipse.papyrus.views.properties.contexts.DataContextElement;
import org.eclipse.papyrus.views.properties.modelelement.ModelElement;
import org.eclipse.papyrus.views.properties.modelelement.ModelElementFactory;


public class DataTypeFactory implements ModelElementFactory {

	public ModelElement createFromSource(Object sourceElement, DataContextElement context) {
		if(sourceElement instanceof StringDataTypeObservableValue) {
			return new DataTypeModelElement((StringDataTypeObservableValue)sourceElement);
		}

		Activator.log.warn("The sourceElement is not a DataTypeObservableValue");

		return null;
	}

}
