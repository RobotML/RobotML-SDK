/**
 */
package org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Header;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nav Sat Fix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSTATUS_NO_FIX <em>STATUS NO FIX</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSTATUS_FIX <em>STATUS FIX</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSTATUS_SBAS_FIX <em>STATUS SBAS FIX</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSTATUS_GBAS_FIX <em>STATUS GBAS FIX</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSERVICE_GPS <em>SERVICE GPS</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSERVICE_GLONASS <em>SERVICE GLONASS</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSERVICE_COMPASS <em>SERVICE COMPASS</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSERVICE_GALILEO <em>SERVICE GALILEO</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getPosition_covariance <em>Position covariance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getCOVARIANCE_TYPE_UNKNOWN <em>COVARIANCE TYPE UNKNOWN</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getCOVARIANCE_TYPE_APPROXIMATED <em>COVARIANCE TYPE APPROXIMATED</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#get_COVARIANCE_TYPE_DIAGONAL_KNOWN <em>COVARIANCE TYPE DIAGONAL KNOWN</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getCOVARIANCE_TYPE_KNOWN <em>COVARIANCE TYPE KNOWN</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getPosition_covariance_type <em>Position covariance type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix()
 * @model
 * @generated
 */
public interface NavSatFix extends EObject {
	/**
	 * Returns the value of the '<em><b>STATUS NO FIX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STATUS NO FIX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STATUS NO FIX</em>' attribute.
	 * @see #setSTATUS_NO_FIX(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_STATUS_NO_FIX()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int8" required="true" ordered="false"
	 * @generated
	 */
	char getSTATUS_NO_FIX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSTATUS_NO_FIX <em>STATUS NO FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STATUS NO FIX</em>' attribute.
	 * @see #getSTATUS_NO_FIX()
	 * @generated
	 */
	void setSTATUS_NO_FIX(char value);

	/**
	 * Returns the value of the '<em><b>STATUS FIX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STATUS FIX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STATUS FIX</em>' attribute.
	 * @see #setSTATUS_FIX(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_STATUS_FIX()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int8" required="true" ordered="false"
	 * @generated
	 */
	char getSTATUS_FIX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSTATUS_FIX <em>STATUS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STATUS FIX</em>' attribute.
	 * @see #getSTATUS_FIX()
	 * @generated
	 */
	void setSTATUS_FIX(char value);

	/**
	 * Returns the value of the '<em><b>STATUS SBAS FIX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STATUS SBAS FIX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STATUS SBAS FIX</em>' attribute.
	 * @see #setSTATUS_SBAS_FIX(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_STATUS_SBAS_FIX()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int8" required="true" ordered="false"
	 * @generated
	 */
	char getSTATUS_SBAS_FIX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSTATUS_SBAS_FIX <em>STATUS SBAS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STATUS SBAS FIX</em>' attribute.
	 * @see #getSTATUS_SBAS_FIX()
	 * @generated
	 */
	void setSTATUS_SBAS_FIX(char value);

