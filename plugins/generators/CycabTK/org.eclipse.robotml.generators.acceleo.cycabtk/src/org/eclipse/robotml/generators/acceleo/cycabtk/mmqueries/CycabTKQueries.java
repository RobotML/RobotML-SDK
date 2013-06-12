package org.eclipse.robotml.generators.acceleo.cycabtk.mmqueries;

import java.util.List;
import java.util.LinkedList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.robotml.generators.acceleo.mmqueries.*;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;

public class CycabTKQueries {
	
	/**
	 * On a given class (a PROTEUS system), looks for ports with a given type type in each sub-components
	 * Recursive. 
	 */
	static public List<org.eclipse.uml2.uml.Port> getPortsWithType(org.eclipse.uml2.uml.Class c, String typeName)
	{
//		System.out.println("Entering query getPortsWithType");
//		System.out.println("class name : " + c.getName()); 
//		System.out.println("Search typeName : " + typeName);
				
		LinkedList<org.eclipse.uml2.uml.Port> ports = new LinkedList<org.eclipse.uml2.uml.Port>();	
		
		for(Property component : ArchitectureQueries.getAllSubComponentsInClass(c))
		{
			//System.out.println("component : " + component.getName());
			Type propType = component.getType();
			if (GeneralQueries.isClass(propType)) {
				for( org.eclipse.uml2.uml.Property prop :((org.eclipse.uml2.uml.Class) propType).getAllAttributes()){
					if(prop instanceof org.eclipse.uml2.uml.Port){
						//System.out.println("\tports : " + prop.getName() + " / " + prop.getType().getName());
						if (typeName.equals(prop.getType().getName())) {
							//System.out.println("\t\t tototo port : " + prop.getName() + " / " + prop.getType().getName()); 
							ports.add((Port) prop);							
						}
					}
				}
				
				//GeneralQueries.inspectClass((org.eclipse.uml2.uml.Class) propType);
				//ports.addAll(getPortsWithType((org.eclipse.uml2.uml.Class) propType, typeName));
			}
		}
//			
//		LinkedList<org.eclipse.uml2.uml.Port> ports = new LinkedList<org.eclipse.uml2.uml.Port>();	
//		for (Port p : c.getOwnedPorts()) {
//			if(p.getType().getName() ==  typeName){
//				ports.add(p);
//			}
//		}
		return ports;
	}
	
	/**
	 * Convert point characters to underscore. 
	 */
	static public String pointToUnderscore(String str)
	{
		return str.replace('.', '_');
	}
	
	
	/**
	 * Compute the cycabtk name of an instanceSpecification
	 * @param model
	 * @param inst
	 * @return
	 */
	static public String computeCycabtkInstanceName(org.eclipse.uml2.uml.Model model, org.eclipse.uml2.uml.InstanceSpecification inst)
	{
		String[] str = inst.getName().split("\\.");
		String suffix = str[str.length-1];
				
//		Boolean isValid = false;
//		for( org.eclipse.uml2.uml.Classifier classifier : inst.getClassifiers() )
//		{
//			org.eclipse.uml2.uml.Class cl = GeneralQueries.findClassInModel(model, classifier.getName());	
//			if( GeneralQueries.inheritsFrom(cl, "Robot")
//				|| GeneralQueries.inheritsFrom(cl, "RoboticSystem")	)
//			{
//				isValid = true;
//				break;
//			}
//		}
//		if(isValid)
//		{
//			String result = suffix;
//			InstanceSpecification parent = DeploymentQueries.getParentInstanceSpecification(model, inst);
//			if(parent != null )
//			{
//				String prefix = computeCycabtkInstanceName(model, parent);
//				if(prefix != null)
//				{
//					result = prefix + "." + suffix;
//				}
//			}
//			return result;
//		}
//		return null;
			
		InstanceSpecification parent = DeploymentQueries.getParentInstanceSpecification(model, inst);
		if(parent != null)
		{	
			for( org.eclipse.uml2.uml.Classifier classifier : parent.getClassifiers() )
			{
				org.eclipse.uml2.uml.Class cl = GeneralQueries.findClassInModel(model, classifier.getName());	
				if( GeneralQueries.inheritsFrom(cl, "Robot")
					|| GeneralQueries.inheritsFrom(cl, "RoboticSystem")	)
				{
					return computeCycabtkInstanceName(model, parent) + "." + suffix;
				}
			}
		}
		return suffix;
	}
}
