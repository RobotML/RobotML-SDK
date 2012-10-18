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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.TemplateParameter;

import com.cea.papyrus.views.cpp.CommandSupport;
import com.cea.profiles.cpp.CppStereo;
import com.cea.profiles.cpp.StereoUtils;

/**
 * Panel displayed when a TemplateParameter is selected
 */
public class CppTemplateParameterPanel extends CppAbstractPanel {
 
	private TemplateParameter selectedTP;

	// document used by the viewer
	@SuppressWarnings("unused")
	private SourceViewer viewerParameter;
	private Group groupParameter;
	private IDocument docParameter;

	public CppTemplateParameterPanel(Composite parent, int style) {
		super(parent, style);
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#getSelectedElement()
	 */
	@Override
	public TemplateParameter getSelectedElement() {
		return selectedTP;
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#setSelectedElement(java.lang.Element)
	 */
	@Override
	public void setSelectedElement(Element newElement) {
		super.setSelectedElement(newElement);
		if(newElement instanceof TemplateParameter) {
			this.selectedTP = (TemplateParameter)newElement;
		}
		else {
			throw new RuntimeException("bad selection: "+newElement+" should be an uml2 TemplateParameter");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cea.accorduml.ui.views.panels.AccordUMLAbstractPanel#createContent()
	 */
	public Control createContent() {

		///////////////////////////////////////////////////////////////////////
		// Create save reset buttons with superclass method
		///////////////////////////////////////////////////////////////////////    	
		createSaveResetButtons();
		
		///////////////////////////////////////////////////////////////////////
		// TemplateParameter declaration
		///////////////////////////////////////////////////////////////////////		
		docParameter	= createDocumentC();
		groupParameter	= createGroup(
				this
				, "Parameter name"
				, buttonSave
				, null
				, true
				, 0
				, 0
				, true);
		// Use CDT CEditor coloration
		viewerParameter	= createViewerC(docParameter, groupParameter);

		///////////////////////////////////////////////////////////////////////					
		// Return control on this composite
		///////////////////////////////////////////////////////////////////////		

		return this;
	}

	/**
	 * Saves the body for an '<code>Property</code>'
	 */
	public void save()
	{
		if (selectedTP == null) {
			/* Log.debug("saveBody : selectedProperty is null"); */
		}
		else {
			CommandSupport.exec ("C++ template parameter save", new Runnable () {
				public void run ()
				{					
					// Treat Parameter name
					String newB = docParameter.get();
					if (newB.equals("")) {
					    StereoUtils.setStereotype (selectedTP, CppStereo.templateParameter, false);
		            }
					else {
		                StereoUtils.setStereotype (selectedTP, CppStereo.templateParameter, true);
		                StereoUtils.setTaggedValue (selectedTP, CppStereo.templateParameter, "name", newB);
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
		if (selectedTP == null) {
			/* Log.debug("resetBody : selectedProperty is null"); */
		} else {

			if (StereoUtils.hasStereotype(selectedTP, CppStereo.templateParameter)) {
				docParameter.set((String) StereoUtils.getTaggedValue (
						selectedTP, CppStereo.templateParameter, "name"));
			} else {
				docParameter.set("");
			}

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
		String parameterValue = "";
		if (StereoUtils.hasStereotype(selectedTP, CppStereo.templateParameter)) {
			parameterValue = StereoUtils.getTaggedValue (selectedTP, CppStereo.templateParameter, "name");
		}
		if(!docParameter.get().equals(parameterValue)) {
			return true;
		}
		return false;
	}
}