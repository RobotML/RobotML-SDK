/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>transition Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.athenaDSL.transitionDeclaration#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.transitionDeclaration#getTo <em>To</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.transitionDeclaration#getEvt <em>Evt</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.transitionDeclaration#isRaise <em>Raise</em>}</li>
 *   <li>{@link org.xtext.athenaDSL.transitionDeclaration#getSig <em>Sig</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.athenaDSL.AthenaDSLPackage#gettransitionDeclaration()
 * @model
 * @generated
 */
public interface transitionDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#gettransitionDeclaration_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.transitionDeclaration#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#gettransitionDeclaration_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.transitionDeclaration#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

  /**
   * Returns the value of the '<em><b>Evt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evt</em>' attribute.
   * @see #setEvt(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#gettransitionDeclaration_Evt()
   * @model
   * @generated
   */
  String getEvt();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.transitionDeclaration#getEvt <em>Evt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evt</em>' attribute.
   * @see #getEvt()
   * @generated
   */
  void setEvt(String value);

  /**
   * Returns the value of the '<em><b>Raise</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raise</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raise</em>' attribute.
   * @see #setRaise(boolean)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#gettransitionDeclaration_Raise()
   * @model
   * @generated
   */
  boolean isRaise();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.transitionDeclaration#isRaise <em>Raise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Raise</em>' attribute.
   * @see #isRaise()
   * @generated
   */
  void setRaise(boolean value);

  /**
   * Returns the value of the '<em><b>Sig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig</em>' attribute.
   * @see #setSig(String)
   * @see org.xtext.athenaDSL.AthenaDSLPackage#gettransitionDeclaration_Sig()
   * @model
   * @generated
   */
  String getSig();

  /**
   * Sets the value of the '{@link org.xtext.athenaDSL.transitionDeclaration#getSig <em>Sig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig</em>' attribute.
   * @see #getSig()
   * @generated
   */
  void setSig(String value);

} // transitionDeclaration
