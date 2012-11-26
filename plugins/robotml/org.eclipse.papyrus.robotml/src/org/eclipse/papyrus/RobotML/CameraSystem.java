/**
 */
package org.eclipse.papyrus.RobotML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.RobotML.CameraSystem#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotML.CameraSystem#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotML.CameraSystem#getAlpha_u <em>Alpha u</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotML.CameraSystem#getAlpha_v <em>Alpha v</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotML.CameraSystem#getU0 <em>U0</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotML.CameraSystem#getV0 <em>V0</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotML.CameraSystem#getColor_format <em>Color format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.RobotML.RobotMLPackage#getCameraSystem()
 * @model
 * @generated
 */
public interface CameraSystem extends ImageSensorSystem {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see org.eclipse.papyrus.RobotML.RobotMLPackage#getCameraSystem_Width()
	 * @model default="0" dataType="org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float32" required="true" ordered="false"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.RobotML.CameraSystem#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see org.eclipse.papyrus.RobotML.RobotMLPackage#getCameraSystem_Height()
	 * @model dataType="org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float32" required="true" ordered="false"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.RobotML.CameraSystem#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Alpha u</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha u</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha u</em>' attribute.
	 * @see #setAlpha_u(float)
	 * @see org.eclipse.papyrus.RobotML.RobotMLPackage#getCameraSystem_Alpha_u()
	 * @model dataType="org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float32" required="true" ordered="false"
	 * @generated
	 */
	float getAlpha_u();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.RobotML.CameraSystem#getAlpha_u <em>Alpha u</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha u</em>' attribute.
	 * @see #getAlpha_u()
	 * @generated
	 */
	void setAlpha_u(float value);

	/**
	 * Returns the value of the '<em><b>Alpha v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha v</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha v</em>' attribute.
	 * @see #setAlpha_v(float)
	 * @see org.eclipse.papyrus.RobotML.RobotMLPackage#getCameraSystem_Alpha_v()
	 * @model dataType="org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float32" required="true" ordered="false"
	 * @generated
	 */
	float getAlpha_v();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.RobotML.CameraSystem#getAlpha_v <em>Alpha v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha v</em>' attribute.
	 * @see #getAlpha_v()
	 * @generated
	 */
	void setAlpha_v(float value);

	/**
	 * Returns the value of the '<em><b>U0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U0</em>' attribute.
	 * @see #setU0(float)
	 * @see org.eclipse.papyrus.RobotML.RobotMLPackage#getCameraSystem_U0()
	 * @model dataType="org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float32" required="true" ordered="false"
	 * @generated
	 */
	float getU0();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.RobotML.CameraSystem#getU0 <em>U0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U0</em>' attribute.
	 * @see #getU0()
	 * @generated
	 */
	void setU0(float value);

	/**
	 * Returns the value of the '<em><b>V0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V0</em>' attribute.
	 * @see #setV0(float)
	 * @see org.eclipse.papyrus.RobotML.RobotMLPackage#getCameraSystem_V0()
	 * @model dataType="org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float32" required="true" ordered="false"
	 * @generated
	 */
	float getV0();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.RobotML.CameraSystem#getV0 <em>V0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V0</em>' attribute.
	 * @see #getV0()
	 * @generated
	 */
	void setV0(float value);

	/**
	 * Returns the value of the '<em><b>Color format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color format</em>' attribute.
	 * @see #setColor_format(String)
	 * @see org.eclipse.papyrus.RobotML.RobotMLPackage#getCameraSystem_Color_format()
	 * @model dataType="org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getColor_format();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.RobotML.CameraSystem#getColor_format <em>Color format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color format</em>' attribute.
	 * @see #getColor_format()
	 * @generated
	 */
	void setColor_format(String value);

} // CameraSystem
