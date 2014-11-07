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
import org.xtext.athenaDSL.lexicalCastDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>lexical Cast Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.lexicalCastDeclImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.lexicalCastDeclImpl#getCast <em>Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class lexicalCastDeclImpl extends MinimalEObjectImpl.Container implements lexicalCastDecl
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
   * The default value of the '{@link #getCast() <em>Cast</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCast()
   * @generated
   * @ordered
   */
  protected static final String CAST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCast() <em>Cast</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCast()
   * @generated
   * @ordered
   */
  protected String cast = CAST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected lexicalCastDeclImpl()
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
    return AthenaDSLPackage.Literals.LEXICAL_CAST_DECL;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.LEXICAL_CAST_DECL__LANG, oldLang, lang));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LEXICAL_CAST_DECL__LANG, oldLang, lang));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCast()
  {
    return cast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCast(String newCast)
  {
    String oldCast = cast;
    cast = newCast;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LEXICAL_CAST_DECL__CAST, oldCast, cast));
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
      case AthenaDSLPackage.LEXICAL_CAST_DECL__LANG:
        if (resolve) return getLang();
        return basicGetLang();
      case AthenaDSLPackage.LEXICAL_CAST_DECL__CAST:
        return getCast();
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
      case AthenaDSLPackage.LEXICAL_CAST_DECL__LANG:
        setLang((LanguageDeclaration)newValue);
        return;
      case AthenaDSLPackage.LEXICAL_CAST_DECL__CAST:
        setCast((String)newValue);
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
      case AthenaDSLPackage.LEXICAL_CAST_DECL__LANG:
        setLang((LanguageDeclaration)null);
        return;
      case AthenaDSLPackage.LEXICAL_CAST_DECL__CAST:
        setCast(CAST_EDEFAULT);
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
      case AthenaDSLPackage.LEXICAL_CAST_DECL__LANG:
        return lang != null;
      case AthenaDSLPackage.LEXICAL_CAST_DECL__CAST:
        return CAST_EDEFAULT == null ? cast != null : !CAST_EDEFAULT.equals(cast);
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
    result.append(" (cast: ");
    result.append(cast);
    result.append(')');
    return result.toString();
  }

} //lexicalCastDeclImpl
