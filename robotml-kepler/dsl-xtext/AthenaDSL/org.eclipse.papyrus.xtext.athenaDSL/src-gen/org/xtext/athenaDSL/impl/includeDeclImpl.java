/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.LanguageDeclaration;
import org.xtext.athenaDSL.includeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>include Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.includeDeclImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.includeDeclImpl#getIncludeName <em>Include Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class includeDeclImpl extends MinimalEObjectImpl.Container implements includeDecl
{
  /**
   * The cached value of the '{@link #getLang() <em>Lang</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected LanguageDeclaration lang;

  /**
   * The default value of the '{@link #getIncludeName() <em>Include Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeName()
   * @generated
   * @ordered
   */
  protected static final String INCLUDE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncludeName() <em>Include Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeName()
   * @generated
   * @ordered
   */
  protected String includeName = INCLUDE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected includeDeclImpl()
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
    return AthenaDSLPackage.Literals.INCLUDE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageDeclaration getLang()
  {
    if (lang != null && lang.eIsProxy())
    {
      InternalEObject oldLang = (InternalEObject)lang;
      lang = (LanguageDeclaration)eResolveProxy(oldLang);
      if (lang != oldLang)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.INCLUDE_DECL__LANG, oldLang, lang));
      }
    }
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageDeclaration basicGetLang()
  {
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLang(LanguageDeclaration newLang)
  {
    LanguageDeclaration oldLang = lang;
    lang = newLang;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INCLUDE_DECL__LANG, oldLang, lang));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIncludeName()
  {
    return includeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeName(String newIncludeName)
  {
    String oldIncludeName = includeName;
    includeName = newIncludeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.INCLUDE_DECL__INCLUDE_NAME, oldIncludeName, includeName));
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
      case AthenaDSLPackage.INCLUDE_DECL__LANG:
        if (resolve) return getLang();
        return basicGetLang();
      case AthenaDSLPackage.INCLUDE_DECL__INCLUDE_NAME:
        return getIncludeName();
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
      case AthenaDSLPackage.INCLUDE_DECL__LANG:
        setLang((LanguageDeclaration)newValue);
        return;
      case AthenaDSLPackage.INCLUDE_DECL__INCLUDE_NAME:
        setIncludeName((String)newValue);
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
      case AthenaDSLPackage.INCLUDE_DECL__LANG:
        setLang((LanguageDeclaration)null);
        return;
      case AthenaDSLPackage.INCLUDE_DECL__INCLUDE_NAME:
        setIncludeName(INCLUDE_NAME_EDEFAULT);
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
      case AthenaDSLPackage.INCLUDE_DECL__LANG:
        return lang != null;
      case AthenaDSLPackage.INCLUDE_DECL__INCLUDE_NAME:
        return INCLUDE_NAME_EDEFAULT == null ? includeName != null : !INCLUDE_NAME_EDEFAULT.equals(includeName);
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
    result.append(" (includeName: ");
    result.append(includeName);
    result.append(')');
    return result.toString();
  }

} //includeDeclImpl
