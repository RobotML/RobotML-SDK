/**
 */
package org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int32 Multi Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int32MultiArray#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int32MultiArray#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Std_datatypesPackage#getInt32MultiArray()
 * @model
 * @generated
 */
public interface Int32MultiArray extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(MultiArrayLayout)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Std_datatypesPackage#getInt32MultiArray_Layout()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MultiArrayLayout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int32MultiArray#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(MultiArrayLayout value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Std_datatypesPackage#getInt32MultiArray_Data()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int32" ordered="false"
	 * @generated
	 */
	EList<Integer> getData();

} // Int32MultiArray
