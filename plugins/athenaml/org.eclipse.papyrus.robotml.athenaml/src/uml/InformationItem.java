/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An information item is an abstraction of all kinds of information that can be exchanged between objects. It is a kind of classifier intended for representing information in a very abstract way, one which cannot be instantiated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.InformationItem#getRepresented <em>Represented</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInformationItem()
 * @model
 * @generated
 */
public interface InformationItem extends Classifier {
	/**
	 * Returns the value of the '<em><b>Represented</b></em>' reference list.
	 * The list contents are of type {@link uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the classifiers that will specify the structure and nature of the information. An information item represents all its represented classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represented</em>' reference list.
	 * @see uml.UmlPackage#getInformationItem_Represented()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getRepresented();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An informationItem has no feature, no generalization, and no associations.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.generalization->isEmpty() and self.feature->isEmpty()'"
	 * @generated
	 */
	boolean hasNo(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is not instantiable.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isAbstract'"
	 * @generated
	 */
	boolean notInstantiable(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sources and targets of an information item (its related information flows) must designate subsets of the sources and targets of the representation information item, if any.The Classifiers that can realize an information item can only be of the following kind: Class, Interface, InformationItem, Signal, Component.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.represented->select(p | p->oclIsKindOf(InformationItem))->forAll(p |\n  p.informationFlow.source->forAll(q | self.informationFlow.source->include(q)) and\n    p.informationFlow.target->forAll(q | self.informationFlow.target->include(q)))) and\n      (self.represented->forAll(p | p->oclIsKindOf(Class) or oclIsKindOf(Interface) or\n        oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component)))'"
	 * @generated
	 */
	boolean sourcesAndTargets(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InformationItem
