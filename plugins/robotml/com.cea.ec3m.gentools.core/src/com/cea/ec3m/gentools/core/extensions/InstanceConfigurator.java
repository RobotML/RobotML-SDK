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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

import FCM.UseInstanceConfigurator;

import com.cea.ec3m.gentools.core.Activator;
import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.deployment.DepUtils;


/**
 * Support for multiple target languages via the Eclipse extension mechanism
 */
public class InstanceConfigurator {

	public static final String IINSTANCE_CONFIG_ID = Activator.PLUGIN_ID + ".instanceConfig";

	/**
	 * 
	 * @param iConfiguratorName
	 * @param component
	 *        containing composite (container)
	 * @param instance
	 */
	public static void configureInstance(InstanceSpecification executorIS, Property executorPart, InstanceSpecification instance, Port port) {
		Classifier component = DepUtils.getClassifier(instance);
		UseInstanceConfigurator useInstanceConfigurator = StUtils.getApplication(component, UseInstanceConfigurator.class);
		if(useInstanceConfigurator != null) {
			FCM.InstanceConfigurator instanceConfigurator = useInstanceConfigurator.getConfigurator();
			if(instanceConfigurator != null) {
				configureInstance(instanceConfigurator.getBase_Class().getName(),
					executorIS, executorPart, instance, port);
			}
		}
	}

	/**
	 * 
	 * @param iConfiguratorName
	 * @param component
	 *        containing composite (container)
	 * @param instance
	 */
	public static void configureInstance(String iConfiguratorID, InstanceSpecification executorIS, Property executorPart, InstanceSpecification instance, Port port) {
		IInstanceConfigurator iConfigurator = getInstanceConfigurator(iConfiguratorID);
		if(iConfigurator != null) {
			iConfigurator.configureInstance(executorIS, executorPart, instance, port);
		}
	}

	private static IInstanceConfigurator getInstanceConfigurator(String iConfiguratorID) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] configElements = reg.getConfigurationElementsFor(IINSTANCE_CONFIG_ID);
		for(IConfigurationElement configElement : configElements) {
			try {
				final String iConfiguratorIDext = configElement.getAttribute("configuratorID");
				if(iConfiguratorIDext.equals(iConfiguratorID)) {
					// TODO: cache returned instance (avoid creating a new instance each time => more efficient, no need for static attributes)
					final Object obj = configElement.createExecutableExtension("class");
					if(obj instanceof IInstanceConfigurator) {
						return (IInstanceConfigurator)obj;
					}
				}
			} catch (CoreException exception) {
				exception.printStackTrace();
			}
		}
		return null;
	}
}
