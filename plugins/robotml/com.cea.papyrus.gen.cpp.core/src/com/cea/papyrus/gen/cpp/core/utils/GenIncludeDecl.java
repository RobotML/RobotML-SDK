/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 *
 *****************************************************************************/
package com.cea.papyrus.gen.cpp.core.utils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;

import com.cea.papyrus.gen.cpp.core.CppStereo;
import com.cea.papyrus.gen.cpp.core.jet.util.CppClassIncludeDeclaration;
import com.cea.papyrus.gen.cpp.core.jet.util.CppOwnerPackageIncludeDeclaration;

public class GenIncludeDecl
{
	public static String createIncludeDecl (EList<Classifier> usedClassifiers, Classifier currentCl)
	{
		String includes = "";
		String forwardDecls = "// forward declarations\n";
		
		// avoid duplicates
		EList<Package> ownerPackages = new UniqueEList<Package> ();

		for (Classifier cl : usedClassifiers) {
		
			// Only add include if this is not for the current class
			if (!currentCl.equals(cl)) {
				// ... and if it does not have the stereotype "CppNoCodeGen", unless
				// it has stereotype "CppExternalClass"
				if ( (!GenUtils.hasStereotype(cl, CppStereo.noCodeGen)) ||
					 GenUtils.hasStereotype(cl, CppStereo.externClass)) {
					String newInclude = "";
				
					if ((cl instanceof Enumeration) || (cl instanceof PrimitiveType))
					{
						// Enumeration is not defined in a separate file, but in the
						// package that owns it => include the owning package (might be a duplicate input, if owning
						// package is also the owner of current class)
						if (cl.getOwner() instanceof Package) {
							Package owner = (Package) cl.getOwner ();
							if (!ownerPackages.contains (owner)) {
								ownerPackages.add (owner);
								CppOwnerPackageIncludeDeclaration jetIDecl
									= new CppOwnerPackageIncludeDeclaration();
								newInclude = jetIDecl.generate (owner);
							}
						}
					}
					else {
						// include the file associated with the classifier 
						CppClassIncludeDeclaration jetIDecl
							= new CppClassIncludeDeclaration();
						newInclude = jetIDecl.generate (cl);
					}

					includes = includes + newInclude;
					
					// generate a forward declaration
					// this is useful, even if the ".h" file associated with the class is included:
					//   in case of cyclic dependencies, the include file may actually not be included since
					//   its #ifndef rule will exclude code.
					//   Don't generate forward for external classes, which may actually be non-classes
					/*
					if ((cl instanceof Class) && !GenUtils.hasStereotype(cl, CppStereo.externClass)) {
						Class classWithoutBinding = (Class) cl;
						if (classWithoutBinding.getTemplateBindings().isEmpty()) {
							CppClassIncludeClassDeclaration jetCDecl
								= new CppClassIncludeClassDeclaration();
							String newClass = jetCDecl.generate(classWithoutBinding);
								forwardDecls += newClass;
						}
					}
					*/
				}
			}
		}
		includes += forwardDecls;
		return includes;
	}
}
