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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.Constraint;
import uml.ElementImport;
import uml.InputPin;
import uml.NamedElement;
import uml.Namespace;
import uml.OutputPin;
import uml.PackageImport;
import uml.PackageableElement;
import uml.StructuredActivityNode;
import uml.UmlPackage;
import uml.Variable;
import uml.VisibilityKind;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ActionImpl implements StructuredActivityNode {
	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImport;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImport;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The default value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_ISOLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected boolean mustIsolate = MUST_ISOLATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * The cached value of the '{@link #getStructuredNodeInput() <em>Structured Node Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> structuredNodeInput;

	/**
	 * The cached value of the '{@link #getStructuredNodeOutput() <em>Structured Node Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> structuredNodeOutput;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.eINSTANCE.getStructuredActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, UmlPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport() {
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, UmlPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getOwnedMember() {
		// TODO: implement this method to return the 'Owned Member' reference list
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
	public EList<PackageableElement> getImportedMember() {
		// TODO: implement this method to return the 'Imported Member' reference list
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
	public EList<NamedElement> getMember() {
		// TODO: implement this method to return the 'Member' reference list
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
	public boolean isMustIsolate() {
		return mustIsolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(boolean newMustIsolate) {
		boolean oldMustIsolate = mustIsolate;
		mustIsolate = newMustIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE, UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getStructuredNodeInput() {
		if (structuredNodeInput == null) {
			structuredNodeInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
		}
		return structuredNodeInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getStructuredNodeOutput() {
		if (structuredNodeOutput == null) {
			structuredNodeOutput = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
		}
		return structuredNodeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE, UmlPackage.VARIABLE__SCOPE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE, UmlPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inputPinEdges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UmlValidator.STRUCTURED_ACTIVITY_NODE__INPUT_PIN_EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "inputPinEdges", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean edges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UmlValidator.STRUCTURED_ACTIVITY_NODE__EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "edges", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean outputPinEdges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UmlValidator.STRUCTURED_ACTIVITY_NODE__OUTPUT_PIN_EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "outputPinEdges", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean membersDistinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UmlValidator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "membersDistinguishable", EObjectValidator.getObjectLabel(this, context) }),
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
	public ElementImport createElementImport(PackageableElement element, VisibilityKind visibility) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(uml.Package package_, VisibilityKind visibility) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedElements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uml.Package> getImportedPackages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamesOfMember(NamedElement element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> importMembers(EList<PackageableElement> imps) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMembers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getOwnedMembers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return ((InternalEList<?>)getStructuredNodeInput()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return ((InternalEList<?>)getStructuredNodeOutput()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return getElementImport();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return getPackageImport();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return getOwnedRule();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER:
				return getOwnedMember();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return getImportedMember();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return getMember();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return getContainedEdge();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return getContainedNode();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				if (resolve) return getInActivity();
				return basicGetInActivity();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return getSubgroup();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return isMustIsolate();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return getNode();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return getStructuredNodeInput();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return getStructuredNodeOutput();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return getVariable();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return getEdge();
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate((Boolean)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				getStructuredNodeInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				getStructuredNodeOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)null);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				return;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
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
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return !getImportedMember().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return !getMember().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return !getContainedEdge().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return !getContainedNode().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return basicGetInActivity() != null;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return !getSubgroup().isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return basicGetSuperGroup() != null;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return mustIsolate != MUST_ISOLATE_EDEFAULT;
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return node != null && !node.isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return structuredNodeInput != null && !structuredNodeInput.isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return structuredNodeOutput != null && !structuredNodeOutput.isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return edge != null && !edge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT: return UmlPackage.NAMESPACE__ELEMENT_IMPORT;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT: return UmlPackage.NAMESPACE__PACKAGE_IMPORT;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE: return UmlPackage.NAMESPACE__OWNED_RULE;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER: return UmlPackage.NAMESPACE__OWNED_MEMBER;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER: return UmlPackage.NAMESPACE__IMPORTED_MEMBER;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__MEMBER: return UmlPackage.NAMESPACE__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE: return UmlPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE: return UmlPackage.ACTIVITY_GROUP__CONTAINED_NODE;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY: return UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP: return UmlPackage.ACTIVITY_GROUP__SUBGROUP;
				case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP: return UmlPackage.ACTIVITY_GROUP__SUPER_GROUP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case UmlPackage.NAMESPACE__ELEMENT_IMPORT: return UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;
				case UmlPackage.NAMESPACE__PACKAGE_IMPORT: return UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;
				case UmlPackage.NAMESPACE__OWNED_RULE: return UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE;
				case UmlPackage.NAMESPACE__OWNED_MEMBER: return UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;
				case UmlPackage.NAMESPACE__IMPORTED_MEMBER: return UmlPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;
				case UmlPackage.NAMESPACE__MEMBER: return UmlPackage.STRUCTURED_ACTIVITY_NODE__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UmlPackage.ACTIVITY_GROUP__CONTAINED_EDGE: return UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;
				case UmlPackage.ACTIVITY_GROUP__CONTAINED_NODE: return UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;
				case UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY: return UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;
				case UmlPackage.ACTIVITY_GROUP__SUBGROUP: return UmlPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP;
				case UmlPackage.ACTIVITY_GROUP__SUPER_GROUP: return UmlPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mustIsolate: ");
		result.append(mustIsolate);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl
