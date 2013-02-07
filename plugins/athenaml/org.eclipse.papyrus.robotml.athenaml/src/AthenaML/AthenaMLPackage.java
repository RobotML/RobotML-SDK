/**
 */
package AthenaML;

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
 * @see AthenaML.AthenaMLFactory
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
	AthenaMLPackage eINSTANCE = AthenaML.impl.AthenaMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link AthenaML.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AthenaML.impl.ArrayImpl
	 * @see AthenaML.impl.AthenaMLPackageImpl#getArray()
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
	 * The meta object id for the '{@link AthenaML.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AthenaML.impl.VectorImpl
	 * @see AthenaML.impl.AthenaMLPackageImpl#getVector()
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
	 * The meta object id for the '{@link AthenaML.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AthenaML.impl.MapImpl
	 * @see AthenaML.impl.AthenaMLPackageImpl#getMap()
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
	 * The meta object id for the '{@link AthenaML.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AthenaML.impl.AliasImpl
	 * @see AthenaML.impl.AthenaMLPackageImpl#getAlias()
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
	 * The meta object id for the '{@link AthenaML.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AthenaML.impl.UnionImpl
	 * @see AthenaML.impl.AthenaMLPackageImpl#getUnion()
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
	 * The meta object id for the '{@link AthenaML.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AthenaML.impl.ParametersImpl
	 * @see AthenaML.impl.AthenaMLPackageImpl#getParameters()
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
	 * Returns the meta object for class '{@link AthenaML.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see AthenaML.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link AthenaML.Array#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see AthenaML.Array#getSize()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Size();

	/**
	 * Returns the meta object for the attribute '{@link AthenaML.Array#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see AthenaML.Array#getDimension()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Dimension();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Array#getTypeTemplate <em>Type Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Template</em>'.
	 * @see AthenaML.Array#getTypeTemplate()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_TypeTemplate();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Array#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AthenaML.Array#getBaseDataType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_BaseDataType();

	/**
	 * Returns the meta object for class '{@link AthenaML.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see AthenaML.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for the attribute '{@link AthenaML.Vector#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see AthenaML.Vector#getSize()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_Size();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Vector#getTypeTemplate <em>Type Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Template</em>'.
	 * @see AthenaML.Vector#getTypeTemplate()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_TypeTemplate();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Vector#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AthenaML.Vector#getBaseDataType()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_BaseDataType();

	/**
	 * Returns the meta object for class '{@link AthenaML.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see AthenaML.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Map#getValuesType <em>Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Values Type</em>'.
	 * @see AthenaML.Map#getValuesType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_ValuesType();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Map#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AthenaML.Map#getBaseDataType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_BaseDataType();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Map#getKeysType <em>Keys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Keys Type</em>'.
	 * @see AthenaML.Map#getKeysType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_KeysType();

	/**
	 * Returns the meta object for class '{@link AthenaML.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see AthenaML.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Alias#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see AthenaML.Alias#getType()
	 * @see #getAlias()
	 * @generated
	 */
	EReference getAlias_Type();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Alias#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AthenaML.Alias#getBaseDataType()
	 * @see #getAlias()
	 * @generated
	 */
	EReference getAlias_BaseDataType();

	/**
	 * Returns the meta object for class '{@link AthenaML.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see AthenaML.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the reference list '{@link AthenaML.Union#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see AthenaML.Union#getTypes()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Types();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Union#getBaseDataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AthenaML.Union#getBaseDataType()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_BaseDataType();

	/**
	 * Returns the meta object for class '{@link AthenaML.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see AthenaML.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the reference '{@link AthenaML.Parameters#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see AthenaML.Parameters#getBaseClass()
	 * @see #getParameters()
	 * @generated
	 */
	EReference getParameters_BaseClass();

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
		 * The meta object literal for the '{@link AthenaML.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AthenaML.impl.ArrayImpl
		 * @see AthenaML.impl.AthenaMLPackageImpl#getArray()
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
		 * The meta object literal for the '{@link AthenaML.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AthenaML.impl.VectorImpl
		 * @see AthenaML.impl.AthenaMLPackageImpl#getVector()
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
		 * The meta object literal for the '{@link AthenaML.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AthenaML.impl.MapImpl
		 * @see AthenaML.impl.AthenaMLPackageImpl#getMap()
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
		 * The meta object literal for the '{@link AthenaML.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AthenaML.impl.AliasImpl
		 * @see AthenaML.impl.AthenaMLPackageImpl#getAlias()
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
		 * The meta object literal for the '{@link AthenaML.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AthenaML.impl.UnionImpl
		 * @see AthenaML.impl.AthenaMLPackageImpl#getUnion()
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
		 * The meta object literal for the '{@link AthenaML.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AthenaML.impl.ParametersImpl
		 * @see AthenaML.impl.AthenaMLPackageImpl#getParameters()
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

	}

} //AthenaMLPackage
