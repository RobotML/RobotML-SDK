/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.statement#getCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getstatement()
 * @model
 * @generated
 */
public interface statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call</em>' containment reference.
   * @see #setCall(EObject)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstatement_Call()
   * @model containment="true"
   * @generated
   */
  EObject getCall();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.statement#getCall <em>Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call</em>' containment reference.
   * @see #getCall()
   * @generated
   */
  void setCall(EObject value);

} // statement
