/**
 */
package org.xtext.athenaDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.Import;
import org.xtext.athenaDSL.LanguageDeclaration;
import org.xtext.athenaDSL.ProcessingDeclaration;
import org.xtext.athenaDSL.Project;
import org.xtext.athenaDSL.functionDeclaration;
import org.xtext.athenaDSL.prototypeDeclaration;
import org.xtext.athenaDSL.validityFunctionDeclaration;
import org.xtext.athenaDSL.wrapperDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.ProjectImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProjectImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProjectImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProjectImpl#getValidities <em>Validities</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProjectImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProjectImpl#getProcessings <em>Processings</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProjectImpl#getPrototypes <em>Prototypes</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.ProjectImpl#getWrappers <em>Wrappers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getLanguages() <em>Languages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguages()
   * @generated
   * @ordered
   */
  protected EList<LanguageDeclaration> languages;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<DataType> types;

  /**
   * The cached value of the '{@link #getValidities() <em>Validities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidities()
   * @generated
   * @ordered
   */
  protected EList<validityFunctionDeclaration> validities;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<functionDeclaration> functions;

  /**
   * The cached value of the '{@link #getProcessings() <em>Processings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessings()
   * @generated
   * @ordered
   */
  protected EList<ProcessingDeclaration> processings;

  /**
   * The cached value of the '{@link #getPrototypes() <em>Prototypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrototypes()
   * @generated
   * @ordered
   */
  protected EList<prototypeDeclaration> prototypes;

  /**
   * The cached value of the '{@link #getWrappers() <em>Wrappers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrappers()
   * @generated
   * @ordered
   */
  protected EList<wrapperDeclaration> wrappers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectImpl()
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
    return AthenaDSLPackage.Literals.PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AthenaDSLPackage.PROJECT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LanguageDeclaration> getLanguages()
  {
    if (languages == null)
    {
      languages = new EObjectContainmentEList<LanguageDeclaration>(LanguageDeclaration.class, this, AthenaDSLPackage.PROJECT__LANGUAGES);
    }
    return languages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataType> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<DataType>(DataType.class, this, AthenaDSLPackage.PROJECT__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<validityFunctionDeclaration> getValidities()
  {
    if (validities == null)
    {
      validities = new EObjectContainmentEList<validityFunctionDeclaration>(validityFunctionDeclaration.class, this, AthenaDSLPackage.PROJECT__VALIDITIES);
    }
    return validities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<functionDeclaration> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<functionDeclaration>(functionDeclaration.class, this, AthenaDSLPackage.PROJECT__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessingDeclaration> getProcessings()
  {
    if (processings == null)
    {
      processings = new EObjectContainmentEList<ProcessingDeclaration>(ProcessingDeclaration.class, this, AthenaDSLPackage.PROJECT__PROCESSINGS);
    }
    return processings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<prototypeDeclaration> getPrototypes()
  {
    if (prototypes == null)
    {
      prototypes = new EObjectContainmentEList<prototypeDeclaration>(prototypeDeclaration.class, this, AthenaDSLPackage.PROJECT__PROTOTYPES);
    }
    return prototypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<wrapperDeclaration> getWrappers()
  {
    if (wrappers == null)
    {
      wrappers = new EObjectContainmentEList<wrapperDeclaration>(wrapperDeclaration.class, this, AthenaDSLPackage.PROJECT__WRAPPERS);
    }
    return wrappers;
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
      case AthenaDSLPackage.PROJECT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROJECT__LANGUAGES:
        return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROJECT__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROJECT__VALIDITIES:
        return ((InternalEList<?>)getValidities()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROJECT__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROJECT__PROCESSINGS:
        return ((InternalEList<?>)getProcessings()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROJECT__PROTOTYPES:
        return ((InternalEList<?>)getPrototypes()).basicRemove(otherEnd, msgs);
      case AthenaDSLPackage.PROJECT__WRAPPERS:
        return ((InternalEList<?>)getWrappers()).basicRemove(otherEnd, msgs);
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
      case AthenaDSLPackage.PROJECT__IMPORTS:
        return getImports();
      case AthenaDSLPackage.PROJECT__LANGUAGES:
        return getLanguages();
      case AthenaDSLPackage.PROJECT__TYPES:
        return getTypes();
      case AthenaDSLPackage.PROJECT__VALIDITIES:
        return getValidities();
      case AthenaDSLPackage.PROJECT__FUNCTIONS:
        return getFunctions();
      case AthenaDSLPackage.PROJECT__PROCESSINGS:
        return getProcessings();
      case AthenaDSLPackage.PROJECT__PROTOTYPES:
        return getPrototypes();
      case AthenaDSLPackage.PROJECT__WRAPPERS:
        return getWrappers();
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
      case AthenaDSLPackage.PROJECT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AthenaDSLPackage.PROJECT__LANGUAGES:
        getLanguages().clear();
        getLanguages().addAll((Collection<? extends LanguageDeclaration>)newValue);
        return;
      case AthenaDSLPackage.PROJECT__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends DataType>)newValue);
        return;
      case AthenaDSLPackage.PROJECT__VALIDITIES:
        getValidities().clear();
        getValidities().addAll((Collection<? extends validityFunctionDeclaration>)newValue);
        return;
      case AthenaDSLPackage.PROJECT__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends functionDeclaration>)newValue);
        return;
      case AthenaDSLPackage.PROJECT__PROCESSINGS:
        getProcessings().clear();
        getProcessings().addAll((Collection<? extends ProcessingDeclaration>)newValue);
        return;
      case AthenaDSLPackage.PROJECT__PROTOTYPES:
        getPrototypes().clear();
        getPrototypes().addAll((Collection<? extends prototypeDeclaration>)newValue);
        return;
      case AthenaDSLPackage.PROJECT__WRAPPERS:
        getWrappers().clear();
        getWrappers().addAll((Collection<? extends wrapperDeclaration>)newValue);
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
      case AthenaDSLPackage.PROJECT__IMPORTS:
        getImports().clear();
        return;
      case AthenaDSLPackage.PROJECT__LANGUAGES:
        getLanguages().clear();
        return;
      case AthenaDSLPackage.PROJECT__TYPES:
        getTypes().clear();
        return;
      case AthenaDSLPackage.PROJECT__VALIDITIES:
        getValidities().clear();
        return;
      case AthenaDSLPackage.PROJECT__FUNCTIONS:
        getFunctions().clear();
        return;
      case AthenaDSLPackage.PROJECT__PROCESSINGS:
        getProcessings().clear();
        return;
      case AthenaDSLPackage.PROJECT__PROTOTYPES:
        getPrototypes().clear();
        return;
      case AthenaDSLPackage.PROJECT__WRAPPERS:
        getWrappers().clear();
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
      case AthenaDSLPackage.PROJECT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AthenaDSLPackage.PROJECT__LANGUAGES:
        return languages != null && !languages.isEmpty();
      case AthenaDSLPackage.PROJECT__TYPES:
        return types != null && !types.isEmpty();
      case AthenaDSLPackage.PROJECT__VALIDITIES:
        return validities != null && !validities.isEmpty();
      case AthenaDSLPackage.PROJECT__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case AthenaDSLPackage.PROJECT__PROCESSINGS:
        return processings != null && !processings.isEmpty();
      case AthenaDSLPackage.PROJECT__PROTOTYPES:
        return prototypes != null && !prototypes.isEmpty();
      case AthenaDSLPackage.PROJECT__WRAPPERS:
        return wrappers != null && !wrappers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProjectImpl
