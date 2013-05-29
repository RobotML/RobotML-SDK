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
import org.xtext.athenaDSL.FuncProc;
import org.xtext.athenaDSL.farg;
import org.xtext.athenaDSL.interactionCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interaction Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.interactionCallImpl#getFctName <em>Fct Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.interactionCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interactionCallImpl extends MinimalEObjectImpl.Container implements interactionCall
{
  /**
   * The cached value of the '{@link #getFctName() <em>Fct Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFctName()
   * @generated
   * @ordered
   */
  protected FuncProc fctName;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<farg> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected interactionCallImpl()
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
    return AthenaDSLPackage.Literals.INTERACTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncProc getFctName()
  {
    if (fctName != null && fctName.eIsProxy())
    {
      InternalEObject oldFctName = (InternalEObject)fctName;
      fctName = (FuncProc)eResolveProxy(oldFctName);
      if (fctName != oldFctName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.INTERACTION_CALL__FCT_NAME, oldFctName, fctName));
      }
    }
    return fctName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncProc basicGetFctName()
  {
    return fctName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFctName(FuncProc newFctName)
  {
    FuncProc oldFctName = fctName;
    fctName = newFctName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INTERACTION_CALL__FCT_NAME, oldFctName, fctName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<farg> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<farg>(farg.class, this, AthenaDSLPackage.INTERACTION_CALL__ARGUMENTS);
    }
    return arguments;
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
      case AthenaDSLPackage.INTERACTION_CALL__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case AthenaDSLPackage.INTERACTION_CALL__FCT_NAME:
        if (resolve) return getFctName();
        return basicGetFctName();
      case AthenaDSLPackage.INTERACTION_CALL__ARGUMENTS:
        return getArguments();
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
      case AthenaDSLPackage.INTERACTION_CALL__FCT_NAME:
        setFctName((FuncProc)newValue);
        return;
      case AthenaDSLPackage.INTERACTION_CALL__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends farg>)newValue);
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
      case AthenaDSLPackage.INTERACTION_CALL__FCT_NAME:
        setFctName((FuncProc)null);
        return;
      case AthenaDSLPackage.INTERACTION_CALL__ARGUMENTS:
        getArguments().clear();
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
      case AthenaDSLPackage.INTERACTION_CALL__FCT_NAME:
        return fctName != null;
      case AthenaDSLPackage.INTERACTION_CALL__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //interactionCallImpl
