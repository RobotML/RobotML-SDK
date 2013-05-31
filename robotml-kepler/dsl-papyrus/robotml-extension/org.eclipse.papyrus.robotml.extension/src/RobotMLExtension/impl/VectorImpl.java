/**
 */
package RobotMLExtension.impl;

import RobotMLExtension.RobotMLExtensionPackage;
import RobotMLExtension.Vector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RobotMLExtension.impl.VectorImpl#getSize <em>Size</em>}</li>
 *   <li>{@link RobotMLExtension.impl.VectorImpl#getTypeTemplate <em>Type Template</em>}</li>
 *   <li>{@link RobotMLExtension.impl.VectorImpl#getBaseDataType <em>Base Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VectorImpl extends EObjectImpl implements Vector {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeTemplate() <em>Type Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTemplate()
	 * @generated
	 * @ordered
	 */
	protected DataType typeTemplate;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotMLExtensionPackage.Literals.VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMLExtensionPackage.VECTOR__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTypeTemplate() {
		if (typeTemplate != null && typeTemplate.eIsProxy()) {
			InternalEObject oldTypeTemplate = (InternalEObject)typeTemplate;
			typeTemplate = (DataType)eResolveProxy(oldTypeTemplate);
			if (typeTemplate != oldTypeTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotMLExtensionPackage.VECTOR__TYPE_TEMPLATE, oldTypeTemplate, typeTemplate));
			}
		}
		return typeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTypeTemplate() {
		return typeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTemplate(DataType newTypeTemplate) {
		DataType oldTypeTemplate = typeTemplate;
		typeTemplate = newTypeTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMLExtensionPackage.VECTOR__TYPE_TEMPLATE, oldTypeTemplate, typeTemplate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RobotMLExtensionPackage.VECTOR__BASE_DATA_TYPE, oldBaseDataType, baseDataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RobotMLExtensionPackage.VECTOR__BASE_DATA_TYPE, oldBaseDataType, baseDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotMLExtensionPackage.VECTOR__SIZE:
				return getSize();
			case RobotMLExtensionPackage.VECTOR__TYPE_TEMPLATE:
				if (resolve) return getTypeTemplate();
				return basicGetTypeTemplate();
			case RobotMLExtensionPackage.VECTOR__BASE_DATA_TYPE:
				if (resolve) return getBaseDataType();
				return basicGetBaseDataType();
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
			case RobotMLExtensionPackage.VECTOR__SIZE:
				setSize((Integer)newValue);
				return;
			case RobotMLExtensionPackage.VECTOR__TYPE_TEMPLATE:
				setTypeTemplate((DataType)newValue);
				return;
			case RobotMLExtensionPackage.VECTOR__BASE_DATA_TYPE:
				setBaseDataType((DataType)newValue);
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
			case RobotMLExtensionPackage.VECTOR__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case RobotMLExtensionPackage.VECTOR__TYPE_TEMPLATE:
				setTypeTemplate((DataType)null);
				return;
			case RobotMLExtensionPackage.VECTOR__BASE_DATA_TYPE:
				setBaseDataType((DataType)null);
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
			case RobotMLExtensionPackage.VECTOR__SIZE:
				return size != SIZE_EDEFAULT;
			case RobotMLExtensionPackage.VECTOR__TYPE_TEMPLATE:
				return typeTemplate != null;
			case RobotMLExtensionPackage.VECTOR__BASE_DATA_TYPE:
				return baseDataType != null;
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
		result.append(" (size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //VectorImpl
