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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.arrayType;
import org.xtext.athenaDSL.index;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.arrayTypeImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.arrayTypeImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class arrayTypeImpl extends DataTypeImpl implements arrayType
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected arrayTypeImpl()
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
    return AthenaDSLPackage.Literals.ARRAY_TYPE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.ARRAY_TYPE__TYPENAME, oldTypename, typename));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.ARRAY_TYPE__TYPENAME, oldTypename, typename));
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
      indices = new EObjectContainmentEList<index>(index.class, this, AthenaDSLPackage.ARRAY_TYPE__INDICES);
    }
    return indices;
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
      case AthenaDSLPackage.ARRAY_TYPE__INDICES:
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
      case AthenaDSLPackage.ARRAY_TYPE__TYPENAME:
        if (resolve) return getTypename();
        return basicGetTypename();
      case AthenaDSLPackage.ARRAY_TYPE__INDICES:
        return getIndices();
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
      case AthenaDSLPackage.ARRAY_TYPE__TYPENAME:
        setTypename((DataType)newValue);
        return;
      case AthenaDSLPackage.ARRAY_TYPE__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends index>)newValue);
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
      case AthenaDSLPackage.ARRAY_TYPE__TYPENAME:
        setTypename((DataType)null);
        return;
      case AthenaDSLPackage.ARRAY_TYPE__INDICES:
        getIndices().clear();
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
      case AthenaDSLPackage.ARRAY_TYPE__TYPENAME:
        return typename != null;
      case AthenaDSLPackage.ARRAY_TYPE__INDICES:
        return indices != null && !indices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //arrayTypeImpl
