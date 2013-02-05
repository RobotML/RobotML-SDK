/**
 */
package AthenaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AthenaML.Union#getTypes <em>Types</em>}</li>
 *   <li>{@link AthenaML.Union#getBaseDataType <em>Base Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see AthenaML.AthenaMLPackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link uml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see AthenaML.AthenaMLPackage#getUnion_Types()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<DataType> getTypes();

	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBaseDataType(DataType)
	 * @see AthenaML.AthenaMLPackage#getUnion_BaseDataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBaseDataType();

	/**
	 * Sets the value of the '{@link AthenaML.Union#getBaseDataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBaseDataType()
	 * @generated
	 */
	void setBaseDataType(DataType value);

} // Union
