package org.eclipse.papyrus.robotml.extension.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.RobotML.Environment;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;

public class OnlyOneEnvironment extends AbstractModelConstraint {

	private static boolean _environmentDetected = false;
	
	@Override
	public IStatus validate(IValidationContext ctx) {
		
		IStatus status = ctx.createSuccessStatus();
		NamedElement elt = (NamedElement)ctx.getTarget();
		Environment environment = UMLUtil.getStereotypeApplication(elt, Environment.class);
		
		if(environment != null)
		{
			if(OnlyOneEnvironment._environmentDetected == false)
			{
				OnlyOneEnvironment._environmentDetected = true;
			}
			else
			{
				status = ctx.createFailureStatus("Model can had only one environment object");
			}
		}
		
		return status;
	}

}
