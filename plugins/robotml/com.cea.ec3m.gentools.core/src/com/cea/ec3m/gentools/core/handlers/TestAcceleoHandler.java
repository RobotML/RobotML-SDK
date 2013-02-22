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
package com.cea.ec3m.gentools.core.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;

import com.cea.ec3m.gentools.core.ModelManagement;
import com.cea.ec3m.gentools.core.Utils;
import com.cea.ec3m.gentools.core.dialogs.TestAcceleoDialog;
import com.cea.ec3m.gentools.core.transformations.Copy;
import com.cea.ec3m.gentools.core.transformations.InstantiateDepPlan;
import com.cea.ec3m.gentools.core.transformations.TransformationException;

public class TestAcceleoHandler extends CmdHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		EObject selectedObj = getSelectedEObject();
		if(selectedObj instanceof NamedElement) {
			return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(!(getSelectedEObject() instanceof NamedElement)) {
			return null;
		}
		NamedElement selectedNE = (NamedElement)getSelectedEObject();
		// test(selectedNE); return null;

		TestAcceleoDialog tag = new TestAcceleoDialog(new Shell(), selectedNE);
		tag.open();
		return null;
	}

	// TODO: This code is here for testing the copy mechanisms. It should move to a separate
	// plugin (it can be called by "execute" above).
	public static void test(NamedElement selectedNE) {
		
		//This method is deactivated because it is not used in RobotML platform, RobotML generators are used instead
//		try {
//			org.eclipse.uml2.uml.Package top = Utils.getTop(selectedNE);
//
//			ModelManagement tst = InstantiateDepPlan.createTargetModel((Model)top, new NullProgressMonitor(), "Test", false);
//			Model target = tst.getModel();
//			Copy myCopy = new Copy(top, target, false);
//			NamedElement copy = myCopy.getCopy(selectedNE);
//
//			//copy = (NamedElement)copier.copy(selectedNE);
//			System.err.println("orig");
//			for(EObject eobj : selectedNE.getStereotypeApplications()) {
//				System.err.println(eobj);
//			}
//			System.err.println("copy");
//			for(EObject eobj : copy.getStereotypeApplications()) {
//				System.err.println(eobj);
//			}
//		} catch (TransformationException e) {
//		}
	}
}
