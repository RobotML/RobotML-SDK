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

import org.eclipse.uml2.uml.*;
import java.util.*;

public class CppOperationParameters
{
  protected static String nl;
  public static synchronized CppOperationParameters create(String lineSeparator)
  {
    nl = lineSeparator;
    CppOperationParameters result = new CppOperationParameters();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the Operation
	Operation currentOperation	= (Operation) argument;
	Parameter currentParameter;
		
	String paramDecl = "";
	
	Iterator<Parameter> parameters = currentOperation.getOwnedParameters().iterator();
	while(parameters.hasNext()) {
		currentParameter = parameters.next();	
		if (currentParameter.getDirection () != ParameterDirectionKind.RETURN_LITERAL) {
			// Prepare parameters
			CppParameter jetParam = new CppParameter();
			if (!paramDecl.equals("")) {
				paramDecl += ", ";
			}
			paramDecl = paramDecl+jetParam.generate(currentParameter);	
		}
	}
	
	paramDecl.replaceAll(NL, "");
	
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////

    stringBuffer.append( paramDecl );
    return stringBuffer.toString();
  }
}