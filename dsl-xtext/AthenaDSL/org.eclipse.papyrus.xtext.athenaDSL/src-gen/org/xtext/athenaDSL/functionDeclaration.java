/**
 */
package org.xtext.athenaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.functionDeclaration#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getfunctionDeclaration()
 * @model
 * @generated
 */
public interface functionDeclaration extends FuncProc
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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getfunctionDeclaration_Lang()
   * @model
   * @generated
   */
  LanguageDeclaration getLang();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.functionDeclaration#getLang <em>Lang</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' reference.
   * @see #getLang()
   * @generated
   */
  void setLang(LanguageDeclaration value);

} // functionDeclaration
