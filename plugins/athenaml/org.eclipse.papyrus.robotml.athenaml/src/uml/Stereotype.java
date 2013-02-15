/**
 */
package uml;

import ecore.EClass;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Stereotype#getIcon <em>Icon</em>}</li>
 *   <li>{@link uml.Stereotype#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype extends uml.Class {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype can change the graphical appearance of the extended model element by using attached icons. When this association is not null, it references the location of the icon content to be displayed within diagrams presenting the extended model elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see uml.UmlPackage#getStereotype_Icon()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Image> getIcon();

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The profile that directly or indirectly contains this stereotype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see uml.UmlPackage#getStereotype_Profile()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where a stereotype’s property is an association end for an association other than a kind of extension, and the other end is not a stereotype, the other end must be owned by the association itself.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='ownedAttribute\n->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))\n->forAll(opposite.owner = association)'"
	 * @generated
	 */
	boolean associationEndOwnership(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype names should not clash with keyword names for the extended model element.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean nameNotClash(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotypes may only participate in binary associations.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='ownedAttribute.association->forAll(memberEnd->size()=2)'"
	 * @generated
	 */
	boolean binaryAssociationsOnly(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Stereotype may only generalize or specialize another Stereotype.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='generalization.general->forAll(e |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype)) '"
	 * @generated
	 */
	boolean generalize(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (required) extension of the specified metaclass with this stereotype.
	 * @param metaclass The metaclass for the new extension.
	 * @param isRequired Whether the new extension should be required.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" metaclassRequired="true" metaclassOrdered="false" isRequiredDataType="types.Boolean" isRequiredRequired="true" isRequiredOrdered="false"
	 * @generated
	 */
	Extension createExtension(uml.Class metaclass, boolean isRequired);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an icon with the specified location for this stereotype.
	 * @param location The location for the new icon.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" locationDataType="types.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	Image createIcon(String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an icon with the specified format and content for this stereotype.
	 * @param format The format for the new icon.
	 * @param content The content for the new icon.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" formatDataType="types.String" formatRequired="true" formatOrdered="false" contentDataType="types.String" contentRequired="true" contentOrdered="false"
	 * @generated
	 */
	Image createIcon(String format, String content);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the metaclasses extended by this stereotype, including the metaclasses extended by its superstereotypes.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<uml.Class> getAllExtendedMetaclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the current definition (Ecore representation) of this stereotype.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the metaclasses extended by this stereotype.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<uml.Class> getExtendedMetaclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the localized keyword for this stereotype.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getKeyword();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the keyword for this stereotype, localized if indicated.
	 * @param localize Whether to localize the keyword.
	 * <!-- end-model-doc -->
	 * @model dataType="types.String" required="true" ordered="false" localizeDataType="types.Boolean" localizeRequired="true" localizeOrdered="false"
	 * @generated
	 */
	String getKeyword(boolean localize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile returns the closest profile directly or indirectly containing this stereotype.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = self.namespace.oclAsType(Package).containingProfile()'"
	 * @generated
	 */
	Profile containingProfile();

} // Stereotype