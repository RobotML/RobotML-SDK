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
package org.eclipse.papyrus.robotml.diagram.interfacedef.edit.part;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.robotml.diagram.interfacedef.edit.policy.InterfaceDefDragDropEditPolicy;
import org.eclipse.papyrus.uml.diagram.clazz.custom.policies.RemoveOrphanViewPolicy;
import org.eclipse.papyrus.uml.diagram.clazz.edit.policies.ModelItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.DuplicatePasteEditPolicy;

public class InterfaceDefEditPart extends DiagramEditPart {

	public final static String DIAGRAM_ID = "InterfaceDef"; //$NON-NLS-1$

	public InterfaceDefEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(DuplicatePasteEditPolicy.PASTE_ROLE, new DuplicatePasteEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ModelItemSemanticEditPolicy());
		installEditPolicy("RemoveOrphanView", new RemoveOrphanViewPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new InterfaceDefDragDropEditPolicy());
	}
}
