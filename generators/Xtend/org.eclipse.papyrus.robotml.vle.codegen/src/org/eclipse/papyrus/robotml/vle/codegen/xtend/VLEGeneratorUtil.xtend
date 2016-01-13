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

class VLEGeneratorUtil {
	
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
}