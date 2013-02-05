/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An operation is a behavioral feature of a classifier that specifies the name, type, parameters, and constraints for invoking an associated behavior.
 * An operation may invoke both the execution of method behaviors as well as other behavioral responses.
 * Operation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Operation#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml.Operation#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link uml.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.Operation#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml.Operation#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.Operation#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link uml.Operation#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.Operation#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.Operation#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml.Operation#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml.Operation#getRedefinedOperation <em>Redefined Operation</em>}</li>
 *   <li>{@link uml.Operation#getType <em>Type</em>}</li>
 *   <li>{@link uml.Operation#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends BehavioralFeature, ParameterableElement, TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Interface#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interface that owns this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see uml.UmlPackage#getOperation_Interface()
	 * @see uml.Interface#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link uml.Operation#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Constraint on the result values of an invocation of this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Condition</em>' reference.
	 * @see #setBodyCondition(Constraint)
	 * @see uml.UmlPackage#getOperation_BodyCondition()
	 * @model ordered="false"
	 * @generated
	 */
	Constraint getBodyCondition();

	/**
	 * Sets the value of the '{@link uml.Operation#getBodyCondition <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Condition</em>' reference.
	 * @see #getBodyCondition()
	 * @generated
	 */
	void setBodyCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class that owns the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(uml.Class)
	 * @see uml.UmlPackage#getOperation_Class()
	 * @see uml.Class#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	uml.Class getClass_();

	/**
	 * Sets the value of the '{@link uml.Operation#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(uml.Class value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.DataType#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataType that owns this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see uml.UmlPackage#getOperation_Datatype()
	 * @see uml.DataType#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link uml.Operation#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This information is derived from the return result for this Operation.
	 * Specifies whether the return parameter is ordered or not, if present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see uml.UmlPackage#getOperation_IsOrdered()
	 * @model default="false" dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged (isQuery=true) or whether side effects may occur (isQuery=false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see uml.UmlPackage#getOperation_IsQuery()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link uml.Operation#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the return parameter is unique or not, if present.
	 * This information is derived from the return result for this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see uml.UmlPackage#getOperation_IsUnique()
	 * @model default="true" dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This information is derived from the return result for this Operation.
	 * Specifies the lower multiplicity of the return parameter, if present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see uml.UmlPackage#getOperation_Lower()
	 * @model default="1" dataType="types.Integer" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getLower();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints specifying the state of the system when the Operation is completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see uml.UmlPackage#getOperation_Postcondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints on the state of the system when the Operation is invoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see uml.UmlPackage#getOperation_Precondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Redefined Operation</b></em>' reference list.
	 * The list contents are of type {@link uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Operations that are redefined by this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Operation</em>' reference list.
	 * @see uml.UmlPackage#getOperation_RedefinedOperation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Operation> getRedefinedOperation();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This information is derived from the return result for this Operation.
	 * Specifies the return result of the operation, if present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see uml.UmlPackage#getOperation_Type()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This information is derived from the return result for this Operation.
	 * Specifies the upper multiplicity of the return parameter, if present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see uml.UmlPackage#getOperation_Upper()
	 * @model default="1" dataType="types.UnlimitedNatural" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getUpper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operation can have at most one return parameter; i.e., an owned parameter with the direction set to 'return'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.ownedParameter->select(par | par.direction = #return)->size() <= 1'"
	 * @generated
	 */
	boolean atMostOneReturn(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A bodyCondition can only be specified for a query operation.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='bodyCondition->notEmpty() implies isQuery'"
	 * @generated
	 */
	boolean onlyBodyForQuery(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the (only) return result parameter for this operation.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Parameter getReturnResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newIsOrderedDataType="types.Boolean" newIsOrderedRequired="true" newIsOrderedOrdered="false"
	 * @generated
	 */
	void setIsOrdered(boolean newIsOrdered);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newIsUniqueDataType="types.Boolean" newIsUniqueRequired="true" newIsUniqueOrdered="false"
	 * @generated
	 */
	void setIsUnique(boolean newIsUnique);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newLowerDataType="types.Integer" newLowerRequired="true" newLowerOrdered="false"
	 * @generated
	 */
	void setLower(int newLower);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newTypeRequired="true" newTypeOrdered="false"
	 * @generated
	 */
	void setType(Type newType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newUpperDataType="types.UnlimitedNatural" newUpperRequired="true" newUpperOrdered="false"
	 * @generated
	 */
	void setUpper(int newUpper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, isOrdered equals the value of isOrdered for that parameter. Otherwise isOrdered is false.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if returnResult()->notEmpty() then returnResult()->any().isOrdered else false endif'"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, isUnique equals the value of isUnique for that parameter. Otherwise isUnique is true.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if returnResult()->notEmpty() then returnResult()->any().isUnique else true endif'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query returnResult() returns the set containing the return parameter of the Operation if one exists, otherwise, it returns an empty set
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = ownedParameter->select (par | par.direction = #return)'"
	 * @generated
	 */
	EList<Parameter> returnResult();

} // Operation
