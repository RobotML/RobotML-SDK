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
package com.cea.ec3m.gentools.core.dialogs;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

public class InstanceLabelProvider extends LabelProvider {

	public String getText(Object element) {
		if (element instanceof NamedElement) {	
			String instanceName = ((NamedElement)element).getName();
			Element owner = ((Element) element).getOwner();
			if (owner instanceof NamedElement) {
				return "Plan " + ((NamedElement) owner).getName() + ": " + instanceName;
			}
			else {
				return instanceName; 
			}
		}
		else {
			return "not a named element";
		}
	}
};
