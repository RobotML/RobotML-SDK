/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An enumeration literal is a user-defined data value for an enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends InstanceSpecification {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Enumeration that this EnumerationLiteral is a member of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(Enumeration)
	 * @see uml.UmlPackage#getEnumerationLiteral_Enumeration()
	 * @see uml.Enumeration#getOwnedLiteral
	 * @model opposite="ownedLiteral" transient="false" ordered="false"
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link uml.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='classifier = enumeration'"
	 * @generated
	 */
	boolean classifierEqualsOwningEnumeration(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EnumerationLiteral
