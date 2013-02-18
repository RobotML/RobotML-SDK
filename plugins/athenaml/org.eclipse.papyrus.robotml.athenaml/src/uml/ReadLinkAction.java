/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A read link action is a link action that navigates across associations to retrieve objects on one end.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ReadLinkAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getReadLinkAction()
 * @model
 * @generated
 */
public interface ReadLinkAction extends LinkAction {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pin on which are put the objects participating in the association at the end not specified by the inputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.UmlPackage#getReadLinkAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.ReadLinkAction#getResult <em>Result</em>}' containment reference.
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
	 * The type and ordering of the result output pin are same as the type and ordering of the open association end.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let openend : Property = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in\nself.result.type = openend.type\nand self.result.ordering = openend.ordering\n'"
	 * @generated
	 */
	boolean typeAndOrdering(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly one link-end data specification (the 'open' end) must not have an end object input pin.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.endData->select(ed | ed.value->size() = 0)->size() = 1'"
	 * @generated
	 */
	boolean oneOpenEnd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the open association end must be compatible with the multiplicity of the result output pin.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let openend : Property = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in\nopenend.multiplicity.compatibleWith(self.result.multiplicity)\n'"
	 * @generated
	 */
	boolean compatibleMultiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The open end must be navigable.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let openend : Property = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in\nopenend.isNavigable()\n'"
	 * @generated
	 */
	boolean navigableOpenEnd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visibility of the open end must allow access to the object performing the action.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let host : Classifier = self.context in\nlet openend : Property = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in\nopenend.visibility = #public\nor self.endData->exists(oed | not oed.end = openend\nand (host = oed.end.participant\nor (openend.visibility = #protected\nand host.allSupertypes->includes(oed.end.participant))))\n'"
	 * @generated
	 */
	boolean visibility(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReadLinkAction
