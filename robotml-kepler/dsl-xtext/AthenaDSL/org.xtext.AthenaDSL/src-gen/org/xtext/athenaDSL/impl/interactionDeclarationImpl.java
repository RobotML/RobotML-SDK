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
import org.xtext.athenaDSL.interactionCall;
import org.xtext.athenaDSL.interactionDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interaction Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.interactionDeclarationImpl#isWwhen <em>Wwhen</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.interactionDeclarationImpl#getStateset <em>Stateset</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.interactionDeclarationImpl#getWstate <em>Wstate</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.interactionDeclarationImpl#isIif <em>Iif</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.interactionDeclarationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.interactionDeclarationImpl#getIcalls <em>Icalls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class interactionDeclarationImpl extends architectureElementImpl implements interactionDeclaration
{
  /**
   * The default value of the '{@link #isWwhen() <em>Wwhen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWwhen()
   * @generated
   * @ordered
   */
  protected static final boolean WWHEN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWwhen() <em>Wwhen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWwhen()
   * @generated
   * @ordered
   */
  protected boolean wwhen = WWHEN_EDEFAULT;

  /**
   * The default value of the '{@link #getStateset() <em>Stateset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateset()
   * @generated
   * @ordered
   */
  protected static final String STATESET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStateset() <em>Stateset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateset()
   * @generated
   * @ordered
   */
  protected String stateset = STATESET_EDEFAULT;

  /**
   * The default value of the '{@link #getWstate() <em>Wstate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWstate()
   * @generated
   * @ordered
   */
  protected static final String WSTATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWstate() <em>Wstate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWstate()
   * @generated
   * @ordered
   */
  protected String wstate = WSTATE_EDEFAULT;

  /**
   * The default value of the '{@link #isIif() <em>Iif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIif()
   * @generated
   * @ordered
   */
  protected static final boolean IIF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIif() <em>Iif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIif()
   * @generated
   * @ordered
   */
  protected boolean iif = IIF_EDEFAULT;

  /**
   * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected static final String EVENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected String event = EVENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getIcalls() <em>Icalls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcalls()
   * @generated
   * @ordered
   */
  protected EList<interactionCall> icalls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected interactionDeclarationImpl()
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
    return AthenaDSLPackage.Literals.INTERACTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWwhen()
  {
    return wwhen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWwhen(boolean newWwhen)
  {
    boolean oldWwhen = wwhen;
    wwhen = newWwhen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INTERACTION_DECLARATION__WWHEN, oldWwhen, wwhen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStateset()
  {
    return stateset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateset(String newStateset)
  {
    String oldStateset = stateset;
    stateset = newStateset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INTERACTION_DECLARATION__STATESET, oldStateset, stateset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWstate()
  {
    return wstate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWstate(String newWstate)
  {
    String oldWstate = wstate;
    wstate = newWstate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INTERACTION_DECLARATION__WSTATE, oldWstate, wstate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIif()
  {
    return iif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIif(boolean newIif)
  {
    boolean oldIif = iif;
    iif = newIif;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INTERACTION_DECLARATION__IIF, oldIif, iif));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(String newEvent)
  {
    String oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INTERACTION_DECLARATION__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<interactionCall> getIcalls()
  {
    if (icalls == null)
    {
      icalls = new EObjectContainmentEList<interactionCall>(interactionCall.class, this, AthenaDSLPackage.INTERACTION_DECLARATION__ICALLS);
    }
    return icalls;
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
      case AthenaDSLPackage.INTERACTION_DECLARATION__ICALLS:
        return ((InternalEList<?>)getIcalls()).basicRemove(otherEnd, msgs);
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
      case AthenaDSLPackage.INTERACTION_DECLARATION__WWHEN:
        return isWwhen();
      case AthenaDSLPackage.INTERACTION_DECLARATION__STATESET:
        return getStateset();
      case AthenaDSLPackage.INTERACTION_DECLARATION__WSTATE:
        return getWstate();
      case AthenaDSLPackage.INTERACTION_DECLARATION__IIF:
        return isIif();
      case AthenaDSLPackage.INTERACTION_DECLARATION__EVENT:
        return getEvent();
      case AthenaDSLPackage.INTERACTION_DECLARATION__ICALLS:
        return getIcalls();
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
      case AthenaDSLPackage.INTERACTION_DECLARATION__WWHEN:
        setWwhen((Boolean)newValue);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__STATESET:
        setStateset((String)newValue);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__WSTATE:
        setWstate((String)newValue);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__IIF:
        setIif((Boolean)newValue);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__EVENT:
        setEvent((String)newValue);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__ICALLS:
        getIcalls().clear();
        getIcalls().addAll((Collection<? extends interactionCall>)newValue);
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
      case AthenaDSLPackage.INTERACTION_DECLARATION__WWHEN:
        setWwhen(WWHEN_EDEFAULT);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__STATESET:
        setStateset(STATESET_EDEFAULT);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__WSTATE:
        setWstate(WSTATE_EDEFAULT);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__IIF:
        setIif(IIF_EDEFAULT);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__EVENT:
        setEvent(EVENT_EDEFAULT);
        return;
      case AthenaDSLPackage.INTERACTION_DECLARATION__ICALLS:
        getIcalls().clear();
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
      case AthenaDSLPackage.INTERACTION_DECLARATION__WWHEN:
        return wwhen != WWHEN_EDEFAULT;
      case AthenaDSLPackage.INTERACTION_DECLARATION__STATESET:
        return STATESET_EDEFAULT == null ? stateset != null : !STATESET_EDEFAULT.equals(stateset);
      case AthenaDSLPackage.INTERACTION_DECLARATION__WSTATE:
        return WSTATE_EDEFAULT == null ? wstate != null : !WSTATE_EDEFAULT.equals(wstate);
      case AthenaDSLPackage.INTERACTION_DECLARATION__IIF:
        return iif != IIF_EDEFAULT;
      case AthenaDSLPackage.INTERACTION_DECLARATION__EVENT:
        return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
      case AthenaDSLPackage.INTERACTION_DECLARATION__ICALLS:
        return icalls != null && !icalls.isEmpty();
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
    result.append(" (wwhen: ");
    result.append(wwhen);
    result.append(", stateset: ");
    result.append(stateset);
    result.append(", wstate: ");
    result.append(wstate);
    result.append(", iif: ");
    result.append(iif);
    result.append(", event: ");
    result.append(event);
    result.append(')');
    return result.toString();
  }

} //interactionDeclarationImpl
