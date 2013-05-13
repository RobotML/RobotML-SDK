/**
 */
package org.eclipse.papyrus.robotML.AthenaML;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.robotML.AthenaML.Map#getValues_type <em>Values type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.robotML.AthenaML.Map#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.robotML.AthenaML.Map#getKeys_type <em>Keys type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.robotML.AthenaML.AthenaMLPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Values type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values type</em>' reference.
	 * @see #setValues_type(DataType)
	 * @see org.eclipse.papyrus.robotML.AthenaML.AthenaMLPackage#getMap_Values_type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getValues_type();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.robotML.AthenaML.Map#getValues_type <em>Values type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values type</em>' reference.
	 * @see #getValues_type()
	 * @generated
	 */
	void setValues_type(DataType value);

	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see org.eclipse.papyrus.robotML.AthenaML.AthenaMLPackage#getMap_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.robotML.AthenaML.Map#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Keys type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys type</em>' reference.
	 * @see #setKeys_type(DataType)
	 * @see org.eclipse.papyrus.robotML.AthenaML.AthenaMLPackage#getMap_Keys_type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getKeys_type();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.robotML.AthenaML.Map#getKeys_type <em>Keys type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys type</em>' reference.
	 * @see #getKeys_type()
	 * @generated
	 */
	void setKeys_type(DataType value);

} // Map
