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

package com.cea.ec3m.gentools.core.extensions;

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

/**
 * Interface used by eC3M extensions that supports specific instance configurators,
 * used for containers.
 */
public interface IInstanceConfigurator {

	/**
	 * configure an instance (within a container)
	 * 
	 * @param executorIS
	 *        the instance specification of the component that is used as basis for configuring the instance
	 * @param executorPart
	 *        the property that represents the executor instance (within the source model)
	 * @param instance
	 *        the instance of an element of the container.
	 * @param port
	 *        the port within a container transformation for which the instance is used as an interceptor.
	 *        Is null for the configuration of "normal" connectors or container extensions.
	 */
	public void configureInstance(InstanceSpecification executorIS, Property executorPart, InstanceSpecification instance, Port port);
}
