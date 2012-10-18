
package org.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AthenaDSLStandaloneSetup extends AthenaDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new AthenaDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

