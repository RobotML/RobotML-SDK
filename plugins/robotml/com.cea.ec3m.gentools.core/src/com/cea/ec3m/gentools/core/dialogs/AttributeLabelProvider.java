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
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

public class AttributeLabelProvider extends LabelProvider {

	public String getText(Object element) {
		if(element instanceof Property) {
			Property p = (Property)element;
			Type type = p.getType();
			return p.getClass_().getName() + "." + p.getName() + ((type != null) ?
				" : " + type.getQualifiedName() :
				"");
		}
		else {
			return "invalid";
		}
	}
};
