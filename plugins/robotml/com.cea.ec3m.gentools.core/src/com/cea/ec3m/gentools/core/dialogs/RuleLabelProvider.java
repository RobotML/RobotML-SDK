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

import FCM.ContainerRule;

/**
 * Return a label for ContainerRules. Since the name of the rule itself, is not
 * really interesting for the user, the returned name is based on the interceptor
 * (or extension)
 * 
 * @author ansgar
 * 
 */
public class RuleLabelProvider extends LabelProvider {

	public String getText(Object element) {
		if(element instanceof ContainerRule) {
			ContainerRule rule = (ContainerRule)element;
			// TODO? Add information about contained parts?
			return rule.getBase_Class().getName();
		}
		return null;
	}
};
