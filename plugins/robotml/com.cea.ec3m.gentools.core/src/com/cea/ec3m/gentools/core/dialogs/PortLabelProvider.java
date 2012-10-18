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

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Port;

/**
 * A label provider for either UML or FCM ports
 * 
 * @author ansgar
 * 
 */
public class PortLabelProvider extends LabelProvider implements ITableLabelProvider {

	/**
	 * small helper function: simply retrieval of port (element might be either a port or an FCM port)
	 * 
	 * @param element
	 * @return
	 */
	private Port getUMLport(Object element) {
		if(element instanceof FCM.Port) {
			FCM.Port port = (FCM.Port)element;
			if(port != null) {
				return port.getBase_Port();
			}
		} else if(element instanceof Port) {
			return (Port)element;
		}
		return null;
	}

	public String getText(Object element) {
		Port umlPort = getUMLport(element);
		if(umlPort != null) {
			return umlPort.getName();
		}
		return "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object element, int columnIndex) {
		if(columnIndex == 0) {
			return getText(element);
		} else if(columnIndex == 1) {
			Port umlPort = getUMLport(element);
			if(umlPort != null) {
				return umlPort.getType().getName();
			}
		}
		return "";
	}

	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
};
