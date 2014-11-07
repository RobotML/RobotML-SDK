/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>lexical Cast Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.lexicalCastDecl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.lexicalCastDecl#getCast <em>Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getlexicalCastDecl()
 * @model
 * @generated
 */
public interface lexicalCastDecl extends EObject
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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getlexicalCastDecl_Lang()
   * @model
   * @generated
   */
  LanguageDeclaration getLang();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.lexicalCastDecl#getLang <em>Lang</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' reference.
   * @see #getLang()
   * @generated
   */
  void setLang(LanguageDeclaration value);

  /**
   * Returns the value of the '<em><b>Cast</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cast</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast</em>' attribute.
   * @see #setCast(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getlexicalCastDecl_Cast()
   * @model
   * @generated
   */
  String getCast();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.lexicalCastDecl#getCast <em>Cast</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast</em>' attribute.
   * @see #getCast()
   * @generated
   */
  void setCast(String value);

} // lexicalCastDecl
