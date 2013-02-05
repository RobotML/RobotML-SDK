/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An actor specifies a role played by a user or any other system that interacts with the subject.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends BehavioredClassifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An actor can only have associations to use cases, components and classes. Furthermore these associations must be binary.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.ownedAttribute->forAll ( a |\n(a.association->notEmpty()) implies\n((a.association.memberEnd.size() = 2) and\n(a.opposite.class.oclIsKindOf(UseCase) or\n(a.opposite.class.oclIsKindOf(Class) and not a.opposite.class.oclIsKindOf(Behavior))))\n'"
	 * @generated
	 */
	boolean associations(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An actor must have a name.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='name->notEmpty()'"
	 * @generated
	 */
	boolean mustHaveName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Actor
