package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.uml2.uml.VisibilityKind
import org.eclipse.emf.common.util.EList
import org.eclipse.uml2.uml.Parameter
import org.eclipse.uml2.uml.ParameterDirectionKind
import java.util.Hashtable
import java.util.Collection
import java.util.List
import org.eclipse.uml2.uml.Operation
import java.util.ArrayList
import org.eclipse.uml2.uml.StateMachine
import org.eclipse.uml2.uml.Vertex
import org.eclipse.uml2.uml.Region
import org.eclipse.uml2.uml.Transition
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.Enumeration
import org.eclipse.uml2.uml.Stereotype
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.util.UMLUtil
import org.eclipse.emf.ecore.EObject
import RobotMLExtension.Map
import RobotMLExtension.Vector
import RobotMLExtension.BasicType
import RobotMLExtension.Array
import RobotMLExtension.Alias
import RobotMLExtension.Define
import RobotMLExtension.Union

class VLEGeneratorUtil<T> {
	
	static def List<String> getListInheritance(org.eclipse.uml2.uml.Class clazz){
		var list = new ArrayList<String>();
		if(clazz.superClasses != null){
			for(org.eclipse.uml2.uml.Class parentClass : clazz.superClasses){
				list.add(parentClass.name);	
			}
		}
		else {
			list.add("vd::Dynamics");
		}
		
		var behavior = clazz.classifierBehavior; 
		if(behavior != null) {
			if(behavior instanceof StateMachine) {
				var stateMachine = behavior as StateMachine;
				list.add("I" + clazz.name + "_" + stateMachine.name);
			}
		}
		
		return list;
	}
	
	static def boolean HasStateMachine(org.eclipse.uml2.uml.Class clazz)
	{
		var result = false;
		if(clazz.classifierBehavior != null)
		{
			result = (clazz.classifierBehavior instanceof StateMachine);
		}
		else
		{
			for(supClazz : clazz.superClasses) 
			{
				if(result == false)
				{
					result = HasStateMachine(supClazz);
				}
			}
		}
		return result;
	}
	
	static def StateMachine GetStateMachine(org.eclipse.uml2.uml.Class clazz)
	{
		if(clazz.classifierBehavior != null)
		{
			if(clazz.classifierBehavior instanceof StateMachine)
			{
				return (clazz.classifierBehavior as StateMachine);
			}
		}
		
		for(supClazz : clazz.superClasses) 
		{
			var obj = GetStateMachine(supClazz);
			if(obj != null)
			{
				return (obj as StateMachine); 
			}
		}	
		
		return null;
	}
	
	static def Hashtable<String, List<Operation>> getOperationList(EList<Operation> ops) {
		val opMap = new Hashtable<String, List<Operation>>();
		
		for(op : ops){
			var String visibilityKind = convertVisibility(op.visibility);
			if(opMap.containsKey(visibilityKind) == false) {
				opMap.put(visibilityKind, new ArrayList<Operation>());
			}
			opMap.get(visibilityKind).add(op);
		}
		
		return opMap;
	}
	
	static def String convertVisibility(VisibilityKind kind) {
		var String visibilityKind;
		switch kind {
			case VisibilityKind.PUBLIC: visibilityKind = "public"
			case VisibilityKind.PUBLIC_LITERAL: visibilityKind = "public"
			case VisibilityKind.PRIVATE: visibilityKind = "private"
			case VisibilityKind.PRIVATE_LITERAL: visibilityKind = "private"
			case VisibilityKind.PROTECTED: visibilityKind = "protected"
			case VisibilityKind.PROTECTED_LITERAL: visibilityKind = "protected"
			default:
			visibilityKind = "public"
		}
		return visibilityKind;
	}
	
	static def generateReturnParameter(EList<Parameter> params) '''
	«getReturnType(params)»'''
	
	static def String getReturnType(EList<Parameter> params) {
		for(Parameter param : params)
			if(param.direction.equals(ParameterDirectionKind.RETURN) ||	param.direction.equals(ParameterDirectionKind.RETURN_LITERAL))
				return param.type.name;
			
		return "void";
	}
	
