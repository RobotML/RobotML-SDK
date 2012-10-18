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
package org.eclipse.proteus.generators.acceleo.morse.ui.handler;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.ui.toolbox.notification.Type;
import org.eclipse.papyrus.ui.toolbox.notification.builders.CombinedPopupAndViewBuilder;
import org.eclipse.papyrus.ui.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.papyrus.widgets.util.FileUtil;
import org.eclipse.proteus.generators.acceleo.morse.main.Generate;

/**
 * The Class AcceleoMorseCodeGenerator.
 */
public class AcceleoMorseCodeGenerator {

	/** The input model for the acceleo generator. */
	private EObject generationInputModel;

	/** the morse source folder. */
	private File morseTargetFolder;

	/**
	 * Instantiates a new acceleo Morse code generator.
	 */
	public AcceleoMorseCodeGenerator() {
		super();
	}

	/**
	 * Run acceleo transformation.
	 * 
	 * @param generationInputModel
	 *        the generation input model
	 * @param morseTargetFolderPath
	 *        the morse target folder path
	 */
	public void runAcceleoTransformation(EObject generationInputModel, String morseTargetFolderPath) {
		this.generationInputModel = generationInputModel;
		this.morseTargetFolder = new File(morseTargetFolderPath);
		if(this.generationInputModel != null && this.morseTargetFolder != null) {
			try {

				File targetFolder = FileUtil.getWorkspaceFile(morseTargetFolderPath); //$NON-NLS-1$ //$NON-NLS-2$
				if(!targetFolder.getParentFile().exists()) {
					targetFolder.getParentFile().mkdirs();
				}
				// Instantiate a new acceleo generator 
				Generate generate = new Generate(this.generationInputModel, targetFolder, Collections.EMPTY_LIST);

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
