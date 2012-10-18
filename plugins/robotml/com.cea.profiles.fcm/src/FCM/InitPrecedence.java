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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FCM.InitPrecedence#getInvokeAfter <em>Invoke After</em>}</li>
 *   <li>{@link FCM.InitPrecedence#getInvokeBefore <em>Invoke Before</em>}</li>
 *   <li>{@link FCM.InitPrecedence#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see FCM.FCMPackage#getInitPrecedence()
 * @model
 * @generated
 */
public interface InitPrecedence extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoke After</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoke After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke After</em>' reference list.
	 * @see FCM.FCMPackage#getInitPrecedence_InvokeAfter()
	 * @model ordered="false"
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getInvokeAfter();

	/**
	 * Returns the value of the '<em><b>Invoke Before</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoke Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke Before</em>' reference list.
	 * @see FCM.FCMPackage#getInitPrecedence_InvokeBefore()
	 * @model ordered="false"
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getInvokeBefore();

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see FCM.FCMPackage#getInitPrecedence_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link FCM.InitPrecedence#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // InitPrecedence
