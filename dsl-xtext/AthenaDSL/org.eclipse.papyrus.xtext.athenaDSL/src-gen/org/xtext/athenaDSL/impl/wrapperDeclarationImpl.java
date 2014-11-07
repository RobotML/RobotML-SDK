/**
 */
package org.xtext.athenaDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.wrapperDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>wrapper Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.impl.wrapperDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.wrapperDeclarationImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.wrapperDeclarationImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.wrapperDeclarationImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.wrapperDeclarationImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.impl.wrapperDeclarationImpl#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class wrapperDeclarationImpl extends MinimalEObjectImpl.Container implements wrapperDeclaration
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
   * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected static final String LINK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected String link = LINK_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<String> functions;

  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<String> objects;

  /**
   * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibraries()
   * @generated
   * @ordered
   */
  protected EList<String> libraries;

  /**
   * The cached value of the '{@link #getTests() <em>Tests</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTests()
   * @generated
   * @ordered
   */
  protected EList<String> tests;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected wrapperDeclarationImpl()
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
    return AthenaDSLPackage.Literals.WRAPPER_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.WRAPPER_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(String newLink)
  {
    String oldLink = link;
    link = newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AthenaDSLPackage.WRAPPER_DECLARATION__LINK, oldLink, link));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFunctions()
  {
    if (functions == null)
    {
      functions = new EDataTypeEList<String>(String.class, this, AthenaDSLPackage.WRAPPER_DECLARATION__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getObjects()
  {
    if (objects == null)
    {
      objects = new EDataTypeEList<String>(String.class, this, AthenaDSLPackage.WRAPPER_DECLARATION__OBJECTS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLibraries()
  {
    if (libraries == null)
    {
      libraries = new EDataTypeEList<String>(String.class, this, AthenaDSLPackage.WRAPPER_DECLARATION__LIBRARIES);
    }
    return libraries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTests()
  {
    if (tests == null)
    {
      tests = new EDataTypeEList<String>(String.class, this, AthenaDSLPackage.WRAPPER_DECLARATION__TESTS);
    }
    return tests;
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
      case AthenaDSLPackage.WRAPPER_DECLARATION__NAME:
        return getName();
      case AthenaDSLPackage.WRAPPER_DECLARATION__LINK:
        return getLink();
      case AthenaDSLPackage.WRAPPER_DECLARATION__FUNCTIONS:
        return getFunctions();
      case AthenaDSLPackage.WRAPPER_DECLARATION__OBJECTS:
        return getObjects();
      case AthenaDSLPackage.WRAPPER_DECLARATION__LIBRARIES:
        return getLibraries();
      case AthenaDSLPackage.WRAPPER_DECLARATION__TESTS:
        return getTests();
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
      case AthenaDSLPackage.WRAPPER_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__LINK:
        setLink((String)newValue);
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends String>)newValue);
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends String>)newValue);
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__LIBRARIES:
        getLibraries().clear();
        getLibraries().addAll((Collection<? extends String>)newValue);
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__TESTS:
        getTests().clear();
        getTests().addAll((Collection<? extends String>)newValue);
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
      case AthenaDSLPackage.WRAPPER_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__LINK:
        setLink(LINK_EDEFAULT);
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__FUNCTIONS:
        getFunctions().clear();
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__OBJECTS:
        getObjects().clear();
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__LIBRARIES:
        getLibraries().clear();
        return;
      case AthenaDSLPackage.WRAPPER_DECLARATION__TESTS:
        getTests().clear();
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
      case AthenaDSLPackage.WRAPPER_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AthenaDSLPackage.WRAPPER_DECLARATION__LINK:
        return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
      case AthenaDSLPackage.WRAPPER_DECLARATION__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case AthenaDSLPackage.WRAPPER_DECLARATION__OBJECTS:
        return objects != null && !objects.isEmpty();
      case AthenaDSLPackage.WRAPPER_DECLARATION__LIBRARIES:
        return libraries != null && !libraries.isEmpty();
      case AthenaDSLPackage.WRAPPER_DECLARATION__TESTS:
        return tests != null && !tests.isEmpty();
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
    result.append(", link: ");
    result.append(link);
    result.append(", functions: ");
    result.append(functions);
    result.append(", objects: ");
    result.append(objects);
    result.append(", libraries: ");
    result.append(libraries);
    result.append(", tests: ");
    result.append(tests);
    result.append(')');
    return result.toString();
  }

} //wrapperDeclarationImpl
