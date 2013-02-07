/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A remove variable value action is a write variable action that removes values from variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.RemoveVariableValueAction#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}</li>
 *   <li>{@link uml.RemoveVariableValueAction#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getRemoveVariableValueAction()
 * @model
 * @generated
 */
public interface RemoveVariableValueAction extends WriteVariableAction {
	/**
	 * Returns the value of the '<em><b>Is Remove Duplicates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to remove duplicates of the value in nonunique variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Remove Duplicates</em>' attribute.
	 * @see #setIsRemoveDuplicates(boolean)
	 * @see uml.UmlPackage#getRemoveVariableValueAction_IsRemoveDuplicates()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRemoveDuplicates();

	/**
	 * Sets the value of the '{@link uml.RemoveVariableValueAction#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remove Duplicates</em>' attribute.
	 * @see #isIsRemoveDuplicates()
	 * @generated
	 */
	void setIsRemoveDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the position of an existing value to remove in ordered nonunique variables. The type of the pin is UnlimitedNatural, but the value cannot be zero or unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove At</em>' containment reference.
	 * @see #setRemoveAt(InputPin)
	 * @see uml.UmlPackage#getRemoveVariableValueAction_RemoveAt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputPin getRemoveAt();

	/**
	 * Sets the value of the '{@link uml.RemoveVariableValueAction#getRemoveAt <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove At</em>' containment reference.
	 * @see #getRemoveAt()
	 * @generated
	 */
	void setRemoveAt(InputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions removing a value from ordered non-unique variables must have a single removeAt input pin and no value input pin if isRemoveDuplicates is false. The removeAt pin must be of type Unlimited Natural with multiplicity 1..1. Otherwise, the action has a value input pin and no removeAt input pin.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if not self.variable.isOrdered or self.variable.isUnique or isRemoveDuplicates then \n  self.removeAt -> isEmpty() and self.value -> notEmpty()\nelse\n  self.value -> isEmpty() and\n  self.removeAt -> notEmpty() and\n  self.removeAt.type = UnlimitedNatural and\n  self.removeAt.lower() = 1 and\n  self.removeAt.upper() = 1\nendif'"
	 * @generated
	 */
	boolean unlimitedNatural(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RemoveVariableValueAction
