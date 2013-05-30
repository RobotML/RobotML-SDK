package org.eclipse.papyrus.robotml.diagram.common.editpolicies;

import org.eclipse.papyrus.uml.diagram.common.Activator;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

// TODO: Auto-generated Javadoc
/**
 * The Class StereotypeNodeLabelDisplayEditPolicy forces the display if the stereotype icons of all the nodes of robotml diagrams
 */
public class StereotypeNodeLabelDisplayEditPolicy extends
		AppliedStereotypeNodeLabelDisplayEditPolicy {
	
	/* (non-Javadoc)
	 * @see org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy#stereotypeIconToDisplay()
	 */
	@Override
	public Image stereotypeIconToDisplay() {

		// retrieve the first stereotype in the list of displayed stereotype
		if(getUMLElement() instanceof Element) {
			if(getUMLElement().getAppliedStereotypes().size()>0){
				Stereotype stereotypesToDisplay = getUMLElement().getAppliedStereotypes().get(0);
				return Activator.getIconElement(getUMLElement(), stereotypesToDisplay, false);

			}
		}
		return null;


	}

}
