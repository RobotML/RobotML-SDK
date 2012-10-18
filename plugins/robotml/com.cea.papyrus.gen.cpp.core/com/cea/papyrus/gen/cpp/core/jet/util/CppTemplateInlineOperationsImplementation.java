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

import com.cea.papyrus.gen.cpp.core.jet.doc.*;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import java.util.Iterator;
import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;

public class CppTemplateInlineOperationsImplementation
{
  protected static String nl;
  public static synchronized CppTemplateInlineOperationsImplementation create(String lineSeparator)
  {
    nl = lineSeparator;
    CppTemplateInlineOperationsImplementation result = new CppTemplateInlineOperationsImplementation();
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

		// Retrieve the class
		Class currentClass	= (Class) argument;
		String opDecl	= "";
		String tDecl	= "";
		
		// Retrieve template declaration
		CppTemplateDeclaration jetTDecl = new CppTemplateDeclaration();
		// tDecl should contain something like "template <class x, class y>"
		tDecl = jetTDecl.generate(currentClass) + " "; 

		// Retrieve operations
		Iterator<Operation> operations = currentClass.getOwnedOperations().iterator();
		while (operations.hasNext()) {
			Operation currentOperation = operations.next();

			if (GenUtils.hasStereotype (currentOperation, CppStereo.inline) &&
				!GenUtils.hasStereotype (currentOperation, CppStereo.noCodeGen)) {
				String opDoc = "";

				// Doc for the template	
				CppOperationDoc jDoc = new CppOperationDoc();
				opDoc = jDoc.generate(currentOperation);

				CppOperationTemplateImplementation jetOpImpl = new CppOperationTemplateImplementation();
				opDecl = opDecl+opDoc+NL+tDecl+jetOpImpl.generate(currentOperation)+NL;
			}
		}
		
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////

    stringBuffer.append( opDecl );
    return stringBuffer.toString();
  }
}