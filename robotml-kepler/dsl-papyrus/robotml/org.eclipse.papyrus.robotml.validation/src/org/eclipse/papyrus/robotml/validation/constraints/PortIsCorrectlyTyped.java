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
package org.eclipse.papyrus.robotml.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.RobotML.DataFlowPort;
import org.eclipse.papyrus.RobotML.ServicePort;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

public class PortIsCorrectlyTyped extends AbstractModelConstraint {

	

	@Override
	public IStatus validate(IValidationContext ctx) {
		Port elt = (Port)ctx.getTarget();
		//1. verify if the port is typed
		if(elt.getType() == null) {
			return ctx.createFailureStatus("Port should have a type (" + elt.getQualifiedName() + ")");
		} else {//2. verify if the port is correctly typed
			ServicePort serviceport = UMLUtil.getStereotypeApplication(elt, ServicePort.class);			
			if(serviceport != null) {
				if(!(elt.getType() instanceof Interface)) {
					
					return ctx.createFailureStatus("Port should be typed by an Interface (" + elt.getQualifiedName() + ")");
				}
			} else {
				DataFlowPort flowport = UMLUtil.getStereotypeApplication(elt, DataFlowPort.class);
				if(flowport != null) {
					if(!(elt.getType() instanceof DataType)) {
						return ctx.createFailureStatus("Port should be typed by a DataType (" + elt.getQualifiedName() + ")");
					}
				}
			}
		}
		return ctx.createSuccessStatus();

	}
}
