/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An input pin is a pin that holds input values to be consumed by an action.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getInputPin()
 * @model
 * @generated
 */
public interface InputPin extends Pin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input pins may have outgoing edges only when they are on actions that are structured nodes, and these edges must target a node contained by the structured node.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean outgoingEdgesStructuredOnly(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InputPin
