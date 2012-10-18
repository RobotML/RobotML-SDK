/**
 */
package org.xtext.athenaDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.index;
import org.xtext.athenaDSL.structElement;
import org.xtext.athenaDSL.structType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.structTypeImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.structTypeImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class structTypeImpl extends DataTypeImpl implements structType
{
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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<structElement> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structTypeImpl()
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
    return AthenaDSLPackage.Literals.STRUCT_TYPE;
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
      indices = new EObjectContainmentEList<index>(index.class, this, AthenaDSLPackage.STRUCT_TYPE__INDICES);
    }
    return indices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<structElement> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<structElement>(structElement.class, this, AthenaDSLPackage.STRUCT_TYPE__PARAMETERS);
    }
    return parameters;
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
      case AthenaDSLPackage.STRUCT_TYPE__INDICES:
        return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.STRUCT_TYPE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case AthenaDSLPackage.STRUCT_TYPE__INDICES:
        return getIndices();
      case AthenaDSLPackage.STRUCT_TYPE__PARAMETERS:
        return getParameters();
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
      case AthenaDSLPackage.STRUCT_TYPE__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends index>)newValue);
        return;
      case AthenaDSLPackage.STRUCT_TYPE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends structElement>)newValue);
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
      case AthenaDSLPackage.STRUCT_TYPE__INDICES:
        getIndices().clear();
        return;
      case AthenaDSLPackage.STRUCT_TYPE__PARAMETERS:
        getParameters().clear();
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
      case AthenaDSLPackage.STRUCT_TYPE__INDICES:
        return indices != null && !indices.isEmpty();
      case AthenaDSLPackage.STRUCT_TYPE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //structTypeImpl
