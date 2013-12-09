/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *
 *****************************************************************************/
package org.eclipse.papyrus.robotml.deployment.transformations;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Port;

/**
 * Return information about the current values in the context of a transformation
 * e.g. the current instance, the current port (container transformation), ...
 * 
 * @author ansgar
 * 
 */
public class TransformationContext {

	public static InstanceSpecification instance;

	public static Port port;

	public static Classifier formalParameter;

	// the element, to which transformations are currently applied.
	public static Classifier classifier;
}