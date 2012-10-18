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
import org.eclipse.uml2.uml.Class;
import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.utils.GenUtils;

public class CppOperationReturnType
{
  protected static String nl;
  public static synchronized CppOperationReturnType create(String lineSeparator)
  {
    nl = lineSeparator;
    CppOperationReturnType result = new CppOperationReturnType();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "::";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////

	// Retrieve the Operation
	Operation currentOperation	= (Operation) argument;
	
	String returnTypeName		= "void";
	String ownerName			= "";
	String isPointer			= "";
	String isRef				= "";
	String isConst				= "";
	
	// Return type	
	if (currentOperation.getType() == null) {
		returnTypeName	= "void";
	} else {
		if (currentOperation.getType() == null) {
			returnTypeName = "undefined";
		} else {
			// Treat the type if it is not "package visibility" and owned by a class
			Type currentType = currentOperation.getType();
			returnTypeName = GenUtils.qualifiedName (currentType);
			
			if (currentType.getVisibility() != VisibilityKind.PACKAGE_LITERAL) {
				if (currentType.getOwner() instanceof Class) {
					ownerName = ((Class) currentType.getOwner()).getName();
				}
			}
		}
		
		// Treat pointer or ref on return parameter (only one return parameter should exists)
			// retrieve return parameter
// RS: changed test: now getReturnResult returns only one param
//		if (currentOperation.getUml2Operation().getReturnResults().size() == 1) {
//			org.eclipse.uml2.uml.Parameter uml2Param 
//				= (org.eclipse.uml2.uml.Parameter) currentOperation.getUml2Operation().getReturnResults().get(0);
//			Parameter currentRParameter	
//				= new Parameter(uml2Param);
//			// case Pointer
//			if (currentRParameter.hasStereotype(xy, CppStereo.ptr)) {
//				isPointer = " "+currentRParameter.getTaggedValue(CppStereo.ptr, "declaration");
//			}
//			if (currentRParameter.hasStereotype(xy, CppStereo.ref)) {
//				isRef 	  = " "+currentRParameter.getTaggedValue(CppStereo.ref, "declaration");
//			}
//			if (currentRParameter.hasStereotype(xy, CppStereo.const_)) {
//				isConst = "const ";
//			}
//		}
		if (currentOperation.getReturnResult() instanceof Parameter) {
			Parameter uml2Param = (Parameter) currentOperation.getReturnResult();
			// case Pointer
			if (GenUtils.hasStereotype(uml2Param, CppStereo.ptr)) {
				isPointer = " " + GenUtils.getTaggedValue(uml2Param, CppStereo.ptr, "declaration");
			}
			if (GenUtils.hasStereotype(uml2Param, CppStereo.ref)) {
				isRef 	  = " " + GenUtils.getTaggedValue(uml2Param, CppStereo.ref, "declaration");
			}
			if (GenUtils.hasStereotype(uml2Param, CppStereo.const_)) {
				isConst = "const ";
			}
		}
	}
		
		
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template two cases : scope required or not
//////////////////////////////////////////////////////////////////////////////////////////

// No scope details 
	if (ownerName.equals("")) {	
//////////////////////////////////////////////////////////////////////////////////////////

    stringBuffer.append( isConst );
    stringBuffer.append( returnTypeName );
    stringBuffer.append( isPointer );
    stringBuffer.append( isRef );
    //////////////////////////////////////////////////////////////////////////////////////////
} else {
//////////////////////////////////////////////////////////////////////////////////////////

    stringBuffer.append( isConst );
    stringBuffer.append( ownerName );
    stringBuffer.append(TEXT_1);
    stringBuffer.append( returnTypeName );
    stringBuffer.append( isPointer );
    stringBuffer.append( isRef );
    //////////////////////////////////////////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////////////////////////////////////////
    return stringBuffer.toString();
  }
}