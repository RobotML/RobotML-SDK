/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.Project#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.Project#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.Project#getTypes <em>Types</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.Project#getValidities <em>Validities</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.Project#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.Project#getProcessings <em>Processings</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.Project#getPrototypes <em>Prototypes</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.Project#getWrappers <em>Wrappers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.LanguageDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Languages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Languages</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject_Languages()
   * @model containment="true"
   * @generated
   */
  EList<LanguageDeclaration> getLanguages();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject_Types()
   * @model containment="true"
   * @generated
   */
  EList<DataType> getTypes();

  /**
   * Returns the value of the '<em><b>Validities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.validityFunctionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validities</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject_Validities()
   * @model containment="true"
   * @generated
   */
  EList<validityFunctionDeclaration> getValidities();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.functionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject_Functions()
   * @model containment="true"
   * @generated
   */
  EList<functionDeclaration> getFunctions();

  /**
   * Returns the value of the '<em><b>Processings</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.ProcessingDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processings</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject_Processings()
   * @model containment="true"
   * @generated
   */
  EList<ProcessingDeclaration> getProcessings();

  /**
   * Returns the value of the '<em><b>Prototypes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.prototypeDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prototypes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prototypes</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject_Prototypes()
   * @model containment="true"
   * @generated
   */
  EList<prototypeDeclaration> getPrototypes();

  /**
   * Returns the value of the '<em><b>Wrappers</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.wrapperDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wrappers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wrappers</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProject_Wrappers()
   * @model containment="true"
   * @generated
   */
  EList<wrapperDeclaration> getWrappers();

} // Project
