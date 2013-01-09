package org.eclipse.robotml.generators.acceleo.mmqueries;

import java.util.LinkedList;
import java.util.List;
import java.io.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

public class DeploymentQueries {
	/**
	 * Return the list of instance specifications in a model
	 * @param model
	 * @return A list of InstanceSpecification of all instance specifications
	 */
	static public List<InstanceSpecification> getInstanceSpecificationsInModel(Model model) {
		LinkedList<InstanceSpecification> found_elts = new LinkedList<InstanceSpecification>();
		for (Element ne : model.getOwnedElements()) {
			if (ne instanceof NamedElement) {
				if (ne instanceof org.eclipse.uml2.uml.InstanceSpecification) {
					found_elts.add((InstanceSpecification)ne);
					//System.out.println("Instance : "+((NamedElement) ne).getName());
				}else if(ne instanceof org.eclipse.uml2.uml.Package){
					found_elts.addAll(getInstanceSpecificationsInPackage((org.eclipse.uml2.uml.Package)ne));
				}	
			} else if (ne instanceof Model) {
				found_elts.addAll(getInstanceSpecificationsInModel((Model)ne));
			}
		}
//		if(found_elts.isEmpty()){
//			System.out.println("Instances list empty");
//		}
		return found_elts;
	}
	
	/**
	 * Return the list of instance specifications in a package
	 * @param pack
	 * @return A list of InstanceSpecification of all instance specifications
	 */
	static public List<InstanceSpecification> getInstanceSpecificationsInPackage(org.eclipse.uml2.uml.Package pack) {
		LinkedList<InstanceSpecification> found_elts = new LinkedList<InstanceSpecification>();
		for (Element ne : pack.getOwnedElements()) {
			if (ne instanceof NamedElement) {
				if (ne instanceof org.eclipse.uml2.uml.InstanceSpecification) {
					found_elts.add((InstanceSpecification)ne);
					
					//System.out.println("Instance : " + ((NamedElement)ne).getName());
					
				}else if(ne instanceof org.eclipse.uml2.uml.Package){
					found_elts.addAll(getInstanceSpecificationsInPackage((org.eclipse.uml2.uml.Package)ne));
				}	
			} else if (ne instanceof Model) {
				found_elts.addAll(getInstanceSpecificationsInModel((Model)ne));
			}
		}
		return found_elts;
	}
	
	/**
	 * Return the parent name of an instance
	 * @param inst
	 * @return Parent name of an instance
	 */
	static public java.lang.String getParentName(InstanceSpecification inst)
	{
		String name = inst.getName();
				
		Integer idx = name.lastIndexOf('.'); 
		if(idx!=-1)
		{
			return name.substring(0, idx);
		}else{
			return null;
		}
	}
	
	/**
	 * Get real instance from InstanceSpecification object
	 * @param model
	 * @param instanceSpecification
	 * @return the instance if found, or else null 
	 */
	static public Property getInstance(Model model, InstanceSpecification instanceSpecification)
	{	
		List<org.eclipse.uml2.uml.Property> l = ArchitectureQueries.getAllSubComponentsInClass(ArchitectureQueries.getRootClassForModel(model)); 
		
		for(Property p : l)
		{
			String[] str = instanceSpecification.getName().split("\\.");
			
			if(str.length > 0 && p.getName().equals(str[str.length-1]))
			{
				return p;
			}
		}
		
		return null;
	}
	
	/**
	 * Function to know if the instance must be generated by the platform or not. 
	 * @param instanceSpecification
	 * @param platformName
	 * @return true if the instance is allocated to the platform which name is given in parameter 
	 */
	static public Boolean isAllocatedTo(InstanceSpecification instanceSpecification, String platformKind)
	{
		for(Dependency d : instanceSpecification.getClientDependencies())
		{
			if(d.getName().equals(platformKind))
				return true;
		}
		
		return false;
	}
}

