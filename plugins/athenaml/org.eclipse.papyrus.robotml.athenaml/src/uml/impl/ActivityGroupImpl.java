/**
 */
package uml.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ActivityGroupImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link uml.impl.ActivityGroupImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link uml.impl.ActivityGroupImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml.impl.ActivityGroupImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml.impl.ActivityGroupImpl#getSuperGroup <em>Super Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityGroupImpl extends NamedElementImpl implements ActivityGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.eINSTANCE.getActivityGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge() {
		// TODO: implement this method to return the 'Contained Edge' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		// TODO: implement this method to return the 'Contained Node' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getInActivity() {
		Activity inActivity = basicGetInActivity();
		return inActivity != null && inActivity.eIsProxy() ? (Activity)eResolveProxy((InternalEObject)inActivity) : inActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetInActivity() {
		// TODO: implement this method to return the 'In Activity' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		// TODO: implement this method to set the 'In Activity' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubgroup() {
		// TODO: implement this method to return the 'Subgroup' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup != null && superGroup.eIsProxy() ? (ActivityGroup)eResolveProxy((InternalEObject)superGroup) : superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		// TODO: implement this method to return the 'Super Group' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean groupOwned(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UmlValidator.ACTIVITY_GROUP__GROUP_OWNED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "groupOwned", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean notContained(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UmlValidator.ACTIVITY_GROUP__NOT_CONTAINED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "notContained", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean nodesAndEdges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UmlValidator.ACTIVITY_GROUP__NODES_AND_EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nodesAndEdges", EObjectValidator.getObjectLabel(this, context) }),
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmlPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				return getContainedEdge();
			case UmlPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				return getContainedNode();
			case UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				if (resolve) return getInActivity();
				return basicGetInActivity();
			case UmlPackage.ACTIVITY_GROUP__SUBGROUP:
				return getSubgroup();
			case UmlPackage.ACTIVITY_GROUP__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
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
			case UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				setInActivity((Activity)newValue);
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
			case UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				setInActivity((Activity)null);
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
			case UmlPackage.ACTIVITY_GROUP__CONTAINED_EDGE:
				return !getContainedEdge().isEmpty();
			case UmlPackage.ACTIVITY_GROUP__CONTAINED_NODE:
				return !getContainedNode().isEmpty();
			case UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY:
				return basicGetInActivity() != null;
			case UmlPackage.ACTIVITY_GROUP__SUBGROUP:
				return !getSubgroup().isEmpty();
			case UmlPackage.ACTIVITY_GROUP__SUPER_GROUP:
				return basicGetSuperGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityGroupImpl
