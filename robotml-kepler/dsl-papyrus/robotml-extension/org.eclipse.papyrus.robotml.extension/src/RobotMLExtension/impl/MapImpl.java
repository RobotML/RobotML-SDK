/**
 */
package RobotMLExtension.impl;

import RobotMLExtension.Map;
import RobotMLExtension.RobotMLExtensionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RobotMLExtension.impl.MapImpl#getValuesType <em>Values Type</em>}</li>
 *   <li>{@link RobotMLExtension.impl.MapImpl#getBaseDataType <em>Base Data Type</em>}</li>
 *   <li>{@link RobotMLExtension.impl.MapImpl#getKeysType <em>Keys Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends EObjectImpl implements Map {
	/**
	 * The cached value of the '{@link #getValuesType() <em>Values Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesType()
	 * @generated
	 * @ordered
	 */
	protected DataType valuesType;

	/**
	 * The cached value of the '{@link #getBaseDataType() <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType baseDataType;

	/**
	 * The cached value of the '{@link #getKeysType() <em>Keys Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysType()
	 * @generated
	 * @ordered
	 */
	protected DataType keysType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotMLExtensionPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValuesType() {
		if (valuesType != null && valuesType.eIsProxy()) {
			InternalEObject oldValuesType = (InternalEObject)valuesType;
			valuesType = (DataType)eResolveProxy(oldValuesType);
			if (valuesType != oldValuesType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotMLExtensionPackage.MAP__VALUES_TYPE, oldValuesType, valuesType));
			}
		}
		return valuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetValuesType() {
		return valuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesType(DataType newValuesType) {
		DataType oldValuesType = valuesType;
		valuesType = newValuesType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMLExtensionPackage.MAP__VALUES_TYPE, oldValuesType, valuesType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBaseDataType() {
		if (baseDataType != null && baseDataType.eIsProxy()) {
			InternalEObject oldBaseDataType = (InternalEObject)baseDataType;
			baseDataType = (DataType)eResolveProxy(oldBaseDataType);
			if (baseDataType != oldBaseDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotMLExtensionPackage.MAP__BASE_DATA_TYPE, oldBaseDataType, baseDataType));
			}
		}
		return baseDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBaseDataType() {
		return baseDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDataType(DataType newBaseDataType) {
		DataType oldBaseDataType = baseDataType;
		baseDataType = newBaseDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMLExtensionPackage.MAP__BASE_DATA_TYPE, oldBaseDataType, baseDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getKeysType() {
		if (keysType != null && keysType.eIsProxy()) {
			InternalEObject oldKeysType = (InternalEObject)keysType;
			keysType = (DataType)eResolveProxy(oldKeysType);
			if (keysType != oldKeysType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotMLExtensionPackage.MAP__KEYS_TYPE, oldKeysType, keysType));
			}
		}
		return keysType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetKeysType() {
		return keysType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeysType(DataType newKeysType) {
		DataType oldKeysType = keysType;
		keysType = newKeysType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMLExtensionPackage.MAP__KEYS_TYPE, oldKeysType, keysType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotMLExtensionPackage.MAP__VALUES_TYPE:
				if (resolve) return getValuesType();
				return basicGetValuesType();
			case RobotMLExtensionPackage.MAP__BASE_DATA_TYPE:
				if (resolve) return getBaseDataType();
				return basicGetBaseDataType();
			case RobotMLExtensionPackage.MAP__KEYS_TYPE:
				if (resolve) return getKeysType();
				return basicGetKeysType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RobotMLExtensionPackage.MAP__VALUES_TYPE:
				setValuesType((DataType)newValue);
				return;
			case RobotMLExtensionPackage.MAP__BASE_DATA_TYPE:
				setBaseDataType((DataType)newValue);
				return;
			case RobotMLExtensionPackage.MAP__KEYS_TYPE:
				setKeysType((DataType)newValue);
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
			case RobotMLExtensionPackage.MAP__VALUES_TYPE:
				setValuesType((DataType)null);
				return;
			case RobotMLExtensionPackage.MAP__BASE_DATA_TYPE:
				setBaseDataType((DataType)null);
				return;
			case RobotMLExtensionPackage.MAP__KEYS_TYPE:
				setKeysType((DataType)null);
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
			case RobotMLExtensionPackage.MAP__VALUES_TYPE:
				return valuesType != null;
			case RobotMLExtensionPackage.MAP__BASE_DATA_TYPE:
				return baseDataType != null;
			case RobotMLExtensionPackage.MAP__KEYS_TYPE:
				return keysType != null;
		}
		return super.eIsSet(featureID);
	}

} //MapImpl
