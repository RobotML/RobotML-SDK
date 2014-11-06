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
import org.xtext.athenaDSL.ifblock;
import org.xtext.athenaDSL.localEventDeclaration;
import org.xtext.athenaDSL.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ifblock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.ifblockImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ifblockImpl#getIfBlocks <em>If Blocks</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ifblockImpl#isHasElse <em>Has Else</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ifblockImpl#getElseBlocks <em>Else Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ifblockImpl extends MinimalEObjectImpl.Container implements ifblock
{
  /**
   * The cached value of the '{@link #getEventName() <em>Event Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventName()
   * @generated
   * @ordered
   */
  protected localEventDeclaration eventName;

  /**
   * The cached value of the '{@link #getIfBlocks() <em>If Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfBlocks()
   * @generated
   * @ordered
   */
  protected EList<statement> ifBlocks;

  /**
   * The default value of the '{@link #isHasElse() <em>Has Else</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasElse()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_ELSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasElse() <em>Has Else</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasElse()
   * @generated
   * @ordered
   */
  protected boolean hasElse = HAS_ELSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElseBlocks() <em>Else Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBlocks()
   * @generated
   * @ordered
   */
  protected EList<statement> elseBlocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ifblockImpl()
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
    return AthenaDSLPackage.Literals.IFBLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public localEventDeclaration getEventName()
  {
    if (eventName != null && eventName.eIsProxy())
    {
      InternalEObject oldEventName = (InternalEObject)eventName;
      eventName = (localEventDeclaration)eResolveProxy(oldEventName);
      if (eventName != oldEventName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.IFBLOCK__EVENT_NAME, oldEventName, eventName));
      }
    }
    return eventName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public localEventDeclaration basicGetEventName()
  {
    return eventName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventName(localEventDeclaration newEventName)
  {
    localEventDeclaration oldEventName = eventName;
    eventName = newEventName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.IFBLOCK__EVENT_NAME, oldEventName, eventName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<statement> getIfBlocks()
  {
    if (ifBlocks == null)
    {
      ifBlocks = new EObjectContainmentEList<statement>(statement.class, this, AthenaDSLPackage.IFBLOCK__IF_BLOCKS);
    }
    return ifBlocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasElse()
  {
    return hasElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasElse(boolean newHasElse)
  {
    boolean oldHasElse = hasElse;
    hasElse = newHasElse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.IFBLOCK__HAS_ELSE, oldHasElse, hasElse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<statement> getElseBlocks()
  {
    if (elseBlocks == null)
    {
      elseBlocks = new EObjectContainmentEList<statement>(statement.class, this, AthenaDSLPackage.IFBLOCK__ELSE_BLOCKS);
    }
    return elseBlocks;
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
      case AthenaDSLPackage.IFBLOCK__IF_BLOCKS:
        return ((InternalEList<?>)getIfBlocks()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.IFBLOCK__ELSE_BLOCKS:
        return ((InternalEList<?>)getElseBlocks()).basicRemove(otherEnd, msgs);
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
      case AthenaDSLPackage.IFBLOCK__EVENT_NAME:
        if (resolve) return getEventName();
        return basicGetEventName();
      case AthenaDSLPackage.IFBLOCK__IF_BLOCKS:
        return getIfBlocks();
      case AthenaDSLPackage.IFBLOCK__HAS_ELSE:
        return isHasElse();
      case AthenaDSLPackage.IFBLOCK__ELSE_BLOCKS:
        return getElseBlocks();
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
      case AthenaDSLPackage.IFBLOCK__EVENT_NAME:
        setEventName((localEventDeclaration)newValue);
        return;
      case AthenaDSLPackage.IFBLOCK__IF_BLOCKS:
        getIfBlocks().clear();
        getIfBlocks().addAll((Collection<? extends statement>)newValue);
        return;
      case AthenaDSLPackage.IFBLOCK__HAS_ELSE:
        setHasElse((Boolean)newValue);
        return;
      case AthenaDSLPackage.IFBLOCK__ELSE_BLOCKS:
        getElseBlocks().clear();
        getElseBlocks().addAll((Collection<? extends statement>)newValue);
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
      case AthenaDSLPackage.IFBLOCK__EVENT_NAME:
        setEventName((localEventDeclaration)null);
        return;
      case AthenaDSLPackage.IFBLOCK__IF_BLOCKS:
        getIfBlocks().clear();
        return;
      case AthenaDSLPackage.IFBLOCK__HAS_ELSE:
        setHasElse(HAS_ELSE_EDEFAULT);
        return;
      case AthenaDSLPackage.IFBLOCK__ELSE_BLOCKS:
        getElseBlocks().clear();
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
      case AthenaDSLPackage.IFBLOCK__EVENT_NAME:
        return eventName != null;
      case AthenaDSLPackage.IFBLOCK__IF_BLOCKS:
        return ifBlocks != null && !ifBlocks.isEmpty();
      case AthenaDSLPackage.IFBLOCK__HAS_ELSE:
        return hasElse != HAS_ELSE_EDEFAULT;
      case AthenaDSLPackage.IFBLOCK__ELSE_BLOCKS:
        return elseBlocks != null && !elseBlocks.isEmpty();
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
    result.append(" (hasElse: ");
    result.append(hasElse);
    result.append(')');
    return result.toString();
  }

} //ifblockImpl
