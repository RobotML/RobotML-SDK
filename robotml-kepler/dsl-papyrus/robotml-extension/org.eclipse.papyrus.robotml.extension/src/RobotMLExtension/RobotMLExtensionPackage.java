/**
 */
package RobotMLExtension;

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
 * @see RobotMLExtension.RobotMLExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface RobotMLExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RobotMLExtension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://papyrus/RobotML/Extension/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RobotMLExyension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotMLExtensionPackage eINSTANCE = RobotMLExtension.impl.RobotMLExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link RobotMLExtension.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RobotMLExtension.impl.ArrayImpl
	 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getArray()
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
	 * The feature id for the '<em><b>Type Template</b></em>' reference.
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
	 * The meta object id for the '{@link RobotMLExtension.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RobotMLExtension.impl.VectorImpl
	 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getVector()
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
	 * The feature id for the '<em><b>Type Template</b></em>' reference.
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
	 * The meta object id for the '{@link RobotMLExtension.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RobotMLExtension.impl.MapImpl
	 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 2;

	/**
	 * The feature id for the '<em><b>Values Type</b></em>' reference.
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
	 * The feature id for the '<em><b>Keys Type</b></em>' reference.
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
	 * The meta object id for the '{@link RobotMLExtension.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RobotMLExtension.impl.AliasImpl
	 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getAlias()
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
	 * The meta object id for the '{@link RobotMLExtension.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RobotMLExtension.impl.UnionImpl
	 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getUnion()
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
	 * The meta object id for the '{@link RobotMLExtension.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RobotMLExtension.impl.ParametersImpl
	 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getParameters()
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
	 * The meta object id for the '{@link RobotMLExtension.impl.DefineImpl <em>Define</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RobotMLExtension.impl.DefineImpl
	 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getDefine()
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
	 * Returns the meta object for class '{@link RobotMLExtension.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see RobotMLExtension.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link RobotMLExtension.Array#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see RobotMLExtension.Array#getSize()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Size();

	/**
	 * Returns the meta object for the attribute '{@link RobotMLExtension.Array#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see RobotMLExtension.Array#getDimension()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Dimension();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Array#getTypeTemplate <em>Type Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Template</em>'.
	 * @see RobotMLExtension.Array#getTypeTemplate()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_TypeTemplate();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Array#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see RobotMLExtension.Array#getBaseDataType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_BaseDataType();

	/**
	 * Returns the meta object for class '{@link RobotMLExtension.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see RobotMLExtension.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for the attribute '{@link RobotMLExtension.Vector#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see RobotMLExtension.Vector#getSize()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_Size();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Vector#getTypeTemplate <em>Type Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Template</em>'.
	 * @see RobotMLExtension.Vector#getTypeTemplate()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_TypeTemplate();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Vector#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see RobotMLExtension.Vector#getBaseDataType()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_BaseDataType();

	/**
	 * Returns the meta object for class '{@link RobotMLExtension.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see RobotMLExtension.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Map#getValuesType <em>Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Values Type</em>'.
	 * @see RobotMLExtension.Map#getValuesType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_ValuesType();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Map#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see RobotMLExtension.Map#getBaseDataType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_BaseDataType();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Map#getKeysType <em>Keys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Keys Type</em>'.
	 * @see RobotMLExtension.Map#getKeysType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_KeysType();

	/**
	 * Returns the meta object for class '{@link RobotMLExtension.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see RobotMLExtension.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Alias#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see RobotMLExtension.Alias#getType()
	 * @see #getAlias()
	 * @generated
	 */
	EReference getAlias_Type();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Alias#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see RobotMLExtension.Alias#getBaseDataType()
	 * @see #getAlias()
	 * @generated
	 */
	EReference getAlias_BaseDataType();

	/**
	 * Returns the meta object for class '{@link RobotMLExtension.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see RobotMLExtension.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the reference list '{@link RobotMLExtension.Union#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see RobotMLExtension.Union#getTypes()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Types();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Union#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see RobotMLExtension.Union#getBaseDataType()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_BaseDataType();

	/**
	 * Returns the meta object for class '{@link RobotMLExtension.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see RobotMLExtension.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Parameters#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see RobotMLExtension.Parameters#getBaseClass()
	 * @see #getParameters()
	 * @generated
	 */
	EReference getParameters_BaseClass();

	/**
	 * Returns the meta object for class '{@link RobotMLExtension.Define <em>Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define</em>'.
	 * @see RobotMLExtension.Define
	 * @generated
	 */
	EClass getDefine();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Define#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see RobotMLExtension.Define#getBaseDataType()
	 * @see #getDefine()
	 * @generated
	 */
	EReference getDefine_BaseDataType();

	/**
	 * Returns the meta object for the reference '{@link RobotMLExtension.Define#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see RobotMLExtension.Define#getType()
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
	RobotMLExtensionFactory getRobotMLExtensionFactory();

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
		 * The meta object literal for the '{@link RobotMLExtension.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RobotMLExtension.impl.ArrayImpl
		 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getArray()
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
		 * The meta object literal for the '<em><b>Type Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__TYPE_TEMPLATE = eINSTANCE.getArray_TypeTemplate();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__BASE_DATA_TYPE = eINSTANCE.getArray_BaseDataType();

		/**
		 * The meta object literal for the '{@link RobotMLExtension.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RobotMLExtension.impl.VectorImpl
		 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getVector()
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
		 * The meta object literal for the '<em><b>Type Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__TYPE_TEMPLATE = eINSTANCE.getVector_TypeTemplate();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__BASE_DATA_TYPE = eINSTANCE.getVector_BaseDataType();

		/**
		 * The meta object literal for the '{@link RobotMLExtension.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RobotMLExtension.impl.MapImpl
		 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Values Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__VALUES_TYPE = eINSTANCE.getMap_ValuesType();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__BASE_DATA_TYPE = eINSTANCE.getMap_BaseDataType();

		/**
		 * The meta object literal for the '<em><b>Keys Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__KEYS_TYPE = eINSTANCE.getMap_KeysType();

		/**
		 * The meta object literal for the '{@link RobotMLExtension.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RobotMLExtension.impl.AliasImpl
		 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getAlias()
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
		EReference ALIAS__BASE_DATA_TYPE = eINSTANCE.getAlias_BaseDataType();

		/**
		 * The meta object literal for the '{@link RobotMLExtension.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RobotMLExtension.impl.UnionImpl
		 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getUnion()
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
		EReference UNION__BASE_DATA_TYPE = eINSTANCE.getUnion_BaseDataType();

		/**
		 * The meta object literal for the '{@link RobotMLExtension.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RobotMLExtension.impl.ParametersImpl
		 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS__BASE_CLASS = eINSTANCE.getParameters_BaseClass();

		/**
		 * The meta object literal for the '{@link RobotMLExtension.impl.DefineImpl <em>Define</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RobotMLExtension.impl.DefineImpl
		 * @see RobotMLExtension.impl.RobotMLExtensionPackageImpl#getDefine()
		 * @generated
		 */
		EClass DEFINE = eINSTANCE.getDefine();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE__BASE_DATA_TYPE = eINSTANCE.getDefine_BaseDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE__TYPE = eINSTANCE.getDefine_Type();

	}

} //RobotMLExtensionPackage
