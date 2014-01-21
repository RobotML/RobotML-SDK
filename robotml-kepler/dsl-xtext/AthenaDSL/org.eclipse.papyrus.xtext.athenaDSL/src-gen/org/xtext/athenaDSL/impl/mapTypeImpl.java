/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.mapType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.mapTypeImpl#getKeytype <em>Keytype</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.mapTypeImpl#getValtype <em>Valtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class mapTypeImpl extends DataTypeImpl implements mapType
{
  /**
   * The cached value of the '{@link #getKeytype() <em>Keytype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeytype()
   * @generated
   * @ordered
   */
  protected DataType keytype;

  /**
   * The cached value of the '{@link #getValtype() <em>Valtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValtype()
   * @generated
   * @ordered
   */
  protected DataType valtype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected mapTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AthenaDSLPackage.Literals.MAP_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getKeytype()
  {
    if (keytype != null && keytype.eIsProxy())
    {
      InternalEObject oldKeytype = (InternalEObject)keytype;
      keytype = (DataType)eResolveProxy(oldKeytype);
      if (keytype != oldKeytype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.MAP_TYPE__KEYTYPE, oldKeytype, keytype));
      }
    }
    return keytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetKeytype()
  {
    return keytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeytype(DataType newKeytype)
  {
    DataType oldKeytype = keytype;
    keytype = newKeytype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.MAP_TYPE__KEYTYPE, oldKeytype, keytype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getValtype()
  {
    if (valtype != null && valtype.eIsProxy())
    {
      InternalEObject oldValtype = (InternalEObject)valtype;
      valtype = (DataType)eResolveProxy(oldValtype);
      if (valtype != oldValtype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.MAP_TYPE__VALTYPE, oldValtype, valtype));
      }
    }
    return valtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetValtype()
  {
    return valtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValtype(DataType newValtype)
  {
    DataType oldValtype = valtype;
    valtype = newValtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.MAP_TYPE__VALTYPE, oldValtype, valtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.MAP_TYPE__KEYTYPE:
        if (resolve) return getKeytype();
        return basicGetKeytype();
      case AthenaDSLPackage.MAP_TYPE__VALTYPE:
        if (resolve) return getValtype();
        return basicGetValtype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.MAP_TYPE__KEYTYPE:
        setKeytype((DataType)newValue);
        return;
      case AthenaDSLPackage.MAP_TYPE__VALTYPE:
        setValtype((DataType)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.MAP_TYPE__KEYTYPE:
        setKeytype((DataType)null);
        return;
      case AthenaDSLPackage.MAP_TYPE__VALTYPE:
        setValtype((DataType)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.MAP_TYPE__KEYTYPE:
        return keytype != null;
      case AthenaDSLPackage.MAP_TYPE__VALTYPE:
        return valtype != null;
    }
    return super.eIsSet(featureID);
  }

} //mapTypeImpl
