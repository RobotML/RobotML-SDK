/*******************************************************************************
 * Copyright (c) 2006 CEA List.
 * All rights reserved. This program and the accompanying materials
 * are property of the CEA, their use is subject to specific agreement 
 * with the CEA.
 * 
 * Contributors:
 *    CEA List - initial API and implementation
 *******************************************************************************/

package com.cea.papyrus.gen.cpp.core.jet;

import com.cea.papyrus.gen.cpp.core.utils.*;
import org.eclipse.emf.common.util.EList;
import com.cea.papyrus.gen.cpp.core.CppStereo;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.*;
import com.cea.papyrus.gen.cpp.core.jet.util.*;
import com.cea.papyrus.gen.cpp.core.Activator;

public class CppClassBody
{
  protected static String nl;
  public static synchronized CppClassBody create(String lineSeparator)
  {
    nl = lineSeparator;
    CppClassBody result = new CppClassBody();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#define ";
  protected final String TEXT_2 = "_BODY" + NL + "" + NL + "/************************************************************";
  protected final String TEXT_3 = NL + "              ";
  protected final String TEXT_4 = " class body" + NL + " ************************************************************/" + NL + "" + NL + "/* Header include                                           */" + NL + "#include <";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ">" + NL + "" + NL + "/* Include from CppInclude declaration                      */";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL;
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = NL + NL + "/************************************************************" + NL + "              End of ";
  protected final String TEXT_17 = " class body" + NL + " ************************************************************/" + NL;
  protected final String TEXT_18 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////
	
	// Retrieve the class
	Classifier currentClass	= (Classifier) argument;
	
	// Get the package name
	String className	= currentClass.getName();
	String classFullName= GenUtils.getFullName (currentClass);
	String classFULLNAME= classFullName.toUpperCase(); 
	String openNS = GenUtils.openNamespace (currentClass);
	String closeNS = GenUtils.closeNamespace (currentClass);
	
	// Retrieve header file suffix
	String headerFileSuffix = Activator.getDefault().getPluginPreferences().getString("headSuffix");
	
	// Include declaration "CppInclude"
	String bodyDecl		= "";
	if (GenUtils.hasStereotype(currentClass, CppStereo.include)) {
		bodyDecl			= GenUtils.getTaggedValue(currentClass, CppStereo.include, "body") + "\n\n";
	}
	EList<Classifier> deps = GenUtils.getDependencies (currentClass);
	bodyDecl += GenIncludeDecl.createIncludeDecl (deps, currentClass);
		
	// TODO - Prepare static attribute
	String staticAttributes = "";

	// Retrieve owner Package
	Package owner		= currentClass.getPackage();
	String  fullPath	= "";
	String  separ		= "";
	
	if (owner != null) {
		fullPath		= GenUtils.getFullPath(owner);
		separ			= "/";
	} // else fullPath == ""
	
		// Prepare attributes and Methods declarations
	String allOperations	= "";
	
	// Methods
	CppClassOperationsImplementation jetClassOp
							= new CppClassOperationsImplementation();
	allOperations			= jetClassOp.generate(currentClass);
	
	// Prepare static attributes declaration
	CppStaticClassAttributesImplementation jetStaticAtts
							= new CppStaticClassAttributesImplementation();
	staticAttributes		= jetStaticAtts.generate(currentClass);

//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( classFULLNAME );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append( className );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( fullPath );
    stringBuffer.append( separ );
    stringBuffer.append( className );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( headerFileSuffix );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append( bodyDecl );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    stringBuffer.append( openNS);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    stringBuffer.append( staticAttributes );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    stringBuffer.append( allOperations );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    stringBuffer.append( closeNS);
    stringBuffer.append(TEXT_16);
    stringBuffer.append( className );
    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}