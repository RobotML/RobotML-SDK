/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conditional node is a structured activity node that represents an exclusive choice among some number of alternatives.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ConditionalNode#getClause <em>Clause</em>}</li>
 *   <li>{@link uml.ConditionalNode#isIsAssured <em>Is Assured</em>}</li>
 *   <li>{@link uml.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link uml.ConditionalNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of clauses composing the conditional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see uml.UmlPackage#getConditionalNode_Clause()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Clause> getClause();

	/**
	 * Returns the value of the '<em><b>Is Assured</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the modeler asserts that at least one test will succeed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Assured</em>' attribute.
	 * @see #setIsAssured(boolean)
	 * @see uml.UmlPackage#getConditionalNode_IsAssured()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAssured();

	/**
	 * Sets the value of the '{@link uml.ConditionalNode#isIsAssured <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assured</em>' attribute.
	 * @see #isIsAssured()
	 * @generated
	 */
	void setIsAssured(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Determinate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the modeler asserts that at most one test will succeed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Determinate</em>' attribute.
	 * @see #setIsDeterminate(boolean)
	 * @see uml.UmlPackage#getConditionalNode_IsDeterminate()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDeterminate();

	/**
	 * Sets the value of the '{@link uml.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Determinate</em>' attribute.
	 * @see #isIsDeterminate()
	 * @generated
	 */
	void setIsDeterminate(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of output pins that constitute the data flow outputs of the conditional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see uml.UmlPackage#getConditionalNode_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The union of the ExecutabledNodes in the test and body parts of all clauses must be the same as the subset of nodes contained in the ConditionalNode (considered as a StructuredActivityNode) that are ExecutableNodes.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean executableNodes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No two clauses within a ConditionalNode maybe predecessor clauses of each other, either directly or indirectly.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean clauseNoPredecessor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each clause of a conditional node must have the same number of bodyOutput pins as the conditional node has result output pins, and each clause bodyOutput pin must be compatible with the corresponding result pin (by positional order) in type, multiplicity, ordering and uniqueness.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean matchingOutputPins(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No ExecutableNode may appear in the test or body part of more than one clause of a conditional node.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean oneClauseWithExecutableNode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result output pins have no incoming edges.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean resultNoIncoming(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A conditional node has no input pins.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean noInputPins(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ConditionalNode
