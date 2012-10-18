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

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import java.util.Iterator;
import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;

public class CppInterfaceInheritedDeclarations
{
  protected static String nl;
  public static synchronized CppInterfaceInheritedDeclarations create(String lineSeparator)
  {
    nl = lineSeparator;
    CppInterfaceInheritedDeclarations result = new CppInterfaceInheritedDeclarations();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the interface
	Classifier currentClass		= (Classifier) argument;
	String decl				= "";
	String visibility		= "";
	
	// Get generalization and implementation relationships
	Iterator<Generalization> genIt = currentClass.getGeneralizations().iterator();
	
	// Parse generalizations
	while (genIt.hasNext()) {
		
		Generalization currentGen = genIt.next();
		
		// get visibility and target name
		if (GenUtils.hasStereotype(currentGen, CppStereo.visibility)) {
			visibility	= GenUtils.getTaggedValue(currentGen, CppStereo.visibility, "value");
		} else {
			visibility	= "public";
		}
			
		// If not <NoCodeGen>
		Classifier tmpClassifier = currentGen.getGeneral();
		if (!GenUtils.hasStereotype(tmpClassifier, CppStereo.noCodeGen)) {
		
			String targetName = tmpClassifier.getName();
		
			if (!decl.equals("")) {
				decl = decl + ", ";
			}
			decl = decl+visibility+" "+targetName;
		}	
	}
	
	// ":" only if decl not empty
	String prefix = "";
	if (!decl.equals("")) {
		prefix	= ": ";
		visibility = "public ";
	}	
	
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( prefix );
    stringBuffer.append( decl );
    return stringBuffer.toString();
  }
}