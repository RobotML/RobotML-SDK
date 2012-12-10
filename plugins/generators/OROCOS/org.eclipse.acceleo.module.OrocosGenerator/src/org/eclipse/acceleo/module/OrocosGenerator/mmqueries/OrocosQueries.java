/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.acceleo.module.OrocosGenerator.mmqueries;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.papyrus.RobotML.ServiceFlowKind;
import org.eclipse.papyrus.RobotML.ServicePort;
import org.eclipse.papyrus.uml.tools.utils.ElementUtil;
import org.eclipse.robotml.generators.acceleo.mmqueries.DataTypeQueries;
import org.eclipse.robotml.generators.acceleo.mmqueries.GeneralQueries;
import org.eclipse.robotml.generators.acceleo.mmqueries.ArchitectureQueries;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.generation.strategy.IAcceleoGenerationStrategy;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Vertex;

public class OrocosQueries {
	
	LinkedList<java.lang.String> propTypes = new LinkedList<String>();
	LinkedList<java.lang.String> alldata=new LinkedList<String>();
	LinkedList<java.lang.String> rttData = new LinkedList<String>();
	LinkedList<NamedElement> addedDataTypes = new LinkedList<NamedElement>();

	boolean includePort= false;
	/**
	 * Returns all the ports used in the model
	 */

