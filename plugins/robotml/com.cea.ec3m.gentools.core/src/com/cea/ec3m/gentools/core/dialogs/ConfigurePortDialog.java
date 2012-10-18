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
package com.cea.ec3m.gentools.core.dialogs;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider;
import org.eclipse.papyrus.uml.tools.providers.ServiceEditFilteredContentProvider;
import org.eclipse.papyrus.infra.widgets.editors.TreeSelectorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionStatusDialog;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import FCM.PortKind;

import com.cea.ec3m.gentools.core.Description;
import com.cea.ec3m.gentools.core.PortUtils;
import com.cea.ec3m.gentools.core.StUtils;
import com.cea.ec3m.gentools.core.Utils;

/**
 * Select container rules, either from a list of globally defined rules or from
 * local rules which may be created "on the fly" by this dialog.
 * 
 * TODO: extend rule application to instances (problematic, since rules
 * transformation is done on type level)
 * 
 * @author ansgar
 */
public class ConfigurePortDialog extends SelectionStatusDialog {

	protected Class m_component;

	protected Text fDescription;

	protected TableViewer fPortList;

	protected Port m_currentPort;

	protected Combo fKindCombo;

	protected EList<PortKind> portKindList;

	protected Label fType;

	protected Button fTypeButton;

	protected Label fProvided;

	protected Label fRequired;

	protected Package m_model;

	protected EList<Port> m_ports;

	public ConfigurePortDialog(Shell parent) {
		super(parent);
	}

	public boolean init(Port port) {
		// visitedPackages = new BasicEList<Package> ();
		m_component = port.getClass_();
		m_currentPort = port; // preselect port (don't call selectPort before initialization of dialog area);
		m_model = Utils.getTop(m_component);
		m_ports = PortUtils.getAllPorts(m_component);
		return true;
	}

	public boolean init(Class clazz) {
		// visitedPackages = new BasicEList<Package> ();
		m_component = clazz;
		m_model = Utils.getTop(m_component);
		m_currentPort = null;
		m_ports = PortUtils.getAllPorts(m_component);
		return true;
	}


	/**
	 * @see SelectionStatusDialog#computeResult()
	 */
	protected void computeResult() {
		// nothing to do
	}

	public Control createDialogArea(Composite parent) {
		Composite contents = (Composite)super.createDialogArea(parent);
		// (parent, "Container rules", "Avail. extensions/interceptors");

		createPortConfigurationGroup(contents);
		if(m_currentPort != null) {
			int index = m_ports.indexOf(m_currentPort);
			if(index != -1) {
				fPortList.getTable().setSelection(index);
				selectPort(m_currentPort);
			}
		}
		return contents;
	}

