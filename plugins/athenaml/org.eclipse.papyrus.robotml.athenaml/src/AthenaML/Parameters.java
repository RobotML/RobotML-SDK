/**
 */
package AthenaML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AthenaML.Parameters#getBaseClass <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see AthenaML.AthenaMLPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBaseClass(uml.Class)
	 * @see AthenaML.AthenaMLPackage#getParameters_BaseClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	uml.Class getBaseClass();

	/**
	 * Sets the value of the '{@link AthenaML.Parameters#getBaseClass <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(uml.Class value);

} // Parameters
