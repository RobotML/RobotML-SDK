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

package com.cea.ec3m.gentools.core.acceleo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

import com.cea.ec3m.gentools.core.Activator;
import com.cea.ec3m.gentools.core.transformations.TransformationException;

//import fr.obeo.acceleo.ecore.factories.FactoryException;
//import fr.obeo.acceleo.gen.template.Template;
//import fr.obeo.acceleo.gen.template.TemplateSyntaxExceptions;
//import fr.obeo.acceleo.gen.template.eval.ENode;
//import fr.obeo.acceleo.gen.template.eval.ENodeException;
//import fr.obeo.acceleo.gen.template.eval.LaunchManager;
//import fr.obeo.acceleo.gen.template.scripts.IScript;
//import fr.obeo.acceleo.gen.template.scripts.SpecificScript;
//import fr.obeo.acceleo.tools.classloaders.AcceleoClassLoader;
//import fr.obeo.acceleo.tools.plugins.AcceleoModuleProvider;
//import fr.obeo.acceleo.tools.resources.Resources;

public class AcceleoDriver {

	public static final String relativePath = "src/" + Activator.PLUGIN_ID.replace(".", "/") + "/acceleo/gen.mt";

	public static final String baseScript = "platform:/plugin/" + Activator.PLUGIN_ID + "/" + relativePath;

	public static void init() throws TransformationException {
//		try {
//			// IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//			// IFile ifile = root.getFileForLocation (new Path (baseScript));
//
//			// URL url = Activator.getDefault().getBundle().getResource("resources/gen.mt");
//			URL url = new URL(baseScript);
//			File file = new File(Resources.transformToAbsolutePath(url));
//			if(!file.exists()) {
//				throw new TransformationException("initial Acceleo script: " + relativePath + "not found");
//			}
//
//			// register associated beetween plugin and baseScript
//			IPath path = new Path(relativePath);
//			AcceleoModuleProvider.getDefault().getFile(Activator.PLUGIN_ID, path);
//
//			ClassLoader loader = AcceleoDriver.class.getClassLoader();
//			AcceleoClassLoader.setPreferredClassLoader(loader);
//
//			script = new SpecificScript(file);
//			script.reset();
//		} catch (TemplateSyntaxExceptions except) {
//			System.err.println("Wrong template syntax!");
//			except.printStackTrace();
//		} catch (MalformedURLException urlException) {
//			throw new TransformationException("Malformed URL of initial Acceleo script" + relativePath);
//		}
	}

	/**
	 * Execute a script passed as parameter. It will be executed in the context
	 * of a base script that declares the meta-model (UML2) and has additional
	 * imports (currently none).
	 * 
	 * @param template
	 *        The template in string form
	 * @param element
	 *        The UML element to which the template is applied
	 * @return the evaluated template
	 */
	public static String bind(String templateStr, Element element) throws TransformationException {
		return bind(templateStr, element, null);
	}

	/**
	 * Execute a script passed as parameter. It will be executed in the context
	 * of a base script that declares the meta-model (UML2) and has additional
	 * imports (currently none).
	 * 
	 * @param template
	 *        The template in string form
	 * @param element
	 *        The UML element to which the template is applied
	 * @param args
	 *        an array of arguments that are passed to the template. Each argument
	 *        must be either an EObject, a String, an Integer or a Boolean
	 * @return the evaluated template
	 */
	public static String bind(String templateStr, Element element, Object args[]) throws TransformationException {
//		ENode enode;
//		// script = null;
//		if(script == null) {
//			init();
//		}
//
//		try {
//			Template template = Template.from(templateStr, script, null);
//			LaunchManager mode = LaunchManager.create("run", false);
//			if(args != null) {
//				ENode eNodeArgs[] = new ENode[args.length];
//				// package arguments as ENode objects
//				for(int i = 0; i < args.length; i++) {
//					Object arg = args[i];
//					if(arg instanceof EObject) {
//						eNodeArgs[i] = new ENode((EObject)arg, null);
//					} else if(arg instanceof String) {
//						eNodeArgs[i] = new ENode((String)arg, null);
//					} else if(arg instanceof Integer) {
//						eNodeArgs[i] = new ENode((Integer)arg, null);
//					} else if(arg instanceof Boolean) {
//						eNodeArgs[i] = new ENode((Boolean)arg, null);
//					} else {
//						System.err.println("Could not create an ENode for passed argument " + arg);
//					}
//				}
//				script.contextPush(IScript.TEMPLATE_ARGS, eNodeArgs);
//			}
//			enode = template.evaluate(element, mode);
//			if(args != null) {
//				script.contextPop(IScript.TEMPLATE_ARGS);
//			}
//		} catch (ENodeException except) {
//			throw new TransformationException("ENode exception during binding of Acceleo script: " + except.getMessage() + "\n" + templateStr);
//		} catch (FactoryException except) {
//			System.err.println("Acceleo Factory exception");
//			except.printStackTrace();
//			return "";
//		} catch (Exception except) {
//			except.printStackTrace();
//			return "";
//		}
//		return enode.toString();
		return "";
	}

	//private static IScript script = null;
}
