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

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import com.cea.papyrus.gen.cpp.core.Activator;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;
import com.cea.papyrus.gen.cpp.core.CppStereo;

public class CppClassIncludeDeclaration
{
  protected static String nl;
  public static synchronized CppClassIncludeDeclaration create(String lineSeparator)
  {
    nl = lineSeparator;
    CppClassIncludeDeclaration result = new CppClassIncludeDeclaration();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#include <";
  protected final String TEXT_2 = ">";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	
	// Retrieve header file suffix
	String headerFileSuffix = Activator.getDefault().getPluginPreferences().getString("headSuffix");
	
	
	// Retrieve the class
	NamedElement currentNE	= (NamedElement) argument;
	String cClassPath		= "";
	Package	nearestPkg		= currentNE.getNearestPackage();
	String cClassName = currentNE.getName();
	
	if ( //!(nearestPkg.getUml2Package() instanceof org.eclipse.uml2.uml.Model)  
			/*&& */!(GenUtils.hasStereotype(nearestPkg, CppStereo.root))) {
		cClassPath 	= GenUtils.getFullPath(nearestPkg)+"/";	
	}
		
	
	// If an external class is referred
	if (GenUtils.hasStereotype(currentNE, CppStereo.externClass)) {
		cClassPath = "";
		cClassName = GenUtils.getTaggedValue(currentNE, CppStereo.externClass, "name");
		if (cClassName.equals ("")) {
			// default value
			cClassName = currentNE.getQualifiedName ().replace ("::", "/") + "." + headerFileSuffix;
			// strip model name
			cClassName = cClassName.substring (currentNE.getModel ().getName ().length () + 1);
		}
	} else if (GenUtils.hasStereotype(currentNE, CppStereo.template)) {
		cClassPath = "";
		cClassName = GenUtils.getTaggedValue(currentNE, CppStereo.template, "declaration");	
	}
	else cClassName=cClassName+"."+headerFileSuffix;
		
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( cClassPath );
    stringBuffer.append( cClassName );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}