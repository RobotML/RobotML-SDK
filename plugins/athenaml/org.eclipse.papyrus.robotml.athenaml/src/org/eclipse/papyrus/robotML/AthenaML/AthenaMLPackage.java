/**
 */
package org.eclipse.papyrus.robotML.AthenaML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.robotML.AthenaML.AthenaMLFactory
 * @model kind="package"
 * @generated
 */
public interface AthenaMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AthenaML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://papyrus/AthenaML/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AthenaML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AthenaMLPackage eINSTANCE = org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.ArrayImpl
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DIMENSION = 1;

	/**
	 * The feature id for the '<em><b>Type template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TYPE_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__BASE_DATA_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.VectorImpl
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Type template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__TYPE_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__BASE_DATA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.MapImpl
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 2;

	/**
	 * The feature id for the '<em><b>Values type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__VALUES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__BASE_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Keys type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__KEYS_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AliasImpl
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getAlias()
	 * @generated
	 */
	int ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__BASE_DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.UnionImpl
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__BASE_DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.ParametersImpl
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.DefineImpl <em>Define</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.DefineImpl
	 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getDefine()
	 * @generated
	 */
	int DEFINE = 6;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE__BASE_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Define</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.robotML.AthenaML.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.robotML.AthenaML.Array#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Array#getSize()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.robotML.AthenaML.Array#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Array#getDimension()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Dimension();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Array#getType_template <em>Type template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type template</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Array#getType_template()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Type_template();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Array#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Array#getBase_DataType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.robotML.AthenaML.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.robotML.AthenaML.Vector#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Vector#getSize()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_Size();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Vector#getType_template <em>Type template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type template</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Vector#getType_template()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_Type_template();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Vector#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Vector#getBase_DataType()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.robotML.AthenaML.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Map#getValues_type <em>Values type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Values type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Map#getValues_type()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Values_type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Map#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Map#getBase_DataType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Base_DataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Map#getKeys_type <em>Keys type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Keys type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Map#getKeys_type()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Keys_type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.robotML.AthenaML.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Alias#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Alias#getType()
	 * @see #getAlias()
	 * @generated
	 */
	EReference getAlias_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Alias#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Alias#getBase_DataType()
	 * @see #getAlias()
	 * @generated
	 */
	EReference getAlias_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.robotML.AthenaML.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.robotML.AthenaML.Union#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Union#getTypes()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Types();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Union#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Union#getBase_DataType()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.robotML.AthenaML.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Parameters#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Parameters#getBase_Class()
	 * @see #getParameters()
	 * @generated
	 */
	EReference getParameters_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.robotML.AthenaML.Define <em>Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Define
	 * @generated
	 */
	EClass getDefine();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Define#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Define#getBase_DataType()
	 * @see #getDefine()
	 * @generated
	 */
	EReference getDefine_Base_DataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.robotML.AthenaML.Define#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.papyrus.robotML.AthenaML.Define#getType()
	 * @see #getDefine()
	 * @generated
	 */
	EReference getDefine_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AthenaMLFactory getAthenaMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.ArrayImpl
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__SIZE = eINSTANCE.getArray_Size();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__DIMENSION = eINSTANCE.getArray_Dimension();

		/**
		 * The meta object literal for the '<em><b>Type template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__TYPE_TEMPLATE = eINSTANCE.getArray_Type_template();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__BASE_DATA_TYPE = eINSTANCE.getArray_Base_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.VectorImpl
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getVector()
		 * @generated
		 */
		EClass VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__SIZE = eINSTANCE.getVector_Size();

		/**
		 * The meta object literal for the '<em><b>Type template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__TYPE_TEMPLATE = eINSTANCE.getVector_Type_template();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__BASE_DATA_TYPE = eINSTANCE.getVector_Base_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.MapImpl
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Values type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__VALUES_TYPE = eINSTANCE.getMap_Values_type();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__BASE_DATA_TYPE = eINSTANCE.getMap_Base_DataType();

		/**
		 * The meta object literal for the '<em><b>Keys type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__KEYS_TYPE = eINSTANCE.getMap_Keys_type();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AliasImpl
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getAlias()
		 * @generated
		 */
		EClass ALIAS = eINSTANCE.getAlias();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS__TYPE = eINSTANCE.getAlias_Type();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS__BASE_DATA_TYPE = eINSTANCE.getAlias_Base_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.UnionImpl
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__TYPES = eINSTANCE.getUnion_Types();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__BASE_DATA_TYPE = eINSTANCE.getUnion_Base_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.ParametersImpl
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS__BASE_CLASS = eINSTANCE.getParameters_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.robotML.AthenaML.impl.DefineImpl <em>Define</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.DefineImpl
		 * @see org.eclipse.papyrus.robotML.AthenaML.impl.AthenaMLPackageImpl#getDefine()
		 * @generated
		 */
		EClass DEFINE = eINSTANCE.getDefine();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE__BASE_DATA_TYPE = eINSTANCE.getDefine_Base_DataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE__TYPE = eINSTANCE.getDefine_Type();

	}

} //AthenaMLPackage
