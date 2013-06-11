package org.eclipse.papyrus.robotml.diagram.common.editpolicies;



import org.eclipse.papyrus.uml.diagram.composite.custom.edit.policies.PropertyLabelEditPolicy;
import org.eclipse.papyrus.uml.tools.utils.ICustomAppearence;


public class CustomPropertyLabelEditPolicy extends
PropertyLabelEditPolicy {
	

	public final static int DEFAULT_ROBOTML_PROPERTY = ICustomAppearence.DISP_NAME | ICustomAppearence.DISP_TYPE ;
	
	@Override
	public int getDefaultDisplayValue() {
		// TODO Auto-generated method stub
		return DEFAULT_ROBOTML_PROPERTY;
	}
	
//	@Override
//	public int getCurrentDisplayValue() {
//		// TODO Auto-generated method stub
//		 return DEFAULT_ROBOTML_PROPERTY;
//	}



}
