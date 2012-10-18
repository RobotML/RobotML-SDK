/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>validity Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.validityFunctionDeclaration#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.validityFunctionDeclaration#getFctName <em>Fct Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getvalidityFunctionDeclaration()
 * @model
 * @generated
 */
public interface validityFunctionDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' reference.
   * @see #setTypename(DataType)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getvalidityFunctionDeclaration_Typename()
   * @model
   * @generated
   */
  DataType getTypename();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.validityFunctionDeclaration#getTypename <em>Typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' reference.
   * @see #getTypename()
   * @generated
   */
  void setTypename(DataType value);

  /**
   * Returns the value of the '<em><b>Fct Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fct Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fct Name</em>' attribute.
   * @see #setFctName(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getvalidityFunctionDeclaration_FctName()
   * @model
   * @generated
   */
  String getFctName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.validityFunctionDeclaration#getFctName <em>Fct Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fct Name</em>' attribute.
   * @see #getFctName()
   * @generated
   */
  void setFctName(String value);

} // validityFunctionDeclaration
