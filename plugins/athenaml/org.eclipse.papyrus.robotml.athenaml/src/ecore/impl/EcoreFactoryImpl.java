/**
 */
package ecore.impl;

import ecore.*;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreFactoryImpl extends EFactoryImpl implements EcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreFactory init() {
		try {
			EcoreFactory theEcoreFactory = (EcoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/2002/Ecore"); 
			if (theEcoreFactory != null) {
				return theEcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcorePackage.EANNOTATION: return createEAnnotation();
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createEStringToStringMapEntry();
			case EcorePackage.EOBJECT: return createEObject();
			case EcorePackage.ECLASS: return createEClass();
			case EcorePackage.EPACKAGE: return createEPackage();
			case EcorePackage.EFACTORY: return createEFactory();
			case EcorePackage.EDATA_TYPE: return createEDataType();
			case EcorePackage.ETYPE_PARAMETER: return createETypeParameter();
			case EcorePackage.EGENERIC_TYPE: return createEGenericType();
			case EcorePackage.ECLASSIFIER_WILDCARD: return createEClassifier_Wildcard();
			case EcorePackage.EOPERATION: return createEOperation();
			case EcorePackage.EPARAMETER: return createEParameter();
			case EcorePackage.EATTRIBUTE: return createEAttribute();
			case EcorePackage.ESTRUCTURAL_FEATURE_WILDCARD: return createEStructuralFeature_Wildcard();
			case EcorePackage.EREFERENCE: return createEReference();
			case EcorePackage.EENUM: return createEEnum();
			case EcorePackage.EENUM_LITERAL: return createEEnumLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EcorePackage.ESTRING:
				return createEStringFromString(eDataType, initialValue);
			case EcorePackage.ECLASSIFIER_EJAVA_CLASS_WILDCARD:
				return createEClassifier_EJavaClassWildcardFromString(eDataType, initialValue);
			case EcorePackage.EJAVA_OBJECT:
				return createEJavaObjectFromString(eDataType, initialValue);
			case EcorePackage.EBOOLEAN:
				return createEBooleanFromString(eDataType, initialValue);
			case EcorePackage.EINT:
				return createEIntFromString(eDataType, initialValue);
			case EcorePackage.ESTRUCTURAL_FEATURE_EJAVA_CLASS_WILDCARD:
				return createEStructuralFeature_EJavaClassWildcardFromString(eDataType, initialValue);
			case EcorePackage.ERESOURCE:
				return createEResourceFromString(eDataType, initialValue);
			case EcorePackage.EOBJECT_EE_LIST_EOBJECT:
				return createEObject_EeListEObjectFromString(eDataType, initialValue);
			case EcorePackage.EOBJECT_ETREE_ITERATOR_EOBJECT:
				return createEObject_ETreeIteratorEObjectFromString(eDataType, initialValue);
			case EcorePackage.EENUMERATOR:
				return createEEnumeratorFromString(eDataType, initialValue);
			case EcorePackage.EBIG_DECIMAL:
				return createEBigDecimalFromString(eDataType, initialValue);
			case EcorePackage.EBIG_INTEGER:
				return createEBigIntegerFromString(eDataType, initialValue);
			case EcorePackage.EBOOLEAN_OBJECT:
				return createEBooleanObjectFromString(eDataType, initialValue);
			case EcorePackage.EBYTE:
				return createEByteFromString(eDataType, initialValue);
			case EcorePackage.EBYTE_ARRAY:
				return createEByteArrayFromString(eDataType, initialValue);
			case EcorePackage.EBYTE_OBJECT:
				return createEByteObjectFromString(eDataType, initialValue);
			case EcorePackage.ECHAR:
				return createECharFromString(eDataType, initialValue);
			case EcorePackage.ECHARACTER_OBJECT:
				return createECharacterObjectFromString(eDataType, initialValue);
			case EcorePackage.EDATE:
				return createEDateFromString(eDataType, initialValue);
			case EcorePackage.EDIAGNOSTIC_CHAIN:
				return createEDiagnosticChainFromString(eDataType, initialValue);
			case EcorePackage.EDOUBLE:
				return createEDoubleFromString(eDataType, initialValue);
			case EcorePackage.EDOUBLE_OBJECT:
				return createEDoubleObjectFromString(eDataType, initialValue);
			case EcorePackage.EE_LIST:
				return createEeListFromString(eDataType, initialValue);
			case EcorePackage.EFEATURE_MAP:
				return createEFeatureMapFromString(eDataType, initialValue);
			case EcorePackage.EFEATURE_MAP_ENTRY:
				return createEFeatureMapEntryFromString(eDataType, initialValue);
			case EcorePackage.EFLOAT:
				return createEFloatFromString(eDataType, initialValue);
			case EcorePackage.EFLOAT_OBJECT:
				return createEFloatObjectFromString(eDataType, initialValue);
			case EcorePackage.EINTEGER_OBJECT:
				return createEIntegerObjectFromString(eDataType, initialValue);
			case EcorePackage.EJAVA_CLASS:
				return createEJavaClassFromString(eDataType, initialValue);
			case EcorePackage.ELONG:
				return createELongFromString(eDataType, initialValue);
			case EcorePackage.ELONG_OBJECT:
				return createELongObjectFromString(eDataType, initialValue);
			case EcorePackage.EMAP:
				return createEMapFromString(eDataType, initialValue);
			case EcorePackage.ERESOURCE_SET:
				return createEResourceSetFromString(eDataType, initialValue);
			case EcorePackage.ESHORT:
				return createEShortFromString(eDataType, initialValue);
			case EcorePackage.ESHORT_OBJECT:
				return createEShortObjectFromString(eDataType, initialValue);
			case EcorePackage.ETREE_ITERATOR:
				return createETreeIteratorFromString(eDataType, initialValue);
			case EcorePackage.EINVOCATION_TARGET_EXCEPTION:
				return createEInvocationTargetExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EcorePackage.ESTRING:
				return convertEStringToString(eDataType, instanceValue);
			case EcorePackage.ECLASSIFIER_EJAVA_CLASS_WILDCARD:
				return convertEClassifier_EJavaClassWildcardToString(eDataType, instanceValue);
			case EcorePackage.EJAVA_OBJECT:
				return convertEJavaObjectToString(eDataType, instanceValue);
			case EcorePackage.EBOOLEAN:
				return convertEBooleanToString(eDataType, instanceValue);
			case EcorePackage.EINT:
				return convertEIntToString(eDataType, instanceValue);
			case EcorePackage.ESTRUCTURAL_FEATURE_EJAVA_CLASS_WILDCARD:
				return convertEStructuralFeature_EJavaClassWildcardToString(eDataType, instanceValue);
			case EcorePackage.ERESOURCE:
				return convertEResourceToString(eDataType, instanceValue);
			case EcorePackage.EOBJECT_EE_LIST_EOBJECT:
				return convertEObject_EeListEObjectToString(eDataType, instanceValue);
			case EcorePackage.EOBJECT_ETREE_ITERATOR_EOBJECT:
				return convertEObject_ETreeIteratorEObjectToString(eDataType, instanceValue);
			case EcorePackage.EENUMERATOR:
				return convertEEnumeratorToString(eDataType, instanceValue);
			case EcorePackage.EBIG_DECIMAL:
				return convertEBigDecimalToString(eDataType, instanceValue);
			case EcorePackage.EBIG_INTEGER:
				return convertEBigIntegerToString(eDataType, instanceValue);
			case EcorePackage.EBOOLEAN_OBJECT:
				return convertEBooleanObjectToString(eDataType, instanceValue);
			case EcorePackage.EBYTE:
				return convertEByteToString(eDataType, instanceValue);
			case EcorePackage.EBYTE_ARRAY:
				return convertEByteArrayToString(eDataType, instanceValue);
			case EcorePackage.EBYTE_OBJECT:
				return convertEByteObjectToString(eDataType, instanceValue);
			case EcorePackage.ECHAR:
				return convertECharToString(eDataType, instanceValue);
			case EcorePackage.ECHARACTER_OBJECT:
				return convertECharacterObjectToString(eDataType, instanceValue);
			case EcorePackage.EDATE:
				return convertEDateToString(eDataType, instanceValue);
			case EcorePackage.EDIAGNOSTIC_CHAIN:
				return convertEDiagnosticChainToString(eDataType, instanceValue);
			case EcorePackage.EDOUBLE:
				return convertEDoubleToString(eDataType, instanceValue);
			case EcorePackage.EDOUBLE_OBJECT:
				return convertEDoubleObjectToString(eDataType, instanceValue);
			case EcorePackage.EE_LIST:
				return convertEeListToString(eDataType, instanceValue);
			case EcorePackage.EFEATURE_MAP:
				return convertEFeatureMapToString(eDataType, instanceValue);
			case EcorePackage.EFEATURE_MAP_ENTRY:
				return convertEFeatureMapEntryToString(eDataType, instanceValue);
			case EcorePackage.EFLOAT:
				return convertEFloatToString(eDataType, instanceValue);
			case EcorePackage.EFLOAT_OBJECT:
				return convertEFloatObjectToString(eDataType, instanceValue);
			case EcorePackage.EINTEGER_OBJECT:
				return convertEIntegerObjectToString(eDataType, instanceValue);
			case EcorePackage.EJAVA_CLASS:
				return convertEJavaClassToString(eDataType, instanceValue);
			case EcorePackage.ELONG:
				return convertELongToString(eDataType, instanceValue);
			case EcorePackage.ELONG_OBJECT:
				return convertELongObjectToString(eDataType, instanceValue);
			case EcorePackage.EMAP:
				return convertEMapToString(eDataType, instanceValue);
			case EcorePackage.ERESOURCE_SET:
				return convertEResourceSetToString(eDataType, instanceValue);
			case EcorePackage.ESHORT:
				return convertEShortToString(eDataType, instanceValue);
			case EcorePackage.ESHORT_OBJECT:
				return convertEShortObjectToString(eDataType, instanceValue);
			case EcorePackage.ETREE_ITERATOR:
				return convertETreeIteratorToString(eDataType, instanceValue);
			case EcorePackage.EINVOCATION_TARGET_EXCEPTION:
				return convertEInvocationTargetExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEAnnotation() {
		EAnnotationImpl eAnnotation = new EAnnotationImpl();
		return eAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createEStringToStringMapEntry() {
		EStringToStringMapEntryImpl eStringToStringMapEntry = new EStringToStringMapEntryImpl();
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EObject createEObject() {
		EObjectImpl eObject = new EObjectImpl();
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EClass createEClass() {
		EClassImpl eClass = new EClassImpl();
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EPackage createEPackage() {
		EPackageImpl ePackage = new EPackageImpl();
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory createEFactory() {
		ecore.impl.EFactoryImpl eFactory = new ecore.impl.EFactoryImpl();
		return eFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ecore.EDataType createEDataType() {
		EDataTypeImpl eDataType = new EDataTypeImpl();
		return eDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter createETypeParameter() {
		ETypeParameterImpl eTypeParameter = new ETypeParameterImpl();
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType createEGenericType() {
		EGenericTypeImpl eGenericType = new EGenericTypeImpl();
		return eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier_Wildcard createEClassifier_Wildcard() {
		EClassifier_WildcardImpl eClassifier_Wildcard = new EClassifier_WildcardImpl();
		return eClassifier_Wildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation createEOperation() {
		EOperationImpl eOperation = new EOperationImpl();
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter createEParameter() {
		EParameterImpl eParameter = new EParameterImpl();
		return eParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature_Wildcard createEStructuralFeature_Wildcard() {
		EStructuralFeature_WildcardImpl eStructuralFeature_Wildcard = new EStructuralFeature_WildcardImpl();
		return eStructuralFeature_Wildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference createEReference() {
		EReferenceImpl eReference = new EReferenceImpl();
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum createEEnum() {
		EEnumImpl eEnum = new EEnumImpl();
		return eEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral createEEnumLiteral() {
		EEnumLiteralImpl eEnumLiteral = new EEnumLiteralImpl();
		return eEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEClassifier_EJavaClassWildcardFromString(EDataType eDataType, String initialValue) {
		return (EClassifier_EJavaClassWildcard)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEClassifier_EJavaClassWildcardToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEJavaObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEStructuralFeature_EJavaClassWildcardFromString(EDataType eDataType, String initialValue) {
		return (EStructuralFeature_EJavaClassWildcard)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStructuralFeature_EJavaClassWildcardToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createEResourceFromString(EDataType eDataType, String initialValue) {
		return (Resource)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEResourceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEObject_EeListEObjectFromString(EDataType eDataType, String initialValue) {
		return (EObject_EeListEObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEObject_EeListEObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEObject_ETreeIteratorEObjectFromString(EDataType eDataType, String initialValue) {
		return (EObject_ETreeIteratorEObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEObject_ETreeIteratorEObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createEEnumeratorFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnumeratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEBigDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createEBigIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createEBooleanFromString(EcorePackage.Literals.EBOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEBooleanToString(EcorePackage.Literals.EBOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteFromString(EDataType eDataType, String initialValue) {
		return (Byte)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createEByteArrayFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteArrayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteObjectFromString(EDataType eDataType, String initialValue) {
		return createEByteFromString(EcorePackage.Literals.EBYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEByteToString(EcorePackage.Literals.EBYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharFromString(EDataType eDataType, String initialValue) {
		return (Character)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharacterObjectFromString(EDataType eDataType, String initialValue) {
		return createECharFromString(EcorePackage.Literals.ECHAR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharacterObjectToString(EDataType eDataType, Object instanceValue) {
		return convertECharToString(EcorePackage.Literals.ECHAR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createEDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticChain createEDiagnosticChainFromString(EDataType eDataType, String initialValue) {
		return (DiagnosticChain)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDiagnosticChainToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleObjectFromString(EDataType eDataType, String initialValue) {
		return createEDoubleFromString(EcorePackage.Literals.EDOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEDoubleToString(EcorePackage.Literals.EDOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> createEeListFromString(EDataType eDataType, String initialValue) {
		return (EList<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEeListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap createEFeatureMapFromString(EDataType eDataType, String initialValue) {
		return (FeatureMap)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFeatureMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap.Entry createEFeatureMapEntryFromString(EDataType eDataType, String initialValue) {
		return (FeatureMap.Entry)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFeatureMapEntryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createEFloatFromString(EcorePackage.Literals.EFLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEFloatToString(EcorePackage.Literals.EFLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return createEIntFromString(EcorePackage.Literals.EINT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEIntToString(EcorePackage.Literals.EINT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> createEJavaClassFromString(EDataType eDataType, String initialValue) {
		return (Class<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongObjectFromString(EDataType eDataType, String initialValue) {
		return createELongFromString(EcorePackage.Literals.ELONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongObjectToString(EDataType eDataType, Object instanceValue) {
		return convertELongToString(EcorePackage.Literals.ELONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createEMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet createEResourceSetFromString(EDataType eDataType, String initialValue) {
		return (ResourceSet)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEResourceSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.SHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.SHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortObjectFromString(EDataType eDataType, String initialValue) {
		return createEShortFromString(EcorePackage.Literals.ESHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEShortToString(EcorePackage.Literals.ESHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeIterator<?> createETreeIteratorFromString(EDataType eDataType, String initialValue) {
		return (TreeIterator<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETreeIteratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationTargetException createEInvocationTargetExceptionFromString(EDataType eDataType, String initialValue) {
		return (InvocationTargetException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInvocationTargetExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcorePackage getEcorePackage() {
		return (EcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcorePackage getPackage() {
		return EcorePackage.eINSTANCE;
	}

} //EcoreFactoryImpl
