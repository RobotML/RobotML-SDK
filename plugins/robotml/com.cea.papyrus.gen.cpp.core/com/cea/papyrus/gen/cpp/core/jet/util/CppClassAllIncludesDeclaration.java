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
import com.cea.papyrus.gen.cpp.core.utils.*;
import org.eclipse.uml2.uml.Class;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Package;
import org.eclipse.emf.common.util.UniqueEList;
import java.util.*;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Classifier;

public class CppClassAllIncludesDeclaration
{
  protected static String nl;
  public static synchronized CppClassAllIncludesDeclaration create(String lineSeparator)
  {
    nl = lineSeparator;
    CppClassAllIncludesDeclaration result = new CppClassAllIncludesDeclaration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the class
	Classifier currentClass = (Classifier) argument;
		
	// Get the package name
	// String className		= currentClass.getName();

	// Prepare Dependency includes declarations ...
	// Retrieve package used by current package (dependencies)
	// use a unique list to avoid duplicates
	EList<Classifier> usedClasses = new UniqueEList<Classifier> ();
	
	String newInclude = "";

	// class attributes dependencies
	usedClasses.addAll (GenUtils.getOwnedAttributeTypes(currentClass));
	// operation parameters dependencies	
	usedClasses.addAll (GenUtils.getIncludesFromOperations(currentClass));
	// realized interface dependencies
	// usedClasses.addAll (GenUtils.getImplementedInterfaces(currentClass));
	// dependencies and associations
	usedClasses.addAll (GenUtils.getRelationshipsNoDeps(currentClass));

	Iterator<Classifier> usedClassesIt = usedClasses.iterator();
	// Parsing all as NamedElement
	String includes = GenIncludeDecl.createIncludeDecl (usedClasses, currentClass);
	
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( includes );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}