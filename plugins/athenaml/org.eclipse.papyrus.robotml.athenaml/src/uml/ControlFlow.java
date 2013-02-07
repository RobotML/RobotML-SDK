/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A control flow is an edge that starts an activity node after the previous one is finished.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getControlFlow()
 * @model
 * @generated
 */
public interface ControlFlow extends ActivityEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control flows may not have object nodes at either end, except for object nodes with control type.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean objectNodes(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ControlFlow
