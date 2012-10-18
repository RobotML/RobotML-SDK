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
package org.eclipse.papyrus.robotml.diagram.architecture.provider;

import org.eclipse.gef.EditPart;
import org.eclipse.papyrus.robotml.diagram.architecture.edit.policy.StereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.robotml.diagram.architecture.provider.ArchitectureDiagramEditPolicyProvider;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomArchitectureDiagramEditPolicyProvider.
 */
public class CustomArchitectureDiagramEditPolicyProvider extends ArchitectureDiagramEditPolicyProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.robotml.diagram.architecture.provider.ArchitectureDiagramEditPolicyProvider#createEditPolicies(org.eclipse.gef.EditPart)
	 */
	@Override
	public void createEditPolicies(EditPart editPart) {
		super.createEditPolicies(editPart);
		editPart.installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new StereotypeNodeLabelDisplayEditPolicy());
	}

}
