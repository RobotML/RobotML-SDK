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
import org.xtext.athenaDSL.validityFunctionDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>validity Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.validityFunctionDeclarationImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.validityFunctionDeclarationImpl#getFctName <em>Fct Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class validityFunctionDeclarationImpl extends MinimalEObjectImpl.Container implements validityFunctionDeclaration
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
   * The default value of the '{@link #getFctName() <em>Fct Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFctName()
   * @generated
   * @ordered
   */
  protected static final String FCT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFctName() <em>Fct Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFctName()
   * @generated
   * @ordered
   */
  protected String fctName = FCT_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected validityFunctionDeclarationImpl()
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
    return AthenaDSLPackage.Literals.VALIDITY_FUNCTION_DECLARATION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__TYPENAME, oldTypename, typename));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__TYPENAME, oldTypename, typename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFctName()
  {
    return fctName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFctName(String newFctName)
  {
    String oldFctName = fctName;
    fctName = newFctName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__FCT_NAME, oldFctName, fctName));
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
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__TYPENAME:
        if (resolve) return getTypename();
        return basicGetTypename();
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__FCT_NAME:
        return getFctName();
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
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__TYPENAME:
        setTypename((DataType)newValue);
        return;
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__FCT_NAME:
        setFctName((String)newValue);
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
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__TYPENAME:
        setTypename((DataType)null);
        return;
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__FCT_NAME:
        setFctName(FCT_NAME_EDEFAULT);
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
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__TYPENAME:
        return typename != null;
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION__FCT_NAME:
        return FCT_NAME_EDEFAULT == null ? fctName != null : !FCT_NAME_EDEFAULT.equals(fctName);
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
    result.append(" (fctName: ");
    result.append(fctName);
    result.append(')');
    return result.toString();
  }

} //validityFunctionDeclarationImpl
