/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A multiplicity is a definition of an inclusive interval of non-negative integers beginning with a lower bound and ending with a (possibly infinite) upper bound. A multiplicity element embeds this information to specify the allowable cardinalities for an instantiation of this element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.MultiplicityElement#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.MultiplicityElement#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.MultiplicityElement#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getMultiplicityElement()
 * @model abstract="true"
 * @generated
 */
public interface MultiplicityElement extends Element {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are sequentially ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see uml.UmlPackage#getMultiplicityElement_IsOrdered()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link uml.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this element are unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see uml.UmlPackage#getMultiplicityElement_IsUnique()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link uml.MultiplicityElement#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the lower bound of the multiplicity interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see uml.UmlPackage#getMultiplicityElement_Lower()
	 * @model default="1" dataType="types.Integer" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link uml.MultiplicityElement#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification of the lower bound for this multiplicity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(ValueSpecification)
	 * @see uml.UmlPackage#getMultiplicityElement_LowerValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getLowerValue();

	/**
	 * Sets the value of the '{@link uml.MultiplicityElement#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the upper bound of the multiplicity interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see uml.UmlPackage#getMultiplicityElement_Upper()
	 * @model default="1" dataType="types.UnlimitedNatural" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link uml.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification of the upper bound for this multiplicity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(ValueSpecification)
	 * @see uml.UmlPackage#getMultiplicityElement_UpperValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getUpperValue();

	/**
	 * Sets the value of the '{@link uml.MultiplicityElement#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(ValueSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound must be a non-negative integer literal.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='lowerBound()->notEmpty() implies lowerBound() >= 0'"
	 * @generated
	 */
	boolean lowerGe0(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound must be greater than or equal to the lower bound.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()'"
	 * @generated
	 */
	boolean upperGeLower(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then that specification must be a constant expression.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean valueSpecificationConstant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a non-literal ValueSpecification is used for the lower or upper bound, then evaluating that specification must not have side effects.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean valueSpecificationNoSideEffects(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation compatibleWith takes another multiplicity as input. It checks if one multiplicity is compatible with another.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = Integer.allInstances()->forAll(i : Integer | self.includesCardinality(i) implies other.includesCardinality(i))'"
	 * @generated
	 */
	boolean compatibleWith(MultiplicityElement other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query includesCardinality() checks whether the specified cardinality is valid for this multiplicity.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" cDataType="types.Integer" cRequired="true" cOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (lowerBound() <= C) and (upperBound() >= C)'"
	 * @generated
	 */
	boolean includesCardinality(int c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query includesMultiplicity() checks whether this multiplicity includes all the cardinalities allowed by the specified multiplicity.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" mRequired="true" mOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())'"
	 * @generated
	 */
	boolean includesMultiplicity(MultiplicityElement m);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation is determines if the upper and lower bound of the ranges are the ones given.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" lowerboundDataType="types.Integer" lowerboundRequired="true" lowerboundOrdered="false" upperboundDataType="types.Integer" upperboundRequired="true" upperboundOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (lowerbound = self.lowerbound and upperbound = self.upperbound)'"
	 * @generated
	 */
	boolean is(int lowerbound, int upperbound);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isMultivalued() checks whether this multiplicity has an upper bound greater than one.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = upperBound() > 1'"
	 * @generated
	 */
	boolean isMultivalued();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query lowerBound() returns the lower bound of the multiplicity as an integer.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Integer" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif'"
	 * @generated
	 */
	int lowerBound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity as an unlimited natural.
	 * <!-- end-model-doc -->
	 * @model dataType="types.UnlimitedNatural" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if upperValue->isEmpty() then 1 else upperValue.unlimitedValue() endif'"
	 * @generated
	 */
	int upperBound();

} // MultiplicityElement
