/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinkAction is an abstract class for all link actions that identify their links by the objects at the ends of the links and by the qualifiers at ends of the links.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.LinkAction#getEndData <em>End Data</em>}</li>
 *   <li>{@link uml.LinkAction#getInputValue <em>Input Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getLinkAction()
 * @model abstract="true"
 * @generated
 */
public interface LinkAction extends Action {
	/**
	 * Returns the value of the '<em><b>End Data</b></em>' containment reference list.
	 * The list contents are of type {@link uml.LinkEndData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data identifying one end of a link by the objects on its ends and qualifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Data</em>' containment reference list.
	 * @see uml.UmlPackage#getLinkAction_EndData()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<LinkEndData> getEndData();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference list.
	 * The list contents are of type {@link uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pins taking end objects and qualifier values as input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference list.
	 * @see uml.UmlPackage#getLinkAction_InputValue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InputPin> getInputValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pins of the action are the same as the pins of the link end data and insertion pins.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.input->asSet() =\nlet ledpins : Set = self.endData->collect(value) in\nif self.oclIsKindOf(LinkEndCreationData)\nthen ledpins->union(self.endData.oclAsType(LinkEndCreationData).insertAt)\nelse ledpins\n'"
	 * @generated
	 */
	boolean samePins(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association ends of the link end data must all be from the same association and include all and only the association ends of that association.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.endData->collect(end) = self.association()->collect(connection))'"
	 * @generated
	 */
	boolean sameAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association ends of the link end data must not be static.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.endData->forall(end.oclisKindOf(NavigableEnd) implies end.isStatic = #false'"
	 * @generated
	 */
	boolean notStatic(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association operates on LinkAction. It returns the association of the action.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = self.endData->asSequence().first().end.association'"
	 * @generated
	 */
	Association association();

} // LinkAction
