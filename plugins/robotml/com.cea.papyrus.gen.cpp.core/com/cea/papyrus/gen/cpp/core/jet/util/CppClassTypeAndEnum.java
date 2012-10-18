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

import org.eclipse.uml2.uml.Class;
import java.util.Iterator;
import org.eclipse.uml2.uml.*;

public class CppClassTypeAndEnum
{
  protected static String nl;
  public static synchronized CppClassTypeAndEnum create(String lineSeparator)
  {
    nl = lineSeparator;
    CppClassTypeAndEnum result = new CppClassTypeAndEnum();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
//////////////////////////////////////////////////////////////////////////////////////////
// Java preparation
//////////////////////////////////////////////////////////////////////////////////////////
	
		// Retrieve the class
		Classifier currentClass	= (Classifier) argument;


		// Prepare owned type and enum declaration
		String publicTypeDef		= "";
		String privateTypeDef		= "";
		String protectedTypeDef		= "";
		String publicEnumDef		= "";
		String privateEnumDef		= "";
		String protectedEnumDef		= "";
		String publicKeyword		= "public:";
		String protectedKeyword		= "protected:";
		String privateKeyword		= "private:";

		Iterator<Element> typeIt = currentClass.getOwnedElements().iterator();
		while (typeIt.hasNext()) {
			Element currentElt = typeIt.next();
			if (currentElt.getAppliedStereotype("PapyrusCpp::CppNoCodeGen") == null) {
				if (currentElt instanceof PrimitiveType) {

					org.eclipse.uml2.uml.PrimitiveType currentType	= (org.eclipse.uml2.uml.PrimitiveType) currentElt;
					CppPrimitiveTypeDefinition jetPrimitiveType	= new CppPrimitiveTypeDefinition();
					// Execute the util template
					if (currentType.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
						publicTypeDef = publicTypeDef+jetPrimitiveType.generate(currentType);
					} else if (currentType.getVisibility() == VisibilityKind.PROTECTED_LITERAL) {
						protectedTypeDef = protectedTypeDef+jetPrimitiveType.generate(currentType);
					} else if (currentType.getVisibility() == VisibilityKind.PRIVATE_LITERAL) {
						privateTypeDef = privateTypeDef+jetPrimitiveType.generate(currentType);
					}

				} else if (currentElt instanceof Enumeration) {

					Enumeration currentEnum	= (Enumeration) currentElt;
					CppEnumerationDefinition jetEnum = new CppEnumerationDefinition();
					// Execute the util template
					if (currentEnum.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
						publicEnumDef = publicEnumDef+jetEnum.generate(currentEnum);
					} else if (currentEnum.getVisibility() == VisibilityKind.PROTECTED_LITERAL) {
						protectedEnumDef = protectedEnumDef+jetEnum.generate(currentEnum);
					} else if (currentEnum.getVisibility() == VisibilityKind.PRIVATE_LITERAL) {
						privateEnumDef = privateEnumDef+jetEnum.generate(currentEnum);
					}

				}
			}
		}

		// If not "" add a comment before declarations
		if (publicTypeDef.equals("") && publicEnumDef.equals("")) {
			publicKeyword = "";
		} else {
			if (!publicTypeDef.equals("")) {
				publicTypeDef		= "/* Public type definitions                                  */"+NL+publicTypeDef;
			}
			if (!publicEnumDef.equals("")) {
				publicEnumDef		= "/* Public enumeration definitions                           */"+NL+publicEnumDef;
			}
		}

		if (protectedTypeDef.equals("") && protectedEnumDef.equals("")) {
			protectedKeyword = "";
		} else {
			if (!protectedTypeDef.equals("")) {
				protectedTypeDef	= "/* Protected type definitions                               */"+NL+protectedTypeDef;
			}
			if (!protectedEnumDef.equals("")) {
				protectedEnumDef	= "/* Protected enumeration definitions                        */"+NL+protectedEnumDef;
			}
		}

		if (privateTypeDef.equals("") && privateEnumDef.equals("")) {
			privateKeyword = "";
		} else {
			if (!privateTypeDef.equals("")) {
				privateTypeDef		= "/* Private type definitions                                 */"+NL+privateTypeDef;
			}
			if (!privateEnumDef.equals("")) {
				privateEnumDef		= "/* Private enumeration definitions                          */"+NL+privateEnumDef;
			}
		}
	
//////////////////////////////////////////////////////////////////////////////////////////
// The following part contains the template
//////////////////////////////////////////////////////////////////////////////////////////
    stringBuffer.append(TEXT_1);
    stringBuffer.append( publicKeyword );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( publicTypeDef );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( publicEnumDef );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( protectedKeyword );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( protectedTypeDef );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( protectedEnumDef );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( privateKeyword );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( privateTypeDef );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( privateEnumDef );
    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}