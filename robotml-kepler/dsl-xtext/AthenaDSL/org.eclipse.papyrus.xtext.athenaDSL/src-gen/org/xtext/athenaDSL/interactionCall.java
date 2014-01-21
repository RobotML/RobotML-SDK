/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interaction Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.interactionCall#getFctName <em>Fct Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.interactionCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionCall()
 * @model
 * @generated
 */
public interface interactionCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Fct Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fct Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fct Name</em>' reference.
   * @see #setFctName(FuncProc)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionCall_FctName()
   * @model
   * @generated
   */
  FuncProc getFctName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.interactionCall#getFctName <em>Fct Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fct Name</em>' reference.
   * @see #getFctName()
   * @generated
   */
  void setFctName(FuncProc value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.farg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionCall_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<farg> getArguments();

} // interactionCall
