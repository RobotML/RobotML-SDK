package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.uml2.uml.StateMachine

class VLEStateMachineHeaderGenerator {
	static def generateCode(StateMachine smElt, String prefix) '''
	/********************************************************/
	/*				«prefix»_«smElt.name» header file				*/
	/********************************************************/
	
	#ifndef «prefix.toUpperCase()»_«smElt.name.toUpperCase()»_HEADER
	#define «prefix.toUpperCase()»_«smElt.name.toUpperCase()»_HEADER
	
	public enum «prefix.toUpperCase()»_STATES {
		«FOR state : VLEGeneratorUtil.getStates(smElt)»
		«state.name»«IF VLEGeneratorUtil.getStates(smElt).indexOf(state) < (VLEGeneratorUtil.getStates(smElt).length - 1)»,«ENDIF»
		«ENDFOR»
	};
	
	namespace vf = vle::extension::fsa;
	namespace generated {
		
		class I«prefix»_«smElt.name» {
		public:			
			«FOR transition : VLEGeneratorUtil.getTransition(smElt)»virtual void doTransition_«transition.source.name»_to_«transition.target.name»(const vd::Time& /*time*/) = 0;
	«IF transition.guard != null»virtual bool doGuard_«transition.guard.specification.name»(const vd::Time& /*time*/) = 0;«ENDIF»
	«IF transition.effect != null»virtual void doEffect_«transition.effect.specification.name»(const vd::Time& /*time*/) = 0;«ENDIF»«ENDFOR»
	
			«FOR state : VLEGeneratorUtil.getRobotMLStates(smElt)»
	«IF state.behavior != null»virtual void do«state.base_State.name»() = 0;«ENDIF»
			«ENDFOR»
		};
		
		class «prefix»_«smElt.name» : public vf::StateChart {
			
		public:
			«prefix»_«smElt.name»(const I«prefix»_«smElt.name»* pSystem, const vd::DynamicsInit& init, const vd::InitEventList& events);
			virutal ~«prefix»_«smElt.name»();
			«FOR transition : VLEGeneratorUtil.getTransition(smElt)»virtual void transition_«transition.source.name»_to_«transition.target.name»(const vd::Time& /*time*/);
	«IF transition.guard != null»virtual bool guard_«transition.guard.specification.name»(const vd::Time& /*time*/);«ENDIF»
	«IF transition.effect != null»virtual void effect_«transition.effect.specification.name»(const vd::Time& /*time*/);«ENDIF»«ENDFOR»
		private:
			const I«prefix»_«smElt.name»* _pMachine = NULL;
		};
	}
	
	
	#endif /*«prefix.toUpperCase()»_«smElt.name.toUpperCase()»_HEADER*/
	'''
	
	
	
}