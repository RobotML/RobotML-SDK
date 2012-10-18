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

package com.cea.papyrus.views.cpp.views;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Element;

import com.cea.papyrus.views.panels.CppAbstractPanel;

/**
 * This class extends <code>ViewPart</code>. This class draws the Accord/Cpp
 * panel in the Modeling Perspective. It also implements
 * <code>ISelectionListener</code> in order to know which element is selected
 * in the workbench. In fact, the content of the view changes depending on the
 * type of the element selected
 */
public class CppPanelView extends AccordPanelView {

	/**
	 * Creates the new panel, when switching UI.
	 * <p>
	 * This class should be overloaded when working with RSA or other tools,
	 * using a new PanelFactory
	 * 
	 * @param parent
	 *            the parent of the new panel
	 * @param style
	 *            the SWT style of this panel
	 * @param element
	 *            the element for which the panel is created
	 * @return the newly created panel
	 */
	@Override
	protected CppAbstractPanel createPanel(Composite parent, int style,
			Element element) {
		return com.cea.papyrus.views.panels.PanelFactory.eINSTANCE
				.createPanel(parent, 0, currentTarget);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {

		IStructuredSelection sSelection = null;
		if (selection instanceof IStructuredSelection) {
			sSelection = (IStructuredSelection) selection;
		}

		// exclude case of an empty selection which is not a Tree selection, since changing views provokes an
		// empty selection (selection gets lost, although same element remains selected)
		if ((selection != null) && (sSelection != null) && sSelection.isEmpty ()) {
			return;
		}
		currentTarget = null;

		// No available selection: switch to default panel
		if ((sSelection == null) || (sSelection.size() != 1)) {
			switchUI();
			return;
		}

		// Retrieve selected object
		Object currentObject = sSelection.getFirstElement();
		// If the object is an edit part, try to get semantic bridge
		if (currentObject instanceof GraphicalEditPart) {
			GraphicalEditPart editPart = (GraphicalEditPart) currentObject;
			if (editPart.getModel () instanceof View) {
				View view = (View) editPart.getModel (); 
				if (view.getElement() instanceof Element){
					currentObject = (Element) view.getElement();
				}
			}
		}
		else if (currentObject instanceof IAdaptable) {
			// modisco ModelElementItem supports IAdaptable (cleaner than cast / dependency with modisco)
			currentObject = ((IAdaptable) currentObject).getAdapter (EObject.class);
		}

		if (currentObject instanceof Element) {
			currentTarget = (Element) currentObject;
			switchUI();
		}
	}
}