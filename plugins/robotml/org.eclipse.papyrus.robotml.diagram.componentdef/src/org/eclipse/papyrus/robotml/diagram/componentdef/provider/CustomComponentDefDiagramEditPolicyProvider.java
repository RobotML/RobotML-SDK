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
package org.eclipse.papyrus.robotml.diagram.componentdef.provider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IMaskManagedLabelEditPolicy;
import org.eclipse.papyrus.robotml.diagram.common.editpolicies.CustomPropertyLabelEditPolicy;
import org.eclipse.papyrus.robotml.diagram.common.editpolicies.PortNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.robotml.diagram.common.editpolicies.StereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.robotml.diagram.componentdef.edit.part.ComponentdefDiagramEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.HyperLinkPopupBarEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.NavigationEditPolicy;
import org.eclipse.papyrus.uml.diagram.composite.custom.edit.policies.EncapsulatedClassifierResizableShapeEditPolicy;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PortEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PortNameEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PropertyPartNameEditPartCN;



public class CustomComponentDefDiagramEditPolicyProvider extends ComponentdefDiagramEditPolicyProvider {

	@Override
	public void createEditPolicies(EditPart editPart) {
		super.createEditPolicies(editPart);
		
		editPart.installEditPolicy(NavigationEditPolicy.NAVIGATION_POLICY, new NavigationEditPolicy());
		if(!(editPart instanceof ConnectionEditPart)) {
			editPart.installEditPolicy(EditPolicyRoles.POPUPBAR_ROLE, new HyperLinkPopupBarEditPolicy());
		}
		
		editPart.installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new StereotypeNodeLabelDisplayEditPolicy());
		editPart.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new EncapsulatedClassifierResizableShapeEditPolicy());

		if(editPart instanceof PortNameEditPart || editPart instanceof PropertyPartNameEditPartCN) {
			editPart.installEditPolicy(IMaskManagedLabelEditPolicy.MASK_MANAGED_LABEL_EDIT_POLICY, new CustomPropertyLabelEditPolicy());
		} else if(editPart instanceof PortEditPart) {
			NotificationListener editPolicy = new PortNodeLabelDisplayEditPolicy();
			editPart.installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, (EditPolicy)editPolicy);
			Object model = editPart.getModel();
			LayoutConstraint notifier = ((Shape)model).getLayoutConstraint();
			if(model instanceof Shape) {
				//to force the refresh the port icon when the diagram is opening
				Notification notification = new ENotificationImpl((InternalEObject)notifier, Notification.SET, NotationPackage.eINSTANCE.getLocation_X(), 0, 0);
				editPolicy.notifyChanged(notification);
			}
		}

	}

	@Override
	public boolean provides(IOperation operation) {
		// TODO Auto-generated method stub
		

			CreateEditPoliciesOperation epOperation = (CreateEditPoliciesOperation)operation;
			if(!(epOperation.getEditPart() instanceof GraphicalEditPart)) {
				return false;
			}
			GraphicalEditPart gep = (GraphicalEditPart)epOperation.getEditPart();
			String diagramType = gep.getNotationView().getDiagram().getType();
			if(!ComponentdefDiagramEditPart.DIAGRAM_ID.equals(diagramType)) {
				return false;
			}

			if(gep instanceof org.eclipse.papyrus.uml.diagram.composite.edit.parts.PortNameEditPart) {
				return true;
			}
			
			if(gep instanceof org.eclipse.papyrus.uml.diagram.composite.edit.parts.PropertyPartNameEditPartCN) {
				return true;
			}
		return super.provides(operation);
		
	}



}
