/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction use refers to an interaction. The interaction use is a shorthand for copying the contents of the referenced interaction where the interaction use is. To be accurate the copying must take into account substituting parameters with arguments and connect the formal gates with the actual ones.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.InteractionUse#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link uml.InteractionUse#getArgument <em>Argument</em>}</li>
 *   <li>{@link uml.InteractionUse#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link uml.InteractionUse#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link uml.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInteractionUse()
 * @model
 * @generated
 */
public interface InteractionUse extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual gates of the InteractionUse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see uml.UmlPackage#getInteractionUse_ActualGate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getActualGate();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual arguments of the Interaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see uml.UmlPackage#getInteractionUse_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the Interaction that defines its meaning
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Interaction)
	 * @see uml.UmlPackage#getInteractionUse_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interaction getRefersTo();

	/**
	 * Sets the value of the '{@link uml.InteractionUse#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Interaction value);

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the executed Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(ValueSpecification)
	 * @see uml.UmlPackage#getInteractionUse_ReturnValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getReturnValue();

	/**
	 * Sets the value of the '{@link uml.InteractionUse#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Return Value Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recipient of the return value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value Recipient</em>' reference.
	 * @see #setReturnValueRecipient(Property)
	 * @see uml.UmlPackage#getInteractionUse_ReturnValueRecipient()
	 * @model ordered="false"
	 * @generated
	 */
	Property getReturnValueRecipient();

	/**
	 * Sets the value of the '{@link uml.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value Recipient</em>' reference.
	 * @see #getReturnValueRecipient()
	 * @generated
	 */
	void setReturnValueRecipient(Property value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InteractionUse must cover all Lifelines of the enclosing Interaction that represent the same properties as lifelines within the referred Interaction.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean allLifelines(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The returnValueRecipient must be a Property of a ConnectableElement that is represented by a Lifeline covered by this InteractionUse.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean returnValueRecipientCoverage(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments of the InteractionUse must correspond to parameters of the referred Interaction
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean argumentsCorrespondToParameters(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual Gates of the InteractionUse must match Formal Gates of the referred Interaction. Gates match when their names are equal.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean gatesMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments must only be constants, parameters of the enclosing Interaction or attributes of the classifier owning the enclosing Interaction.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean argumentsAreConstants(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the returnValue must correspond to the type of the returnValueRecipient.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean returnValueTypeRecipientCorrespondence(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InteractionUse
