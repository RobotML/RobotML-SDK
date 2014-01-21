/**
 */
package org.xtext.athenaDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.basicType;
import org.xtext.athenaDSL.includeDecl;
import org.xtext.athenaDSL.languageDecl;
import org.xtext.athenaDSL.lexicalCastDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>basic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.basicTypeImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.basicTypeImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.basicTypeImpl#getCasts <em>Casts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class basicTypeImpl extends DataTypeImpl implements basicType
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<includeDecl> includes;

  /**
   * The cached value of the '{@link #getLanguages() <em>Languages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguages()
   * @generated
   * @ordered
   */
  protected EList<languageDecl> languages;

  /**
   * The cached value of the '{@link #getCasts() <em>Casts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCasts()
   * @generated
   * @ordered
   */
  protected EList<lexicalCastDecl> casts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected basicTypeImpl()
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
    return AthenaDSLPackage.Literals.BASIC_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<includeDecl> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<includeDecl>(includeDecl.class, this, AthenaDSLPackage.BASIC_TYPE__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<languageDecl> getLanguages()
  {
    if (languages == null)
    {
      languages = new EObjectContainmentEList<languageDecl>(languageDecl.class, this, AthenaDSLPackage.BASIC_TYPE__LANGUAGES);
    }
    return languages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<lexicalCastDecl> getCasts()
  {
    if (casts == null)
    {
      casts = new EObjectContainmentEList<lexicalCastDecl>(lexicalCastDecl.class, this, AthenaDSLPackage.BASIC_TYPE__CASTS);
    }
    return casts;
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
      case AthenaDSLPackage.BASIC_TYPE__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.BASIC_TYPE__LANGUAGES:
        return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.BASIC_TYPE__CASTS:
        return ((InternalEList<?>)getCasts()).basicRemove(otherEnd, msgs);
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
      case AthenaDSLPackage.BASIC_TYPE__INCLUDES:
        return getIncludes();
      case AthenaDSLPackage.BASIC_TYPE__LANGUAGES:
        return getLanguages();
      case AthenaDSLPackage.BASIC_TYPE__CASTS:
        return getCasts();
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
      case AthenaDSLPackage.BASIC_TYPE__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends includeDecl>)newValue);
        return;
      case AthenaDSLPackage.BASIC_TYPE__LANGUAGES:
        getLanguages().clear();
        getLanguages().addAll((Collection<? extends languageDecl>)newValue);
        return;
      case AthenaDSLPackage.BASIC_TYPE__CASTS:
        getCasts().clear();
        getCasts().addAll((Collection<? extends lexicalCastDecl>)newValue);
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
      case AthenaDSLPackage.BASIC_TYPE__INCLUDES:
        getIncludes().clear();
        return;
      case AthenaDSLPackage.BASIC_TYPE__LANGUAGES:
        getLanguages().clear();
        return;
      case AthenaDSLPackage.BASIC_TYPE__CASTS:
        getCasts().clear();
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
      case AthenaDSLPackage.BASIC_TYPE__INCLUDES:
        return includes != null && !includes.isEmpty();
      case AthenaDSLPackage.BASIC_TYPE__LANGUAGES:
        return languages != null && !languages.isEmpty();
      case AthenaDSLPackage.BASIC_TYPE__CASTS:
        return casts != null && !casts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //basicTypeImpl
