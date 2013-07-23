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

import org.eclipse.core.databinding.observable.IObservable;

import org.eclipse.papyrus.robotml.properties.view.databinding.LaserScanObservableProperty;
import org.eclipse.papyrus.robotml.properties.view.databinding.Point32ObservableProperty;
import org.eclipse.papyrus.uml.properties.datatype.StringDataTypeObservableValue;
import org.eclipse.papyrus.views.properties.modelelement.AbstractModelElement;

public class DataTypeModelElement extends AbstractModelElement {

	private final StringDataTypeObservableValue dataTypeObservable;


	public DataTypeModelElement(StringDataTypeObservableValue sourceElement) {

		this.dataTypeObservable = sourceElement;
	}

	
	@Override
	protected IObservable doGetObservable(String propertyPath) {
		//if there are other datatypes, I have to test sourceElement.getEStructuralFeature().getEType().getName()
		//and return the corresponding observable
		String propertyTypeName = dataTypeObservable.getEStructuralFeature().getEType().getName();
		
		if(propertyTypeName.equals("Point32")) {
			return new Point32ObservableProperty(dataTypeObservable, Point32ObservableProperty.Property.valueOf(propertyPath));
		} else if(propertyTypeName.equals("LaserScan")) {

			return new LaserScanObservableProperty(dataTypeObservable, LaserScanObservableProperty.Property.valueOf(propertyPath));
		}


		return null;
	}
}
