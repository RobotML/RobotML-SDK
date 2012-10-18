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
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;

import com.cea.papyrus.views.cpp.CommandSupport;
import com.cea.profiles.cpp.CppStereo;
import com.cea.profiles.cpp.StereoUtils;

/**
 * Panel displayed when a Class is selected
 */
public class CppClassPanel extends CppAbstractPanel {

	// document used by the viewer for header include
	private IDocument headerDocument;
	@SuppressWarnings("unused")
	private SourceViewer headerViewer;
	private Group headerGroup;
	// document used by the viewer for body include
	private IDocument bodyDocument;
	@SuppressWarnings("unused")
	private SourceViewer bodyViewer;
	private Group bodyGroup;

	// Current selection
	private Class selectedClass;

	public CppClassPanel(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * @return Returns the selectedOperation.
	 */
	public org.eclipse.uml2.uml.Class getSelectedElement() {
		return selectedClass;
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#setSelectedElement(java.lang.Object)
	 */
	@Override
	public void setSelectedElement (Element newElement) {
		super.setSelectedElement (newElement);
		if(newElement instanceof Class) {
			this.selectedClass = (Class) newElement;
		}
		else {
			throw new RuntimeException ("bad selection: "+newElement+" should be an uml2 Class");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cea.accorduml.ui.views.panels.AccordUMLAbstractPanel#createContentHI()
	 */
	public Control createContent() {

		///////////////////////////////////////////////////////////////////////
		// Create save reset buttons with superclass method
		///////////////////////////////////////////////////////////////////////    	
		createSaveResetButtons();

		/////////////////////////////////////////////////////////////////////////
		// Create a Group for the header include declarations
		/////////////////////////////////////////////////////////////////////////
		headerDocument		= createDocumentC();
		headerGroup			= createGroup(
				this
				, "Header include declarations"
				, buttonSave
				, null
				, true
				, 50
				, 0
				, false);
		// Use CDT CEditor coloration
		headerViewer		= createViewerC(headerDocument, headerGroup);
		/////////////////////////////////////////////////////////////////////////
		// Create a Group for the body include declarations
		/////////////////////////////////////////////////////////////////////////
		bodyDocument		= createDocumentC();
		bodyGroup			= createGroup(
				this
				, "Body include declarations"
				, headerGroup
				, null
				, true
				, 0
				, 0
				, true);
		// Use CDT CEditor coloration
		bodyViewer			= createViewerC(bodyDocument, bodyGroup);

		/////////////////////////////////////////////////////////////////////////

		return this;
	}

	/**
	 * Saves the include declarations for a '<code>Class</code>'
	 */
	public void save()
	{
		if (selectedClass == null) {
			/* Log.debug("saveBody : selectedOperation is null"); */
		} else {
			CommandSupport.exec ("C++ header/body save", new Runnable () {
				public void run () {
					if (headerDocument.get().equals("")
							&& bodyDocument.get().equals("")) {
						StereoUtils.setStereotype (selectedClass, CppStereo.include, false);
					} else {
						StereoUtils.setStereotype (selectedClass, CppStereo.include, true);
						StereoUtils.setTaggedValue (selectedClass, CppStereo.include, "header",
								headerDocument.get());
						StereoUtils.setTaggedValue (selectedClass, CppStereo.include, "body",
								bodyDocument.get());
					}
				}
			});
		}
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#entryAction()
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
		String bodyInModel = "";

		if (StereoUtils.hasStereotype (selectedClass, CppStereo.include)) {
			headerInModel = StereoUtils.getTaggedValue(selectedClass, CppStereo.include, "header");
			bodyInModel = StereoUtils.getTaggedValue(selectedClass, CppStereo.include, "body");
		}

		boolean headerChanged = !headerDocument.get().equals(headerInModel);
		boolean bodyChanged = !bodyDocument.get().equals(bodyInModel);

		return (headerChanged|bodyChanged);
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#refreshPanel()
	 */
	@Override
	protected void refreshPanel() {
		if (selectedClass == null) {
		}
		else {
			if (StereoUtils.hasStereotype (selectedClass, CppStereo.include)) {
				// get the text in the tagged value
				String currentHI = (String) StereoUtils.getTaggedValue(selectedClass, CppStereo.include, "header");
				headerDocument.set(currentHI);
				String currentBI = (String) StereoUtils.getTaggedValue(selectedClass, CppStereo.include, "body");
				bodyDocument.set(currentBI);
			} else {
				headerDocument.set("");
				bodyDocument.set("");
			}
		}
	}
}
