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
package FCM.util;

import FCM.Connector;

/**
 * Interface used by extension point for embedding rules
 */
public interface IEmbeddingRule {
	/**
	 * Return a role binding table for a given connector
	 * @param connector the connector
	 * @return role binding table
	 */
	public FCMUtil.RoleBindingTable getRoleBindings (Connector connector);

}
