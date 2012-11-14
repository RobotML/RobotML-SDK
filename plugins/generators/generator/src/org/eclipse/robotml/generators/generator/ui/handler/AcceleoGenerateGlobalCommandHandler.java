/**
 * 
 */
package org.eclipse.robotml.generators.generator.ui.handler;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.AbstractTransactionalCommandStack;
import org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler;
import org.eclipse.robotml.generators.acceleo.athena.files.GenerateAthena;
import org.eclipse.robotml.generators.generator.ui.xml.Configuration;


/**
 * @author nrodnan
 *
 */
public class AcceleoGenerateGlobalCommandHandler extends AbstractCommandHandler {

	@Override
	protected Command getCommand() {
		
		EObject selectedObject = getSelectedElement();
		TransactionalEditingDomain editingDomain = getEditingDomain();
		
		
//		JFileChooser choose = new JFileChooser();
//		choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		choose.showOpenDialog(null);
//		File target = choose.getSelectedFile();
//		
//		if(target != null)
//		{
//			return new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(new GenerateGlobalCommand("Generate Global command", editingDomain, selectedObject, target.getAbsolutePath()));
//		}
//		else
//		{
//			return new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(new GenerateGlobalCommand("Generate Global command", editingDomain, selectedObject, null));
//		}
		URI targetFolderURI = selectedObject.eResource().getURI();
		int lastindex = targetFolderURI.toPlatformString(false).lastIndexOf("/");
		String targetPath = targetFolderURI.toPlatformString(false).substring(0, lastindex);
		return new org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper(new GenerateGlobalCommand("Generate Global command", editingDomain, selectedObject, targetPath));
	}

}