	public List<Port> getAllPorts(Element elt) {
		LinkedList<Port> found_ports = new LinkedList<org.eclipse.uml2.uml.Port>();
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement && child instanceof org.eclipse.uml2.uml.Port) {
				if ((ArchitectureQueries.isAnInputPort((org.eclipse.uml2.uml.Port)child)) || (ArchitectureQueries.isAnOutputPort((org.eclipse.uml2.uml.Port)child)))  {
					Port port = (org.eclipse.uml2.uml.Port)child;
					found_ports.add(port);
				}
			}
		}
		return found_ports;
	}
	
	/**
	 * Returns the service ports of the given component
	 */
	public List<Port> getServicePort(Element elt) {
		LinkedList<Port> found_input_ports = new LinkedList<org.eclipse.uml2.uml.Port>();
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement && child instanceof org.eclipse.uml2.uml.Port) {
				if (ArchitectureQueries.isServicePort((org.eclipse.uml2.uml.Port)child)) {
					Port found_port = (org.eclipse.uml2.uml.Port)child;
					found_input_ports.add(found_port);
				}
			}
		}
		return found_input_ports;
	}
	/**
	 * Returns all the properties of the given class except ports 
	 */
	public List<Property> getProperties(Class c, Element elt) {
		LinkedList<Property> found_ports = new LinkedList<org.eclipse.uml2.uml.Property>();
		LinkedList<Property> properties = (LinkedList<Property>) ArchitectureQueries.getAllSubComponentsInClass(c);
		for (Element child : elt.getOwnedElements()) {
			if (child instanceof NamedElement					
					&& GeneralQueries.isProperty(child)
					&& (!(child instanceof org.eclipse.uml2.uml.Port))) {
				Property found_port = (org.eclipse.uml2.uml.Property)child;
				if (!(properties.contains(found_port))) 
					found_ports.add(found_port);				
			}
		}
		return found_ports;
	}

	/**
	 * 	Returns all the operations in a given class
	 */
	public List<Operation> getOperations(Class myClass) {
		return myClass.getAllOperations();
	}

	/**
	 * Returns all the operations of a given interface
	 */
	public List<Operation> getInterfaceOperations(Interface myInterface) {
		return myInterface.getAllOperations();
	}
	/**
	 * converts a given type into a cpp/Orocos type
	 */
	
	public String getNameType(Type type) {		
		String owner = ((NamedElement)type.getOwner()).getName();
		String typeName = type.getName();
		if (typeName.equals(" ")) {
			return "void";
		}
		if (owner.equals(" ")) {
			return "void";
		}
		if((owner.equals("UMLPrimitiveTypes")) ||
				(owner.equals("uml"))) {
			if (typeName.equals("Boolean"))
				return "bool";
			else
				return typeName.toLowerCase();
		}		
		if(owner.equals("ecore")) {
			String tn = typeName.substring(1).toLowerCase();

			if (tn.equals("boolean")) 
				return "bool";			
			else
				return typeName.substring(1).toLowerCase();
		}
		if (owner.contains("datatype")){
			return getParentType(type)+"::"+typeName;
		}
		return typeName;		
	}

	
	
	
	/**
	 * Returns the signature of a given operation 
	 */
	public String getOperationSignature (Operation op) {
		String res = "";
		int size = op.getOwnedParameters().size();
		if (size == 0)
			return res;

		for (int i=0; i<size - 1; i++) {
			Parameter param = op.getOwnedParameters().get(i);
			if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
				res += getNameType(param.getType()) + " " + param.getName() + ", ";
			}
		}
		Parameter param = op.getOwnedParameters().get(size-1);
		if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
			res += getNameType(param.getType()) + " " + param.getName();
		}
		return res;
	}

	/**
	 * La signature de l'operation op
	 * Juste le Type de chaque parametre
	 * @param op
	 * @return
	 */
	public String getOperationSignatureType (Operation op) {
		String res = "";
		int size = op.getOwnedParameters().size();

		int cpt = 0;
		for (Parameter param : op.getOwnedParameters()) {
			if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
				cpt = cpt + 1;
			}
		}
		if (cpt == 0) 
			return "void";

		for (int i=0; i<size - 1; i++) {
			Parameter param = op.getOwnedParameters().get(i);
			if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
				res += getNameType(param.getType()) + ", ";
			}
		}
		Parameter param = op.getOwnedParameters().get(size-1);
		if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
			res += getNameType(param.getType());
		}
		return res;
	}

	/**
	 * La liste des arguments de l'operation
	 * @param op
	 * @return
	 */
	public String getOperationSignatureName (Operation op) {
		String res = "";				
		for (Parameter param : op.getOwnedParameters()) {
			if (param.getDirection() != ParameterDirectionKind.get(ParameterDirectionKind.RETURN)) {
				res += ".arg(\"" + param.getName() + "\", \"Description of parameter : \")";
			}
		}
		return res;
	}

	/**
	 * Get root model for the current model
	 * @param model input model
	 * @return root model of this model, if not, return the model itself
	 */
	public Model getRootModel(Model model) {
		if(ArchitectureQueries.isRootModel(model))
			return model;
		else{
		for (Element ne : model.getOwnedElements()) {
			if (ne instanceof org.eclipse.uml2.uml.Model) {
				return getRootModel((org.eclipse.uml2.uml.Model)ne);
			}
		}
		}
	return null;
	}
	
	
	
	/**
	 * Le type de l'interface du service port : Requit ou Fournit 
	 * @param port
	 * @return
	 */
	public String getTypeServicePort(Port port) {		
		String res = "";
		try {
			ServicePort sp = ElementUtil.getStereotypeApplication(port, ServicePort.class);
			if (sp == null) {
				res += "null";
				return res;
			}
			if (sp.getKind() == ServiceFlowKind.REQUIRED) {
				res += "required";
				return res;
			}
			if (sp.getKind() == ServiceFlowKind.PROVIDED) {
				res += "provided";
				return res;
			}			
			return res;
		} catch (Exception e) {
			java.lang.System.out.println("EXCEPTION caught:" + e.toString());
		}
		return res;		
	}

	
	

