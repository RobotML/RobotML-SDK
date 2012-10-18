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

import java.util.ArrayList;

import org.eclipse.uml2.uml.Collaboration;

import FCM.InteractionComponent;

public class ConnectorTypeUtil {

	protected Collaboration connectionPattern = null;

	protected InteractionComponent connectorComp = null;

	protected FCMUtil.RoleBindingTable bindingTable = null;

	public FCMUtil.RoleBindingTable getRoleBindings(FCM.Connector connector) {
		if(connector.getIc() instanceof InteractionComponent) {
			connectorComp = (InteractionComponent)connector.getIc();
			connectionPattern = connectorComp.getConnectionPattern();
			bindingTable = new FCMUtil.RoleBindingTable();
			for(org.eclipse.uml2.uml.ConnectableElement role : connectionPattern.getRoles()) {
				bindingTable.addEntry(role, new ArrayList<org.eclipse.uml2.uml.NamedElement>());
			}
			return bindingTable;
		}
		return null;
	}
}
