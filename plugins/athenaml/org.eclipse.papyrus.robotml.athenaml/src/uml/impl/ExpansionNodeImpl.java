/**
 */
package uml.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.ExpansionNode;
import uml.ExpansionRegion;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ExpansionNodeImpl#getRegionAsInput <em>Region As Input</em>}</li>
 *   <li>{@link uml.impl.ExpansionNodeImpl#getRegionAsOutput <em>Region As Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionNodeImpl extends ObjectNodeImpl implements ExpansionNode {
	/**
	 * The cached value of the '{@link #getRegionAsInput() <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsInput()
	 * @generated
	 * @ordered
	 */
	protected ExpansionRegion regionAsInput;

	/**
	 * The cached value of the '{@link #getRegionAsOutput() <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionAsOutput()
	 * @generated
	 * @ordered
	 */
	protected ExpansionRegion regionAsOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.eINSTANCE.getExpansionNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion getRegionAsInput() {
		if (regionAsInput != null && regionAsInput.eIsProxy()) {
			InternalEObject oldRegionAsInput = (InternalEObject)regionAsInput;
			regionAsInput = (ExpansionRegion)eResolveProxy(oldRegionAsInput);
			if (regionAsInput != oldRegionAsInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.EXPANSION_NODE__REGION_AS_INPUT, oldRegionAsInput, regionAsInput));
			}
		}
		return regionAsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion basicGetRegionAsInput() {
		return regionAsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionAsInput(ExpansionRegion newRegionAsInput, NotificationChain msgs) {
		ExpansionRegion oldRegionAsInput = regionAsInput;
		regionAsInput = newRegionAsInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_INPUT, oldRegionAsInput, newRegionAsInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionAsInput(ExpansionRegion newRegionAsInput) {
		if (newRegionAsInput != regionAsInput) {
			NotificationChain msgs = null;
			if (regionAsInput != null)
				msgs = ((InternalEObject)regionAsInput).eInverseRemove(this, UmlPackage.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
			if (newRegionAsInput != null)
				msgs = ((InternalEObject)newRegionAsInput).eInverseAdd(this, UmlPackage.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
			msgs = basicSetRegionAsInput(newRegionAsInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_INPUT, newRegionAsInput, newRegionAsInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion getRegionAsOutput() {
		if (regionAsOutput != null && regionAsOutput.eIsProxy()) {
			InternalEObject oldRegionAsOutput = (InternalEObject)regionAsOutput;
			regionAsOutput = (ExpansionRegion)eResolveProxy(oldRegionAsOutput);
			if (regionAsOutput != oldRegionAsOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT, oldRegionAsOutput, regionAsOutput));
			}
		}
		return regionAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion basicGetRegionAsOutput() {
		return regionAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionAsOutput(ExpansionRegion newRegionAsOutput, NotificationChain msgs) {
		ExpansionRegion oldRegionAsOutput = regionAsOutput;
		regionAsOutput = newRegionAsOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT, oldRegionAsOutput, newRegionAsOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionAsOutput(ExpansionRegion newRegionAsOutput) {
		if (newRegionAsOutput != regionAsOutput) {
			NotificationChain msgs = null;
			if (regionAsOutput != null)
				msgs = ((InternalEObject)regionAsOutput).eInverseRemove(this, UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
			if (newRegionAsOutput != null)
				msgs = ((InternalEObject)newRegionAsOutput).eInverseAdd(this, UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
			msgs = basicSetRegionAsOutput(newRegionAsOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT, newRegionAsOutput, newRegionAsOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean regionAsInputOrOutput(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UmlValidator.EXPANSION_NODE__REGION_AS_INPUT_OR_OUTPUT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "regionAsInputOrOutput", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				if (regionAsInput != null)
					msgs = ((InternalEObject)regionAsInput).eInverseRemove(this, UmlPackage.EXPANSION_REGION__INPUT_ELEMENT, ExpansionRegion.class, msgs);
				return basicSetRegionAsInput((ExpansionRegion)otherEnd, msgs);
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				if (regionAsOutput != null)
					msgs = ((InternalEObject)regionAsOutput).eInverseRemove(this, UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT, ExpansionRegion.class, msgs);
				return basicSetRegionAsOutput((ExpansionRegion)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				return basicSetRegionAsInput(null, msgs);
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				return basicSetRegionAsOutput(null, msgs);
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
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				if (resolve) return getRegionAsInput();
				return basicGetRegionAsInput();
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				if (resolve) return getRegionAsOutput();
				return basicGetRegionAsOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				setRegionAsInput((ExpansionRegion)newValue);
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				setRegionAsOutput((ExpansionRegion)newValue);
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
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				setRegionAsInput((ExpansionRegion)null);
				return;
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				setRegionAsOutput((ExpansionRegion)null);
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
			case UmlPackage.EXPANSION_NODE__REGION_AS_INPUT:
				return regionAsInput != null;
			case UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT:
				return regionAsOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpansionNodeImpl
