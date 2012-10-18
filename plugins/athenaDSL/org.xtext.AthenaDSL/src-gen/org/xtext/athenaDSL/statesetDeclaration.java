/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stateset Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.statesetDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.statesetDeclaration#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.statesetDeclaration#getInit <em>Init</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.statesetDeclaration#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getstatesetDeclaration()
 * @model
 * @generated
 */
public interface statesetDeclaration extends architectureElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstatesetDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.statesetDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.stateDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstatesetDeclaration_States()
   * @model containment="true"
   * @generated
   */
  EList<stateDeclaration> getStates();

  /**
   * Returns the value of the '<em><b>Init</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' reference.
   * @see #setInit(stateDeclaration)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstatesetDeclaration_Init()
   * @model
   * @generated
   */
  stateDeclaration getInit();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.statesetDeclaration#getInit <em>Init</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' reference.
   * @see #getInit()
   * @generated
   */
  void setInit(stateDeclaration value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.transitionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstatesetDeclaration_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<transitionDeclaration> getTransitions();

} // statesetDeclaration
