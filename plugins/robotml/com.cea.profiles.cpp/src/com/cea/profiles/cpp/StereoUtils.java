/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 *
 *****************************************************************************/

package com.cea.profiles.cpp;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;


/**
 * Stereotype related utilities
 */
public class StereoUtils {

	/**
	 * Is a certain stereotype applied?
	 * 
	 * @param element
	 * @param stereotype
	 *        fully qualified stereotype name
	 * @return
	 */
	public static boolean hasStereotype(Element element, String stereotName) {
		return element.getAppliedStereotype(stereotName) != null;
	}

	/**
	 * Is a certain stereotype applied?
	 * 
	 * @param element
	 * @param stereotype
	 *        fully qualified stereotype name
	 * @return
	 */
	public static void setStereotype(Element element, String stereotName, boolean apply) {
		Stereotype stereotype = element.getApplicableStereotype(stereotName);
		if(stereotype != null) {
			if(apply) {
				if(!element.isStereotypeApplied(stereotype)) {
					element.applyStereotype(stereotype);
				}
			} else {
				if(element.isStereotypeApplied(stereotype)) {
					element.unapplyStereotype(stereotype);
				}
			}
		}
	}

	/**
	 * This method returns the stereotype applied to a certain element when given its name.
	 * Returns null, if a stereotype of that name does not exist.
	 * This function is quite similar to getAppliedStereotype, the difference is that it
	 * is not based on fully qualified name.
	 */
	public static String getTaggedValue(Element element, String stereo_name, String attrib_name) {
		Stereotype stereotype = element.getAppliedStereotype(stereo_name);
		if(stereotype == null) {
			return "";
		}
		Object value = element.getValue(stereotype, attrib_name);
		if(value == null) {
			return "";
		}

		if(value instanceof NamedElement) {
			return ((NamedElement)value).getName();
		} else if(value instanceof String) {
			return (String)value;
		} else {
			return value.toString();
		}
	}

	/**
	 * This method returns the stereotype applied to a certain element when given its name.
	 * Returns null, if a stereotype of that name does not exist.
	 * This function is quite similar to getAppliedStereotype, the difference is that it
	 * is not based on fully qualified name.
	 */
	public static void setTaggedValue(Element element, String stereo_name, String attrib_name, Object value) {
		Stereotype stereotype = element.getAppliedStereotype(stereo_name);
		if(stereotype != null) {
			element.setValue(stereotype, attrib_name, value);
		}
	}
}
