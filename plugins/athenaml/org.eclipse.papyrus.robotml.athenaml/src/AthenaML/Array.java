/**
 */
package AthenaML;

import org.eclipse.emf.ecore.EObject;

import uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AthenaML.Array#getSize <em>Size</em>}</li>
 *   <li>{@link AthenaML.Array#getDimension <em>Dimension</em>}</li>
 *   <li>{@link AthenaML.Array#getTypeTemplate <em>Type Template</em>}</li>
 *   <li>{@link AthenaML.Array#getBaseDataType <em>Base Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see AthenaML.AthenaMLPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see AthenaML.AthenaMLPackage#getArray_Size()
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link AthenaML.Array#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(int)
	 * @see AthenaML.AthenaMLPackage#getArray_Dimension()
	 * @model dataType="types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDimension();

	/**
	 * Sets the value of the '{@link AthenaML.Array#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(int value);

	/**
	 * Returns the value of the '<em><b>Type Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Template</em>' reference.
	 * @see #setTypeTemplate(DataType)
	 * @see AthenaML.AthenaMLPackage#getArray_TypeTemplate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getTypeTemplate();

	/**
	 * Sets the value of the '{@link AthenaML.Array#getTypeTemplate <em>Type Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Template</em>' reference.
	 * @see #getTypeTemplate()
	 * @generated
	 */
	void setTypeTemplate(DataType value);

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
	 * @see AthenaML.AthenaMLPackage#getArray_BaseDataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBaseDataType();

	/**
	 * Sets the value of the '{@link AthenaML.Array#getBaseDataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBaseDataType()
	 * @generated
	 */
	void setBaseDataType(DataType value);

} // Array
