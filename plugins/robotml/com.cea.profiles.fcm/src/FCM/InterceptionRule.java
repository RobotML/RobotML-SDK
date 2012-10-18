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
package FCM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interception Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FCM.InterceptionRule#getInterceptionKind <em>Interception Kind</em>}</li>
 *   <li>{@link FCM.InterceptionRule#getPortSet <em>Port Set</em>}</li>
 *   <li>{@link FCM.InterceptionRule#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see FCM.FCMPackage#getInterceptionRule()
 * @model
 * @generated
 */
public interface InterceptionRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Interception Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link FCM.InterceptionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interception Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interception Kind</em>' attribute.
	 * @see FCM.InterceptionKind
	 * @see #setInterceptionKind(InterceptionKind)
	 * @see FCM.FCMPackage#getInterceptionRule_InterceptionKind()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	InterceptionKind getInterceptionKind();

	/**
	 * Sets the value of the '{@link FCM.InterceptionRule#getInterceptionKind <em>Interception Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interception Kind</em>' attribute.
	 * @see FCM.InterceptionKind
	 * @see #getInterceptionKind()
	 * @generated
	 */
	void setInterceptionKind(InterceptionKind value);

	/**
	 * Returns the value of the '<em><b>Port Set</b></em>' reference list.
	 * The list contents are of type {@link FCM.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Set</em>' reference list.
	 * @see FCM.FCMPackage#getInterceptionRule_PortSet()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Port> getPortSet();

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see FCM.FCMPackage#getInterceptionRule_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link FCM.InterceptionRule#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // InterceptionRule
