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
import org.xtext.athenaDSL.languageDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>language Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.languageDeclImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.languageDeclImpl#getTrans <em>Trans</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.languageDeclImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class languageDeclImpl extends MinimalEObjectImpl.Container implements languageDecl
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
   * The default value of the '{@link #getTrans() <em>Trans</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrans()
   * @generated
   * @ordered
   */
  protected static final String TRANS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrans() <em>Trans</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrans()
   * @generated
   * @ordered
   */
  protected String trans = TRANS_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected languageDeclImpl()
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
    return AthenaDSLPackage.Literals.LANGUAGE_DECL;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AthenaDSLPackage.LANGUAGE_DECL__LANG, oldLang, lang));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LANGUAGE_DECL__LANG, oldLang, lang));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTrans()
  {
    return trans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrans(String newTrans)
  {
    String oldTrans = trans;
    trans = newTrans;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LANGUAGE_DECL__TRANS, oldTrans, trans));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.LANGUAGE_DECL__VALUE, oldValue, value));
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
      case AthenaDSLPackage.LANGUAGE_DECL__LANG:
        if (resolve) return getLang();
        return basicGetLang();
      case AthenaDSLPackage.LANGUAGE_DECL__TRANS:
        return getTrans();
      case AthenaDSLPackage.LANGUAGE_DECL__VALUE:
        return getValue();
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
      case AthenaDSLPackage.LANGUAGE_DECL__LANG:
        setLang((LanguageDeclaration)newValue);
        return;
      case AthenaDSLPackage.LANGUAGE_DECL__TRANS:
        setTrans((String)newValue);
        return;
      case AthenaDSLPackage.LANGUAGE_DECL__VALUE:
        setValue((String)newValue);
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
      case AthenaDSLPackage.LANGUAGE_DECL__LANG:
        setLang((LanguageDeclaration)null);
        return;
      case AthenaDSLPackage.LANGUAGE_DECL__TRANS:
        setTrans(TRANS_EDEFAULT);
        return;
      case AthenaDSLPackage.LANGUAGE_DECL__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case AthenaDSLPackage.LANGUAGE_DECL__LANG:
        return lang != null;
      case AthenaDSLPackage.LANGUAGE_DECL__TRANS:
        return TRANS_EDEFAULT == null ? trans != null : !TRANS_EDEFAULT.equals(trans);
      case AthenaDSLPackage.LANGUAGE_DECL__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (trans: ");
    result.append(trans);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //languageDeclImpl
