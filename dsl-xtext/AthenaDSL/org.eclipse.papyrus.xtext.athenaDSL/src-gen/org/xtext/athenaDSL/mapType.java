/**
 */
package org.xtext.athenaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.mapType#getKeytype <em>Keytype</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.mapType#getValtype <em>Valtype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getmapType()
 * @model
 * @generated
 */
public interface mapType extends DataType
{
  /**
   * Returns the value of the '<em><b>Keytype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keytype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keytype</em>' reference.
   * @see #setKeytype(DataType)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getmapType_Keytype()
   * @model
   * @generated
   */
  DataType getKeytype();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.mapType#getKeytype <em>Keytype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keytype</em>' reference.
   * @see #getKeytype()
   * @generated
   */
  void setKeytype(DataType value);

  /**
   * Returns the value of the '<em><b>Valtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valtype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valtype</em>' reference.
   * @see #setValtype(DataType)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getmapType_Valtype()
   * @model
   * @generated
   */
  DataType getValtype();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.mapType#getValtype <em>Valtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valtype</em>' reference.
   * @see #getValtype()
   * @generated
   */
  void setValtype(DataType value);

} // mapType
