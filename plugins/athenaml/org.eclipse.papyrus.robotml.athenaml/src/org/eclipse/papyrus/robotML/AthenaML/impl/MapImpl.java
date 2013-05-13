/**
 */
package org.eclipse.papyrus.robotML.AthenaML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.papyrus.robotML.AthenaML.AthenaMLPackage;
import org.eclipse.papyrus.robotML.AthenaML.Map;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.robotML.AthenaML.impl.MapImpl#getValues_type <em>Values type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.robotML.AthenaML.impl.MapImpl#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.robotML.AthenaML.impl.MapImpl#getKeys_type <em>Keys type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends EObjectImpl implements Map {
	/**
	 * The cached value of the '{@link #getValues_type() <em>Values type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues_type()
	 * @generated
	 * @ordered
	 */
	protected DataType values_type;

	/**
	 * The cached value of the '{@link #getBase_DataType() <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DataType()
	 * @generated
	 * @ordered
	 */
	protected DataType base_DataType;

	/**
	 * The cached value of the '{@link #getKeys_type() <em>Keys type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys_type()
	 * @generated
	 * @ordered
	 */
	protected DataType keys_type;

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
		return AthenaMLPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValues_type() {
		if (values_type != null && values_type.eIsProxy()) {
			InternalEObject oldValues_type = (InternalEObject)values_type;
			values_type = (DataType)eResolveProxy(oldValues_type);
			if (values_type != oldValues_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaMLPackage.MAP__VALUES_TYPE, oldValues_type, values_type));
			}
		}
		return values_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetValues_type() {
		return values_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues_type(DataType newValues_type) {
		DataType oldValues_type = values_type;
		values_type = newValues_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AthenaMLPackage.MAP__VALUES_TYPE, oldValues_type, values_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBase_DataType() {
		if (base_DataType != null && base_DataType.eIsProxy()) {
			InternalEObject oldBase_DataType = (InternalEObject)base_DataType;
			base_DataType = (DataType)eResolveProxy(oldBase_DataType);
			if (base_DataType != oldBase_DataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaMLPackage.MAP__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
			}
		}
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBase_DataType() {
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DataType(DataType newBase_DataType) {
		DataType oldBase_DataType = base_DataType;
		base_DataType = newBase_DataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AthenaMLPackage.MAP__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getKeys_type() {
		if (keys_type != null && keys_type.eIsProxy()) {
			InternalEObject oldKeys_type = (InternalEObject)keys_type;
			keys_type = (DataType)eResolveProxy(oldKeys_type);
			if (keys_type != oldKeys_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaMLPackage.MAP__KEYS_TYPE, oldKeys_type, keys_type));
			}
		}
		return keys_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetKeys_type() {
		return keys_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeys_type(DataType newKeys_type) {
		DataType oldKeys_type = keys_type;
		keys_type = newKeys_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AthenaMLPackage.MAP__KEYS_TYPE, oldKeys_type, keys_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AthenaMLPackage.MAP__VALUES_TYPE:
				if (resolve) return getValues_type();
				return basicGetValues_type();
			case AthenaMLPackage.MAP__BASE_DATA_TYPE:
				if (resolve) return getBase_DataType();
				return basicGetBase_DataType();
			case AthenaMLPackage.MAP__KEYS_TYPE:
				if (resolve) return getKeys_type();
				return basicGetKeys_type();
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
			case AthenaMLPackage.MAP__VALUES_TYPE:
				setValues_type((DataType)newValue);
				return;
			case AthenaMLPackage.MAP__BASE_DATA_TYPE:
				setBase_DataType((DataType)newValue);
				return;
			case AthenaMLPackage.MAP__KEYS_TYPE:
				setKeys_type((DataType)newValue);
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
			case AthenaMLPackage.MAP__VALUES_TYPE:
				setValues_type((DataType)null);
				return;
			case AthenaMLPackage.MAP__BASE_DATA_TYPE:
				setBase_DataType((DataType)null);
				return;
			case AthenaMLPackage.MAP__KEYS_TYPE:
				setKeys_type((DataType)null);
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
			case AthenaMLPackage.MAP__VALUES_TYPE:
				return values_type != null;
			case AthenaMLPackage.MAP__BASE_DATA_TYPE:
				return base_DataType != null;
			case AthenaMLPackage.MAP__KEYS_TYPE:
				return keys_type != null;
		}
		return super.eIsSet(featureID);
	}

} //MapImpl
