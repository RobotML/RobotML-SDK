/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.arrayType#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.arrayType#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getarrayType()
 * @model
 * @generated
 */
public interface arrayType extends DataType
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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getarrayType_Typename()
   * @model
   * @generated
   */
  DataType getTypename();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.arrayType#getTypename <em>Typename</em>}' reference.
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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getarrayType_Indices()
   * @model containment="true"
   * @generated
   */
  EList<index> getIndices();

} // arrayType
