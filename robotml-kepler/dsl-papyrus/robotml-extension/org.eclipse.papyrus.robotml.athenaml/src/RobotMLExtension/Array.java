/**
 */
package RobotMLExtension;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RobotMLExtension.Array#getSize <em>Size</em>}</li>
 *   <li>{@link RobotMLExtension.Array#getDimension <em>Dimension</em>}</li>
 *   <li>{@link RobotMLExtension.Array#getTypeTemplate <em>Type Template</em>}</li>
 *   <li>{@link RobotMLExtension.Array#getBaseDataType <em>Base Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see RobotMLExtension.RobotMLExtensionPackage#getArray()
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
	 * @see RobotMLExtension.RobotMLExtensionPackage#getArray_Size()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link RobotMLExtension.Array#getSize <em>Size</em>}' attribute.
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
	 * @see RobotMLExtension.RobotMLExtensionPackage#getArray_Dimension()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDimension();

	/**
	 * Sets the value of the '{@link RobotMLExtension.Array#getDimension <em>Dimension</em>}' attribute.
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
	 * @see RobotMLExtension.RobotMLExtensionPackage#getArray_TypeTemplate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getTypeTemplate();

	/**
	 * Sets the value of the '{@link RobotMLExtension.Array#getTypeTemplate <em>Type Template</em>}' reference.
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
	 * @see RobotMLExtension.RobotMLExtensionPackage#getArray_BaseDataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBaseDataType();

	/**
	 * Sets the value of the '{@link RobotMLExtension.Array#getBaseDataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBaseDataType()
	 * @generated
	 */
	void setBaseDataType(DataType value);

} // Array
