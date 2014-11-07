/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>wrapper Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.wrapperDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.wrapperDeclaration#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.wrapperDeclaration#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.wrapperDeclaration#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.wrapperDeclaration#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.wrapperDeclaration#getTests <em>Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getwrapperDeclaration()
 * @model
 * @generated
 */
public interface wrapperDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getwrapperDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.wrapperDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' attribute.
   * @see #setLink(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getwrapperDeclaration_Link()
   * @model
   * @generated
   */
  String getLink();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.wrapperDeclaration#getLink <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' attribute.
   * @see #getLink()
   * @generated
   */
  void setLink(String value);

  /**
   * Returns the value of the '<em><b>Functions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' attribute list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getwrapperDeclaration_Functions()
   * @model unique="false"
   * @generated
   */
  EList<String> getFunctions();

  /**
   * Returns the value of the '<em><b>Objects</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' attribute list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getwrapperDeclaration_Objects()
   * @model unique="false"
   * @generated
   */
  EList<String> getObjects();

  /**
   * Returns the value of the '<em><b>Libraries</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Libraries</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Libraries</em>' attribute list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getwrapperDeclaration_Libraries()
   * @model unique="false"
   * @generated
   */
  EList<String> getLibraries();

  /**
   * Returns the value of the '<em><b>Tests</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tests</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tests</em>' attribute list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getwrapperDeclaration_Tests()
   * @model unique="false"
   * @generated
   */
  EList<String> getTests();

} // wrapperDeclaration
