package org.eclipse.papyrus.robotml.modelexplorer.query;

import org.eclipse.emf.facet.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.emf.facet.infra.query.core.java.IJavaModelQuery;
import org.eclipse.emf.facet.infra.query.core.java.ParameterValueList;
import org.eclipse.papyrus.robotml.modelexplorer.util.ProfileUtil;
import org.eclipse.uml2.uml.Element;

public class RobotMLProfileAppliedQuery implements IJavaModelQuery<Element, Boolean>{
	public static String ROBOTML_ID = "RobotML";
	public Boolean evaluate(Element context, ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		// TODO Auto-generated method stub
		if (ProfileUtil.getAppliedProfile(context.getNearestPackage(),"RobotML")!= null){
			return false;
		}
		return true;
	}

}
