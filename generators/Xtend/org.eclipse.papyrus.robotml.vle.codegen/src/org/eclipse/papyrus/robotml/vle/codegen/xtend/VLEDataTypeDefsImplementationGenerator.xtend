package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.uml2.uml.DataType
import RobotMLExtension.BasicType
import RobotMLExtension.Vector
import RobotMLExtension.Define
import RobotMLExtension.Union
import RobotMLExtension.Array
import RobotMLExtension.Alias
import RobotMLExtension.Map

class VLEDataTypeDefsImplementationGenerator {
	
	static def generateCode(DataType datatype)'''
//Datatype => «datatype.toString»
«FOR type : datatype.appliedStereotypes»
//Type name => «type.name»
«ENDFOR»	
#include "«datatype.name».h"
«FOR attr : datatype.attributes»
#include "«attr.name».h"
«ENDFOR»
	
	«IF VLEGeneratorUtil.HasStereotypApplied(datatype)»
		«IF VLEGeneratorUtil.HasStereotype(datatype, BasicType)»«generateBasicType(datatype)»
		«ELSEIF VLEGeneratorUtil.HasStereotype(datatype, Vector)»«generateVectorType(datatype)»
		«ELSEIF VLEGeneratorUtil.HasStereotype(datatype, Array)»«generateArrayType(datatype)»
		«ELSEIF VLEGeneratorUtil.HasStereotype(datatype, Alias)»«generateAliasType(datatype)»
		«ELSEIF VLEGeneratorUtil.HasStereotype(datatype, Define)»«generateDefineType(datatype)»
		«ELSEIF VLEGeneratorUtil.HasStereotype(datatype, Map)»«generateMapType(datatype)»
		«ELSEIF VLEGeneratorUtil.HasStereotype(datatype, Union)»«generateUnionType(datatype)»
		«ENDIF»
	«ELSE»
		«generateStructuredType(datatype)»
	«ENDIF»
	'''
		
	static def generateStructuredType(DataType datatype)'''
	__EXPORT__ init_«datatype.name»(«datatype.name»* val) {
		val = vle::value::Map::Create();
		vle::value::Value* tmp = NULL;
		«FOR attr : datatype.attributes»
		init_«attr.name»((«attr.name»*)tmp);
		val->add(«attr.name», tmp);
		«ENDFOR»
	}'''
	
	static def generateBasicType(DataType datatype) '''
	«IF VLEGeneratorUtil.GetStereotype(datatype, BasicType) != null»
	
	__EXPORT__ void init_«datatype.name»(«datatype.name»* data) {
		
		data = «(VLEGeneratorUtil.GetStereotype(datatype, BasicType) as BasicType).type»::create();
		
	}«ENDIF»'''
	
	static def generateVectorType(DataType datatype) '''
	__EXPORT__ void init_«datatype.name»(«datatype.name»* val) {
		val = vle::value::Set::create();
	}'''
	
	static def generateArrayType(DataType datatype) '''
	__EXPORT__ void init_«datatype.name»(«datatype.name»* val) {
		val = vle::value::Set::create();
	}'''
	
	static def generateMapType(DataType datatype) '''
	__EXPORT__ void init_«datatype.name»(«datatype.name»* val) {
		val = vle::value::Map::create();
	}'''
	
	static def generateAliasType(DataType datatype) '''
	__EXPORT__ void init_«datatype.name»(«datatype.name»* val) {
		val = «datatype.name»::create();
	}'''
	
	static def generateDefineType(DataType datatype) '''
	__EXPORT__ void init_«datatype.name»(«datatype.name»* val) {
		val = «datatype.name»::create();
	}'''
	
	static def generateUnionType(DataType datatype) '''
	__EPXORT__ void init_«datatype.name»(«datatype.name»& val) {
		//How to transcode union type ???
«««		TODO
	}'''
}