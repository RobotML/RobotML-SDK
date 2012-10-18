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
import java.util.Iterator;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;
import com.cea.papyrus.gen.cpp.core.CppStereo;

public class CppClassOperationsDeclaration
{
  protected static String nl;
  public static synchronized CppClassOperationsDeclaration create(String lineSeparator)
  {
    nl = lineSeparator;
    CppClassOperationsDeclaration result = new CppClassOperationsDeclaration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument1, Object argument2)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the class
	Classifier currentClass = (Classifier) argument1;
	String opDecl = "";
	
	// Retrieve attributes
	Iterator<Operation> operations = currentClass.getOperations().iterator();
	while (operations.hasNext()) {
		Operation operation = operations.next();
		if (!GenUtils.hasStereotype (operation, CppStereo.noCodeGen)) {
			if (operation.getVisibility() == argument2) {
				CppOperationDeclaration jetOpDecl = new CppOperationDeclaration();
				String cOpDecl = jetOpDecl.generate(operation);
		
				// if main cOpDecl = "";
				if (!cOpDecl.equals("")) {
					opDecl = opDecl+"\t"+cOpDecl+";";
				}
			}
		}
	}
			
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( opDecl );
    return stringBuffer.toString();
  }
}