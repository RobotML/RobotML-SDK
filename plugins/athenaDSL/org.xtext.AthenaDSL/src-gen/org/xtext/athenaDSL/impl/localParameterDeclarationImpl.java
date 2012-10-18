/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.localParameterDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>local Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.localParameterDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.localParameterDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.localParameterDeclarationImpl#isHasValue <em>Has Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.localParameterDeclarationImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class localParameterDeclarationImpl extends MinimalEObjectImpl.Container implements localParameterDeclaration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected localParameterDeclarationImpl()
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
    return AthenaDSLPackage.Literals.LOCAL_PARAMETER_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (DataType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DataType newType)
  {
    DataType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__HAS_VALUE, oldHasValue, hasValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__VALUE, oldValue, value));
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
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__NAME:
        return getName();
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__HAS_VALUE:
        return isHasValue();
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__VALUE:
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
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__TYPE:
        setType((DataType)newValue);
        return;
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__HAS_VALUE:
        setHasValue((Boolean)newValue);
        return;
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__VALUE:
        setValue((String)newValue);
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
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__TYPE:
        setType((DataType)null);
        return;
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__HAS_VALUE:
        setHasValue(HAS_VALUE_EDEFAULT);
        return;
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__VALUE:
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
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__TYPE:
        return type != null;
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__HAS_VALUE:
        return hasValue != HAS_VALUE_EDEFAULT;
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", hasValue: ");
    result.append(hasValue);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //localParameterDeclarationImpl
