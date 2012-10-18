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
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLPackage;

import com.cea.papyrus.views.cpp.CommandSupport;
import com.cea.profiles.cpp.CppStereo;
import com.cea.profiles.cpp.StereoUtils;
import com.cea.profiles.cpp.StdStereo;

/**
 * Panel displayed when an Operation is selected
 * 
 * TODO: instead of keeping isAbstract and pureVirtual Stereotype synchronized, pure virtual
 *    could be removed from the panel 
 */
public class CppOperationPanel extends CppAbstractPanel {

	@SuppressWarnings("unused")
	private ISourceViewer viewerBody;
	@SuppressWarnings("unused")
	private ISourceViewer viewerConstInit;
	
	private Group groupBody;
	private Group groupCInit;

	// document used by the viewer
	private IDocument docBody;
	private IDocument docConstInit;

	private Button isStatic;
	private Button isInline;
	private Button isConst;
	private Button isFriend;
	private Button isCreate;
	private Button isDestroy;
	private Combo  vPropCombo;

	private Operation selectedOperation;

	Element  selectedEOwner;

	public CppOperationPanel(Composite parent, int style) {
		super(parent, style);
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#getSelectedElement()
	 */
	@Override
	public Operation getSelectedElement() {
		return selectedOperation;
	}

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#setSelectedElement(java.lang.Element)
	 */
	@Override
	public void setSelectedElement(Element newElement) {
		super.setSelectedElement(newElement);
		if(newElement instanceof Operation) {
			this.selectedOperation = (Operation) newElement;
			// Retrieve the owner
			this.selectedEOwner = selectedOperation.getOwner();
		}
		else {
			throw new RuntimeException("bad selection: "+newElement+" should be an uml2 Operation");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.cea.accorduml.ui.views.panels.AccordUMLAbstractPanel#createContent()
	 */
	@Override
	public Control createContent()
	{
		///////////////////////////////////////////////////////////////////////
		// Create checkboxes
		///////////////////////////////////////////////////////////////////////
		isStatic	= createButton("isStatic", this, null);
		isInline	= createButton("isInline", this, isStatic);
		isConst		= createButton("isConst", this, isInline);
		isFriend	= createButton("isFriend", this, isConst);
		isCreate	= createButton("isCreate", this, isFriend);
		isDestroy	= createButton("isDestroy", this, isCreate);

		///////////////////////////////////////////////////////////////////////
		// Add checkboxes listeners
		///////////////////////////////////////////////////////////////////////
		isStatic.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				CommandSupport.exec ("C++ operation save", new Runnable () {
					public void run () {
						updateModel();
					}
				});
			}

			public void widgetDefaultSelected(SelectionEvent e){
			}
		});

		addStereotypeSelectionListener(isInline, "CppInline");
		addStereotypeSelectionListener(isConst, "CppConst");
		addStereotypeSelectionListener(isFriend, "CppFriend");
		addStereotypeSelectionListener(isCreate, "Create");
		addStereotypeSelectionListener(isDestroy, "Destroy");
		
		///////////////////////////////////////////////////////////////////////		
		// Virtual properties combo box
		///////////////////////////////////////////////////////////////////////
		vPropCombo = new Combo(this, SWT.DROP_DOWN | SWT.READ_ONLY);
		String items[] = {"not virtual", "virtual", "pure virtual"};
		vPropCombo.setItems(items);
		vPropCombo.setText("Virtual operation qualifiers");
		vPropCombo.addSelectionListener(
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					checkVirtual();
					reset();
				}
			});		

		FormData data = new FormData();
		data.left = new FormAttachment(isDestroy, H_SPACE);	
		data.top  = new FormAttachment(0, H_SPACE);		
		vPropCombo.setLayoutData(data);

		///////////////////////////////////////////////////////////////////////
		// Create save reset buttons with superclass method
		///////////////////////////////////////////////////////////////////////    	
		createSaveResetButtons();

		///////////////////////////////////////////////////////////////////////		
		// Constructor init list
		///////////////////////////////////////////////////////////////////////		
		docConstInit		= createDocument();
		groupCInit			= createGroup(
				this
				, "Constructor initialisation list"
				, isStatic
				, null
				, true
				, 0
				, 0
				, false);

		// Use CDT CEditor coloration
		viewerConstInit     = createViewer(docConstInit, groupCInit);

		///////////////////////////////////////////////////////////////////////
		// Body
		///////////////////////////////////////////////////////////////////////		

		docBody				= createDocumentC();
		groupBody			= createGroup(
				this
				, "Method body"
				, groupCInit
				, null
				, true
				, 0
				, 0
				, true);
		// Use CDT CEditor coloration
		viewerBody			= createViewerC(docBody, groupBody);

		///////////////////////////////////////////////////////////////////////	

		return this;		
	}
	
	

	/* (non-Javadoc)
	 * @see com.cea.accordcpp.core.ui.panels.AccordCppAbstractPanel#save()
	 */
	@Override
	public void save()
	{
		if (selectedOperation == null) {
			/* Log.debug("saveBody : selectedOperation is null"); */
		} else {
			CommandSupport.exec ("C++ operation save", new Runnable () {
				public void run () {
					String newConstInit = docConstInit.get();
					if (newConstInit.equals("")) {
						StereoUtils.setStereotype (selectedOperation, CppStereo.constInit, false);
					} else {
						StereoUtils.setStereotype (selectedOperation, CppStereo.constInit, true);
						StereoUtils.setTaggedValue (selectedOperation, CppStereo.constInit,
								"initialisation", newConstInit);
					}

					// Body
					setCppBody (selectedOperation, docBody.get ());
				}
			});
		}

	}

	public static String getCppBody (Operation operation)
	{
		// get the body of the operation
		for (Behavior behavior : operation.getMethods()) {
			if (behavior instanceof OpaqueBehavior) {
				OpaqueBehavior ob = (OpaqueBehavior) behavior;
				int i = 0;
				for (String language : ob.getLanguages()) {
					if (language.equals (CPP_ID)) {
						return ob.getBodies ().get (i);
					}
					i++;
				}
			}
		}
		return "";
	}

	public static void setCppBody (Operation operation, String body)
	{
		boolean done = false;
		for (Behavior behavior : operation.getMethods()) {
			if (behavior instanceof OpaqueBehavior) {
				OpaqueBehavior ob = (OpaqueBehavior) behavior;
				int i = 0;
				for (String language : ob.getLanguages()) {
					if (language.equals (CPP_ID)) {
						done = true;
						ob.getBodies().set (i, body);
						break;
					}
					i++;
				}
			}
			if (done) {
				break;
			}
		}
		if (!done) {
			OpaqueBehavior ob = (OpaqueBehavior)
				operation.getClass_ ().createOwnedBehavior (operation.getName (), UMLPackage.eINSTANCE.getOpaqueBehavior ());
			ob.getLanguages().add (CPP_ID);
			ob.getBodies().add (body);
			ob.setSpecification (operation);
		}
		
	}

	/**
	 * Called when the static checkbox is modified
	 */
	protected void checkStatic()
	{
		boolean boxState = isStatic.getSelection();

		selectedOperation.setIsStatic (boxState);
	}

	/**
	 * Called when the inline checkbox is modified
	 */
	protected void checkInline() {
		// get the text in the activity
		boolean boxState = isInline.getSelection();

		if (boxState != StereoUtils.hasStereotype (selectedOperation, CppStereo.inline)) {
			StereoUtils.setStereotype (selectedOperation, CppStereo.inline, boxState);
		}
	}

	/**
	 * Called when the const checkbox is modified
	 */
	protected void checkConst() {

		boolean boxState = isConst.getSelection();

		if (boxState != StereoUtils.hasStereotype (selectedOperation, CppStereo.const_)) {
			StereoUtils.setStereotype (selectedOperation, CppStereo.const_, boxState);
		}
	}

	/**
	 * Called when the friend checkbox is modified
	 */
	protected void checkFriend() {

		boolean boxState = isFriend.getSelection();

		if (boxState != StereoUtils.hasStereotype(selectedOperation, CppStereo.friend)) {
			StereoUtils.setStereotype (selectedOperation, CppStereo.friend, boxState);
		}
	}
	
	/**
	 * Called when the create checkbox is modified
	 */
	protected void checkCreate() {
		// get the text in the activity
		boolean boxState = isCreate.getSelection();

		if (!boxState) {
			StereoUtils.setStereotype(selectedOperation, CppStereo.constInit, false);
		}
		StereoUtils.setStereotype (selectedOperation, "Standard::Create", boxState);

		groupCInit.setEnabled(boxState);
	}

	/**
	 * Called when the destroy checkbox is modified
	 */
	protected void checkDestroy() {
		// get the text in the activity
		boolean boxState = isDestroy.getSelection();

		if (boxState != StereoUtils.hasStereotype(selectedOperation, "Standard::Desctroy")) {
			StereoUtils.setStereotype (selectedOperation, "Standard::Desctroy", boxState);
		}
	}

	/**
	 * Called when the virtual qualifier is modified
	 */
	protected void checkVirtual() {

		// Treat the operation
		int comboSelected = 2;

		// If owner is a class
		if (selectedEOwner instanceof org.eclipse.uml2.uml.Class) {
			comboSelected = vPropCombo.getSelectionIndex();
		} else {
			// Assume this is an interface
			comboSelected = 2;
		}

		if (comboSelected == 0 /* not virtual */) {

			// remove abstract / CppVirtual / CppVirtualPure
			selectedOperation.setIsAbstract (false);
			StereoUtils.setStereotype (selectedOperation, CppStereo.virtual, false);
			StereoUtils.setStereotype (selectedOperation, CppStereo.pureVirtual, false);

		} else {

			if (comboSelected == 1 /* virtual */) {

				StereoUtils.setStereotype (selectedOperation, CppStereo.virtual, true);
				StereoUtils.setStereotype (selectedOperation, CppStereo.pureVirtual, false);

			} else if (comboSelected == 2 /* pure virtual */) {

				selectedOperation.setIsAbstract (true);
				StereoUtils.setStereotype (selectedOperation, CppStereo.virtual, false);
				StereoUtils.setStereotype (selectedOperation, CppStereo.pureVirtual, true);

			}
		}

		// Treat the owner class
		if (selectedEOwner instanceof Class) {
			Class ownerCl = (Class) selectedEOwner;

			ownerCl.setIsAbstract (ownerCl.isAbstract ());
		} // else nothing
	}

	/*
	 * (non-Javadoc)
	 * @see com.cea.accorduml.ui.views.panels.AccordUMLAbstractPanel#entryAction()
	 */
	public void entryAction() {
		super.entryAction();
		reset();
	}

	/*
	 * (non-Javadoc)
	 * @see com.cea.accorduml.ui.views.panels.AccordUMLAbstractPanel#exitAction()
	 */
	public void exitAction() {
		// do exit action, only if the owner is a class
		if (selectedEOwner instanceof Class) {
			super.exitAction();
		}
	}

	@Override
	public boolean checkModifications() {
		// check if ConstInit has changed
		String valueConstInit = "";
		if (StereoUtils.hasStereotype(selectedOperation, CppStereo.constInit)) {
			valueConstInit = StereoUtils.getTaggedValue(selectedOperation, CppStereo.constInit, "initialisation");
		}
		if(!docConstInit.get().equals(valueConstInit)) {
			return true;
		}

		String methodBody = getCppBody (selectedOperation);
			
		if(!(docBody.get().equals(methodBody))) {
			return true;
		}

		return false;
	}

	@Override
	protected void refreshPanel() {
		if (selectedOperation == null) {
			/* Log.debug("resetBody : selectedOperation is null"); */
		} else {

			// get the text in the activity if parent is a class
			if (selectedEOwner instanceof Class) {

				// This part is done for a class only

				// ConstInit
				if (StereoUtils.hasStereotype (selectedOperation, CppStereo.constInit)) {
					docConstInit.set((String) StereoUtils.getTaggedValue(selectedOperation, CppStereo.constInit, "initialisation"));
				} else {
					docConstInit.set("");
				}
				
				// Don't show this unless the operation is a constructor
				if (isCreate.getSelection()) {
					groupCInit.setEnabled(true);
				} else {
					docConstInit.set("");
					groupCInit.setEnabled(false);
				}

				String body = getCppBody (selectedOperation);
				docBody.set(body);

				// Combo Box
				if (StereoUtils.hasStereotype(selectedOperation, CppStereo.virtual)) {
					vPropCombo.select(1);
					groupBody.setEnabled(true);
					
				}
				else if (StereoUtils.hasStereotype(selectedOperation, CppStereo.pureVirtual)) {
					vPropCombo.select(2);
					// Nothing in body and body unavailable
					docBody.set("");
					groupBody.setEnabled(false);
					
				} else {
					vPropCombo.select(0);
					groupBody.setEnabled(true);
				}

				// Inline
				if (StereoUtils.hasStereotype(selectedOperation, CppStereo.inline)) {
					isInline.setSelection(true);
				}

			}
			else {
				// Don't show text areas nor buttons
				groupBody.setVisible(false);
				buttonSave.setVisible(false);
				buttonCancel.setVisible(false);

				// Methods are virtual pure
				vPropCombo.select(2);
				vPropCombo.setEnabled(false);

				// Inline not visible
				isInline.setVisible(false);
			}

			// Static
			// TODO: remove redundant (info already in UML) stereotypes from C++ profile
			if ((StereoUtils.hasStereotype (selectedOperation, CppStereo.static_))
					|| selectedOperation.isStatic()) {
				// Either default static stereotype or CppStatic
				isStatic.setSelection(true);
			} else {
				isStatic.setSelection(false);
			}

			// Const
			if (StereoUtils.hasStereotype (selectedOperation, CppStereo.const_)) {
				isConst.setSelection(true);
			} else {
				isConst.setSelection(false);
			}

			// Friend
			if (StereoUtils.hasStereotype (selectedOperation, CppStereo.friend)) {
				isFriend.setSelection(true);
			} else {
				isFriend.setSelection(false);
			}

			// Create
			if (StereoUtils.hasStereotype (selectedOperation, StdStereo.create)) {
				isCreate.setSelection(true);
			} else {
				isCreate.setSelection(false);
			}

			// Destroy
			if (StereoUtils.hasStereotype (selectedOperation, StdStereo.destroy)) {
				isDestroy.setSelection(true);
			} else {
				isDestroy.setSelection(false);
			}

		}
	}

	@Override
	protected boolean isModelValid() {
		if (selectedOperation == null) {return true;}
		if (selectedEOwner instanceof Class) {
			
			if (selectedOperation.isAbstract()) {
				if (!StereoUtils.hasStereotype (selectedOperation, CppStereo.pureVirtual)) {
					return false;
				}
				if (!StereoUtils.hasStereotype (selectedOperation, CppStereo.virtual)) {
					return false;
				}
			} else {
				if (StereoUtils.hasStereotype (selectedOperation, CppStereo.pureVirtual)) {
					return false;
				}
			}
		} else {
			// owner is interface
			if (!selectedOperation.isAbstract()) {
				return false;
			}
			if (StereoUtils.hasStereotype (selectedOperation, CppStereo.virtual)) {
				return false;
			}
			/*
			if(!selectedOperation.hasStereotype("CppVirtualPure")) {
				return false;
			}
			*/
		}
		return true;

	}

	@Override
	protected void updateModel ()
	{
		CommandSupport.exec ("C++ operation save", new Runnable () {
			public void run ()
			{
				// Check button changes
				checkStatic();
				checkConst();
				checkCreate();
				checkDestroy();
				checkInline();
				checkFriend();
				
				if (selectedOperation == null) {
					return;
				}
				if (selectedEOwner instanceof Class) {
					// toggle Stereotypes pure virtual if element is abstract
					if (selectedOperation.isAbstract()) {
						if (!StereoUtils.hasStereotype (selectedOperation, CppStereo.pureVirtual)) {
							// selectedOperation.toggleStereotype("CppVirtualPure", true);
							// selectedOperation.toggleStereotype("CppVirtual", false);
						} else {
							// selectedOperation.toggleStereotype("CppVirtual", false);
						}
					}

					// if element is abstract and has CppVirtualPure, set to Virtual only
					if (!selectedOperation.isAbstract()) {
						if (StereoUtils.hasStereotype (selectedOperation, CppStereo.pureVirtual)) {
							// selectedOperation.toggleStereotype("CppVirtualPure", false);
							// selectedOperation.toggleStereotype("CppVirtual", true);
						} else {
							// selectedOperation.toggleStereotype("CppVirtualPure", false);
							// selectedOperation.toggleStereotype("CppVirtual", false);
						}
					}
				}
				else {
					selectedOperation.setIsAbstract(true);
					// selectedOperation.toggleStereotype("CppVirtual", false);
					// selectedOperation.toggleStereotype("CppVirtualPure", true);
				}
			}
		});
	}
}