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

public class PrefixConstants {

	public static String getP_Prefix = "get_";

	public static String getConnQ_Prefix = "";

	public static String connectQ_Prefix = "connect_";

	@Deprecated
	public static String equivIntfPrefix = "CCM_";

	public static String attributePrefix = "";

	enum CIFvariant {
		UML, CCM
	};

	void init(CIFvariant cif) {
		if(cif == CIFvariant.UML) {
			getP_Prefix = "get_";
			// empty indicates that no getConnQ operation should be generated
			getConnQ_Prefix = "";
			connectQ_Prefix = "connect_";
			// equivIntfPrefix = "CCM_";
			attributePrefix = "";
		} else if(cif == CIFvariant.CCM) {
			getP_Prefix = "get_";
			getConnQ_Prefix = "getconnection_";
			connectQ_Prefix = "connect_";
			// equivIntfPrefix = "CCM_";
			attributePrefix = "m_";
		}
	}
};
