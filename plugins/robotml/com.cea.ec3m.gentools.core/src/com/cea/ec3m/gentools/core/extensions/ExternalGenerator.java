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

package com.cea.ec3m.gentools.core.extensions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;

import com.cea.ec3m.gentools.core.Activator;


/**
 * Support for multiple target languages via the Eclipse extension mechanism
 */
public class ExternalGenerator {

	public static final String IEXTERNAL_GENERATOR_ID = Activator.PLUGIN_ID + ".externalGenerator";

	/**
	 * 
	 * @param iConfiguratorName
	 * @param component
	 *        containing composite (container)
	 * @param instance
	 */
	public static EList<Classifier> generate(String iGeneratorID, Classifier source) {
		IExternalGenerator iExternalGenerator = getExternalGenerator(iGeneratorID);
		if(iExternalGenerator != null) {
			return iExternalGenerator.generate(source);
		}
		return null;
	}

	private static IExternalGenerator getExternalGenerator(String iGeneratorID) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] configElements = reg.getConfigurationElementsFor(IEXTERNAL_GENERATOR_ID);
		for(IConfigurationElement configElement : configElements) {
			try {
				final String iConfiguratorIDext = configElement.getAttribute("extGeneratorID");
				if(iConfiguratorIDext.equals(iGeneratorID)) {
					// TODO: cache returned instance (avoid creating a new instance each time => more efficient, no need for static attributes)
					final Object obj = configElement.createExecutableExtension("class");
					if(obj instanceof IExternalGenerator) {
						return (IExternalGenerator)obj;
					}
				}
			} catch (CoreException exception) {
				exception.printStackTrace();
			}
		}
		return null;
	}
}
