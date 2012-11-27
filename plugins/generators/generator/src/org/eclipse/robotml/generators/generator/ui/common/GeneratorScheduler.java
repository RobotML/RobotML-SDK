/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.common;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil;
import org.eclipse.papyrus.infra.widgets.util.FileUtil;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.robotml.generators.generator.ui.xml.Configuration;
import org.eclipse.robotml.generators.generator.ui.xml.ESourceGenerator;

/**
 * @author nbrodnan
 *
 */
public class GeneratorScheduler {
	
	private HashMap<String, AbstractAcceleoGenerator> _generators = new HashMap<String, AbstractAcceleoGenerator>();
	
	/**
	 * Add a new generator
	 * @param generator_name
	 */
	public void add(String generator_name)
	{
		try	{
			this._generators.put(generator_name, GeneratorFactory.create(generator_name));
		} catch (SecurityException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		} catch (NoSuchMethodException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		} catch (InstantiationException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		} catch (IllegalAccessException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		} catch (InvocationTargetException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		}
	}
	
	public void generate(IProgressMonitor monitor)
	{
		this.generateForModelSource(monitor);
		this.generateForFileSource(monitor);
	}
	
	/**
	 * Execute the created generators
	 * @param monitor
	 */
	private void doGenerate(IProgressMonitor monitor, String gen_name)
	{
		
		monitor.subTask("Initialize " + gen_name + " generator ...");
		try {
			initializeGenerator(gen_name);
			monitor.subTask("Run " + gen_name + " generator ...");

			this._generators.get(gen_name).doGenerate(BasicMonitor.toMonitor(monitor));
			
		} 
		catch (IOException e) 
		{
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			//e.printStackTrace();
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
	}
	
	/**
	 * generate code using a source model
	 * @param monitor
	 */
	private void generateForModelSource(IProgressMonitor monitor)
	{
		for(String gen_name : this._generators.keySet())
		{
			if(ESourceGenerator.MODEL_SOURCE.equals(Configuration.getInstance().getGenerator_Source(gen_name)))
			{
				this.doGenerate(monitor, gen_name);
			}
		}	
	}
	
	/**
	 * Generate code using a generated source file
	 * @param monitor
	 */
	private void generateForFileSource(IProgressMonitor monitor)
	{
		for(String gen_name : this._generators.keySet())
		{
			if(ESourceGenerator.FILE_SOURCE.equals(Configuration.getInstance().getGenerator_Source(gen_name)))
			{
				this.doGenerate(monitor, gen_name);
			}
		}
	}
	
	/**
	 * Initialize the created generators
	 * @param gen_name
	 * @throws IOException
	 */
	private void initializeGenerator(String gen_name) throws IOException
	{
		String gen_class = Configuration.getInstance().getGenerator_MainClass(gen_name);
		String gen_id = Configuration.getInstance().getGenerator_Id(gen_name);
		URI sourceURI = null;
		if(ESourceGenerator.MODEL_SOURCE.equals(Configuration.getInstance().getGenerator_Source(gen_name)))
		{
			sourceURI = Configuration.getInstance().getModelURI();
		}
		else
		{
			String src_gen =Configuration.getInstance().getGenerator_SrcGenerator(gen_name) ;
			//deduire le fichier source pour les generateur via fichiers
			String source = Configuration.getInstance().getTrunkTarget();
			source += File.separatorChar;
			source += Configuration.getInstance().getGenerator_TargetFolder(src_gen) + File.separatorChar;
			source += Configuration.getInstance().getTargetName() + "." + Configuration.getInstance().getGenerator_FileExtension(gen_name);
			
			//File tmp = FileUtil.getWorkspaceFile(source);
			
			sourceURI = URI.createPlatformResourceURI(source, true);
//			System.out.println(Configuration.getInstance().getModelURI().path());
		}
		String target = Configuration.getInstance().getTrunkTarget();
		target += File.separatorChar;
		target += Configuration.getInstance().getGenerator_TargetFolder(gen_name);
		
		/*
		 * Create target directory
		 */
		File targetFolder = FileUtil.getWorkspaceFile(target); //$NON-NLS-1$ //$NON-NLS-2$
		if(!targetFolder.getParentFile().exists()) {
			targetFolder.getParentFile().mkdirs();
		}
		
		this._generators.get(gen_name).initialize(sourceURI, targetFolder, new ArrayList<Object>());
		
		String generationID = AcceleoLaunchingUtil.computeUIProjectID(gen_id, gen_class, sourceURI.toString(), target, new ArrayList<String>());
		this._generators.get(gen_name).setGenerationID(generationID);
	}
}
