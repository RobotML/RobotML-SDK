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
package org.eclipse.papyrus.robotml.modelexplorer.query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.facet.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.emf.facet.infra.query.core.java.IJavaModelQuery;
import org.eclipse.emf.facet.infra.query.core.java.ParameterValueList;
import org.eclipse.papyrus.robotml.modelexplorer.util.ProfileUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

/** get all ports from a classifier */
public class GetOtherPropertiesQuery implements IJavaModelQuery<Classifier, Collection<Property>> {

	public Collection<Property> evaluate(final Classifier context, final ParameterValueList parameterValues) throws ModelQueryExecutionException {
		ArrayList<Property> result = new ArrayList<Property>();
		
		if (ProfileUtil.getAppliedProfile(context.getNearestPackage(),"RobotML")!= null){
		Iterator<Property> iter = context.getAllAttributes().iterator();
		while(iter.hasNext()) {
			Property currentElement = iter.next();
			if(!(currentElement instanceof Port) && !(currentElement.getType() instanceof Class)) {
				result.add((Property)currentElement);
			}
		}
		}
		return result;
	}
	
	
}
