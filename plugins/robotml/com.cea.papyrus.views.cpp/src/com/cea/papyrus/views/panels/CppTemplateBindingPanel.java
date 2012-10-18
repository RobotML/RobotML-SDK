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
import org.eclipse.uml2.uml.TemplateBinding;

import com.cea.papyrus.views.cpp.CommandSupport;
import com.cea.profiles.cpp.CppStereo;
import com.cea.profiles.cpp.StereoUtils;

/**
 * Panel displayed when a TemplateBinding is selected
 */
public class CppTemplateBindingPanel extends CppAbstractPanel {

	private TemplateBinding selectedTB;

	// document used by the viewer
	private IDocument docBinding;
	@SuppressWarnings("unused")
	private SourceViewer viewerBinding;
	private Group groupBinding;

    public CppTemplateBindingPanel(Composite parent, int style) {
        super(parent, style);
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#getSelectedElement()
     */
    @Override
    public TemplateBinding getSelectedElement() {
        return selectedTB;
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#setSelectedElement(java.lang.Element)
     */
    @Override
	public void setSelectedElement(Element newElement) {
		super.setSelectedElement(newElement);
    	if (newElement instanceof TemplateBinding) {
			this.selectedTB = (TemplateBinding) newElement;
		}
    	else {
    		throw new RuntimeException("bad selection: "+newElement+" should be an uml2 TemplateBinding");
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
		// Body
		///////////////////////////////////////////////////////////////////////		

		docBinding		= createDocumentC();
		groupBinding	= createGroup(
				this
				, "Binding declaration (<...>)"
				, groupBinding
				, null
				, true
				, 0
				, 0
				, true);
		// Use CDT CEditor coloration
		viewerBinding	= createViewerC(docBinding, groupBinding);

		///////////////////////////////////////////////////////////////////////	

		return this;
    }

    /**
     * Saves the body for an '<code>TemplateBinding</code>'
     */
    public void save()
    {
        if (selectedTB == null) {
            /* Log.debug("saveBody : selectedTemplateBinding is null"); */
        }
        else {
    		CommandSupport.exec ("C++ template binding save", new Runnable () {
				public void run ()
				{					
		            // Treat Pointer
		            String newB = docBinding.get();
		            if (newB.equals("")) {
		                StereoUtils.setStereotype (selectedTB, CppStereo.templateBinding, false);
		            } else {
		                StereoUtils.setStereotype (selectedTB, CppStereo.templateBinding, true);
		                StereoUtils.setTaggedValue (selectedTB, CppStereo.templateBinding, "binding", newB);
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
        if (selectedTB != null) {
            if (StereoUtils.hasStereotype (selectedTB, CppStereo.templateBinding)) {
            	docBinding.set((String) StereoUtils.getTaggedValue(selectedTB, CppStereo.templateBinding, "binding"));
            }
        	else {
                docBinding.set("");
            }
        }
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#entryAction()
     */
    @Override
    public void entryAction() {
    	super.entryAction();
        reset();
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#checkModifications()
     */
    @Override
    public boolean checkModifications() {
    	String bindingValue = "";
        if (StereoUtils.hasStereotype (selectedTB, CppStereo.templateBinding)) {
        	bindingValue = StereoUtils.getTaggedValue(selectedTB, CppStereo.templateBinding, "binding");
        }
        if (!docBinding.get().equals(bindingValue)) {
        	return true;
        }
        return false;

    }
}