/**
 * Checks whether the element is an operation
 */
	public Boolean isOperation(Element e) {
		return e instanceof Operation;
	}
	
	
	/**
	 * Checks whether the component is an actuator
	 */	
	public Boolean isActuator(Class myClass) {		
		for (Stereotype st : myClass.getAppliedStereotypes())				
			if (st.getName().compareTo("ActuatorSystem")==0)
				return true;				
		return false;
	}	
	
	public Boolean isConnectedActuator(java.lang.String st) {						
			if (st.compareTo("ActuatorSystem")==0)
				return true;				
		return false;
	}
	
   /**
    * Checks whether the component is a sensor	
    * 
    */
	public Boolean isSensor(Class myClass) {		
		for (Stereotype st : myClass.getAppliedStereotypes())				
			if (st.getName().equalsIgnoreCase("Sensor") || 
					st.getName().equalsIgnoreCase("SensorSystem") ||
					st.getName().equalsIgnoreCase("GpsSystem") ||
					st.getName().equalsIgnoreCase("LidarSystem") ||
					st.getName().equalsIgnoreCase("CameraSystem") )
				return true;				
		return false;
	}

		public Boolean isConnectedSensor(java.lang.String st) {						
				if (st.equals("Sensor") || 
						st.equals("SensorSystem") ||
						st.equals("GpsSystem") ||
						st.equals("LidarSystem") ||
						st.equals("CameraSystem") )
					return true;				
			return false;
		}
	
	
	/**
	 * Returns the parent type of an element
	 * 
	 */
	public String getParentType(Element e){
		String res = "";
		if(GeneralQueries.isPort(e))
		{
			Port p=(Port)e;
			NamedElement n=(NamedElement)p.getType().getOwner();
			res=n.getName();
			res=res.replaceAll(" ", "_");
			res=res.replaceAll("datatypes", "msgs");
		}
		if(GeneralQueries.isProperty(e))
		{
			Property p=(Property)e;
			NamedElement n=(NamedElement)p.getType().getOwner();
			res=n.getName();
			res=res.replaceAll(" ", "_");
			res=res.replaceAll("datatypes", "msgs");
		}
		return res;
	}

	/*public void addDataType(String s){
		dataTypes.add(s);
		return ;
	}*/
	
