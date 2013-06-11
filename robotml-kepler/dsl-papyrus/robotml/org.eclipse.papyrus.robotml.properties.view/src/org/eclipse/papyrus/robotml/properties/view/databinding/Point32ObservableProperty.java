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
package org.eclipse.papyrus.robotml.properties.view.databinding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.core.databinding.observable.value.ValueDiff;
import org.eclipse.papyrus.uml.properties.datatype.StringDataTypeObservableValue;

public class Point32ObservableProperty extends AbstractObservableValue implements IChangeListener {

	private Property property;

	private StringDataTypeObservableValue dataTypeObservable;

	private String x, y, z;

	private Object oldValue;

	public Point32ObservableProperty(Property property) {
		this.property = property;
	}

	public Point32ObservableProperty(StringDataTypeObservableValue dataTypeObservable, Property property) {
		assert dataTypeObservable != null : "The DataTypeObservableObject shall not be null"; //$NON-NLS-1$
		this.dataTypeObservable = dataTypeObservable;
		dataTypeObservable.addChangeListener(this);
		this.property = property;
	}

	public Object getValueType() {
		//This is actually a float value serialized as a String
		//We don't explicitly convert the value to a float, to avoid a loss of precision
		return String.class;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	protected Object doGetValue() {
		parseValue();
		switch(property) {
		case x:
			return x;
		case y:
			return y;
		case z:
			return z;
		}
		return null;
	}

	protected void parseValue() {
		Object value = dataTypeObservable.getValue();
		if(value == null) {
			x = y = z = "0";
			return;
		}

		if(value instanceof String) {
			String stringValue = (String)value;
			//DataType pattern : [x, y, z], with x, y and z represented as floats ; e.g. [123.456, 123, .456]
			String floatPattern = "([0-9]*(\\.[0-9]*)?)"; //The pattern for a single float value. It should match :
			//123.456
			//.456
			//123
			//Currently, it also matches the void string

			String stringPattern = String.format("\\[%s,\\s*%s,\\s*%s\\]", floatPattern, floatPattern, floatPattern);

			Pattern pattern = Pattern.compile(stringPattern);
			Matcher matcher = pattern.matcher(stringValue);
			if(matcher.matches()) {
				String xValue = matcher.group(1);
				String yValue = matcher.group(3);
				String zValue = matcher.group(5);

				x = parse(xValue);
				y = parse(yValue);
				z = parse(zValue);
			}
		}
	}

	private String parse(String stringValue) {
		try {
			Float.parseFloat(stringValue);
			return stringValue;
		} catch (NumberFormatException ex) {
			return ""; //$NON-NLS-1$
		}
	}

	@Override
	protected void doSetValue(Object value) throws NumberFormatException {
		if(value instanceof String) {
			String stringValue = (String)value;

			Float.parseFloat(stringValue); //Validation test

			switch(property) {
			case x:
				oldValue = x = stringValue;
				break;
			case y:
				oldValue = y = stringValue;
				break;
			case z:
				oldValue = z = stringValue;
				break;
			}
			dataTypeObservable.setValue("[" + x + ", " + y + ", " + z + "]");
		}
	}

	public enum Property {
		x, y, z
	}

	public void handleChange(ChangeEvent event) {
		final Object previousValue = oldValue;
		parseValue();
		final Object newValue = doGetValue();
		fireValueChange(new ValueDiff() {

			@Override
			public Object getOldValue() {
				return previousValue;
			}

			@Override
			public Object getNewValue() {
				return newValue;
			}

		});
	}

	@Override
	public void dispose() {
		dataTypeObservable.removeChangeListener(this);
		super.dispose();
	}

}
