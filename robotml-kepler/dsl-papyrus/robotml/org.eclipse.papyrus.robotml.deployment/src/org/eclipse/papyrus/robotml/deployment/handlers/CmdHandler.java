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

package org.eclipse.papyrus.robotml.deployment.handlers;


import java.util.Iterator;
import java.util.List;
import java.util.Vector;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Element;




/**
 * Handler for the command of customization of the content of the properties view
 * The same class is used for menu actions within model explorer and diagram
 */
public class CmdHandler extends AbstractHandler implements IObjectActionDelegate {

	/**
	 * {@inheritDoc}
	 */
	public Object execute(ExecutionEvent event) {
		Display current = Display.getCurrent();

		if(current == null) {
			current = Display.getDefault();
		}
		Shell shell = current.getActiveShell();

		if(shell == null) {
			// Activator.log.error("impossible to find a shell to open the message dialog", null);
		}

		return null;
	}

	/**
	 * Convert each selected elements from the explorator menu, or modeling view
	 * to an EObject and add it to a list
	 * 
	 * @return list of EObject
	 */
	public void updateSelectedEObject() {
		Vector<EObject> currentSelectedEObjects = new Vector<EObject>();

		// Retrieve selected elements
		IStructuredSelection selection = (IStructuredSelection)PlatformUI
				.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();

		Iterator<?> eltIt = (Iterator<?>)selection.iterator();

		while(eltIt.hasNext()) {
			Object currentObject = eltIt.next();

			// If the object is an edit part, try to get semantic bridge
			if(currentObject instanceof GraphicalEditPart) {
				GraphicalEditPart editPart = (GraphicalEditPart)currentObject;
				if(editPart.getModel() instanceof View) {
					View view = (View)editPart.getModel();
					if(view.getElement() instanceof Element) {
						currentObject = (Element)view.getElement();
					}
				}
			}

			// check whether part of model explorer
			if(currentObject instanceof IAdaptable) {
				// modisco ModelElementItem supports IAdaptable (cleaner than cast / dependency with modisco)
				currentObject = ((IAdaptable)currentObject).getAdapter(EObject.class);
			}

			// If element is a UML Element
			if(currentObject instanceof Element) {
				currentSelectedEObjects.add((EObject)currentObject);
			}

		}
		selectedEObjects = currentSelectedEObjects;
	}

	/**
	 * Convert each selected elements from the explorer menu, or modeling view
	 * to an EObject and add it to a list
	 * 
	 * @return list of EObject
	 */
	public EObject getSelectedEObject() {
		if(selectedEObjects.size() > 0) {
			return selectedEObjects.get(0);
		}
		return null;
	}

	public List<EObject> getSelectedEObjects() {
		return selectedEObjects;
	}

	private List<EObject> selectedEObjects;

	public void run(IAction action) {
		// method from action-delegate		
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// method from action-delegate		
		updateSelectedEObject(); // required??
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
	}
}