/*	public boolean isADataType(String s)
	{
		boolean found = false;
		for(String elt: dataTypes){
			if (elt.toString().equals(s))
				found = true;
		}
		return found;
	}*/
	/**
	 * Function to get a component's state machines
	 * @param clazz the class in which the component is described
	 * @return the list of found state machines 
	 */
	public List<StateMachine> getStateMachines (Class clazz){
		List<StateMachine> stateMachinesList = new LinkedList<StateMachine>();
		for(NamedElement element : clazz.getMembers()){
			if(element instanceof StateMachine){
				stateMachinesList.add((StateMachine) element);
			}
		}
		return stateMachinesList;
	}

	/**
	 * Function to get all states in a StateMachine
	 * @param stateMachine the state machine from which we need the states
	 * @return the list of states in this state machine
	 */
	public List<State> getStates(StateMachine stateMachine){
		List<State> stateList = new LinkedList<State>();
		for(Vertex v : stateMachine.getRegions().get(0).getSubvertices()){
			if(v instanceof State)
				stateList.add((State) v);
		}
		return stateList;
	}

	/**
	 * Function to get all transitions in a StateMachine
	 * @param stateMachine the state machine from which we need the transitions
	 * @return the list of transitions in this state machine
	 */
	public List<Transition> getTransitions(StateMachine stateMachine){
		List<Transition> transitionList = new LinkedList<Transition>();
		transitionList.addAll(stateMachine.getRegions().get(0).getTransitions());
		return transitionList;
	}

	/**
	 * Predicate to know if a state possesses entry function
	 * @param state the state in which we look
	 * @return true if there is an entry function, else false 
	 */
	public boolean hasEntry(State state){
		return state.getEntry()!=null;
	}

	/**
	 * Predicate to know if a state possesses exit function
	 * @param state the state in which we look
	 * @return true if there is an exit function, else false 
	 */
	public boolean hasExit(State state){
		return state.getExit()!=null;
	}

	/**
	 * Function to get entry function's body if written in the model
	 * @param state the state from which we get the function's body
	 * @return a string containing the body
	 */
	public String getEntry(State state){
		if(hasEntry(state)){
			return ((FunctionBehavior) state.getEntry()).getBodies().get(0);
		}else return "";
	}


	/**
	 * Function to get exit function's body if written in the model
	 * @param state the state from which we get the function's body
	 * @return a string containing the body
	 */
	public String getExit(State state){
		if(hasExit(state)){
			return  ((FunctionBehavior) state.getExit()).getBodies().get(0);
		}
		else return "";
	}

	/**
	 * Predicate to know if a transition possesses triggers
	 * @param transition the transition in which we look
	 * @return true if there is at least one trigger specified in the model, else false
	 */
	public boolean hasTriggers(Transition transition){
		return ((transition.getTriggers().size())>0);
	}

	/**
	 * Predicate to know if the specified Behavior is a state machine
	 * @param b the behavior in test
	 * @return true if this is a state machine, else false
	 */
	public boolean isFSM(Behavior b ){
		return b instanceof StateMachine;
	}

	/**
	 * Predicate to know if a state possesses a function run (doo)
	 * @param state the state in which we look
	 * @return true if there is a run function
	 */
	public boolean hasRun(State state){
		return state.getDoActivity()!=null;
	}

	/**
	 * Function to get run (doo) function's body if written in the model
	 * @param state the state from which we get the function's body
	 * @return a string containing the body
	 */
	public String getRun(State state){
		return ((FunctionBehavior)state.getDoActivity()).getBodies().get(0);
	}

	/**
	 * Function to get the LUA type corresponding to the given Type
	 * @param type the type to convert
	 * @return a string representing the type for LUA language
	 */
	public String getLUAType(Type type){
		String result="";
		String owner = ((NamedElement)type.getOwner()).getName().replace("datatypes", "msgs");
		String typeName=type.getName();
		if((owner.equals("UMLPrimitiveTypes")) ||
				(owner.equals("uml"))) {
			if(typeName.matches("(?i).*int.*")//Int, UInt, int32, uint16 and so on
					|| typeName.matches("(?i).*float.*")//float, float32 and so on
					|| typeName.matches("(?i).*double.*"))
				return "number";
			if (typeName.equals("Boolean"))
				return "bool";
			else
				return typeName.toLowerCase();
		}		
		else if(owner.equals("ecore")) {//edatatypes
			if (typeName.equals("Boolean"))
				return "bool";
			else
				return typeName.substring(1).toLowerCase();
		}	

		else {result+="/"+owner+"/";}//ros types
		result+=typeName;
		return result;

	}


	/**
	 * Function to generate variable that may be used in lua fsm
	 * for reading/writing to the component's ports
	 * @param elt the component that embeds the fsm
	 * @return the LUA string with all variable having a LUA type
	 * and a different name each
	 */
	public String generateVariables(Element elt){
		int cpt=0;
		String toReturn="";
		for(Port port : getAllPorts(elt)){
			toReturn+="local variable_"+port.getType().getName().toLowerCase()+cpt
					+"= rtt.Variable(\""+getLUAType(port.getType())+"\")\n";
			cpt++;			
		}


		return toReturn;
	}

   /**
    * This function initializes the includes of the component file with the port types, operation types and 
    * properties types
    * 
    */

/**
 * converts robotML libraries into ROS topics 	
 * 
 */
public LinkedList<java.lang.String> setDataTypesLibraries(Property elt){
	
    String res="";
	Property p=(Property)elt;
	String parentType = getParentType(p).toString();
	if(parentType.contains("std")||parentType.contains("sensor")||parentType.contains("stereo")||parentType.contains("geometry")||
		parentType.contains("nav")||parentType.contains("actionLib"))
	    res="#include<"+parentType+"/"+p.getType().getName()+".h>";
		res = res + "\n";
		if(!propTypes.contains(res))
			propTypes.add(res);
		
	return propTypes;
}
	
	
	
	
	
