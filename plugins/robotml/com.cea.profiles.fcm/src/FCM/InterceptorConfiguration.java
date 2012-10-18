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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Slot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interceptor Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FCM.InterceptorConfiguration#getBase_Slot <em>Base Slot</em>}</li>
 *   <li>{@link FCM.InterceptorConfiguration#getInterceptor <em>Interceptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see FCM.FCMPackage#getInterceptorConfiguration()
 * @model
 * @generated
 */
public interface InterceptorConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Slot</em>' reference.
	 * @see #setBase_Slot(Slot)
	 * @see FCM.FCMPackage#getInterceptorConfiguration_Base_Slot()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Slot getBase_Slot();

	/**
	 * Sets the value of the '{@link FCM.InterceptorConfiguration#getBase_Slot <em>Base Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Slot</em>' reference.
	 * @see #getBase_Slot()
	 * @generated
	 */
	void setBase_Slot(Slot value);

	/**
	 * Returns the value of the '<em><b>Interceptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptor</em>' reference.
	 * @see #setInterceptor(Port)
	 * @see FCM.FCMPackage#getInterceptorConfiguration_Interceptor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getInterceptor();

	/**
	 * Sets the value of the '{@link FCM.InterceptorConfiguration#getInterceptor <em>Interceptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interceptor</em>' reference.
	 * @see #getInterceptor()
	 * @generated
	 */
	void setInterceptor(Port value);

} // InterceptorConfiguration
