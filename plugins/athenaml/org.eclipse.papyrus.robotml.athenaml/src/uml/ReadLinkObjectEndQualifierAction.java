/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Link Object End Qualifier Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A read link object end qualifier action is an action that retrieves a qualifier end value from a link object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getReadLinkObjectEndQualifierAction()
 * @model
 * @generated
 */
public interface ReadLinkObjectEndQualifierAction extends Action {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the input pin from which the link object is obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.UmlPackage#getReadLinkObjectEndQualifierAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute representing the qualifier to be read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(Property)
	 * @see uml.UmlPackage#getReadLinkObjectEndQualifierAction_Qualifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getQualifier();

	/**
	 * Sets the value of the '{@link uml.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Property value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pin where the result value is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.UmlPackage#getReadLinkObjectEndQualifierAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object input pin is the association class that owns the association end that has the given qualifier attribute.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.object.type = self.qualifier.associationEnd.association'"
	 * @generated
	 */
	boolean typeOfObject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the result output pin is 1..1.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.result.multiplicity.is(1,1)'"
	 * @generated
	 */
	boolean multiplicityOfResult(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result output pin is the same as the type of the qualifier attribute.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.result.type = self.qualifier.type'"
	 * @generated
	 */
	boolean sameType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ends of the association must not be static.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.qualifier.associationEnd.association.memberEnd->forall(e | not e.isStatic)'"
	 * @generated
	 */
	boolean endsOfAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the qualifier attribute is 1..1.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.qualifier.multiplicity.is(1,1)'"
	 * @generated
	 */
	boolean multiplicityOfQualifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object input pin is 1..1.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.object.multiplicity.is(1,1)'"
	 * @generated
	 */
	boolean multiplicityOfObject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association of the association end of the qualifier attribute must be an association class.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.qualifier.associationEnd.association.oclIsKindOf(AssociationClass)'"
	 * @generated
	 */
	boolean associationOfAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifier attribute must be a qualifier attribute of an association end.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.qualifier.associationEnd->size() = 1'"
	 * @generated
	 */
	boolean qualifierAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReadLinkObjectEndQualifierAction
