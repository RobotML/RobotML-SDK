/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>include Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.includeDecl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.includeDecl#getIncludeName <em>Include Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getincludeDecl()
 * @model
 * @generated
 */
public interface includeDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Lang</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lang</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lang</em>' reference.
   * @see #setLang(LanguageDeclaration)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getincludeDecl_Lang()
   * @model
   * @generated
   */
  LanguageDeclaration getLang();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.includeDecl#getLang <em>Lang</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' reference.
   * @see #getLang()
   * @generated
   */
  void setLang(LanguageDeclaration value);

  /**
   * Returns the value of the '<em><b>Include Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Name</em>' attribute.
   * @see #setIncludeName(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getincludeDecl_IncludeName()
   * @model
   * @generated
   */
  String getIncludeName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.includeDecl#getIncludeName <em>Include Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Name</em>' attribute.
   * @see #getIncludeName()
   * @generated
   */
  void setIncludeName(String value);

} // includeDecl
