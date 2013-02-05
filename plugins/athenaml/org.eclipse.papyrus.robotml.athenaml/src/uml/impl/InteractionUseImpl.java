/**
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Gate;
import uml.Interaction;
import uml.InteractionUse;
import uml.Property;
import uml.UmlPackage;
import uml.ValueSpecification;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.InteractionUseImpl#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link uml.impl.InteractionUseImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link uml.impl.InteractionUseImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link uml.impl.InteractionUseImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link uml.impl.InteractionUseImpl#getReturnValueRecipient <em>Return Value Recipient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionUseImpl extends InteractionFragmentImpl implements InteractionUse {
	/**
	 * The cached value of the '{@link #getActualGate() <em>Actual Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> actualGate;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> argument;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected Interaction refersTo;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification returnValue;

	/**
	 * The cached value of the '{@link #getReturnValueRecipient() <em>Return Value Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValueRecipient()
	 * @generated
	 * @ordered
	 */
	protected Property returnValueRecipient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.eINSTANCE.getInteractionUse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getActualGate() {
		if (actualGate == null) {
			actualGate = new EObjectContainmentEList<Gate>(Gate.class, this, UmlPackage.INTERACTION_USE__ACTUAL_GATE);
		}
		return actualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, UmlPackage.INTERACTION_USE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (Interaction)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.INTERACTION_USE__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Interaction newRefersTo) {
		Interaction oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_USE__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnValue(ValueSpecification newReturnValue, NotificationChain msgs) {
		ValueSpecification oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_USE__RETURN_VALUE, oldReturnValue, newReturnValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(ValueSpecification newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.INTERACTION_USE__RETURN_VALUE, null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.INTERACTION_USE__RETURN_VALUE, null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_USE__RETURN_VALUE, newReturnValue, newReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getReturnValueRecipient() {
		if (returnValueRecipient != null && returnValueRecipient.eIsProxy()) {
			InternalEObject oldReturnValueRecipient = (InternalEObject)returnValueRecipient;
			returnValueRecipient = (Property)eResolveProxy(oldReturnValueRecipient);
			if (returnValueRecipient != oldReturnValueRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT, oldReturnValueRecipient, returnValueRecipient));
			}
		}
		return returnValueRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetReturnValueRecipient() {
		return returnValueRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValueRecipient(Property newReturnValueRecipient) {
		Property oldReturnValueRecipient = returnValueRecipient;
		returnValueRecipient = newReturnValueRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT, oldReturnValueRecipient, returnValueRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allLifelines(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UmlValidator.DIAGNOSTIC_SOURCE,
						 UmlValidator.INTERACTION_USE__ALL_LIFELINES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "allLifelines", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean returnValueRecipientCoverage(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UmlValidator.DIAGNOSTIC_SOURCE,
						 UmlValidator.INTERACTION_USE__RETURN_VALUE_RECIPIENT_COVERAGE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "returnValueRecipientCoverage", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean argumentsCorrespondToParameters(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UmlValidator.DIAGNOSTIC_SOURCE,
						 UmlValidator.INTERACTION_USE__ARGUMENTS_CORRESPOND_TO_PARAMETERS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "argumentsCorrespondToParameters", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean gatesMatch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UmlValidator.DIAGNOSTIC_SOURCE,
						 UmlValidator.INTERACTION_USE__GATES_MATCH,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "gatesMatch", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean argumentsAreConstants(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UmlValidator.DIAGNOSTIC_SOURCE,
						 UmlValidator.INTERACTION_USE__ARGUMENTS_ARE_CONSTANTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "argumentsAreConstants", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean returnValueTypeRecipientCorrespondence(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UmlValidator.DIAGNOSTIC_SOURCE,
						 UmlValidator.INTERACTION_USE__RETURN_VALUE_TYPE_RECIPIENT_CORRESPONDENCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "returnValueTypeRecipientCorrespondence", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
				return ((InternalEList<?>)getActualGate()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_USE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case UmlPackage.INTERACTION_USE__RETURN_VALUE:
				return basicSetReturnValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
				return getActualGate();
			case UmlPackage.INTERACTION_USE__ARGUMENT:
				return getArgument();
			case UmlPackage.INTERACTION_USE__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case UmlPackage.INTERACTION_USE__RETURN_VALUE:
				return getReturnValue();
			case UmlPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT:
				if (resolve) return getReturnValueRecipient();
				return basicGetReturnValueRecipient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
				getActualGate().clear();
				getActualGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case UmlPackage.INTERACTION_USE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UmlPackage.INTERACTION_USE__REFERS_TO:
				setRefersTo((Interaction)newValue);
				return;
			case UmlPackage.INTERACTION_USE__RETURN_VALUE:
				setReturnValue((ValueSpecification)newValue);
				return;
			case UmlPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT:
				setReturnValueRecipient((Property)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
				getActualGate().clear();
				return;
			case UmlPackage.INTERACTION_USE__ARGUMENT:
				getArgument().clear();
				return;
			case UmlPackage.INTERACTION_USE__REFERS_TO:
				setRefersTo((Interaction)null);
				return;
			case UmlPackage.INTERACTION_USE__RETURN_VALUE:
				setReturnValue((ValueSpecification)null);
				return;
			case UmlPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT:
				setReturnValueRecipient((Property)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
				return actualGate != null && !actualGate.isEmpty();
			case UmlPackage.INTERACTION_USE__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case UmlPackage.INTERACTION_USE__REFERS_TO:
				return refersTo != null;
			case UmlPackage.INTERACTION_USE__RETURN_VALUE:
				return returnValue != null;
			case UmlPackage.INTERACTION_USE__RETURN_VALUE_RECIPIENT:
				return returnValueRecipient != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionUseImpl
