/**
 */
package uml;

import ecore.EObject;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package can have one or more profile applications to indicate which profiles have been applied. Because a profile is a package, it is possible to apply a profile not only to packages, but also to profiles.
 * Package specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.
 * A package is used to group elements, and provides a namespace for the grouped elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Package#getUri <em>Uri</em>}</li>
 *   <li>{@link uml.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link uml.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link uml.Package#getOwnedStereotype <em>Owned Stereotype</em>}</li>
 *   <li>{@link uml.Package#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link uml.Package#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.Package#getProfileApplication <em>Profile Application</em>}</li>
 *   <li>{@link uml.Package#getOwnedType <em>Owned Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Namespace, PackageableElement, TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an identifier for the package that can be used for many purposes. A URI is the universally unique identification of the package following the IETF URI specification, RFC 2396 http://www.ietf.org/rfc/rfc2396.txt and it must comply with those syntax rules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see uml.UmlPackage#getPackage_Uri()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link uml.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
	 * The list contents are of type {@link uml.Package}.
	 * It is bidirectional and its opposite is '{@link uml.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Packages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see uml.UmlPackage#getPackage_NestedPackage()
	 * @see uml.Package#getNestingPackage
	 * @model opposite="nestingPackage" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Package that owns this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nesting Package</em>' reference.
	 * @see #setNestingPackage(Package)
	 * @see uml.UmlPackage#getPackage_NestingPackage()
	 * @see uml.Package#getNestedPackage
	 * @model opposite="nestedPackage" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link uml.Package#getNestingPackage <em>Nesting Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' reference list.
	 * The list contents are of type {@link uml.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Stereotypes that are owned by the Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' reference list.
	 * @see uml.UmlPackage#getPackage_OwnedStereotype()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Stereotype> getOwnedStereotype();

	/**
	 * Returns the value of the '<em><b>Package Merge</b></em>' containment reference list.
	 * The list contents are of type {@link uml.PackageMerge}.
	 * It is bidirectional and its opposite is '{@link uml.PackageMerge#getReceivingPackage <em>Receiving Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageMerges that are owned by this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Merge</em>' containment reference list.
	 * @see uml.UmlPackage#getPackage_PackageMerge()
	 * @see uml.PackageMerge#getReceivingPackage
	 * @model opposite="receivingPackage" containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageMerge> getPackageMerge();

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link uml.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the packageable elements that are owned by this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see uml.UmlPackage#getPackage_PackagedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElement();

	/**
	 * Returns the value of the '<em><b>Profile Application</b></em>' containment reference list.
	 * The list contents are of type {@link uml.ProfileApplication}.
	 * It is bidirectional and its opposite is '{@link uml.ProfileApplication#getApplyingPackage <em>Applying Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ProfileApplications that indicate which profiles have been applied to the Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile Application</em>' containment reference list.
	 * @see uml.UmlPackage#getPackage_ProfileApplication()
	 * @see uml.ProfileApplication#getApplyingPackage
	 * @model opposite="applyingPackage" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProfileApplication> getProfileApplication();

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
	 * The list contents are of type {@link uml.Type}.
	 * It is bidirectional and its opposite is '{@link uml.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see uml.UmlPackage#getPackage_OwnedType()
	 * @see uml.Type#getPackage
	 * @model opposite="package" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Type> getOwnedType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an element that is owned by a package has visibility, it is public or private.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.ownedElements->forAll(e | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)'"
	 * @generated
	 */
	boolean elementsPublicOrPrivate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the current definition of the specified profile to this package and automatically applies required stereotypes in the profile to elements within this package's namespace hieararchy. If a different definition is already applied, automatically migrates any associated stereotype values on a "best effort" basis (matching classifiers and structural features by name).
	 * @param profile The profile to apply.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	EList<EObject> applyProfile(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as an owned type of this package.
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
	 * Creates a enumeration with the specified name as an owned type of this package.
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
	 * Creates an interface with the specified name as an owned type of this package.
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
	 * Creates a primitive type with the specified name as an owned type of this package.
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
	 * Creates a(n) (abstract) stereotype with the specified name as an owned stereotype of this profile.
	 * @param name The name for the new stereotype, or null.
	 * @param isAbstract Whether the new stereotype should be abstract.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="types.String" nameRequired="true" nameOrdered="false" isAbstractDataType="types.Boolean" isAbstractRequired="true" isAbstractOrdered="false"
	 * @generated
	 */
	Stereotype createOwnedStereotype(String name, boolean isAbstract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profiles that are applied to this package, including profiles applied to its nesting package(s).
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Profile> getAllAppliedProfiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profile applications for this package, including profile applications for its nesting package(s).
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<ProfileApplication> getAllProfileApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package, or null if no such profile is applied.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * <!-- end-model-doc -->
	 * @model ordered="false" qualifiedNameDataType="types.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 * @generated
	 */
	Profile getAppliedProfile(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @model ordered="false" qualifiedNameDataType="types.String" qualifiedNameRequired="true" qualifiedNameOrdered="false" recurseDataType="types.Boolean" recurseRequired="true" recurseOrdered="false"
	 * @generated
	 */
	Profile getAppliedProfile(String qualifiedName, boolean recurse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profiles that are applied to this package.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Profile> getAppliedProfiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package, or null if no such profile is applied.
	 * @param profile The profile whose application to retrieve.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	ProfileApplication getProfileApplication(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param profile The profile whose application to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false" recurseDataType="types.Boolean" recurseRequired="true" recurseOrdered="false"
	 * @generated
	 */
	ProfileApplication getProfileApplication(Profile profile, boolean recurse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this package is a model library.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isModelLibrary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified profile is applied to this package.
	 * @param profile The profile in question.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	boolean isProfileApplied(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unapplies the specified profile from this package and automatically unapplies stereotypes in the profile from elements within this package's namespace hieararchy.
	 * @param profile The profile to unapply.
	 * <!-- end-model-doc -->
	 * @model ordered="false" profileRequired="true" profileOrdered="false"
	 * @generated
	 */
	EList<EObject> unapplyProfile(Profile profile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allApplicableStereotypes() returns all the directly or indirectly owned stereotypes, including stereotypes contained in sub-profiles.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = \nself.ownedStereotype->union(self.ownedMember->\n\tselect(oclIsKindOf(Package)).oclAsType(Package).allApplicableStereotypes()->flatten())->asSet()'"
	 * @generated
	 */
	EList<Stereotype> allApplicableStereotypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile() returns the closest profile directly or indirectly containing this package (or this package itself, if it is a profile).
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result =\nif self.oclIsKindOf(Profile) then \n\tself.oclAsType(Profile)\nelse\n\tself.namespace.oclAsType(Package).containingProfile()\nendif'"
	 * @generated
	 */
	Profile containingProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" elRequired="true" elOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (ownedMember->includes(el)) or\n(elementImport->select(ei|ei.importedElement = #public)->collect(ei|ei.importedElement)->includes(el)) or\n(packageImport->select(pi|pi.visibility = #public)->collect(pi|pi.importedPackage.member->includes(el))->notEmpty())'"
	 * @generated
	 */
	boolean makesVisible(NamedElement el);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query visibleMembers() defines which members of a Package can be accessed outside it.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = member->select( m | self.makesVisible(m))'"
	 * @generated
	 */
	EList<PackageableElement> visibleMembers();

} // Package
