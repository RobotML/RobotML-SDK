/**
 * 
 */
package handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.robotml.vle.codegen.VLEModelElementsCreator;
import org.eclipse.papyrus.uml.diagram.common.handlers.CmdHandler;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * @author nico
 *
 */
public class GenerateCodeHandler extends CmdHandler {
	
	private List<IHandlerListener> _handlers = new ArrayList<IHandlerListener>();

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#addHandlerListener(org.eclipse.core.commands.IHandlerListener)
	 */
	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		_handlers.add(handlerListener);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#dispose()
	 */
	@Override
	public void dispose() {
		_handlers.clear();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(selectedEObject instanceof PackageableElement)
		{
			PackageableElement packageableElement = (PackageableElement)selectedEObject;
//			System.out.println(packageableElement.getClass().toString());
			IProject project = getCurrentProject();
			
			if(project != null)
			{
				VLEModelElementsCreator modelElementCreator = new VLEModelElementsCreator(project);
				generate(modelElementCreator, packageableElement);
			}
		}
		return null;
	}

	private void generate(VLEModelElementsCreator modelElementCreator, PackageableElement packageableElement) {
		modelElementCreator.createPackageableElement(packageableElement, null, true);
		/*
		 * Do generation for imported model 
		 */
		for(PackageableElement pElt : packageableElement.getModel().getImportedMembers())
			modelElementCreator.createPackageableElement(pElt, null, true);
	}

	private IProject getCurrentProject() {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		URI uriProject = selectedEObject.eResource().getURI();
		IProject project = workspaceRoot.getProject(uriProject.segment(1));
		return project;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		updateSelectedEObject();
		return (selectedEObject instanceof Model);
//		return (selectedEObject instanceof Package) || (selectedEObject instanceof Classifier);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#isHandled()
	 */
	@Override
	public boolean isHandled() {
		return !_handlers.isEmpty();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#removeHandlerListener(org.eclipse.core.commands.IHandlerListener)
	 */
	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		_handlers.remove(handlerListener);
	}

}
