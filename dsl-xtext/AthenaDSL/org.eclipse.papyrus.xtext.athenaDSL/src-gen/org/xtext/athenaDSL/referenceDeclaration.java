/**
 */
package org.xtext.athenaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>reference Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.referenceDeclaration#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.referenceDeclaration#isUpway <em>Upway</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.referenceDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.referenceDeclaration#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getreferenceDeclaration()
 * @model
 * @generated
 */
public interface referenceDeclaration extends architectureElement
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
   * @see #setTypeName(DataType)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getreferenceDeclaration_TypeName()
   * @model
   * @generated
   */
  DataType getTypeName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.referenceDeclaration#getTypeName <em>Type Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(DataType value);

  /**
   * Returns the value of the '<em><b>Upway</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upway</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upway</em>' attribute.
   * @see #setUpway(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getreferenceDeclaration_Upway()
   * @model
   * @generated
   */
  boolean isUpway();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.referenceDeclaration#isUpway <em>Upway</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upway</em>' attribute.
   * @see #isUpway()
   * @generated
   */
  void setUpway(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(qualifiedName)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getreferenceDeclaration_Name()
   * @model containment="true"
   * @generated
   */
  qualifiedName getName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.referenceDeclaration#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(qualifiedName value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getreferenceDeclaration_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.referenceDeclaration#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

} // referenceDeclaration
