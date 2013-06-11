/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interaction Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.interactionDeclaration#isWwhen <em>Wwhen</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.interactionDeclaration#getStateset <em>Stateset</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.interactionDeclaration#getWstate <em>Wstate</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.interactionDeclaration#isIif <em>Iif</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.interactionDeclaration#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.interactionDeclaration#getIcalls <em>Icalls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionDeclaration()
 * @model
 * @generated
 */
public interface interactionDeclaration extends architectureElement
{
  /**
   * Returns the value of the '<em><b>Wwhen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wwhen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wwhen</em>' attribute.
   * @see #setWwhen(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionDeclaration_Wwhen()
   * @model
   * @generated
   */
  boolean isWwhen();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.interactionDeclaration#isWwhen <em>Wwhen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wwhen</em>' attribute.
   * @see #isWwhen()
   * @generated
   */
  void setWwhen(boolean value);

  /**
   * Returns the value of the '<em><b>Stateset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stateset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stateset</em>' attribute.
   * @see #setStateset(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionDeclaration_Stateset()
   * @model
   * @generated
   */
  String getStateset();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.interactionDeclaration#getStateset <em>Stateset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stateset</em>' attribute.
   * @see #getStateset()
   * @generated
   */
  void setStateset(String value);

  /**
   * Returns the value of the '<em><b>Wstate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wstate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wstate</em>' attribute.
   * @see #setWstate(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionDeclaration_Wstate()
   * @model
   * @generated
   */
  String getWstate();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.interactionDeclaration#getWstate <em>Wstate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wstate</em>' attribute.
   * @see #getWstate()
   * @generated
   */
  void setWstate(String value);

  /**
   * Returns the value of the '<em><b>Iif</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iif</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iif</em>' attribute.
   * @see #setIif(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionDeclaration_Iif()
   * @model
   * @generated
   */
  boolean isIif();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.interactionDeclaration#isIif <em>Iif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iif</em>' attribute.
   * @see #isIif()
   * @generated
   */
  void setIif(boolean value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionDeclaration_Event()
   * @model
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.interactionDeclaration#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

  /**
   * Returns the value of the '<em><b>Icalls</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.athenaDSL.interactionCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icalls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icalls</em>' containment reference list.
   * @see org.xtext.athenaDSL.AthenaDSLPackage#getinteractionDeclaration_Icalls()
   * @model containment="true"
   * @generated
   */
  EList<interactionCall> getIcalls();

} // interactionDeclaration
