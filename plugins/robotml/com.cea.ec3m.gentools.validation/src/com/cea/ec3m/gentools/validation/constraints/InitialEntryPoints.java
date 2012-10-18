package com.cea.ec3m.gentools.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Package;

import FCM.DeploymentPlan;

import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.deployment.BootLoaderGen;
import com.cea.ec3m.gentools.core.deployment.DepUtils;

/**
 * Verify that at exactly one blocking start routine is defined.
 * 
 * @author ansgar
 * 
 */
public class InitialEntryPoints extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx)
	{
		Package pkg = (Package)ctx.getTarget();

		DeploymentPlan cdp = StUtils.getApplication(pkg, DeploymentPlan.class);
		if(cdp != null) {
			InstanceSpecification initIS = cdp.getMainInstance();
			if(initIS != null) {
				entryPoints = new BasicEList<String>();
				validate(initIS);
				if(entryPoints.size() > 1) {
					String msg = "";
					for(String entryPoint : entryPoints) {
						if(msg.length() > 0) {
							msg += ", ";
						}
						msg += entryPoint;
					}
					return ctx.createFailureStatus("The deployment plan '" + pkg.getName() + "' contains more than one start entry point: " + msg);
				}
			}
		}
		return ctx.createSuccessStatus();
	}

	public void validate(InstanceSpecification is) {
		Classifier cl = DepUtils.getClassifier(is);
		if(cl instanceof Class) {
			Class implementation = (Class)cl;
			if(BootLoaderGen.hasUnconnectedStartRoutine(null, implementation, null)) {
				entryPoints.add(implementation.getName());
			}
		}
		for(InstanceSpecification subIS : DepUtils.getContainedInstances(is)) {
			validate(subIS);
		}
	}

	private EList<String> entryPoints;
}
