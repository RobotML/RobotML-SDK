/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ifblock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.ifblock#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.ifblock#getIfBlocks <em>If Blocks</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.ifblock#isHasElse <em>Has Else</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.ifblock#getElseBlocks <em>Else Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getifblock()
 * @model
 * @generated
 */
public interface ifblock extends EObject
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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getifblock_EventName()
   * @model
   * @generated
   */
  localEventDeclaration getEventName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.ifblock#getEventName <em>Event Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Name</em>' reference.
   * @see #getEventName()
   * @generated
   */
  void setEventName(localEventDeclaration value);

  /**
   * Returns the value of the '<em><b>If Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Blocks</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getifblock_IfBlocks()
   * @model containment="true"
   * @generated
   */
  EList<statement> getIfBlocks();

  /**
   * Returns the value of the '<em><b>Has Else</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Else</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Else</em>' attribute.
   * @see #setHasElse(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getifblock_HasElse()
   * @model
   * @generated
   */
  boolean isHasElse();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.ifblock#isHasElse <em>Has Else</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Else</em>' attribute.
   * @see #isHasElse()
   * @generated
   */
  void setHasElse(boolean value);

  /**
   * Returns the value of the '<em><b>Else Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Blocks</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getifblock_ElseBlocks()
   * @model containment="true"
   * @generated
   */
  EList<statement> getElseBlocks();

} // ifblock
