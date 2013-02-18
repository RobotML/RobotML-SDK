/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A protocol state machine is always defined in the context of a classifier. It specifies which operations of the classifier can be called in which state and under which condition, thus specifying the allowed call sequences on the classifier's operations. A protocol state machine presents the possible and permitted transitions on the instances of its context classifier, together with the operations which carry the transitions. In this manner, an instance lifecycle can be created for a classifier, by specifying the order in which the operations can be activated and the states through which an instance progresses during its existence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ProtocolStateMachine#getConformance <em>Conformance</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getProtocolStateMachine()
 * @model
 * @generated
 */
public interface ProtocolStateMachine extends StateMachine {
	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference list.
	 * The list contents are of type {@link uml.ProtocolConformance}.
	 * It is bidirectional and its opposite is '{@link uml.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conformance between protocol state machines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference list.
	 * @see uml.UmlPackage#getProtocolStateMachine_Conformance()
	 * @see uml.ProtocolConformance#getSpecificMachine
	 * @model opposite="specificMachine" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProtocolConformance> getConformance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The states of a protocol state machine cannot have entry, exit, or do activity actions.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies\n(v.entry->isEmpty() and v.exit->isEmpty() and v.doActivity->isEmpty())))\n'"
	 * @generated
	 */
	boolean entryExitDo(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All transitions of a protocol state machine must be protocol transitions. (transitions as extended by the ProtocolStateMachines package)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))'"
	 * @generated
	 */
	boolean protocolTransitions(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Protocol state machines cannot have deep or shallow history pseudostates.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Psuedostate) implies\n((v.kind <> #deepHistory) and (v.kind <> #shallowHistory)))))\n'"
	 * @generated
	 */
	boolean deepOrShallowHistory(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If two ports are connected, then the protocol state machine of the required interface (if defined) must be conformant to the protocol state machine of the provided interface (if defined).
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean portsConnected(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ProtocolStateMachine
