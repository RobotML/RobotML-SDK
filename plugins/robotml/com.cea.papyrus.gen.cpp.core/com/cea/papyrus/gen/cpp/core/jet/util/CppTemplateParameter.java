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

import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;
import org.eclipse.uml2.uml.TemplateParameter;

public class CppTemplateParameter
{
  protected static String nl;
  public static synchronized CppTemplateParameter create(String lineSeparator)
  {
    nl = lineSeparator;
    CppTemplateParameter result = new CppTemplateParameter();
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


	// Retrieve the TemplateParameter
	TemplateParameter currentTParam	= (TemplateParameter) argument;
		
	String parameterName	= "";
	String typeName			= "";
	
	
	if (GenUtils.getType(currentTParam) == "") {
		typeName = "undefined";
	} else {
		typeName = GenUtils.getType(currentTParam); //.getName();
	}
	
	// Retrieve name under stereotype CppTemplateParameter/name
		if (GenUtils.hasStereotype(currentTParam, CppStereo.templateParameter)) {
			parameterName = GenUtils.getTaggedValue(currentTParam, CppStereo.templateParameter, "name");
		} 

//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////

    stringBuffer.append( typeName );
    stringBuffer.append(TEXT_1);
    stringBuffer.append( parameterName );
    return stringBuffer.toString();
  }
}