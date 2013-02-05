/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StructuralFeatureAction is an abstract class for all structural feature actions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.StructuralFeatureAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getStructuralFeatureAction()
 * @model abstract="true"
 * @generated
 */
public interface StructuralFeatureAction extends Action {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives the input pin from which the object whose structural feature is to be read or written is obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.UmlPackage#getStructuralFeatureAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.StructuralFeatureAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural feature to be read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Feature</em>' reference.
	 * @see #setStructuralFeature(StructuralFeature)
	 * @see uml.UmlPackage#getStructuralFeatureAction_StructuralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getStructuralFeature();

	/**
	 * Sets the value of the '{@link uml.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Feature</em>' reference.
	 * @see #getStructuralFeature()
	 * @generated
	 */
	void setStructuralFeature(StructuralFeature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visibility of structural feature must allow access to the object performing the action.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let host : Classifier = self.context in\nself.structuralFeature.visibility = #public\nor host = self.structuralFeature.featuringClassifier.type\nor (self.structuralFeature.visibility = #protected and host.allSupertypes\n->includes(self.structuralFeature.featuringClassifier.type)))\n'"
	 * @generated
	 */
	boolean visibility(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object input pin must be 1..1.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.object.lowerBound()=1 and self.object.upperBound()=1'"
	 * @generated
	 */
	boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structural feature must not be static.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.structuralFeature.isStatic = #false'"
	 * @generated
	 */
	boolean notStatic(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structural feature has exactly one featuringClassifier.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.structuralFeature.featuringClassifier->size() = 1'"
	 * @generated
	 */
	boolean oneFeaturingClassifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structural feature must either be owned by the type of the object input pin, or it must be an owned end of a binary association with the type of the opposite end being the type of the object input pin.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.structuralFeature.featuringClassifier.oclAsType(Type)->includes(self.object.type) or\n\tself.structuralFeature.oclAsType(Property).opposite.type = self.object.type'"
	 * @generated
	 */
	boolean sameType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StructuralFeatureAction