	/**
	 * Returns the value of the '<em><b>STATUS GBAS FIX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STATUS GBAS FIX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STATUS GBAS FIX</em>' attribute.
	 * @see #setSTATUS_GBAS_FIX(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_STATUS_GBAS_FIX()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int8" required="true" ordered="false"
	 * @generated
	 */
	char getSTATUS_GBAS_FIX();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSTATUS_GBAS_FIX <em>STATUS GBAS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STATUS GBAS FIX</em>' attribute.
	 * @see #getSTATUS_GBAS_FIX()
	 * @generated
	 */
	void setSTATUS_GBAS_FIX(char value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_Status()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Int8" required="true" ordered="false"
	 * @generated
	 */
	char getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(char value);

	/**
	 * Returns the value of the '<em><b>SERVICE GPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SERVICE GPS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SERVICE GPS</em>' attribute.
	 * @see #setSERVICE_GPS(int)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_SERVICE_GPS()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt16" required="true" ordered="false"
	 * @generated
	 */
	int getSERVICE_GPS();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSERVICE_GPS <em>SERVICE GPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SERVICE GPS</em>' attribute.
	 * @see #getSERVICE_GPS()
	 * @generated
	 */
	void setSERVICE_GPS(int value);

	/**
	 * Returns the value of the '<em><b>SERVICE GLONASS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SERVICE GLONASS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SERVICE GLONASS</em>' attribute.
	 * @see #setSERVICE_GLONASS(int)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_SERVICE_GLONASS()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt16" required="true" ordered="false"
	 * @generated
	 */
	int getSERVICE_GLONASS();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSERVICE_GLONASS <em>SERVICE GLONASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SERVICE GLONASS</em>' attribute.
	 * @see #getSERVICE_GLONASS()
	 * @generated
	 */
	void setSERVICE_GLONASS(int value);

	/**
	 * Returns the value of the '<em><b>SERVICE COMPASS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SERVICE COMPASS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SERVICE COMPASS</em>' attribute.
	 * @see #setSERVICE_COMPASS(int)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_SERVICE_COMPASS()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt16" required="true" ordered="false"
	 * @generated
	 */
	int getSERVICE_COMPASS();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSERVICE_COMPASS <em>SERVICE COMPASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SERVICE COMPASS</em>' attribute.
	 * @see #getSERVICE_COMPASS()
	 * @generated
	 */
	void setSERVICE_COMPASS(int value);

	/**
	 * Returns the value of the '<em><b>SERVICE GALILEO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SERVICE GALILEO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SERVICE GALILEO</em>' attribute.
	 * @see #setSERVICE_GALILEO(int)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_SERVICE_GALILEO()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt16" required="true" ordered="false"
	 * @generated
	 */
	int getSERVICE_GALILEO();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getSERVICE_GALILEO <em>SERVICE GALILEO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SERVICE GALILEO</em>' attribute.
	 * @see #getSERVICE_GALILEO()
	 * @generated
	 */
	void setSERVICE_GALILEO(int value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(int)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_Service()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt16" required="true" ordered="false"
	 * @generated
	 */
	int getService();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(int value);

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
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_Header()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(double)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_Latitude()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float64" required="true" ordered="false"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(double)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_Longitude()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float64" required="true" ordered="false"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(double)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_Altitude()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float64" required="true" ordered="false"
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(double value);

	/**
	 * Returns the value of the '<em><b>Position covariance</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position covariance</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position covariance</em>' attribute list.
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_Position_covariance()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Float64" ordered="false"
	 * @generated
	 */
	EList<Double> getPosition_covariance();

	/**
	 * Returns the value of the '<em><b>COVARIANCE TYPE UNKNOWN</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COVARIANCE TYPE UNKNOWN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COVARIANCE TYPE UNKNOWN</em>' attribute.
	 * @see #setCOVARIANCE_TYPE_UNKNOWN(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_COVARIANCE_TYPE_UNKNOWN()
	 * @model default="0" dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt8" required="true" ordered="false"
	 * @generated
	 */
	char getCOVARIANCE_TYPE_UNKNOWN();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getCOVARIANCE_TYPE_UNKNOWN <em>COVARIANCE TYPE UNKNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COVARIANCE TYPE UNKNOWN</em>' attribute.
	 * @see #getCOVARIANCE_TYPE_UNKNOWN()
	 * @generated
	 */
	void setCOVARIANCE_TYPE_UNKNOWN(char value);

	/**
	 * Returns the value of the '<em><b>COVARIANCE TYPE APPROXIMATED</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COVARIANCE TYPE APPROXIMATED</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COVARIANCE TYPE APPROXIMATED</em>' attribute.
	 * @see #setCOVARIANCE_TYPE_APPROXIMATED(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_COVARIANCE_TYPE_APPROXIMATED()
	 * @model default="1" dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt8" required="true" ordered="false"
	 * @generated
	 */
	char getCOVARIANCE_TYPE_APPROXIMATED();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getCOVARIANCE_TYPE_APPROXIMATED <em>COVARIANCE TYPE APPROXIMATED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COVARIANCE TYPE APPROXIMATED</em>' attribute.
	 * @see #getCOVARIANCE_TYPE_APPROXIMATED()
	 * @generated
	 */
	void setCOVARIANCE_TYPE_APPROXIMATED(char value);

	/**
	 * Returns the value of the '<em><b>COVARIANCE TYPE DIAGONAL KNOWN</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COVARIANCE TYPE DIAGONAL KNOWN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COVARIANCE TYPE DIAGONAL KNOWN</em>' attribute.
	 * @see #set_COVARIANCE_TYPE_DIAGONAL_KNOWN(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix__COVARIANCE_TYPE_DIAGONAL_KNOWN()
	 * @model default="3" dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt8" required="true" ordered="false"
	 * @generated
	 */
	char get_COVARIANCE_TYPE_DIAGONAL_KNOWN();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#get_COVARIANCE_TYPE_DIAGONAL_KNOWN <em>COVARIANCE TYPE DIAGONAL KNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COVARIANCE TYPE DIAGONAL KNOWN</em>' attribute.
	 * @see #get_COVARIANCE_TYPE_DIAGONAL_KNOWN()
	 * @generated
	 */
	void set_COVARIANCE_TYPE_DIAGONAL_KNOWN(char value);

	/**
	 * Returns the value of the '<em><b>COVARIANCE TYPE KNOWN</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COVARIANCE TYPE KNOWN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COVARIANCE TYPE KNOWN</em>' attribute.
	 * @see #setCOVARIANCE_TYPE_KNOWN(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_COVARIANCE_TYPE_KNOWN()
	 * @model default="3" dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt8" required="true" ordered="false"
	 * @generated
	 */
	char getCOVARIANCE_TYPE_KNOWN();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getCOVARIANCE_TYPE_KNOWN <em>COVARIANCE TYPE KNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COVARIANCE TYPE KNOWN</em>' attribute.
	 * @see #getCOVARIANCE_TYPE_KNOWN()
	 * @generated
	 */
	void setCOVARIANCE_TYPE_KNOWN(char value);

	/**
	 * Returns the value of the '<em><b>Position covariance type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position covariance type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position covariance type</em>' attribute.
	 * @see #setPosition_covariance_type(char)
	 * @see org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage#getNavSatFix_Position_covariance_type()
	 * @model dataType="org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.UInt8" required="true" ordered="false"
	 * @generated
	 */
	char getPosition_covariance_type();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix#getPosition_covariance_type <em>Position covariance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position covariance type</em>' attribute.
	 * @see #getPosition_covariance_type()
	 * @generated
	 */
	void setPosition_covariance_type(char value);

} // NavSatFix
