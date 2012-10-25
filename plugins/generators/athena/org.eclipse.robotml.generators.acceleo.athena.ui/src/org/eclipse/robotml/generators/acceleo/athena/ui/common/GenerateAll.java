/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.robotml.generators.acceleo.athena.ui.common;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;


/**
 * Main entry point of the 'Athena' generation module.
 */
public class GenerateAll {

	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;
	
	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll(URI modelURI, IContainer targetFolder, List<? extends Object> arguments) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}
		
		// final URI template0 = getTemplateURI("org.eclipse.proteus.generators.acceleo", new Path("/org/eclipse/proteus/generators/acceleo/mmqueries/MMQueries.emtl"));
		// org.eclipse.proteus.generators.acceleo.mmqueries.MMQueries gen0 = new org.eclipse.proteus.generators.acceleo.mmqueries.MMQueries(modelURI, targetFolder.getLocation().toFile(), arguments) {
		//	protected URI createTemplateURI(String entry) {
		//		return template0;
		//	}
		//};
		//gen0.doGenerate(BasicMonitor.toMonitor(monitor));
//		monitor.subTask("Loading...");
//		MMQueries gen0 = new MMQueries(modelURI, targetFolder.getLocation().toFile(), arguments);
//		monitor.worked(1);
//		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.eclipse.proteus.generators.acceleo", "org.eclipse.proteus.generators.acceleo.mmqueries.MMQueries", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
//		gen0.setGenerationID(generationID);
//		gen0.doGenerate(BasicMonitor.toMonitor(monitor));
			
		//EObject model = gen0.getModel();
		//if (model != null) {
				
			//final URI template1 = getTemplateURI("org.eclipse.proteus.generators.acceleo.athena", new Path("/org/eclipse/proteus/generators/acceleo/athena/files/generateAthena.emtl"));
			//org.eclipse.proteus.generators.acceleo.athena.files.GenerateAthena gen1 = new org.eclipse.proteus.generators.acceleo.athena.files.GenerateAthena(model, targetFolder.getLocation().toFile(), arguments) {
			//	protected URI createTemplateURI(String entry) {
			//		return template1;
			//	}
			//};
			//gen1.doGenerate(BasicMonitor.toMonitor(monitor));
		
//			//Nico
//			monitor.subTask("Loading...");
//			org.eclipse.proteus.generators.acceleo.athena.files.GenerateTypes gen0 = new org.eclipse.proteus.generators.acceleo.athena.files.GenerateTypes(modelURI, targetFolder.getLocation().toFile(), arguments);
//			monitor.worked(1);
//			String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.eclipse.proteus.generators.acceleo.athena", "org.eclipse.proteus.generators.acceleo.athena.files.GenerateTypes", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
//			gen0.setGenerationID(generationID);
//			gen0.doGenerate(BasicMonitor.toMonitor(monitor));
//			
//			//End nico
			
			monitor.subTask("Loading...");
			org.eclipse.robotml.generators.acceleo.athena.files.GenerateAthena gen1 = new org.eclipse.robotml.generators.acceleo.athena.files.GenerateAthena(modelURI, targetFolder.getLocation().toFile(), arguments);
			monitor.worked(1);
			String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.eclipse.proteus.generators.acceleo.athena", "org.eclipse.proteus.generators.acceleo.athena.files.GenerateAthena", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
			gen1.setGenerationID(generationID);
			gen1.doGenerate(BasicMonitor.toMonitor(monitor));
			
