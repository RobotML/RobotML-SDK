/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>whileblock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.whileblock#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.whileblock#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getwhileblock()
 * @model
 * @generated
 */
public interface whileblock extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Name</em>' reference.
   * @see #setEventName(localEventDeclaration)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getwhileblock_EventName()
   * @model
   * @generated
   */
  localEventDeclaration getEventName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.whileblock#getEventName <em>Event Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Name</em>' reference.
   * @see #getEventName()
   * @generated
   */
  void setEventName(localEventDeclaration value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getwhileblock_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<statement> getBlocks();

} // whileblock
