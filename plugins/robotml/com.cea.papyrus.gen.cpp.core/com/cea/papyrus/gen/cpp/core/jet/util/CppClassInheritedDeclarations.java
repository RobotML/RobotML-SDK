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
import java.util.*;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;
import com.cea.papyrus.gen.cpp.core.CppStereo;

public class CppClassInheritedDeclarations
{
  protected static String nl;
  public static synchronized CppClassInheritedDeclarations create(String lineSeparator)
  {
    nl = lineSeparator;
    CppClassInheritedDeclarations result = new CppClassInheritedDeclarations();
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

	// Retrieve the class
	Classifier currentClass	= (Classifier) argument;
	String targetName		= "";
	String visibility		= "";
	String decl				= "";
	
	// Get generalization and implementation relationships
	Iterator<DirectedRelationship> relationshipIt =
		currentClass.getSourceDirectedRelationships().iterator();
	// Iterator impIt = currentClass.getImplementations().iterator();
	
	while (relationshipIt.hasNext()) {
		
		DirectedRelationship relationship = relationshipIt.next();
		
		if ((relationship instanceof Generalization) ||
		    (relationship instanceof InterfaceRealization))
		{
			org.eclipse.uml2.uml.Classifier target = null;
			if (relationship.getTargets ().size() > 0) {
				// there should always be at least one element in the target
				// list and it should be a classifier, but better check.
				org.eclipse.uml2.uml.Element element =
					relationship.getTargets().get(0);
				if (element instanceof org.eclipse.uml2.uml.Classifier) {
					target = (org.eclipse.uml2.uml.Classifier) element;
				}
			}
			if (target != null) {
				// If not <NoCodeGen>
				if (!GenUtils.hasStereotype(target, CppStereo.noCodeGen))
				{
					// get visibility and target name
					if (GenUtils.hasStereotype(relationship, CppStereo.visibility)){
						visibility	= GenUtils.getTaggedValue(relationship, CppStereo.visibility, "value");
					} else {
						visibility	= "public";
					}
			
					targetName = GenUtils.qualifiedName (target);		
					if (!decl.equals("")) {
						decl = decl + ", ";
					}
					decl = decl+visibility+" "+targetName;
				}
			}
		}
	}
	
	// Parse implementations
	// RS: removed code: Implementation does not exist in UML2 v2.
	// TODO: replace Implementation with new UML2 constructions?
//	Implementation currentImp;
//	
//	while (impIt.hasNext()) {
//		
//		currentImp		= (Implementation) impIt.next();
//		currentNE		= (NamedElement) currentImp;
//		
//		// get visibility and target name
//		visibility		= currentNE.getVisibilityAsString();
//		
//		// If not <NoCodeGen>
//		if (!GenUtils.hasStereotype(currentImp.getTarget(), CppStereo.noCodeGen)) {
//		
//			targetName		= currentImp.getTarget().getName();
//		
//			if (!decl.equals("")) {
//				decl = decl + ", ";
//			}	
//			decl			= decl+visibility+" "+targetName;
//		
//		}
//	}
	
	
	// ":" if decl non empty 
	String prefix	= "";
	if (!decl.equals("")) {
		prefix	= " : ";
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