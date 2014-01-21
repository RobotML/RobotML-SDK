/**
 */
package org.xtext.athenaDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.index;
import org.xtext.athenaDSL.structElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>struct Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.structElementImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.structElementImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.structElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.structElementImpl#isHasInitValue <em>Has Init Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.structElementImpl#getInitValue <em>Init Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class structElementImpl extends MinimalEObjectImpl.Container implements structElement
{
  /**
   * The cached value of the '{@link #getTypename() <em>Typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected DataType typename;

  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected EList<index> indices;

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
   * The default value of the '{@link #isHasInitValue() <em>Has Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasInitValue()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_INIT_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasInitValue() <em>Has Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasInitValue()
   * @generated
   * @ordered
   */
  protected boolean hasInitValue = HAS_INIT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitValue()
   * @generated
   * @ordered
   */
  protected static final String INIT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitValue()
   * @generated
   * @ordered
   */
  protected String initValue = INIT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structElementImpl()
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
    return AthenaDSLPackage.Literals.STRUCT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getTypename()
  {
    if (typename != null && typename.eIsProxy())
    {
      InternalEObject oldTypename = (InternalEObject)typename;
      typename = (DataType)eResolveProxy(oldTypename);
      if (typename != oldTypename)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.STRUCT_ELEMENT__TYPENAME, oldTypename, typename));
      }
    }
    return typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetTypename()
  {
    return typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypename(DataType newTypename)
  {
    DataType oldTypename = typename;
    typename = newTypename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.STRUCT_ELEMENT__TYPENAME, oldTypename, typename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<index> getIndices()
  {
    if (indices == null)
    {
      indices = new EObjectContainmentEList<index>(index.class, this, AthenaDSLPackage.STRUCT_ELEMENT__INDICES);
    }
    return indices;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.STRUCT_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasInitValue()
  {
    return hasInitValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasInitValue(boolean newHasInitValue)
  {
    boolean oldHasInitValue = hasInitValue;
    hasInitValue = newHasInitValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.STRUCT_ELEMENT__HAS_INIT_VALUE, oldHasInitValue, hasInitValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInitValue()
  {
    return initValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitValue(String newInitValue)
  {
    String oldInitValue = initValue;
    initValue = newInitValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.STRUCT_ELEMENT__INIT_VALUE, oldInitValue, initValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.STRUCT_ELEMENT__INDICES:
        return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AthenaDSLPackage.STRUCT_ELEMENT__TYPENAME:
        if (resolve) return getTypename();
        return basicGetTypename();
      case AthenaDSLPackage.STRUCT_ELEMENT__INDICES:
        return getIndices();
      case AthenaDSLPackage.STRUCT_ELEMENT__NAME:
        return getName();
      case AthenaDSLPackage.STRUCT_ELEMENT__HAS_INIT_VALUE:
        return isHasInitValue();
      case AthenaDSLPackage.STRUCT_ELEMENT__INIT_VALUE:
        return getInitValue();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AthenaDSLPackage.STRUCT_ELEMENT__TYPENAME:
        setTypename((DataType)newValue);
        return;
      case AthenaDSLPackage.STRUCT_ELEMENT__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends index>)newValue);
        return;
      case AthenaDSLPackage.STRUCT_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case AthenaDSLPackage.STRUCT_ELEMENT__HAS_INIT_VALUE:
        setHasInitValue((Boolean)newValue);
        return;
      case AthenaDSLPackage.STRUCT_ELEMENT__INIT_VALUE:
        setInitValue((String)newValue);
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
      case AthenaDSLPackage.STRUCT_ELEMENT__TYPENAME:
        setTypename((DataType)null);
        return;
      case AthenaDSLPackage.STRUCT_ELEMENT__INDICES:
        getIndices().clear();
        return;
      case AthenaDSLPackage.STRUCT_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AthenaDSLPackage.STRUCT_ELEMENT__HAS_INIT_VALUE:
        setHasInitValue(HAS_INIT_VALUE_EDEFAULT);
        return;
      case AthenaDSLPackage.STRUCT_ELEMENT__INIT_VALUE:
        setInitValue(INIT_VALUE_EDEFAULT);
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
      case AthenaDSLPackage.STRUCT_ELEMENT__TYPENAME:
        return typename != null;
      case AthenaDSLPackage.STRUCT_ELEMENT__INDICES:
        return indices != null && !indices.isEmpty();
      case AthenaDSLPackage.STRUCT_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AthenaDSLPackage.STRUCT_ELEMENT__HAS_INIT_VALUE:
        return hasInitValue != HAS_INIT_VALUE_EDEFAULT;
      case AthenaDSLPackage.STRUCT_ELEMENT__INIT_VALUE:
        return INIT_VALUE_EDEFAULT == null ? initValue != null : !INIT_VALUE_EDEFAULT.equals(initValue);
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
    result.append(", hasInitValue: ");
    result.append(hasInitValue);
    result.append(", initValue: ");
    result.append(initValue);
    result.append(')');
    return result.toString();
  }

} //structElementImpl
