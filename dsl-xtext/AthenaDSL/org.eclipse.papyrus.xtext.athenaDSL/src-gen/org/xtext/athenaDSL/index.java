/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.index#getDim <em>Dim</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.index#isHasValue <em>Has Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.index#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getindex()
 * @model
 * @generated
 */
public interface index extends EObject
{
  /**
   * Returns the value of the '<em><b>Dim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dim</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim</em>' attribute.
   * @see #setDim(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getindex_Dim()
   * @model
   * @generated
   */
  String getDim();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.index#getDim <em>Dim</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dim</em>' attribute.
   * @see #getDim()
   * @generated
   */
  void setDim(String value);

  /**
   * Returns the value of the '<em><b>Has Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Value</em>' attribute.
   * @see #setHasValue(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getindex_HasValue()
   * @model
   * @generated
   */
  boolean isHasValue();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.index#isHasValue <em>Has Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Value</em>' attribute.
   * @see #isHasValue()
   * @generated
   */
  void setHasValue(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getindex_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.index#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // index