	static def Hashtable<String, Parameter> getPrameterList(EList<Parameter> input, EList<Parameter>output) {
		val Hashtable<String, Parameter> paramMap = new Hashtable<String, Parameter>();
		for(Parameter param : input) 
		{
			paramMap.put(param.name, param);
		}
		
		for(Parameter param : output) {
			if(param.direction.equals(ParameterDirectionKind.RETURN) == false &&
				param.direction.equals(ParameterDirectionKind.RETURN_LITERAL) == false) {
				if(paramMap.containsKey(param.name) == false) {
					paramMap.put(param.name, param);
				}
			}
		}
		
		return paramMap;
	}
	
	static def generateParameters(Collection<Parameter> params) '''
	«IF params.empty == false»«FOR param : params»«generateParameter(param)»«IF params.last.equals(param)== false»,«ENDIF»«ENDFOR»«ENDIF»'''
	
	static def generateParameter(Parameter param) '''
	«IF param.direction == ParameterDirectionKind.INOUT || param.direction == ParameterDirectionKind.INOUT_LITERAL»«param.type.name»& «param.name»«ELSEIF param.direction == ParameterDirectionKind.OUT || param.direction == ParameterDirectionKind.OUT_LITERAL»«param.type.name»& «param.name»«ELSEIF param.direction == ParameterDirectionKind.IN || param.direction == ParameterDirectionKind.IN_LITERAL»const «param.type.name»& «param.name»«ELSE»s/*«param.direction.name()»*/const «param.type.name»& «param.name»«ENDIF»'''
	
	static def List<Transition> getTransition(StateMachine smElt) {
		var transitionList = new ArrayList<Transition>();
		for(Region region : smElt.regions) {
			for(Transition transition : region.transitions) {
				transitionList.add(transition);
			}	
		}
		return transitionList;
	}
	
	static def List<Vertex> getStates(StateMachine smElt){
		var statesList = new ArrayList<Vertex>();
		for(Region region : smElt.regions){
			for(Vertex state : region.subvertices){
				statesList.add(state);
			}
		}
		return statesList;
	}
	
	static def List<org.eclipse.papyrus.RobotML.State> getRobotMLStates(StateMachine smeElt) {
		var statesList = new ArrayList<org.eclipse.papyrus.RobotML.State>();
		for(Region region : smeElt.regions) {
			for(Vertex state : region.subvertices) {
				for(Stereotype type : state.appliedStereotypes) {
					if(type instanceof org.eclipse.papyrus.RobotML.State) {
						statesList.add(type);
					}	
				}
			}
		}
		return statesList;
	}
	
	static def boolean isBasicType(DataType datatype) {
		return false;
	}
	
	static def boolean isVectorType(DataType datatype) {
		return datatype.appliedStereotypes.contains(Vector);
	}
	
	static def boolean isMapType(DataType datatype) {
		return datatype.appliedStereotypes.contains(Map);
	}
	
	static def boolean isStructuredType(DataType datatype) {
		return (datatype.attributes.length > 1);
	}
	
	static def boolean isEnumeration(DataType datatype) {
		return (datatype instanceof Enumeration);
	}
	
	static def boolean HasStereotype(NamedElement element, Class<? extends EObject> stereotype){
		return UMLUtil.getStereotypeApplication(element, stereotype) != null;
	}
	
	static def EObject GetStereotype(NamedElement element, Class<? extends EObject> stereotype) {
		return UMLUtil.getStereotypeApplication(element, stereotype);
	}
	
	static def boolean HasStereotypApplied(NamedElement element)
	{
		return HasStereotype(element, BasicType) ||
				HasStereotype(element, Map) ||
				HasStereotype(element, Vector) ||
				HasStereotype(element, Array) ||
				HasStereotype(element, Alias) ||
				HasStereotype(element, Define) ||
				HasStereotype(element, Union);
	}
	
}