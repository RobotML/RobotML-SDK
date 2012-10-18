/**
 */
package org.xtext.athenaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>instance Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.instanceDeclaration#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.instanceDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getinstanceDeclaration()
 * @model
 * @generated
 */
public interface instanceDeclaration extends architectureElement
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' reference.
   * @see #setTypeName(prototypeDeclaration)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinstanceDeclaration_TypeName()
   * @model
   * @generated
   */
  prototypeDeclaration getTypeName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.instanceDeclaration#getTypeName <em>Type Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(prototypeDeclaration value);

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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinstanceDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.instanceDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // instanceDeclaration
