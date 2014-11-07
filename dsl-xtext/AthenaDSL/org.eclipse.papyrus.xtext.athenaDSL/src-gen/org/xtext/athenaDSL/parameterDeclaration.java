/**
 */
package org.xtext.athenaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#isHasNbW <em>Has Nb W</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#getNbw <em>Nbw</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#isHasInfiniteWriter <em>Has Infinite Writer</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#isHasValue <em>Has Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#isHasConfig <em>Has Config</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.parameterDeclaration#isHasConfigWithDefaultValue <em>Has Config With Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration()
 * @model
 * @generated
 */
public interface parameterDeclaration extends architectureElement
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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_TypeName()
   * @model
   * @generated
   */
  DataType getTypeName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#getTypeName <em>Type Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(DataType value);

  /**
   * Returns the value of the '<em><b>Has Nb W</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Nb W</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Nb W</em>' attribute.
   * @see #setHasNbW(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_HasNbW()
   * @model
   * @generated
   */
  boolean isHasNbW();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#isHasNbW <em>Has Nb W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Nb W</em>' attribute.
   * @see #isHasNbW()
   * @generated
   */
  void setHasNbW(boolean value);

  /**
   * Returns the value of the '<em><b>Nbw</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nbw</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nbw</em>' attribute.
   * @see #setNbw(int)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_Nbw()
   * @model
   * @generated
   */
  int getNbw();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#getNbw <em>Nbw</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nbw</em>' attribute.
   * @see #getNbw()
   * @generated
   */
  void setNbw(int value);

  /**
   * Returns the value of the '<em><b>Has Infinite Writer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Infinite Writer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Infinite Writer</em>' attribute.
   * @see #setHasInfiniteWriter(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_HasInfiniteWriter()
   * @model
   * @generated
   */
  boolean isHasInfiniteWriter();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#isHasInfiniteWriter <em>Has Infinite Writer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Infinite Writer</em>' attribute.
   * @see #isHasInfiniteWriter()
   * @generated
   */
  void setHasInfiniteWriter(boolean value);

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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_HasValue()
   * @model
   * @generated
   */
  boolean isHasValue();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#isHasValue <em>Has Value</em>}' attribute.
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
   * @see #setValue(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Has Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Config</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Config</em>' attribute.
   * @see #setHasConfig(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_HasConfig()
   * @model
   * @generated
   */
  boolean isHasConfig();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#isHasConfig <em>Has Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Config</em>' attribute.
   * @see #isHasConfig()
   * @generated
   */
  void setHasConfig(boolean value);

  /**
   * Returns the value of the '<em><b>Has Config With Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Config With Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Config With Default Value</em>' attribute.
   * @see #setHasConfigWithDefaultValue(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getparameterDeclaration_HasConfigWithDefaultValue()
   * @model
   * @generated
   */
  boolean isHasConfigWithDefaultValue();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.parameterDeclaration#isHasConfigWithDefaultValue <em>Has Config With Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Config With Default Value</em>' attribute.
   * @see #isHasConfigWithDefaultValue()
   * @generated
   */
  void setHasConfigWithDefaultValue(boolean value);

} // parameterDeclaration
