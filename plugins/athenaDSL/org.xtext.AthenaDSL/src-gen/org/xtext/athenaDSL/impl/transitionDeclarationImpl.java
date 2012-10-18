/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.transitionDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>transition Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.transitionDeclarationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.transitionDeclarationImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.transitionDeclarationImpl#getEvt <em>Evt</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.transitionDeclarationImpl#isRaise <em>Raise</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.transitionDeclarationImpl#getSig <em>Sig</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class transitionDeclarationImpl extends MinimalEObjectImpl.Container implements transitionDeclaration
{
  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final String TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected String to = TO_EDEFAULT;

  /**
   * The default value of the '{@link #getEvt() <em>Evt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvt()
   * @generated
   * @ordered
   */
  protected static final String EVT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvt() <em>Evt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvt()
   * @generated
   * @ordered
   */
  protected String evt = EVT_EDEFAULT;

  /**
   * The default value of the '{@link #isRaise() <em>Raise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRaise()
   * @generated
   * @ordered
   */
  protected static final boolean RAISE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRaise() <em>Raise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRaise()
   * @generated
   * @ordered
   */
  protected boolean raise = RAISE_EDEFAULT;

  /**
   * The default value of the '{@link #getSig() <em>Sig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSig()
   * @generated
   * @ordered
   */
  protected static final String SIG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSig() <em>Sig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSig()
   * @generated
   * @ordered
   */
  protected String sig = SIG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected transitionDeclarationImpl()
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
    return AthenaDSLPackage.Literals.TRANSITION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.TRANSITION_DECLARATION__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(String newTo)
  {
    String oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.TRANSITION_DECLARATION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEvt()
  {
    return evt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvt(String newEvt)
  {
    String oldEvt = evt;
    evt = newEvt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.TRANSITION_DECLARATION__EVT, oldEvt, evt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRaise()
  {
    return raise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRaise(boolean newRaise)
  {
    boolean oldRaise = raise;
    raise = newRaise;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.TRANSITION_DECLARATION__RAISE, oldRaise, raise));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSig()
  {
    return sig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSig(String newSig)
  {
    String oldSig = sig;
    sig = newSig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.TRANSITION_DECLARATION__SIG, oldSig, sig));
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
      case AthenaDSLPackage.TRANSITION_DECLARATION__FROM:
        return getFrom();
      case AthenaDSLPackage.TRANSITION_DECLARATION__TO:
        return getTo();
      case AthenaDSLPackage.TRANSITION_DECLARATION__EVT:
        return getEvt();
      case AthenaDSLPackage.TRANSITION_DECLARATION__RAISE:
        return isRaise();
      case AthenaDSLPackage.TRANSITION_DECLARATION__SIG:
        return getSig();
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
      case AthenaDSLPackage.TRANSITION_DECLARATION__FROM:
        setFrom((String)newValue);
        return;
      case AthenaDSLPackage.TRANSITION_DECLARATION__TO:
        setTo((String)newValue);
        return;
      case AthenaDSLPackage.TRANSITION_DECLARATION__EVT:
        setEvt((String)newValue);
        return;
      case AthenaDSLPackage.TRANSITION_DECLARATION__RAISE:
        setRaise((Boolean)newValue);
        return;
      case AthenaDSLPackage.TRANSITION_DECLARATION__SIG:
        setSig((String)newValue);
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
      case AthenaDSLPackage.TRANSITION_DECLARATION__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case AthenaDSLPackage.TRANSITION_DECLARATION__TO:
        setTo(TO_EDEFAULT);
        return;
      case AthenaDSLPackage.TRANSITION_DECLARATION__EVT:
        setEvt(EVT_EDEFAULT);
        return;
      case AthenaDSLPackage.TRANSITION_DECLARATION__RAISE:
        setRaise(RAISE_EDEFAULT);
        return;
      case AthenaDSLPackage.TRANSITION_DECLARATION__SIG:
        setSig(SIG_EDEFAULT);
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
      case AthenaDSLPackage.TRANSITION_DECLARATION__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case AthenaDSLPackage.TRANSITION_DECLARATION__TO:
        return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
      case AthenaDSLPackage.TRANSITION_DECLARATION__EVT:
        return EVT_EDEFAULT == null ? evt != null : !EVT_EDEFAULT.equals(evt);
      case AthenaDSLPackage.TRANSITION_DECLARATION__RAISE:
        return raise != RAISE_EDEFAULT;
      case AthenaDSLPackage.TRANSITION_DECLARATION__SIG:
        return SIG_EDEFAULT == null ? sig != null : !SIG_EDEFAULT.equals(sig);
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
    result.append(" (from: ");
    result.append(from);
    result.append(", to: ");
    result.append(to);
    result.append(", evt: ");
    result.append(evt);
    result.append(", raise: ");
    result.append(raise);
    result.append(", sig: ");
    result.append(sig);
    result.append(')');
    return result.toString();
  }

} //transitionDeclarationImpl
