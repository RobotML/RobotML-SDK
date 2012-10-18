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
package com.cea.ec3m.gentools.core.acceleo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class StateService {

	/**
	 * return a list of events associated with a certain stereotype attribute
	 * TODO: implementation quite unsafe. Used by ignoredEvents (Acceleo) => use function that
	 *  is better suited?
	 * @param st
	 *        stereotype
	 * @param tagname
	 *        the name of the stereotype attribute
	 */
	public List<String> getvalue(Element state, Stereotype st, String tagname) {

		List<String> iEvents = new LinkedList<String>();
		List currentIEvents = (List)state.getValue(st, tagname); // get value returns an object,  we cast it to a list
		if(currentIEvents != null) {
			Iterator cIEventsIt = currentIEvents.iterator();
			while(cIEventsIt.hasNext()) {
				String ieName = (String)cIEventsIt.next();
				iEvents.add(ieName);
			}
		}
		return iEvents;
	}
}
