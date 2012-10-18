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
import com.cea.papyrus.gen.cpp.core.jet.doc.*;
import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;

public class CppOperationDeclaration
{
  protected static String nl;
  public static synchronized CppOperationDeclaration create(String lineSeparator)
  {
    nl = lineSeparator;
    CppOperationDeclaration result = new CppOperationDeclaration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "\t";
  protected final String TEXT_2 = NL + "\t";
  protected final String TEXT_3 = " (";
  protected final String TEXT_4 = ")";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the Operation
	Operation currentOperation	= (Operation) argument;
		
	String operationName		= currentOperation.getName();

	String opParameters			= "";
	
	String returnTypeName		= "void";
	String pVirtualSuffix		= "";
	String prefix				= "";
	String constOp				= "";

	
	String opDoc = "";
	
	// Doc for the template
	CppOperationDoc jDoc		= new CppOperationDoc();
	opDoc						= GenUtils.indent (jDoc.generate(currentOperation), "\t");
	
	// Prepare return type
	CppOperationReturnType jetRT = new CppOperationReturnType();
	returnTypeName	= jetRT.generate(currentOperation);	
	if (!returnTypeName.equals ("")) {
		returnTypeName += " ";
	}
	
	boolean isInterface = currentOperation.getOwner () instanceof Interface;
		
	// Static attribute
	if (currentOperation.isStatic()) {
		prefix				= prefix+"static"+" ";
	}
	
	// Inline attribute
	if (GenUtils.hasStereotype(currentOperation, CppStereo.inline)) {
		prefix				= prefix+"inline"+" ";
	}		
		
	// Creator / Destructor / Musclor - Be carefull stereotype is Create and not create
	// TODO: Fully qualified name ?
	if (GenUtils.hasStereotype(currentOperation, StdStereo.create)) {
		returnTypeName		= "";
	}
	if (GenUtils.hasStereotype(currentOperation, StdStereo.destroy)) {
		returnTypeName		= "";
		operationName		= "~"+operationName;
	}
	
	// Const attribute on operation
	if (GenUtils.hasStereotype(currentOperation, CppStereo.const_)) {
		constOp				= "const";
	}	
	
	// Virtual attribute on operation
	if (GenUtils.hasStereotype(currentOperation, CppStereo.virtual)) {
		prefix				= "virtual "+prefix;
	}	
	
	// Pure Virtual attribute on operation
	if (GenUtils.hasStereotype(currentOperation, CppStereo.pureVirtual) || isInterface || currentOperation.isAbstract ()) {
		prefix				= "virtual "+prefix;
		pVirtualSuffix		= " = 0";
	}
	
	// Friend attribute on operation
	if (GenUtils.hasStereotype(currentOperation, CppStereo.friend)) {
		prefix				= "friend "+prefix;
	}	
	
	// Prepare parameters
	CppOperationParameters	jetParams	= new CppOperationParameters();
	opParameters						= jetParams.generate(currentOperation);	
	
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template only if current operation is not main
//	else nothing is return...
//////////////////////////////////////////////////////////////////////////////////////////

	if (!operationName.equals("main")) { 

//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( opDoc );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( prefix );
    stringBuffer.append( returnTypeName );
    stringBuffer.append( operationName );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( opParameters );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( constOp );
    stringBuffer.append( pVirtualSuffix );
    //////////////////////////////////////////////////////////////////////////////////////////

	} // else nothing done
	
//////////////////////////////////////////////////////////////////////////////////////////
    return stringBuffer.toString();
  }
}