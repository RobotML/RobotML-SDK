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

import org.eclipse.uml2.uml.Property;
import com.cea.papyrus.gen.cpp.core.jet.doc.*;
import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;

public class CppAttributeDeclaration
{
  protected static String nl;
  public static synchronized CppAttributeDeclaration create(String lineSeparator)
  {
    nl = lineSeparator;
    CppAttributeDeclaration result = new CppAttributeDeclaration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL + "\t";
  protected final String TEXT_3 = " ";
  protected final String TEXT_4 = ";";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the property
	Property currentAttribute			= (Property) argument;
	
	String attributeName	= currentAttribute.getName();
	String typeName			= "";
	String prefix			= "";
	String suffix			= "";
	String multiple			= "";
	String ptr				= "";
	String ref				= "";
	String array			= "";
	String isConst			= "";
	
	
	// For property documentation
	String propDoc		= "";
	
	// Retrieve enum doc
	CppElementDoc jDoc		= new CppElementDoc();
	propDoc					= jDoc.generate(currentAttribute);	
	propDoc					= propDoc.replaceAll(NL, NL+"	");
	
	if (currentAttribute.getType() == null) {
		typeName	= "undefined";
	} else {
		typeName	= GenUtils.qualifiedName (currentAttribute.getType());
	}
	
	// Static attribute
	if (currentAttribute.isStatic()) {
		prefix		= "static"+" ";
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
	
	// Const
	if (GenUtils.hasStereotype(currentAttribute, CppStereo.const_)) {
		isConst = "const ";
	}
	
	// Treat multiplicity for association attributes
	int multiplicity = currentAttribute.getUpper();
	if (multiplicity == 1) {
		multiple = "";
	} else if (multiplicity == -1) {
		multiple = "*";
	} else {
		multiple = "";
		array = "["+multiplicity+"]";
	}
	
	// If attribute is aggregation
	if (GenUtils.isAggregation(currentAttribute)) {
		// attributeName	= "(*"+attributeName+")"; // this produce a pointer on a tab
		attributeName = "*"+attributeName;      // this produce a tab of pointers
	}
	
	
	// Initial value - Checked if "static const" declaration
	if (currentAttribute.isStatic() && GenUtils.hasStereotype(currentAttribute, CppStereo.const_)) {
		if (GenUtils.hasStereotype(currentAttribute, CppStereo.default_)) {
			suffix = " = "+GenUtils.getTaggedValue(currentAttribute, CppStereo.default_, "value");
		}
	}
			
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( propDoc );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( prefix );
    stringBuffer.append( isConst );
    stringBuffer.append( typeName );
    stringBuffer.append( multiple );
    stringBuffer.append( ptr );
    stringBuffer.append( ref );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( attributeName );
    stringBuffer.append( array );
    stringBuffer.append( suffix );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}