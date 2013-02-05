/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Property represents a declared state of one or more instances in terms of a named relationship to a value or values. When a property is an attribute of a classifier, the value or values are related to the instance of the classifier by being held in slots of the instance. When a property is an association end, the value or values are related to the instance or instances at the other end(s) of the association. The range of valid values represented by the property can be controlled by setting the property's type.
 * A property is a structural feature of a classifier that characterizes instances of the classifier. A property related by ownedAttribute to a classifier (other than an association) represents an attribute and might also represent an association end. It relates an instance of the class to a value or set of values of the type of the attribute. A property related by memberEnd or its specializations to an association represents an end of the association. The type of the property is the type of the end of the association.
 * A property has the capability of being a deployment target in a deployment relationship. This enables modeling the deployment to hierarchical nodes that have properties functioning as internal parts.
 * Property specializes ParameterableElement to specify that a property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
 * A property represents a set of instances that are owned by a containing classifier instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Property#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml.Property#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link uml.Property#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link uml.Property#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml.Property#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.Property#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml.Property#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.Property#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.Property#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link uml.Property#isIsId <em>Is Id</em>}</li>
 *   <li>{@link uml.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uml.Property#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link uml.Property#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link uml.Property#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link uml.Property#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends StructuralFeature, ConnectableElement, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Interface#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Interface that owns the Property
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see uml.UmlPackage#getProperty_Interface()
	 * @see uml.Interface#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link uml.Property#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link uml.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the kind of aggregation that applies to the Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see uml.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see uml.UmlPackage#getProperty_Aggregation()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link uml.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see uml.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Property#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the optional association end that owns a qualifier attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association End</em>' container reference.
	 * @see #setAssociationEnd(Property)
	 * @see uml.UmlPackage#getProperty_AssociationEnd()
	 * @see uml.Property#getQualifier
	 * @model opposite="qualifier" transient="false" ordered="false"
	 * @generated
	 */
	Property getAssociationEnd();

	/**
	 * Sets the value of the '{@link uml.Property#getAssociationEnd <em>Association End</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End</em>' container reference.
	 * @see #getAssociationEnd()
	 * @generated
	 */
	void setAssociationEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Property}.
	 * It is bidirectional and its opposite is '{@link uml.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional list of ordered qualifier attributes for the end. If the list is empty, then the Association is not qualified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see uml.UmlPackage#getProperty_Qualifier()
	 * @see uml.Property#getAssociationEnd
	 * @model opposite="associationEnd" containment="true"
	 * @generated
	 */
	EList<Property> getQualifier();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Class that owns the Property.
	 * References the Class that owns the Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see uml.UmlPackage#getProperty_Class()
	 * @model transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	uml.Class getClass_();

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.DataType#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataType that owns this Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see uml.UmlPackage#getProperty_Datatype()
	 * @see uml.DataType#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link uml.Property#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a String that represents a value to be used when no argument is supplied for the Property.
	 * A String that is evaluated to give a default value for the Property when an object of the owning Classifier is instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #setDefault(String)
	 * @see uml.UmlPackage#getProperty_Default()
	 * @model unsettable="true" dataType="types.String" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link uml.Property#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Unsets the value of the '{@link uml.Property#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefault()
	 * @see #getDefault()
	 * @see #setDefault(String)
	 * @generated
	 */
	void unsetDefault();

	/**
	 * Returns whether the value of the '{@link uml.Property#getDefault <em>Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default</em>' attribute is set.
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @see #setDefault(String)
	 * @generated
	 */
	boolean isSetDefault();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification that is evaluated to give a default value for the Property when an object of the owning Classifier is instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see uml.UmlPackage#getProperty_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link uml.Property#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isComposite is true, the object containing the attribute is a container for the object or value contained in the attribute.
	 * This is a derived value, indicating whether the aggregation of the Property is composite or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see uml.UmlPackage#getProperty_IsComposite()
	 * @model default="false" dataType="types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link uml.Property#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isDerived is true, the value of the attribute is derived from information elsewhere.
	 * Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see uml.UmlPackage#getProperty_IsDerived()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link uml.Property#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the property is derived as the union of all of the properties that are constrained to subset it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(boolean)
	 * @see uml.UmlPackage#getProperty_IsDerivedUnion()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerivedUnion();

	/**
	 * Sets the value of the '{@link uml.Property#isIsDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #isIsDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Id</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates this property can be used to uniquely identify an instance of the containing Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Id</em>' attribute.
	 * @see #setIsId(boolean)
	 * @see uml.UmlPackage#getProperty_IsId()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsId();

	/**
	 * Sets the value of the '{@link uml.Property#isIsId <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Id</em>' attribute.
	 * @see #isIsId()
	 * @generated
	 */
	void setIsId(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case where the property is one navigable end of a binary association with both ends navigable, this gives the other end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see uml.UmlPackage#getProperty_Opposite()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link uml.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Association#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the owning association of this property, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Association</em>' container reference.
	 * @see #setOwningAssociation(Association)
	 * @see uml.UmlPackage#getProperty_OwningAssociation()
	 * @see uml.Association#getOwnedEnd
	 * @model opposite="ownedEnd" transient="false" ordered="false"
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link uml.Property#getOwningAssociation <em>Owning Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' container reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' reference list.
	 * The list contents are of type {@link uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties that are redefined by this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Property</em>' reference list.
	 * @see uml.UmlPackage#getProperty_RedefinedProperty()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getRedefinedProperty();

	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' reference list.
	 * The list contents are of type {@link uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties of which this property is constrained to be a subset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' reference list.
	 * @see uml.UmlPackage#getProperty_SubsettedProperty()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getSubsettedProperty();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.Association#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the association of which this property is a member, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uml.UmlPackage#getProperty_Association()
	 * @see uml.Association#getMemberEnd
	 * @model opposite="memberEnd" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uml.Property#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property may not subset a property with the same name.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean subsettedPropertyNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subsetting property may strengthen the type of the subsetted property, and its upper bound may be less.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subsettedProperty->forAll(sp |\n  self.type.conformsTo(sp.type) and\n    ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies\n      self.upperBound()<=sp.upperBound() ))'"
	 * @generated
	 */
	boolean subsettingRules(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A multiplicity on an aggregate end of a composite aggregation must not have an upper bound greater than 1.
	 * A multiplicity of a composite aggregation must not have an upper bound greater than 1.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)'"
	 * @generated
	 */
	boolean multiplicityOfComposite(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binding of a property template parameter representing an attribute must be to an attribute.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(isAttribute(self) and (templateParameterSubstitution->notEmpty())\n  implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal)))'"
	 * @generated
	 */
	boolean bindingToAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A redefined property must be inherited from a more general classifier containing the redefining property.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if (redefinedProperty->notEmpty()) then\n  (redefinitionContext->notEmpty() and\n      redefinedProperty->forAll(rp|\n        ((redefinitionContext->collect(fc|\n          fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp))'"
	 * @generated
	 */
	boolean redefinedPropertyInherited(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsetting may only occur when the context of the subsetting property conforms to the context of the subsetted property.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subsettedProperty->notEmpty() implies\n  (self.subsettingContext()->notEmpty() and self.subsettingContext()->forAll (sc |\n    self.subsettedProperty->forAll(sp |\n      sp.subsettingContext()->exists(c | sc.conformsTo(c)))))'"
	 * @generated
	 */
	boolean subsettingContextConforms(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Property can be a DeploymentTarget if it is a kind of Node and functions as a part in the internal structure of an encompassing Node.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean deploymentTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is derived.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDerivedUnion implies isDerived'"
	 * @generated
	 */
	boolean derivedUnionIsDerived(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is read only.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDerivedUnion implies isReadOnly'"
	 * @generated
	 */
	boolean derivedUnionIsReadOnly(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the other end of the (binary) association in which this property is a member end.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Property getOtherEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified Boolean value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="types.Boolean" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setBooleanDefaultValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified integer value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="types.Integer" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setIntegerDefaultValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the navigability of this property as indicated.
	 * @param isNavigable The new navigability.
	 * <!-- end-model-doc -->
	 * @model isNavigableDataType="types.Boolean" isNavigableRequired="true" isNavigableOrdered="false"
	 * @generated
	 */
	void setIsNavigable(boolean isNavigable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the null value.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setNullDefaultValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified real value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="types.Real" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setRealDefaultValue(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified string value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="types.String" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setStringDefaultValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default value for this property to the specified unlimited natural value.
	 * @param value The new default value.
	 * <!-- end-model-doc -->
	 * @model valueDataType="types.UnlimitedNatural" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setUnlimitedNaturalDefaultValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isAttribute() is true if the Property is defined as an attribute of some classifier.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" pRequired="true" pOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = Classifier.allInstances->exists(c | c.attribute->includes(p))'"
	 * @generated
	 */
	boolean isAttribute(Property p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of isComposite is true only if aggregation is composite.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (self.aggregation = #composite)'"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNavigable() indicates whether it is possible to navigate across the property.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = not classifier->isEmpty() or association.owningAssociation.navigableOwnedEnd->includes(self)'"
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query subsettingContext() gives the context for subsetting a property. It consists, in the case of an attribute, of the corresponding classifier, and in the case of an association end, all of the classifiers at the other ends.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if association->notEmpty()\nthen association.endType-type\nelse if classifier->notEmpty() then Set{classifier} else Set{} endif\nendif'"
	 * @generated
	 */
	EList<Type> subsettingContext();

} // Property
