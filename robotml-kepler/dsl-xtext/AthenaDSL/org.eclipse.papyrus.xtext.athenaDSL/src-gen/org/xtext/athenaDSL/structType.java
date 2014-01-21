/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.structType#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.structType#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructType()
 * @model
 * @generated
 */
public interface structType extends DataType
{
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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructType_Indices()
   * @model containment="true"
   * @generated
   */
  EList<index> getIndices();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.structElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getstructType_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<structElement> getParameters();

} // structType
