/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Saadia DHOUIB (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.robotml.generators.xtext.athena.vle.ui.handler;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.generators.xtext.athena.vle.main.GenerateVLE;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.Type;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.CombinedPopupAndViewBuilder;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;


// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoVLECodeGenerator.
 */
public class AcceleoVLECodeGenerator {

	/** The input model for the acceleo generator. */
	private EObject generationInputModel;

	/** the athena source folder. */
	private File athenaTargetFolder;

	/**
	 * Instantiates a new acceleo rt maps code generator.
	 */
	public AcceleoVLECodeGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Run acceleo transformation.
	 * 
	 * @param generationInputModel
	 *        the generation input model
	 * @param vleTargetFolderPath
	 *        the athena target folder path
	 */
	public void runAcceleoTransformation(IProgressMonitor monitor,EObject generationInputModel, String vleTargetFolderPath) {
		
		//System.out.println("acceleo athena code generator run !!!");
		/*
		 * Here it's not the automatic generation
		 */
		
		this.generationInputModel = generationInputModel;
		this.athenaTargetFolder = new File(vleTargetFolderPath);
		if(this.generationInputModel != null && this.athenaTargetFolder != null) {
			try {

				File targetFolder = FileUtil.getWorkspaceFile(vleTargetFolderPath);				
				if(!targetFolder.getParentFile().exists()) {
					targetFolder.getParentFile().mkdirs();
				}
				
//				Model model = (Model)this.generationInputModel;
//				if(model.getOwner() != null)
//				{
//					configGenerator.setAutomaticGeneration(false);
//					configGenerator.setModelNameSelected(model.getName());
//				}
//				else
//				{
//					configGenerator.setAutomaticGeneration(true);
//					configGenerator.setModelNameSelected("");
//				}
//				configGenerator.setAthenaFolder(targetFolder.getAbsolutePath());
				
				
				
				//Instantiate a new acceleo generator 
				monitor.subTask("loading...");
				GenerateVLE generate = new GenerateVLE(this.generationInputModel, targetFolder, Collections.EMPTY_LIST);
				monitor.worked(1);
				generate.doGenerate(BasicMonitor.toMonitor(monitor));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			new NotificationBuilder().setBuilderClass(CombinedPopupAndViewBuilder.class).setType(Type.ERROR).setTitle("Acceleo generation error").setMessage("You have to set the parameters of the generation").run();
		}

	}

}
