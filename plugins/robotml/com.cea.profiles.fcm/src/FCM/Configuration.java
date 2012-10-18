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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FCM.Configuration#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link FCM.Configuration#getConfigOptions <em>Config Options</em>}</li>
 *   <li>{@link FCM.Configuration#getDeploymentPlan <em>Deployment Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @see FCM.FCMPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
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
	 * @see FCM.FCMPackage#getConfiguration_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link FCM.Configuration#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Config Options</b></em>' reference list.
	 * The list contents are of type {@link FCM.ConfigOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Options</em>' reference list.
	 * @see FCM.FCMPackage#getConfiguration_ConfigOptions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConfigOption> getConfigOptions();

	/**
	 * Returns the value of the '<em><b>Deployment Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Plan</em>' reference.
	 * @see #setDeploymentPlan(DeploymentPlan)
	 * @see FCM.FCMPackage#getConfiguration_DeploymentPlan()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeploymentPlan getDeploymentPlan();

	/**
	 * Sets the value of the '{@link FCM.Configuration#getDeploymentPlan <em>Deployment Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Plan</em>' reference.
	 * @see #getDeploymentPlan()
	 * @generated
	 */
	void setDeploymentPlan(DeploymentPlan value);

} // Configuration
