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

public class CppOperationImplementation
{
  protected static String nl;
  public static synchronized CppOperationImplementation create(String lineSeparator)
  {
    nl = lineSeparator;
    CppOperationImplementation result = new CppOperationImplementation();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = " ";
  protected final String TEXT_5 = " (";
  protected final String TEXT_6 = ") {";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "}" + NL;
  protected final String TEXT_9 = "\t" + NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = " ";
  protected final String TEXT_13 = "::";
  protected final String TEXT_14 = " (";
  protected final String TEXT_15 = ") ";
  protected final String TEXT_16 = " {";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = NL + "}" + NL;
  protected final String TEXT_19 = "\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the Operation
	Operation currentOperation	= (Operation) argument;
		
	String body					= "";
	String className			= "";
	String operationName		= currentOperation.getName();
	String opParameters			= "";
	String returnTypeName		= "void";
	String isInline				= "";
	String isConst				= "";
	String constInit			= "";

	String opDoc = "";

	// Doc for the template
	CppOperationDoc jDoc = new CppOperationDoc();
	opDoc = jDoc.generate(currentOperation);

	// Retrieve class name. Operation may belong to a class or datatype, thus use
	// generic getOwner function
	Element opOwner = currentOperation.getOwner();
	className = (opOwner instanceof NamedElement) ? ((NamedElement) opOwner).getName() : "";

	// Retrieve body content
	body = GenUtils.getBody (currentOperation, "C/C++");
	
	// Prepare return type
	CppOperationReturnType jetRT = new CppOperationReturnType();
	returnTypeName = jetRT.generate(currentOperation);	
	
	// Creator / Destructor / Musclor - be carefull stereotype is Create and not create
	if (GenUtils.hasStereotype(currentOperation, "Standard::Create")) {
		returnTypeName = "";
	}
	if (GenUtils.hasStereotype(currentOperation, "Standard::Destroy")) {
		returnTypeName = "";
		operationName = "~"+operationName;
	}
	
	// If is inline operation
	if (GenUtils.hasStereotype(currentOperation, CppStereo.inline)) {
		isInline = "inline ";
	}

	// Const op
	if (GenUtils.hasStereotype(currentOperation, CppStereo.const_)) {
		isConst	= " const";
	}

	// Constructor init list
	if (GenUtils.hasStereotype(currentOperation, CppStereo.constInit)
				&& GenUtils.hasStereotype(currentOperation, "Standard::Create")) {
		constInit = ": "+GenUtils.getTaggedValue(currentOperation, CppStereo.constInit, "initialisation");
	}

	// Prepare parameters
	CppOperationParametersWithoutDefaultValue jetParams = new CppOperationParametersWithoutDefaultValue();
	opParameters = jetParams.generate(currentOperation);
	
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template two cases main operation or classical
//////////////////////////////////////////////////////////////////////////////////////////

// main 
	if (operationName.equals("main")) {
	
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append( opDoc );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( returnTypeName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( operationName );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( opParameters );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append( body );
    stringBuffer.append(TEXT_8);
    //////////////////////////////////////////////////////////////////////////////////////////

	}
	else {

//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append( opDoc );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( isInline );
    stringBuffer.append( returnTypeName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( className );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( operationName );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( opParameters );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( isConst );
    stringBuffer.append( constInit );
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append( body );
    stringBuffer.append(TEXT_18);
    //////////////////////////////////////////////////////////////////////////////////////////
	}
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}