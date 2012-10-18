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

import FCM.ContainerRule;
import FCM.FCMPackage;
import FCM.RuleApplication;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FCM.impl.RuleApplicationImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link FCM.impl.RuleApplicationImpl#getContainerRule <em>Container Rule</em>}</li>
 *   <li>{@link FCM.impl.RuleApplicationImpl#getPropagateRule <em>Propagate Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleApplicationImpl extends EObjectImpl implements RuleApplication {
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
	 * The cached value of the '{@link #getContainerRule() <em>Container Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerRule()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerRule> containerRule;

	/**
	 * The cached value of the '{@link #getPropagateRule() <em>Propagate Rule</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagateRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> propagateRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FCMPackage.Literals.RULE_APPLICATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCMPackage.RULE_APPLICATION__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FCMPackage.RULE_APPLICATION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerRule> getContainerRule() {
		if (containerRule == null) {
			containerRule = new EObjectResolvingEList<ContainerRule>(ContainerRule.class, this, FCMPackage.RULE_APPLICATION__CONTAINER_RULE);
		}
		return containerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getPropagateRule() {
		if (propagateRule == null) {
			propagateRule = new EDataTypeEList<Boolean>(Boolean.class, this, FCMPackage.RULE_APPLICATION__PROPAGATE_RULE);
		}
		return propagateRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FCMPackage.RULE_APPLICATION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case FCMPackage.RULE_APPLICATION__CONTAINER_RULE:
				return getContainerRule();
			case FCMPackage.RULE_APPLICATION__PROPAGATE_RULE:
				return getPropagateRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FCMPackage.RULE_APPLICATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case FCMPackage.RULE_APPLICATION__CONTAINER_RULE:
				getContainerRule().clear();
				getContainerRule().addAll((Collection<? extends ContainerRule>)newValue);
				return;
			case FCMPackage.RULE_APPLICATION__PROPAGATE_RULE:
				getPropagateRule().clear();
				getPropagateRule().addAll((Collection<? extends Boolean>)newValue);
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
			case FCMPackage.RULE_APPLICATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case FCMPackage.RULE_APPLICATION__CONTAINER_RULE:
				getContainerRule().clear();
				return;
			case FCMPackage.RULE_APPLICATION__PROPAGATE_RULE:
				getPropagateRule().clear();
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
			case FCMPackage.RULE_APPLICATION__BASE_CLASS:
				return base_Class != null;
			case FCMPackage.RULE_APPLICATION__CONTAINER_RULE:
				return containerRule != null && !containerRule.isEmpty();
			case FCMPackage.RULE_APPLICATION__PROPAGATE_RULE:
				return propagateRule != null && !propagateRule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propagateRule: ");
		result.append(propagateRule);
		result.append(')');
		return result.toString();
	}

} //RuleApplicationImpl
