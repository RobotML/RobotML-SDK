package org.eclipse.papyrus.robotml.vle.codegen;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.papyrus.codegen.extensionpoints.ILangSupport;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.PackageableElement;

public class VLELangSupport implements ILangSupport {

	@Override
	public void cleanCode(IProgressMonitor arg0, PackageableElement arg1) {
		System.out.println("Clean code command");
	}

	@Override
	public IProject createProject(String arg0, String arg1) {
		System.out.println("Create project command");
		return null;
	}

	@Override
	public void gatherConfigData(Class arg0) {
		System.out.println("Gather config data command");
		
	}

	@Override
	public void generateCode(IProgressMonitor arg0, PackageableElement arg1) {
		System.out.println("Generate code command");
		
	}

	@Override
	public IProject getProject() {
		System.out.println("Get project command");
		return null;
	}

	@Override
	public void resetConfigurationData() {
		System.out.println("Reset config data command");
	}

	@Override
	public void setProject(IProject arg0) {
		System.out.println("Set project command");
	}

	@Override
	public void setSettings(String arg0) {
		System.out.println("Set settings command");
	}

}
