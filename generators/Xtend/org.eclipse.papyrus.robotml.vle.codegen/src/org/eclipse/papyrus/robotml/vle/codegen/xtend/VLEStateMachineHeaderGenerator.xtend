package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.uml2.uml.StateMachine
import org.eclipse.uml2.uml.Transition
import java.util.List
import org.eclipse.uml2.uml.Region
import java.util.ArrayList
import org.eclipse.uml2.uml.Vertex

class VLEStateMachineHeaderGenerator {
	static def generateCode(StateMachine smElt) '''
	/********************************************************/
	/*				«smElt.name» header file				*/
	/********************************************************/
	
	#ifndef «smElt.name.toUpperCase()»_HEADER
	#define «smElt.name.toUpperCase()»_HEADER
	
	namespace generated {
		class «smElt.name» {
			
		public:
			«smElt.name»();
			virutal ~«smElt.name»();
			«FOR transition : getTransition(smElt)»
			void transition_«transition.source.name»_to_«transition.target.name»(const vd::Time& /*time*/);
			bool guard_«transition.guard.specification.name»(const vd::Time& /*time*/);
			void effect_«transition.effect.specification.name»(const vd::Time& /*time*/);«ENDFOR»
			
		};
	}
	
	
	#endif /*«smElt.name.toUpperCase()»_HEADER*/
	'''
	
	static def List<Transition> getTransition(StateMachine smElt) {
		var transitionList = new ArrayList<Transition>();
		for(Region region : smElt.regions) {
			for(Transition transition : region.transitions) {
				transitionList.add(transition);
			}	
		}
		return transitionList;
	}
	
	static def List<Vertex> getStates(StateMachine smeElt) {
		var statesList = new ArrayList<Vertex>();
		for(Region region : smeElt.regions) {
			for(Vertex state : region.subvertices) {
				statesList.add(state);
			}
		}
		return statesList;
	}
	
}