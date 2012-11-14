/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
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
package org.eclipse.acceleo.module.OrocosGenerator.ui.handler;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.acceleo.module.OrocosGenerator.main.Main;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.widget.toolbox.notification.Type;
import org.eclipse.papyrus.infra.widget.toolbox.notification.builders.CombinedPopupAndViewBuilder;
import org.eclipse.papyrus.infra.widget.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class AcceleoOrocosCodeGenerator.
 */
public class AcceleoOrocosCodeGenerator {
	/** The input model for the acceleo generator. */
	private EObject generationInputModel;

	/** the rtmaps source folder. */
	private File orocosTargetFolder;

	/**
	 * Instantiates a new acceleo orocos code generator.
	 */
	public AcceleoOrocosCodeGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Run acceleo transformation.
	 * 
	 * @param generationInputModel
	 *        the generation input model
	 * @param rtmapsTargetFolderPath
	 *        the orocos target folder path
	 */
	public void runAcceleoTransformation(EObject generationInputModel, String rtmapsTargetFolderPath) {
		this.generationInputModel = generationInputModel;
		this.orocosTargetFolder = new File(rtmapsTargetFolderPath);
		if(this.generationInputModel != null && this.orocosTargetFolder != null) {
			try {

				File targetFolder = FileUtil.getWorkspaceFile(rtmapsTargetFolderPath); //$NON-NLS-1$ //$NON-NLS-2$
				if(!targetFolder.getParentFile().exists()) {
					targetFolder.getParentFile().mkdirs();
				}
				//Instantiate a new acceleo generator 
				Main generate = new Main(this.generationInputModel, targetFolder, Collections.EMPTY_LIST);

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
