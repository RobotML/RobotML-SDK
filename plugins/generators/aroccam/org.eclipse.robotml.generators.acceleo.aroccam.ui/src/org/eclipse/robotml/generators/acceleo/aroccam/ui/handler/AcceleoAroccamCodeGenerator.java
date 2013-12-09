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
package org.eclipse.robotml.generators.acceleo.aroccam.ui.handler;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.Type;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.CombinedPopupAndViewBuilder;
import org.eclipse.papyrus.infra.widgets.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import org.eclipse.robotml.generators.acceleo.aroccam.Generate_aroccam;


// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoAroccamCodeGenerator.
 */
public class AcceleoAroccamCodeGenerator {

	/** The input model for the acceleo generator. */
	private EObject generationInputModel;

	/** the aroccam source folder. */
	private File aroccamTargetFolder;

	/**
	 * Instantiates a new acceleo rt maps code generator.
	 */
	public AcceleoAroccamCodeGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Run acceleo transformation.
	 * 
	 * @param generationInputModel
	 *        the generation input model
	 * @param aroccamTargetFolderPath
	 *        the aroccam target folder path
	 */
	public void runAcceleoTransformation(EObject generationInputModel, String aroccamTargetFolderPath) {
		this.generationInputModel = generationInputModel;
		this.aroccamTargetFolder = new File(aroccamTargetFolderPath);
		if(this.generationInputModel != null && this.aroccamTargetFolder != null) {
			try {

				File targetFolder = FileUtil.getWorkspaceFile(aroccamTargetFolderPath); //$NON-NLS-1$ //$NON-NLS-2$
				if(!targetFolder.getParentFile().exists()) {
					targetFolder.getParentFile().mkdirs();
				}
				//Instantiate a new acceleo generator 
				@SuppressWarnings("unchecked")
				Generate_aroccam generate = new Generate_aroccam(this.generationInputModel, targetFolder, Collections.EMPTY_LIST);

				generate.doGenerate(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			new NotificationBuilder().setBuilderClass(CombinedPopupAndViewBuilder.class).setType(Type.ERROR).setTitle("Acceleo genration error").setMessage("You have to set the parameters of the generation").run();
		}

	}

}
