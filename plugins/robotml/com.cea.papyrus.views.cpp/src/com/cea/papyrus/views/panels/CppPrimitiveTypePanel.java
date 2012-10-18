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
import org.eclipse.uml2.uml.PrimitiveType;

import com.cea.papyrus.views.cpp.CommandSupport;
import com.cea.profiles.cpp.CppStereo;
import com.cea.profiles.cpp.StereoUtils;

/**
 * Panel displayed when a PrimitiveType is selected
 */
public class CppPrimitiveTypePanel extends CppAbstractPanel {

	// document used by the viewer for definition of the type
	@SuppressWarnings("unused")
	private SourceViewer typeViewer;
	private Group typeGroup;
	private IDocument typeDocument;

    // Current selection
    private PrimitiveType selectedPType;

    public CppPrimitiveTypePanel(Composite parent, int style) {
        super(parent, style);
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#getSelectedElement()
     */
    @Override
    public PrimitiveType getSelectedElement() {
        return selectedPType;
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#setSelectedElement(java.lang.Element)
     */
    @Override
	public void setSelectedElement(Element newElement) {
		super.setSelectedElement(newElement);
    	if (newElement instanceof PrimitiveType) {
			this.selectedPType = (PrimitiveType)newElement;
		}
    	else {
    		throw new RuntimeException("bad selection: "+newElement+" should be an uml2 PrimitiveType");
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
		
		///////////////////////////////////////////////////////////////////////
		// Type definition text area
		///////////////////////////////////////////////////////////////////////		

		typeDocument	= createDocumentC();
		typeGroup		
			= createGroup(this, "Type definition", buttonSave, null, true, 0, 0, true);
		// Use CDT CEditor coloration
		typeViewer		= createViewerC(typeDocument, typeGroup);

		///////////////////////////////////////////////////////////////////////	

		return this;
    }

    /**
     * Saves the include declarations for a '<code>PrimitiveType</code>'
     */
    public void save() {
    	if (selectedPType == null) {
            /* Log.debug("saveBody : selectedOperation is null"); */
        }
        else {
			CommandSupport.exec ("C++ primitive type save", new Runnable () {
				public void run ()
				{
					if (typeDocument.get().equals("")) {
						StereoUtils.setStereotype (selectedPType, CppStereo.type, false);
					}
					else {
						StereoUtils.setStereotype (selectedPType, CppStereo.type, true);
						StereoUtils.setTaggedValue (selectedPType, CppStereo.type, "definition", typeDocument.get());
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
        if (selectedPType != null) {
            if (StereoUtils.hasStereotype (selectedPType, CppStereo.type)) {
                // get the text in the tagged value
                String currentDef = (String)
                	StereoUtils.getTaggedValue (selectedPType, CppStereo.type, "definition");
                typeDocument.set(currentDef);
            } else {
                typeDocument.set("");
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
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
    	String typeInModel = "";
        if (StereoUtils.hasStereotype (selectedPType, CppStereo.type)) {
        	typeInModel = 
        	  	StereoUtils.getTaggedValue (selectedPType, CppStereo.type, "definition");
        }
        if (!typeDocument.get().equals(typeInModel)) {
        	return true;
        }
        return false;
    }
}
