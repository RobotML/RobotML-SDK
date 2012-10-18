/*******************************************************************************
 * Copyright (c) 2006 CEA List.
 * All rights reserved. This program and the accompanying materials
 * are property of the CEA, their use is subject to specific agreement 
 * with the CEA.
 * 
 * Contributors:
 *    CEA List - initial API and implementation
 *******************************************************************************/

package com.cea.papyrus.gen.cpp.core.jet.util;

import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Classifier;
import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;

public class CppParameterWithoutDefaultValue
{
  protected static String nl;
  public static synchronized CppParameterWithoutDefaultValue create(String lineSeparator)
  {
    nl = lineSeparator;
    CppParameterWithoutDefaultValue result = new CppParameterWithoutDefaultValue();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<";
  protected final String TEXT_2 = ">";
  protected final String TEXT_3 = " ";
  protected final String TEXT_4 = " ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the Parameter
	Parameter currentParameter	= (Parameter) argument;
		
	String parameterName		= currentParameter.getName();

	String typeName			= "";
	String ptr				= "";
	String ref				= "";
	String array			= "";
	String isConst			= "";
	
	// Prepare template parameter declaration without type
	String tparamWoType		= "";
	
	if (currentParameter.getType() == null) {
		typeName = "undefined";
	}
	else if (currentParameter.getType() instanceof Classifier) {
		Classifier classifier  = (Classifier) currentParameter.getType();
		tparamWoType = GenUtils.getTemplateParametersWoType(classifier);

		typeName = GenUtils.qualifiedName (currentParameter.getType());
	}
	else {
		typeName = GenUtils.qualifiedName (currentParameter.getType());
	}
	
	// Pointer
	if (GenUtils.hasStereotype(currentParameter, CppStereo.ptr)) {
		ptr = GenUtils.getTaggedValue(currentParameter, CppStereo.ptr, "declaration");
	}
	
	// Ref
	if (GenUtils.hasStereotype(currentParameter, CppStereo.ref)) {
		ref = GenUtils.getTaggedValue(currentParameter, CppStereo.ref, "declaration");
	}
	
	// Array
	if (GenUtils.hasStereotype(currentParameter, CppStereo.array)) {
		array = GenUtils.getTaggedValue(currentParameter, CppStereo.array, "definition");
	}

	// Const
	if (GenUtils.hasStereotype(currentParameter, CppStereo.const_)) {
		isConst		= "const ";
	}

//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
// Package visibility 
	if (!"".equals(tparamWoType)) {
	
//////////////////////////////////////////////////////////////////////////////////////////


    stringBuffer.append( isConst );
    stringBuffer.append( typeName );
    stringBuffer.append(TEXT_1);
    stringBuffer.append( tparamWoType );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( ptr );
    stringBuffer.append( ref );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( parameterName );
    stringBuffer.append( array );
    

//////////////////////////////////////////////////////////////////////////////////////////
	
	} else { // Default case

//////////////////////////////////////////////////////////////////////////////////////////


    stringBuffer.append( isConst );
    stringBuffer.append( typeName );
    stringBuffer.append( ptr );
    stringBuffer.append( ref );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( parameterName );
    stringBuffer.append( array );
    

//////////////////////////////////////////////////////////////////////////////////////////
	}
//////////////////////////////////////////////////////////////////////////////////////////
    return stringBuffer.toString();
  }
}