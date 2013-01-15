package org.eclipse.robotml.generators.acceleo.cycabtk.mmqueries;

import java.util.List;
import java.util.LinkedList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.robotml.generators.acceleo.mmqueries.*;

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
}
