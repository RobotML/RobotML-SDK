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

import com.cea.ec3m.gentools.core.Activator;
import com.cea.ec3m.gentools.core.transformations.TransformationException;


/**
 * Support for multiple target languages via the Eclipse extension mechanism
 */
public class LanguageSupport {

	public static final String ILANG_SUPPORT_ID = Activator.PLUGIN_ID + ".language";

	public static ILangSupport getLangSupport(String language) throws TransformationException
	{
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] configElements = reg.getConfigurationElementsFor(ILANG_SUPPORT_ID);
		for(IConfigurationElement configElement : configElements) {
			try {
				final String extLanguage = configElement.getAttribute("language");
				if(extLanguage.equals(language)) {
					// TODO: cache returned instance (avoid creating a new instance each time => more efficient, no need for static attributes)
					final Object obj = configElement.createExecutableExtension("class");
					if(obj instanceof ILangSupport) {
						return (ILangSupport)obj;
					}
				}
			} catch (CoreException exception) {
				exception.printStackTrace();
			}
		}
		throw new TransformationException("Support for language " + language + "not configured for eC3M");
	}
}
