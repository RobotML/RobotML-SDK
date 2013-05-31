/**
 */
package RobotMLExtension;

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
 *   <li>{@link RobotMLExtension.Map#getValuesType <em>Values Type</em>}</li>
 *   <li>{@link RobotMLExtension.Map#getBaseDataType <em>Base Data Type</em>}</li>
 *   <li>{@link RobotMLExtension.Map#getKeysType <em>Keys Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see RobotMLExtension.RobotMLExtensionPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Values Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Type</em>' reference.
	 * @see #setValuesType(DataType)
	 * @see RobotMLExtension.RobotMLExtensionPackage#getMap_ValuesType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getValuesType();

	/**
	 * Sets the value of the '{@link RobotMLExtension.Map#getValuesType <em>Values Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Type</em>' reference.
	 * @see #getValuesType()
	 * @generated
	 */
	void setValuesType(DataType value);

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
	 * @see RobotMLExtension.RobotMLExtensionPackage#getMap_BaseDataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBaseDataType();

	/**
	 * Sets the value of the '{@link RobotMLExtension.Map#getBaseDataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBaseDataType()
	 * @generated
	 */
	void setBaseDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Keys Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys Type</em>' reference.
	 * @see #setKeysType(DataType)
	 * @see RobotMLExtension.RobotMLExtensionPackage#getMap_KeysType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getKeysType();

	/**
	 * Sets the value of the '{@link RobotMLExtension.Map#getKeysType <em>Keys Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys Type</em>' reference.
	 * @see #getKeysType()
	 * @generated
	 */
	void setKeysType(DataType value);

} // Map
