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
package org.eclipse.robotml.generators.acceleo.athena.ui.handler;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.Type;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.CombinedPopupAndViewBuilder;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import org.eclipse.robotml.generators.acceleo.athena.files.GenerateAthena;
import org.eclipse.robotml.generators.acceleo.athena.files.configGenerator;
import org.eclipse.uml2.uml.Model;


// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoRTMapsCodeGenerator.
 */
public class AcceleoAthenaCodeGenerator {

	/** The input model for the acceleo generator. */
	private EObject generationInputModel;

	/** the athena source folder. */
	private File athenaTargetFolder;

	/**
	 * Instantiates a new acceleo rt maps code generator.
	 */
	public AcceleoAthenaCodeGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Run acceleo transformation.
	 * 
	 * @param generationInputModel
	 *        the generation input model
	 * @param athenaTargetFolderPath
	 *        the athena target folder path
	 */
	public void runAcceleoTransformation(IProgressMonitor monitor,EObject generationInputModel, String athenaTargetFolderPath) {
		
		//System.out.println("acceleo athena code generator run !!!");
		/*
		 * Here it's not the automatic generation
		 */
		
		this.generationInputModel = generationInputModel;
		this.athenaTargetFolder = new File(athenaTargetFolderPath);
		if(this.generationInputModel != null && this.athenaTargetFolder != null) {
			try {

				File targetFolder = FileUtil.getWorkspaceFile(athenaTargetFolderPath);				
				if(!targetFolder.getParentFile().exists()) {
					targetFolder.getParentFile().mkdirs();
				}
				
				Model model = (Model)this.generationInputModel;
				if(model.getOwner() != null)
				{
					configGenerator.setAutomaticGeneration(false);
					configGenerator.setModelNameSelected(model.getName());
				}
				else
				{
					configGenerator.setAutomaticGeneration(true);
					configGenerator.setModelNameSelected("");
				}
				configGenerator.setAthenaFolder(targetFolder.getAbsolutePath());
				
				
				
				//Instantiate a new acceleo generator 
				monitor.subTask("loading...");
				GenerateAthena generate = new GenerateAthena(this.generationInputModel, targetFolder, Collections.EMPTY_LIST);
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
