/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An occurrence specification is the basic semantic unit of interactions. The sequences of occurrences specified by them are the meanings of interactions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.OccurrenceSpecification#getToAfter <em>To After</em>}</li>
 *   <li>{@link uml.OccurrenceSpecification#getToBefore <em>To Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOccurrenceSpecification()
 * @model
 * @generated
 */
public interface OccurrenceSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>To After</b></em>' reference list.
	 * The list contents are of type {@link uml.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link uml.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the GeneralOrderings that specify EventOcurrences that must occur after this OccurrenceSpecification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To After</em>' reference list.
	 * @see uml.UmlPackage#getOccurrenceSpecification_ToAfter()
	 * @see uml.GeneralOrdering#getBefore
	 * @model opposite="before" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getToAfter();

	/**
	 * Returns the value of the '<em><b>To Before</b></em>' reference list.
	 * The list contents are of type {@link uml.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link uml.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the GeneralOrderings that specify EventOcurrences that must occur before this OccurrenceSpecification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Before</em>' reference list.
	 * @see uml.UmlPackage#getOccurrenceSpecification_ToBefore()
	 * @see uml.GeneralOrdering#getAfter
	 * @model opposite="after" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getToBefore();

} // OccurrenceSpecification
