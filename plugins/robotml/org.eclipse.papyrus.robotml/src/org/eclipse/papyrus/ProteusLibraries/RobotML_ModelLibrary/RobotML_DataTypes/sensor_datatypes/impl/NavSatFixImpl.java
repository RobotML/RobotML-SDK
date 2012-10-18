/**
 */
package org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.NavSatFix;
import org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.Sensor_datatypesPackage;

import org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.std_datatypes.Header;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nav Sat Fix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getSTATUS_NO_FIX <em>STATUS NO FIX</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getSTATUS_FIX <em>STATUS FIX</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getSTATUS_SBAS_FIX <em>STATUS SBAS FIX</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getSTATUS_GBAS_FIX <em>STATUS GBAS FIX</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getSERVICE_GPS <em>SERVICE GPS</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getSERVICE_GLONASS <em>SERVICE GLONASS</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getSERVICE_COMPASS <em>SERVICE COMPASS</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getSERVICE_GALILEO <em>SERVICE GALILEO</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getPosition_covariance <em>Position covariance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getCOVARIANCE_TYPE_UNKNOWN <em>COVARIANCE TYPE UNKNOWN</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getCOVARIANCE_TYPE_APPROXIMATED <em>COVARIANCE TYPE APPROXIMATED</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#get_COVARIANCE_TYPE_DIAGONAL_KNOWN <em>COVARIANCE TYPE DIAGONAL KNOWN</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getCOVARIANCE_TYPE_KNOWN <em>COVARIANCE TYPE KNOWN</em>}</li>
 *   <li>{@link org.eclipse.papyrus.ProteusLibraries.RobotML_ModelLibrary.RobotML_DataTypes.sensor_datatypes.impl.NavSatFixImpl#getPosition_covariance_type <em>Position covariance type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavSatFixImpl extends EObjectImpl implements NavSatFix {
	/**
	 * The default value of the '{@link #getSTATUS_NO_FIX() <em>STATUS NO FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTATUS_NO_FIX()
	 * @generated
	 * @ordered
	 */
	protected static final char STATUS_NO_FIX_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getSTATUS_NO_FIX() <em>STATUS NO FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTATUS_NO_FIX()
	 * @generated
	 * @ordered
	 */
	protected char statuS_NO_FIX = STATUS_NO_FIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSTATUS_FIX() <em>STATUS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTATUS_FIX()
	 * @generated
	 * @ordered
	 */
	protected static final char STATUS_FIX_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getSTATUS_FIX() <em>STATUS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTATUS_FIX()
	 * @generated
	 * @ordered
	 */
	protected char statuS_FIX = STATUS_FIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSTATUS_SBAS_FIX() <em>STATUS SBAS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTATUS_SBAS_FIX()
	 * @generated
	 * @ordered
	 */
	protected static final char STATUS_SBAS_FIX_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getSTATUS_SBAS_FIX() <em>STATUS SBAS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTATUS_SBAS_FIX()
	 * @generated
	 * @ordered
	 */
	protected char statuS_SBAS_FIX = STATUS_SBAS_FIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSTATUS_GBAS_FIX() <em>STATUS GBAS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTATUS_GBAS_FIX()
	 * @generated
	 * @ordered
	 */
	protected static final char STATUS_GBAS_FIX_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getSTATUS_GBAS_FIX() <em>STATUS GBAS FIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTATUS_GBAS_FIX()
	 * @generated
	 * @ordered
	 */
	protected char statuS_GBAS_FIX = STATUS_GBAS_FIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final char STATUS_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected char status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSERVICE_GPS() <em>SERVICE GPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSERVICE_GPS()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_GPS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSERVICE_GPS() <em>SERVICE GPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSERVICE_GPS()
	 * @generated
	 * @ordered
	 */
	protected int servicE_GPS = SERVICE_GPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSERVICE_GLONASS() <em>SERVICE GLONASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSERVICE_GLONASS()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_GLONASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSERVICE_GLONASS() <em>SERVICE GLONASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSERVICE_GLONASS()
	 * @generated
	 * @ordered
	 */
	protected int servicE_GLONASS = SERVICE_GLONASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSERVICE_COMPASS() <em>SERVICE COMPASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSERVICE_COMPASS()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_COMPASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSERVICE_COMPASS() <em>SERVICE COMPASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSERVICE_COMPASS()
	 * @generated
	 * @ordered
	 */
	protected int servicE_COMPASS = SERVICE_COMPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSERVICE_GALILEO() <em>SERVICE GALILEO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSERVICE_GALILEO()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_GALILEO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSERVICE_GALILEO() <em>SERVICE GALILEO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSERVICE_GALILEO()
	 * @generated
	 * @ordered
	 */
	protected int servicE_GALILEO = SERVICE_GALILEO_EDEFAULT;

	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected int service = SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected double latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected double longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected double altitude = ALTITUDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition_covariance() <em>Position covariance</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition_covariance()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> position_covariance;

	/**
	 * The default value of the '{@link #getCOVARIANCE_TYPE_UNKNOWN() <em>COVARIANCE TYPE UNKNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOVARIANCE_TYPE_UNKNOWN()
	 * @generated
	 * @ordered
	 */
	protected static final char COVARIANCE_TYPE_UNKNOWN_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getCOVARIANCE_TYPE_UNKNOWN() <em>COVARIANCE TYPE UNKNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOVARIANCE_TYPE_UNKNOWN()
	 * @generated
	 * @ordered
	 */
	protected char covariancE_TYPE_UNKNOWN = COVARIANCE_TYPE_UNKNOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCOVARIANCE_TYPE_APPROXIMATED() <em>COVARIANCE TYPE APPROXIMATED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOVARIANCE_TYPE_APPROXIMATED()
	 * @generated
	 * @ordered
	 */
	protected static final char COVARIANCE_TYPE_APPROXIMATED_EDEFAULT = '\u0001';

	/**
	 * The cached value of the '{@link #getCOVARIANCE_TYPE_APPROXIMATED() <em>COVARIANCE TYPE APPROXIMATED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOVARIANCE_TYPE_APPROXIMATED()
	 * @generated
	 * @ordered
	 */
	protected char covariancE_TYPE_APPROXIMATED = COVARIANCE_TYPE_APPROXIMATED_EDEFAULT;

	/**
	 * The default value of the '{@link #get_COVARIANCE_TYPE_DIAGONAL_KNOWN() <em>COVARIANCE TYPE DIAGONAL KNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_COVARIANCE_TYPE_DIAGONAL_KNOWN()
	 * @generated
	 * @ordered
	 */
	protected static final char _COVARIANCE_TYPE_DIAGONAL_KNOWN_EDEFAULT = '\u0003';

	/**
	 * The cached value of the '{@link #get_COVARIANCE_TYPE_DIAGONAL_KNOWN() <em>COVARIANCE TYPE DIAGONAL KNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_COVARIANCE_TYPE_DIAGONAL_KNOWN()
	 * @generated
	 * @ordered
	 */
	protected char _COVARIANCE_TYPE_DIAGONAL_KNOWN = _COVARIANCE_TYPE_DIAGONAL_KNOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCOVARIANCE_TYPE_KNOWN() <em>COVARIANCE TYPE KNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOVARIANCE_TYPE_KNOWN()
	 * @generated
	 * @ordered
	 */
	protected static final char COVARIANCE_TYPE_KNOWN_EDEFAULT = '\u0003';

	/**
	 * The cached value of the '{@link #getCOVARIANCE_TYPE_KNOWN() <em>COVARIANCE TYPE KNOWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOVARIANCE_TYPE_KNOWN()
	 * @generated
	 * @ordered
	 */
	protected char covariancE_TYPE_KNOWN = COVARIANCE_TYPE_KNOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition_covariance_type() <em>Position covariance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition_covariance_type()
	 * @generated
	 * @ordered
	 */
	protected static final char POSITION_COVARIANCE_TYPE_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getPosition_covariance_type() <em>Position covariance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition_covariance_type()
	 * @generated
	 * @ordered
	 */
	protected char position_covariance_type = POSITION_COVARIANCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavSatFixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sensor_datatypesPackage.Literals.NAV_SAT_FIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getSTATUS_NO_FIX() {
		return statuS_NO_FIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTATUS_NO_FIX(char newSTATUS_NO_FIX) {
		char oldSTATUS_NO_FIX = statuS_NO_FIX;
		statuS_NO_FIX = newSTATUS_NO_FIX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_NO_FIX, oldSTATUS_NO_FIX, statuS_NO_FIX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getSTATUS_FIX() {
		return statuS_FIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTATUS_FIX(char newSTATUS_FIX) {
		char oldSTATUS_FIX = statuS_FIX;
		statuS_FIX = newSTATUS_FIX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_FIX, oldSTATUS_FIX, statuS_FIX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getSTATUS_SBAS_FIX() {
		return statuS_SBAS_FIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTATUS_SBAS_FIX(char newSTATUS_SBAS_FIX) {
		char oldSTATUS_SBAS_FIX = statuS_SBAS_FIX;
		statuS_SBAS_FIX = newSTATUS_SBAS_FIX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_SBAS_FIX, oldSTATUS_SBAS_FIX, statuS_SBAS_FIX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getSTATUS_GBAS_FIX() {
		return statuS_GBAS_FIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTATUS_GBAS_FIX(char newSTATUS_GBAS_FIX) {
		char oldSTATUS_GBAS_FIX = statuS_GBAS_FIX;
		statuS_GBAS_FIX = newSTATUS_GBAS_FIX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_GBAS_FIX, oldSTATUS_GBAS_FIX, statuS_GBAS_FIX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(char newStatus) {
		char oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSERVICE_GPS() {
		return servicE_GPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSERVICE_GPS(int newSERVICE_GPS) {
		int oldSERVICE_GPS = servicE_GPS;
		servicE_GPS = newSERVICE_GPS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GPS, oldSERVICE_GPS, servicE_GPS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSERVICE_GLONASS() {
		return servicE_GLONASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSERVICE_GLONASS(int newSERVICE_GLONASS) {
		int oldSERVICE_GLONASS = servicE_GLONASS;
		servicE_GLONASS = newSERVICE_GLONASS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GLONASS, oldSERVICE_GLONASS, servicE_GLONASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSERVICE_COMPASS() {
		return servicE_COMPASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSERVICE_COMPASS(int newSERVICE_COMPASS) {
		int oldSERVICE_COMPASS = servicE_COMPASS;
		servicE_COMPASS = newSERVICE_COMPASS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_COMPASS, oldSERVICE_COMPASS, servicE_COMPASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSERVICE_GALILEO() {
		return servicE_GALILEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSERVICE_GALILEO(int newSERVICE_GALILEO) {
		int oldSERVICE_GALILEO = servicE_GALILEO;
		servicE_GALILEO = newSERVICE_GALILEO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GALILEO, oldSERVICE_GALILEO, servicE_GALILEO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(int newService) {
		int oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sensor_datatypesPackage.NAV_SAT_FIX__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sensor_datatypesPackage.NAV_SAT_FIX__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(double newLatitude) {
		double oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(double newLongitude) {
		double oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(double newAltitude) {
		double oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getPosition_covariance() {
		if (position_covariance == null) {
			position_covariance = new EDataTypeUniqueEList<Double>(Double.class, this, Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE);
		}
		return position_covariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getCOVARIANCE_TYPE_UNKNOWN() {
		return covariancE_TYPE_UNKNOWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOVARIANCE_TYPE_UNKNOWN(char newCOVARIANCE_TYPE_UNKNOWN) {
		char oldCOVARIANCE_TYPE_UNKNOWN = covariancE_TYPE_UNKNOWN;
		covariancE_TYPE_UNKNOWN = newCOVARIANCE_TYPE_UNKNOWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_UNKNOWN, oldCOVARIANCE_TYPE_UNKNOWN, covariancE_TYPE_UNKNOWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getCOVARIANCE_TYPE_APPROXIMATED() {
		return covariancE_TYPE_APPROXIMATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOVARIANCE_TYPE_APPROXIMATED(char newCOVARIANCE_TYPE_APPROXIMATED) {
		char oldCOVARIANCE_TYPE_APPROXIMATED = covariancE_TYPE_APPROXIMATED;
		covariancE_TYPE_APPROXIMATED = newCOVARIANCE_TYPE_APPROXIMATED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_APPROXIMATED, oldCOVARIANCE_TYPE_APPROXIMATED, covariancE_TYPE_APPROXIMATED));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char get_COVARIANCE_TYPE_DIAGONAL_KNOWN() {
		return _COVARIANCE_TYPE_DIAGONAL_KNOWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_COVARIANCE_TYPE_DIAGONAL_KNOWN(char new_COVARIANCE_TYPE_DIAGONAL_KNOWN) {
		char old_COVARIANCE_TYPE_DIAGONAL_KNOWN = _COVARIANCE_TYPE_DIAGONAL_KNOWN;
		_COVARIANCE_TYPE_DIAGONAL_KNOWN = new_COVARIANCE_TYPE_DIAGONAL_KNOWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_DIAGONAL_KNOWN, old_COVARIANCE_TYPE_DIAGONAL_KNOWN, _COVARIANCE_TYPE_DIAGONAL_KNOWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getCOVARIANCE_TYPE_KNOWN() {
		return covariancE_TYPE_KNOWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOVARIANCE_TYPE_KNOWN(char newCOVARIANCE_TYPE_KNOWN) {
		char oldCOVARIANCE_TYPE_KNOWN = covariancE_TYPE_KNOWN;
		covariancE_TYPE_KNOWN = newCOVARIANCE_TYPE_KNOWN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_KNOWN, oldCOVARIANCE_TYPE_KNOWN, covariancE_TYPE_KNOWN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getPosition_covariance_type() {
		return position_covariance_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition_covariance_type(char newPosition_covariance_type) {
		char oldPosition_covariance_type = position_covariance_type;
		position_covariance_type = newPosition_covariance_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE_TYPE, oldPosition_covariance_type, position_covariance_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sensor_datatypesPackage.NAV_SAT_FIX__HEADER:
				return basicSetHeader(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_NO_FIX:
				return getSTATUS_NO_FIX();
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_FIX:
				return getSTATUS_FIX();
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_SBAS_FIX:
				return getSTATUS_SBAS_FIX();
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_GBAS_FIX:
				return getSTATUS_GBAS_FIX();
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS:
				return getStatus();
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GPS:
				return getSERVICE_GPS();
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GLONASS:
				return getSERVICE_GLONASS();
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_COMPASS:
				return getSERVICE_COMPASS();
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GALILEO:
				return getSERVICE_GALILEO();
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE:
				return getService();
			case Sensor_datatypesPackage.NAV_SAT_FIX__HEADER:
				return getHeader();
			case Sensor_datatypesPackage.NAV_SAT_FIX__LATITUDE:
				return getLatitude();
			case Sensor_datatypesPackage.NAV_SAT_FIX__LONGITUDE:
				return getLongitude();
			case Sensor_datatypesPackage.NAV_SAT_FIX__ALTITUDE:
				return getAltitude();
			case Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE:
				return getPosition_covariance();
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_UNKNOWN:
				return getCOVARIANCE_TYPE_UNKNOWN();
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_APPROXIMATED:
				return getCOVARIANCE_TYPE_APPROXIMATED();
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_DIAGONAL_KNOWN:
				return get_COVARIANCE_TYPE_DIAGONAL_KNOWN();
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_KNOWN:
				return getCOVARIANCE_TYPE_KNOWN();
			case Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE_TYPE:
				return getPosition_covariance_type();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_NO_FIX:
				setSTATUS_NO_FIX((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_FIX:
				setSTATUS_FIX((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_SBAS_FIX:
				setSTATUS_SBAS_FIX((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_GBAS_FIX:
				setSTATUS_GBAS_FIX((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS:
				setStatus((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GPS:
				setSERVICE_GPS((Integer)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GLONASS:
				setSERVICE_GLONASS((Integer)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_COMPASS:
				setSERVICE_COMPASS((Integer)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GALILEO:
				setSERVICE_GALILEO((Integer)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE:
				setService((Integer)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__HEADER:
				setHeader((Header)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE:
				getPosition_covariance().clear();
				getPosition_covariance().addAll((Collection<? extends Double>)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_UNKNOWN:
				setCOVARIANCE_TYPE_UNKNOWN((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_APPROXIMATED:
				setCOVARIANCE_TYPE_APPROXIMATED((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_DIAGONAL_KNOWN:
				set_COVARIANCE_TYPE_DIAGONAL_KNOWN((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_KNOWN:
				setCOVARIANCE_TYPE_KNOWN((Character)newValue);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE_TYPE:
				setPosition_covariance_type((Character)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_NO_FIX:
				setSTATUS_NO_FIX(STATUS_NO_FIX_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_FIX:
				setSTATUS_FIX(STATUS_FIX_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_SBAS_FIX:
				setSTATUS_SBAS_FIX(STATUS_SBAS_FIX_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_GBAS_FIX:
				setSTATUS_GBAS_FIX(STATUS_GBAS_FIX_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GPS:
				setSERVICE_GPS(SERVICE_GPS_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GLONASS:
				setSERVICE_GLONASS(SERVICE_GLONASS_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_COMPASS:
				setSERVICE_COMPASS(SERVICE_COMPASS_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GALILEO:
				setSERVICE_GALILEO(SERVICE_GALILEO_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__HEADER:
				setHeader((Header)null);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE:
				getPosition_covariance().clear();
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_UNKNOWN:
				setCOVARIANCE_TYPE_UNKNOWN(COVARIANCE_TYPE_UNKNOWN_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_APPROXIMATED:
				setCOVARIANCE_TYPE_APPROXIMATED(COVARIANCE_TYPE_APPROXIMATED_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_DIAGONAL_KNOWN:
				set_COVARIANCE_TYPE_DIAGONAL_KNOWN(_COVARIANCE_TYPE_DIAGONAL_KNOWN_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_KNOWN:
				setCOVARIANCE_TYPE_KNOWN(COVARIANCE_TYPE_KNOWN_EDEFAULT);
				return;
			case Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE_TYPE:
				setPosition_covariance_type(POSITION_COVARIANCE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_NO_FIX:
				return statuS_NO_FIX != STATUS_NO_FIX_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_FIX:
				return statuS_FIX != STATUS_FIX_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_SBAS_FIX:
				return statuS_SBAS_FIX != STATUS_SBAS_FIX_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS_GBAS_FIX:
				return statuS_GBAS_FIX != STATUS_GBAS_FIX_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__STATUS:
				return status != STATUS_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GPS:
				return servicE_GPS != SERVICE_GPS_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GLONASS:
				return servicE_GLONASS != SERVICE_GLONASS_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_COMPASS:
				return servicE_COMPASS != SERVICE_COMPASS_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE_GALILEO:
				return servicE_GALILEO != SERVICE_GALILEO_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__SERVICE:
				return service != SERVICE_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__HEADER:
				return header != null;
			case Sensor_datatypesPackage.NAV_SAT_FIX__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE:
				return position_covariance != null && !position_covariance.isEmpty();
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_UNKNOWN:
				return covariancE_TYPE_UNKNOWN != COVARIANCE_TYPE_UNKNOWN_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_APPROXIMATED:
				return covariancE_TYPE_APPROXIMATED != COVARIANCE_TYPE_APPROXIMATED_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_DIAGONAL_KNOWN:
				return _COVARIANCE_TYPE_DIAGONAL_KNOWN != _COVARIANCE_TYPE_DIAGONAL_KNOWN_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__COVARIANCE_TYPE_KNOWN:
				return covariancE_TYPE_KNOWN != COVARIANCE_TYPE_KNOWN_EDEFAULT;
			case Sensor_datatypesPackage.NAV_SAT_FIX__POSITION_COVARIANCE_TYPE:
				return position_covariance_type != POSITION_COVARIANCE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (STATUS_NO_FIX: ");
		result.append(statuS_NO_FIX);
		result.append(", STATUS_FIX: ");
		result.append(statuS_FIX);
		result.append(", STATUS_SBAS_FIX: ");
		result.append(statuS_SBAS_FIX);
		result.append(", STATUS_GBAS_FIX: ");
		result.append(statuS_GBAS_FIX);
		result.append(", status: ");
		result.append(status);
		result.append(", SERVICE_GPS: ");
		result.append(servicE_GPS);
		result.append(", SERVICE_GLONASS: ");
		result.append(servicE_GLONASS);
		result.append(", SERVICE_COMPASS: ");
		result.append(servicE_COMPASS);
		result.append(", SERVICE_GALILEO: ");
		result.append(servicE_GALILEO);
		result.append(", service: ");
		result.append(service);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", altitude: ");
		result.append(altitude);
		result.append(", position_covariance: ");
		result.append(position_covariance);
		result.append(", COVARIANCE_TYPE_UNKNOWN: ");
		result.append(covariancE_TYPE_UNKNOWN);
		result.append(", COVARIANCE_TYPE_APPROXIMATED: ");
		result.append(covariancE_TYPE_APPROXIMATED);
		result.append(", _COVARIANCE_TYPE_DIAGONAL_KNOWN: ");
		result.append(_COVARIANCE_TYPE_DIAGONAL_KNOWN);
		result.append(", COVARIANCE_TYPE_KNOWN: ");
		result.append(covariancE_TYPE_KNOWN);
		result.append(", position_covariance_type: ");
		result.append(position_covariance_type);
		result.append(')');
		return result.toString();
	}

} //NavSatFixImpl
