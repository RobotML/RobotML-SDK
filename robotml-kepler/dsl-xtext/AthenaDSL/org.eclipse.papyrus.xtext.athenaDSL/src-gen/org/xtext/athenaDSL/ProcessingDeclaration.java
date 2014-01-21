/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.ProcessingDeclaration#getLocalParameters <em>Local Parameters</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.ProcessingDeclaration#getLocalEvents <em>Local Events</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.ProcessingDeclaration#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getProcessingDeclaration()
 * @model
 * @generated
 */
public interface ProcessingDeclaration extends FuncProc
{
  /**
   * Returns the value of the '<em><b>Local Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.localParameterDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Parameters</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProcessingDeclaration_LocalParameters()
   * @model containment="true"
   * @generated
   */
  EList<localParameterDeclaration> getLocalParameters();

  /**
   * Returns the value of the '<em><b>Local Events</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.localEventDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Events</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProcessingDeclaration_LocalEvents()
   * @model containment="true"
   * @generated
   */
  EList<localEventDeclaration> getLocalEvents();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getProcessingDeclaration_Statements()
   * @model containment="true"
   * @generated
   */
  EList<statement> getStatements();

} // ProcessingDeclaration
