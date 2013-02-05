/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A model element that has both association and class properties. An AssociationClass can be seen as an association that also has class properties, or as a class that also has association properties. It not only connects a set of classifiers but also defines a set of features that belong to the relationship itself and not to any of the classifiers.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getAssociationClass()
 * @model
 * @generated
 */
public interface AssociationClass extends uml.Class, Association {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owned attributes and owned ends of an AssociationClass are disjoint
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='ownedAttribute->intersection(ownedEnd)->isEmpty()'"
	 * @generated
	 */
	boolean disjointAttributesEnds(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AssociationClass cannot be defined between itself and something else.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.endType->excludes(self) and self.endType>collect(et|et.allparents()->excludes(self))'"
	 * @generated
	 */
	boolean cannotBeDefined(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AssociationClass
