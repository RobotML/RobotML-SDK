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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLEditPartProvider;
import org.eclipse.papyrus.robotml.diagram.architecture.edit.part.ArchitectureDiagramEditPart;


public class InheritedCompositeDiagramEditPartProvider extends UMLEditPartProvider {

	@Override
	public synchronized boolean provides(IOperation operation) {
		if(operation instanceof CreateGraphicEditPartOperation) {
			View view = ((IEditPartOperation)operation).getView();

			// Ensure current diagram is a Architecture Diagram
			if(!ArchitectureDiagramEditPart.DIAGRAM_ID.equals(view.getDiagram().getType())) {
				return false;
			}

			// Test supported inherited types
			EObject eobject = view.getElement();

			/** Nodes (and ChildLabelNodes) *********** */
			if(eobject instanceof org.eclipse.uml2.uml.Class) {
				return true;
			}
			if(eobject instanceof org.eclipse.uml2.uml.Port) {
				return true;
			}
			if(eobject instanceof org.eclipse.uml2.uml.Property) {
				return true;
			}
			if(eobject instanceof org.eclipse.uml2.uml.Comment) {
				return true;
			}
			if(eobject instanceof org.eclipse.uml2.uml.Constraint) {
				return true;
			}

			/** Edges *********** */
			if(eobject instanceof org.eclipse.uml2.uml.Connector) {
				return true;
			}


			// Additional test needed here to decide whether to support Feature type links.
			// As feature type link are not related to a MetaClass from the domain model
			// they are not already handled by previous tests.
			String hint = view.getType();

			/** Edges (Feature) : CONSTRAINT_CONSTRAINED_ELEMENT *********** */
			if(ArchitectureDiagramElementTypes.CONSTRAINT_CONSTRAINED_ELEMENT.getSemanticHint().equals(hint)) {
				return true;
			}
			/** Edges (Feature) : COMMENT_ANNOTATED_ELEMENT *********** */
			if(ArchitectureDiagramElementTypes.COMMENT_ANNOTATED_ELEMENT.getSemanticHint().equals(hint)) {
				return true;
			}
		}
		return false;
	}
}
