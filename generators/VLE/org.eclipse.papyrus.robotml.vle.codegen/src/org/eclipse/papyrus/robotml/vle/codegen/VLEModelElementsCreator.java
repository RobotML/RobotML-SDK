package org.eclipse.papyrus.robotml.vle.codegen;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.codegen.base.HierarchyLocationStrategy;
import org.eclipse.papyrus.codegen.base.ModelElementsCreator;
import org.eclipse.papyrus.codegen.base.ProjectBasedFileAccess;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEClassHeaderGenerator;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;

public class VLEModelElementsCreator extends ModelElementsCreator {

	private List<DataType> _datatypes = new ArrayList<DataType>();
	
	public VLEModelElementsCreator(IProject project) {
		super(new ProjectBasedFileAccess(project), new HierarchyLocationStrategy());
	}

	@Override
	protected void createPackageableElementFile(PackageableElement element, IProgressMonitor progressMonitor) {
		if(element instanceof Class) {
//			System.out.println(element.getClass().toString());
			generateClassifier((Class)element);
		}
		else if (element instanceof DataType) {
			_datatypes.add((DataType) element);
			System.out.println("Datatypes !!!");
		}
	}

	protected void generateClassifier(Class classElt) {
		final String fileName = locStrategy.getFileName((NamedElement) classElt) + ".h";
		fileSystemAccess.generateFile(fileName, VLEClassHeaderGenerator.generateCode(classElt).toString());
	}
	
//	protected void generatePackage(Package packageElt) {
//		final String fileName = locStrategy.getFileName((NamedElement) packageElt) + ".cc";
//		fileSystemAccess.generateFile(fileName, XPackageHeaderGenerator.generateCode(packageElt).toString());
//	}

	@Override
	protected boolean noCodeGen(Element arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}