public LinkedList<java.lang.String> setLibraries(Element c){		
		LinkedList<Element>	allelem =new LinkedList<Element>();
		boolean includeOperation= false;
		for(Element elt: c.allOwnedElements()){
			if(!GeneralQueries.isDataType(elt))
			{
				allelem.add(elt);
			}
		}
		
		for(Element elt: allelem){

		if(GeneralQueries.isPort(elt))
		{
			if(!includePort){	
				alldata.add("#include <rtt/Port.hpp>\n");
				includePort= true;
			 }

			String res="";
			Port p=(Port)elt;
			String parentType = getParentType(p).toString();
			//ROS topics
			if(parentType.contains("std")||parentType.contains("sensor")||parentType.contains("stereo")||parentType.contains("geometry")||
				parentType.contains("nav")||parentType.contains("actionLib")){	
				res="#include<"+parentType+"/"+p.getType().getName()+".h>\n";
				res = res + "\n";
				if(!alldata.contains(res))
					alldata.add(res);
			}
			//user data type type
			/*else if(isADataType(p.getType().getName()) && !includeDataTypes){
				res = "#include"+'"'+parentType+".h"+'"';
				res = res + "\n";
				includeDataTypes = true;
			}*/	
		}
		
		if(GeneralQueries.isProperty(elt))
		{    String res="";
		Property p=(Property)elt;
		String parentType = getParentType(p).toString();
		if(parentType.contains("std")||parentType.contains("sensor")||parentType.contains("stereo")||parentType.contains("geometry")||
			parentType.contains("nav")||parentType.contains("actionLib"))
		res="#include<"+parentType+"/"+p.getType().getName()+".h>";
/*		else if(isADataType(p.getType().getName()) && !includeDataTypes){
			res = "#include"+'"'+parentType+".hpp"+'"'+"\n";
			res = res + "\n";
			includeDataTypes = true;
			if(!alldata.contains(res))
				alldata.add(res);
			}*/
		} 
		if(isOperation(elt))
		{
			if(!includeOperation)
			{	Interface I = (Interface) elt.getOwner();
				alldata.add("#include <rtt/Operation.hpp>\n");
				alldata.add("#include "+I.getName()+".h"+'"'+"\n");
				includeOperation = true;
			}
			}
		}
		return alldata;
	}

/**
 * This function initializes the includes of the ops file with the port types 
 */

public LinkedList<java.lang.String> setRttLibraries(Element c){
	/*
	LinkedList<Element>	allelem =new LinkedList<Element>();
	
	for(Element elt: c.allOwnedElements()){
		if(!GeneralQueries.isDataType(elt))
		{
			allelem.add(elt);
		}
	}
	
	for(Element elt: allelem){

	if(GeneralQueries.isPort(elt))
	{
		String res="";
		Port p=(Port)elt;
	
		String parentType = getParentType(p).toString();
		//ROS topics
		if(parentType.contains("std")||parentType.contains("sensor")||parentType.contains("stereo")||parentType.contains("geometry")||
			parentType.contains("nav")||parentType.contains("actionLib")){	
			res="import ("+'"'+"rtt_"+parentType+'"'+")\n";
			if(!rttData.contains(res))
				rttData.add(res);
		}
	
	}
	}*/
	rttData.add("import ("+'"'+"rtt_sensor_msgs"+'"'+")\n");
	rttData.add("import ("+'"'+"rtt_nav_msgs"+'"'+")\n");
	rttData.add("import ("+'"'+"rtt_geometry_msgs"+'"'+")\n");
	rttData.add("import ("+'"'+"rtt_std_msgs"+'"'+")\n");
	return rttData;
}


public DataType getPropertyDataType(Property prop) {
	Type t = prop.getType();
	if (t!= null && t instanceof DataType) {
		return (DataType)t;
	}
	return null;
}

public DataType getOperationDataType(Operation op) {
	Type t = op.getType();
	if (t!= null && t instanceof DataType) {
		return (DataType)t;
	}
	return null;
}

public boolean isGeneratedDataType(Type t){
	boolean generated = false;
	for(Element elt: addedDataTypes){
		if(((Type)elt).equals(t))
			generated = true;
	}
	if(!generated)
		addedDataTypes.add(t);
	return generated;
}


public List<NamedElement> getDataTypesInClass(Class c)
{	LinkedList<NamedElement> found_elts = new LinkedList<NamedElement>();	
	for (org.eclipse.uml2.uml.Element prop : c.getAllAttributes()) {
		java.lang.System.out.println(prop);

	if (GeneralQueries.isProperty(prop)){
		Type t = ((Property)prop).getType();
		java.lang.System.out.println(t);
		found_elts.add(t);
	}	
	
	else if (GeneralQueries.isPort(prop)){ 
		Type t = ((Port)prop).getType();
		java.lang.System.out.println(t);
		found_elts.add(t);
	}
	}
	return found_elts;
}
}