/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>language Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.languageDecl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.languageDecl#getTrans <em>Trans</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.languageDecl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getlanguageDecl()
 * @model
 * @generated
 */
public interface languageDecl extends EObject
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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getlanguageDecl_Lang()
   * @model
   * @generated
   */
  LanguageDeclaration getLang();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.languageDecl#getLang <em>Lang</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' reference.
   * @see #getLang()
   * @generated
   */
  void setLang(LanguageDeclaration value);

  /**
   * Returns the value of the '<em><b>Trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trans</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trans</em>' attribute.
   * @see #setTrans(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getlanguageDecl_Trans()
   * @model
   * @generated
   */
  String getTrans();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.languageDecl#getTrans <em>Trans</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trans</em>' attribute.
   * @see #getTrans()
   * @generated
   */
  void setTrans(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getlanguageDecl_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.languageDecl#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // languageDecl
