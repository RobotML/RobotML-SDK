/*****************************************************************************
 * Copyright (c) 2013 DASSAULT AVIATION.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Nicolas BRODNAN (Dassault Aviation) nicolas.brodnan@gmail.com - Configuration generation
 *****************************************************************************/
package org.eclipse.robotml.generators.acceleo.athena.files;

import java.io.File;

import org.eclipse.uml2.uml.Model;

/**
 * 
 * @author nbrodnan
 * Class to configure the athena generation from RobotML
 */
public class configGenerator {
	
	private static boolean automaticMode = true;
	private static String athenaFolder = "";
	private static String modelName = "";
	
	/**
	 * Define the automatic generation
	 * @param mode
	 */
	public static void setAutomaticGeneration(boolean mode)
	{
		configGenerator.automaticMode = mode;
	}
	
	/**
	 * Inform is generation is automatic
	 * @return
	 */
	public static boolean isAutomaticGeneration()
	{
		return configGenerator.automaticMode;
	}
	
	/**
	 * Inform if the datatype file is needed
	 * @return
	 */
	public static boolean createDataTypesFile()
	{
		File dataFile = new File( configGenerator.athenaFolder + File.separator + "datatypes.adl");
		return !(dataFile.exists());
	}
	
	/**
	 * Define the athena generation folder
	 * @param folder
	 */
	public static void setAthenaFolder(String folder)
	{
		configGenerator.athenaFolder = folder;
	}
	
	/**
	 * Define the model name to export
	 * @param name
	 */
	public static void setModelNameSelected(String name)
	{
		configGenerator.modelName = name;
	}
	
	/**
	 * Inform if the model to export is selected 
	 * @param model
	 * @return selected
	 */
	public static boolean isModelNameSelected(Model model)
	{
		return modelName.equals(model.getName());
	}

}
