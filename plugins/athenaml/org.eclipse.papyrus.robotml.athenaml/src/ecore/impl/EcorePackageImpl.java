/**
 */
package ecore.impl;

import AthenaML.AthenaMLPackage;

import AthenaML.impl.AthenaMLPackageImpl;

import ecore.EAnnotation;
import ecore.EClassifier;
import ecore.EClassifier_Wildcard;
import ecore.EEnum;
import ecore.EEnumLiteral;
import ecore.EFactory;
import ecore.EGenericType;
import ecore.EModelElement;
import ecore.ENamedElement;
import ecore.EObject;
import ecore.EParameter;
import ecore.EStructuralFeature;
import ecore.EStructuralFeature_Wildcard;
import ecore.ETypeParameter;
import ecore.ETypedElement;
import ecore.EcoreFactory;
import ecore.EcorePackage;

import ecore.util.EcoreValidator;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.FeatureMap;

import types.TypesPackage;

import types.impl.TypesPackageImpl;

import uml.UmlPackage;

import uml.impl.UmlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassifier_WildcardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeature_WildcardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eClassifier_EJavaClassWildcardEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStructuralFeature_EJavaClassWildcardEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eObject_EeListEObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eObject_ETreeIteratorEObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eEnumeratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharacterObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDiagnosticChainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eeListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEntryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntegerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTreeIteratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eInvocationTargetExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecore.EcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
		super(eNS_URI, EcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorePackage init() {
		if (isInited) return (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Obtain or create and register package
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AthenaMLPackageImpl theAthenaMLPackage = (AthenaMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AthenaMLPackage.eNS_URI) instanceof AthenaMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AthenaMLPackage.eNS_URI) : AthenaMLPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);

		// Load packages
		theUmlPackage.loadPackage();

		// Create package meta-data objects
		theEcorePackage.createPackageContents();
		theAthenaMLPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theEcorePackage.initializePackageContents();
		theAthenaMLPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Fix loaded packages
		theUmlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEcorePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EcoreValidator.INSTANCE;
				 }
			 });

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
		return theEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAnnotation() {
		return eAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAnnotation_Source() {
		return (EAttribute)eAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Details() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_EModelElement() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Contents() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_References() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToStringMapEntry() {
		return eStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Key() {
		return (EAttribute)eStringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Value() {
		return (EAttribute)eStringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObject() {
		return eObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Abstract() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Interface() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_ESuperTypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EOperations() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllAttributes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EStructuralFeatures() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllReferences() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EReferences() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAttributes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllContainments() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllOperations() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllStructuralFeatures() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllSuperTypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EidAttribute() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EGenericSuperTypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllGenericSuperTypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassifier() {
		return eClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceClassName() {
		return (EAttribute)eClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceClass() {
		return (EAttribute)eClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_DefaultValue() {
		return (EAttribute)eClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceTypeName() {
		return (EAttribute)eClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_EPackage() {
		return (EReference)eClassifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_ETypeParameters() {
		return (EReference)eClassifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENamedElement() {
		return eNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENamedElement_Name() {
		return (EAttribute)eNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPackage() {
		return ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_NsUri() {
		return (EAttribute)ePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_NsPrefix() {
		return (EAttribute)ePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EFactoryInstance() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_ESubpackages() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_ESuperPackage() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EClassifiers() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFactory() {
		return eFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFactory_EPackage() {
		return (EReference)eFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDataType() {
		return eDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDataType_Serializable() {
		return (EAttribute)eDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypeParameter() {
		return eTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypeParameter_EBounds() {
		return (EReference)eTypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGenericType() {
		return eGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_EUpperBound() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ETypeArguments() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ERawType() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ELowerBound() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ETypeParameter() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_EClassifier() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassifier_Wildcard() {
		return eClassifier_WildcardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEOperation() {
		return eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_ETypeParameters() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EParameters() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EExceptions() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EGenericExceptions() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EContainingClass() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypedElement() {
		return eTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Ordered() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Unique() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_LowerBound() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_UpperBound() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Many() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Required() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EType() {
		return (EReference)eTypedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EGenericType() {
		return (EReference)eTypedElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEParameter() {
		return eParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEParameter_EOperation() {
		return (EReference)eParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttribute() {
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute_ID() {
		return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_EAttributeType() {
		return (EReference)eAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeature() {
		return eStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeature_EContainingClass() {
		return (EReference)eStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Changeable() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Volatile() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Transient() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_DefaultValueLiteral() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_DefaultValue() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Unsettable() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Derived() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeature_Wildcard() {
		return eStructuralFeature_WildcardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReference() {
		return eReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Containment() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Container() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_ResolveProxies() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EOpposite() {
		return (EReference)eReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EReferenceType() {
		return (EReference)eReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EKeys() {
		return (EReference)eReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnum() {
		return eEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnum_ELiterals() {
		return (EReference)eEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnumLiteral() {
		return eEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Value() {
		return (EAttribute)eEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Instance() {
		return (EAttribute)eEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Literal() {
		return (EAttribute)eEnumLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnumLiteral_EEnum() {
		return (EReference)eEnumLiteralEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEModelElement() {
		return eModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEModelElement_EAnnotations() {
		return (EReference)eModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEString() {
		return eStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEClassifier_EJavaClassWildcard() {
		return eClassifier_EJavaClassWildcardEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaObject() {
		return eJavaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBoolean() {
		return eBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInt() {
		return eIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEStructuralFeature_EJavaClassWildcard() {
		return eStructuralFeature_EJavaClassWildcardEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEResource() {
		return eResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEObject_EeListEObject() {
		return eObject_EeListEObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEObject_ETreeIteratorEObject() {
		return eObject_ETreeIteratorEObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEEnumerator() {
		return eEnumeratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBigDecimal() {
		return eBigDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBigInteger() {
		return eBigIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBooleanObject() {
		return eBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByte() {
		return eByteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByteArray() {
		return eByteArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByteObject() {
		return eByteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEChar() {
		return eCharEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getECharacterObject() {
		return eCharacterObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDate() {
		return eDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDiagnosticChain() {
		return eDiagnosticChainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDouble() {
		return eDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDoubleObject() {
		return eDoubleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEeList() {
		return eeListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFeatureMap() {
		return eFeatureMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFeatureMapEntry() {
		return eFeatureMapEntryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFloat() {
		return eFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFloatObject() {
		return eFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEIntegerObject() {
		return eIntegerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaClass() {
		return eJavaClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELong() {
		return eLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELongObject() {
		return eLongObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEMap() {
		return eMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEResourceSet() {
		return eResourceSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEShort() {
		return eShortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEShortObject() {
		return eShortObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getETreeIterator() {
		return eTreeIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInvocationTargetException() {
		return eInvocationTargetExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactory getEcoreFactory() {
		return (EcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eAnnotationEClass = createEClass(EANNOTATION);
		createEAttribute(eAnnotationEClass, EANNOTATION__SOURCE);
		createEReference(eAnnotationEClass, EANNOTATION__DETAILS);
		createEReference(eAnnotationEClass, EANNOTATION__EMODEL_ELEMENT);
		createEReference(eAnnotationEClass, EANNOTATION__CONTENTS);
		createEReference(eAnnotationEClass, EANNOTATION__REFERENCES);

		eStringToStringMapEntryEClass = createEClass(ESTRING_TO_STRING_MAP_ENTRY);
		createEAttribute(eStringToStringMapEntryEClass, ESTRING_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(eStringToStringMapEntryEClass, ESTRING_TO_STRING_MAP_ENTRY__VALUE);

		eObjectEClass = createEClass(EOBJECT);

		eClassEClass = createEClass(ECLASS);
		createEAttribute(eClassEClass, ECLASS__ABSTRACT);
		createEAttribute(eClassEClass, ECLASS__INTERFACE);
		createEReference(eClassEClass, ECLASS__ESUPER_TYPES);
		createEReference(eClassEClass, ECLASS__EOPERATIONS);
		createEReference(eClassEClass, ECLASS__EALL_ATTRIBUTES);
		createEReference(eClassEClass, ECLASS__ESTRUCTURAL_FEATURES);
		createEReference(eClassEClass, ECLASS__EALL_REFERENCES);
		createEReference(eClassEClass, ECLASS__EREFERENCES);
		createEReference(eClassEClass, ECLASS__EATTRIBUTES);
		createEReference(eClassEClass, ECLASS__EALL_CONTAINMENTS);
		createEReference(eClassEClass, ECLASS__EALL_OPERATIONS);
		createEReference(eClassEClass, ECLASS__EALL_STRUCTURAL_FEATURES);
		createEReference(eClassEClass, ECLASS__EALL_SUPER_TYPES);
		createEReference(eClassEClass, ECLASS__EID_ATTRIBUTE);
		createEReference(eClassEClass, ECLASS__EGENERIC_SUPER_TYPES);
		createEReference(eClassEClass, ECLASS__EALL_GENERIC_SUPER_TYPES);

		eClassifierEClass = createEClass(ECLASSIFIER);
		createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_CLASS_NAME);
		createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_CLASS);
		createEAttribute(eClassifierEClass, ECLASSIFIER__DEFAULT_VALUE);
		createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_TYPE_NAME);
		createEReference(eClassifierEClass, ECLASSIFIER__EPACKAGE);
		createEReference(eClassifierEClass, ECLASSIFIER__ETYPE_PARAMETERS);

		eNamedElementEClass = createEClass(ENAMED_ELEMENT);
		createEAttribute(eNamedElementEClass, ENAMED_ELEMENT__NAME);

		ePackageEClass = createEClass(EPACKAGE);
		createEAttribute(ePackageEClass, EPACKAGE__NS_URI);
		createEAttribute(ePackageEClass, EPACKAGE__NS_PREFIX);
		createEReference(ePackageEClass, EPACKAGE__EFACTORY_INSTANCE);
		createEReference(ePackageEClass, EPACKAGE__ESUBPACKAGES);
		createEReference(ePackageEClass, EPACKAGE__ESUPER_PACKAGE);
		createEReference(ePackageEClass, EPACKAGE__ECLASSIFIERS);

		eFactoryEClass = createEClass(EFACTORY);
		createEReference(eFactoryEClass, EFACTORY__EPACKAGE);

		eDataTypeEClass = createEClass(EDATA_TYPE);
		createEAttribute(eDataTypeEClass, EDATA_TYPE__SERIALIZABLE);

		eTypeParameterEClass = createEClass(ETYPE_PARAMETER);
		createEReference(eTypeParameterEClass, ETYPE_PARAMETER__EBOUNDS);

		eGenericTypeEClass = createEClass(EGENERIC_TYPE);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__EUPPER_BOUND);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ETYPE_ARGUMENTS);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ERAW_TYPE);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ELOWER_BOUND);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ETYPE_PARAMETER);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ECLASSIFIER);

		eClassifier_WildcardEClass = createEClass(ECLASSIFIER_WILDCARD);

		eOperationEClass = createEClass(EOPERATION);
		createEReference(eOperationEClass, EOPERATION__ETYPE_PARAMETERS);
		createEReference(eOperationEClass, EOPERATION__EPARAMETERS);
		createEReference(eOperationEClass, EOPERATION__EEXCEPTIONS);
		createEReference(eOperationEClass, EOPERATION__EGENERIC_EXCEPTIONS);
		createEReference(eOperationEClass, EOPERATION__ECONTAINING_CLASS);

		eTypedElementEClass = createEClass(ETYPED_ELEMENT);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__ORDERED);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UNIQUE);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__LOWER_BOUND);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UPPER_BOUND);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__MANY);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__REQUIRED);
		createEReference(eTypedElementEClass, ETYPED_ELEMENT__ETYPE);
		createEReference(eTypedElementEClass, ETYPED_ELEMENT__EGENERIC_TYPE);

		eParameterEClass = createEClass(EPARAMETER);
		createEReference(eParameterEClass, EPARAMETER__EOPERATION);

		eAttributeEClass = createEClass(EATTRIBUTE);
		createEAttribute(eAttributeEClass, EATTRIBUTE__ID);
		createEReference(eAttributeEClass, EATTRIBUTE__EATTRIBUTE_TYPE);

		eStructuralFeatureEClass = createEClass(ESTRUCTURAL_FEATURE);
		createEReference(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__CHANGEABLE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__VOLATILE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__TRANSIENT);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DEFAULT_VALUE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__UNSETTABLE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DERIVED);

		eStructuralFeature_WildcardEClass = createEClass(ESTRUCTURAL_FEATURE_WILDCARD);

		eReferenceEClass = createEClass(EREFERENCE);
		createEAttribute(eReferenceEClass, EREFERENCE__CONTAINMENT);
		createEAttribute(eReferenceEClass, EREFERENCE__CONTAINER);
		createEAttribute(eReferenceEClass, EREFERENCE__RESOLVE_PROXIES);
		createEReference(eReferenceEClass, EREFERENCE__EOPPOSITE);
		createEReference(eReferenceEClass, EREFERENCE__EREFERENCE_TYPE);
		createEReference(eReferenceEClass, EREFERENCE__EKEYS);

		eEnumEClass = createEClass(EENUM);
		createEReference(eEnumEClass, EENUM__ELITERALS);

		eEnumLiteralEClass = createEClass(EENUM_LITERAL);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__VALUE);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__INSTANCE);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__LITERAL);
		createEReference(eEnumLiteralEClass, EENUM_LITERAL__EENUM);

		eModelElementEClass = createEClass(EMODEL_ELEMENT);
		createEReference(eModelElementEClass, EMODEL_ELEMENT__EANNOTATIONS);

		// Create data types
		eStringEDataType = createEDataType(ESTRING);
		eClassifier_EJavaClassWildcardEDataType = createEDataType(ECLASSIFIER_EJAVA_CLASS_WILDCARD);
		eJavaObjectEDataType = createEDataType(EJAVA_OBJECT);
		eBooleanEDataType = createEDataType(EBOOLEAN);
		eIntEDataType = createEDataType(EINT);
		eStructuralFeature_EJavaClassWildcardEDataType = createEDataType(ESTRUCTURAL_FEATURE_EJAVA_CLASS_WILDCARD);
		eResourceEDataType = createEDataType(ERESOURCE);
		eObject_EeListEObjectEDataType = createEDataType(EOBJECT_EE_LIST_EOBJECT);
		eObject_ETreeIteratorEObjectEDataType = createEDataType(EOBJECT_ETREE_ITERATOR_EOBJECT);
		eEnumeratorEDataType = createEDataType(EENUMERATOR);
		eBigDecimalEDataType = createEDataType(EBIG_DECIMAL);
		eBigIntegerEDataType = createEDataType(EBIG_INTEGER);
		eBooleanObjectEDataType = createEDataType(EBOOLEAN_OBJECT);
		eByteEDataType = createEDataType(EBYTE);
		eByteArrayEDataType = createEDataType(EBYTE_ARRAY);
		eByteObjectEDataType = createEDataType(EBYTE_OBJECT);
		eCharEDataType = createEDataType(ECHAR);
		eCharacterObjectEDataType = createEDataType(ECHARACTER_OBJECT);
		eDateEDataType = createEDataType(EDATE);
		eDiagnosticChainEDataType = createEDataType(EDIAGNOSTIC_CHAIN);
		eDoubleEDataType = createEDataType(EDOUBLE);
		eDoubleObjectEDataType = createEDataType(EDOUBLE_OBJECT);
		eeListEDataType = createEDataType(EE_LIST);
		eFeatureMapEDataType = createEDataType(EFEATURE_MAP);
		eFeatureMapEntryEDataType = createEDataType(EFEATURE_MAP_ENTRY);
		eFloatEDataType = createEDataType(EFLOAT);
		eFloatObjectEDataType = createEDataType(EFLOAT_OBJECT);
		eIntegerObjectEDataType = createEDataType(EINTEGER_OBJECT);
		eJavaClassEDataType = createEDataType(EJAVA_CLASS);
		eLongEDataType = createEDataType(ELONG);
		eLongObjectEDataType = createEDataType(ELONG_OBJECT);
		eMapEDataType = createEDataType(EMAP);
		eResourceSetEDataType = createEDataType(ERESOURCE_SET);
		eShortEDataType = createEDataType(ESHORT);
		eShortObjectEDataType = createEDataType(ESHORT_OBJECT);
		eTreeIteratorEDataType = createEDataType(ETREE_ITERATOR);
		eInvocationTargetExceptionEDataType = createEDataType(EINVOCATION_TARGET_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(eeListEDataType, "E");
		addETypeParameter(eJavaClassEDataType, "T");
		addETypeParameter(eMapEDataType, "K");
		addETypeParameter(eMapEDataType, "V");
		addETypeParameter(eTreeIteratorEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		eAnnotationEClass.getESuperTypes().add(this.getEModelElement());
		eClassEClass.getESuperTypes().add(this.getEClassifier());
		eClassifierEClass.getESuperTypes().add(this.getENamedElement());
		eNamedElementEClass.getESuperTypes().add(this.getEModelElement());
		ePackageEClass.getESuperTypes().add(this.getENamedElement());
		eFactoryEClass.getESuperTypes().add(this.getEModelElement());
		eDataTypeEClass.getESuperTypes().add(this.getEClassifier());
		eTypeParameterEClass.getESuperTypes().add(this.getENamedElement());
		eGenericTypeEClass.getESuperTypes().add(this.getEObject());
		eOperationEClass.getESuperTypes().add(this.getETypedElement());
		eTypedElementEClass.getESuperTypes().add(this.getENamedElement());
		eParameterEClass.getESuperTypes().add(this.getETypedElement());
		eAttributeEClass.getESuperTypes().add(this.getEStructuralFeature());
		eStructuralFeatureEClass.getESuperTypes().add(this.getETypedElement());
		eReferenceEClass.getESuperTypes().add(this.getEStructuralFeature());
		eEnumEClass.getESuperTypes().add(this.getEDataType());
		eEnumLiteralEClass.getESuperTypes().add(this.getENamedElement());
		eModelElementEClass.getESuperTypes().add(this.getEObject());

		// Initialize classes and features; add operations and parameters
		initEClass(eAnnotationEClass, EAnnotation.class, "EAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAnnotation_Source(), this.getEString(), "source", null, 0, 1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_Details(), this.getEStringToStringMapEntry(), null, "details", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_EModelElement(), this.getEModelElement(), this.getEModelElement_EAnnotations(), "eModelElement", null, 0, 1, EAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_Contents(), this.getEObject(), null, "contents", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_References(), this.getEObject(), null, "references", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToStringMapEntryEClass, Map.Entry.class, "EStringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToStringMapEntry_Key(), this.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStringToStringMapEntry_Value(), this.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectEClass, EObject.class, "EObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(eObjectEClass, this.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eObjectEClass, this.getEBoolean(), "eIsProxy", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eObjectEClass, this.getEResource(), "eResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eObjectEClass, this.getEObject(), "eContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eObjectEClass, this.getEStructuralFeature(), "eContainingFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eObjectEClass, this.getEReference(), "eContainmentFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eObjectEClass, this.getEObject_EeListEObject(), "eContents", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eObjectEClass, this.getEObject_ETreeIteratorEObject(), "eAllContents", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eObjectEClass, this.getEObject_EeListEObject(), "eCrossReferences", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(eObjectEClass, this.getEJavaObject(), "eGet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eObjectEClass, this.getEJavaObject(), "eGet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEBoolean(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eObjectEClass, null, "eSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEJavaObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eObjectEClass, this.getEBoolean(), "eIsSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eObjectEClass, null, "eUnset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eClassEClass, ecore.EClass.class, "EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClass_Abstract(), this.getEBoolean(), "abstract", null, 0, 1, ecore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClass_Interface(), this.getEBoolean(), "interface", null, 0, 1, ecore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_ESuperTypes(), this.getEClass(), null, "eSuperTypes", null, 0, -1, ecore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EOperations(), this.getEOperation(), this.getEOperation_EContainingClass(), "eOperations", null, 0, -1, ecore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllAttributes(), this.getEAttribute(), null, "eAllAttributes", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EStructuralFeatures(), this.getEStructuralFeature(), this.getEStructuralFeature_EContainingClass(), "eStructuralFeatures", null, 0, -1, ecore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllReferences(), this.getEReference(), null, "eAllReferences", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EReferences(), this.getEReference(), null, "eReferences", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAttributes(), this.getEAttribute(), null, "eAttributes", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllContainments(), this.getEReference(), null, "eAllContainments", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllOperations(), this.getEOperation(), null, "eAllOperations", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllStructuralFeatures(), this.getEStructuralFeature(), null, "eAllStructuralFeatures", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllSuperTypes(), this.getEClass(), null, "eAllSuperTypes", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EidAttribute(), this.getEAttribute(), null, "eidAttribute", null, 0, 1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EGenericSuperTypes(), this.getEGenericType(), null, "eGenericSuperTypes", null, 0, -1, ecore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllGenericSuperTypes(), this.getEGenericType(), null, "eAllGenericSuperTypes", null, 0, -1, ecore.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = addEOperation(eClassEClass, this.getEBoolean(), "isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClass(), "someClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEInt(), "getFeatureCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eClassEClass, this.getEStructuralFeature(), "getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEInt(), "featureId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eClassEClass, this.getEInt(), "getFeatureId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eClassEClass, this.getEStructuralFeature(), "getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "featureName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eClassifierEClass, EClassifier.class, "EClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClassifier_InstanceClassName(), this.getEString(), "instanceClassName", null, 0, 1, EClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassifier_InstanceClass(), this.getEClassifier_EJavaClassWildcard(), "instanceClass", null, 0, 1, EClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassifier_DefaultValue(), this.getEJavaObject(), "defaultValue", null, 0, 1, EClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassifier_InstanceTypeName(), this.getEString(), "instanceTypeName", null, 0, 1, EClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassifier_EPackage(), this.getEPackage(), this.getEPackage_EClassifiers(), "ePackage", null, 0, 1, EClassifier.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassifier_ETypeParameters(), this.getETypeParameter(), null, "eTypeParameters", null, 0, -1, EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eClassifierEClass, this.getEBoolean(), "isInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassifierEClass, this.getEInt(), "getClassifierId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eNamedElementEClass, ENamedElement.class, "ENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENamedElement_Name(), this.getEString(), "name", null, 0, 1, ENamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePackageEClass, ecore.EPackage.class, "EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPackage_NsUri(), this.getEString(), "nsUri", null, 0, 1, ecore.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPackage_NsPrefix(), this.getEString(), "nsPrefix", null, 0, 1, ecore.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_EFactoryInstance(), this.getEFactory(), this.getEFactory_EPackage(), "eFactoryInstance", null, 1, 1, ecore.EPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_ESubpackages(), this.getEPackage(), this.getEPackage_ESuperPackage(), "eSubpackages", null, 0, -1, ecore.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_ESuperPackage(), this.getEPackage(), this.getEPackage_ESubpackages(), "eSuperPackage", null, 0, 1, ecore.EPackage.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_EClassifiers(), this.getEClassifier(), this.getEClassifier_EPackage(), "eClassifiers", null, 0, -1, ecore.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ePackageEClass, this.getEClassifier(), "getEClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eFactoryEClass, EFactory.class, "EFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFactory_EPackage(), this.getEPackage(), this.getEPackage_EFactoryInstance(), "ePackage", null, 1, 1, EFactory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eFactoryEClass, this.getEObject(), "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eFactoryEClass, this.getEJavaObject(), "createFromString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEDataType(), "eDataType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "literalValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eFactoryEClass, this.getEString(), "convertToString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEDataType(), "eDataType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEJavaObject(), "instanceValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eDataTypeEClass, ecore.EDataType.class, "EDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDataType_Serializable(), this.getEBoolean(), "serializable", null, 0, 1, ecore.EDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTypeParameterEClass, ETypeParameter.class, "ETypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETypeParameter_EBounds(), this.getEGenericType(), null, "eBounds", null, 0, -1, ETypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eGenericTypeEClass, EGenericType.class, "EGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEGenericType_EUpperBound(), this.getEGenericType(), null, "eUpperBound", null, 0, 1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ETypeArguments(), this.getEGenericType(), null, "eTypeArguments", null, 0, -1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ERawType(), this.getEClassifier(), null, "eRawType", null, 1, 1, EGenericType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ELowerBound(), this.getEGenericType(), null, "eLowerBound", null, 0, 1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ETypeParameter(), this.getETypeParameter(), null, "eTypeParameter", null, 0, 1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_EClassifier(), this.getEClassifier(), null, "eClassifier", null, 0, 1, EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassifier_WildcardEClass, EClassifier_Wildcard.class, "EClassifier_Wildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eOperationEClass, ecore.EOperation.class, "EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEOperation_ETypeParameters(), this.getETypeParameter(), null, "eTypeParameters", null, 0, -1, ecore.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EParameters(), this.getEParameter(), this.getEParameter_EOperation(), "eParameters", null, 0, -1, ecore.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EExceptions(), this.getEClassifier(), null, "eExceptions", null, 0, -1, ecore.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EGenericExceptions(), this.getEGenericType(), null, "eGenericExceptions", null, 0, -1, ecore.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EContainingClass(), this.getEClass(), this.getEClass_EOperations(), "eContainingClass", null, 0, 1, ecore.EOperation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTypedElementEClass, ETypedElement.class, "ETypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETypedElement_Ordered(), this.getEBoolean(), "ordered", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_Unique(), this.getEBoolean(), "unique", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_LowerBound(), this.getEInt(), "lowerBound", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_UpperBound(), this.getEInt(), "upperBound", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_Many(), this.getEBoolean(), "many", null, 0, 1, ETypedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_Required(), this.getEBoolean(), "required", null, 0, 1, ETypedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getETypedElement_EType(), this.getEClassifier(), null, "eType", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETypedElement_EGenericType(), this.getEGenericType(), null, "eGenericType", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eParameterEClass, EParameter.class, "EParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEParameter_EOperation(), this.getEOperation(), this.getEOperation_EParameters(), "eOperation", null, 0, 1, EParameter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAttributeEClass, ecore.EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAttribute_ID(), this.getEBoolean(), "iD", null, 0, 1, ecore.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_EAttributeType(), this.getEDataType(), null, "eAttributeType", null, 1, 1, ecore.EAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureEClass, EStructuralFeature.class, "EStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuralFeature_EContainingClass(), this.getEClass(), this.getEClass_EStructuralFeatures(), "eContainingClass", null, 0, 1, EStructuralFeature.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Changeable(), this.getEBoolean(), "changeable", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Volatile(), this.getEBoolean(), "volatile", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Transient(), this.getEBoolean(), "transient", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_DefaultValueLiteral(), this.getEString(), "defaultValueLiteral", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_DefaultValue(), this.getEJavaObject(), "defaultValue", null, 0, 1, EStructuralFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Unsettable(), this.getEBoolean(), "unsettable", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Derived(), this.getEBoolean(), "derived", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eStructuralFeatureEClass, this.getEInt(), "getFeatureId", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eStructuralFeatureEClass, this.getEStructuralFeature_EJavaClassWildcard(), "getContainerClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eStructuralFeature_WildcardEClass, EStructuralFeature_Wildcard.class, "EStructuralFeature_Wildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eReferenceEClass, ecore.EReference.class, "EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReference_Containment(), this.getEBoolean(), "containment", null, 0, 1, ecore.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReference_Container(), this.getEBoolean(), "container", null, 0, 1, ecore.EReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReference_ResolveProxies(), this.getEBoolean(), "resolveProxies", null, 0, 1, ecore.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReference_EOpposite(), this.getEReference(), null, "eOpposite", null, 0, 1, ecore.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReference_EReferenceType(), this.getEClass(), null, "eReferenceType", null, 1, 1, ecore.EReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEReference_EKeys(), this.getEAttribute(), null, "eKeys", null, 0, -1, ecore.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumEClass, EEnum.class, "EEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnum_ELiterals(), this.getEEnumLiteral(), this.getEEnumLiteral_EEnum(), "eLiterals", null, 0, -1, EEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eEnumEClass, this.getEEnumLiteral(), "getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eEnumEClass, this.getEEnumLiteral(), "getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eEnumEClass, this.getEEnumLiteral(), "getEEnumLiteralByLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "literal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eEnumLiteralEClass, EEnumLiteral.class, "EEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEnumLiteral_Value(), this.getEInt(), "value", null, 0, 1, EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEnumLiteral_Instance(), this.getEEnumerator(), "instance", null, 0, 1, EEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEnumLiteral_Literal(), this.getEString(), "literal", null, 0, 1, EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEnumLiteral_EEnum(), this.getEEnum(), this.getEEnum_ELiterals(), "eEnum", null, 0, 1, EEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eModelElementEClass, EModelElement.class, "EModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEModelElement_EAnnotations(), this.getEAnnotation(), this.getEAnnotation_EModelElement(), "eAnnotations", null, 0, -1, EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eModelElementEClass, this.getEAnnotation(), "getEAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(eStringEDataType, String.class, "EString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eClassifier_EJavaClassWildcardEDataType, EClassifier_EJavaClassWildcard.class, "EClassifier_EJavaClassWildcard", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eJavaObjectEDataType, Object.class, "EJavaObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBooleanEDataType, boolean.class, "EBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eIntEDataType, int.class, "EInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStructuralFeature_EJavaClassWildcardEDataType, EStructuralFeature_EJavaClassWildcard.class, "EStructuralFeature_EJavaClassWildcard", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eResourceEDataType, Resource.class, "EResource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eObject_EeListEObjectEDataType, EObject_EeListEObject.class, "EObject_EeListEObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eObject_ETreeIteratorEObjectEDataType, EObject_ETreeIteratorEObject.class, "EObject_ETreeIteratorEObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eEnumeratorEDataType, Enumerator.class, "EEnumerator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBigDecimalEDataType, BigDecimal.class, "EBigDecimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBigIntegerEDataType, BigInteger.class, "EBigInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBooleanObjectEDataType, Boolean.class, "EBooleanObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteEDataType, byte.class, "EByte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteArrayEDataType, byte[].class, "EByteArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteObjectEDataType, Byte.class, "EByteObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eCharEDataType, char.class, "EChar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eCharacterObjectEDataType, Character.class, "ECharacterObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDateEDataType, Date.class, "EDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDiagnosticChainEDataType, DiagnosticChain.class, "EDiagnosticChain", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDoubleEDataType, double.class, "EDouble", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDoubleObjectEDataType, Double.class, "EDoubleObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eeListEDataType, EList.class, "EeList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFeatureMapEDataType, FeatureMap.class, "EFeatureMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFeatureMapEntryEDataType, FeatureMap.Entry.class, "EFeatureMapEntry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFloatEDataType, float.class, "EFloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFloatObjectEDataType, Float.class, "EFloatObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eIntegerObjectEDataType, Integer.class, "EIntegerObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eJavaClassEDataType, Class.class, "EJavaClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eLongEDataType, long.class, "ELong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eLongObjectEDataType, Long.class, "ELongObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eMapEDataType, Map.class, "EMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eResourceSetEDataType, ResourceSet.class, "EResourceSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eShortEDataType, short.class, "EShort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eShortObjectEDataType, Short.class, "EShortObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eTreeIteratorEDataType, TreeIterator.class, "ETreeIterator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eInvocationTargetExceptionEDataType, InvocationTargetException.class, "EInvocationTargetException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (eAnnotationEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedSourceURI"
		   });			
		addAnnotation
		  (eClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "InterfaceIsAbstract AtMostOneID UniqueFeatureNames UniqueOperationSignatures NoCircularSuperTypes WellFormedMapEntryClass ConsistentSuperTypes"
		   });				
		addAnnotation
		  (eClassifierEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedInstanceTypeName UniqueTypeParameterNames"
		   });				
		addAnnotation
		  (eNamedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedName"
		   });		
		addAnnotation
		  (ePackageEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedNsURI WellFormedNsPrefix UniqueSubpackageNames UniqueClassifierNames UniqueNsURIs"
		   });			
		addAnnotation
		  (eGenericTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentType ConsistentBounds ConsistentArguments"
		   });			
		addAnnotation
		  (eOperationEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueParameterNames UniqueTypeParameterNames NoRepeatingVoid"
		   });				
		addAnnotation
		  (eTypedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidLowerBound ValidUpperBound ConsistentBounds ValidType"
		   });				
		addAnnotation
		  (eAttributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentTransient"
		   });		
		addAnnotation
		  (eReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentOpposite SingleContainer ConsistentKeys"
		   });		
		addAnnotation
		  (eEnumEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueEnumeratorNames UniqueEnumeratorLiterals"
		   });																
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (eStringEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#string"
		   });										
		addAnnotation
		  (eBooleanEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#boolean"
		   });			
		addAnnotation
		  (eIntEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#int"
		   });											
		addAnnotation
		  (eBigDecimalEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#decimal"
		   });		
		addAnnotation
		  (eBigIntegerEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#integer"
		   });		
		addAnnotation
		  (eBooleanObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EBoolean",
			 "name", "EBoolean:Object"
		   });		
		addAnnotation
		  (eByteEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#byte"
		   });		
		addAnnotation
		  (eByteArrayEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#hexBinary"
		   });		
		addAnnotation
		  (eByteObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EByte",
			 "name", "EByte:Object"
		   });		
		addAnnotation
		  (eCharacterObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EChar",
			 "name", "EChar:Object"
		   });		
		addAnnotation
		  (eDoubleEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#double"
		   });		
		addAnnotation
		  (eDoubleObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EDouble",
			 "name", "EDouble:Object"
		   });		
		addAnnotation
		  (eFloatEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });		
		addAnnotation
		  (eFloatObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EFloat",
			 "name", "EFloat:Object"
		   });		
		addAnnotation
		  (eIntegerObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EInt",
			 "name", "EInt:Object"
		   });		
		addAnnotation
		  (eLongEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#long"
		   });		
		addAnnotation
		  (eLongObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "ELong",
			 "name", "ELong:Object"
		   });		
		addAnnotation
		  (eShortEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#short"
		   });		
		addAnnotation
		  (eShortObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EShort",
			 "name", "EShort:Object"
		   });
	}

} //EcorePackageImpl