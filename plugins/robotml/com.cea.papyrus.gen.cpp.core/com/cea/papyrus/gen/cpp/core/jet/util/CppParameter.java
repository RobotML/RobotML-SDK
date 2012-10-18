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
import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;

public class CppParameter
{
  protected static String nl;
  public static synchronized CppParameter create(String lineSeparator)
  {
    nl = lineSeparator;
    CppParameter result = new CppParameter();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";

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
	String suffix			= "";
	String ptr				= "";
	String ref				= "";
	String array			= "";
	String isConst			= "";
	
	if (currentParameter.getType() == null) {
		typeName	= "undefined";
	} else {
		typeName	= GenUtils.qualifiedName (currentParameter.getType());
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
	
	// Initial value
	if (GenUtils.hasStereotype(currentParameter, CppStereo.default_)) {
		suffix		= " = "+GenUtils.getTaggedValue(currentParameter, CppStereo.default_, "value");
	}

	// Const
	if (GenUtils.hasStereotype(currentParameter, CppStereo.const_)) {
		isConst		= "const ";
	}


//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////

    stringBuffer.append( isConst );
    stringBuffer.append( typeName );
    stringBuffer.append( ptr );
    stringBuffer.append( ref );
    stringBuffer.append(TEXT_1);
    stringBuffer.append( parameterName );
    stringBuffer.append( array );
    stringBuffer.append( suffix );
    return stringBuffer.toString();
  }
}