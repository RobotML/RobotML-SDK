/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A final node is an abstract control node at which a flow in an activity stops.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getFinalNode()
 * @model abstract="true"
 * @generated
 */
public interface FinalNode extends ControlNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A final node has no outgoing edges.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean noOutgoingEdges(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FinalNode
