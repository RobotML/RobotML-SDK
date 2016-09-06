package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.uml2.uml.StateMachine

class VLEStateMachineImplementationGenerator {
	static def generateCode(StateMachine smElt, String prefix) '''
/********************************************************/
/*			«prefix»_«smElt.name» implementation file			*/
/********************************************************/
#include "«prefix»_«smElt.name».h"
namespace generated {

	/*Constructor*/
	«prefix»_«smElt.name»::«prefix»_«smElt.name»(const I«prefix»_«smElt.name»* pMachine, const vd::DynamicsInit& init, const vd::InitEventList& events) : _pMachine(pMachine) {
		
		states(this)«FOR state : VLEGeneratorUtil.getRobotMLStates(smElt)» << «prefix»_«smElt.name»::«state.base_State.name»«ENDFOR»
		«FOR transition : VLEGeneratorUtil.getTransition(smElt)»
		transition(this,«prefix»_«smElt.name»::«transition.source.name»,«prefix»_«smElt.name»::«transition.target.name») << action(&«prefix»_«smElt.name»::transition_«transition.source.name»_to_«transition.target.name»)«IF transition.guard != null»<< guard(&«prefix»_«smElt.name»::guard_«transition.guard.specification.name»)«ENDIF»«IF transition.effect != null»<< effect(&«prefix»_«smElt.name»::«transition.effect.specification.name»)«ENDIF»;
		
		«ENDFOR»
	}
	
	/*Destructor*/
	«smElt.name»::~«smElt.name»(){
	}
	
	/*Transitions*/
	«FOR transition : VLEGeneratorUtil.getTransition(smElt)»
	void «smElt.name»::transition_«transition.source.name»_to_«transition.target.name»(const vd::Time& time)
	{
		if(_pMachine != NULL)
			_pMachine->doTransition_«transition.source.name»_to_«transition.target.name»(time);
	}
«IF transition.guard != null»bool «smElt.name»::guard_«transition.guard.specification.name»(const vd::Time& time)
{
	if(_pMachine != NULL)
		_pMachine->doGuard_«transition.guard.specification.name»(time);
}«ENDIF»
«IF transition.effect != null»void «smElt.name»::effect_«transition.effect.specification.name»(const vd::Time& time)
{
	if(_pMachine != NULL)
		_pMachine->doEffect_«transition.effect.specification.name»(time);
}«ENDIF»«ENDFOR»
			
	
	'''
}