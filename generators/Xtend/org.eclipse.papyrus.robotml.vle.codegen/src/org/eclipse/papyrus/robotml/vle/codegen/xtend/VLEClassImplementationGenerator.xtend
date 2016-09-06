package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.emf.common.util.EList
import java.util.Hashtable
import java.util.List
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.StateMachine
import org.eclipse.uml2.uml.DataType
import org.eclipse.papyrus.RobotML.Transition

class VLEClassImplementationGenerator {
	
	static def generateCode(org.eclipse.uml2.uml.Class classElt)'''
#include "«classElt.name».h"

namespace generated {
	
	/*Constructor & destructor*/
	«classElt.name»::«classElt.name»(const vd::DynamicsInit& init, const vd::InitEventList& events) «generateInheritedConstructor(classElt.superClasses)»
	{
		
	}
	
	«classElt.name»::~«classElt.name»()
	{
		
	}
	
	/*Operations*/
	«generateOperationForBaseClass(classElt)»
	«generateOperationsForChildClass(classElt)»
	«generateOperationsForStateMachine(classElt)»
	«generateOperation(VLEGeneratorUtil.getOperationList(classElt.operations))»
		
}	
	'''
	
	static def generateInheritedConstructor(EList<org.eclipse.uml2.uml.Class> classList)'''
	«IF classList.isEmpty == false»: «FOR clazz : classList»«clazz.name»(init, events)«IF classList.last.equals(clazz) == false», «ENDIF»«ENDFOR»«ELSE»: vd::Dynamics(init,evnts)«ENDIF»
	'''
	
	
	static def generateOperation(Hashtable<String, List<Operation>> opMap)'''
	«FOR opList : opMap.values»«FOR op : opList»«generateOperation(op)»«ENDFOR»«ENDFOR»
	'''
	
	static def generateOperation(Operation op)'''
	«VLEGeneratorUtil.generateReturnParameter(op.outputParameters)» «op.class_.name»::«op.name»(«VLEGeneratorUtil.generateParameters(VLEGeneratorUtil.getPrameterList(op.inputParameters, op.outputParameters).values)»)
	{
		
	}
	'''
	
	static def generateOperationForBaseClass(org.eclipse.uml2.uml.Class classElt)'''
	«IF classElt.superClasses.isEmpty == true»
	vd::Time «classElt.name»::init(const vd::time& time)
	{
		TraceAlways(vu::DateTime::currentDate() + " - «classElt.name» - init");
		doInit(time);
		return vd::Time(0.0);
	}
	
	void «classElt.name»::output(const vd::Time& time, vd::ExternalEventList& output) const 
	{
		TraceAlways(vu::DateTime::currentDate() + " - «classElt.name» - output");
		doOuput(time, output);
	}
	
	void «classElt.name»::internalTransition(const vd::Time& time) 
	{
		TraceAlways(vu::DateTime::currentDate() + " - «classElt.name» - internalTransition");
	}
	
	void «classElt.name»::externalTransition(const vd::ExternalEventList& eventList, const vd::Time& time) 
	{
		TraceAlways(vu::DateTime::currentDate() + " - «classElt.name» - externalTransition");
	}
	
	vv::Value* «classElt.name»::observation(const vd::ObservationEvent& event) const {
		TraceAlways(vu::DateTime::currentDate() + " - «classElt.name» - observation");
		return vd::Dynamics::observation(event);
	}
	
	vd::Time «classElt.name»::timeAdvance() const {
		TraceAlways(vu::DateTime::currentDate() + " - «classElt.name» - timeAdvance");
		return vd::Time(1.0);
	}
	
	vd::ExternalEvent* «classElt.name»::GenerateEvent(vv::Value* pValue, std::string portName) {
		vd::ExternalEvent* pEvent = NULL
		if(pValue != NULL)
		{
			pEvent = new ExternalEvent(portName);
			pEvent << vd::attribute(portName, pValue);
			TraceModel(vu::DateTime::currentDate() + " - Output port " + portName + " is changed to " + pValue->writeToString();
		}
		return pEvent;
	}
	«ENDIF»
	''' 
	
	static def generateOperationsForChildClass(org.eclipse.uml2.uml.Class classElt)'''
	«IF classElt.superClasses.isEmpty == false»
	void «classElt.name»::doInit(const vd::Time& time)
	{
		«FOR attr : classElt.attributes»
			«IF attr.type instanceof DataType»init_«attr.type.name»(«attr.name»);«ENDIF»
		«ENDFOR»
	}
	
	void «classElt.name»::doOutput(const vd::Time& time, vd::ExternalEventList& output)
	{
		«FOR attr : classElt.attributes»
		vd::ExternalEvent* pEvent = GenerateEvent(«attr.name», "«attr.name»");
		if(pEvent != NULL)
			ouput.push_back(pEvent);
		«ENDFOR»
	}
	«ENDIF»'''
	
	static def generateOperationsForStateMachine(org.eclipse.uml2.uml.Class classElt)'''
	«IF classElt.classifierBehavior != null»
	«FOR transition : VLEGeneratorUtil.getTransition(classElt.classifierBehavior as StateMachine)»
	void «classElt.name»::doTransition_«transition.source.name»_to_«transition.target.name»(const vd::Time& time) {
		«IF VLEGeneratorUtil.HasStereotype(transition, Transition)»
			«IF (VLEGeneratorUtil.GetStereotype(transition, Transition) as Transition).guard != null»if(Guard_«(VLEGeneratorUtil.GetStereotype(transition, Transition) as Transition).guard.specification.name») {
			}
			«ENDIF»
			«IF (VLEGeneratorUtil.GetStereotype(transition, Transition) as Transition).effect != null»Effect_«(VLEGeneratorUtil.GetStereotype(transition, Transition) as Transition).effect.specification.name»;
			«ENDIF»
		«ENDIF»
	}
	«IF VLEGeneratorUtil.HasStereotype(transition, Transition)»
		«IF (VLEGeneratorUtil.GetStereotype(transition, Transition) as Transition).guard != null»bool «classElt.name»::doGuard_«(VLEGeneratorUtil.GetStereotype(transition, Transition) as Transition).guard.specification.name»(const vd::Time& time) {		
		}
		«ENDIF»
		«IF (VLEGeneratorUtil.GetStereotype(transition, Transition) as Transition).effect != null»void «classElt.name»::doEffect_«(VLEGeneratorUtil.GetStereotype(transition, Transition) as Transition).effect.specification.name»(const vd::Time& time) {
		}
		«ENDIF»
	«ENDIF»
	«ENDFOR»
	«ENDIF»'''
}