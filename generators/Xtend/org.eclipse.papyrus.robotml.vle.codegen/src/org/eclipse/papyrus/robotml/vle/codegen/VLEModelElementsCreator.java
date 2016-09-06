package org.eclipse.papyrus.robotml.vle.codegen;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.papyrus.codegen.base.HierarchyLocationStrategy;
import org.eclipse.papyrus.codegen.base.ModelElementsCreator;
import org.eclipse.papyrus.codegen.base.ProjectBasedFileAccess;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEClassHeaderGenerator;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEClassImplementationGenerator;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEDataTypeDefsHeaderGenerator;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEDataTypeDefsImplementationGenerator;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEStateMachineHeaderGenerator;
import org.eclipse.papyrus.robotml.vle.codegen.xtend.VLEStateMachineImplementationGenerator;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.util.UMLUtil;

import RobotMLExtension.BasicType;

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
			Behavior behavior =((Class)element).getClassifierBehavior();
			if(behavior != null)
			{
				System.out.println(element.getName() + " *** " + behavior.toString());
				if(behavior instanceof StateMachine)
				{
					String prefix = ((Class)element).getName();
					generateStateMachine((StateMachine)behavior, prefix);
				}
			}
		}
		else if (element instanceof DataType) {
			generateDataType((DataType)element);
		}
	}
	
	private void generateDataType(DataType elt)
	{
		final String fileHeaderName = locStrategy.getFileName((NamedElement) elt) + ".h";
		final String fileImplementName = locStrategy.getFileName((NamedElement) elt) + ".cpp";
		fileSystemAccess.generateFile(fileHeaderName, VLEDataTypeDefsHeaderGenerator.generateCode(elt).toString());
		fileSystemAccess.generateFile(fileImplementName, VLEDataTypeDefsImplementationGenerator.generateCode(elt).toString());
	}
	
	protected void generateStateMachine(StateMachine smElt, String prefix)
	{
		final String fileHeaderName = prefix + "_" + locStrategy.getFileName((NamedElement) smElt) + ".h";
		final String fileImplementName = prefix + "_" + locStrategy.getFileName((NamedElement) smElt) + ".cpp";
		fileSystemAccess.generateFile(fileHeaderName, VLEStateMachineHeaderGenerator.generateCode(smElt, prefix).toString());
		fileSystemAccess.generateFile(fileImplementName, VLEStateMachineImplementationGenerator.generateCode(smElt, prefix).toString());
	}

	protected void generateClassifier(Class classElt) {
		final String fileHeaderName = locStrategy.getFileName((NamedElement) classElt) + ".h";
		final String fileImplementName = locStrategy.getFileName((NamedElement) classElt) + ".cpp";
		fileSystemAccess.generateFile(fileHeaderName, VLEClassHeaderGenerator.generateCode(classElt).toString());
		fileSystemAccess.generateFile(fileImplementName, VLEClassImplementationGenerator.generateCode(classElt).toString());
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
