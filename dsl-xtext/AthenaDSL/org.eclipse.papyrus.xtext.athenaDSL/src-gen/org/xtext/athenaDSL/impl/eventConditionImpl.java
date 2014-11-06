/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.eventCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>event Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.eventConditionImpl#getLeftPart <em>Left Part</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.eventConditionImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.eventConditionImpl#getRightPartI <em>Right Part I</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.eventConditionImpl#getRightPartN <em>Right Part N</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.eventConditionImpl#getRightPartS <em>Right Part S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class eventConditionImpl extends MinimalEObjectImpl.Container implements eventCondition
{
  /**
   * The default value of the '{@link #getLeftPart() <em>Left Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftPart()
   * @generated
   * @ordered
   */
  protected static final String LEFT_PART_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftPart() <em>Left Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftPart()
   * @generated
   * @ordered
   */
  protected String leftPart = LEFT_PART_EDEFAULT;

  /**
   * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected static final String COND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected String cond = COND_EDEFAULT;

  /**
   * The default value of the '{@link #getRightPartI() <em>Right Part I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPartI()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_PART_I_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightPartI() <em>Right Part I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPartI()
   * @generated
   * @ordered
   */
  protected String rightPartI = RIGHT_PART_I_EDEFAULT;

  /**
   * The default value of the '{@link #getRightPartN() <em>Right Part N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPartN()
   * @generated
   * @ordered
   */
  protected static final int RIGHT_PART_N_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRightPartN() <em>Right Part N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPartN()
   * @generated
   * @ordered
   */
  protected int rightPartN = RIGHT_PART_N_EDEFAULT;

  /**
   * The default value of the '{@link #getRightPartS() <em>Right Part S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPartS()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_PART_S_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightPartS() <em>Right Part S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPartS()
   * @generated
   * @ordered
   */
  protected String rightPartS = RIGHT_PART_S_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected eventConditionImpl()
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
    return AthenaDSLPackage.Literals.EVENT_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLeftPart()
  {
    return leftPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftPart(String newLeftPart)
  {
    String oldLeftPart = leftPart;
    leftPart = newLeftPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.EVENT_CONDITION__LEFT_PART, oldLeftPart, leftPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(String newCond)
  {
    String oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.EVENT_CONDITION__COND, oldCond, cond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRightPartI()
  {
    return rightPartI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightPartI(String newRightPartI)
  {
    String oldRightPartI = rightPartI;
    rightPartI = newRightPartI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_I, oldRightPartI, rightPartI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRightPartN()
  {
    return rightPartN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightPartN(int newRightPartN)
  {
    int oldRightPartN = rightPartN;
    rightPartN = newRightPartN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_N, oldRightPartN, rightPartN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRightPartS()
  {
    return rightPartS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightPartS(String newRightPartS)
  {
    String oldRightPartS = rightPartS;
    rightPartS = newRightPartS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_S, oldRightPartS, rightPartS));
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
      case AthenaDSLPackage.EVENT_CONDITION__LEFT_PART:
        return getLeftPart();
      case AthenaDSLPackage.EVENT_CONDITION__COND:
        return getCond();
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_I:
        return getRightPartI();
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_N:
        return getRightPartN();
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_S:
        return getRightPartS();
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
      case AthenaDSLPackage.EVENT_CONDITION__LEFT_PART:
        setLeftPart((String)newValue);
        return;
      case AthenaDSLPackage.EVENT_CONDITION__COND:
        setCond((String)newValue);
        return;
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_I:
        setRightPartI((String)newValue);
        return;
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_N:
        setRightPartN((Integer)newValue);
        return;
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_S:
        setRightPartS((String)newValue);
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
      case AthenaDSLPackage.EVENT_CONDITION__LEFT_PART:
        setLeftPart(LEFT_PART_EDEFAULT);
        return;
      case AthenaDSLPackage.EVENT_CONDITION__COND:
        setCond(COND_EDEFAULT);
        return;
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_I:
        setRightPartI(RIGHT_PART_I_EDEFAULT);
        return;
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_N:
        setRightPartN(RIGHT_PART_N_EDEFAULT);
        return;
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_S:
        setRightPartS(RIGHT_PART_S_EDEFAULT);
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
      case AthenaDSLPackage.EVENT_CONDITION__LEFT_PART:
        return LEFT_PART_EDEFAULT == null ? leftPart != null : !LEFT_PART_EDEFAULT.equals(leftPart);
      case AthenaDSLPackage.EVENT_CONDITION__COND:
        return COND_EDEFAULT == null ? cond != null : !COND_EDEFAULT.equals(cond);
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_I:
        return RIGHT_PART_I_EDEFAULT == null ? rightPartI != null : !RIGHT_PART_I_EDEFAULT.equals(rightPartI);
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_N:
        return rightPartN != RIGHT_PART_N_EDEFAULT;
      case AthenaDSLPackage.EVENT_CONDITION__RIGHT_PART_S:
        return RIGHT_PART_S_EDEFAULT == null ? rightPartS != null : !RIGHT_PART_S_EDEFAULT.equals(rightPartS);
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
    result.append(" (leftPart: ");
    result.append(leftPart);
    result.append(", cond: ");
    result.append(cond);
    result.append(", rightPartI: ");
    result.append(rightPartI);
    result.append(", rightPartN: ");
    result.append(rightPartN);
    result.append(", rightPartS: ");
    result.append(rightPartS);
    result.append(')');
    return result.toString();
  }

} //eventConditionImpl
