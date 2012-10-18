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
import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;

public class CppStaticAttributeImplementation
{
  protected static String nl;
  public static synchronized CppStaticAttributeImplementation create(String lineSeparator)
  {
    nl = lineSeparator;
    CppStaticAttributeImplementation result = new CppStaticAttributeImplementation();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = "::";
  protected final String TEXT_3 = ";";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the property
	Property currentAttribute			= (Property) argument;
	
	String attributeName	= currentAttribute.getName();
	String className		= GenUtils.qualifiedName (currentAttribute.getClass_());
	String typeName			= "";
	String suffix			= "";
	String multiple			= "";
	String ptr				= "";
	String ref				= "";
	String array			= "";
	String isAgg			= ""; // attribute is an aggregation or association
	
	
	if (currentAttribute.getType() == null) {
		typeName	= "undefined"+" ";
	} else {
		typeName	= GenUtils.qualifiedName (currentAttribute.getType()) + " ";
	}
	
	// Multiple
	// if (currentAttribute.isMultiple()) {
		// multiple	= "*";
	// }
	
	// If attribute is aggregation then generate a pointer
	if (GenUtils.isAggregation(currentAttribute)) {
		// attributeName	= "(*"+attributeName+")"; // this produce a pointer on a tab
		isAgg	= "*";      // this produce a tab of pointers
	}
	
	// Pointer
	if (GenUtils.hasStereotype(currentAttribute, CppStereo.ptr)) {
		ptr = GenUtils.getTaggedValue(currentAttribute, CppStereo.ptr, "declaration");
	}
	
	// Ref
	if (GenUtils.hasStereotype(currentAttribute, CppStereo.ref)) {
		ptr = GenUtils.getTaggedValue(currentAttribute, CppStereo.ref, "declaration");
	}
	
	// Array
	if (GenUtils.hasStereotype(currentAttribute, CppStereo.array)) {
		array = GenUtils.getTaggedValue(currentAttribute, CppStereo.array, "definition");
	}
	
	// Initial value
	if (GenUtils.hasStereotype(currentAttribute, CppStereo.default_)) {
		suffix = " = "+GenUtils.getTaggedValue(currentAttribute, CppStereo.default_,"value");
	}
			
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( typeName );
    stringBuffer.append( multiple );
    stringBuffer.append( ptr );
    stringBuffer.append( isAgg );
    stringBuffer.append( ref );
    stringBuffer.append( className );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( attributeName );
    stringBuffer.append( array );
    stringBuffer.append( suffix );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}