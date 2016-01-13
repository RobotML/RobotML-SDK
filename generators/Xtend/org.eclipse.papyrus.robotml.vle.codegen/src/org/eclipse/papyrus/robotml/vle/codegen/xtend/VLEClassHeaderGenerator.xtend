package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.uml2.uml.Operation
import org.eclipse.emf.common.util.EList
import java.util.Hashtable
import java.util.List
import java.util.ArrayList

import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEGeneratorUtil;

class VLEClassHeaderGenerator {
	static def generateCode(org.eclipse.uml2.uml.Class classElt) '''
	/*******************************************/
	/*        «classElt.name» header file      */
	/*******************************************/
	
	#ifndef «classElt.name.toUpperCase()»_HEADER 
	#define «classElt.name.toUpperCase()»_HEADER
	
	«generateIncludes(classElt.superClasses)»
	
	namespace generated {
	class «classElt.name» «IF classElt.superClasses != null» «generateInheritanceDefinition(classElt.superClasses)» «ENDIF» 
	{
		/*Constructor*/
	public:
		«classElt.name»(const vd::DynamicsInit& init, const vd::InitEventList& events);
		virtual ~«classElt.name»();
	
		/*OPERATIONS MEMBERS*/
	«generationOperationForBaseClass(classElt)»
	«generateOpeartionsForChildClass(classElt)»
	«generateOperations(VLEGeneratorUtil.getOperationList(classElt.operations))»
		
		/*ATTRIBUTES MEMBERS*/
	«generateAttributes(getAttributeList(classElt.attributes))»
		
		
	}
	}
	#endif /*«classElt.name.toUpperCase()»_HEADER*/'''
	
	static def generateIncludes(EList<org.eclipse.uml2.uml.Class> clazzList) '''
	«IF clazzList != null»
	«FOR clazz : clazzList»
#include "«clazz.name».h"
	«ENDFOR»
	«ELSE»
#include <vle/devs.Dynamics.hpp>
namespace vd = vle::devs;
	«ENDIF»
	'''
	
	static def generateInheritanceDefinition(EList<org.eclipse.uml2.uml.Class> clazzList) '''
	«IF clazzList.isEmpty() == false»
: «FOR clazz : clazzList»public «clazz.name»«ENDFOR»
	«ELSE»
: public vd::Dynamics
	«ENDIF»'''
	
	static def generateAttribute(org.eclipse.uml2.uml.Property attr) '''
	«attr.type.name» «attr.name»;'''
	
	static def Hashtable<String, List<org.eclipse.uml2.uml.Property>> getAttributeList(EList<org.eclipse.uml2.uml.Property> attrs) {
		var attrMap = new Hashtable<String, List<org.eclipse.uml2.uml.Property>>();
		for(attr : attrs) {
			var visibilityKind = VLEGeneratorUtil.convertVisibility(attr.visibility);
			if(attrMap.contains(visibilityKind) == false) {
				attrMap.put(visibilityKind, new ArrayList<org.eclipse.uml2.uml.Property>());
			}
			attrMap.get(visibilityKind).add(attr);
		}
		return attrMap;
	}
	
	
	
	static def generateOperations(Hashtable<String, List<Operation>> opMap)'''
	«FOR kind : opMap.keySet»
«kind»: 
	«FOR op : opMap.get(kind)»
	«generateOperation(op)»
	«ENDFOR»
	«ENDFOR»'''
	
	static def generateAttributes(Hashtable<String, List<org.eclipse.uml2.uml.Property>> attrs) '''
	«FOR kind : attrs.keySet»
«kind»:
	«FOR attr : attrs.get(kind)»
	«generateAttribute(attr)»
	«ENDFOR»
	«ENDFOR»'''
	
	static def generateOperation(org.eclipse.uml2.uml.Operation op) '''
	«VLEGeneratorUtil.generateReturnParameter(op.outputParameters)» «op.name»(«VLEGeneratorUtil.generateParameters(VLEGeneratorUtil.getPrameterList(op.inputParameters, op.outputParameters).values)»);'''
	
	static def generationOperationForBaseClass(org.eclipse.uml2.uml.Class classElt)'''
	«IF classElt.superClasses.isEmpty == true»
public: 
	virtual vd::Time init(const vd::time& time);
	virtual void output(const vd::Time& time, vd::ExternalEventList& output) const; 
	virtual void internalTransition(const vd::Time& time); 
	virtual void externalTransition(const vd::ExternalEventList& eventList, const vd::Time& time); 
	virtual vv::Value* observation(const vd::ObservationEvent& event) const;
	virtual vd::Time timeAdvance() const;
	
protected:
	virtual void doInit(const vd::Time& time) = 0;
	virtual void doOuput(const vd::Time& time, vd::ExternalEventList& output) = 0;
	«ENDIF»'''
	
	static def generateOpeartionsForChildClass(org.eclipse.uml2.uml.Class classElt)'''
	«IF classElt.superClasses.isEmpty == false»
protected:
	virtual void doInit(const vd::Time& time);
	virtual void doOuput(const vd::Time& time, vd::ExternalEventList& output);
	«ENDIF»'''
	
}