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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Parameter;

import com.cea.papyrus.views.cpp.CommandSupport;
import com.cea.profiles.cpp.CppStereo;
import com.cea.profiles.cpp.StereoUtils;

/**
 *  Panel displayed when a Parameter is selected
 */
public class CppParameterPanel extends CppAbstractPanel {

	private Button isConst;
	
	private Parameter selectedParameter;

	// document used by the viewer
	private IDocument docPtr;
	private IDocument docRef;
	private IDocument docArray;
	private IDocument docDefault;
    
	@SuppressWarnings("unused")
	private SourceViewer viewerPtr;
	@SuppressWarnings("unused")
	private SourceViewer viewerRef;
	@SuppressWarnings("unused")
	private SourceViewer viewerArray;
	@SuppressWarnings("unused")
	private SourceViewer viewerDefault;
	
	private Group groupPtr;
	private Group groupRef;
	private Group groupArray;
	private Group groupDefault;	

    public CppParameterPanel(Composite parent, int style) {
        super(parent, style);
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#getSelectedElement()
     */
    @Override
    public org.eclipse.uml2.uml.Parameter getSelectedElement() {
        return selectedParameter;
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#setSelectedElement(java.lang.Element)
     */
    @Override
	public void setSelectedElement(Element newElement) {
		super.setSelectedElement(newElement);
    	if(newElement instanceof Parameter) {
			this.selectedParameter = (Parameter)newElement;
		}
    	else {
    		throw new RuntimeException("bad selection: "+newElement+" should be an uml2 Parameter");
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
		// Create checkboxes
		///////////////////////////////////////////////////////////////////////
		isConst		= createButton("isConst", this, null);
		
		///////////////////////////////////////////////////////////////////////
		// Add checkboxes listeners
		///////////////////////////////////////////////////////////////////////
		addStereotypeSelectionListener(isConst, "CppConst");
		
		///////////////////////////////////////////////////////////////////////		
		// Pointer declaration
		///////////////////////////////////////////////////////////////////////		
		docPtr		= createDocument();
		groupPtr	= createGroup(
				this
				, "Pointer declaration"
				, buttonSave
				, null
				, false
				, 0
				, 25
				, false);

		// Use CDT CEditor coloration
		viewerPtr     = createViewer(docPtr, groupPtr);
		
		///////////////////////////////////////////////////////////////////////		
		// Pointer declaration
		///////////////////////////////////////////////////////////////////////		
		docRef		= createDocument();
		groupRef	= createGroup(
				this
				, "Reference declaration"
				, buttonSave
				, groupPtr
				, false
				, 0
				, 50
				, false);

		// Use CDT CEditor coloration
		viewerRef     = createViewer(docRef, groupRef);
		
		///////////////////////////////////////////////////////////////////////		
		// Pointer declaration
		///////////////////////////////////////////////////////////////////////		
		docDefault		= createDocument();
		groupDefault	= createGroup(
				this
				, "Default value"
				, buttonSave
				, groupRef
				, false
				, 0
				, 75
				, false);

		// Use CDT CEditor coloration
		viewerDefault     = createViewer(docDefault, groupDefault);
		
		///////////////////////////////////////////////////////////////////////		
		// Pointer declaration
		///////////////////////////////////////////////////////////////////////		
		docArray	= createDocument();
		groupArray	= createGroup(
				this
				, "Array value ([...])"
				, buttonSave
				, groupDefault
				, true
				, 0
				, 0
				, false);

		// Use CDT CEditor coloration
		viewerArray = createViewer(docArray, groupArray);
		
		///////////////////////////////////////////////////////////////////////			
		// Return control
		///////////////////////////////////////////////////////////////////////	
		
		return this;
    }

    /**
     * Saves the body for an '<code>Parameter</code>'
     */
    public void save()
    {
        if (selectedParameter == null) {
            /* Log.debug("saveBody : selectedParameter is null"); */
        }
        else {
			CommandSupport.exec ("C++ parameter save", new Runnable () {
				public void run ()
				{					
		            // Treat Pointer
		            String newPtr = docPtr.get();
		            if (newPtr.equals("")) {
		                StereoUtils.setStereotype (selectedParameter, CppStereo.ptr, false);
		            }
		            else {
		                StereoUtils.setStereotype (selectedParameter, CppStereo.ptr, true);
		                StereoUtils.setTaggedValue (selectedParameter, CppStereo.ptr, "declaration", newPtr);
		            }

		            // Treat Reference
		            String newRef = docRef.get();
		            if (newRef.equals("")) {
		                StereoUtils.setStereotype (selectedParameter, CppStereo.ref, false);
		            }
		            else {
		                StereoUtils.setStereotype (selectedParameter, CppStereo.ref, true);
		                StereoUtils.setTaggedValue (selectedParameter, CppStereo.ref, "declaration", newRef);
		            }

		            // Treat DefaultValue
		            String newDefault = docDefault.get();
		            if (newDefault.equals("")) {
		                StereoUtils.setStereotype (selectedParameter, CppStereo.default_, false);
		            }
		            else {
		                StereoUtils.setStereotype (selectedParameter, CppStereo.default_, true);
		                StereoUtils.setTaggedValue (selectedParameter, CppStereo.default_, "value", newDefault);
		            }

		            // Treat Array
		            String newArray = docArray.get();
		            if (newArray.equals("")) {
		                StereoUtils.setStereotype (selectedParameter, CppStereo.array, false);
		            }
		            else {
		                StereoUtils.setStereotype (selectedParameter, CppStereo.array, true);
		                StereoUtils.setTaggedValue (selectedParameter, CppStereo.array, "definition", newArray);
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
        if (selectedParameter != null) {
        	// Const
            if (StereoUtils.hasStereotype (selectedParameter, CppStereo.const_)) {
                // Either default static stereotype or CppStatic
                isConst.setSelection(true);
            }
            else {
                isConst.setSelection(false);
            }

            if (StereoUtils.hasStereotype (selectedParameter, CppStereo.ptr)) {
                docPtr.set((String) StereoUtils.getTaggedValue (selectedParameter, CppStereo.ptr, "declaration"));
            }
            else {
                docPtr.set("");
            }

            if (StereoUtils.hasStereotype (selectedParameter, CppStereo.ref)) {
                docRef.set((String) StereoUtils.getTaggedValue (selectedParameter, CppStereo.ref, "declaration"));
            }
            else {
                docRef.set("");
            }

            if (StereoUtils.hasStereotype (selectedParameter, CppStereo.default_)) {
                docDefault.set((String) StereoUtils.getTaggedValue (selectedParameter, CppStereo.default_, "value"));
            }
            else {
                docDefault.set("");
            }

            if (StereoUtils.hasStereotype (selectedParameter, CppStereo.array)) {
                docDefault.set((String) StereoUtils.getTaggedValue (selectedParameter, CppStereo.array, "definition"));
            }
            else {
                docDefault.set("");
            }
        }
    }

    /**
     * Called when the static checkbox is modified
     */
    protected void checkConst() {

        boolean boxState = isConst.getSelection();

        if (boxState) {
            if (!StereoUtils.hasStereotype (selectedParameter, CppStereo.const_)) {
                StereoUtils.setStereotype (selectedParameter, CppStereo.const_, true);
            }
        } else {
        	if (StereoUtils.hasStereotype (selectedParameter, CppStereo.const_)) {
                StereoUtils.setStereotype (selectedParameter, CppStereo.const_, false);
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
    	String ptrValue = "";
        if (StereoUtils.hasStereotype (selectedParameter, CppStereo.ptr)) {
            ptrValue = StereoUtils.getTaggedValue (selectedParameter, CppStereo.ptr, "declaration");
        }
        if(!docPtr.get().equals(ptrValue)) {
        	return true;
        }

        String refValue = "";
        if (StereoUtils.hasStereotype (selectedParameter, CppStereo.ref)) {
            refValue = StereoUtils.getTaggedValue (selectedParameter, CppStereo.ref, "declaration");
        }
        if(!docRef.get().equals(refValue)) {
        	return true;
        }

        String defaultValue = "";
        if (StereoUtils.hasStereotype (selectedParameter, CppStereo.default_)) {
            defaultValue = StereoUtils.getTaggedValue (selectedParameter, CppStereo.default_, "value");
        }
         if(!docDefault.get().equals(defaultValue)) {
        	return true;
        }

        String arrayValue = "";
        if (StereoUtils.hasStereotype (selectedParameter, CppStereo.array)) {
        	arrayValue = StereoUtils.getTaggedValue (selectedParameter, CppStereo.array, "definition");
        }
        if(!docArray.get().equals(arrayValue)) {
        	return true;
        }
        return false;
    }
    
	@Override
	protected void updateModel() {
		
		// Check button changes
		CommandSupport.exec ("C++ parameter update", new Runnable () {
			public void run ()
			{					
				checkConst();
			}
		});
	}
}