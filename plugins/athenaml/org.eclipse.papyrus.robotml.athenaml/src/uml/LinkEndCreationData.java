/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link end creation data is not an action. It is an element that identifies links. It identifies one end of a link to be created by a create link action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.LinkEndCreationData#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link uml.LinkEndCreationData#isIsReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getLinkEndCreationData()
 * @model
 * @generated
 */
public interface LinkEndCreationData extends LinkEndData {
	/**
	 * Returns the value of the '<em><b>Insert At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies where the new link should be inserted for ordered association ends, or where an existing link should be moved to. The type of the input is UnlimitedNatural, but the input cannot be zero. This pin is omitted for association ends that are not ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert At</em>' reference.
	 * @see #setInsertAt(InputPin)
	 * @see uml.UmlPackage#getLinkEndCreationData_InsertAt()
	 * @model ordered="false"
	 * @generated
	 */
	InputPin getInsertAt();

	/**
	 * Sets the value of the '{@link uml.LinkEndCreationData#getInsertAt <em>Insert At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert At</em>' reference.
	 * @see #getInsertAt()
	 * @generated
	 */
	void setInsertAt(InputPin value);

	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the existing links emanating from the object on this end should be destroyed before creating a new link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(boolean)
	 * @see uml.UmlPackage#getLinkEndCreationData_IsReplaceAll()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReplaceAll();

	/**
	 * Sets the value of the '{@link uml.LinkEndCreationData#isIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #isIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkEndCreationData can only be end data for CreateLinkAction or one of its specializations.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.LinkAction.oclIsKindOf(CreateLinkAction)'"
	 * @generated
	 */
	boolean createLinkAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link end creation data for ordered association ends must have a single input pin for the insertion point with type UnlimitedNatural and multiplicity of 1..1, otherwise the action has no input pin for the insertion point.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let insertAtPins : Collection = self.insertAt in\nif self.end.ordering = #unordered\nthen insertAtPins->size() = 0\nelse let insertAtPin : InputPin = insertAts->asSequence()->first() in\ninsertAtPins->size() = 1\nand insertAtPin.type = UnlimitedNatural\nand insertAtPin.multiplicity.is(1,1))\nendif\n'"
	 * @generated
	 */
	boolean singleInputPin(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LinkEndCreationData
