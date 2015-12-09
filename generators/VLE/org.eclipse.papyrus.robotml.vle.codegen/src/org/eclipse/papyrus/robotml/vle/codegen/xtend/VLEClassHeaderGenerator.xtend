package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.uml2.uml.Operation

class VLEClassHeaderGenerator {
	static def generateCode(org.eclipse.uml2.uml.Class classElt) '''
	/*******************************************/
	/*        «classElt.name» header file      */
	/*******************************************/
	
	
	#ifndef «classElt.name.toUpperCase()»_HEADER
	#define «classElt.name.toUpperCase()»_HEADER
	class «classElt.name» {
		«for(Operation op : classElt.allOperations) {
			op.getReturnResult() op.name
		}»
	}
	#endif /*«classElt.name.toUpperCase()»_HEADER*/'''
}