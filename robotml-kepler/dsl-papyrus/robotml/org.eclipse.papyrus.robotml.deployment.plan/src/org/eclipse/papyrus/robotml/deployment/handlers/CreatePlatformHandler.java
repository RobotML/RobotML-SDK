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
package org.eclipse.papyrus.robotml.deployment.handlers;

import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.RobotML.Environment;
import org.eclipse.papyrus.RobotML.Platform;
import org.eclipse.papyrus.robotml.deployment.DepCreation;
import org.eclipse.papyrus.robotml.deployment.core.CommandSupport;
import org.eclipse.papyrus.robotml.deployment.core.Utils;
import org.eclipse.papyrus.robotml.deployment.transformations.TransformationException;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;

public class CreatePlatformHandler extends CmdHandler {

	private Package platform;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		EObject selectedObj = getSelectedEObject();
		if(selectedObj instanceof Class && isPlatform((Class)selectedObj)) {
			return true;
		}
		return false;
	}

	private boolean isPlatform(Class elt){
		Platform platform = UMLUtil.getStereotypeApplication((Class)elt, Platform.class);
		if (platform != null){
			return true;
		}
		return false;
		
		
	}
	/**
	 * {@inheritDoc}
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(!(getSelectedEObject() instanceof Class)) {
			return null;
		}
		final Class selectedComposite = (Class)getSelectedEObject();

		CommandSupport.exec("Create platform model", new Runnable() {

			public void run() {
				// execute with transaction support
				platform = Utils.getRoot(selectedComposite, "PlatformModel");
			}
		});

		final String newPlatform = selectedComposite.getName() + "Platform";

		try {
			if(platform.getMember(newPlatform) != null) {
				Shell shell = new Shell();
				MessageDialog.openInformation(shell, "Error",
					"Platform definition \"" + newPlatform + "\" exists already");
			} else {
				CommandSupport.exec("Create platform definition", new Runnable() {

					public void run() {
						Package platformPkg = platform.createNestedPackage(newPlatform);
						try {
							DepCreation.createPlatformInstances(platformPkg, selectedComposite, null);
						}
						catch (TransformationException e) {
							System.err.println(e);
						}
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
