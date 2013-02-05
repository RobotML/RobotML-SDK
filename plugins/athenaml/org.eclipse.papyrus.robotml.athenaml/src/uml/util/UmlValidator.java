/**
 */
package uml.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.Abstraction;
import uml.AcceptCallAction;
import uml.AcceptEventAction;
import uml.Action;
import uml.ActionExecutionSpecification;
import uml.ActionInputPin;
import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityFinalNode;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.ActivityParameterNode;
import uml.ActivityPartition;
import uml.Actor;
import uml.AddStructuralFeatureValueAction;
import uml.AddVariableValueAction;
import uml.AggregationKind;
import uml.AnyReceiveEvent;
import uml.Artifact;
import uml.Association;
import uml.AssociationClass;
import uml.Behavior;
import uml.BehaviorExecutionSpecification;
import uml.BehavioralFeature;
import uml.BehavioredClassifier;
import uml.BroadcastSignalAction;
import uml.CallAction;
import uml.CallBehaviorAction;
import uml.CallConcurrencyKind;
import uml.CallEvent;
import uml.CallOperationAction;
import uml.CentralBufferNode;
import uml.ChangeEvent;
import uml.Classifier;
import uml.ClassifierTemplateParameter;
import uml.Clause;
import uml.ClearAssociationAction;
import uml.ClearStructuralFeatureAction;
import uml.ClearVariableAction;
import uml.Collaboration;
import uml.CollaborationUse;
import uml.CombinedFragment;
import uml.Comment;
import uml.CommunicationPath;
import uml.Component;
import uml.ComponentRealization;
import uml.ConditionalNode;
import uml.ConnectableElement;
import uml.ConnectableElementTemplateParameter;
import uml.ConnectionPointReference;
import uml.Connector;
import uml.ConnectorEnd;
import uml.ConnectorKind;
import uml.ConsiderIgnoreFragment;
import uml.Constraint;
import uml.Continuation;
import uml.ControlFlow;
import uml.ControlNode;
import uml.CreateLinkAction;
import uml.CreateLinkObjectAction;
import uml.CreateObjectAction;
import uml.DataStoreNode;
import uml.DataType;
import uml.DecisionNode;
import uml.Dependency;
import uml.DeployedArtifact;
import uml.Deployment;
import uml.DeploymentSpecification;
import uml.DeploymentTarget;
import uml.DestroyLinkAction;
import uml.DestroyObjectAction;
import uml.DestructionOccurrenceSpecification;
import uml.Device;
import uml.DirectedRelationship;
import uml.Duration;
import uml.DurationConstraint;
import uml.DurationInterval;
import uml.DurationObservation;
import uml.Element;
import uml.ElementImport;
import uml.EncapsulatedClassifier;
import uml.Enumeration;
import uml.EnumerationLiteral;
import uml.Event;
import uml.ExceptionHandler;
import uml.ExecutableNode;
import uml.ExecutionEnvironment;
import uml.ExecutionOccurrenceSpecification;
import uml.ExecutionSpecification;
import uml.ExpansionKind;
import uml.ExpansionNode;
import uml.ExpansionRegion;
import uml.Expression;
import uml.Extend;
import uml.Extension;
import uml.ExtensionEnd;
import uml.ExtensionPoint;
import uml.Feature;
import uml.FinalNode;
import uml.FinalState;
import uml.FlowFinalNode;
import uml.ForkNode;
import uml.FunctionBehavior;
import uml.Gate;
import uml.GeneralOrdering;
import uml.Generalization;
import uml.GeneralizationSet;
import uml.Image;
import uml.Include;
import uml.InformationFlow;
import uml.InformationItem;
import uml.InitialNode;
import uml.InputPin;
import uml.InstanceSpecification;
import uml.InstanceValue;
import uml.Interaction;
import uml.InteractionConstraint;
import uml.InteractionFragment;
import uml.InteractionOperand;
import uml.InteractionOperatorKind;
import uml.InteractionUse;
import uml.Interface;
import uml.InterfaceRealization;
import uml.InterruptibleActivityRegion;
import uml.Interval;
import uml.IntervalConstraint;
import uml.InvocationAction;
import uml.JoinNode;
import uml.Lifeline;
import uml.LinkAction;
import uml.LinkEndCreationData;
import uml.LinkEndData;
import uml.LinkEndDestructionData;
import uml.LiteralBoolean;
import uml.LiteralInteger;
import uml.LiteralNull;
import uml.LiteralReal;
import uml.LiteralSpecification;
import uml.LiteralString;
import uml.LiteralUnlimitedNatural;
import uml.LoopNode;
import uml.Manifestation;
import uml.MergeNode;
import uml.Message;
import uml.MessageEnd;
import uml.MessageEvent;
import uml.MessageKind;
import uml.MessageOccurrenceSpecification;
import uml.MessageSort;
import uml.Model;
import uml.MultiplicityElement;
import uml.NamedElement;
import uml.Namespace;
import uml.Node;
import uml.ObjectFlow;
import uml.ObjectNode;
import uml.ObjectNodeOrderingKind;
import uml.Observation;
import uml.OccurrenceSpecification;
import uml.OpaqueAction;
import uml.OpaqueBehavior;
import uml.OpaqueExpression;
import uml.Operation;
import uml.OperationTemplateParameter;
import uml.OutputPin;
import uml.PackageImport;
import uml.PackageMerge;
import uml.PackageableElement;
import uml.Parameter;
import uml.ParameterDirectionKind;
import uml.ParameterEffectKind;
import uml.ParameterSet;
import uml.ParameterableElement;
import uml.PartDecomposition;
import uml.Pin;
import uml.Port;
import uml.PrimitiveType;
import uml.Profile;
import uml.ProfileApplication;
import uml.Property;
import uml.ProtocolConformance;
import uml.ProtocolStateMachine;
import uml.ProtocolTransition;
import uml.Pseudostate;
import uml.PseudostateKind;
import uml.QualifierValue;
import uml.RaiseExceptionAction;
import uml.ReadExtentAction;
import uml.ReadIsClassifiedObjectAction;
import uml.ReadLinkAction;
import uml.ReadLinkObjectEndAction;
import uml.ReadLinkObjectEndQualifierAction;
import uml.ReadSelfAction;
import uml.ReadStructuralFeatureAction;
import uml.ReadVariableAction;
import uml.Realization;
import uml.Reception;
import uml.ReclassifyObjectAction;
import uml.RedefinableElement;
import uml.RedefinableTemplateSignature;
import uml.ReduceAction;
import uml.Region;
import uml.Relationship;
import uml.RemoveStructuralFeatureValueAction;
import uml.RemoveVariableValueAction;
import uml.ReplyAction;
import uml.SendObjectAction;
import uml.SendSignalAction;
import uml.SequenceNode;
import uml.Signal;
import uml.SignalEvent;
import uml.Slot;
import uml.StartClassifierBehaviorAction;
import uml.StartObjectBehaviorAction;
import uml.State;
import uml.StateInvariant;
import uml.StateMachine;
import uml.Stereotype;
import uml.StringExpression;
import uml.StructuralFeature;
import uml.StructuralFeatureAction;
import uml.StructuredActivityNode;
import uml.StructuredClassifier;
import uml.Substitution;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateParameterSubstitution;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.TestIdentityAction;
import uml.TimeConstraint;
import uml.TimeEvent;
import uml.TimeExpression;
import uml.TimeInterval;
import uml.TimeObservation;
import uml.Transition;
import uml.TransitionKind;
import uml.Trigger;
import uml.Type;
import uml.TypedElement;
import uml.UmlPackage;
import uml.UnmarshallAction;
import uml.Usage;
import uml.UseCase;
import uml.ValuePin;
import uml.ValueSpecification;
import uml.ValueSpecificationAction;
import uml.Variable;
import uml.VariableAction;
import uml.Vertex;
import uml.VisibilityKind;
import uml.WriteLinkAction;
import uml.WriteStructuralFeatureAction;
import uml.WriteVariableAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public class UmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UmlValidator INSTANCE = new UmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Owner' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__HAS_OWNER = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Own Self' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__NOT_OWN_SELF = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Association End Ownership' of 'Stereotype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STEREOTYPE__ASSOCIATION_END_OWNERSHIP = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Not Clash' of 'Stereotype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STEREOTYPE__NAME_NOT_CLASH = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Binary Associations Only' of 'Stereotype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STEREOTYPE__BINARY_ASSOCIATIONS_ONLY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Generalize' of 'Stereotype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STEREOTYPE__GENERALIZE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Passive Class' of 'Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASS__PASSIVE_CLASS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicities' of 'Structured Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURED_CLASSIFIER__MULTIPLICITIES = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Final Parents' of 'Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER__NON_FINAL_PARENTS = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Cycles In Generalization' of 'Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER__NO_CYCLES_IN_GENERALIZATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Specialize Type' of 'Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER__SPECIALIZE_TYPE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Maps To Generalization Set' of 'Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER__MAPS_TO_GENERALIZATION_SET = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Members Distinguishable' of 'Namespace'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMESPACE__MEMBERS_DISTINGUISHABLE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Qualified Name' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__HAS_QUALIFIED_NAME = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has No Qualified Name' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Visibility Needs Ownership' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subexpressions' of 'String Expression'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_EXPRESSION__SUBEXPRESSIONS = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operands' of 'String Expression'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_EXPRESSION__OPERANDS = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Elements Public Or Private' of 'Package'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Own Elements' of 'Template Signature'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEMPLATE_SIGNATURE__OWN_ELEMENTS = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Be Compatible' of 'Template Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEMPLATE_PARAMETER__MUST_BE_COMPATIBLE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Parameter Substitution Formal' of 'Template Binding'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEMPLATE_BINDING__PARAMETER_SUBSTITUTION_FORMAL = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Parameter Substitution' of 'Template Binding'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEMPLATE_BINDING__ONE_PARAMETER_SUBSTITUTION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Be Compatible' of 'Template Parameter Substitution'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEMPLATE_PARAMETER_SUBSTITUTION__MUST_BE_COMPATIBLE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Metaclass Reference Not Specialized' of 'Profile'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFILE__METACLASS_REFERENCE_NOT_SPECIALIZED = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'References Same Metamodel' of 'Profile'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROFILE__REFERENCES_SAME_METAMODEL = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Visibility Public Or Private' of 'Element Import'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Imported Element Is Public' of 'Element Import'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Public Or Private' of 'Package Import'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PACKAGE_IMPORT__PUBLIC_OR_PRIVATE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Owned End' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__NON_OWNED_END = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is Binary' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__IS_BINARY = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Specialized End Number' of 'Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSOCIATION__SPECIALIZED_END_NUMBER = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Association Ends' of 'Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSOCIATION__ASSOCIATION_ENDS = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Binary Associations' of 'Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSOCIATION__BINARY_ASSOCIATIONS = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Specialized End Types' of 'Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSOCIATION__SPECIALIZED_END_TYPES = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subsetted Property Names' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTED_PROPERTY_NAMES = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subsetting Rules' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTING_RULES = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Composite' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__MULTIPLICITY_OF_COMPOSITE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Binding To Attribute' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__BINDING_TO_ATTRIBUTE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Redefined Property Inherited' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__REDEFINED_PROPERTY_INHERITED = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subsetting Context Conforms' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__SUBSETTING_CONTEXT_CONFORMS = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Deployment Target' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__DEPLOYMENT_TARGET = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derived Union Is Derived' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__DERIVED_UNION_IS_DERIVED = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Derived Union Is Read Only' of 'Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROPERTY__DERIVED_UNION_IS_READ_ONLY = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lower Ge0' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__LOWER_GE0 = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Upper Ge Lower' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__UPPER_GE_LOWER = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Value Specification Constant' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_CONSTANT = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Value Specification No Side Effects' of 'Multiplicity Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_NO_SIDE_EFFECTS = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Redefinition Consistent' of 'Redefinable Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Leaf Redefinition' of 'Redefinable Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__NON_LEAF_REDEFINITION = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Redefinition Context Valid' of 'Redefinable Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Role And Part With Port' of 'Connector End'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTOR_END__ROLE_AND_PART_WITH_PORT = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Self Part With Port' of 'Connector End'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTOR_END__SELF_PART_WITH_PORT = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Connector End'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTOR_END__MULTIPLICITY = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Part With Port Empty' of 'Connector End'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTOR_END__PART_WITH_PORT_EMPTY = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Deployed Elements' of 'Deployment Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPLOYMENT_SPECIFICATION__DEPLOYED_ELEMENTS = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Deployment Target' of 'Deployment Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPLOYMENT_SPECIFICATION__DEPLOYMENT_TARGET = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Most One Return' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__AT_MOST_ONE_RETURN = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only Body For Query' of 'Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION__ONLY_BODY_FOR_QUERY = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Parameters Match' of 'Behavior'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BEHAVIOR__PARAMETERS_MATCH = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Feature Of Context Classifier' of 'Behavior'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BEHAVIOR__FEATURE_OF_CONTEXT_CLASSIFIER = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Realize' of 'Behavior'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BEHAVIOR__MUST_REALIZE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Most One Behaviour' of 'Behavior'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BEHAVIOR__MOST_ONE_BEHAVIOUR = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Class Behavior' of 'Behaviored Classifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BEHAVIORED_CLASSIFIER__CLASS_BEHAVIOR = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Visibility' of 'Interface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE__VISIBILITY = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Query' of 'Reception'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPTION__NOT_QUERY = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entry Exit Do' of 'Protocol State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL_STATE_MACHINE__ENTRY_EXIT_DO = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Protocol Transitions' of 'Protocol State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL_STATE_MACHINE__PROTOCOL_TRANSITIONS = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Deep Or Shallow History' of 'Protocol State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL_STATE_MACHINE__DEEP_OR_SHALLOW_HISTORY = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ports Connected' of 'Protocol State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL_STATE_MACHINE__PORTS_CONNECTED = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Method' of 'State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE_MACHINE__METHOD = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Classifier Context' of 'State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE_MACHINE__CLASSIFIER_CONTEXT = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Context Classifier' of 'State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE_MACHINE__CONTEXT_CLASSIFIER = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Connection Points' of 'State Machine'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE_MACHINE__CONNECTION_POINTS = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Junction Vertex' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__JUNCTION_VERTEX = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'History Vertices' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__HISTORY_VERTICES = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Transitions Outgoing' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__TRANSITIONS_OUTGOING = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Outgoing From Initial' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__OUTGOING_FROM_INITIAL = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fork Vertex' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__FORK_VERTEX = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Join Vertex' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__JOIN_VERTEX = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Choice Vertex' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__CHOICE_VERTEX = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial Vertex' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__INITIAL_VERTEX = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Transitions Incoming' of 'Pseudostate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PSEUDOSTATE__TRANSITIONS_INCOMING = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Shallow History Vertex' of 'Region'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGION__SHALLOW_HISTORY_VERTEX = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Deep History Vertex' of 'Region'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGION__DEEP_HISTORY_VERTEX = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial Vertex' of 'Region'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGION__INITIAL_VERTEX = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Owned' of 'Region'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGION__OWNED = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entry Or Exit' of 'State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE__ENTRY_OR_EXIT = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Composite States' of 'State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE__COMPOSITE_STATES = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Destinations Or Sources Of Transitions' of 'State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE__DESTINATIONS_OR_SOURCES_OF_TRANSITIONS = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Submachine Or Regions' of 'State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE__SUBMACHINE_OR_REGIONS = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Submachine States' of 'State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE__SUBMACHINE_STATES = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entry Pseudostates' of 'Connection Point Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTION_POINT_REFERENCE__ENTRY_PSEUDOSTATES = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exit Pseudostates' of 'Connection Point Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTION_POINT_REFERENCE__EXIT_PSEUDOSTATES = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Default Value' of 'Port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PORT__DEFAULT_VALUE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Port Aggregation' of 'Port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PORT__PORT_AGGREGATION = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Port Destroyed' of 'Port'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PORT__PORT_DESTROYED = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Apply To Self' of 'Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINT__NOT_APPLY_TO_SELF = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Side Effects' of 'Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINT__NO_SIDE_EFFECTS = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Boolean Value' of 'Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINT__BOOLEAN_VALUE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Value Specification Boolean' of 'Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINT__VALUE_SPECIFICATION_BOOLEAN = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'State Is Local' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__STATE_IS_LOCAL = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fork Segment Guards' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__FORK_SEGMENT_GUARDS = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Join Segment State' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__JOIN_SEGMENT_STATE = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial Transition' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__INITIAL_TRANSITION = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Outgoing Pseudostates' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__OUTGOING_PSEUDOSTATES = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signatures Compatible' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__SIGNATURES_COMPATIBLE = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'State Is Internal' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__STATE_IS_INTERNAL = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Join Segment Guards' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__JOIN_SEGMENT_GUARDS = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fork Segment State' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__FORK_SEGMENT_STATE = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'State Is External' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__STATE_IS_EXTERNAL = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reentrant Behaviors' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__REENTRANT_BEHAVIORS = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Connector End' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__CONNECTOR_END = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Exception' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__NOT_EXCEPTION = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'In And Out' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__IN_AND_OUT = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stream And Exception' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__STREAM_AND_EXCEPTION = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Two Parameter Sets' of 'Parameter Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER_SET__TWO_PARAMETER_SETS = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input' of 'Parameter Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER_SET__INPUT = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Parameterized Entity' of 'Parameter Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER_SET__SAME_PARAMETERIZED_ENTITY = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Extension End'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION_END__MULTIPLICITY = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Aggregation' of 'Extension End'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION_END__AGGREGATION = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Classifier Equals Owning Enumeration' of 'Enumeration Literal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUMERATION_LITERAL__CLASSIFIER_EQUALS_OWNING_ENUMERATION = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Structural Feature' of 'Instance Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__STRUCTURAL_FEATURE = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Defining Feature' of 'Instance Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__DEFINING_FEATURE = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Deployment Target' of 'Instance Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__DEPLOYMENT_TARGET = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Deployment Artifact' of 'Instance Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCE_SPECIFICATION__DEPLOYMENT_ARTIFACT = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Connectors' of 'Collaboration Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLABORATION_USE__CONNECTORS = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Every Role' of 'Collaboration Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLABORATION_USE__EVERY_ROLE = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Client Elements' of 'Collaboration Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLLABORATION_USE__CLIENT_ELEMENTS = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Generalization Same Classifier' of 'Generalization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERALIZATION__GENERALIZATION_SAME_CLASSIFIER = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Maps To Generalization Set' of 'Generalization Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERALIZATION_SET__MAPS_TO_GENERALIZATION_SET = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Generalization Same Classifier' of 'Generalization Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERALIZATION_SET__GENERALIZATION_SAME_CLASSIFIER = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inherited Parameters' of 'Redefinable Template Signature'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETERS = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'Use Case'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USE_CASE__MUST_HAVE_NAME = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cannot Include Self' of 'Use Case'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USE_CASE__CANNOT_INCLUDE_SELF = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Binary Associations' of 'Use Case'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USE_CASE__BINARY_ASSOCIATIONS = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Association To Use Case' of 'Use Case'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USE_CASE__NO_ASSOCIATION_TO_USE_CASE = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Extension Points' of 'Extend'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTEND__EXTENSION_POINTS = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'Extension Point'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION_POINT__MUST_HAVE_NAME = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Constraining Classifier' of 'Classifier Template Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSIFIER_TEMPLATE_PARAMETER__HAS_CONSTRAINING_CLASSIFIER = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Compatible' of 'Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTOR__COMPATIBLE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Roles' of 'Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTOR__ROLES = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Between Interfaces Ports' of 'Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTOR__BETWEEN_INTERFACES_PORTS = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Types' of 'Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTOR__TYPES = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only Return Result Parameters' of 'Opaque Expression'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPAQUE_EXPRESSION__ONLY_RETURN_RESULT_PARAMETERS = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Return Result Parameter' of 'Opaque Expression'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPAQUE_EXPRESSION__ONE_RETURN_RESULT_PARAMETER = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Language Body Size' of 'Opaque Expression'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPAQUE_EXPRESSION__LANGUAGE_BODY_SIZE = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Trigger Call Event' of 'Accept Call Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCEPT_CALL_ACTION__TRIGGER_CALL_EVENT = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unmarshall' of 'Accept Call Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCEPT_CALL_ACTION__UNMARSHALL = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Pins' of 'Accept Call Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCEPT_CALL_ACTION__RESULT_PINS = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Input Pins' of 'Accept Event Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCEPT_EVENT_ACTION__NO_INPUT_PINS = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Trigger Events' of 'Accept Event Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCEPT_EVENT_ACTION__TRIGGER_EVENTS = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unmarshall Signal Events' of 'Accept Event Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCEPT_EVENT_ACTION__UNMARSHALL_SIGNAL_EVENTS = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Output Pins' of 'Accept Event Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCEPT_EVENT_ACTION__NO_OUTPUT_PINS = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Owned' of 'Activity Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_NODE__OWNED = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Owned Structured Node' of 'Activity Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_NODE__OWNED_STRUCTURED_NODE = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Activity Parameter Node' of 'Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY__ACTIVITY_PARAMETER_NODE = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Autonomous' of 'Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY__AUTONOMOUS = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Supergroups' of 'Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY__NO_SUPERGROUPS = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Group Owned' of 'Activity Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_GROUP__GROUP_OWNED = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Contained' of 'Activity Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_GROUP__NOT_CONTAINED = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nodes And Edges' of 'Activity Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_GROUP__NODES_AND_EDGES = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Owned' of 'Activity Edge'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_EDGE__OWNED = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source And Target' of 'Activity Edge'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_EDGE__SOURCE_AND_TARGET = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Structured Node' of 'Activity Edge'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_EDGE__STRUCTURED_NODE = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Represents Part' of 'Activity Partition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARTITION__REPRESENTS_PART = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Represents Classifier' of 'Activity Partition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARTITION__REPRESENTS_CLASSIFIER = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Represents Part And Is Contained' of 'Activity Partition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARTITION__REPRESENTS_PART_AND_IS_CONTAINED = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dimension Not Contained' of 'Activity Partition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARTITION__DIMENSION_NOT_CONTAINED = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Pin Edges' of 'Structured Activity Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURED_ACTIVITY_NODE__INPUT_PIN_EDGES = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Edges' of 'Structured Activity Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURED_ACTIVITY_NODE__EDGES = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Pin Edges' of 'Structured Activity Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURED_ACTIVITY_NODE__OUTPUT_PIN_EDGES = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Outgoing Edges Structured Only' of 'Input Pin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INPUT_PIN__OUTGOING_EDGES_STRUCTURED_ONLY = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Control Pins' of 'Pin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PIN__CONTROL_PINS = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Object Flow Edges' of 'Object Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_NODE__OBJECT_FLOW_EDGES = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Selection Behavior' of 'Object Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_NODE__SELECTION_BEHAVIOR = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Output Parameter' of 'Object Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_NODE__INPUT_OUTPUT_PARAMETER = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Incoming Edges Structured Only' of 'Output Pin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OUTPUT_PIN__INCOMING_EDGES_STRUCTURED_ONLY = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Owned' of 'Variable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE__OWNED = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Interrupting Edges' of 'Interruptible Activity Region'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Input' of 'Exception Handler'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXCEPTION_HANDLER__ONE_INPUT = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Edge Source Target' of 'Exception Handler'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXCEPTION_HANDLER__EDGE_SOURCE_TARGET = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Pins' of 'Exception Handler'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXCEPTION_HANDLER__RESULT_PINS = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exception Body' of 'Exception Handler'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXCEPTION_HANDLER__EXCEPTION_BODY = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Action Referenced' of 'Action Execution Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION_EXECUTION_SPECIFICATION__ACTION_REFERENCED = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Lifeline' of 'Execution Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXECUTION_SPECIFICATION__SAME_LIFELINE = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Interaction Uses Share Lifeline' of 'Lifeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIFELINE__INTERACTION_USES_SHARE_LIFELINE = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Classifier' of 'Lifeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIFELINE__SAME_CLASSIFIER = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Selector Specified' of 'Lifeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIFELINE__SELECTOR_SPECIFIED = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Parts Of Internal Structures' of 'Part Decomposition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PART_DECOMPOSITION__PARTS_OF_INTERNAL_STRUCTURES = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Assume' of 'Part Decomposition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PART_DECOMPOSITION__ASSUME = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Commutativity Of Decomposition' of 'Part Decomposition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PART_DECOMPOSITION__COMMUTATIVITY_OF_DECOMPOSITION = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Lifelines' of 'Interaction Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_USE__ALL_LIFELINES = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Return Value Recipient Coverage' of 'Interaction Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_USE__RETURN_VALUE_RECIPIENT_COVERAGE = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Arguments Correspond To Parameters' of 'Interaction Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_USE__ARGUMENTS_CORRESPOND_TO_PARAMETERS = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Gates Match' of 'Interaction Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_USE__GATES_MATCH = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Arguments Are Constants' of 'Interaction Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_USE__ARGUMENTS_ARE_CONSTANTS = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Return Value Type Recipient Correspondence' of 'Interaction Use'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_USE__RETURN_VALUE_TYPE_RECIPIENT_CORRESPONDENCE = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Messages Combined Fragment' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__MESSAGES_COMBINED_FRAGMENT = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Messages Actual Gate' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__MESSAGES_ACTUAL_GATE = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sending Receiving Message Event' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SENDING_RECEIVING_MESSAGE_EVENT = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Occurrence Specifications' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__OCCURRENCE_SPECIFICATIONS = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Is Signal' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SIGNATURE_IS_SIGNAL = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Is Operation' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SIGNATURE_IS_OPERATION = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Arguments' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__ARGUMENTS = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cannot Cross Boundaries' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__CANNOT_CROSS_BOUNDARIES = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Refer To' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SIGNATURE_REFER_TO = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Guard Directly Prior' of 'Interaction Operand'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_OPERAND__GUARD_DIRECTLY_PRIOR = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Guard Contain References' of 'Interaction Operand'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_OPERAND__GUARD_CONTAIN_REFERENCES = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Maxint Positive' of 'Interaction Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_CONSTRAINT__MAXINT_POSITIVE = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Minint Maxint' of 'Interaction Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_CONSTRAINT__MININT_MAXINT = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Minint Non Negative' of 'Interaction Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_CONSTRAINT__MININT_NON_NEGATIVE = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global Data' of 'Interaction Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_CONSTRAINT__GLOBAL_DATA = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Maxint Greater Equal Minint' of 'Interaction Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_CONSTRAINT__MAXINT_GREATER_EQUAL_MININT = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dynamic Variables' of 'Interaction Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION_CONSTRAINT__DYNAMIC_VARIABLES = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Irreflexsive Transitive Closure' of 'General Ordering'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_ORDERING__IRREFLEXSIVE_TRANSITIVE_CLOSURE = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Pin' of 'Action Input Pin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION_INPUT_PIN__INPUT_PIN = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Control Or Data Flow' of 'Action Input Pin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION_INPUT_PIN__NO_CONTROL_OR_DATA_FLOW = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Output Pin' of 'Action Input Pin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION_INPUT_PIN__ONE_OUTPUT_PIN = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Outgoing Edges' of 'Final Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FINAL_NODE__NO_OUTGOING_EDGES = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Maximum One Parameter Node' of 'Activity Parameter Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARAMETER_NODE__MAXIMUM_ONE_PARAMETER_NODE = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Maximum Two Parameter Nodes' of 'Activity Parameter Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARAMETER_NODE__MAXIMUM_TWO_PARAMETER_NODES = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Edges' of 'Activity Parameter Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARAMETER_NODE__NO_EDGES = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Incoming Edges' of 'Activity Parameter Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARAMETER_NODE__NO_INCOMING_EDGES = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Outgoing Edges' of 'Activity Parameter Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARAMETER_NODE__NO_OUTGOING_EDGES = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type' of 'Activity Parameter Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARAMETER_NODE__SAME_TYPE = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Parameters' of 'Activity Parameter Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVITY_PARAMETER_NODE__HAS_PARAMETERS = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Associations' of 'Actor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTOR__ASSOCIATIONS = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'Actor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTOR__MUST_HAVE_NAME = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unlimited Natural And Multiplicity' of 'Add Structural Feature Value Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__UNLIMITED_NATURAL_AND_MULTIPLICITY = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Required Value' of 'Add Structural Feature Value Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REQUIRED_VALUE = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Pin' of 'Write Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRITE_STRUCTURAL_FEATURE_ACTION__INPUT_PIN = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Of Result' of 'Write Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRITE_STRUCTURAL_FEATURE_ACTION__TYPE_OF_RESULT = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Result' of 'Write Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRITE_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY_OF_RESULT = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Visibility' of 'Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURAL_FEATURE_ACTION__VISIBILITY = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURAL_FEATURE_ACTION__MULTIPLICITY = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Static' of 'Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURAL_FEATURE_ACTION__NOT_STATIC = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Featuring Classifier' of 'Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURAL_FEATURE_ACTION__ONE_FEATURING_CLASSIFIER = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type' of 'Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURAL_FEATURE_ACTION__SAME_TYPE = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Required Value' of 'Add Variable Value Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADD_VARIABLE_VALUE_ACTION__REQUIRED_VALUE = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Single Input Pin' of 'Add Variable Value Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADD_VARIABLE_VALUE_ACTION__SINGLE_INPUT_PIN = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Write Variable Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRITE_VARIABLE_ACTION__MULTIPLICITY = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type' of 'Write Variable Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRITE_VARIABLE_ACTION__SAME_TYPE = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Scope Of Variable' of 'Variable Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE_ACTION__SCOPE_OF_VARIABLE = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Disjoint Attributes Ends' of 'Association Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSOCIATION_CLASS__DISJOINT_ATTRIBUTES_ENDS = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cannot Be Defined' of 'Association Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSOCIATION_CLASS__CANNOT_BE_DEFINED = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Ordering Multiplicity' of 'Broadcast Signal Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BROADCAST_SIGNAL_ACTION__TYPE_ORDERING_MULTIPLICITY = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number And Order' of 'Broadcast Signal Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BROADCAST_SIGNAL_ACTION__NUMBER_AND_ORDER = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'On Port Receiver' of 'Invocation Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INVOCATION_ACTION__ON_PORT_RECEIVER = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Synchronous Call' of 'Call Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_ACTION__SYNCHRONOUS_CALL = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number And Order' of 'Call Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_ACTION__NUMBER_AND_ORDER = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Ordering Multiplicity' of 'Call Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_ACTION__TYPE_ORDERING_MULTIPLICITY = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Pin Equal Parameter' of 'Call Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_BEHAVIOR_ACTION__RESULT_PIN_EQUAL_PARAMETER = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Argument Pin Equal Parameter' of 'Call Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_BEHAVIOR_ACTION__ARGUMENT_PIN_EQUAL_PARAMETER = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Argument Pin Equal Parameter' of 'Call Operation Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_OPERATION_ACTION__ARGUMENT_PIN_EQUAL_PARAMETER = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Pin Equal Parameter' of 'Call Operation Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_OPERATION_ACTION__RESULT_PIN_EQUAL_PARAMETER = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Target Pin' of 'Call Operation Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_OPERATION_ACTION__TYPE_TARGET_PIN = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Test And Body' of 'Clause'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLAUSE__TEST_AND_BODY = 258;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Body Output Pins' of 'Clause'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLAUSE__BODY_OUTPUT_PINS = 259;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Decider Output' of 'Clause'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLAUSE__DECIDER_OUTPUT = 260;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Clear Association Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLEAR_ASSOCIATION_ACTION__MULTIPLICITY = 261;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type' of 'Clear Association Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLEAR_ASSOCIATION_ACTION__SAME_TYPE = 262;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Result' of 'Clear Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLEAR_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY_OF_RESULT = 263;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Of Result' of 'Clear Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLEAR_STRUCTURAL_FEATURE_ACTION__TYPE_OF_RESULT = 264;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Break ' of 'Combined Fragment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMBINED_FRAGMENT__BREAK_ = 265;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Opt Loop Break Neg' of 'Combined Fragment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMBINED_FRAGMENT__OPT_LOOP_BREAK_NEG = 266;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Consider And Ignore' of 'Combined Fragment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMBINED_FRAGMENT__CONSIDER_AND_IGNORE = 267;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Minint And Maxint' of 'Combined Fragment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMBINED_FRAGMENT__MININT_AND_MAXINT = 268;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Packaged Elements' of 'Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT__NO_PACKAGED_ELEMENTS = 269;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Nested Classifiers' of 'Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT__NO_NESTED_CLASSIFIERS = 270;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Executable Nodes' of 'Conditional Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_NODE__EXECUTABLE_NODES = 271;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Clause No Predecessor' of 'Conditional Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_NODE__CLAUSE_NO_PREDECESSOR = 272;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Matching Output Pins' of 'Conditional Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_NODE__MATCHING_OUTPUT_PINS = 273;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Clause With Executable Node' of 'Conditional Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_NODE__ONE_CLAUSE_WITH_EXECUTABLE_NODE = 274;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result No Incoming' of 'Conditional Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_NODE__RESULT_NO_INCOMING = 275;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Input Pins' of 'Conditional Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_NODE__NO_INPUT_PINS = 276;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type' of 'Consider Ignore Fragment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSIDER_IGNORE_FRAGMENT__TYPE = 277;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Consider Or Ignore' of 'Consider Ignore Fragment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSIDER_IGNORE_FRAGMENT__CONSIDER_OR_IGNORE = 278;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Name' of 'Continuation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUATION__SAME_NAME = 279;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'First Or Last Interaction Fragment' of 'Continuation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUATION__FIRST_OR_LAST_INTERACTION_FRAGMENT = 280;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global' of 'Continuation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUATION__GLOBAL = 281;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Object Nodes' of 'Control Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL_FLOW__OBJECT_NODES = 282;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Association Not Abstract' of 'Create Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_LINK_ACTION__ASSOCIATION_NOT_ABSTRACT = 283;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allow Access' of 'Write Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRITE_LINK_ACTION__ALLOW_ACCESS = 284;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Pins' of 'Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_ACTION__SAME_PINS = 285;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Association' of 'Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_ACTION__SAME_ASSOCIATION = 286;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Static' of 'Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_ACTION__NOT_STATIC = 287;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Property Is Association End' of 'Link End Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_DATA__PROPERTY_IS_ASSOCIATION_END = 288;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'End Object Input Pin' of 'Link End Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_DATA__END_OBJECT_INPUT_PIN = 289;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type' of 'Link End Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_DATA__SAME_TYPE = 290;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Link End Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_DATA__MULTIPLICITY = 291;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Qualifiers' of 'Link End Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_DATA__QUALIFIERS = 292;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Qualifier Attribute' of 'Qualifier Value'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALIFIER_VALUE__QUALIFIER_ATTRIBUTE = 293;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Qualifier' of 'Qualifier Value'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALIFIER_VALUE__MULTIPLICITY_OF_QUALIFIER = 294;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Of Qualifier' of 'Qualifier Value'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUALIFIER_VALUE__TYPE_OF_QUALIFIER = 295;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Create Link Action' of 'Link End Creation Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_CREATION_DATA__CREATE_LINK_ACTION = 296;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Single Input Pin' of 'Link End Creation Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_CREATION_DATA__SINGLE_INPUT_PIN = 297;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Association Class' of 'Create Link Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_LINK_OBJECT_ACTION__ASSOCIATION_CLASS = 298;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Of Result' of 'Create Link Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_LINK_OBJECT_ACTION__TYPE_OF_RESULT = 299;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Create Link Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_LINK_OBJECT_ACTION__MULTIPLICITY = 300;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Classifier Not Association Class' of 'Create Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_OBJECT_ACTION__CLASSIFIER_NOT_ASSOCIATION_CLASS = 301;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Classifier Not Abstract' of 'Create Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_OBJECT_ACTION__CLASSIFIER_NOT_ABSTRACT = 302;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type' of 'Create Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_OBJECT_ACTION__SAME_TYPE = 303;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Create Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREATE_OBJECT_ACTION__MULTIPLICITY = 304;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Parameters' of 'Decision Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION_NODE__PARAMETERS = 305;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Incoming Object One Input Parameter' of 'Decision Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION_NODE__INCOMING_OBJECT_ONE_INPUT_PARAMETER = 306;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Incoming Outgoing Edges' of 'Decision Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION_NODE__INCOMING_OUTGOING_EDGES = 307;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Incoming Control One Input Parameter' of 'Decision Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION_NODE__INCOMING_CONTROL_ONE_INPUT_PARAMETER = 308;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Two Input Parameters' of 'Decision Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION_NODE__TWO_INPUT_PARAMETERS = 309;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Decision Input Flow Incoming' of 'Decision Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION_NODE__DECISION_INPUT_FLOW_INCOMING = 310;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Zero Input Parameters' of 'Decision Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION_NODE__ZERO_INPUT_PARAMETERS = 311;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Edges' of 'Decision Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DECISION_NODE__EDGES = 312;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is Multicast Or Is Multireceive' of 'Object Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FLOW__IS_MULTICAST_OR_IS_MULTIRECEIVE = 313;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Selection Behaviour' of 'Object Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FLOW__SELECTION_BEHAVIOUR = 314;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Compatible Types' of 'Object Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FLOW__COMPATIBLE_TYPES = 315;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Actions' of 'Object Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FLOW__NO_ACTIONS = 316;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input And Output Parameter' of 'Object Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FLOW__INPUT_AND_OUTPUT_PARAMETER = 317;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Transformation Behaviour' of 'Object Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FLOW__TRANSFORMATION_BEHAVIOUR = 318;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target' of 'Object Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FLOW__TARGET = 319;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Upper Bounds' of 'Object Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_FLOW__SAME_UPPER_BOUNDS = 320;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Destroy Link Action' of 'Link End Destruction Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_DESTRUCTION_DATA__DESTROY_LINK_ACTION = 321;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unlimited Natural And Multiplicity' of 'Link End Destruction Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK_END_DESTRUCTION_DATA__UNLIMITED_NATURAL_AND_MULTIPLICITY = 322;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Destroy Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESTROY_OBJECT_ACTION__MULTIPLICITY = 323;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Type' of 'Destroy Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESTROY_OBJECT_ACTION__NO_TYPE = 324;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Occurrence Specifications Below' of 'Destruction Occurrence Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESTRUCTION_OCCURRENCE_SPECIFICATION__NO_OCCURRENCE_SPECIFICATIONS_BELOW = 325;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Internal Structure' of 'Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NODE__INTERNAL_STRUCTURE = 326;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'First Event Multiplicity' of 'Duration Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DURATION_CONSTRAINT__FIRST_EVENT_MULTIPLICITY = 327;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'First Event Multiplicity' of 'Duration Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DURATION_OBSERVATION__FIRST_EVENT_MULTIPLICITY = 328;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Region As Input Or Output' of 'Expansion Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXPANSION_NODE__REGION_AS_INPUT_OR_OUTPUT = 329;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Expansion Nodes' of 'Expansion Region'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXPANSION_REGION__EXPANSION_NODES = 330;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Outgoing Transitions' of 'Final State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FINAL_STATE__NO_OUTGOING_TRANSITIONS = 331;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cannot Reference Submachine' of 'Final State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FINAL_STATE__CANNOT_REFERENCE_SUBMACHINE = 332;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Exit Behavior' of 'Final State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FINAL_STATE__NO_EXIT_BEHAVIOR = 333;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Entry Behavior' of 'Final State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FINAL_STATE__NO_ENTRY_BEHAVIOR = 334;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No State Behavior' of 'Final State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FINAL_STATE__NO_STATE_BEHAVIOR = 335;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Regions' of 'Final State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FINAL_STATE__NO_REGIONS = 336;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Edges' of 'Fork Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORK_NODE__EDGES = 337;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Incoming Edge' of 'Fork Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORK_NODE__ONE_INCOMING_EDGE = 338;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Output Parameter' of 'Function Behavior'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTION_BEHAVIOR__ONE_OUTPUT_PARAMETER = 339;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Types Of Parameters' of 'Function Behavior'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTION_BEHAVIOR__TYPES_OF_PARAMETERS = 340;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sources And Targets Kind' of 'Information Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_FLOW__SOURCES_AND_TARGETS_KIND = 341;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Conform' of 'Information Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_FLOW__MUST_CONFORM = 342;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Convey Classifiers' of 'Information Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_FLOW__CONVEY_CLASSIFIERS = 343;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has No' of 'Information Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_ITEM__HAS_NO = 344;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Instantiable' of 'Information Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_ITEM__NOT_INSTANTIABLE = 345;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sources And Targets' of 'Information Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMATION_ITEM__SOURCES_AND_TARGETS = 346;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Incoming Edges' of 'Initial Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INITIAL_NODE__NO_INCOMING_EDGES = 347;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Control Edges' of 'Initial Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INITIAL_NODE__CONTROL_EDGES = 348;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Outgoing Edge' of 'Join Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JOIN_NODE__ONE_OUTGOING_EDGE = 349;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Incoming Object Flow' of 'Join Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int JOIN_NODE__INCOMING_OBJECT_FLOW = 350;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Executable Nodes' of 'Loop Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOOP_NODE__EXECUTABLE_NODES = 351;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Body Output Pins' of 'Loop Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOOP_NODE__BODY_OUTPUT_PINS = 352;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result No Incoming' of 'Loop Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOOP_NODE__RESULT_NO_INCOMING = 353;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Edges' of 'Loop Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOOP_NODE__INPUT_EDGES = 354;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Outgoing Edge' of 'Merge Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MERGE_NODE__ONE_OUTGOING_EDGE = 355;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Edges' of 'Merge Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MERGE_NODE__EDGES = 356;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Refers To Operation' of 'Protocol Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL_TRANSITION__REFERS_TO_OPERATION = 357;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Associated Actions' of 'Protocol Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL_TRANSITION__ASSOCIATED_ACTIONS = 358;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Belongs To Psm' of 'Protocol Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL_TRANSITION__BELONGS_TO_PSM = 359;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Is Classifier' of 'Read Extent Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_EXTENT_ACTION__TYPE_IS_CLASSIFIER = 360;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Result' of 'Read Extent Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_EXTENT_ACTION__MULTIPLICITY_OF_RESULT = 361;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Type' of 'Read Is Classified Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_IS_CLASSIFIED_OBJECT_ACTION__NO_TYPE = 362;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Output' of 'Read Is Classified Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_IS_CLASSIFIED_OBJECT_ACTION__MULTIPLICITY_OF_OUTPUT = 363;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Boolean Result' of 'Read Is Classified Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_IS_CLASSIFIED_OBJECT_ACTION__BOOLEAN_RESULT = 364;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Input' of 'Read Is Classified Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_IS_CLASSIFIED_OBJECT_ACTION__MULTIPLICITY_OF_INPUT = 365;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type And Ordering' of 'Read Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_ACTION__TYPE_AND_ORDERING = 366;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Open End' of 'Read Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_ACTION__ONE_OPEN_END = 367;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Compatible Multiplicity' of 'Read Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_ACTION__COMPATIBLE_MULTIPLICITY = 368;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Navigable Open End' of 'Read Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_ACTION__NAVIGABLE_OPEN_END = 369;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Visibility' of 'Read Link Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_ACTION__VISIBILITY = 370;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Association Of Association' of 'Read Link Object End Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_ACTION__ASSOCIATION_OF_ASSOCIATION = 371;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Object' of 'Read Link Object End Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_ACTION__MULTIPLICITY_OF_OBJECT = 372;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Of Result' of 'Read Link Object End Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_ACTION__TYPE_OF_RESULT = 373;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Of Object' of 'Read Link Object End Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_ACTION__TYPE_OF_OBJECT = 374;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Property' of 'Read Link Object End Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_ACTION__PROPERTY = 375;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Result' of 'Read Link Object End Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_ACTION__MULTIPLICITY_OF_RESULT = 376;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ends Of Association' of 'Read Link Object End Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_ACTION__ENDS_OF_ASSOCIATION = 377;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Of Object' of 'Read Link Object End Qualifier Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_QUALIFIER_ACTION__TYPE_OF_OBJECT = 378;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Result' of 'Read Link Object End Qualifier Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_RESULT = 379;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type' of 'Read Link Object End Qualifier Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_QUALIFIER_ACTION__SAME_TYPE = 380;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ends Of Association' of 'Read Link Object End Qualifier Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_QUALIFIER_ACTION__ENDS_OF_ASSOCIATION = 381;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Qualifier' of 'Read Link Object End Qualifier Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_QUALIFIER = 382;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Object' of 'Read Link Object End Qualifier Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_OBJECT = 383;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Association Of Association' of 'Read Link Object End Qualifier Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_QUALIFIER_ACTION__ASSOCIATION_OF_ASSOCIATION = 384;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Qualifier Attribute' of 'Read Link Object End Qualifier Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER_ATTRIBUTE = 385;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contained' of 'Read Self Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_SELF_ACTION__CONTAINED = 386;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type' of 'Read Self Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_SELF_ACTION__TYPE = 387;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Static' of 'Read Self Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_SELF_ACTION__NOT_STATIC = 388;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Read Self Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_SELF_ACTION__MULTIPLICITY = 389;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type And Ordering' of 'Read Structural Feature Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_STRUCTURAL_FEATURE_ACTION__TYPE_AND_ORDERING = 390;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type And Ordering' of 'Read Variable Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_VARIABLE_ACTION__TYPE_AND_ORDERING = 391;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Compatible Multiplicity' of 'Read Variable Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READ_VARIABLE_ACTION__COMPATIBLE_MULTIPLICITY = 392;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Pin' of 'Reclassify Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECLASSIFY_OBJECT_ACTION__INPUT_PIN = 393;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Reclassify Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECLASSIFY_OBJECT_ACTION__MULTIPLICITY = 394;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Classifier Not Abstract' of 'Reclassify Object Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECLASSIFY_OBJECT_ACTION__CLASSIFIER_NOT_ABSTRACT = 395;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Types Are Compatible' of 'Reduce Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDUCE_ACTION__OUTPUT_TYPES_ARE_COMPATIBLE = 396;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reducer Inputs Output' of 'Reduce Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDUCE_ACTION__REDUCER_INPUTS_OUTPUT = 397;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Type Is Collection' of 'Reduce Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REDUCE_ACTION__INPUT_TYPE_IS_COLLECTION = 398;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Unique Removal' of 'Remove Structural Feature Value Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NON_UNIQUE_REMOVAL = 399;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unlimited Natural' of 'Remove Variable Value Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REMOVE_VARIABLE_VALUE_ACTION__UNLIMITED_NATURAL = 400;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Event On Reply To Call Trigger' of 'Reply Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPLY_ACTION__EVENT_ON_REPLY_TO_CALL_TRIGGER = 401;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Pins Match Parameter' of 'Reply Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPLY_ACTION__PINS_MATCH_PARAMETER = 402;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Ordering Multiplicity' of 'Send Signal Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEND_SIGNAL_ACTION__TYPE_ORDERING_MULTIPLICITY = 403;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Order' of 'Send Signal Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEND_SIGNAL_ACTION__NUMBER_ORDER = 404;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Has Classifier' of 'Start Classifier Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_CLASSIFIER_BEHAVIOR_ACTION__TYPE_HAS_CLASSIFIER = 405;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Start Classifier Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_CLASSIFIER_BEHAVIOR_ACTION__MULTIPLICITY = 406;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Order Arguments' of 'Start Object Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_OBJECT_BEHAVIOR_ACTION__NUMBER_ORDER_ARGUMENTS = 407;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Ordering Multiplicity Match' of 'Start Object Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_OBJECT_BEHAVIOR_ACTION__TYPE_ORDERING_MULTIPLICITY_MATCH = 408;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Order Results' of 'Start Object Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_OBJECT_BEHAVIOR_ACTION__NUMBER_ORDER_RESULTS = 409;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Of Object' of 'Start Object Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_OBJECT_BEHAVIOR_ACTION__TYPE_OF_OBJECT = 410;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Object' of 'Start Object Behavior Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_OBJECT_BEHAVIOR_ACTION__MULTIPLICITY_OF_OBJECT = 411;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Test Identity Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEST_IDENTITY_ACTION__MULTIPLICITY = 412;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Type' of 'Test Identity Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEST_IDENTITY_ACTION__NO_TYPE = 413;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Is Boolean' of 'Test Identity Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEST_IDENTITY_ACTION__RESULT_IS_BOOLEAN = 414;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Starting Time' of 'Time Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_EVENT__STARTING_TIME = 415;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'When Non Negative' of 'Time Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_EVENT__WHEN_NON_NEGATIVE = 416;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Type' of 'Unmarshall Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNMARSHALL_ACTION__SAME_TYPE = 417;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Structural Feature' of 'Unmarshall Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNMARSHALL_ACTION__STRUCTURAL_FEATURE = 418;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Object' of 'Unmarshall Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNMARSHALL_ACTION__MULTIPLICITY_OF_OBJECT = 419;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type And Ordering' of 'Unmarshall Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNMARSHALL_ACTION__TYPE_AND_ORDERING = 420;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Result' of 'Unmarshall Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNMARSHALL_ACTION__NUMBER_OF_RESULT = 421;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unmarshall Type Is Classifier' of 'Unmarshall Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNMARSHALL_ACTION__UNMARSHALL_TYPE_IS_CLASSIFIER = 422;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity Of Result' of 'Unmarshall Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNMARSHALL_ACTION__MULTIPLICITY_OF_RESULT = 423;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Compatible Type' of 'Value Pin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_PIN__COMPATIBLE_TYPE = 424;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Incoming Edges' of 'Value Pin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_PIN__NO_INCOMING_EDGES = 425;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiplicity' of 'Value Specification Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_SPECIFICATION_ACTION__MULTIPLICITY = 426;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Compatible Type' of 'Value Specification Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_SPECIFICATION_ACTION__COMPATIBLE_TYPE = 427;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 427;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return UmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case UmlPackage.ABSTRACTION:
				return validateAbstraction((Abstraction)value, diagnostics, context);
			case UmlPackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case UmlPackage.PACKAGEABLE_ELEMENT:
				return validatePackageableElement((PackageableElement)value, diagnostics, context);
			case UmlPackage.PARAMETERABLE_ELEMENT:
				return validateParameterableElement((ParameterableElement)value, diagnostics, context);
			case UmlPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case UmlPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case UmlPackage.STEREOTYPE:
				return validateStereotype((Stereotype)value, diagnostics, context);
			case UmlPackage.CLASS:
				return validateClass((uml.Class)value, diagnostics, context);
			case UmlPackage.ENCAPSULATED_CLASSIFIER:
				return validateEncapsulatedClassifier((EncapsulatedClassifier)value, diagnostics, context);
			case UmlPackage.STRUCTURED_CLASSIFIER:
				return validateStructuredClassifier((StructuredClassifier)value, diagnostics, context);
			case UmlPackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case UmlPackage.NAMESPACE:
				return validateNamespace((Namespace)value, diagnostics, context);
			case UmlPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case UmlPackage.STRING_EXPRESSION:
				return validateStringExpression((StringExpression)value, diagnostics, context);
			case UmlPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case UmlPackage.VALUE_SPECIFICATION:
				return validateValueSpecification((ValueSpecification)value, diagnostics, context);
			case UmlPackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case UmlPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case UmlPackage.PACKAGE:
				return validatePackage((uml.Package)value, diagnostics, context);
			case UmlPackage.TEMPLATEABLE_ELEMENT:
				return validateTemplateableElement((TemplateableElement)value, diagnostics, context);
			case UmlPackage.TEMPLATE_SIGNATURE:
				return validateTemplateSignature((TemplateSignature)value, diagnostics, context);
			case UmlPackage.TEMPLATE_PARAMETER:
				return validateTemplateParameter((TemplateParameter)value, diagnostics, context);
			case UmlPackage.TEMPLATE_BINDING:
				return validateTemplateBinding((TemplateBinding)value, diagnostics, context);
			case UmlPackage.DIRECTED_RELATIONSHIP:
				return validateDirectedRelationship((DirectedRelationship)value, diagnostics, context);
			case UmlPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION:
				return validateTemplateParameterSubstitution((TemplateParameterSubstitution)value, diagnostics, context);
			case UmlPackage.PACKAGE_MERGE:
				return validatePackageMerge((PackageMerge)value, diagnostics, context);
			case UmlPackage.PROFILE_APPLICATION:
				return validateProfileApplication((ProfileApplication)value, diagnostics, context);
			case UmlPackage.PROFILE:
				return validateProfile((Profile)value, diagnostics, context);
			case UmlPackage.ELEMENT_IMPORT:
				return validateElementImport((ElementImport)value, diagnostics, context);
			case UmlPackage.PACKAGE_IMPORT:
				return validatePackageImport((PackageImport)value, diagnostics, context);
			case UmlPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case UmlPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case UmlPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case UmlPackage.STRUCTURAL_FEATURE:
				return validateStructuralFeature((StructuralFeature)value, diagnostics, context);
			case UmlPackage.MULTIPLICITY_ELEMENT:
				return validateMultiplicityElement((MultiplicityElement)value, diagnostics, context);
			case UmlPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case UmlPackage.REDEFINABLE_ELEMENT:
				return validateRedefinableElement((RedefinableElement)value, diagnostics, context);
			case UmlPackage.CONNECTABLE_ELEMENT:
				return validateConnectableElement((ConnectableElement)value, diagnostics, context);
			case UmlPackage.CONNECTOR_END:
				return validateConnectorEnd((ConnectorEnd)value, diagnostics, context);
			case UmlPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER:
				return validateConnectableElementTemplateParameter((ConnectableElementTemplateParameter)value, diagnostics, context);
			case UmlPackage.DEPLOYMENT_TARGET:
				return validateDeploymentTarget((DeploymentTarget)value, diagnostics, context);
			case UmlPackage.DEPLOYMENT:
				return validateDeployment((Deployment)value, diagnostics, context);
			case UmlPackage.DEPLOYMENT_SPECIFICATION:
				return validateDeploymentSpecification((DeploymentSpecification)value, diagnostics, context);
			case UmlPackage.ARTIFACT:
				return validateArtifact((Artifact)value, diagnostics, context);
			case UmlPackage.DEPLOYED_ARTIFACT:
				return validateDeployedArtifact((DeployedArtifact)value, diagnostics, context);
			case UmlPackage.MANIFESTATION:
				return validateManifestation((Manifestation)value, diagnostics, context);
			case UmlPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case UmlPackage.BEHAVIORAL_FEATURE:
				return validateBehavioralFeature((BehavioralFeature)value, diagnostics, context);
			case UmlPackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case UmlPackage.BEHAVIORED_CLASSIFIER:
				return validateBehavioredClassifier((BehavioredClassifier)value, diagnostics, context);
			case UmlPackage.INTERFACE_REALIZATION:
				return validateInterfaceRealization((InterfaceRealization)value, diagnostics, context);
			case UmlPackage.REALIZATION:
				return validateRealization((Realization)value, diagnostics, context);
			case UmlPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case UmlPackage.RECEPTION:
				return validateReception((Reception)value, diagnostics, context);
			case UmlPackage.SIGNAL:
				return validateSignal((Signal)value, diagnostics, context);
			case UmlPackage.PROTOCOL_STATE_MACHINE:
				return validateProtocolStateMachine((ProtocolStateMachine)value, diagnostics, context);
			case UmlPackage.STATE_MACHINE:
				return validateStateMachine((StateMachine)value, diagnostics, context);
			case UmlPackage.PSEUDOSTATE:
				return validatePseudostate((Pseudostate)value, diagnostics, context);
			case UmlPackage.VERTEX:
				return validateVertex((Vertex)value, diagnostics, context);
			case UmlPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case UmlPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case UmlPackage.CONNECTION_POINT_REFERENCE:
				return validateConnectionPointReference((ConnectionPointReference)value, diagnostics, context);
			case UmlPackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case UmlPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case UmlPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case UmlPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case UmlPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case UmlPackage.PROTOCOL_CONFORMANCE:
				return validateProtocolConformance((ProtocolConformance)value, diagnostics, context);
			case UmlPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case UmlPackage.PARAMETER_SET:
				return validateParameterSet((ParameterSet)value, diagnostics, context);
			case UmlPackage.OPERATION_TEMPLATE_PARAMETER:
				return validateOperationTemplateParameter((OperationTemplateParameter)value, diagnostics, context);
			case UmlPackage.EXTENSION_END:
				return validateExtensionEnd((ExtensionEnd)value, diagnostics, context);
			case UmlPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case UmlPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case UmlPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case UmlPackage.INSTANCE_SPECIFICATION:
				return validateInstanceSpecification((InstanceSpecification)value, diagnostics, context);
			case UmlPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case UmlPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case UmlPackage.USAGE:
				return validateUsage((Usage)value, diagnostics, context);
			case UmlPackage.COLLABORATION_USE:
				return validateCollaborationUse((CollaborationUse)value, diagnostics, context);
			case UmlPackage.COLLABORATION:
				return validateCollaboration((Collaboration)value, diagnostics, context);
			case UmlPackage.GENERALIZATION:
				return validateGeneralization((Generalization)value, diagnostics, context);
			case UmlPackage.GENERALIZATION_SET:
				return validateGeneralizationSet((GeneralizationSet)value, diagnostics, context);
			case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE:
				return validateRedefinableTemplateSignature((RedefinableTemplateSignature)value, diagnostics, context);
			case UmlPackage.USE_CASE:
				return validateUseCase((UseCase)value, diagnostics, context);
			case UmlPackage.EXTEND:
				return validateExtend((Extend)value, diagnostics, context);
			case UmlPackage.EXTENSION_POINT:
				return validateExtensionPoint((ExtensionPoint)value, diagnostics, context);
			case UmlPackage.INCLUDE:
				return validateInclude((Include)value, diagnostics, context);
			case UmlPackage.SUBSTITUTION:
				return validateSubstitution((Substitution)value, diagnostics, context);
			case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER:
				return validateClassifierTemplateParameter((ClassifierTemplateParameter)value, diagnostics, context);
			case UmlPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case UmlPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case UmlPackage.OPAQUE_EXPRESSION:
				return validateOpaqueExpression((OpaqueExpression)value, diagnostics, context);
			case UmlPackage.ACCEPT_CALL_ACTION:
				return validateAcceptCallAction((AcceptCallAction)value, diagnostics, context);
			case UmlPackage.ACCEPT_EVENT_ACTION:
				return validateAcceptEventAction((AcceptEventAction)value, diagnostics, context);
			case UmlPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case UmlPackage.EXECUTABLE_NODE:
				return validateExecutableNode((ExecutableNode)value, diagnostics, context);
			case UmlPackage.ACTIVITY_NODE:
				return validateActivityNode((ActivityNode)value, diagnostics, context);
			case UmlPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case UmlPackage.ACTIVITY_GROUP:
				return validateActivityGroup((ActivityGroup)value, diagnostics, context);
			case UmlPackage.ACTIVITY_EDGE:
				return validateActivityEdge((ActivityEdge)value, diagnostics, context);
			case UmlPackage.ACTIVITY_PARTITION:
				return validateActivityPartition((ActivityPartition)value, diagnostics, context);
			case UmlPackage.STRUCTURED_ACTIVITY_NODE:
				return validateStructuredActivityNode((StructuredActivityNode)value, diagnostics, context);
			case UmlPackage.INPUT_PIN:
				return validateInputPin((InputPin)value, diagnostics, context);
			case UmlPackage.PIN:
				return validatePin((Pin)value, diagnostics, context);
			case UmlPackage.OBJECT_NODE:
				return validateObjectNode((ObjectNode)value, diagnostics, context);
			case UmlPackage.OUTPUT_PIN:
				return validateOutputPin((OutputPin)value, diagnostics, context);
			case UmlPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION:
				return validateInterruptibleActivityRegion((InterruptibleActivityRegion)value, diagnostics, context);
			case UmlPackage.EXCEPTION_HANDLER:
				return validateExceptionHandler((ExceptionHandler)value, diagnostics, context);
			case UmlPackage.ACTION_EXECUTION_SPECIFICATION:
				return validateActionExecutionSpecification((ActionExecutionSpecification)value, diagnostics, context);
			case UmlPackage.EXECUTION_SPECIFICATION:
				return validateExecutionSpecification((ExecutionSpecification)value, diagnostics, context);
			case UmlPackage.INTERACTION_FRAGMENT:
				return validateInteractionFragment((InteractionFragment)value, diagnostics, context);
			case UmlPackage.LIFELINE:
				return validateLifeline((Lifeline)value, diagnostics, context);
			case UmlPackage.PART_DECOMPOSITION:
				return validatePartDecomposition((PartDecomposition)value, diagnostics, context);
			case UmlPackage.INTERACTION_USE:
				return validateInteractionUse((InteractionUse)value, diagnostics, context);
			case UmlPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case UmlPackage.MESSAGE_END:
				return validateMessageEnd((MessageEnd)value, diagnostics, context);
			case UmlPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case UmlPackage.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case UmlPackage.INTERACTION_OPERAND:
				return validateInteractionOperand((InteractionOperand)value, diagnostics, context);
			case UmlPackage.INTERACTION_CONSTRAINT:
				return validateInteractionConstraint((InteractionConstraint)value, diagnostics, context);
			case UmlPackage.GENERAL_ORDERING:
				return validateGeneralOrdering((GeneralOrdering)value, diagnostics, context);
			case UmlPackage.OCCURRENCE_SPECIFICATION:
				return validateOccurrenceSpecification((OccurrenceSpecification)value, diagnostics, context);
			case UmlPackage.ACTION_INPUT_PIN:
				return validateActionInputPin((ActionInputPin)value, diagnostics, context);
			case UmlPackage.ACTIVITY_FINAL_NODE:
				return validateActivityFinalNode((ActivityFinalNode)value, diagnostics, context);
			case UmlPackage.FINAL_NODE:
				return validateFinalNode((FinalNode)value, diagnostics, context);
			case UmlPackage.CONTROL_NODE:
				return validateControlNode((ControlNode)value, diagnostics, context);
			case UmlPackage.ACTIVITY_PARAMETER_NODE:
				return validateActivityParameterNode((ActivityParameterNode)value, diagnostics, context);
			case UmlPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				return validateAddStructuralFeatureValueAction((AddStructuralFeatureValueAction)value, diagnostics, context);
			case UmlPackage.WRITE_STRUCTURAL_FEATURE_ACTION:
				return validateWriteStructuralFeatureAction((WriteStructuralFeatureAction)value, diagnostics, context);
			case UmlPackage.STRUCTURAL_FEATURE_ACTION:
				return validateStructuralFeatureAction((StructuralFeatureAction)value, diagnostics, context);
			case UmlPackage.ADD_VARIABLE_VALUE_ACTION:
				return validateAddVariableValueAction((AddVariableValueAction)value, diagnostics, context);
			case UmlPackage.WRITE_VARIABLE_ACTION:
				return validateWriteVariableAction((WriteVariableAction)value, diagnostics, context);
			case UmlPackage.VARIABLE_ACTION:
				return validateVariableAction((VariableAction)value, diagnostics, context);
			case UmlPackage.ANY_RECEIVE_EVENT:
				return validateAnyReceiveEvent((AnyReceiveEvent)value, diagnostics, context);
			case UmlPackage.MESSAGE_EVENT:
				return validateMessageEvent((MessageEvent)value, diagnostics, context);
			case UmlPackage.ASSOCIATION_CLASS:
				return validateAssociationClass((AssociationClass)value, diagnostics, context);
			case UmlPackage.BEHAVIOR_EXECUTION_SPECIFICATION:
				return validateBehaviorExecutionSpecification((BehaviorExecutionSpecification)value, diagnostics, context);
			case UmlPackage.BROADCAST_SIGNAL_ACTION:
				return validateBroadcastSignalAction((BroadcastSignalAction)value, diagnostics, context);
			case UmlPackage.INVOCATION_ACTION:
				return validateInvocationAction((InvocationAction)value, diagnostics, context);
			case UmlPackage.CALL_ACTION:
				return validateCallAction((CallAction)value, diagnostics, context);
			case UmlPackage.CALL_BEHAVIOR_ACTION:
				return validateCallBehaviorAction((CallBehaviorAction)value, diagnostics, context);
			case UmlPackage.CALL_EVENT:
				return validateCallEvent((CallEvent)value, diagnostics, context);
			case UmlPackage.CALL_OPERATION_ACTION:
				return validateCallOperationAction((CallOperationAction)value, diagnostics, context);
			case UmlPackage.CENTRAL_BUFFER_NODE:
				return validateCentralBufferNode((CentralBufferNode)value, diagnostics, context);
			case UmlPackage.CHANGE_EVENT:
				return validateChangeEvent((ChangeEvent)value, diagnostics, context);
			case UmlPackage.CLAUSE:
				return validateClause((Clause)value, diagnostics, context);
			case UmlPackage.CLEAR_ASSOCIATION_ACTION:
				return validateClearAssociationAction((ClearAssociationAction)value, diagnostics, context);
			case UmlPackage.CLEAR_STRUCTURAL_FEATURE_ACTION:
				return validateClearStructuralFeatureAction((ClearStructuralFeatureAction)value, diagnostics, context);
			case UmlPackage.CLEAR_VARIABLE_ACTION:
				return validateClearVariableAction((ClearVariableAction)value, diagnostics, context);
			case UmlPackage.COMBINED_FRAGMENT:
				return validateCombinedFragment((CombinedFragment)value, diagnostics, context);
			case UmlPackage.COMMUNICATION_PATH:
				return validateCommunicationPath((CommunicationPath)value, diagnostics, context);
			case UmlPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case UmlPackage.COMPONENT_REALIZATION:
				return validateComponentRealization((ComponentRealization)value, diagnostics, context);
			case UmlPackage.CONDITIONAL_NODE:
				return validateConditionalNode((ConditionalNode)value, diagnostics, context);
			case UmlPackage.CONSIDER_IGNORE_FRAGMENT:
				return validateConsiderIgnoreFragment((ConsiderIgnoreFragment)value, diagnostics, context);
			case UmlPackage.CONTINUATION:
				return validateContinuation((Continuation)value, diagnostics, context);
			case UmlPackage.CONTROL_FLOW:
				return validateControlFlow((ControlFlow)value, diagnostics, context);
			case UmlPackage.CREATE_LINK_ACTION:
				return validateCreateLinkAction((CreateLinkAction)value, diagnostics, context);
			case UmlPackage.WRITE_LINK_ACTION:
				return validateWriteLinkAction((WriteLinkAction)value, diagnostics, context);
			case UmlPackage.LINK_ACTION:
				return validateLinkAction((LinkAction)value, diagnostics, context);
			case UmlPackage.LINK_END_DATA:
				return validateLinkEndData((LinkEndData)value, diagnostics, context);
			case UmlPackage.QUALIFIER_VALUE:
				return validateQualifierValue((QualifierValue)value, diagnostics, context);
			case UmlPackage.LINK_END_CREATION_DATA:
				return validateLinkEndCreationData((LinkEndCreationData)value, diagnostics, context);
			case UmlPackage.CREATE_LINK_OBJECT_ACTION:
				return validateCreateLinkObjectAction((CreateLinkObjectAction)value, diagnostics, context);
			case UmlPackage.CREATE_OBJECT_ACTION:
				return validateCreateObjectAction((CreateObjectAction)value, diagnostics, context);
			case UmlPackage.DATA_STORE_NODE:
				return validateDataStoreNode((DataStoreNode)value, diagnostics, context);
			case UmlPackage.DECISION_NODE:
				return validateDecisionNode((DecisionNode)value, diagnostics, context);
			case UmlPackage.OBJECT_FLOW:
				return validateObjectFlow((ObjectFlow)value, diagnostics, context);
			case UmlPackage.DESTROY_LINK_ACTION:
				return validateDestroyLinkAction((DestroyLinkAction)value, diagnostics, context);
			case UmlPackage.LINK_END_DESTRUCTION_DATA:
				return validateLinkEndDestructionData((LinkEndDestructionData)value, diagnostics, context);
			case UmlPackage.DESTROY_OBJECT_ACTION:
				return validateDestroyObjectAction((DestroyObjectAction)value, diagnostics, context);
			case UmlPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION:
				return validateDestructionOccurrenceSpecification((DestructionOccurrenceSpecification)value, diagnostics, context);
			case UmlPackage.MESSAGE_OCCURRENCE_SPECIFICATION:
				return validateMessageOccurrenceSpecification((MessageOccurrenceSpecification)value, diagnostics, context);
			case UmlPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case UmlPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case UmlPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case UmlPackage.OBSERVATION:
				return validateObservation((Observation)value, diagnostics, context);
			case UmlPackage.DURATION_CONSTRAINT:
				return validateDurationConstraint((DurationConstraint)value, diagnostics, context);
			case UmlPackage.INTERVAL_CONSTRAINT:
				return validateIntervalConstraint((IntervalConstraint)value, diagnostics, context);
			case UmlPackage.INTERVAL:
				return validateInterval((Interval)value, diagnostics, context);
			case UmlPackage.DURATION_INTERVAL:
				return validateDurationInterval((DurationInterval)value, diagnostics, context);
			case UmlPackage.DURATION_OBSERVATION:
				return validateDurationObservation((DurationObservation)value, diagnostics, context);
			case UmlPackage.EXECUTION_ENVIRONMENT:
				return validateExecutionEnvironment((ExecutionEnvironment)value, diagnostics, context);
			case UmlPackage.EXECUTION_OCCURRENCE_SPECIFICATION:
				return validateExecutionOccurrenceSpecification((ExecutionOccurrenceSpecification)value, diagnostics, context);
			case UmlPackage.EXPANSION_NODE:
				return validateExpansionNode((ExpansionNode)value, diagnostics, context);
			case UmlPackage.EXPANSION_REGION:
				return validateExpansionRegion((ExpansionRegion)value, diagnostics, context);
			case UmlPackage.FINAL_STATE:
				return validateFinalState((FinalState)value, diagnostics, context);
			case UmlPackage.FLOW_FINAL_NODE:
				return validateFlowFinalNode((FlowFinalNode)value, diagnostics, context);
			case UmlPackage.FORK_NODE:
				return validateForkNode((ForkNode)value, diagnostics, context);
			case UmlPackage.FUNCTION_BEHAVIOR:
				return validateFunctionBehavior((FunctionBehavior)value, diagnostics, context);
			case UmlPackage.OPAQUE_BEHAVIOR:
				return validateOpaqueBehavior((OpaqueBehavior)value, diagnostics, context);
			case UmlPackage.INFORMATION_FLOW:
				return validateInformationFlow((InformationFlow)value, diagnostics, context);
			case UmlPackage.INFORMATION_ITEM:
				return validateInformationItem((InformationItem)value, diagnostics, context);
			case UmlPackage.INITIAL_NODE:
				return validateInitialNode((InitialNode)value, diagnostics, context);
			case UmlPackage.INSTANCE_VALUE:
				return validateInstanceValue((InstanceValue)value, diagnostics, context);
			case UmlPackage.JOIN_NODE:
				return validateJoinNode((JoinNode)value, diagnostics, context);
			case UmlPackage.LITERAL_BOOLEAN:
				return validateLiteralBoolean((LiteralBoolean)value, diagnostics, context);
			case UmlPackage.LITERAL_SPECIFICATION:
				return validateLiteralSpecification((LiteralSpecification)value, diagnostics, context);
			case UmlPackage.LITERAL_INTEGER:
				return validateLiteralInteger((LiteralInteger)value, diagnostics, context);
			case UmlPackage.LITERAL_NULL:
				return validateLiteralNull((LiteralNull)value, diagnostics, context);
			case UmlPackage.LITERAL_REAL:
				return validateLiteralReal((LiteralReal)value, diagnostics, context);
			case UmlPackage.LITERAL_STRING:
				return validateLiteralString((LiteralString)value, diagnostics, context);
			case UmlPackage.LITERAL_UNLIMITED_NATURAL:
				return validateLiteralUnlimitedNatural((LiteralUnlimitedNatural)value, diagnostics, context);
			case UmlPackage.LOOP_NODE:
				return validateLoopNode((LoopNode)value, diagnostics, context);
			case UmlPackage.MERGE_NODE:
				return validateMergeNode((MergeNode)value, diagnostics, context);
			case UmlPackage.OPAQUE_ACTION:
				return validateOpaqueAction((OpaqueAction)value, diagnostics, context);
			case UmlPackage.PROTOCOL_TRANSITION:
				return validateProtocolTransition((ProtocolTransition)value, diagnostics, context);
			case UmlPackage.RAISE_EXCEPTION_ACTION:
				return validateRaiseExceptionAction((RaiseExceptionAction)value, diagnostics, context);
			case UmlPackage.READ_EXTENT_ACTION:
				return validateReadExtentAction((ReadExtentAction)value, diagnostics, context);
			case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION:
				return validateReadIsClassifiedObjectAction((ReadIsClassifiedObjectAction)value, diagnostics, context);
			case UmlPackage.READ_LINK_ACTION:
				return validateReadLinkAction((ReadLinkAction)value, diagnostics, context);
			case UmlPackage.READ_LINK_OBJECT_END_ACTION:
				return validateReadLinkObjectEndAction((ReadLinkObjectEndAction)value, diagnostics, context);
			case UmlPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION:
				return validateReadLinkObjectEndQualifierAction((ReadLinkObjectEndQualifierAction)value, diagnostics, context);
			case UmlPackage.READ_SELF_ACTION:
				return validateReadSelfAction((ReadSelfAction)value, diagnostics, context);
			case UmlPackage.READ_STRUCTURAL_FEATURE_ACTION:
				return validateReadStructuralFeatureAction((ReadStructuralFeatureAction)value, diagnostics, context);
			case UmlPackage.READ_VARIABLE_ACTION:
				return validateReadVariableAction((ReadVariableAction)value, diagnostics, context);
			case UmlPackage.RECLASSIFY_OBJECT_ACTION:
				return validateReclassifyObjectAction((ReclassifyObjectAction)value, diagnostics, context);
			case UmlPackage.REDUCE_ACTION:
				return validateReduceAction((ReduceAction)value, diagnostics, context);
			case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION:
				return validateRemoveStructuralFeatureValueAction((RemoveStructuralFeatureValueAction)value, diagnostics, context);
			case UmlPackage.REMOVE_VARIABLE_VALUE_ACTION:
				return validateRemoveVariableValueAction((RemoveVariableValueAction)value, diagnostics, context);
			case UmlPackage.REPLY_ACTION:
				return validateReplyAction((ReplyAction)value, diagnostics, context);
			case UmlPackage.SEND_OBJECT_ACTION:
				return validateSendObjectAction((SendObjectAction)value, diagnostics, context);
			case UmlPackage.SEND_SIGNAL_ACTION:
				return validateSendSignalAction((SendSignalAction)value, diagnostics, context);
			case UmlPackage.SEQUENCE_NODE:
				return validateSequenceNode((SequenceNode)value, diagnostics, context);
			case UmlPackage.SIGNAL_EVENT:
				return validateSignalEvent((SignalEvent)value, diagnostics, context);
			case UmlPackage.START_CLASSIFIER_BEHAVIOR_ACTION:
				return validateStartClassifierBehaviorAction((StartClassifierBehaviorAction)value, diagnostics, context);
			case UmlPackage.START_OBJECT_BEHAVIOR_ACTION:
				return validateStartObjectBehaviorAction((StartObjectBehaviorAction)value, diagnostics, context);
			case UmlPackage.STATE_INVARIANT:
				return validateStateInvariant((StateInvariant)value, diagnostics, context);
			case UmlPackage.TEST_IDENTITY_ACTION:
				return validateTestIdentityAction((TestIdentityAction)value, diagnostics, context);
			case UmlPackage.TIME_CONSTRAINT:
				return validateTimeConstraint((TimeConstraint)value, diagnostics, context);
			case UmlPackage.TIME_INTERVAL:
				return validateTimeInterval((TimeInterval)value, diagnostics, context);
			case UmlPackage.TIME_EXPRESSION:
				return validateTimeExpression((TimeExpression)value, diagnostics, context);
			case UmlPackage.TIME_EVENT:
				return validateTimeEvent((TimeEvent)value, diagnostics, context);
			case UmlPackage.TIME_OBSERVATION:
				return validateTimeObservation((TimeObservation)value, diagnostics, context);
			case UmlPackage.UNMARSHALL_ACTION:
				return validateUnmarshallAction((UnmarshallAction)value, diagnostics, context);
			case UmlPackage.VALUE_PIN:
				return validateValuePin((ValuePin)value, diagnostics, context);
			case UmlPackage.VALUE_SPECIFICATION_ACTION:
				return validateValueSpecificationAction((ValueSpecificationAction)value, diagnostics, context);
			case UmlPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case UmlPackage.VISIBILITY_KIND:
				return validateVisibilityKind((VisibilityKind)value, diagnostics, context);
			case UmlPackage.CALL_CONCURRENCY_KIND:
				return validateCallConcurrencyKind((CallConcurrencyKind)value, diagnostics, context);
			case UmlPackage.TRANSITION_KIND:
				return validateTransitionKind((TransitionKind)value, diagnostics, context);
			case UmlPackage.PSEUDOSTATE_KIND:
				return validatePseudostateKind((PseudostateKind)value, diagnostics, context);
			case UmlPackage.PARAMETER_DIRECTION_KIND:
				return validateParameterDirectionKind((ParameterDirectionKind)value, diagnostics, context);
			case UmlPackage.PARAMETER_EFFECT_KIND:
				return validateParameterEffectKind((ParameterEffectKind)value, diagnostics, context);
			case UmlPackage.AGGREGATION_KIND:
				return validateAggregationKind((AggregationKind)value, diagnostics, context);
			case UmlPackage.CONNECTOR_KIND:
				return validateConnectorKind((ConnectorKind)value, diagnostics, context);
			case UmlPackage.OBJECT_NODE_ORDERING_KIND:
				return validateObjectNodeOrderingKind((ObjectNodeOrderingKind)value, diagnostics, context);
			case UmlPackage.MESSAGE_KIND:
				return validateMessageKind((MessageKind)value, diagnostics, context);
			case UmlPackage.MESSAGE_SORT:
				return validateMessageSort((MessageSort)value, diagnostics, context);
			case UmlPackage.INTERACTION_OPERATOR_KIND:
				return validateInteractionOperatorKind((InteractionOperatorKind)value, diagnostics, context);
			case UmlPackage.EXPANSION_KIND:
				return validateExpansionKind((ExpansionKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstraction(Abstraction abstraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstraction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(abstraction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(dependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageableElement(PackageableElement packageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(packageableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(packageableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterableElement(ParameterableElement parameterableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(parameterableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(element, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasOwner constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_hasOwner(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.hasOwner(diagnostics, context);
	}

	/**
	 * Validates the notOwnSelf constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_notOwnSelf(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.notOwnSelf(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(comment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stereotype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_associationEndOwnership(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_nameNotClash(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_binaryAssociationsOnly(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_generalize(stereotype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the associationEndOwnership constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_associationEndOwnership(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stereotype.associationEndOwnership(diagnostics, context);
	}

	/**
	 * Validates the nameNotClash constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_nameNotClash(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stereotype.nameNotClash(diagnostics, context);
	}

	/**
	 * Validates the binaryAssociationsOnly constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_binaryAssociationsOnly(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stereotype.binaryAssociationsOnly(diagnostics, context);
	}

	/**
	 * Validates the generalize constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_generalize(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stereotype.generalize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(uml.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(class_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the passiveClass constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_passiveClass(uml.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return class_.passiveClass(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncapsulatedClassifier(EncapsulatedClassifier encapsulatedClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encapsulatedClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(encapsulatedClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredClassifier(StructuredClassifier structuredClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(structuredClassifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the multiplicities constraint of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredClassifier_multiplicities(StructuredClassifier structuredClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuredClassifier.multiplicities(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(classifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonFinalParents constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_nonFinalParents(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return classifier.nonFinalParents(diagnostics, context);
	}

	/**
	 * Validates the noCyclesInGeneralization constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_noCyclesInGeneralization(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return classifier.noCyclesInGeneralization(diagnostics, context);
	}

	/**
	 * Validates the specializeType constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_specializeType(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return classifier.specializeType(diagnostics, context);
	}

	/**
	 * Validates the mapsToGeneralizationSet constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_mapsToGeneralizationSet(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return classifier.mapsToGeneralizationSet(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace(Namespace namespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namespace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(namespace, diagnostics, context);
		return result;
	}

	/**
	 * Validates the membersDistinguishable constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace_membersDistinguishable(Namespace namespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return namespace.membersDistinguishable(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasQualifiedName constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_hasQualifiedName(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return namedElement.hasQualifiedName(diagnostics, context);
	}

	/**
	 * Validates the hasNoQualifiedName constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_hasNoQualifiedName(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return namedElement.hasNoQualifiedName(diagnostics, context);
	}

	/**
	 * Validates the visibilityNeedsOwnership constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_visibilityNeedsOwnership(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return namedElement.visibilityNeedsOwnership(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpression(StringExpression stringExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateStringExpression_subexpressions(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateStringExpression_operands(stringExpression, diagnostics, context);
		return result;
	}

	/**
	 * Validates the subexpressions constraint of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpression_subexpressions(StringExpression stringExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stringExpression.subexpressions(diagnostics, context);
	}

	/**
	 * Validates the operands constraint of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpression_operands(StringExpression stringExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stringExpression.operands(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(expression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(ValueSpecification valueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(valueSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(typedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(uml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(package_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_elementsPublicOrPrivate(package_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the elementsPublicOrPrivate constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_elementsPublicOrPrivate(uml.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return package_.elementsPublicOrPrivate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateableElement(TemplateableElement templateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(templateableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateSignature(TemplateSignature templateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateSignature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateSignature_ownElements(templateSignature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ownElements constraint of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateSignature_ownElements(TemplateSignature templateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return templateSignature.ownElements(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameter(TemplateParameter templateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateParameter_mustBeCompatible(templateParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustBeCompatible constraint of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameter_mustBeCompatible(TemplateParameter templateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return templateParameter.mustBeCompatible(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateBinding(TemplateBinding templateBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateBinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateBinding_parameterSubstitutionFormal(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateBinding_oneParameterSubstitution(templateBinding, diagnostics, context);
		return result;
	}

	/**
	 * Validates the parameterSubstitutionFormal constraint of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateBinding_parameterSubstitutionFormal(TemplateBinding templateBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return templateBinding.parameterSubstitutionFormal(diagnostics, context);
	}

	/**
	 * Validates the oneParameterSubstitution constraint of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateBinding_oneParameterSubstitution(TemplateBinding templateBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return templateBinding.oneParameterSubstitution(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedRelationship(DirectedRelationship directedRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(directedRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(directedRelationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(relationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameterSubstitution(TemplateParameterSubstitution templateParameterSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateParameterSubstitution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateParameterSubstitution_mustBeCompatible(templateParameterSubstitution, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustBeCompatible constraint of '<em>Template Parameter Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameterSubstitution_mustBeCompatible(TemplateParameterSubstitution templateParameterSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return templateParameterSubstitution.mustBeCompatible(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageMerge(PackageMerge packageMerge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(packageMerge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(packageMerge, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileApplication(ProfileApplication profileApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(profileApplication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(profileApplication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(profile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_elementsPublicOrPrivate(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateProfile_metaclassReferenceNotSpecialized(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateProfile_referencesSameMetamodel(profile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the metaclassReferenceNotSpecialized constraint of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile_metaclassReferenceNotSpecialized(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return profile.metaclassReferenceNotSpecialized(diagnostics, context);
	}

	/**
	 * Validates the referencesSameMetamodel constraint of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile_referencesSameMetamodel(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return profile.referencesSameMetamodel(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport(ElementImport elementImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementImport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementImport_visibilityPublicOrPrivate(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementImport_importedElementIsPublic(elementImport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the visibilityPublicOrPrivate constraint of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport_visibilityPublicOrPrivate(ElementImport elementImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return elementImport.visibilityPublicOrPrivate(diagnostics, context);
	}

	/**
	 * Validates the importedElementIsPublic constraint of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport_importedElementIsPublic(ElementImport elementImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return elementImport.importedElementIsPublic(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageImport(PackageImport packageImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(packageImport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageImport_publicOrPrivate(packageImport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the publicOrPrivate constraint of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageImport_publicOrPrivate(PackageImport packageImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return packageImport.publicOrPrivate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specializedEndNumber(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_associationEnds(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_binaryAssociations(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specializedEndTypes(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_nonOwnedEnd(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_isBinary(extension, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonOwnedEnd constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_nonOwnedEnd(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.nonOwnedEnd(diagnostics, context);
	}

	/**
	 * Validates the isBinary constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_isBinary(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.isBinary(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specializedEndNumber(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_associationEnds(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_binaryAssociations(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specializedEndTypes(association, diagnostics, context);
		return result;
	}

	/**
	 * Validates the specializedEndNumber constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_specializedEndNumber(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return association.specializedEndNumber(diagnostics, context);
	}

	/**
	 * Validates the associationEnds constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_associationEnds(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return association.associationEnds(diagnostics, context);
	}

	/**
	 * Validates the binaryAssociations constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_binaryAssociations(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return association.binaryAssociations(diagnostics, context);
	}

	/**
	 * Validates the specializedEndTypes constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_specializedEndTypes(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return association.specializedEndTypes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettedPropertyNames(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettingRules(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_multiplicityOfComposite(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_bindingToAttribute(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_redefinedPropertyInherited(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettingContextConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_deploymentTarget(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_derivedUnionIsDerived(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_derivedUnionIsReadOnly(property, diagnostics, context);
		return result;
	}

	/**
	 * Validates the subsettedPropertyNames constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_subsettedPropertyNames(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.subsettedPropertyNames(diagnostics, context);
	}

	/**
	 * Validates the subsettingRules constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_subsettingRules(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.subsettingRules(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfComposite constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_multiplicityOfComposite(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.multiplicityOfComposite(diagnostics, context);
	}

	/**
	 * Validates the bindingToAttribute constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_bindingToAttribute(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.bindingToAttribute(diagnostics, context);
	}

	/**
	 * Validates the redefinedPropertyInherited constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_redefinedPropertyInherited(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.redefinedPropertyInherited(diagnostics, context);
	}

	/**
	 * Validates the subsettingContextConforms constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_subsettingContextConforms(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.subsettingContextConforms(diagnostics, context);
	}

	/**
	 * Validates the deploymentTarget constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_deploymentTarget(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.deploymentTarget(diagnostics, context);
	}

	/**
	 * Validates the derivedUnionIsDerived constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_derivedUnionIsDerived(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.derivedUnionIsDerived(diagnostics, context);
	}

	/**
	 * Validates the derivedUnionIsReadOnly constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_derivedUnionIsReadOnly(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return property.derivedUnionIsReadOnly(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(StructuralFeature structuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuralFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(structuralFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiplicityElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(multiplicityElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the lowerGe0 constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_lowerGe0(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multiplicityElement.lowerGe0(diagnostics, context);
	}

	/**
	 * Validates the upperGeLower constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_upperGeLower(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multiplicityElement.upperGeLower(diagnostics, context);
	}

	/**
	 * Validates the valueSpecificationConstant constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_valueSpecificationConstant(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multiplicityElement.valueSpecificationConstant(diagnostics, context);
	}

	/**
	 * Validates the valueSpecificationNoSideEffects constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_valueSpecificationNoSideEffects(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multiplicityElement.valueSpecificationNoSideEffects(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(feature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(redefinableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(redefinableElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the redefinitionConsistent constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_redefinitionConsistent(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return redefinableElement.redefinitionConsistent(diagnostics, context);
	}

	/**
	 * Validates the nonLeafRedefinition constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_nonLeafRedefinition(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return redefinableElement.nonLeafRedefinition(diagnostics, context);
	}

	/**
	 * Validates the redefinitionContextValid constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_redefinitionContextValid(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return redefinableElement.redefinitionContextValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectableElement(ConnectableElement connectableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(connectableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectorEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorEnd_roleAndPartWithPort(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorEnd_selfPartWithPort(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorEnd_multiplicity(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorEnd_partWithPortEmpty(connectorEnd, diagnostics, context);
		return result;
	}

	/**
	 * Validates the roleAndPartWithPort constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd_roleAndPartWithPort(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectorEnd.roleAndPartWithPort(diagnostics, context);
	}

	/**
	 * Validates the selfPartWithPort constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd_selfPartWithPort(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectorEnd.selfPartWithPort(diagnostics, context);
	}

	/**
	 * Validates the multiplicity constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd_multiplicity(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectorEnd.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the partWithPortEmpty constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd_partWithPortEmpty(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectorEnd.partWithPortEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectableElementTemplateParameter(ConnectableElementTemplateParameter connectableElementTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectableElementTemplateParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateParameter_mustBeCompatible(connectableElementTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTarget(DeploymentTarget deploymentTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deploymentTarget, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(deploymentTarget, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployment(Deployment deployment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deployment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(deployment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentSpecification(DeploymentSpecification deploymentSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deploymentSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentSpecification_deployedElements(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentSpecification_deploymentTarget(deploymentSpecification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the deployedElements constraint of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentSpecification_deployedElements(DeploymentSpecification deploymentSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return deploymentSpecification.deployedElements(diagnostics, context);
	}

	/**
	 * Validates the deploymentTarget constraint of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentSpecification_deploymentTarget(DeploymentSpecification deploymentSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return deploymentSpecification.deploymentTarget(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(artifact, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(artifact, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedArtifact(DeployedArtifact deployedArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deployedArtifact, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(deployedArtifact, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManifestation(Manifestation manifestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manifestation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(manifestation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_atMostOneReturn(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_onlyBodyForQuery(operation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the atMostOneReturn constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_atMostOneReturn(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.atMostOneReturn(diagnostics, context);
	}

	/**
	 * Validates the onlyBodyForQuery constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_onlyBodyForQuery(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return operation.onlyBodyForQuery(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioralFeature(BehavioralFeature behavioralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behavioralFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(behavioralFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parametersMatch(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_featureOfContextClassifier(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mustRealize(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mostOneBehaviour(behavior, diagnostics, context);
		return result;
	}

	/**
	 * Validates the parametersMatch constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior_parametersMatch(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return behavior.parametersMatch(diagnostics, context);
	}

	/**
	 * Validates the featureOfContextClassifier constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior_featureOfContextClassifier(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return behavior.featureOfContextClassifier(diagnostics, context);
	}

	/**
	 * Validates the mustRealize constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior_mustRealize(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return behavior.mustRealize(diagnostics, context);
	}

	/**
	 * Validates the mostOneBehaviour constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior_mostOneBehaviour(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return behavior.mostOneBehaviour(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioredClassifier(BehavioredClassifier behavioredClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behavioredClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(behavioredClassifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the classBehavior constraint of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioredClassifier_classBehavior(BehavioredClassifier behavioredClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return behavioredClassifier.classBehavior(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceRealization(InterfaceRealization interfaceRealization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceRealization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interfaceRealization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization(Realization realization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(realization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_visibility(interface_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the visibility constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface_visibility(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interface_.visibility(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReception(Reception reception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reception, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateReception_notQuery(reception, diagnostics, context);
		return result;
	}

	/**
	 * Validates the notQuery constraint of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReception_notQuery(Reception reception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reception.notQuery(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal(Signal signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(signal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocolStateMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parametersMatch(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_featureOfContextClassifier(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mustRealize(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mostOneBehaviour(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_method(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_classifierContext(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_contextClassifier(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_connectionPoints(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolStateMachine_entryExitDo(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolStateMachine_protocolTransitions(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolStateMachine_deepOrShallowHistory(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolStateMachine_portsConnected(protocolStateMachine, diagnostics, context);
		return result;
	}

	/**
	 * Validates the entryExitDo constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine_entryExitDo(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocolStateMachine.entryExitDo(diagnostics, context);
	}

	/**
	 * Validates the protocolTransitions constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine_protocolTransitions(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocolStateMachine.protocolTransitions(diagnostics, context);
	}

	/**
	 * Validates the deepOrShallowHistory constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine_deepOrShallowHistory(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocolStateMachine.deepOrShallowHistory(diagnostics, context);
	}

	/**
	 * Validates the portsConnected constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine_portsConnected(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocolStateMachine.portsConnected(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parametersMatch(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_featureOfContextClassifier(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mustRealize(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mostOneBehaviour(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_method(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_classifierContext(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_contextClassifier(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_connectionPoints(stateMachine, diagnostics, context);
		return result;
	}

	/**
	 * Validates the method constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_method(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stateMachine.method(diagnostics, context);
	}

	/**
	 * Validates the classifierContext constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_classifierContext(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stateMachine.classifierContext(diagnostics, context);
	}

	/**
	 * Validates the contextClassifier constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_contextClassifier(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stateMachine.contextClassifier(diagnostics, context);
	}

	/**
	 * Validates the connectionPoints constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_connectionPoints(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stateMachine.connectionPoints(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pseudostate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_junctionVertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_historyVertices(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_transitionsOutgoing(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_outgoingFromInitial(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_forkVertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_joinVertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_choiceVertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_initialVertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_transitionsIncoming(pseudostate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the junctionVertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_junctionVertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.junctionVertex(diagnostics, context);
	}

	/**
	 * Validates the historyVertices constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_historyVertices(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.historyVertices(diagnostics, context);
	}

	/**
	 * Validates the transitionsOutgoing constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_transitionsOutgoing(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.transitionsOutgoing(diagnostics, context);
	}

	/**
	 * Validates the outgoingFromInitial constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_outgoingFromInitial(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.outgoingFromInitial(diagnostics, context);
	}

	/**
	 * Validates the forkVertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_forkVertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.forkVertex(diagnostics, context);
	}

	/**
	 * Validates the joinVertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_joinVertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.joinVertex(diagnostics, context);
	}

	/**
	 * Validates the choiceVertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_choiceVertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.choiceVertex(diagnostics, context);
	}

	/**
	 * Validates the initialVertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_initialVertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.initialVertex(diagnostics, context);
	}

	/**
	 * Validates the transitionsIncoming constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_transitionsIncoming(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pseudostate.transitionsIncoming(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertex(Vertex vertex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vertex, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(vertex, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(region, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_shallowHistoryVertex(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_deepHistoryVertex(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_initialVertex(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_owned(region, diagnostics, context);
		return result;
	}

	/**
	 * Validates the shallowHistoryVertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_shallowHistoryVertex(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return region.shallowHistoryVertex(diagnostics, context);
	}

	/**
	 * Validates the deepHistoryVertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_deepHistoryVertex(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return region.deepHistoryVertex(diagnostics, context);
	}

	/**
	 * Validates the initialVertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_initialVertex(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return region.initialVertex(diagnostics, context);
	}

	/**
	 * Validates the owned constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_owned(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return region.owned(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_entryOrExit(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_compositeStates(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_destinationsOrSourcesOfTransitions(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_submachineOrRegions(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_submachineStates(state, diagnostics, context);
		return result;
	}

	/**
	 * Validates the entryOrExit constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_entryOrExit(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return state.entryOrExit(diagnostics, context);
	}

	/**
	 * Validates the compositeStates constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_compositeStates(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return state.compositeStates(diagnostics, context);
	}

	/**
	 * Validates the destinationsOrSourcesOfTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_destinationsOrSourcesOfTransitions(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return state.destinationsOrSourcesOfTransitions(diagnostics, context);
	}

	/**
	 * Validates the submachineOrRegions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_submachineOrRegions(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return state.submachineOrRegions(diagnostics, context);
	}

	/**
	 * Validates the submachineStates constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_submachineStates(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return state.submachineStates(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointReference(ConnectionPointReference connectionPointReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectionPointReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPointReference_entryPseudostates(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPointReference_exitPseudostates(connectionPointReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the entryPseudostates constraint of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointReference_entryPseudostates(ConnectionPointReference connectionPointReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectionPointReference.entryPseudostates(diagnostics, context);
	}

	/**
	 * Validates the exitPseudostates constraint of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointReference_exitPseudostates(ConnectionPointReference connectionPointReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectionPointReference.exitPseudostates(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(trigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(event, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettedPropertyNames(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettingRules(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_multiplicityOfComposite(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_bindingToAttribute(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_redefinedPropertyInherited(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettingContextConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_deploymentTarget(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_derivedUnionIsDerived(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_derivedUnionIsReadOnly(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_defaultValue(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_portAggregation(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_portDestroyed(port, diagnostics, context);
		return result;
	}

	/**
	 * Validates the defaultValue constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_defaultValue(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return port.defaultValue(diagnostics, context);
	}

	/**
	 * Validates the portAggregation constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_portAggregation(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return port.portAggregation(diagnostics, context);
	}

	/**
	 * Validates the portDestroyed constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_portDestroyed(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return port.portDestroyed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_notApplyToSelf(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_noSideEffects(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_booleanValue(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_valueSpecificationBoolean(constraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the notApplyToSelf constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_notApplyToSelf(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return constraint.notApplyToSelf(diagnostics, context);
	}

	/**
	 * Validates the noSideEffects constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_noSideEffects(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return constraint.noSideEffects(diagnostics, context);
	}

	/**
	 * Validates the booleanValue constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_booleanValue(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return constraint.booleanValue(diagnostics, context);
	}

	/**
	 * Validates the valueSpecificationBoolean constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_valueSpecificationBoolean(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return constraint.valueSpecificationBoolean(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_stateIsLocal(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_forkSegmentGuards(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_joinSegmentState(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_initialTransition(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_outgoingPseudostates(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_signaturesCompatible(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_stateIsInternal(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_joinSegmentGuards(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_forkSegmentState(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_stateIsExternal(transition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the stateIsLocal constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_stateIsLocal(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.stateIsLocal(diagnostics, context);
	}

	/**
	 * Validates the forkSegmentGuards constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_forkSegmentGuards(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.forkSegmentGuards(diagnostics, context);
	}

	/**
	 * Validates the joinSegmentState constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_joinSegmentState(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.joinSegmentState(diagnostics, context);
	}

	/**
	 * Validates the initialTransition constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_initialTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.initialTransition(diagnostics, context);
	}

	/**
	 * Validates the outgoingPseudostates constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_outgoingPseudostates(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.outgoingPseudostates(diagnostics, context);
	}

	/**
	 * Validates the signaturesCompatible constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_signaturesCompatible(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.signaturesCompatible(diagnostics, context);
	}

	/**
	 * Validates the stateIsInternal constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_stateIsInternal(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.stateIsInternal(diagnostics, context);
	}

	/**
	 * Validates the joinSegmentGuards constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_joinSegmentGuards(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.joinSegmentGuards(diagnostics, context);
	}

	/**
	 * Validates the forkSegmentState constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_forkSegmentState(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.forkSegmentState(diagnostics, context);
	}

	/**
	 * Validates the stateIsExternal constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_stateIsExternal(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.stateIsExternal(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolConformance(ProtocolConformance protocolConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocolConformance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(protocolConformance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_reentrantBehaviors(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_connectorEnd(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_notException(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_inAndOut(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_streamAndException(parameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the reentrantBehaviors constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_reentrantBehaviors(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.reentrantBehaviors(diagnostics, context);
	}

	/**
	 * Validates the connectorEnd constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_connectorEnd(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.connectorEnd(diagnostics, context);
	}

	/**
	 * Validates the notException constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_notException(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.notException(diagnostics, context);
	}

	/**
	 * Validates the inAndOut constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_inAndOut(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.inAndOut(diagnostics, context);
	}

	/**
	 * Validates the streamAndException constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_streamAndException(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.streamAndException(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet(ParameterSet parameterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterSet_twoParameterSets(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterSet_input(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterSet_sameParameterizedEntity(parameterSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the twoParameterSets constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet_twoParameterSets(ParameterSet parameterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameterSet.twoParameterSets(diagnostics, context);
	}

	/**
	 * Validates the input constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet_input(ParameterSet parameterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameterSet.input(diagnostics, context);
	}

	/**
	 * Validates the sameParameterizedEntity constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet_sameParameterizedEntity(ParameterSet parameterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameterSet.sameParameterizedEntity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTemplateParameter(OperationTemplateParameter operationTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationTemplateParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateParameter_mustBeCompatible(operationTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionEnd(ExtensionEnd extensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extensionEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettedPropertyNames(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettingRules(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_multiplicityOfComposite(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_bindingToAttribute(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_redefinedPropertyInherited(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsettingContextConforms(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_deploymentTarget(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_derivedUnionIsDerived(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_derivedUnionIsReadOnly(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtensionEnd_multiplicity(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtensionEnd_aggregation(extensionEnd, diagnostics, context);
		return result;
	}

	/**
	 * Validates the multiplicity constraint of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionEnd_multiplicity(ExtensionEnd extensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extensionEnd.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the aggregation constraint of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionEnd_aggregation(ExtensionEnd extensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extensionEnd.aggregation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(model, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_elementsPublicOrPrivate(model, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_structuralFeature(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_definingFeature(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_deploymentTarget(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_deploymentArtifact(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumerationLiteral_classifierEqualsOwningEnumeration(enumerationLiteral, diagnostics, context);
		return result;
	}

	/**
	 * Validates the classifierEqualsOwningEnumeration constraint of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral_classifierEqualsOwningEnumeration(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enumerationLiteral.classifierEqualsOwningEnumeration(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_structuralFeature(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_definingFeature(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_deploymentTarget(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_deploymentArtifact(instanceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the structuralFeature constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_structuralFeature(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instanceSpecification.structuralFeature(diagnostics, context);
	}

	/**
	 * Validates the definingFeature constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_definingFeature(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instanceSpecification.definingFeature(diagnostics, context);
	}

	/**
	 * Validates the deploymentTarget constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_deploymentTarget(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instanceSpecification.deploymentTarget(diagnostics, context);
	}

	/**
	 * Validates the deploymentArtifact constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_deploymentArtifact(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instanceSpecification.deploymentArtifact(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(slot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(slot, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitiveType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(primitiveType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsage(Usage usage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(usage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(usage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationUse(CollaborationUse collaborationUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collaborationUse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollaborationUse_connectors(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollaborationUse_everyRole(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollaborationUse_clientElements(collaborationUse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the connectors constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationUse_connectors(CollaborationUse collaborationUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return collaborationUse.connectors(diagnostics, context);
	}

	/**
	 * Validates the everyRole constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationUse_everyRole(CollaborationUse collaborationUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return collaborationUse.everyRole(diagnostics, context);
	}

	/**
	 * Validates the clientElements constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationUse_clientElements(CollaborationUse collaborationUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return collaborationUse.clientElements(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaboration(Collaboration collaboration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collaboration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(collaboration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralization(Generalization generalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralization_generalizationSameClassifier(generalization, diagnostics, context);
		return result;
	}

	/**
	 * Validates the generalizationSameClassifier constraint of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralization_generalizationSameClassifier(Generalization generalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalization.generalizationSameClassifier(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSet(GeneralizationSet generalizationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalizationSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralizationSet_mapsToGeneralizationSet(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralizationSet_generalizationSameClassifier(generalizationSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mapsToGeneralizationSet constraint of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSet_mapsToGeneralizationSet(GeneralizationSet generalizationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalizationSet.mapsToGeneralizationSet(diagnostics, context);
	}

	/**
	 * Validates the generalizationSameClassifier constraint of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSet_generalizationSameClassifier(GeneralizationSet generalizationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalizationSet.generalizationSameClassifier(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableTemplateSignature(RedefinableTemplateSignature redefinableTemplateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(redefinableTemplateSignature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateSignature_ownElements(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableTemplateSignature_inheritedParameters(redefinableTemplateSignature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inheritedParameters constraint of '<em>Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableTemplateSignature_inheritedParameters(RedefinableTemplateSignature redefinableTemplateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return redefinableTemplateSignature.inheritedParameters(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(useCase, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_mustHaveName(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_cannotIncludeSelf(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_binaryAssociations(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_noAssociationToUseCase(useCase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustHaveName constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_mustHaveName(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return useCase.mustHaveName(diagnostics, context);
	}

	/**
	 * Validates the cannotIncludeSelf constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_cannotIncludeSelf(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return useCase.cannotIncludeSelf(diagnostics, context);
	}

	/**
	 * Validates the binaryAssociations constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_binaryAssociations(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return useCase.binaryAssociations(diagnostics, context);
	}

	/**
	 * Validates the noAssociationToUseCase constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_noAssociationToUseCase(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return useCase.noAssociationToUseCase(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtend(Extend extend, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extend, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtend_extensionPoints(extend, diagnostics, context);
		return result;
	}

	/**
	 * Validates the extensionPoints constraint of '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtend_extensionPoints(Extend extend, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extend.extensionPoints(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionPoint(ExtensionPoint extensionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extensionPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtensionPoint_mustHaveName(extensionPoint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustHaveName constraint of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionPoint_mustHaveName(ExtensionPoint extensionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extensionPoint.mustHaveName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInclude(Include include, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(include, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(include, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(include, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitution(Substitution substitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(substitution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(substitution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifierTemplateParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateParameter_mustBeCompatible(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifierTemplateParameter_hasConstrainingClassifier(classifierTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasConstrainingClassifier constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter_hasConstrainingClassifier(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return classifierTemplateParameter.hasConstrainingClassifier(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_compatible(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_roles(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_betweenInterfacesPorts(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_types(connector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the compatible constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_compatible(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connector.compatible(diagnostics, context);
	}

	/**
	 * Validates the roles constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_roles(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connector.roles(diagnostics, context);
	}

	/**
	 * Validates the betweenInterfacesPorts constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_betweenInterfacesPorts(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connector.betweenInterfacesPorts(diagnostics, context);
	}

	/**
	 * Validates the types constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_types(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connector.types(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(image, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(image, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(image, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(image, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(opaqueExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpaqueExpression_onlyReturnResultParameters(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpaqueExpression_oneReturnResultParameter(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpaqueExpression_languageBodySize(opaqueExpression, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyReturnResultParameters constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression_onlyReturnResultParameters(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return opaqueExpression.onlyReturnResultParameters(diagnostics, context);
	}

	/**
	 * Validates the oneReturnResultParameter constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression_oneReturnResultParameter(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return opaqueExpression.oneReturnResultParameter(diagnostics, context);
	}

	/**
	 * Validates the languageBodySize constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression_languageBodySize(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return opaqueExpression.languageBodySize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acceptCallAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_noInputPins(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_triggerEvents(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_unmarshallSignalEvents(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_noOutputPins(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptCallAction_triggerCallEvent(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptCallAction_unmarshall(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptCallAction_resultPins(acceptCallAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the triggerCallEvent constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction_triggerCallEvent(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acceptCallAction.triggerCallEvent(diagnostics, context);
	}

	/**
	 * Validates the unmarshall constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction_unmarshall(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acceptCallAction.unmarshall(diagnostics, context);
	}

	/**
	 * Validates the resultPins constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction_resultPins(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acceptCallAction.resultPins(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acceptEventAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_noInputPins(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_triggerEvents(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_unmarshallSignalEvents(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_noOutputPins(acceptEventAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noInputPins constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_noInputPins(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acceptEventAction.noInputPins(diagnostics, context);
	}

	/**
	 * Validates the triggerEvents constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_triggerEvents(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acceptEventAction.triggerEvents(diagnostics, context);
	}

	/**
	 * Validates the unmarshallSignalEvents constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_unmarshallSignalEvents(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acceptEventAction.unmarshallSignalEvents(diagnostics, context);
	}

	/**
	 * Validates the noOutputPins constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_noOutputPins(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acceptEventAction.noOutputPins(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(action, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableNode(ExecutableNode executableNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executableNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(executableNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityNode(ActivityNode activityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(activityNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the owned constraint of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityNode_owned(ActivityNode activityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityNode.owned(diagnostics, context);
	}

	/**
	 * Validates the ownedStructuredNode constraint of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityNode_ownedStructuredNode(ActivityNode activityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityNode.ownedStructuredNode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parametersMatch(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_featureOfContextClassifier(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mustRealize(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mostOneBehaviour(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_activityParameterNode(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_autonomous(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_noSupergroups(activity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the activityParameterNode constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_activityParameterNode(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activity.activityParameterNode(diagnostics, context);
	}

	/**
	 * Validates the autonomous constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_autonomous(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activity.autonomous(diagnostics, context);
	}

	/**
	 * Validates the noSupergroups constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_noSupergroups(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activity.noSupergroups(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_groupOwned(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_notContained(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodesAndEdges(activityGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the groupOwned constraint of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup_groupOwned(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityGroup.groupOwned(diagnostics, context);
	}

	/**
	 * Validates the notContained constraint of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup_notContained(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityGroup.notContained(diagnostics, context);
	}

	/**
	 * Validates the nodesAndEdges constraint of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup_nodesAndEdges(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityGroup.nodesAndEdges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEdge(ActivityEdge activityEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityEdge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_owned(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_sourceAndTarget(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_structuredNode(activityEdge, diagnostics, context);
		return result;
	}

	/**
	 * Validates the owned constraint of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEdge_owned(ActivityEdge activityEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityEdge.owned(diagnostics, context);
	}

	/**
	 * Validates the sourceAndTarget constraint of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEdge_sourceAndTarget(ActivityEdge activityEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityEdge.sourceAndTarget(diagnostics, context);
	}

	/**
	 * Validates the structuredNode constraint of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEdge_structuredNode(ActivityEdge activityEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityEdge.structuredNode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityPartition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_groupOwned(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_notContained(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodesAndEdges(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityPartition_representsPart(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityPartition_representsClassifier(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityPartition_representsPartAndIsContained(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityPartition_dimensionNotContained(activityPartition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the representsPart constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition_representsPart(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityPartition.representsPart(diagnostics, context);
	}

	/**
	 * Validates the representsClassifier constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition_representsClassifier(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityPartition.representsClassifier(diagnostics, context);
	}

	/**
	 * Validates the representsPartAndIsContained constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition_representsPartAndIsContained(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityPartition.representsPartAndIsContained(diagnostics, context);
	}

	/**
	 * Validates the dimensionNotContained constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition_dimensionNotContained(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityPartition.dimensionNotContained(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredActivityNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_groupOwned(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_notContained(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodesAndEdges(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_inputPinEdges(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_outputPinEdges(structuredActivityNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputPinEdges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode_inputPinEdges(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuredActivityNode.inputPinEdges(diagnostics, context);
	}

	/**
	 * Validates the edges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode_edges(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuredActivityNode.edges(diagnostics, context);
	}

	/**
	 * Validates the outputPinEdges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode_outputPinEdges(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuredActivityNode.outputPinEdges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(InputPin inputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_controlPins(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputPin_outgoingEdgesStructuredOnly(inputPin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outgoingEdgesStructuredOnly constraint of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin_outgoingEdgesStructuredOnly(InputPin inputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inputPin.outgoingEdgesStructuredOnly(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_controlPins(pin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the controlPins constraint of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin_controlPins(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pin.controlPins(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(objectNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the objectFlowEdges constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode_objectFlowEdges(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectNode.objectFlowEdges(diagnostics, context);
	}

	/**
	 * Validates the selectionBehavior constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode_selectionBehavior(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectNode.selectionBehavior(diagnostics, context);
	}

	/**
	 * Validates the inputOutputParameter constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode_inputOutputParameter(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectNode.inputOutputParameter(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin(OutputPin outputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_controlPins(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputPin_incomingEdgesStructuredOnly(outputPin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the incomingEdgesStructuredOnly constraint of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin_incomingEdgesStructuredOnly(OutputPin outputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return outputPin.incomingEdgesStructuredOnly(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariable_owned(variable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the owned constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable_owned(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return variable.owned(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptibleActivityRegion(InterruptibleActivityRegion interruptibleActivityRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interruptibleActivityRegion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_groupOwned(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_notContained(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodesAndEdges(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterruptibleActivityRegion_interruptingEdges(interruptibleActivityRegion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the interruptingEdges constraint of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptibleActivityRegion_interruptingEdges(InterruptibleActivityRegion interruptibleActivityRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interruptibleActivityRegion.interruptingEdges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exceptionHandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_oneInput(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_edgeSourceTarget(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_resultPins(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_exceptionBody(exceptionHandler, diagnostics, context);
		return result;
	}

	/**
	 * Validates the oneInput constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_oneInput(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return exceptionHandler.oneInput(diagnostics, context);
	}

	/**
	 * Validates the edgeSourceTarget constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_edgeSourceTarget(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return exceptionHandler.edgeSourceTarget(diagnostics, context);
	}

	/**
	 * Validates the resultPins constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_resultPins(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return exceptionHandler.resultPins(diagnostics, context);
	}

	/**
	 * Validates the exceptionBody constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_exceptionBody(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return exceptionHandler.exceptionBody(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionExecutionSpecification(ActionExecutionSpecification actionExecutionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionExecutionSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionSpecification_sameLifeline(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionExecutionSpecification_actionReferenced(actionExecutionSpecification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the actionReferenced constraint of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionExecutionSpecification_actionReferenced(ActionExecutionSpecification actionExecutionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actionExecutionSpecification.actionReferenced(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionSpecification(ExecutionSpecification executionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionSpecification_sameLifeline(executionSpecification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sameLifeline constraint of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionSpecification_sameLifeline(ExecutionSpecification executionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return executionSpecification.sameLifeline(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionFragment(InteractionFragment interactionFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interactionFragment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lifeline, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_interactionUsesShareLifeline(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_sameClassifier(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_selectorSpecified(lifeline, diagnostics, context);
		return result;
	}

	/**
	 * Validates the interactionUsesShareLifeline constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_interactionUsesShareLifeline(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lifeline.interactionUsesShareLifeline(diagnostics, context);
	}

	/**
	 * Validates the sameClassifier constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_sameClassifier(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lifeline.sameClassifier(diagnostics, context);
	}

	/**
	 * Validates the selectorSpecified constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_selectorSpecified(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lifeline.selectorSpecified(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partDecomposition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_allLifelines(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_returnValueRecipientCoverage(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_argumentsCorrespondToParameters(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_gatesMatch(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_argumentsAreConstants(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_returnValueTypeRecipientCorrespondence(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartDecomposition_partsOfInternalStructures(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartDecomposition_assume(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartDecomposition_commutativityOfDecomposition(partDecomposition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the partsOfInternalStructures constraint of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition_partsOfInternalStructures(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return partDecomposition.partsOfInternalStructures(diagnostics, context);
	}

	/**
	 * Validates the assume constraint of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition_assume(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return partDecomposition.assume(diagnostics, context);
	}

	/**
	 * Validates the commutativityOfDecomposition constraint of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition_commutativityOfDecomposition(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return partDecomposition.commutativityOfDecomposition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionUse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_allLifelines(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_returnValueRecipientCoverage(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_argumentsCorrespondToParameters(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_gatesMatch(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_argumentsAreConstants(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_returnValueTypeRecipientCorrespondence(interactionUse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the allLifelines constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_allLifelines(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionUse.allLifelines(diagnostics, context);
	}

	/**
	 * Validates the returnValueRecipientCoverage constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_returnValueRecipientCoverage(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionUse.returnValueRecipientCoverage(diagnostics, context);
	}

	/**
	 * Validates the argumentsCorrespondToParameters constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_argumentsCorrespondToParameters(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionUse.argumentsCorrespondToParameters(diagnostics, context);
	}

	/**
	 * Validates the gatesMatch constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_gatesMatch(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionUse.gatesMatch(diagnostics, context);
	}

	/**
	 * Validates the argumentsAreConstants constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_argumentsAreConstants(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionUse.argumentsAreConstants(diagnostics, context);
	}

	/**
	 * Validates the returnValueTypeRecipientCorrespondence constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_returnValueTypeRecipientCorrespondence(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionUse.returnValueTypeRecipientCorrespondence(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_messagesCombinedFragment(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_messagesActualGate(gate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the messagesCombinedFragment constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_messagesCombinedFragment(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.messagesCombinedFragment(diagnostics, context);
	}

	/**
	 * Validates the messagesActualGate constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_messagesActualGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.messagesActualGate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageEnd(MessageEnd messageEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(messageEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(message, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_sendingReceivingMessageEvent(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_occurrenceSpecifications(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signatureIsSignal(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signatureIsOperation(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_arguments(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_cannotCrossBoundaries(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signatureReferTo(message, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sendingReceivingMessageEvent constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_sendingReceivingMessageEvent(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.sendingReceivingMessageEvent(diagnostics, context);
	}

	/**
	 * Validates the occurrenceSpecifications constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_occurrenceSpecifications(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.occurrenceSpecifications(diagnostics, context);
	}

	/**
	 * Validates the signatureIsSignal constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signatureIsSignal(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.signatureIsSignal(diagnostics, context);
	}

	/**
	 * Validates the signatureIsOperation constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signatureIsOperation(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.signatureIsOperation(diagnostics, context);
	}

	/**
	 * Validates the arguments constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_arguments(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.arguments(diagnostics, context);
	}

	/**
	 * Validates the cannotCrossBoundaries constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_cannotCrossBoundaries(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.cannotCrossBoundaries(diagnostics, context);
	}

	/**
	 * Validates the signatureReferTo constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signatureReferTo(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.signatureReferTo(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interaction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parametersMatch(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_featureOfContextClassifier(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mustRealize(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mostOneBehaviour(interaction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperand(InteractionOperand interactionOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionOperand, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionOperand_guardDirectlyPrior(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionOperand_guardContainReferences(interactionOperand, diagnostics, context);
		return result;
	}

	/**
	 * Validates the guardDirectlyPrior constraint of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperand_guardDirectlyPrior(InteractionOperand interactionOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionOperand.guardDirectlyPrior(diagnostics, context);
	}

	/**
	 * Validates the guardContainReferences constraint of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperand_guardContainReferences(InteractionOperand interactionOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionOperand.guardContainReferences(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_notApplyToSelf(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_noSideEffects(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_booleanValue(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_valueSpecificationBoolean(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_maxintPositive(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_minintMaxint(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_minintNonNegative(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_globalData(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_maxintGreaterEqualMinint(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_dynamicVariables(interactionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the maxintPositive constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_maxintPositive(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionConstraint.maxintPositive(diagnostics, context);
	}

	/**
	 * Validates the minintMaxint constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_minintMaxint(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionConstraint.minintMaxint(diagnostics, context);
	}

	/**
	 * Validates the minintNonNegative constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_minintNonNegative(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionConstraint.minintNonNegative(diagnostics, context);
	}

	/**
	 * Validates the globalData constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_globalData(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionConstraint.globalData(diagnostics, context);
	}

	/**
	 * Validates the maxintGreaterEqualMinint constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_maxintGreaterEqualMinint(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionConstraint.maxintGreaterEqualMinint(diagnostics, context);
	}

	/**
	 * Validates the dynamicVariables constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_dynamicVariables(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interactionConstraint.dynamicVariables(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralOrdering(GeneralOrdering generalOrdering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalOrdering, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralOrdering_irreflexsiveTransitiveClosure(generalOrdering, diagnostics, context);
		return result;
	}

	/**
	 * Validates the irreflexsiveTransitiveClosure constraint of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralOrdering_irreflexsiveTransitiveClosure(GeneralOrdering generalOrdering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalOrdering.irreflexsiveTransitiveClosure(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccurrenceSpecification(OccurrenceSpecification occurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(occurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(occurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionInputPin(ActionInputPin actionInputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionInputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_controlPins(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputPin_outgoingEdgesStructuredOnly(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionInputPin_inputPin(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionInputPin_noControlOrDataFlow(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionInputPin_oneOutputPin(actionInputPin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputPin constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionInputPin_inputPin(ActionInputPin actionInputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actionInputPin.inputPin(diagnostics, context);
	}

	/**
	 * Validates the noControlOrDataFlow constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionInputPin_noControlOrDataFlow(ActionInputPin actionInputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actionInputPin.noControlOrDataFlow(diagnostics, context);
	}

	/**
	 * Validates the oneOutputPin constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionInputPin_oneOutputPin(ActionInputPin actionInputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actionInputPin.oneOutputPin(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityFinalNode(ActivityFinalNode activityFinalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityFinalNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalNode_noOutgoingEdges(activityFinalNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalNode(FinalNode finalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(finalNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalNode_noOutgoingEdges(finalNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noOutgoingEdges constraint of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalNode_noOutgoingEdges(FinalNode finalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return finalNode.noOutgoingEdges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlNode(ControlNode controlNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(controlNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityParameterNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_maximumOneParameterNode(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_maximumTwoParameterNodes(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_noEdges(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_noIncomingEdges(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_noOutgoingEdges(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_sameType(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_hasParameters(activityParameterNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the maximumOneParameterNode constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_maximumOneParameterNode(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityParameterNode.maximumOneParameterNode(diagnostics, context);
	}

	/**
	 * Validates the maximumTwoParameterNodes constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_maximumTwoParameterNodes(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityParameterNode.maximumTwoParameterNodes(diagnostics, context);
	}

	/**
	 * Validates the noEdges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_noEdges(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityParameterNode.noEdges(diagnostics, context);
	}

	/**
	 * Validates the noIncomingEdges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_noIncomingEdges(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityParameterNode.noIncomingEdges(diagnostics, context);
	}

	/**
	 * Validates the noOutgoingEdges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_noOutgoingEdges(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityParameterNode.noOutgoingEdges(diagnostics, context);
	}

	/**
	 * Validates the sameType constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_sameType(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityParameterNode.sameType(diagnostics, context);
	}

	/**
	 * Validates the hasParameters constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_hasParameters(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activityParameterNode.hasParameters(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateActor_associations(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateActor_mustHaveName(actor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the associations constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_associations(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actor.associations(diagnostics, context);
	}

	/**
	 * Validates the mustHaveName constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_mustHaveName(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actor.mustHaveName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddStructuralFeatureValueAction(AddStructuralFeatureValueAction addStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addStructuralFeatureValueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_notStatic(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_oneFeaturingClassifier(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_sameType(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_inputPin(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_typeOfResult(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicityOfResult(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddStructuralFeatureValueAction_unlimitedNaturalAndMultiplicity(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddStructuralFeatureValueAction_requiredValue(addStructuralFeatureValueAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the unlimitedNaturalAndMultiplicity constraint of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddStructuralFeatureValueAction_unlimitedNaturalAndMultiplicity(AddStructuralFeatureValueAction addStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return addStructuralFeatureValueAction.unlimitedNaturalAndMultiplicity(diagnostics, context);
	}

	/**
	 * Validates the requiredValue constraint of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddStructuralFeatureValueAction_requiredValue(AddStructuralFeatureValueAction addStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return addStructuralFeatureValueAction.requiredValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(writeStructuralFeatureAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_notStatic(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_oneFeaturingClassifier(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_sameType(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_inputPin(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_typeOfResult(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicityOfResult(writeStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputPin constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction_inputPin(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return writeStructuralFeatureAction.inputPin(diagnostics, context);
	}

	/**
	 * Validates the typeOfResult constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction_typeOfResult(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return writeStructuralFeatureAction.typeOfResult(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfResult constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction_multiplicityOfResult(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return writeStructuralFeatureAction.multiplicityOfResult(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuralFeatureAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_notStatic(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_oneFeaturingClassifier(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_sameType(structuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the visibility constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_visibility(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuralFeatureAction.visibility(diagnostics, context);
	}

	/**
	 * Validates the multiplicity constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_multiplicity(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuralFeatureAction.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the notStatic constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_notStatic(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuralFeatureAction.notStatic(diagnostics, context);
	}

	/**
	 * Validates the oneFeaturingClassifier constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_oneFeaturingClassifier(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuralFeatureAction.oneFeaturingClassifier(diagnostics, context);
	}

	/**
	 * Validates the sameType constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_sameType(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return structuralFeatureAction.sameType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddVariableValueAction(AddVariableValueAction addVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addVariableValueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scopeOfVariable(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_multiplicity(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_sameType(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddVariableValueAction_requiredValue(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddVariableValueAction_singleInputPin(addVariableValueAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredValue constraint of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddVariableValueAction_requiredValue(AddVariableValueAction addVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return addVariableValueAction.requiredValue(diagnostics, context);
	}

	/**
	 * Validates the singleInputPin constraint of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddVariableValueAction_singleInputPin(AddVariableValueAction addVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return addVariableValueAction.singleInputPin(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteVariableAction(WriteVariableAction writeVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(writeVariableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scopeOfVariable(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_multiplicity(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_sameType(writeVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the multiplicity constraint of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteVariableAction_multiplicity(WriteVariableAction writeVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return writeVariableAction.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the sameType constraint of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteVariableAction_sameType(WriteVariableAction writeVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return writeVariableAction.sameType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAction(VariableAction variableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scopeOfVariable(variableAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the scopeOfVariable constraint of '<em>Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAction_scopeOfVariable(VariableAction variableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return variableAction.scopeOfVariable(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyReceiveEvent(AnyReceiveEvent anyReceiveEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anyReceiveEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(anyReceiveEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageEvent(MessageEvent messageEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(messageEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClass(AssociationClass associationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specializedEndNumber(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_associationEnds(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_binaryAssociations(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specializedEndTypes(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationClass_disjointAttributesEnds(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationClass_cannotBeDefined(associationClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the disjointAttributesEnds constraint of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClass_disjointAttributesEnds(AssociationClass associationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return associationClass.disjointAttributesEnds(diagnostics, context);
	}

	/**
	 * Validates the cannotBeDefined constraint of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClass_cannotBeDefined(AssociationClass associationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return associationClass.cannotBeDefined(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorExecutionSpecification(BehaviorExecutionSpecification behaviorExecutionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviorExecutionSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionSpecification_sameLifeline(behaviorExecutionSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSignalAction(BroadcastSignalAction broadcastSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(broadcastSignalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationAction_onPortReceiver(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBroadcastSignalAction_typeOrderingMultiplicity(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBroadcastSignalAction_numberAndOrder(broadcastSignalAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeOrderingMultiplicity constraint of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSignalAction_typeOrderingMultiplicity(BroadcastSignalAction broadcastSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return broadcastSignalAction.typeOrderingMultiplicity(diagnostics, context);
	}

	/**
	 * Validates the numberAndOrder constraint of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSignalAction_numberAndOrder(BroadcastSignalAction broadcastSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return broadcastSignalAction.numberAndOrder(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationAction(InvocationAction invocationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invocationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationAction_onPortReceiver(invocationAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onPortReceiver constraint of '<em>Invocation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationAction_onPortReceiver(InvocationAction invocationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return invocationAction.onPortReceiver(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationAction_onPortReceiver(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_synchronousCall(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_numberAndOrder(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_typeOrderingMultiplicity(callAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the synchronousCall constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction_synchronousCall(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callAction.synchronousCall(diagnostics, context);
	}

	/**
	 * Validates the numberAndOrder constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction_numberAndOrder(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callAction.numberAndOrder(diagnostics, context);
	}

	/**
	 * Validates the typeOrderingMultiplicity constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction_typeOrderingMultiplicity(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callAction.typeOrderingMultiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallBehaviorAction(CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callBehaviorAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationAction_onPortReceiver(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_synchronousCall(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_numberAndOrder(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_typeOrderingMultiplicity(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallBehaviorAction_resultPinEqualParameter(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallBehaviorAction_argumentPinEqualParameter(callBehaviorAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the resultPinEqualParameter constraint of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallBehaviorAction_resultPinEqualParameter(CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callBehaviorAction.resultPinEqualParameter(diagnostics, context);
	}

	/**
	 * Validates the argumentPinEqualParameter constraint of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallBehaviorAction_argumentPinEqualParameter(CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callBehaviorAction.argumentPinEqualParameter(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallEvent(CallEvent callEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(callEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction(CallOperationAction callOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callOperationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationAction_onPortReceiver(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_synchronousCall(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_numberAndOrder(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_typeOrderingMultiplicity(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallOperationAction_argumentPinEqualParameter(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallOperationAction_resultPinEqualParameter(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallOperationAction_typeTargetPin(callOperationAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the argumentPinEqualParameter constraint of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction_argumentPinEqualParameter(CallOperationAction callOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callOperationAction.argumentPinEqualParameter(diagnostics, context);
	}

	/**
	 * Validates the resultPinEqualParameter constraint of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction_resultPinEqualParameter(CallOperationAction callOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callOperationAction.resultPinEqualParameter(diagnostics, context);
	}

	/**
	 * Validates the typeTargetPin constraint of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction_typeTargetPin(CallOperationAction callOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callOperationAction.typeTargetPin(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentralBufferNode(CentralBufferNode centralBufferNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(centralBufferNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(centralBufferNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeEvent(ChangeEvent changeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(changeEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(changeEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause(Clause clause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateClause_testAndBody(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateClause_bodyOutputPins(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateClause_deciderOutput(clause, diagnostics, context);
		return result;
	}

	/**
	 * Validates the testAndBody constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause_testAndBody(Clause clause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clause.testAndBody(diagnostics, context);
	}

	/**
	 * Validates the bodyOutputPins constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause_bodyOutputPins(Clause clause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clause.bodyOutputPins(diagnostics, context);
	}

	/**
	 * Validates the deciderOutput constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause_deciderOutput(Clause clause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clause.deciderOutput(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearAssociationAction(ClearAssociationAction clearAssociationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clearAssociationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClearAssociationAction_multiplicity(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClearAssociationAction_sameType(clearAssociationAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the multiplicity constraint of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearAssociationAction_multiplicity(ClearAssociationAction clearAssociationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clearAssociationAction.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the sameType constraint of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearAssociationAction_sameType(ClearAssociationAction clearAssociationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clearAssociationAction.sameType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearStructuralFeatureAction(ClearStructuralFeatureAction clearStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clearStructuralFeatureAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_notStatic(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_oneFeaturingClassifier(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_sameType(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClearStructuralFeatureAction_multiplicityOfResult(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClearStructuralFeatureAction_typeOfResult(clearStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the multiplicityOfResult constraint of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearStructuralFeatureAction_multiplicityOfResult(ClearStructuralFeatureAction clearStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clearStructuralFeatureAction.multiplicityOfResult(diagnostics, context);
	}

	/**
	 * Validates the typeOfResult constraint of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearStructuralFeatureAction_typeOfResult(ClearStructuralFeatureAction clearStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clearStructuralFeatureAction.typeOfResult(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearVariableAction(ClearVariableAction clearVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clearVariableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scopeOfVariable(clearVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(combinedFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_break_(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_optLoopBreakNeg(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_considerAndIgnore(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_minintAndMaxint(combinedFragment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the break_ constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment_break_(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return combinedFragment.break_(diagnostics, context);
	}

	/**
	 * Validates the optLoopBreakNeg constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment_optLoopBreakNeg(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return combinedFragment.optLoopBreakNeg(diagnostics, context);
	}

	/**
	 * Validates the considerAndIgnore constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment_considerAndIgnore(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return combinedFragment.considerAndIgnore(diagnostics, context);
	}

	/**
	 * Validates the minintAndMaxint constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment_minintAndMaxint(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return combinedFragment.minintAndMaxint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPath(CommunicationPath communicationPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationPath, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specializedEndNumber(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_associationEnds(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_binaryAssociations(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specializedEndTypes(communicationPath, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_noPackagedElements(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_noNestedClassifiers(component, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noPackagedElements constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_noPackagedElements(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return component.noPackagedElements(diagnostics, context);
	}

	/**
	 * Validates the noNestedClassifiers constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_noNestedClassifiers(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return component.noNestedClassifiers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentRealization(ComponentRealization componentRealization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentRealization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(componentRealization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionalNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_groupOwned(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_notContained(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodesAndEdges(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_inputPinEdges(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_outputPinEdges(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_executableNodes(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_clauseNoPredecessor(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_matchingOutputPins(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_oneClauseWithExecutableNode(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_resultNoIncoming(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_noInputPins(conditionalNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the executableNodes constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_executableNodes(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalNode.executableNodes(diagnostics, context);
	}

	/**
	 * Validates the clauseNoPredecessor constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_clauseNoPredecessor(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalNode.clauseNoPredecessor(diagnostics, context);
	}

	/**
	 * Validates the matchingOutputPins constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_matchingOutputPins(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalNode.matchingOutputPins(diagnostics, context);
	}

	/**
	 * Validates the oneClauseWithExecutableNode constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_oneClauseWithExecutableNode(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalNode.oneClauseWithExecutableNode(diagnostics, context);
	}

	/**
	 * Validates the resultNoIncoming constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_resultNoIncoming(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalNode.resultNoIncoming(diagnostics, context);
	}

	/**
	 * Validates the noInputPins constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_noInputPins(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalNode.noInputPins(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderIgnoreFragment(ConsiderIgnoreFragment considerIgnoreFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(considerIgnoreFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_break_(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_optLoopBreakNeg(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_considerAndIgnore(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_minintAndMaxint(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsiderIgnoreFragment_type(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsiderIgnoreFragment_considerOrIgnore(considerIgnoreFragment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the type constraint of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderIgnoreFragment_type(ConsiderIgnoreFragment considerIgnoreFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return considerIgnoreFragment.type(diagnostics, context);
	}

	/**
	 * Validates the considerOrIgnore constraint of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderIgnoreFragment_considerOrIgnore(ConsiderIgnoreFragment considerIgnoreFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return considerIgnoreFragment.considerOrIgnore(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuation_sameName(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuation_firstOrLastInteractionFragment(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuation_global(continuation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sameName constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation_sameName(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuation.sameName(diagnostics, context);
	}

	/**
	 * Validates the firstOrLastInteractionFragment constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation_firstOrLastInteractionFragment(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuation.firstOrLastInteractionFragment(diagnostics, context);
	}

	/**
	 * Validates the global constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation_global(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuation.global(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlFlow(ControlFlow controlFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_owned(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_sourceAndTarget(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_structuredNode(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlFlow_objectNodes(controlFlow, diagnostics, context);
		return result;
	}

	/**
	 * Validates the objectNodes constraint of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlFlow_objectNodes(ControlFlow controlFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controlFlow.objectNodes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkAction(CreateLinkAction createLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createLinkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_samePins(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_sameAssociation(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_notStatic(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteLinkAction_allowAccess(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkAction_associationNotAbstract(createLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the associationNotAbstract constraint of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkAction_associationNotAbstract(CreateLinkAction createLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createLinkAction.associationNotAbstract(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteLinkAction(WriteLinkAction writeLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(writeLinkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_samePins(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_sameAssociation(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_notStatic(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteLinkAction_allowAccess(writeLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the allowAccess constraint of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteLinkAction_allowAccess(WriteLinkAction writeLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return writeLinkAction.allowAccess(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction(LinkAction linkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_samePins(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_sameAssociation(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_notStatic(linkAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the samePins constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction_samePins(LinkAction linkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkAction.samePins(diagnostics, context);
	}

	/**
	 * Validates the sameAssociation constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction_sameAssociation(LinkAction linkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkAction.sameAssociation(diagnostics, context);
	}

	/**
	 * Validates the notStatic constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction_notStatic(LinkAction linkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkAction.notStatic(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkEndData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_propertyIsAssociationEnd(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_endObjectInputPin(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_sameType(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_multiplicity(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_qualifiers(linkEndData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the propertyIsAssociationEnd constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_propertyIsAssociationEnd(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndData.propertyIsAssociationEnd(diagnostics, context);
	}

	/**
	 * Validates the endObjectInputPin constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_endObjectInputPin(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndData.endObjectInputPin(diagnostics, context);
	}

	/**
	 * Validates the sameType constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_sameType(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndData.sameType(diagnostics, context);
	}

	/**
	 * Validates the multiplicity constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_multiplicity(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndData.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the qualifiers constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_qualifiers(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndData.qualifiers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualifierValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualifierValue_qualifierAttribute(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualifierValue_multiplicityOfQualifier(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualifierValue_typeOfQualifier(qualifierValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the qualifierAttribute constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue_qualifierAttribute(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualifierValue.qualifierAttribute(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfQualifier constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue_multiplicityOfQualifier(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualifierValue.multiplicityOfQualifier(diagnostics, context);
	}

	/**
	 * Validates the typeOfQualifier constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue_typeOfQualifier(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return qualifierValue.typeOfQualifier(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndCreationData(LinkEndCreationData linkEndCreationData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkEndCreationData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_propertyIsAssociationEnd(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_endObjectInputPin(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_sameType(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_multiplicity(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_qualifiers(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndCreationData_createLinkAction(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndCreationData_singleInputPin(linkEndCreationData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the createLinkAction constraint of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndCreationData_createLinkAction(LinkEndCreationData linkEndCreationData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndCreationData.createLinkAction(diagnostics, context);
	}

	/**
	 * Validates the singleInputPin constraint of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndCreationData_singleInputPin(LinkEndCreationData linkEndCreationData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndCreationData.singleInputPin(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createLinkObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_samePins(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_sameAssociation(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_notStatic(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteLinkAction_allowAccess(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkAction_associationNotAbstract(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkObjectAction_associationClass(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkObjectAction_typeOfResult(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkObjectAction_multiplicity(createLinkObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the associationClass constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction_associationClass(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createLinkObjectAction.associationClass(diagnostics, context);
	}

	/**
	 * Validates the typeOfResult constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction_typeOfResult(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createLinkObjectAction.typeOfResult(diagnostics, context);
	}

	/**
	 * Validates the multiplicity constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction_multiplicity(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createLinkObjectAction.multiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateObjectAction_classifierNotAssociationClass(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateObjectAction_classifierNotAbstract(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateObjectAction_sameType(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateObjectAction_multiplicity(createObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the classifierNotAssociationClass constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction_classifierNotAssociationClass(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createObjectAction.classifierNotAssociationClass(diagnostics, context);
	}

	/**
	 * Validates the classifierNotAbstract constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction_classifierNotAbstract(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createObjectAction.classifierNotAbstract(diagnostics, context);
	}

	/**
	 * Validates the sameType constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction_sameType(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createObjectAction.sameType(diagnostics, context);
	}

	/**
	 * Validates the multiplicity constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction_multiplicity(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return createObjectAction.multiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStoreNode(DataStoreNode dataStoreNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataStoreNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(dataStoreNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(decisionNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_parameters(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_incomingObjectOneInputParameter(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_incomingOutgoingEdges(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_incomingControlOneInputParameter(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_twoInputParameters(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_decisionInputFlowIncoming(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_zeroInputParameters(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_edges(decisionNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the parameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_parameters(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decisionNode.parameters(diagnostics, context);
	}

	/**
	 * Validates the incomingObjectOneInputParameter constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_incomingObjectOneInputParameter(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decisionNode.incomingObjectOneInputParameter(diagnostics, context);
	}

	/**
	 * Validates the incomingOutgoingEdges constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_incomingOutgoingEdges(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decisionNode.incomingOutgoingEdges(diagnostics, context);
	}

	/**
	 * Validates the incomingControlOneInputParameter constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_incomingControlOneInputParameter(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decisionNode.incomingControlOneInputParameter(diagnostics, context);
	}

	/**
	 * Validates the twoInputParameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_twoInputParameters(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decisionNode.twoInputParameters(diagnostics, context);
	}

	/**
	 * Validates the decisionInputFlowIncoming constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_decisionInputFlowIncoming(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decisionNode.decisionInputFlowIncoming(diagnostics, context);
	}

	/**
	 * Validates the zeroInputParameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_zeroInputParameters(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decisionNode.zeroInputParameters(diagnostics, context);
	}

	/**
	 * Validates the edges constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_edges(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return decisionNode.edges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_owned(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_sourceAndTarget(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_structuredNode(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_isMulticastOrIsMultireceive(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_selectionBehaviour(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_compatibleTypes(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_noActions(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_inputAndOutputParameter(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_transformationBehaviour(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_target(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_sameUpperBounds(objectFlow, diagnostics, context);
		return result;
	}

	/**
	 * Validates the isMulticastOrIsMultireceive constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_isMulticastOrIsMultireceive(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectFlow.isMulticastOrIsMultireceive(diagnostics, context);
	}

	/**
	 * Validates the selectionBehaviour constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_selectionBehaviour(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectFlow.selectionBehaviour(diagnostics, context);
	}

	/**
	 * Validates the compatibleTypes constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_compatibleTypes(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectFlow.compatibleTypes(diagnostics, context);
	}

	/**
	 * Validates the noActions constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_noActions(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectFlow.noActions(diagnostics, context);
	}

	/**
	 * Validates the inputAndOutputParameter constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_inputAndOutputParameter(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectFlow.inputAndOutputParameter(diagnostics, context);
	}

	/**
	 * Validates the transformationBehaviour constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_transformationBehaviour(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectFlow.transformationBehaviour(diagnostics, context);
	}

	/**
	 * Validates the target constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_target(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectFlow.target(diagnostics, context);
	}

	/**
	 * Validates the sameUpperBounds constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_sameUpperBounds(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectFlow.sameUpperBounds(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyLinkAction(DestroyLinkAction destroyLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(destroyLinkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_samePins(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_sameAssociation(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_notStatic(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteLinkAction_allowAccess(destroyLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndDestructionData(LinkEndDestructionData linkEndDestructionData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkEndDestructionData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_propertyIsAssociationEnd(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_endObjectInputPin(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_sameType(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_multiplicity(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_qualifiers(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndDestructionData_destroyLinkAction(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndDestructionData_unlimitedNaturalAndMultiplicity(linkEndDestructionData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the destroyLinkAction constraint of '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndDestructionData_destroyLinkAction(LinkEndDestructionData linkEndDestructionData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndDestructionData.destroyLinkAction(diagnostics, context);
	}

	/**
	 * Validates the unlimitedNaturalAndMultiplicity constraint of '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndDestructionData_unlimitedNaturalAndMultiplicity(LinkEndDestructionData linkEndDestructionData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkEndDestructionData.unlimitedNaturalAndMultiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyObjectAction(DestroyObjectAction destroyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(destroyObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDestroyObjectAction_multiplicity(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDestroyObjectAction_noType(destroyObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the multiplicity constraint of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyObjectAction_multiplicity(DestroyObjectAction destroyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return destroyObjectAction.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the noType constraint of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyObjectAction_noType(DestroyObjectAction destroyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return destroyObjectAction.noType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestructionOccurrenceSpecification(DestructionOccurrenceSpecification destructionOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(destructionOccurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateDestructionOccurrenceSpecification_noOccurrenceSpecificationsBelow(destructionOccurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noOccurrenceSpecificationsBelow constraint of '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestructionOccurrenceSpecification_noOccurrenceSpecificationsBelow(DestructionOccurrenceSpecification destructionOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return destructionOccurrenceSpecification.noOccurrenceSpecificationsBelow(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageOccurrenceSpecification(MessageOccurrenceSpecification messageOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageOccurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(messageOccurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(device, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_internalStructure(device, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_internalStructure(node, diagnostics, context);
		return result;
	}

	/**
	 * Validates the internalStructure constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_internalStructure(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return node.internalStructure(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(duration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(duration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(observation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(observation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationConstraint(DurationConstraint durationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(durationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_notApplyToSelf(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_noSideEffects(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_booleanValue(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_valueSpecificationBoolean(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationConstraint_firstEventMultiplicity(durationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the firstEventMultiplicity constraint of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationConstraint_firstEventMultiplicity(DurationConstraint durationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return durationConstraint.firstEventMultiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntervalConstraint(IntervalConstraint intervalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intervalConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_notApplyToSelf(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_noSideEffects(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_booleanValue(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_valueSpecificationBoolean(intervalConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterval(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(interval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInterval(DurationInterval durationInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(durationInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(durationInterval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationObservation(DurationObservation durationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(durationObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationObservation_firstEventMultiplicity(durationObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the firstEventMultiplicity constraint of '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationObservation_firstEventMultiplicity(DurationObservation durationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return durationObservation.firstEventMultiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionEnvironment(ExecutionEnvironment executionEnvironment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionEnvironment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_internalStructure(executionEnvironment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionOccurrenceSpecification(ExecutionOccurrenceSpecification executionOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionOccurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(executionOccurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionNode(ExpansionNode expansionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expansionNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpansionNode_regionAsInputOrOutput(expansionNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the regionAsInputOrOutput constraint of '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionNode_regionAsInputOrOutput(ExpansionNode expansionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return expansionNode.regionAsInputOrOutput(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionRegion(ExpansionRegion expansionRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expansionRegion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_groupOwned(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_notContained(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodesAndEdges(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_inputPinEdges(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_outputPinEdges(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpansionRegion_expansionNodes(expansionRegion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the expansionNodes constraint of '<em>Expansion Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionRegion_expansionNodes(ExpansionRegion expansionRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return expansionRegion.expansionNodes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(finalState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_entryOrExit(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_compositeStates(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_destinationsOrSourcesOfTransitions(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_submachineOrRegions(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_submachineStates(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_noOutgoingTransitions(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_cannotReferenceSubmachine(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_noExitBehavior(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_noEntryBehavior(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_noStateBehavior(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_noRegions(finalState, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noOutgoingTransitions constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_noOutgoingTransitions(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return finalState.noOutgoingTransitions(diagnostics, context);
	}

	/**
	 * Validates the cannotReferenceSubmachine constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_cannotReferenceSubmachine(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return finalState.cannotReferenceSubmachine(diagnostics, context);
	}

	/**
	 * Validates the noExitBehavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_noExitBehavior(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return finalState.noExitBehavior(diagnostics, context);
	}

	/**
	 * Validates the noEntryBehavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_noEntryBehavior(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return finalState.noEntryBehavior(diagnostics, context);
	}

	/**
	 * Validates the noStateBehavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_noStateBehavior(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return finalState.noStateBehavior(diagnostics, context);
	}

	/**
	 * Validates the noRegions constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_noRegions(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return finalState.noRegions(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowFinalNode(FlowFinalNode flowFinalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(flowFinalNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalNode_noOutgoingEdges(flowFinalNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkNode(ForkNode forkNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forkNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateForkNode_edges(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateForkNode_oneIncomingEdge(forkNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the edges constraint of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkNode_edges(ForkNode forkNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return forkNode.edges(diagnostics, context);
	}

	/**
	 * Validates the oneIncomingEdge constraint of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkNode_oneIncomingEdge(ForkNode forkNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return forkNode.oneIncomingEdge(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBehavior(FunctionBehavior functionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parametersMatch(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_featureOfContextClassifier(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mustRealize(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mostOneBehaviour(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionBehavior_oneOutputParameter(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionBehavior_typesOfParameters(functionBehavior, diagnostics, context);
		return result;
	}

	/**
	 * Validates the oneOutputParameter constraint of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBehavior_oneOutputParameter(FunctionBehavior functionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionBehavior.oneOutputParameter(diagnostics, context);
	}

	/**
	 * Validates the typesOfParameters constraint of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBehavior_typesOfParameters(FunctionBehavior functionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionBehavior.typesOfParameters(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueBehavior(OpaqueBehavior opaqueBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(opaqueBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredClassifier_multiplicities(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_classBehavior(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passiveClass(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parametersMatch(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_featureOfContextClassifier(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mustRealize(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_mostOneBehaviour(opaqueBehavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow(InformationFlow informationFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(informationFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationFlow_sourcesAndTargetsKind(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationFlow_mustConform(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationFlow_conveyClassifiers(informationFlow, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourcesAndTargetsKind constraint of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow_sourcesAndTargetsKind(InformationFlow informationFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return informationFlow.sourcesAndTargetsKind(diagnostics, context);
	}

	/**
	 * Validates the mustConform constraint of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow_mustConform(InformationFlow informationFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return informationFlow.mustConform(diagnostics, context);
	}

	/**
	 * Validates the conveyClassifiers constraint of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow_conveyClassifiers(InformationFlow informationFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return informationFlow.conveyClassifiers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem(InformationItem informationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(informationItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationItem_hasNo(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationItem_notInstantiable(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationItem_sourcesAndTargets(informationItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasNo constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem_hasNo(InformationItem informationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return informationItem.hasNo(diagnostics, context);
	}

	/**
	 * Validates the notInstantiable constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem_notInstantiable(InformationItem informationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return informationItem.notInstantiable(diagnostics, context);
	}

	/**
	 * Validates the sourcesAndTargets constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem_sourcesAndTargets(InformationItem informationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return informationItem.sourcesAndTargets(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode(InitialNode initialNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(initialNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateInitialNode_noIncomingEdges(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateInitialNode_controlEdges(initialNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noIncomingEdges constraint of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode_noIncomingEdges(InitialNode initialNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return initialNode.noIncomingEdges(diagnostics, context);
	}

	/**
	 * Validates the controlEdges constraint of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode_controlEdges(InitialNode initialNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return initialNode.controlEdges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceValue(InstanceValue instanceValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(instanceValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinNode(JoinNode joinNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(joinNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateJoinNode_oneOutgoingEdge(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateJoinNode_incomingObjectFlow(joinNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the oneOutgoingEdge constraint of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinNode_oneOutgoingEdge(JoinNode joinNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return joinNode.oneOutgoingEdge(diagnostics, context);
	}

	/**
	 * Validates the incomingObjectFlow constraint of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinNode_incomingObjectFlow(JoinNode joinNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return joinNode.incomingObjectFlow(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralBoolean(LiteralBoolean literalBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalBoolean, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(literalBoolean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralSpecification(LiteralSpecification literalSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(literalSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralInteger(LiteralInteger literalInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalInteger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(literalInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralNull(LiteralNull literalNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalNull, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(literalNull, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralReal(LiteralReal literalReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalReal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(literalReal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralString(LiteralString literalString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalString, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(literalString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralUnlimitedNatural(LiteralUnlimitedNatural literalUnlimitedNatural, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalUnlimitedNatural, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(literalUnlimitedNatural, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loopNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_groupOwned(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_notContained(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodesAndEdges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_inputPinEdges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_outputPinEdges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_executableNodes(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_bodyOutputPins(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_resultNoIncoming(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_inputEdges(loopNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the executableNodes constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_executableNodes(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return loopNode.executableNodes(diagnostics, context);
	}

	/**
	 * Validates the bodyOutputPins constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_bodyOutputPins(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return loopNode.bodyOutputPins(diagnostics, context);
	}

	/**
	 * Validates the resultNoIncoming constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_resultNoIncoming(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return loopNode.resultNoIncoming(diagnostics, context);
	}

	/**
	 * Validates the inputEdges constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_inputEdges(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return loopNode.inputEdges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeNode(MergeNode mergeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mergeNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateMergeNode_oneOutgoingEdge(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateMergeNode_edges(mergeNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the oneOutgoingEdge constraint of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeNode_oneOutgoingEdge(MergeNode mergeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mergeNode.oneOutgoingEdge(diagnostics, context);
	}

	/**
	 * Validates the edges constraint of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeNode_edges(MergeNode mergeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mergeNode.edges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueAction(OpaqueAction opaqueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(opaqueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(opaqueAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocolTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_stateIsLocal(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_forkSegmentGuards(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_joinSegmentState(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_initialTransition(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_outgoingPseudostates(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_signaturesCompatible(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_stateIsInternal(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_joinSegmentGuards(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_forkSegmentState(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_stateIsExternal(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolTransition_refersToOperation(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolTransition_associatedActions(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolTransition_belongsToPsm(protocolTransition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the refersToOperation constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition_refersToOperation(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocolTransition.refersToOperation(diagnostics, context);
	}

	/**
	 * Validates the associatedActions constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition_associatedActions(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocolTransition.associatedActions(diagnostics, context);
	}

	/**
	 * Validates the belongsToPsm constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition_belongsToPsm(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocolTransition.belongsToPsm(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaiseExceptionAction(RaiseExceptionAction raiseExceptionAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(raiseExceptionAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(raiseExceptionAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadExtentAction(ReadExtentAction readExtentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readExtentAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadExtentAction_typeIsClassifier(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadExtentAction_multiplicityOfResult(readExtentAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeIsClassifier constraint of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadExtentAction_typeIsClassifier(ReadExtentAction readExtentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readExtentAction.typeIsClassifier(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfResult constraint of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadExtentAction_multiplicityOfResult(ReadExtentAction readExtentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readExtentAction.multiplicityOfResult(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readIsClassifiedObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadIsClassifiedObjectAction_noType(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadIsClassifiedObjectAction_multiplicityOfOutput(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadIsClassifiedObjectAction_booleanResult(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadIsClassifiedObjectAction_multiplicityOfInput(readIsClassifiedObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noType constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction_noType(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readIsClassifiedObjectAction.noType(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfOutput constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction_multiplicityOfOutput(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readIsClassifiedObjectAction.multiplicityOfOutput(diagnostics, context);
	}

	/**
	 * Validates the booleanResult constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction_booleanResult(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readIsClassifiedObjectAction.booleanResult(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfInput constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction_multiplicityOfInput(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readIsClassifiedObjectAction.multiplicityOfInput(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readLinkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_samePins(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_sameAssociation(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_notStatic(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_typeAndOrdering(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_oneOpenEnd(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_compatibleMultiplicity(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_navigableOpenEnd(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_visibility(readLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeAndOrdering constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_typeAndOrdering(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkAction.typeAndOrdering(diagnostics, context);
	}

	/**
	 * Validates the oneOpenEnd constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_oneOpenEnd(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkAction.oneOpenEnd(diagnostics, context);
	}

	/**
	 * Validates the compatibleMultiplicity constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_compatibleMultiplicity(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkAction.compatibleMultiplicity(diagnostics, context);
	}

	/**
	 * Validates the navigableOpenEnd constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_navigableOpenEnd(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkAction.navigableOpenEnd(diagnostics, context);
	}

	/**
	 * Validates the visibility constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_visibility(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkAction.visibility(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readLinkObjectEndAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_associationOfAssociation(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_multiplicityOfObject(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_typeOfResult(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_typeOfObject(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_property(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_multiplicityOfResult(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_endsOfAssociation(readLinkObjectEndAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the associationOfAssociation constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_associationOfAssociation(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndAction.associationOfAssociation(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfObject constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_multiplicityOfObject(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndAction.multiplicityOfObject(diagnostics, context);
	}

	/**
	 * Validates the typeOfResult constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_typeOfResult(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndAction.typeOfResult(diagnostics, context);
	}

	/**
	 * Validates the typeOfObject constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_typeOfObject(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndAction.typeOfObject(diagnostics, context);
	}

	/**
	 * Validates the property constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_property(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndAction.property(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfResult constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_multiplicityOfResult(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndAction.multiplicityOfResult(diagnostics, context);
	}

	/**
	 * Validates the endsOfAssociation constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_endsOfAssociation(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndAction.endsOfAssociation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readLinkObjectEndQualifierAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_typeOfObject(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_multiplicityOfResult(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_sameType(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_endsOfAssociation(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_multiplicityOfQualifier(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_multiplicityOfObject(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_associationOfAssociation(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_qualifierAttribute(readLinkObjectEndQualifierAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeOfObject constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_typeOfObject(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndQualifierAction.typeOfObject(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfResult constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_multiplicityOfResult(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndQualifierAction.multiplicityOfResult(diagnostics, context);
	}

	/**
	 * Validates the sameType constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_sameType(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndQualifierAction.sameType(diagnostics, context);
	}

	/**
	 * Validates the endsOfAssociation constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_endsOfAssociation(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndQualifierAction.endsOfAssociation(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfQualifier constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_multiplicityOfQualifier(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndQualifierAction.multiplicityOfQualifier(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfObject constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_multiplicityOfObject(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndQualifierAction.multiplicityOfObject(diagnostics, context);
	}

	/**
	 * Validates the associationOfAssociation constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_associationOfAssociation(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndQualifierAction.associationOfAssociation(diagnostics, context);
	}

	/**
	 * Validates the qualifierAttribute constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_qualifierAttribute(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readLinkObjectEndQualifierAction.qualifierAttribute(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readSelfAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadSelfAction_contained(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadSelfAction_type(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadSelfAction_notStatic(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadSelfAction_multiplicity(readSelfAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the contained constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction_contained(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readSelfAction.contained(diagnostics, context);
	}

	/**
	 * Validates the type constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction_type(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readSelfAction.type(diagnostics, context);
	}

	/**
	 * Validates the notStatic constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction_notStatic(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readSelfAction.notStatic(diagnostics, context);
	}

	/**
	 * Validates the multiplicity constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction_multiplicity(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readSelfAction.multiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadStructuralFeatureAction(ReadStructuralFeatureAction readStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readStructuralFeatureAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_notStatic(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_oneFeaturingClassifier(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_sameType(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadStructuralFeatureAction_typeAndOrdering(readStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeAndOrdering constraint of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadStructuralFeatureAction_typeAndOrdering(ReadStructuralFeatureAction readStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readStructuralFeatureAction.typeAndOrdering(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadVariableAction(ReadVariableAction readVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readVariableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scopeOfVariable(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadVariableAction_typeAndOrdering(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadVariableAction_compatibleMultiplicity(readVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeAndOrdering constraint of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadVariableAction_typeAndOrdering(ReadVariableAction readVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readVariableAction.typeAndOrdering(diagnostics, context);
	}

	/**
	 * Validates the compatibleMultiplicity constraint of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadVariableAction_compatibleMultiplicity(ReadVariableAction readVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readVariableAction.compatibleMultiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reclassifyObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReclassifyObjectAction_inputPin(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReclassifyObjectAction_multiplicity(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReclassifyObjectAction_classifierNotAbstract(reclassifyObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputPin constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction_inputPin(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reclassifyObjectAction.inputPin(diagnostics, context);
	}

	/**
	 * Validates the multiplicity constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction_multiplicity(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reclassifyObjectAction.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the classifierNotAbstract constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction_classifierNotAbstract(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reclassifyObjectAction.classifierNotAbstract(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceAction(ReduceAction reduceAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reduceAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReduceAction_outputTypesAreCompatible(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReduceAction_reducerInputsOutput(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReduceAction_inputTypeIsCollection(reduceAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outputTypesAreCompatible constraint of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceAction_outputTypesAreCompatible(ReduceAction reduceAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reduceAction.outputTypesAreCompatible(diagnostics, context);
	}

	/**
	 * Validates the reducerInputsOutput constraint of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceAction_reducerInputsOutput(ReduceAction reduceAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reduceAction.reducerInputsOutput(diagnostics, context);
	}

	/**
	 * Validates the inputTypeIsCollection constraint of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceAction_inputTypeIsCollection(ReduceAction reduceAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reduceAction.inputTypeIsCollection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(removeStructuralFeatureValueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_notStatic(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_oneFeaturingClassifier(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_sameType(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_inputPin(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_typeOfResult(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicityOfResult(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRemoveStructuralFeatureValueAction_nonUniqueRemoval(removeStructuralFeatureValueAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonUniqueRemoval constraint of '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveStructuralFeatureValueAction_nonUniqueRemoval(RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return removeStructuralFeatureValueAction.nonUniqueRemoval(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveVariableValueAction(RemoveVariableValueAction removeVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(removeVariableValueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scopeOfVariable(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_multiplicity(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_sameType(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRemoveVariableValueAction_unlimitedNatural(removeVariableValueAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the unlimitedNatural constraint of '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveVariableValueAction_unlimitedNatural(RemoveVariableValueAction removeVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return removeVariableValueAction.unlimitedNatural(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyAction(ReplyAction replyAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(replyAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReplyAction_eventOnReplyToCallTrigger(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReplyAction_pinsMatchParameter(replyAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the eventOnReplyToCallTrigger constraint of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyAction_eventOnReplyToCallTrigger(ReplyAction replyAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return replyAction.eventOnReplyToCallTrigger(diagnostics, context);
	}

	/**
	 * Validates the pinsMatchParameter constraint of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyAction_pinsMatchParameter(ReplyAction replyAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return replyAction.pinsMatchParameter(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendObjectAction(SendObjectAction sendObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationAction_onPortReceiver(sendObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendSignalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationAction_onPortReceiver(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendSignalAction_typeOrderingMultiplicity(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendSignalAction_numberOrder(sendSignalAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeOrderingMultiplicity constraint of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction_typeOrderingMultiplicity(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sendSignalAction.typeOrderingMultiplicity(diagnostics, context);
	}

	/**
	 * Validates the numberOrder constraint of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction_numberOrder(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sendSignalAction.numberOrder(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceNode(SequenceNode sequenceNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequenceNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_groupOwned(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_notContained(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodesAndEdges(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_inputPinEdges(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_outputPinEdges(sequenceNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalEvent(SignalEvent signalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signalEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(signalEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartClassifierBehaviorAction(StartClassifierBehaviorAction startClassifierBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startClassifierBehaviorAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartClassifierBehaviorAction_typeHasClassifier(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartClassifierBehaviorAction_multiplicity(startClassifierBehaviorAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the typeHasClassifier constraint of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartClassifierBehaviorAction_typeHasClassifier(StartClassifierBehaviorAction startClassifierBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startClassifierBehaviorAction.typeHasClassifier(diagnostics, context);
	}

	/**
	 * Validates the multiplicity constraint of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartClassifierBehaviorAction_multiplicity(StartClassifierBehaviorAction startClassifierBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startClassifierBehaviorAction.multiplicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startObjectBehaviorAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvocationAction_onPortReceiver(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_synchronousCall(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_numberAndOrder(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_typeOrderingMultiplicity(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartObjectBehaviorAction_numberOrderArguments(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartObjectBehaviorAction_typeOrderingMultiplicityMatch(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartObjectBehaviorAction_numberOrderResults(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartObjectBehaviorAction_typeOfObject(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartObjectBehaviorAction_multiplicityOfObject(startObjectBehaviorAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOrderArguments constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction_numberOrderArguments(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startObjectBehaviorAction.numberOrderArguments(diagnostics, context);
	}

	/**
	 * Validates the typeOrderingMultiplicityMatch constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction_typeOrderingMultiplicityMatch(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startObjectBehaviorAction.typeOrderingMultiplicityMatch(diagnostics, context);
	}

	/**
	 * Validates the numberOrderResults constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction_numberOrderResults(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startObjectBehaviorAction.numberOrderResults(diagnostics, context);
	}

	/**
	 * Validates the typeOfObject constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction_typeOfObject(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startObjectBehaviorAction.typeOfObject(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfObject constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction_multiplicityOfObject(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startObjectBehaviorAction.multiplicityOfObject(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateInvariant(StateInvariant stateInvariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateInvariant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(stateInvariant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(testIdentityAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestIdentityAction_multiplicity(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestIdentityAction_noType(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestIdentityAction_resultIsBoolean(testIdentityAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the multiplicity constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction_multiplicity(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return testIdentityAction.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the noType constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction_noType(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return testIdentityAction.noType(diagnostics, context);
	}

	/**
	 * Validates the resultIsBoolean constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction_resultIsBoolean(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return testIdentityAction.resultIsBoolean(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeConstraint(TimeConstraint timeConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_notApplyToSelf(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_noSideEffects(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_booleanValue(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_valueSpecificationBoolean(timeConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval(TimeInterval timeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(timeInterval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeExpression(TimeExpression timeExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(timeExpression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEvent(TimeEvent timeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeEvent_startingTime(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeEvent_whenNonNegative(timeEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the startingTime constraint of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEvent_startingTime(TimeEvent timeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeEvent.startingTime(diagnostics, context);
	}

	/**
	 * Validates the whenNonNegative constraint of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEvent_whenNonNegative(TimeEvent timeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeEvent.whenNonNegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeObservation(TimeObservation timeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(timeObservation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unmarshallAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_sameType(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_structuralFeature(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_multiplicityOfObject(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_typeAndOrdering(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_numberOfResult(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_unmarshallTypeIsClassifier(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_multiplicityOfResult(unmarshallAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sameType constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_sameType(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unmarshallAction.sameType(diagnostics, context);
	}

	/**
	 * Validates the structuralFeature constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_structuralFeature(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unmarshallAction.structuralFeature(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfObject constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_multiplicityOfObject(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unmarshallAction.multiplicityOfObject(diagnostics, context);
	}

	/**
	 * Validates the typeAndOrdering constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_typeAndOrdering(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unmarshallAction.typeAndOrdering(diagnostics, context);
	}

	/**
	 * Validates the numberOfResult constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_numberOfResult(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unmarshallAction.numberOfResult(diagnostics, context);
	}

	/**
	 * Validates the unmarshallTypeIsClassifier constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_unmarshallTypeIsClassifier(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unmarshallAction.unmarshallTypeIsClassifier(diagnostics, context);
	}

	/**
	 * Validates the multiplicityOfResult constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_multiplicityOfResult(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unmarshallAction.multiplicityOfResult(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuePin(ValuePin valuePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valuePin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_objectFlowEdges(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selectionBehavior(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_inputOutputParameter(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lowerGe0(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upperGeLower(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationConstant(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_valueSpecificationNoSideEffects(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_controlPins(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputPin_outgoingEdgesStructuredOnly(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateValuePin_compatibleType(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateValuePin_noIncomingEdges(valuePin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the compatibleType constraint of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuePin_compatibleType(ValuePin valuePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valuePin.compatibleType(diagnostics, context);
	}

	/**
	 * Validates the noIncomingEdges constraint of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuePin_noIncomingEdges(ValuePin valuePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valuePin.noIncomingEdges(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationAction(ValueSpecificationAction valueSpecificationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueSpecificationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_owned(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityNode_ownedStructuredNode(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueSpecificationAction_multiplicity(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueSpecificationAction_compatibleType(valueSpecificationAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the multiplicity constraint of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationAction_multiplicity(ValueSpecificationAction valueSpecificationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valueSpecificationAction.multiplicity(diagnostics, context);
	}

	/**
	 * Validates the compatibleType constraint of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationAction_compatibleType(ValueSpecificationAction valueSpecificationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valueSpecificationAction.compatibleType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_hasOwner(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_notOwnSelf(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasQualifiedName(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_hasNoQualifiedName(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibilityNeedsOwnership(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_membersDistinguishable(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionConsistent(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_nonLeafRedefinition(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinitionContextValid(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_nonFinalParents(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_noCyclesInGeneralization(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specializeType(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_mapsToGeneralizationSet(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityKind(VisibilityKind visibilityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallConcurrencyKind(CallConcurrencyKind callConcurrencyKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionKind(TransitionKind transitionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostateKind(PseudostateKind pseudostateKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDirectionKind(ParameterDirectionKind parameterDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterEffectKind(ParameterEffectKind parameterEffectKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationKind(AggregationKind aggregationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorKind(ConnectorKind connectorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNodeOrderingKind(ObjectNodeOrderingKind objectNodeOrderingKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageKind(MessageKind messageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSort(MessageSort messageSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperatorKind(InteractionOperatorKind interactionOperatorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionKind(ExpansionKind expansionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //UmlValidator
