package org.eclipse.papyrus.robotml.vle.codegen.xtend

import org.eclipse.uml2.uml.DataType
import RobotMLExtension.BasicType
import RobotMLExtension.Vector
import RobotMLExtension.Array
import RobotMLExtension.Alias
import RobotMLExtension.Define
import RobotMLExtension.Map
import RobotMLExtension.Union

class VLEDataTypeDefsHeaderGenerator {
	
	static def generateCode(DataType datatype) '''
	/********************************************/
	/*		«datatype.name» header file			*/
	/********************************************/
	#ifndef «datatype.name.toUpperCase»_HEADER
	#define «datatype.name.toUpperCase»_HEADER

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
	__EXPORT__ void init_«datatype.name»(«datatype.name»* val);
	#endif /*«datatype.name.toUpperCase»_HEADER*/
	'''
	
	static def generateBasicType(DataType datatype) '''
#include "Value.hpp"
typedef «(VLEGeneratorUtil.GetStereotype(datatype, BasicType) as BasicType).type» «datatype.name»;'''
	
	static def generateVectorType(DataType datatype)'''
#include "Value.hpp"
typedef vle::value::Set<«(VLEGeneratorUtil.GetStereotype(datatype, Vector) as Vector).type_template.name»> «datatype.name»;'''

	static def generateArrayType(DataType datatype) '''
typedef «(VLEGeneratorUtil.GetStereotype(datatype, Array) as Array).type_template.name»[«(VLEGeneratorUtil.GetStereotype(datatype, Array) as Array).size»] «datatype.name»;'''

	static def generateAliasType(DataType datatype) '''
typedef «(VLEGeneratorUtil.GetStereotype(datatype, Alias) as Alias).type.name» «datatype.name»;'''
	
	static def generateDefineType(DataType datatype) '''
#define «(VLEGeneratorUtil.GetStereotype(datatype, Define) as Define).type.name» «datatype.name»'''

	static def generateMapType(DataType datatype) '''
#include "Value.hpp"
typedef vle::value::Map<«(VLEGeneratorUtil.GetStereotype(datatype, Map) as Map).keys_type.name», «(VLEGeneratorUtil.GetStereotype(datatype, Map) as Map).values_type.name»> «datatype.name»;'''
	
	static def generateUnionType(DataType datatype) '''
typedef union «FOR type : (VLEGeneratorUtil.GetStereotype(datatype, Union) as Union).types»«type.name»«IF (VLEGeneratorUtil.GetStereotype(datatype, Union) as Union).types.indexOf(type) < ((VLEGeneratorUtil.GetStereotype(datatype, Union) as Union).types.length -1)»,«ENDIF»«ENDFOR» «datatype.name»;
	'''
	
	static def generateStructuredType(DataType datatype)'''
typedef vle::value::Map<vle::value::String, vle::value::Value*> «datatype.name»
	'''
} 