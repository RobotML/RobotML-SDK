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
package com.cea.ec3m.gentools.core.deployment;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;

import com.cea.ec3m.gentools.core.transformations.Copy;
import com.cea.ec3m.gentools.core.transformations.TransformationException;

/**
 * Deploy an instance (on a certain node). This operation is specifically non recursive
 * 
 * @author ansgar
 * 
 */
public interface InstanceDeployer {

	/**
	 * Initialize the deployment
	 * 
	 * @param sat
	 *        information about source and target model
	 * @param bootloader
	 *        the bootloader generator, which will contain instance information
	 * @param node
	 *        the node onto which the allocation should be done.
	 */
	public void init(Copy sat, BootLoaderGen bootloader, InstanceSpecification node);

	/**
	 * Deploy an instance and copy the required classes into the target model.
	 * In case of a composite (assembly) class that is partially deployed on a target node
	 * (i.e. a subset of its parts is deployed on the target node, but not composite itself),
	 * this function may only partially copy the class or omit it completely.
	 * Parts and connections are not copied in the first place to take care of partially
	 * deployed composites and added when needed.
	 * Therefore, this function is also responsible for creating the part associated with the
	 * instance in the owning composite class and eventually complete connections within the
	 * composites.
	 * 
	 * @param is
	 *        an instance (UML instance specification) within the deployment plan
	 * @param composite
	 *        information about the containing composite, i.e. the composite in source
	 *        and target model as well as informations about the slot.
	 * @return the classifier modified for deployment
	 * @throws TransformationException
	 */
	public Classifier deployInstance(InstanceSpecification is) throws TransformationException;
}
