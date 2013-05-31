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



public class LaserScanObservableProperty extends AbstractObservableValue implements IChangeListener {

	private  Property property;

	private StringDataTypeObservableValue dataTypeObservable;
	
	private String intensities, angle_min, angle_max, angle_incerment, time_incerement, scan_time, range_min, range_max, range;

	private Object oldValue;


	public LaserScanObservableProperty(Property property) {
		this.property = property;
	}

	public LaserScanObservableProperty(StringDataTypeObservableValue dataTypeObservable, Property property) {
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

	protected Object doGetValue() {
		parseValue();
		switch(property) {
		case intensities:
			return intensities;
		case angle_incerment:
			return angle_incerment;
		case angle_max:
			return angle_max;
		case angle_min:
			return angle_min;
		case time_incerement:
			return time_incerement;
		case scan_time:
			return scan_time;
		case range_min:
			return range_min;
		case range_max:
			return range_max;
		case range:
			return range;
		}
		return null;
	}
	protected void parseValue() {
		Object value = dataTypeObservable.getValue();
		if(value == null) {
			intensities = angle_incerment = angle_max = angle_min = time_incerement = scan_time = range = range_max = range_min = "0";
			return;
		}
		if (value instanceof String ){
			String stringValue = (String)value;
			String floatPattern = "([0-9]*(\\.[0-9]*)?)"; //The pattern for a single float value. It should match :
			String stringPattern = String.format("\\[%s,\\s*%s,\\s*%s\\]", floatPattern, floatPattern, floatPattern);
			Pattern pattern = Pattern.compile(stringPattern);
			Matcher matcher = pattern.matcher(stringValue);
			if(matcher.matches()) {
				String intensitiesValue = matcher.group(1);
				String angle_minValue = matcher.group(3);
				String angle_maxValue = matcher.group(5);
				String angle_incrementValue = matcher.group(7);
				String time_incerementValue = matcher.group(9);
				String scan_timeValue = matcher.group(11);
				String range_minValue = matcher.group(13);
				String range_maxValue = matcher.group(15);
				String rangeValue = matcher.group(17);
				intensities = parse(intensitiesValue);
				angle_min = parse(angle_minValue);
				angle_incerment=parse(angle_incrementValue);
				angle_max=parse(angle_maxValue);
				time_incerement=parse(time_incerementValue);
				scan_time=parse(scan_timeValue);
				range_min=parse(range_minValue);
				range_max=parse(range_maxValue);
				range=parse(rangeValue);
				
			}
			
		}
	}
	
	@Override
	protected void doSetValue(Object value) {
		if(value instanceof String) {
			String stringValue = (String)value;

			Float.parseFloat(stringValue); //Validation test

			switch(property) {
			case intensities:
				oldValue=intensities=stringValue;
				break;
			case angle_incerment:
				oldValue=angle_incerment=stringValue;
				break;
			case angle_max:
				oldValue = angle_max = stringValue;
				break;
			case angle_min:
				oldValue = angle_min = stringValue;
				break;
			case time_incerement:
				oldValue = time_incerement = stringValue;
				break;
			case scan_time:
				oldValue = scan_time = stringValue;
				break;
			case range_min:
				oldValue = range_min = stringValue;
				break;
			case range_max:
				oldValue = range_max = stringValue;
				break;
			case range:
				oldValue = range = stringValue;
				break;
			}
			dataTypeObservable.setValue("["+intensities + ", " + angle_min + ", " + angle_max + ", " + angle_incerment + ", " + time_incerement + ", " + scan_time+", " + range_min +", " + range_max+", " + range+ "]");
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
	public enum Property {
		intensities, angle_min, angle_max, angle_incerment, time_incerement, scan_time, range_min, range_max, range
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
