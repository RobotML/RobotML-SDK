/**
 */
package AthenaML.impl;

import AthenaML.AthenaMLPackage;
import AthenaML.Parameters;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AthenaML.impl.ParametersImpl#getBaseClass <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersImpl extends EObjectImpl implements Parameters {
	/**
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected uml.Class baseClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AthenaMLPackage.Literals.PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.Class getBaseClass() {
		if (baseClass != null && baseClass.eIsProxy()) {
			InternalEObject oldBaseClass = (InternalEObject)baseClass;
			baseClass = (uml.Class)eResolveProxy(oldBaseClass);
			if (baseClass != oldBaseClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaMLPackage.PARAMETERS__BASE_CLASS, oldBaseClass, baseClass));
			}
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.Class basicGetBaseClass() {
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseClass(uml.Class newBaseClass) {
		uml.Class oldBaseClass = baseClass;
		baseClass = newBaseClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AthenaMLPackage.PARAMETERS__BASE_CLASS, oldBaseClass, baseClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AthenaMLPackage.PARAMETERS__BASE_CLASS:
				if (resolve) return getBaseClass();
				return basicGetBaseClass();
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
			case AthenaMLPackage.PARAMETERS__BASE_CLASS:
				setBaseClass((uml.Class)newValue);
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
			case AthenaMLPackage.PARAMETERS__BASE_CLASS:
				setBaseClass((uml.Class)null);
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
			case AthenaMLPackage.PARAMETERS__BASE_CLASS:
				return baseClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ParametersImpl
