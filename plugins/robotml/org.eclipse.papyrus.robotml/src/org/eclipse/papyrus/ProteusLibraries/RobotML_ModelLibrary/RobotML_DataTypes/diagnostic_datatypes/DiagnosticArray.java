/**
 */
package org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Header;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.DiagnosticArray#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.DiagnosticArray#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.DiagnosticArray#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.Diagnostic_datatypesPackage#getDiagnosticArray()
 * @model
 * @generated
 */
public interface DiagnosticArray extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.Diagnostic_datatypesPackage#getDiagnosticArray_Header()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.DiagnosticArray#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.DiagnosticStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference list.
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.Diagnostic_datatypesPackage#getDiagnosticArray_Status()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiagnosticStatus> getStatus();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.diagnostic_datatypes.Diagnostic_datatypesPackage#getDiagnosticArray_Values()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<KeyValue> getValues();

} // DiagnosticArray
