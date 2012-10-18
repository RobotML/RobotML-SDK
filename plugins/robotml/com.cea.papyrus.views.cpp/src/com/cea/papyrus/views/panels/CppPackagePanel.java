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

package com.cea.papyrus.views.panels;

import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

import com.cea.papyrus.views.cpp.CommandSupport;
import com.cea.profiles.cpp.CppStereo;
import com.cea.profiles.cpp.StereoUtils;

/**
 * Panel displayed when a Package is selected
 */
public class CppPackagePanel extends CppAbstractPanel {

	// document used by the viewer for header include
	private IDocument headerDocument;
	// private SourceViewer headerViewer;
	private Group headerGroup;

	// Current selection
	private Package selectedPackage;

	/**
	 * Default constructor
	 * @param parent the composite parent of this panel 
	 * @param style the SWT style of this panel
	 */
	public CppPackagePanel(Composite parent, int style) {
		super(parent, style);
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#getSelectedElement()
	 */
	@Override
	public org.eclipse.uml2.uml.Package getSelectedElement() {
		return selectedPackage;
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#setSelectedElement(java.lang.Element)
	 */
	@Override
	public void setSelectedElement(Element newElement) {
		super.setSelectedElement(newElement);
		if(newElement instanceof Package) {
			this.selectedPackage = (Package) newElement;
		}
		else {
			throw new RuntimeException("bad selection: "+newElement+" should be an uml2 Package");
		}
    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cea.accorduml.ui.views.panels.AccordUMLAbstractPanel#createContentHI()
	 */
	public Control createContent() {

		///////////////////////////////////////////////////////////////////////
		// Create a composite that contain the "Save/Cancel" buttons
		///////////////////////////////////////////////////////////////////////
		createSaveResetButtons();

		///////////////////////////////////////////////////////////////////////
		// Package header declaration
		///////////////////////////////////////////////////////////////////////		
		headerDocument		= createDocumentC();
		headerGroup			= createGroup(
				this
				, "Header include declarations"
				, buttonSave
				, null
				, true
				, 0
				, 0
				, true);
		// Use CDT CEditor coloration
		// headerViewer
		createViewerC(headerDocument, headerGroup);

		///////////////////////////////////////////////////////////////////////
		return this;
    }

	/**
	 * Saves the include declarations for a '<code>Package</code>'
	 */
	public void save()
	{
		if (selectedPackage == null) {
			/* Log.debug("saveBody : selectedPackage is null"); */
		}
		else {
			CommandSupport.exec ("C++ package save", new Runnable () {
				public void run ()
				{					
					if (headerDocument.get().equals("")) {
						StereoUtils.setStereotype(selectedPackage, CppStereo.include, false);
					} else {
						StereoUtils.setStereotype (selectedPackage, CppStereo.include, true);
						StereoUtils.setTaggedValue (selectedPackage, CppStereo.include,
								"header", headerDocument.get ());
					}
				}
			});
		}
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#refreshPanel()
	 */
	@Override
	protected void refreshPanel() {
		if (selectedPackage != null) {
			if (StereoUtils.hasStereotype (selectedPackage, CppStereo.include)) {
				// get the text in the tagged value
				String currentHI = (String)
					StereoUtils.getTaggedValue (selectedPackage, CppStereo.include,
                		"header");
				headerDocument.set (currentHI);
			}
			else {
				headerDocument.set ("");
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.cea.accorduml.ui.views.panels.AccordUMLAbstractPanel#entryAction()
	 */
	public void entryAction() {
		super.entryAction();
		reset();
	}

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#checkModifications()
     */
	@Override
	public boolean checkModifications() {
		String headerInModel = "";
		if (StereoUtils.hasStereotype(selectedPackage, CppStereo.include)) {
			headerInModel =
				StereoUtils.getTaggedValue (selectedPackage, CppStereo.include, "header");
		}
		return (!(headerDocument.get().equals(headerInModel)));
	}
}
