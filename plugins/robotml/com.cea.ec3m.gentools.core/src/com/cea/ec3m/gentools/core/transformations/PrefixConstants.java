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
package com.cea.ec3m.gentools.core.transformations;

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