//			//final URI template2 = getTemplateURI("org.eclipse.proteus.generators.acceleo.athena", new Path("/org/eclipse/proteus/generators/acceleo/athena/files/generateFunctions.emtl"));
//			//org.eclipse.proteus.generators.acceleo.athena.files.GenerateFunctions gen2 = new org.eclipse.proteus.generators.acceleo.athena.files.GenerateFunctions(model, targetFolder.getLocation().toFile(), arguments) {
//			//	protected URI createTemplateURI(String entry) {
//			//		return template2;
//			//	}
//			//};
//			//gen2.doGenerate(BasicMonitor.toMonitor(monitor));
//			
//			monitor.subTask("Loading...");
//			org.eclipse.proteus.generators.acceleo.athena.files.GenerateFunctions gen2 = new org.eclipse.proteus.generators.acceleo.athena.files.GenerateFunctions(modelURI, targetFolder.getLocation().toFile(), arguments);
//			monitor.worked(1);
//			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.eclipse.proteus.generators.acceleo.athena", "org.eclipse.proteus.generators.acceleo.athena.files.GenerateFunctions", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
//			gen2.setGenerationID(generationID);
//			gen2.doGenerate(BasicMonitor.toMonitor(monitor));
//			//final URI template3 = getTemplateURI("org.eclipse.proteus.generators.acceleo.athena", new Path("/org/eclipse/proteus/generators/acceleo/athena/files/generateProcessings.emtl"));
//			//org.eclipse.proteus.generators.acceleo.athena.files.GenerateProcessings gen3 = new org.eclipse.proteus.generators.acceleo.athena.files.GenerateProcessings(model, targetFolder.getLocation().toFile(), arguments) {
//			//	protected URI createTemplateURI(String entry) {
//			//		return template3;
//			//	}
//			//};
//			//gen3.doGenerate(BasicMonitor.toMonitor(monitor));
//			
//			monitor.subTask("Loading...");
//			org.eclipse.proteus.generators.acceleo.athena.files.GenerateProcessings gen3 = new org.eclipse.proteus.generators.acceleo.athena.files.GenerateProcessings(modelURI, targetFolder.getLocation().toFile(), arguments);
//			monitor.worked(1);
//			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.eclipse.proteus.generators.acceleo.athena", "org.eclipse.proteus.generators.acceleo.athena.files.GenerateProcessings", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
//			gen3.setGenerationID(generationID);
//			gen3.doGenerate(BasicMonitor.toMonitor(monitor));
//			//final URI template4 = getTemplateURI("org.eclipse.proteus.generators.acceleo.athena", new Path("/org/eclipse/proteus/generators/acceleo/athena/files/generatePrototypes.emtl"));
//			//org.eclipse.proteus.generators.acceleo.athena.files.GeneratePrototypes gen4 = new org.eclipse.proteus.generators.acceleo.athena.files.GeneratePrototypes(model, targetFolder.getLocation().toFile(), arguments) {
//			//	protected URI createTemplateURI(String entry) {
//			//		return template4;
//			//	}
//			//};
//			//gen4.doGenerate(BasicMonitor.toMonitor(monitor));
//			
//			monitor.subTask("Loading...");
//			org.eclipse.proteus.generators.acceleo.athena.files.GeneratePrototypes gen4 = new org.eclipse.proteus.generators.acceleo.athena.files.GeneratePrototypes(modelURI, targetFolder.getLocation().toFile(), arguments);
//			monitor.worked(1);
//			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.eclipse.proteus.generators.acceleo.athena", "org.eclipse.proteus.generators.acceleo.athena.files.GeneratePrototypes", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
//			gen4.setGenerationID(generationID);
//			gen4.doGenerate(BasicMonitor.toMonitor(monitor));
//			//final URI template5 = getTemplateURI("org.eclipse.proteus.generators.acceleo.athena", new Path("/org/eclipse/proteus/generators/acceleo/athena/files/generateTypes.emtl"));
//			//org.eclipse.proteus.generators.acceleo.athena.files.GenerateTypes gen5 = new org.eclipse.proteus.generators.acceleo.athena.files.GenerateTypes(model, targetFolder.getLocation().toFile(), arguments) {
//			//	protected URI createTemplateURI(String entry) {
//			//		return template5;
//			//	}
//			//};
//			//gen5.doGenerate(BasicMonitor.toMonitor(monitor));
//			
//			monitor.subTask("Loading...");
//			org.eclipse.proteus.generators.acceleo.athena.files.GenerateTypes gen5 = new org.eclipse.proteus.generators.acceleo.athena.files.GenerateTypes(modelURI, targetFolder.getLocation().toFile(), arguments);
//			monitor.worked(1);
//			generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("org.eclipse.proteus.generators.acceleo.athena", "org.eclipse.proteus.generators.acceleo.athena.files.GenerateTypes", modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
//			gen5.setGenerationID(generationID);
//			gen5.doGenerate(BasicMonitor.toMonitor(monitor));
//		//}
			
		
	}
	
	/**
	 * Finds the template in the plug-in. Returns the template plug-in URI.
	 * 
	 * @param bundleID
	 *            is the plug-in ID
	 * @param relativePath
	 *            is the relative path of the template in the plug-in
	 * @return the template URI
	 * @throws IOExceptionorg.eclipse.uml2.uml
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	private URI getTemplateURI(String bundleID, IPath relativePath) throws IOException {
		Bundle bundle = Platform.getBundle(bundleID);
		if (bundle == null) {
			// no need to go any further
			return URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		URL url = bundle.getEntry(relativePath.toString());
		if (url == null && relativePath.segmentCount() > 1) {
			Enumeration<URL> entries = bundle.findEntries("/", "*.emtl", true);
			if (entries != null) {
				String[] segmentsRelativePath = relativePath.segments();
				while (url == null && entries.hasMoreElements()) {
					URL entry = entries.nextElement();
					IPath path = new Path(entry.getPath());
					if (path.segmentCount() > relativePath.segmentCount()) {
						path = path.removeFirstSegments(path.segmentCount() - relativePath.segmentCount());
					}
					String[] segmentsPath = path.segments();
					boolean equals = segmentsPath.length == segmentsRelativePath.length;
					for (int i = 0; equals && i < segmentsPath.length; i++) {
						equals = segmentsPath[i].equals(segmentsRelativePath[i]);
					}
					if (equals) {
						url = bundle.getEntry(entry.getPath());
					}
				}
			}
		}
		URI result;
		if (url != null) {
			result = URI.createPlatformPluginURI(new Path(bundleID).append(new Path(url.getPath())).toString(), false);
		} else {
			result = URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		return result;
	}

}
