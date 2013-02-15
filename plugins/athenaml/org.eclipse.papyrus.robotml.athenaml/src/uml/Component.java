/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In the namespace of a component, all model elements that are involved in or related to its definition are either owned or imported explicitly. This may include, for example, use cases and dependencies (e.g. mappings), packages, components, and artifacts.
 * A component represents a modular part of a system that encapsulates its contents and whose manifestation is replaceable within its environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link uml.Component#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.Component#getProvided <em>Provided</em>}</li>
 *   <li>{@link uml.Component#getRealization <em>Realization</em>}</li>
 *   <li>{@link uml.Component#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends uml.Class {
	/**
	 * Returns the value of the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isIndirectlyInstantiated : Boolean {default = true} The kind of instantiation that applies to a Component. If false, the component is instantiated as an addressable object. If true, the Component is defined at design-time, but at run-time (or execution-time) an object specified by the Component does not exist, that is, the component is instantiated indirectly, through the instantiation of its realizing classifiers or parts. Several standard stereotypes use this meta attribute (e.g., «specification», «focus», «subsystem»).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #setIsIndirectlyInstantiated(boolean)
	 * @see uml.UmlPackage#getComponent_IsIndirectlyInstantiated()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsIndirectlyInstantiated();

	/**
	 * Sets the value of the '{@link uml.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 */
	void setIsIndirectlyInstantiated(boolean value);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of PackageableElements that a Component owns. In the namespace of a component, all model elements that are involved in or related to its definition may be owned or imported explicitly. These may include e.g. Classes, Interfaces, Components, Packages, Use cases, Dependencies (e.g. mappings), and Artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see uml.UmlPackage#getComponent_PackagedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElement();

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interfaces that the component exposes to its environment. These interfaces may be Realized by the Component or any of its realizingClassifiers, or they may be the Interfaces that are provided by its public Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see uml.UmlPackage#getComponent_Provided()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getProvided();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link uml.ComponentRealization}.
	 * It is bidirectional and its opposite is '{@link uml.ComponentRealization#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Realizations owned by the Component. Realizations reference the Classifiers of which the Component is an abstraction; i.e., that realize its behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see uml.UmlPackage#getComponent_Realization()
	 * @see uml.ComponentRealization#getAbstraction
	 * @model opposite="abstraction" containment="true" ordered="false"
	 * @generated
	 */
	EList<ComponentRealization> getRealization();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interfaces that the component requires from other components in its environment in order to be able to offer its full set of provided functionality. These interfaces may be used by the Component or any of its realizingClassifiers, or they may be the Interfaces that are required by its public Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see uml.UmlPackage#getComponent_Required()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * component nested in a Class cannot have any packaged elements.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.class->isEmpty()) implies self.packagedElement->isEmpty()'"
	 * @generated
	 */
	boolean noPackagedElements(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component cannot nest classifiers.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nestedClassifier->isEmpty()'"
	 * @generated
	 */
	boolean noNestedClassifiers(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as a packaged element of this component.
	 * @param name The name for the new class, or null.
	 * @param isAbstract Whether the new class should be abstract.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="types.String" nameRequired="true" nameOrdered="false" isAbstractDataType="types.Boolean" isAbstractRequired="true" isAbstractOrdered="false"
	 * @generated
	 */
	uml.Class createOwnedClass(String name, boolean isAbstract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a enumeration with the specified name as a packaged element of this component.
	 * @param name The name for the new enumeration, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Enumeration createOwnedEnumeration(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an interface with the specified name as a packaged element of this component.
	 * @param name The name for the new interface, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Interface createOwnedInterface(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a primitive type with the specified name as a packaged element of this component.
	 * @param name The name for the new primitive type, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	PrimitiveType createOwnedPrimitiveType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of realized interfaces of a component.
	 * <!-- end-model-doc -->
	 * @model ordered="false" classifierRequired="true" classifierOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (classifier.clientDependency->\nselect(dependency|dependency.oclIsKindOf(Realization) and dependency.supplier.oclIsKindOf(Interface)))->\ncollect(dependency|dependency.client)'"
	 * @generated
	 */
	EList<Interface> realizedInterfaces(Classifier classifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of used interfaces of a component.
	 * <!-- end-model-doc -->
	 * @model ordered="false" classifierRequired="true" classifierOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (classifier.supplierDependency->\nselect(dependency|dependency.oclIsKindOf(Usage) and dependency.supplier.oclIsKindOf(interface)))->\ncollect(dependency|dependency.supplier)'"
	 * @generated
	 */
	EList<Interface> usedInterfaces(Classifier classifier);

} // Component