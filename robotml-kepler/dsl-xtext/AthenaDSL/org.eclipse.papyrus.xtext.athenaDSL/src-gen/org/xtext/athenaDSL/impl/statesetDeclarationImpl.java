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
import org.xtext.athenaDSL.stateDeclaration;
import org.xtext.athenaDSL.statesetDeclaration;
import org.xtext.athenaDSL.transitionDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stateset Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.statesetDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.statesetDeclarationImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.statesetDeclarationImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.statesetDeclarationImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statesetDeclarationImpl extends architectureElementImpl implements statesetDeclaration
{
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
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<stateDeclaration> states;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected stateDeclaration init;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<transitionDeclaration> transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statesetDeclarationImpl()
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
    return AthenaDSLPackage.Literals.STATESET_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.STATESET_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<stateDeclaration> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<stateDeclaration>(stateDeclaration.class, this, AthenaDSLPackage.STATESET_DECLARATION__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stateDeclaration getInit()
  {
    if (init != null && init.eIsProxy())
    {
      InternalEObject oldInit = (InternalEObject)init;
      init = (stateDeclaration)eResolveProxy(oldInit);
      if (init != oldInit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.STATESET_DECLARATION__INIT, oldInit, init));
      }
    }
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stateDeclaration basicGetInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(stateDeclaration newInit)
  {
    stateDeclaration oldInit = init;
    init = newInit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.STATESET_DECLARATION__INIT, oldInit, init));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<transitionDeclaration> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<transitionDeclaration>(transitionDeclaration.class, this, AthenaDSLPackage.STATESET_DECLARATION__TRANSITIONS);
    }
    return transitions;
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
      case AthenaDSLPackage.STATESET_DECLARATION__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.STATESET_DECLARATION__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
      case AthenaDSLPackage.STATESET_DECLARATION__NAME:
        return getName();
      case AthenaDSLPackage.STATESET_DECLARATION__STATES:
        return getStates();
      case AthenaDSLPackage.STATESET_DECLARATION__INIT:
        if (resolve) return getInit();
        return basicGetInit();
      case AthenaDSLPackage.STATESET_DECLARATION__TRANSITIONS:
        return getTransitions();
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
      case AthenaDSLPackage.STATESET_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AthenaDSLPackage.STATESET_DECLARATION__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends stateDeclaration>)newValue);
        return;
      case AthenaDSLPackage.STATESET_DECLARATION__INIT:
        setInit((stateDeclaration)newValue);
        return;
      case AthenaDSLPackage.STATESET_DECLARATION__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends transitionDeclaration>)newValue);
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
      case AthenaDSLPackage.STATESET_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AthenaDSLPackage.STATESET_DECLARATION__STATES:
        getStates().clear();
        return;
      case AthenaDSLPackage.STATESET_DECLARATION__INIT:
        setInit((stateDeclaration)null);
        return;
      case AthenaDSLPackage.STATESET_DECLARATION__TRANSITIONS:
        getTransitions().clear();
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
      case AthenaDSLPackage.STATESET_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AthenaDSLPackage.STATESET_DECLARATION__STATES:
        return states != null && !states.isEmpty();
      case AthenaDSLPackage.STATESET_DECLARATION__INIT:
        return init != null;
      case AthenaDSLPackage.STATESET_DECLARATION__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //statesetDeclarationImpl
