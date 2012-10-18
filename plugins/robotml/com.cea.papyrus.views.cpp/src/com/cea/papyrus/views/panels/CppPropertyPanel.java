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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

import com.cea.papyrus.views.cpp.CommandSupport;
import com.cea.profiles.cpp.CppStereo;
import com.cea.profiles.cpp.StereoUtils;

/**
 * Panel displayed when a Property is selected
 */
public class CppPropertyPanel extends CppAbstractPanel {

	private Button isStatic;
	private Button isConst;

	private Property selectedProperty;

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

    public CppPropertyPanel(Composite parent, int style) {
        super(parent, style);
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#getSelectedElement()
     */
    @Override
    public Property getSelectedElement() {
        return selectedProperty;
    }

    /* (non-Javadoc)
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#setSelectedElement(java.lang.Element)
     */
    @Override
	public void setSelectedElement(Element newElement) {
		super.setSelectedElement(newElement);
    	if(newElement instanceof Property) {
			this.selectedProperty = (Property) newElement;
		}
    	else {
    		throw new RuntimeException("bad selection: "+newElement+" should be an uml2 Property");
    	}
    }

    /*
     * (non-Javadoc)
     * @see com.cea.accorduml.ui.views.panels.AccordUMLAbstractPanel#createContent()
     */
    @Override
    public Control createContent() {
		///////////////////////////////////////////////////////////////////////
		// Create save reset buttons with superclass method
		///////////////////////////////////////////////////////////////////////    	
		createSaveResetButtons();
		
		///////////////////////////////////////////////////////////////////////
		// Create checkboxes
		///////////////////////////////////////////////////////////////////////
		isStatic	= createButton("isStatic", this, null);
		isConst		= createButton("isConst", this, isStatic);
		
		///////////////////////////////////////////////////////////////////////
		// Add checkboxes listeners
		///////////////////////////////////////////////////////////////////////
		isStatic.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				updateModel();
			}

			public void widgetDefaultSelected(SelectionEvent e){
			}
		});
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
     * Saves the body for an '<code>Property</code>'
     */
    public void save()
    {
        if (selectedProperty == null) {
            /* Log.debug("saveBody : selectedProperty is null"); */
        }
        else {
        	CommandSupport.exec ("C++ package save", new Runnable () {
				public void run ()
				{					
		            // Treat Pointer
		            String newPtr = docPtr.get();
		            if (newPtr.equals("")) {
		                StereoUtils.setStereotype (selectedProperty, CppStereo.ptr, false);
		            }
		            else {
		                StereoUtils.setStereotype (selectedProperty, CppStereo.ptr, true);
		                StereoUtils.setTaggedValue (selectedProperty, CppStereo.ptr, "declaration", newPtr);
		            }

		            // Treat Reference
		            String newRef = docRef.get();
		            if (newRef.equals("")) {
		                StereoUtils.setStereotype (selectedProperty, CppStereo.ref, false);
		            }
		            else {
		                StereoUtils.setStereotype (selectedProperty, CppStereo.ref, true);
		                StereoUtils.setTaggedValue (selectedProperty, CppStereo.ref, "declaration", newRef);
		            }

		            // Treat DefaultValue
		            String newDefault = docDefault.get();
		            if (newDefault.equals("")) {
		                StereoUtils.setStereotype (selectedProperty, CppStereo.default_, false);
		            }
		            else {
		                StereoUtils.setStereotype (selectedProperty, CppStereo.default_, true);
		                StereoUtils.setTaggedValue (selectedProperty, CppStereo.default_, "value", newDefault);
		            }

		            // Treat Array
		            String newArray = docArray.get();
		            if (newArray.equals("")) {
		                StereoUtils.setStereotype (selectedProperty, CppStereo.array, false);
		            }
		            else {
		                StereoUtils.setStereotype (selectedProperty, CppStereo.array, true);
		                StereoUtils.setTaggedValue (selectedProperty, CppStereo.array, "definition", newArray);
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
        if (selectedProperty == null) {
            /* Log.debug("resetBody : selectedProperty is null"); */
        }
        else {
            // Static
            if ((StereoUtils.hasStereotype (selectedProperty, CppStereo.static_))
                    || (selectedProperty.isStatic())) {
                // Either default static stereotype or CppStatic
                isStatic.setSelection(true);
            }
            else {
                isStatic.setSelection(false);
            }
            // Const
            if (StereoUtils.hasStereotype (selectedProperty, CppStereo.const_)) {
                // Constant property
                isConst.setSelection(true);
            }
            else {
                isConst.setSelection(false);
            }

            if (StereoUtils.hasStereotype (selectedProperty, CppStereo.ptr)) {
            	docPtr.set((String) StereoUtils.getTaggedValue (selectedProperty, CppStereo.ptr, "declaration"));
            }
            else {
                docPtr.set("");
            }

            if (StereoUtils.hasStereotype (selectedProperty, CppStereo.ref)) {
            	docRef.set((String) StereoUtils.getTaggedValue (selectedProperty, CppStereo.ref, "declaration"));
            }
            else {
                docRef.set("");
            }

            if (StereoUtils.hasStereotype (selectedProperty, CppStereo.default_)) {
            	docDefault.set((String) StereoUtils.getTaggedValue (selectedProperty, CppStereo.default_, "value"));
            }
            else {
                docDefault.set("");
            }

            if (StereoUtils.hasStereotype (selectedProperty, CppStereo.array)) {
            	docArray.set((String) StereoUtils.getTaggedValue (selectedProperty, CppStereo.array, "definition"));
            }
            else {
                docArray.set("");
            }

        }
    }

    /**
     * Called when the static checkbox is modified
     */
    protected void checkStatic() {

        boolean boxState = isStatic.getSelection();

        selectedProperty.setIsStatic (boxState);
    }

    /**
     * Called when the const checkbox is modified
     */
    protected void checkConst() {
        boolean boxState = isConst.getSelection();

        if (StereoUtils.hasStereotype (selectedProperty, CppStereo.const_) != boxState) {
        	StereoUtils.setStereotype (selectedProperty, CppStereo.const_, boxState);
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
     * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#exitAction()
     */
    public void exitAction() {
    	super.exitAction();
    }

    /**
     * Checks if the content of the panel is different to the model
     * <p>This is a read only operation
     * @return <code>true</code> if one of the element of the model is not up-to-date
     * with the content of the panel
     */
    public boolean checkModifications() {
    	String ptrValue = "";
        if (StereoUtils.hasStereotype (selectedProperty, CppStereo.ptr)) {
            ptrValue = StereoUtils.getTaggedValue (selectedProperty, CppStereo.ptr, "declaration");
        }
        if(!docPtr.get().equals(ptrValue)) {
        	return true;
        }

        String refValue = "";
        if (StereoUtils.hasStereotype (selectedProperty, CppStereo.ref)) {
            refValue = StereoUtils.getTaggedValue (selectedProperty, CppStereo.ref, "declaration");
        }
        if(!docRef.get().equals(refValue)) {
        	return true;
        }

        String defaultValue = "";
        if (StereoUtils.hasStereotype (selectedProperty, CppStereo.default_)) {
            defaultValue = StereoUtils.getTaggedValue (selectedProperty, CppStereo.default_, "value");
        }
        if(!docDefault.get().equals(defaultValue)) {
        	return true;
        }

        String arrayValue = "";
        if (StereoUtils.hasStereotype (selectedProperty, CppStereo.array)) {
            refValue = StereoUtils.getTaggedValue (selectedProperty, CppStereo.array, "definition");
        }
        if(!docArray.get().equals(arrayValue)) {
        	return true;
        }
        return false;

	}
    

	@Override
	protected void updateModel()
	{
		CommandSupport.exec ("C++ property save", new Runnable () {
			public void run ()
			{
				// Check button changes
				checkStatic();
				checkConst();
			
			}
		});
	}
}