/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.structElement#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.structElement#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.structElement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.structElement#isHasInitValue <em>Has Init Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.structElement#getInitValue <em>Init Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructElement()
 * @model
 * @generated
 */
public interface structElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' reference.
   * @see #setTypename(DataType)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructElement_Typename()
   * @model
   * @generated
   */
  DataType getTypename();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.structElement#getTypename <em>Typename</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' reference.
   * @see #getTypename()
   * @generated
   */
  void setTypename(DataType value);

  /**
   * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.index}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructElement_Indices()
   * @model containment="true"
   * @generated
   */
  EList<index> getIndices();

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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.structElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Has Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Init Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Init Value</em>' attribute.
   * @see #setHasInitValue(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructElement_HasInitValue()
   * @model
   * @generated
   */
  boolean isHasInitValue();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.structElement#isHasInitValue <em>Has Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Init Value</em>' attribute.
   * @see #isHasInitValue()
   * @generated
   */
  void setHasInitValue(boolean value);

  /**
   * Returns the value of the '<em><b>Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Value</em>' attribute.
   * @see #setInitValue(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructElement_InitValue()
   * @model
   * @generated
   */
  String getInitValue();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.structElement#getInitValue <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Value</em>' attribute.
   * @see #getInitValue()
   * @generated
   */
  void setInitValue(String value);

} // structElement
