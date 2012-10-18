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
package com.cea.ec3m.gentools.core;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

// TODO: mixture of model and Eclipse project management. Move parts depending on CDT into
// a separate plugin

public class ProjectManagement {

	/**
	 * Retrieve current project from active editor
	 * 
	 * @return
	 */
	public static IProject getCurrentProject() {
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		// Maybe null, if opened via model explorer
		if(editorPart == null) {
			return null;
		}
		IEditorInput editorInput = editorPart.getEditorInput();
		if(editorInput instanceof IFileEditorInput) {
			return ((IFileEditorInput)editorInput).getFile().getProject();
		}
		return null;
	}

	public static IProject getNamedProject(String projectName) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		if(root != null) {
			return root.getProject(projectName);
		}
		return null;
	}
}
