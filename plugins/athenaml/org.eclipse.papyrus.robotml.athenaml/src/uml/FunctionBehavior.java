/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A function behavior is an opaque behavior that does not access or modify any objects or other external data.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getFunctionBehavior()
 * @model
 * @generated
 */
public interface FunctionBehavior extends OpaqueBehavior {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function behavior has at least one output parameter.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.ownedParameters->\n  select(p | p.direction=#out or p.direction=#inout or p.direction=#return)->size() >= 1'"
	 * @generated
	 */
	boolean oneOutputParameter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of parameters are all data types, which may not nest anything but other datatypes.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='def: hasAllDataTypeAttributes(d : DataType) : Boolean =\n  d.ownedAttribute->forAll(a |\n    a.type.oclIsTypeOf(DataType) and\n      hasAllDataTypeAttributes(a.type))\nself.ownedParameters->forAll(p | p.type.notEmpty() and\n  p.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p))'"
	 * @generated
	 */
	boolean typesOfParameters(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FunctionBehavior