	// create instance configuration group
	protected void createPortConfigurationGroup(Composite parent) {
		GridData groupGridData = DialogUtils.createFillGridData();

		// create grid data
		GridData gridData = DialogUtils.createFillGridData();
		GridData gridDataH80Span2 = DialogUtils.createFillGridData();
		gridDataH80Span2.horizontalSpan = 2;
		gridDataH80Span2.heightHint = 80;
		GridData gridDataH25Span2 = DialogUtils.createFillGridData();
		gridDataH25Span2.horizontalSpan = 2;
		gridDataH25Span2.heightHint = 25;
		GridData gridDataH60 = DialogUtils.createFillGridData();
		gridDataH60.heightHint = 60;
		GridData gridDataSpan2 = DialogUtils.createFillGridData();
		gridDataSpan2.horizontalSpan = 2;

		// fRuleName = new Text (ruleInfoGroup, SWT.NONE);
		Group portSelection = new Group(parent, SWT.BORDER);
		portSelection.setLayout(new GridLayout(1, false));
		// configL.setLayout(new RowLayout());

		portSelection.setText(" Available Ports ");
		portSelection.setLayoutData(gridDataH60);

		fPortList = new TableViewer(portSelection, SWT.BORDER);
		fPortList.setLabelProvider(new PortLabelProvider());
		fPortList.setContentProvider(new ArrayContentProvider());
		fPortList.setInput(m_ports.toArray());
		fPortList.getTable().setLayoutData(gridDataH60);
		fPortList.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = fPortList.getSelection();
				if(selection instanceof StructuredSelection) {
					Object[] selected = ((StructuredSelection)selection)
						.toArray();
					if((selected.length == 1)
						&& (selected[0] instanceof Port)) {
						selectPort((Port)selected[0]);
					}
				}
			}
		});
		portSelection.pack();

		Group instanceConfigurationGroup = new Group(parent, SWT.BORDER);
		instanceConfigurationGroup.setText(" Port configuration ");
		instanceConfigurationGroup.setLayout(new GridLayout(2, false));
		instanceConfigurationGroup.setLayoutData(groupGridData);

		Label kindText = new Label(instanceConfigurationGroup, SWT.NONE);
		kindText.setText("Kind:");

		fKindCombo = new Combo(instanceConfigurationGroup, SWT.NONE);
		portKindList = getAvailableKinds(m_model);
		String[] portKindStrList = new String[portKindList.size() + 1];
		portKindStrList[0] = "none";
		for(int i = 0; i < portKindList.size(); i++) {
			portKindStrList[i + 1] = portKindList.get(i).getBase_Class().getName();
		}
		fKindCombo.setItems(portKindStrList);
		fKindCombo.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				// changePortKind
				FCM.Port fcmPort = StUtils.applyApp(m_currentPort, FCM.Port.class);
				if(fcmPort != null)
				{
					int index = fKindCombo.getSelectionIndex();
					if(index > 0) {
						PortKind kind = portKindList.get(index - 1);
						fcmPort.setKind(kind);
						selectPort(m_currentPort);
					}
					else {
						StUtils.unapply(m_currentPort, FCM.Port.class);
						selectPort(m_currentPort);
					}
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		Label fTypeLabel = new Label(instanceConfigurationGroup, SWT.NONE);
		fTypeLabel.setText("Type:");
		fTypeLabel.setLayoutData(gridData);

		fType = new Label(instanceConfigurationGroup, SWT.NONE);
		fType.setLayoutData(gridData);

		fTypeButton = new Button(instanceConfigurationGroup, SWT.NONE);
		fTypeButton.setText("change type");
		fTypeButton.setLayoutData(gridDataH25Span2);
		fTypeButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				// use Papyrus type selection dialog ...
				//	org.eclipse.papyrus.prope
				TreeSelectorDialog tsd = new TreeSelectorDialog(new Shell());
				//ServiceEditFilteredContentProvider contentProvider;

				EStructuralFeature feature = UMLPackage.eINSTANCE.getTypedElement_Type();
				ServiceEditFilteredContentProvider cP = new ServiceEditFilteredContentProvider(m_currentPort, feature, m_model.eResource().getResourceSet());
				//contentProvider = new ServiceEditFilteredContentProvider(m_currentPort, feature, m_model);
				cP.setWantedMetaclasses((List<?>) feature.getEType());
				cP.setNotWantedMetaclasses(Collections.EMPTY_LIST);
				
				tsd.setContentProvider(cP);
				tsd.setLabelProvider(new UMLLabelProvider());
				tsd.open();
				Object result[] = tsd.getResult();
				if(result.length == 1) {
					if(result[0] instanceof IAdaptable) {
						Object type = ((IAdaptable)result[0]).getAdapter(EObject.class);
						if(type instanceof Type) {
							m_currentPort.setType((Type)type);
							selectPort(m_currentPort);
						}
					}
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		// Label emptySpace = new Label(instanceConfigurationGroup, SWT.NONE);
		// emptySpace.setLayoutData(gridDataSpan2);


		// Composite derivedInterfaces = new Composite(instanceConfigurationGroup, SWT.NONE);
		Group derivedInterfaces = new Group(instanceConfigurationGroup, SWT.NONE);
		derivedInterfaces.setLayout(new GridLayout(2, false));

		// Label dil = new Label(derivedInterfaces, SWT.NONE);
		// dil.setText("Interfaces derived from port kind");
		derivedInterfaces.setText("Interfaces derived from kind and type");
		// dil.setLayoutData(gridDataSpan2);
		derivedInterfaces.setLayoutData(gridDataSpan2);

		Label fProvidedLabel = new Label(derivedInterfaces, SWT.NONE);
		fProvidedLabel.setText("Provided:");
		fProvided = new Label(derivedInterfaces, SWT.NONE);
		fProvided.setLayoutData(gridData);

		Label fRequiredLabel = new Label(derivedInterfaces, SWT.NONE);
		fRequiredLabel.setText("Required:");
		fRequired = new Label(derivedInterfaces, SWT.NONE);
		fRequired.setLayoutData(gridData);
		derivedInterfaces.pack();

		fDescription = new Text(instanceConfigurationGroup, SWT.NONE | SWT.WRAP
			| SWT.V_SCROLL | SWT.READ_ONLY);
		fDescription.setLayoutData(gridDataH80Span2);
		// createMessageArea (ruleInfoGroup);
		instanceConfigurationGroup.pack();
		setEnabled(false);
	}

	/**
	 * Select a rule, i.e. update the visual representation from the rule
	 * 
	 * @param rule
	 */
	protected void selectPort(Port port) {
		m_currentPort = port;
		if(port == null) {
			setEnabled(false);
			return;
		}
		setEnabled(true);
		FCM.Port fcmPort = StUtils.getApplication(port, FCM.Port.class);
		if(port.getType() != null) {
			fType.setText(port.getType().getQualifiedName());
		}
		else {
			fType.setText("undefined");
		}
		if((fcmPort != null) && (fcmPort.getKind() != null)) {
			PortKind kind = fcmPort.getKind();
			if(portKindList.contains(kind)) {
				int index = portKindList.indexOf(kind) + 1;
				fKindCombo.select(index);
			}
			fDescription.setText(Description.getDescription(kind.getBase_Class(), "not available"));
			Interface providedI = PortUtils.getProvided(port);
			Interface requiredI = PortUtils.getRequired(port);
			fProvided.setText(providedI != null ? providedI.getQualifiedName() : "none");
			fRequired.setText(requiredI != null ? requiredI.getQualifiedName() : "none");
		}
		else {
			fProvided.setText(port.getProvideds().size() > 0 ? port.getProvideds().get(0).getQualifiedName() : "none");
			fRequired.setText(port.getRequireds().size() > 0 ? port.getRequireds().get(0).getQualifiedName() : "none");
			fKindCombo.select(0);
			fDescription.setText("");
		}
	}

	private void setEnabled(boolean enabled) {
		fDescription.setEnabled(enabled);
		if(!enabled) {
			fDescription.setText("");
		}
	}

	protected EList<PortKind> getAvailableKinds(Package pkg) {
		EList<PortKind> portKindList = new UniqueEList<PortKind>();
		EList<Package> visitedPackages = new BasicEList<Package>();
		getAvailableKinds(pkg, portKindList, visitedPackages);
		return portKindList;
	}

	protected void getAvailableKinds(Package pkg, EList<PortKind> portKindList, EList<Package> visitedPackages) {
		for(Element el : pkg.getMembers()) {
			if(el instanceof Package) {
				if(!visitedPackages.contains(el)) {
					visitedPackages.add((Package)el);
					getAvailableKinds((Package)el, portKindList, visitedPackages);
				}
			} else if(el instanceof Class) {
				PortKind portKind = StUtils.getApplication((Class)el, PortKind.class);
				if(portKind != null) {
					portKindList.add(portKind);
				}
			}
		}
	}
}
