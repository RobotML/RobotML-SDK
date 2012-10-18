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
package FCM.impl;

import FCM.FCMPackage;
import FCM.InstanceConfigurator;
import FCM.UseInstanceConfigurator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Instance Configurator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FCM.impl.UseInstanceConfiguratorImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link FCM.impl.UseInstanceConfiguratorImpl#getConfigurator <em>Configurator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseInstanceConfiguratorImpl extends EObjectImpl implements UseInstanceConfigurator {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getConfigurator() <em>Configurator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurator()
	 * @generated
	 * @ordered
	 */
	protected InstanceConfigurator configurator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseInstanceConfiguratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FCMPackage.Literals.USE_INSTANCE_CONFIGURATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCMPackage.USE_INSTANCE_CONFIGURATOR__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FCMPackage.USE_INSTANCE_CONFIGURATOR__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceConfigurator getConfigurator() {
		if (configurator != null && configurator.eIsProxy()) {
			InternalEObject oldConfigurator = (InternalEObject)configurator;
			configurator = (InstanceConfigurator)eResolveProxy(oldConfigurator);
			if (configurator != oldConfigurator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCMPackage.USE_INSTANCE_CONFIGURATOR__CONFIGURATOR, oldConfigurator, configurator));
			}
		}
		return configurator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceConfigurator basicGetConfigurator() {
		return configurator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurator(InstanceConfigurator newConfigurator) {
		InstanceConfigurator oldConfigurator = configurator;
		configurator = newConfigurator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FCMPackage.USE_INSTANCE_CONFIGURATOR__CONFIGURATOR, oldConfigurator, configurator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FCMPackage.USE_INSTANCE_CONFIGURATOR__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case FCMPackage.USE_INSTANCE_CONFIGURATOR__CONFIGURATOR:
				if (resolve) return getConfigurator();
				return basicGetConfigurator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FCMPackage.USE_INSTANCE_CONFIGURATOR__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case FCMPackage.USE_INSTANCE_CONFIGURATOR__CONFIGURATOR:
				setConfigurator((InstanceConfigurator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FCMPackage.USE_INSTANCE_CONFIGURATOR__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case FCMPackage.USE_INSTANCE_CONFIGURATOR__CONFIGURATOR:
				setConfigurator((InstanceConfigurator)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FCMPackage.USE_INSTANCE_CONFIGURATOR__BASE_CLASS:
				return base_Class != null;
			case FCMPackage.USE_INSTANCE_CONFIGURATOR__CONFIGURATOR:
				return configurator != null;
		}
		return super.eIsSet(featureID);
	}

} //UseInstanceConfiguratorImpl
