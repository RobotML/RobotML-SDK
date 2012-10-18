package org.eclipse.robotml.generators.acceleo.athena.files;

import java.io.File;

import org.eclipse.uml2.uml.Model;

public class configGenerator {
	
	private static boolean automaticMode = true;
	
	private static String athenaFolder = "";
	
	private static String modelName = "";
	
	public static void setAutomaticGeneration(boolean mode)
	{
		configGenerator.automaticMode = mode;
	}
	
	public static boolean isAutomaticGeneration()
	{
		return configGenerator.automaticMode;
	}
	
	public static boolean createDataTypesFile()
	{
		File dataFile = new File( configGenerator.athenaFolder + File.separator + "datatypes.adl");
		return !(dataFile.exists());
	}
	
	public static void setAthenaFolder(String folder)
	{
		configGenerator.athenaFolder = folder;
	}
	
	public static void setModelNameSelected(String name)
	{
		configGenerator.modelName = name;
	}
	
	public static boolean isModelNameSelected(Model model)
	{
		return modelName.equals(model.getName());
	}

}
