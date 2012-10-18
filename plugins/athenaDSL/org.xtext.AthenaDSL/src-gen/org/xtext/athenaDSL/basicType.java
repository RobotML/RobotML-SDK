/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>basic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.basicType#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.basicType#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.basicType#getCasts <em>Casts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getbasicType()
 * @model
 * @generated
 */
public interface basicType extends DataType
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.includeDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getbasicType_Includes()
   * @model containment="true"
   * @generated
   */
  EList<includeDecl> getIncludes();

  /**
   * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.languageDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Languages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Languages</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getbasicType_Languages()
   * @model containment="true"
   * @generated
   */
  EList<languageDecl> getLanguages();

  /**
   * Returns the value of the '<em><b>Casts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.lexicalCastDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Casts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Casts</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getbasicType_Casts()
   * @model containment="true"
   * @generated
   */
  EList<lexicalCastDecl> getCasts();

} // basicType
