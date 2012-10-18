/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.index;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.indexImpl#getDim <em>Dim</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.indexImpl#isHasValue <em>Has Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.indexImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class indexImpl extends MinimalEObjectImpl.Container implements index
{
  /**
   * The default value of the '{@link #getDim() <em>Dim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDim()
   * @generated
   * @ordered
   */
  protected static final String DIM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDim()
   * @generated
   * @ordered
   */
  protected String dim = DIM_EDEFAULT;

  /**
   * The default value of the '{@link #isHasValue() <em>Has Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasValue()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasValue() <em>Has Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasValue()
   * @generated
   * @ordered
   */
  protected boolean hasValue = HAS_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected indexImpl()
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
    return AthenaDSLPackage.Literals.INDEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDim()
  {
    return dim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDim(String newDim)
  {
    String oldDim = dim;
    dim = newDim;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INDEX__DIM, oldDim, dim));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasValue()
  {
    return hasValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasValue(boolean newHasValue)
  {
    boolean oldHasValue = hasValue;
    hasValue = newHasValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INDEX__HAS_VALUE, oldHasValue, hasValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INDEX__VALUE, oldValue, value));
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
      case AthenaDSLPackage.INDEX__DIM:
        return getDim();
      case AthenaDSLPackage.INDEX__HAS_VALUE:
        return isHasValue();
      case AthenaDSLPackage.INDEX__VALUE:
        return getValue();
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
      case AthenaDSLPackage.INDEX__DIM:
        setDim((String)newValue);
        return;
      case AthenaDSLPackage.INDEX__HAS_VALUE:
        setHasValue((Boolean)newValue);
        return;
      case AthenaDSLPackage.INDEX__VALUE:
        setValue((Integer)newValue);
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
      case AthenaDSLPackage.INDEX__DIM:
        setDim(DIM_EDEFAULT);
        return;
      case AthenaDSLPackage.INDEX__HAS_VALUE:
        setHasValue(HAS_VALUE_EDEFAULT);
        return;
      case AthenaDSLPackage.INDEX__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case AthenaDSLPackage.INDEX__DIM:
        return DIM_EDEFAULT == null ? dim != null : !DIM_EDEFAULT.equals(dim);
      case AthenaDSLPackage.INDEX__HAS_VALUE:
        return hasValue != HAS_VALUE_EDEFAULT;
      case AthenaDSLPackage.INDEX__VALUE:
        return value != VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dim: ");
    result.append(dim);
    result.append(", hasValue: ");
    result.append(hasValue);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //indexImpl
