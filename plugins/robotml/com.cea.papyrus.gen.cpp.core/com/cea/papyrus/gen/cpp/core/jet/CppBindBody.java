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
import com.cea.papyrus.gen.cpp.core.CppStereo;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.*;
import org.eclipse.emf.common.util.EList;
import com.cea.papyrus.gen.cpp.core.jet.util.*;
import java.util.*;
import com.cea.papyrus.gen.cpp.core.Activator;

public class CppBindBody
{
  protected static String nl;
  public static synchronized CppBindBody create(String lineSeparator)
  {
    nl = lineSeparator;
    CppBindBody result = new CppBindBody();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#define ";
  protected final String TEXT_2 = "_BODY" + NL + "" + NL + "/************************************************************";
  protected final String TEXT_3 = NL + "              ";
  protected final String TEXT_4 = " template binding body" + NL + " ************************************************************/" + NL + "" + NL + "/* Header include                                           */" + NL + "#include <";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ">";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + NL + "/* Include from CppInclude declaration                      */";
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL + "/************************************************************/" + NL + "template class ";
  protected final String TEXT_11 = " <";
  protected final String TEXT_12 = ">;" + NL + "" + NL + "/************************************************************" + NL + "              End of ";
  protected final String TEXT_13 = " template binding body" + NL + " ************************************************************/" + NL + ";";
  protected final String TEXT_14 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////
	
		// Retrieve the class
		Class currentClass		= (Class) argument;

		// Get the package name
		String className		= currentClass.getName();
		String classFullName	= GenUtils.getFullName (currentClass); 
		String classFULLNAME	= classFullName.toUpperCase(); 
		String parentClass      = "";
		String namespace = GenUtils.getNamespace (currentClass);

		// Retrieve header file suffix
		String headerFileSuffix = Activator.getDefault().getPluginPreferences().getString("headSuffix");

		// Include declaration "CppInclude"
		String bodyDecl		= "";
		if (GenUtils.hasStereotype (currentClass, CppStereo.include)) {
			bodyDecl			= GenUtils.getTaggedValue(currentClass, CppStereo.include, "body");
		}
		EList<Classifier> deps = GenUtils.getDependencies (currentClass);
		bodyDecl += GenIncludeDecl.createIncludeDecl (deps, currentClass);
		
		
		// Retrieve owner Package
		Package owner		= currentClass.getPackage();
		String  fullPath	= "";
		String  separ		= "";

		if (owner != null) {
			fullPath		= GenUtils.getFullPath(owner);
			separ			= "/";
		} // else fullPath == ""

		org.eclipse.uml2.uml.TemplateBinding tb = GenUtils.getTemplateBindings(currentClass);;

		//prepare parent class declaration
		EList<org.eclipse.uml2.uml.Element> templates = tb.getTargets();
		Class templateClass = (Class) ((TemplateSignature) templates.get(0)).getOwner();	
		parentClass		= GenUtils.qualifiedName (templateClass);               	


		// Prepare bindings parameter declaration

		String tParamDecl="";
		TemplateParameterSubstitution paramSub;
		Iterator<TemplateParameterSubstitution> tps = tb.getParameterSubstitutions().iterator();
		while(tps.hasNext()) {
			paramSub	=	(TemplateParameterSubstitution)tps.next();

			CppTemplateBindingParameter	jetTParam = new CppTemplateBindingParameter();
			tParamDecl			= tParamDecl+jetTParam.generate (paramSub);

			if (tps.hasNext()) {
				tParamDecl			= tParamDecl+", ";
			}
		}
	
	
	
	
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
    stringBuffer.append( namespace);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    stringBuffer.append( bodyDecl );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( parentClass );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( tParamDecl );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( className );
    stringBuffer.append(TEXT_13);
    stringBuffer.append(TEXT_14);
    return stringBuffer.toString();
  }
}