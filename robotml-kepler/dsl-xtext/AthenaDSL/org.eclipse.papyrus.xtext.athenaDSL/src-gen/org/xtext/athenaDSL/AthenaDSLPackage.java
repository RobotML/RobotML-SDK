/**
 */
package org.xtext.athenaDSL;

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
 * @see org.xtext.athenaDSL.AthenaDSLFactory
 * @model kind="package"
 * @generated
 */
public interface AthenaDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "athenaDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/AthenaDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "athenaDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AthenaDSLPackage eINSTANCE = org.xtext.athenaDSL.impl.AthenaDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.ProjectImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Languages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__LANGUAGES = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__TYPES = 2;

  /**
   * The feature id for the '<em><b>Validities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__VALIDITIES = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__FUNCTIONS = 4;

  /**
   * The feature id for the '<em><b>Processings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROCESSINGS = 5;

  /**
   * The feature id for the '<em><b>Prototypes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROTOTYPES = 6;

  /**
   * The feature id for the '<em><b>Wrappers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__WRAPPERS = 7;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.ImportImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.LanguageDeclarationImpl <em>Language Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.LanguageDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getLanguageDeclaration()
   * @generated
   */
  int LANGUAGE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Language Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.DataTypeImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.defineTypeImpl <em>define Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.defineTypeImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getdefineType()
   * @generated
   */
  int DEFINE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_TYPE__TYPENAME = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>define Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.validityFunctionDeclarationImpl <em>validity Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.validityFunctionDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getvalidityFunctionDeclaration()
   * @generated
   */
  int VALIDITY_FUNCTION_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDITY_FUNCTION_DECLARATION__TYPENAME = 0;

  /**
   * The feature id for the '<em><b>Fct Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDITY_FUNCTION_DECLARATION__FCT_NAME = 1;

  /**
   * The number of structural features of the '<em>validity Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDITY_FUNCTION_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.basicTypeImpl <em>basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.basicTypeImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getbasicType()
   * @generated
   */
  int BASIC_TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__INCLUDES = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Languages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__LANGUAGES = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Casts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__CASTS = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.includeDeclImpl <em>include Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.includeDeclImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getincludeDecl()
   * @generated
   */
  int INCLUDE_DECL = 7;

  /**
   * The feature id for the '<em><b>Lang</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DECL__LANG = 0;

  /**
   * The feature id for the '<em><b>Include Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DECL__INCLUDE_NAME = 1;

  /**
   * The number of structural features of the '<em>include Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.languageDeclImpl <em>language Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.languageDeclImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getlanguageDecl()
   * @generated
   */
  int LANGUAGE_DECL = 8;

  /**
   * The feature id for the '<em><b>Lang</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_DECL__LANG = 0;

  /**
   * The feature id for the '<em><b>Trans</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_DECL__TRANS = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_DECL__VALUE = 2;

  /**
   * The number of structural features of the '<em>language Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.lexicalCastDeclImpl <em>lexical Cast Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.lexicalCastDeclImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getlexicalCastDecl()
   * @generated
   */
  int LEXICAL_CAST_DECL = 9;

  /**
   * The feature id for the '<em><b>Lang</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXICAL_CAST_DECL__LANG = 0;

  /**
   * The feature id for the '<em><b>Cast</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXICAL_CAST_DECL__CAST = 1;

  /**
   * The number of structural features of the '<em>lexical Cast Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXICAL_CAST_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.arrayTypeImpl <em>array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.arrayTypeImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getarrayType()
   * @generated
   */
  int ARRAY_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__TYPENAME = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__INDICES = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.vectorTypeImpl <em>vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.vectorTypeImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getvectorType()
   * @generated
   */
  int VECTOR_TYPE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE__TYPENAME = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.mapTypeImpl <em>map Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.mapTypeImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getmapType()
   * @generated
   */
  int MAP_TYPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Keytype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__KEYTYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__VALTYPE = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>map Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.structTypeImpl <em>struct Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.structTypeImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstructType()
   * @generated
   */
  int STRUCT_TYPE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__INDICES = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__PARAMETERS = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.structElementImpl <em>struct Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.structElementImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstructElement()
   * @generated
   */
  int STRUCT_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>Typename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEMENT__TYPENAME = 0;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEMENT__INDICES = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEMENT__NAME = 2;

  /**
   * The feature id for the '<em><b>Has Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEMENT__HAS_INIT_VALUE = 3;

  /**
   * The feature id for the '<em><b>Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEMENT__INIT_VALUE = 4;

  /**
   * The number of structural features of the '<em>struct Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.indexImpl <em>index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.indexImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getindex()
   * @generated
   */
  int INDEX = 15;

  /**
   * The feature id for the '<em><b>Dim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX__DIM = 0;

  /**
   * The feature id for the '<em><b>Has Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX__HAS_VALUE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX__VALUE = 2;

  /**
   * The number of structural features of the '<em>index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.unionTypeImpl <em>union Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.unionTypeImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getunionType()
   * @generated
   */
  int UNION_TYPE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE__ELEMENTS = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>union Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.FuncProcImpl <em>Func Proc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.FuncProcImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getFuncProc()
   * @generated
   */
  int FUNC_PROC = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_PROC__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_PROC__ARGS = 1;

  /**
   * The number of structural features of the '<em>Func Proc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_PROC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.functionDeclarationImpl <em>function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.functionDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getfunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = FUNC_PROC__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__ARGS = FUNC_PROC__ARGS;

  /**
   * The feature id for the '<em><b>Lang</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__LANG = FUNC_PROC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = FUNC_PROC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.argumentsDeclarationImpl <em>arguments Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.argumentsDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getargumentsDeclaration()
   * @generated
   */
  int ARGUMENTS_DECLARATION = 19;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_DECLARATION__ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>arguments Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.argImpl <em>arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.argImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getarg()
   * @generated
   */
  int ARG = 20;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__NAME = 2;

  /**
   * The number of structural features of the '<em>arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.ProcessingDeclarationImpl <em>Processing Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.ProcessingDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getProcessingDeclaration()
   * @generated
   */
  int PROCESSING_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_DECLARATION__NAME = FUNC_PROC__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_DECLARATION__ARGS = FUNC_PROC__ARGS;

  /**
   * The feature id for the '<em><b>Local Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_DECLARATION__LOCAL_PARAMETERS = FUNC_PROC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Local Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_DECLARATION__LOCAL_EVENTS = FUNC_PROC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_DECLARATION__STATEMENTS = FUNC_PROC_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Processing Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_DECLARATION_FEATURE_COUNT = FUNC_PROC_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.statementImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 22;

  /**
   * The feature id for the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CALL = 0;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.localParameterDeclarationImpl <em>local Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.localParameterDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getlocalParameterDeclaration()
   * @generated
   */
  int LOCAL_PARAMETER_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Has Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER_DECLARATION__HAS_VALUE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER_DECLARATION__VALUE = 3;

  /**
   * The number of structural features of the '<em>local Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.localEventDeclarationImpl <em>local Event Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.localEventDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getlocalEventDeclaration()
   * @generated
   */
  int LOCAL_EVENT_DECLARATION = 24;

  /**
   * The number of structural features of the '<em>local Event Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EVENT_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.ifblockImpl <em>ifblock</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.ifblockImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getifblock()
   * @generated
   */
  int IFBLOCK = 25;

  /**
   * The feature id for the '<em><b>Event Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFBLOCK__EVENT_NAME = 0;

  /**
   * The feature id for the '<em><b>If Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFBLOCK__IF_BLOCKS = 1;

  /**
   * The feature id for the '<em><b>Has Else</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFBLOCK__HAS_ELSE = 2;

  /**
   * The feature id for the '<em><b>Else Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFBLOCK__ELSE_BLOCKS = 3;

  /**
   * The number of structural features of the '<em>ifblock</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFBLOCK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.whileblockImpl <em>whileblock</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.whileblockImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getwhileblock()
   * @generated
   */
  int WHILEBLOCK = 26;

  /**
   * The feature id for the '<em><b>Event Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILEBLOCK__EVENT_NAME = 0;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILEBLOCK__BLOCKS = 1;

  /**
   * The number of structural features of the '<em>whileblock</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILEBLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.functionCallImpl <em>function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.functionCallImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getfunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__NAME = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.prototypeDeclarationImpl <em>prototype Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.prototypeDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getprototypeDeclaration()
   * @generated
   */
  int PROTOTYPE_DECLARATION = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOTYPE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOTYPE_DECLARATION__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOTYPE_DECLARATION__DEFINITIONS = 2;

  /**
   * The number of structural features of the '<em>prototype Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOTYPE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.architectureElementImpl <em>architecture Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.architectureElementImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getarchitectureElement()
   * @generated
   */
  int ARCHITECTURE_ELEMENT = 29;

  /**
   * The number of structural features of the '<em>architecture Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.signalDeclarationImpl <em>signal Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.signalDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getsignalDeclaration()
   * @generated
   */
  int SIGNAL_DECLARATION = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__NAME = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>signal Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.eventDeclarationImpl <em>event Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.eventDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#geteventDeclaration()
   * @generated
   */
  int EVENT_DECLARATION = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__NAME = LOCAL_EVENT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__CONDITIONS = LOCAL_EVENT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>event Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION_FEATURE_COUNT = LOCAL_EVENT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.eventConditionImpl <em>event Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.eventConditionImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#geteventCondition()
   * @generated
   */
  int EVENT_CONDITION = 32;

  /**
   * The feature id for the '<em><b>Left Part</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITION__LEFT_PART = 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITION__COND = 1;

  /**
   * The feature id for the '<em><b>Right Part I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITION__RIGHT_PART_I = 2;

  /**
   * The feature id for the '<em><b>Right Part N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITION__RIGHT_PART_N = 3;

  /**
   * The feature id for the '<em><b>Right Part S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITION__RIGHT_PART_S = 4;

  /**
   * The number of structural features of the '<em>event Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_CONDITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl <em>parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.parameterDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getparameterDeclaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 33;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__TYPE_NAME = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Nb W</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__HAS_NB_W = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nbw</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__NBW = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Has Infinite Writer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__HAS_INFINITE_WRITER = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__NAME = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Has Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__HAS_VALUE = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__VALUE = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Has Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__HAS_CONFIG = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Has Config With Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__HAS_CONFIG_WITH_DEFAULT_VALUE = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.statesetDeclarationImpl <em>stateset Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.statesetDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstatesetDeclaration()
   * @generated
   */
  int STATESET_DECLARATION = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATESET_DECLARATION__NAME = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATESET_DECLARATION__STATES = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATESET_DECLARATION__INIT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATESET_DECLARATION__TRANSITIONS = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>stateset Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATESET_DECLARATION_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.stateDeclarationImpl <em>state Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.stateDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstateDeclaration()
   * @generated
   */
  int STATE_DECLARATION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>state Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.transitionDeclarationImpl <em>transition Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.transitionDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#gettransitionDeclaration()
   * @generated
   */
  int TRANSITION_DECLARATION = 36;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION__TO = 1;

  /**
   * The feature id for the '<em><b>Evt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION__EVT = 2;

  /**
   * The feature id for the '<em><b>Raise</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION__RAISE = 3;

  /**
   * The feature id for the '<em><b>Sig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION__SIG = 4;

  /**
   * The number of structural features of the '<em>transition Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.instanceDeclarationImpl <em>instance Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.instanceDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getinstanceDeclaration()
   * @generated
   */
  int INSTANCE_DECLARATION = 37;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_DECLARATION__TYPE_NAME = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_DECLARATION__NAME = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>instance Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_DECLARATION_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.interactionDeclarationImpl <em>interaction Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.interactionDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getinteractionDeclaration()
   * @generated
   */
  int INTERACTION_DECLARATION = 38;

  /**
   * The feature id for the '<em><b>Wwhen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DECLARATION__WWHEN = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stateset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DECLARATION__STATESET = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Wstate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DECLARATION__WSTATE = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Iif</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DECLARATION__IIF = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DECLARATION__EVENT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Icalls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DECLARATION__ICALLS = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>interaction Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_DECLARATION_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.interactionCallImpl <em>interaction Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.interactionCallImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getinteractionCall()
   * @generated
   */
  int INTERACTION_CALL = 39;

  /**
   * The feature id for the '<em><b>Fct Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_CALL__FCT_NAME = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_CALL__ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>interaction Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.fargImpl <em>farg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.fargImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getfarg()
   * @generated
   */
  int FARG = 40;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FARG__VAR_NAME = 0;

  /**
   * The number of structural features of the '<em>farg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FARG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.referenceDeclarationImpl <em>reference Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.referenceDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getreferenceDeclaration()
   * @generated
   */
  int REFERENCE_DECLARATION = 41;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DECLARATION__TYPE_NAME = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upway</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DECLARATION__UPWAY = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DECLARATION__NAME = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DECLARATION__ALIAS = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>reference Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_DECLARATION_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.qualifiedNameImpl <em>qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.qualifiedNameImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getqualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.athenaDSL.impl.wrapperDeclarationImpl <em>wrapper Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.athenaDSL.impl.wrapperDeclarationImpl
   * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getwrapperDeclaration()
   * @generated
   */
  int WRAPPER_DECLARATION = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_DECLARATION__LINK = 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_DECLARATION__FUNCTIONS = 2;

  /**
   * The feature id for the '<em><b>Objects</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_DECLARATION__OBJECTS = 3;

  /**
   * The feature id for the '<em><b>Libraries</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_DECLARATION__LIBRARIES = 4;

  /**
   * The feature id for the '<em><b>Tests</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_DECLARATION__TESTS = 5;

  /**
   * The number of structural features of the '<em>wrapper Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRAPPER_DECLARATION_FEATURE_COUNT = 6;


  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see org.xtext.athenaDSL.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.Project#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.athenaDSL.Project#getImports()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.Project#getLanguages <em>Languages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Languages</em>'.
   * @see org.xtext.athenaDSL.Project#getLanguages()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Languages();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.Project#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.xtext.athenaDSL.Project#getTypes()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.Project#getValidities <em>Validities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Validities</em>'.
   * @see org.xtext.athenaDSL.Project#getValidities()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Validities();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.Project#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.xtext.athenaDSL.Project#getFunctions()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.Project#getProcessings <em>Processings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processings</em>'.
   * @see org.xtext.athenaDSL.Project#getProcessings()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Processings();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.Project#getPrototypes <em>Prototypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prototypes</em>'.
   * @see org.xtext.athenaDSL.Project#getPrototypes()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Prototypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.Project#getWrappers <em>Wrappers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Wrappers</em>'.
   * @see org.xtext.athenaDSL.Project#getWrappers()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Wrappers();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.athenaDSL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.xtext.athenaDSL.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.LanguageDeclaration <em>Language Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language Declaration</em>'.
   * @see org.xtext.athenaDSL.LanguageDeclaration
   * @generated
   */
  EClass getLanguageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.LanguageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.LanguageDeclaration#getName()
   * @see #getLanguageDeclaration()
   * @generated
   */
  EAttribute getLanguageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.xtext.athenaDSL.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.defineType <em>define Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>define Type</em>'.
   * @see org.xtext.athenaDSL.defineType
   * @generated
   */
  EClass getdefineType();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.defineType#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typename</em>'.
   * @see org.xtext.athenaDSL.defineType#getTypename()
   * @see #getdefineType()
   * @generated
   */
  EReference getdefineType_Typename();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.validityFunctionDeclaration <em>validity Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>validity Function Declaration</em>'.
   * @see org.xtext.athenaDSL.validityFunctionDeclaration
   * @generated
   */
  EClass getvalidityFunctionDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.validityFunctionDeclaration#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typename</em>'.
   * @see org.xtext.athenaDSL.validityFunctionDeclaration#getTypename()
   * @see #getvalidityFunctionDeclaration()
   * @generated
   */
  EReference getvalidityFunctionDeclaration_Typename();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.validityFunctionDeclaration#getFctName <em>Fct Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fct Name</em>'.
   * @see org.xtext.athenaDSL.validityFunctionDeclaration#getFctName()
   * @see #getvalidityFunctionDeclaration()
   * @generated
   */
  EAttribute getvalidityFunctionDeclaration_FctName();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.basicType <em>basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>basic Type</em>'.
   * @see org.xtext.athenaDSL.basicType
   * @generated
   */
  EClass getbasicType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.basicType#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.xtext.athenaDSL.basicType#getIncludes()
   * @see #getbasicType()
   * @generated
   */
  EReference getbasicType_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.basicType#getLanguages <em>Languages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Languages</em>'.
   * @see org.xtext.athenaDSL.basicType#getLanguages()
   * @see #getbasicType()
   * @generated
   */
  EReference getbasicType_Languages();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.basicType#getCasts <em>Casts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Casts</em>'.
   * @see org.xtext.athenaDSL.basicType#getCasts()
   * @see #getbasicType()
   * @generated
   */
  EReference getbasicType_Casts();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.includeDecl <em>include Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>include Decl</em>'.
   * @see org.xtext.athenaDSL.includeDecl
   * @generated
   */
  EClass getincludeDecl();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.includeDecl#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lang</em>'.
   * @see org.xtext.athenaDSL.includeDecl#getLang()
   * @see #getincludeDecl()
   * @generated
   */
  EReference getincludeDecl_Lang();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.includeDecl#getIncludeName <em>Include Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include Name</em>'.
   * @see org.xtext.athenaDSL.includeDecl#getIncludeName()
   * @see #getincludeDecl()
   * @generated
   */
  EAttribute getincludeDecl_IncludeName();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.languageDecl <em>language Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>language Decl</em>'.
   * @see org.xtext.athenaDSL.languageDecl
   * @generated
   */
  EClass getlanguageDecl();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.languageDecl#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lang</em>'.
   * @see org.xtext.athenaDSL.languageDecl#getLang()
   * @see #getlanguageDecl()
   * @generated
   */
  EReference getlanguageDecl_Lang();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.languageDecl#getTrans <em>Trans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trans</em>'.
   * @see org.xtext.athenaDSL.languageDecl#getTrans()
   * @see #getlanguageDecl()
   * @generated
   */
  EAttribute getlanguageDecl_Trans();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.languageDecl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.athenaDSL.languageDecl#getValue()
   * @see #getlanguageDecl()
   * @generated
   */
  EAttribute getlanguageDecl_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.lexicalCastDecl <em>lexical Cast Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>lexical Cast Decl</em>'.
   * @see org.xtext.athenaDSL.lexicalCastDecl
   * @generated
   */
  EClass getlexicalCastDecl();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.lexicalCastDecl#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lang</em>'.
   * @see org.xtext.athenaDSL.lexicalCastDecl#getLang()
   * @see #getlexicalCastDecl()
   * @generated
   */
  EReference getlexicalCastDecl_Lang();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.lexicalCastDecl#getCast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cast</em>'.
   * @see org.xtext.athenaDSL.lexicalCastDecl#getCast()
   * @see #getlexicalCastDecl()
   * @generated
   */
  EAttribute getlexicalCastDecl_Cast();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.arrayType <em>array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>array Type</em>'.
   * @see org.xtext.athenaDSL.arrayType
   * @generated
   */
  EClass getarrayType();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.arrayType#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typename</em>'.
   * @see org.xtext.athenaDSL.arrayType#getTypename()
   * @see #getarrayType()
   * @generated
   */
  EReference getarrayType_Typename();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.arrayType#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see org.xtext.athenaDSL.arrayType#getIndices()
   * @see #getarrayType()
   * @generated
   */
  EReference getarrayType_Indices();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.vectorType <em>vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vector Type</em>'.
   * @see org.xtext.athenaDSL.vectorType
   * @generated
   */
  EClass getvectorType();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.vectorType#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typename</em>'.
   * @see org.xtext.athenaDSL.vectorType#getTypename()
   * @see #getvectorType()
   * @generated
   */
  EReference getvectorType_Typename();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.mapType <em>map Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>map Type</em>'.
   * @see org.xtext.athenaDSL.mapType
   * @generated
   */
  EClass getmapType();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.mapType#getKeytype <em>Keytype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Keytype</em>'.
   * @see org.xtext.athenaDSL.mapType#getKeytype()
   * @see #getmapType()
   * @generated
   */
  EReference getmapType_Keytype();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.mapType#getValtype <em>Valtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Valtype</em>'.
   * @see org.xtext.athenaDSL.mapType#getValtype()
   * @see #getmapType()
   * @generated
   */
  EReference getmapType_Valtype();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.structType <em>struct Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct Type</em>'.
   * @see org.xtext.athenaDSL.structType
   * @generated
   */
  EClass getstructType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.structType#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see org.xtext.athenaDSL.structType#getIndices()
   * @see #getstructType()
   * @generated
   */
  EReference getstructType_Indices();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.structType#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.athenaDSL.structType#getParameters()
   * @see #getstructType()
   * @generated
   */
  EReference getstructType_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.structElement <em>struct Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct Element</em>'.
   * @see org.xtext.athenaDSL.structElement
   * @generated
   */
  EClass getstructElement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.structElement#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typename</em>'.
   * @see org.xtext.athenaDSL.structElement#getTypename()
   * @see #getstructElement()
   * @generated
   */
  EReference getstructElement_Typename();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.structElement#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see org.xtext.athenaDSL.structElement#getIndices()
   * @see #getstructElement()
   * @generated
   */
  EReference getstructElement_Indices();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.structElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.structElement#getName()
   * @see #getstructElement()
   * @generated
   */
  EAttribute getstructElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.structElement#isHasInitValue <em>Has Init Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Init Value</em>'.
   * @see org.xtext.athenaDSL.structElement#isHasInitValue()
   * @see #getstructElement()
   * @generated
   */
  EAttribute getstructElement_HasInitValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.structElement#getInitValue <em>Init Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Value</em>'.
   * @see org.xtext.athenaDSL.structElement#getInitValue()
   * @see #getstructElement()
   * @generated
   */
  EAttribute getstructElement_InitValue();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.index <em>index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>index</em>'.
   * @see org.xtext.athenaDSL.index
   * @generated
   */
  EClass getindex();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.index#getDim <em>Dim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dim</em>'.
   * @see org.xtext.athenaDSL.index#getDim()
   * @see #getindex()
   * @generated
   */
  EAttribute getindex_Dim();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.index#isHasValue <em>Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Value</em>'.
   * @see org.xtext.athenaDSL.index#isHasValue()
   * @see #getindex()
   * @generated
   */
  EAttribute getindex_HasValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.index#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.athenaDSL.index#getValue()
   * @see #getindex()
   * @generated
   */
  EAttribute getindex_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.unionType <em>union Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>union Type</em>'.
   * @see org.xtext.athenaDSL.unionType
   * @generated
   */
  EClass getunionType();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.athenaDSL.unionType#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Elements</em>'.
   * @see org.xtext.athenaDSL.unionType#getElements()
   * @see #getunionType()
   * @generated
   */
  EReference getunionType_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.FuncProc <em>Func Proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Proc</em>'.
   * @see org.xtext.athenaDSL.FuncProc
   * @generated
   */
  EClass getFuncProc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.FuncProc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.FuncProc#getName()
   * @see #getFuncProc()
   * @generated
   */
  EAttribute getFuncProc_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.athenaDSL.FuncProc#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see org.xtext.athenaDSL.FuncProc#getArgs()
   * @see #getFuncProc()
   * @generated
   */
  EReference getFuncProc_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.functionDeclaration <em>function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Declaration</em>'.
   * @see org.xtext.athenaDSL.functionDeclaration
   * @generated
   */
  EClass getfunctionDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.functionDeclaration#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lang</em>'.
   * @see org.xtext.athenaDSL.functionDeclaration#getLang()
   * @see #getfunctionDeclaration()
   * @generated
   */
  EReference getfunctionDeclaration_Lang();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.argumentsDeclaration <em>arguments Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>arguments Declaration</em>'.
   * @see org.xtext.athenaDSL.argumentsDeclaration
   * @generated
   */
  EClass getargumentsDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.argumentsDeclaration#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.xtext.athenaDSL.argumentsDeclaration#getArguments()
   * @see #getargumentsDeclaration()
   * @generated
   */
  EReference getargumentsDeclaration_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.arg <em>arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>arg</em>'.
   * @see org.xtext.athenaDSL.arg
   * @generated
   */
  EClass getarg();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.arg#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.xtext.athenaDSL.arg#getModifier()
   * @see #getarg()
   * @generated
   */
  EAttribute getarg_Modifier();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.arg#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.athenaDSL.arg#getType()
   * @see #getarg()
   * @generated
   */
  EReference getarg_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.arg#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.arg#getName()
   * @see #getarg()
   * @generated
   */
  EAttribute getarg_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.ProcessingDeclaration <em>Processing Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Processing Declaration</em>'.
   * @see org.xtext.athenaDSL.ProcessingDeclaration
   * @generated
   */
  EClass getProcessingDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.ProcessingDeclaration#getLocalParameters <em>Local Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local Parameters</em>'.
   * @see org.xtext.athenaDSL.ProcessingDeclaration#getLocalParameters()
   * @see #getProcessingDeclaration()
   * @generated
   */
  EReference getProcessingDeclaration_LocalParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.ProcessingDeclaration#getLocalEvents <em>Local Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local Events</em>'.
   * @see org.xtext.athenaDSL.ProcessingDeclaration#getLocalEvents()
   * @see #getProcessingDeclaration()
   * @generated
   */
  EReference getProcessingDeclaration_LocalEvents();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.ProcessingDeclaration#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.athenaDSL.ProcessingDeclaration#getStatements()
   * @see #getProcessingDeclaration()
   * @generated
   */
  EReference getProcessingDeclaration_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see org.xtext.athenaDSL.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.athenaDSL.statement#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call</em>'.
   * @see org.xtext.athenaDSL.statement#getCall()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Call();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.localParameterDeclaration <em>local Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>local Parameter Declaration</em>'.
   * @see org.xtext.athenaDSL.localParameterDeclaration
   * @generated
   */
  EClass getlocalParameterDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.localParameterDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.athenaDSL.localParameterDeclaration#getType()
   * @see #getlocalParameterDeclaration()
   * @generated
   */
  EReference getlocalParameterDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.localParameterDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.localParameterDeclaration#getName()
   * @see #getlocalParameterDeclaration()
   * @generated
   */
  EAttribute getlocalParameterDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.localParameterDeclaration#isHasValue <em>Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Value</em>'.
   * @see org.xtext.athenaDSL.localParameterDeclaration#isHasValue()
   * @see #getlocalParameterDeclaration()
   * @generated
   */
  EAttribute getlocalParameterDeclaration_HasValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.localParameterDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.athenaDSL.localParameterDeclaration#getValue()
   * @see #getlocalParameterDeclaration()
   * @generated
   */
  EAttribute getlocalParameterDeclaration_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.localEventDeclaration <em>local Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>local Event Declaration</em>'.
   * @see org.xtext.athenaDSL.localEventDeclaration
   * @generated
   */
  EClass getlocalEventDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.ifblock <em>ifblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ifblock</em>'.
   * @see org.xtext.athenaDSL.ifblock
   * @generated
   */
  EClass getifblock();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.ifblock#getEventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Name</em>'.
   * @see org.xtext.athenaDSL.ifblock#getEventName()
   * @see #getifblock()
   * @generated
   */
  EReference getifblock_EventName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.ifblock#getIfBlocks <em>If Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>If Blocks</em>'.
   * @see org.xtext.athenaDSL.ifblock#getIfBlocks()
   * @see #getifblock()
   * @generated
   */
  EReference getifblock_IfBlocks();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.ifblock#isHasElse <em>Has Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Else</em>'.
   * @see org.xtext.athenaDSL.ifblock#isHasElse()
   * @see #getifblock()
   * @generated
   */
  EAttribute getifblock_HasElse();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.ifblock#getElseBlocks <em>Else Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Blocks</em>'.
   * @see org.xtext.athenaDSL.ifblock#getElseBlocks()
   * @see #getifblock()
   * @generated
   */
  EReference getifblock_ElseBlocks();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.whileblock <em>whileblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>whileblock</em>'.
   * @see org.xtext.athenaDSL.whileblock
   * @generated
   */
  EClass getwhileblock();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.whileblock#getEventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Name</em>'.
   * @see org.xtext.athenaDSL.whileblock#getEventName()
   * @see #getwhileblock()
   * @generated
   */
  EReference getwhileblock_EventName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.whileblock#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.xtext.athenaDSL.whileblock#getBlocks()
   * @see #getwhileblock()
   * @generated
   */
  EReference getwhileblock_Blocks();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.functionCall <em>function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Call</em>'.
   * @see org.xtext.athenaDSL.functionCall
   * @generated
   */
  EClass getfunctionCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.functionCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.athenaDSL.functionCall#getName()
   * @see #getfunctionCall()
   * @generated
   */
  EReference getfunctionCall_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.functionCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.xtext.athenaDSL.functionCall#getArguments()
   * @see #getfunctionCall()
   * @generated
   */
  EReference getfunctionCall_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.prototypeDeclaration <em>prototype Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>prototype Declaration</em>'.
   * @see org.xtext.athenaDSL.prototypeDeclaration
   * @generated
   */
  EClass getprototypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.prototypeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.prototypeDeclaration#getName()
   * @see #getprototypeDeclaration()
   * @generated
   */
  EAttribute getprototypeDeclaration_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.prototypeDeclaration#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.xtext.athenaDSL.prototypeDeclaration#getSuperType()
   * @see #getprototypeDeclaration()
   * @generated
   */
  EReference getprototypeDeclaration_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.prototypeDeclaration#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.xtext.athenaDSL.prototypeDeclaration#getDefinitions()
   * @see #getprototypeDeclaration()
   * @generated
   */
  EReference getprototypeDeclaration_Definitions();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.architectureElement <em>architecture Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>architecture Element</em>'.
   * @see org.xtext.athenaDSL.architectureElement
   * @generated
   */
  EClass getarchitectureElement();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.signalDeclaration <em>signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>signal Declaration</em>'.
   * @see org.xtext.athenaDSL.signalDeclaration
   * @generated
   */
  EClass getsignalDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.signalDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.signalDeclaration#getName()
   * @see #getsignalDeclaration()
   * @generated
   */
  EAttribute getsignalDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.eventDeclaration <em>event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>event Declaration</em>'.
   * @see org.xtext.athenaDSL.eventDeclaration
   * @generated
   */
  EClass geteventDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.eventDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.eventDeclaration#getName()
   * @see #geteventDeclaration()
   * @generated
   */
  EAttribute geteventDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.eventDeclaration#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see org.xtext.athenaDSL.eventDeclaration#getConditions()
   * @see #geteventDeclaration()
   * @generated
   */
  EReference geteventDeclaration_Conditions();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.eventCondition <em>event Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>event Condition</em>'.
   * @see org.xtext.athenaDSL.eventCondition
   * @generated
   */
  EClass geteventCondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.eventCondition#getLeftPart <em>Left Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Part</em>'.
   * @see org.xtext.athenaDSL.eventCondition#getLeftPart()
   * @see #geteventCondition()
   * @generated
   */
  EAttribute geteventCondition_LeftPart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.eventCondition#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cond</em>'.
   * @see org.xtext.athenaDSL.eventCondition#getCond()
   * @see #geteventCondition()
   * @generated
   */
  EAttribute geteventCondition_Cond();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.eventCondition#getRightPartI <em>Right Part I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Part I</em>'.
   * @see org.xtext.athenaDSL.eventCondition#getRightPartI()
   * @see #geteventCondition()
   * @generated
   */
  EAttribute geteventCondition_RightPartI();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.eventCondition#getRightPartN <em>Right Part N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Part N</em>'.
   * @see org.xtext.athenaDSL.eventCondition#getRightPartN()
   * @see #geteventCondition()
   * @generated
   */
  EAttribute geteventCondition_RightPartN();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.eventCondition#getRightPartS <em>Right Part S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Part S</em>'.
   * @see org.xtext.athenaDSL.eventCondition#getRightPartS()
   * @see #geteventCondition()
   * @generated
   */
  EAttribute geteventCondition_RightPartS();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.parameterDeclaration <em>parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parameter Declaration</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration
   * @generated
   */
  EClass getparameterDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.parameterDeclaration#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Name</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#getTypeName()
   * @see #getparameterDeclaration()
   * @generated
   */
  EReference getparameterDeclaration_TypeName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.parameterDeclaration#isHasNbW <em>Has Nb W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Nb W</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#isHasNbW()
   * @see #getparameterDeclaration()
   * @generated
   */
  EAttribute getparameterDeclaration_HasNbW();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.parameterDeclaration#getNbw <em>Nbw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nbw</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#getNbw()
   * @see #getparameterDeclaration()
   * @generated
   */
  EAttribute getparameterDeclaration_Nbw();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.parameterDeclaration#isHasInfiniteWriter <em>Has Infinite Writer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Infinite Writer</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#isHasInfiniteWriter()
   * @see #getparameterDeclaration()
   * @generated
   */
  EAttribute getparameterDeclaration_HasInfiniteWriter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.parameterDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#getName()
   * @see #getparameterDeclaration()
   * @generated
   */
  EAttribute getparameterDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.parameterDeclaration#isHasValue <em>Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Value</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#isHasValue()
   * @see #getparameterDeclaration()
   * @generated
   */
  EAttribute getparameterDeclaration_HasValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.parameterDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#getValue()
   * @see #getparameterDeclaration()
   * @generated
   */
  EAttribute getparameterDeclaration_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.parameterDeclaration#isHasConfig <em>Has Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Config</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#isHasConfig()
   * @see #getparameterDeclaration()
   * @generated
   */
  EAttribute getparameterDeclaration_HasConfig();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.parameterDeclaration#isHasConfigWithDefaultValue <em>Has Config With Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Config With Default Value</em>'.
   * @see org.xtext.athenaDSL.parameterDeclaration#isHasConfigWithDefaultValue()
   * @see #getparameterDeclaration()
   * @generated
   */
  EAttribute getparameterDeclaration_HasConfigWithDefaultValue();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.statesetDeclaration <em>stateset Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stateset Declaration</em>'.
   * @see org.xtext.athenaDSL.statesetDeclaration
   * @generated
   */
  EClass getstatesetDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.statesetDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.statesetDeclaration#getName()
   * @see #getstatesetDeclaration()
   * @generated
   */
  EAttribute getstatesetDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.statesetDeclaration#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.xtext.athenaDSL.statesetDeclaration#getStates()
   * @see #getstatesetDeclaration()
   * @generated
   */
  EReference getstatesetDeclaration_States();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.statesetDeclaration#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Init</em>'.
   * @see org.xtext.athenaDSL.statesetDeclaration#getInit()
   * @see #getstatesetDeclaration()
   * @generated
   */
  EReference getstatesetDeclaration_Init();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.statesetDeclaration#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.xtext.athenaDSL.statesetDeclaration#getTransitions()
   * @see #getstatesetDeclaration()
   * @generated
   */
  EReference getstatesetDeclaration_Transitions();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.stateDeclaration <em>state Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>state Declaration</em>'.
   * @see org.xtext.athenaDSL.stateDeclaration
   * @generated
   */
  EClass getstateDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.stateDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.stateDeclaration#getName()
   * @see #getstateDeclaration()
   * @generated
   */
  EAttribute getstateDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.transitionDeclaration <em>transition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>transition Declaration</em>'.
   * @see org.xtext.athenaDSL.transitionDeclaration
   * @generated
   */
  EClass gettransitionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.transitionDeclaration#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see org.xtext.athenaDSL.transitionDeclaration#getFrom()
   * @see #gettransitionDeclaration()
   * @generated
   */
  EAttribute gettransitionDeclaration_From();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.transitionDeclaration#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see org.xtext.athenaDSL.transitionDeclaration#getTo()
   * @see #gettransitionDeclaration()
   * @generated
   */
  EAttribute gettransitionDeclaration_To();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.transitionDeclaration#getEvt <em>Evt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evt</em>'.
   * @see org.xtext.athenaDSL.transitionDeclaration#getEvt()
   * @see #gettransitionDeclaration()
   * @generated
   */
  EAttribute gettransitionDeclaration_Evt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.transitionDeclaration#isRaise <em>Raise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Raise</em>'.
   * @see org.xtext.athenaDSL.transitionDeclaration#isRaise()
   * @see #gettransitionDeclaration()
   * @generated
   */
  EAttribute gettransitionDeclaration_Raise();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.transitionDeclaration#getSig <em>Sig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sig</em>'.
   * @see org.xtext.athenaDSL.transitionDeclaration#getSig()
   * @see #gettransitionDeclaration()
   * @generated
   */
  EAttribute gettransitionDeclaration_Sig();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.instanceDeclaration <em>instance Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>instance Declaration</em>'.
   * @see org.xtext.athenaDSL.instanceDeclaration
   * @generated
   */
  EClass getinstanceDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.instanceDeclaration#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Name</em>'.
   * @see org.xtext.athenaDSL.instanceDeclaration#getTypeName()
   * @see #getinstanceDeclaration()
   * @generated
   */
  EReference getinstanceDeclaration_TypeName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.instanceDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.instanceDeclaration#getName()
   * @see #getinstanceDeclaration()
   * @generated
   */
  EAttribute getinstanceDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.interactionDeclaration <em>interaction Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>interaction Declaration</em>'.
   * @see org.xtext.athenaDSL.interactionDeclaration
   * @generated
   */
  EClass getinteractionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.interactionDeclaration#isWwhen <em>Wwhen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wwhen</em>'.
   * @see org.xtext.athenaDSL.interactionDeclaration#isWwhen()
   * @see #getinteractionDeclaration()
   * @generated
   */
  EAttribute getinteractionDeclaration_Wwhen();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.interactionDeclaration#getStateset <em>Stateset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stateset</em>'.
   * @see org.xtext.athenaDSL.interactionDeclaration#getStateset()
   * @see #getinteractionDeclaration()
   * @generated
   */
  EAttribute getinteractionDeclaration_Stateset();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.interactionDeclaration#getWstate <em>Wstate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wstate</em>'.
   * @see org.xtext.athenaDSL.interactionDeclaration#getWstate()
   * @see #getinteractionDeclaration()
   * @generated
   */
  EAttribute getinteractionDeclaration_Wstate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.interactionDeclaration#isIif <em>Iif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iif</em>'.
   * @see org.xtext.athenaDSL.interactionDeclaration#isIif()
   * @see #getinteractionDeclaration()
   * @generated
   */
  EAttribute getinteractionDeclaration_Iif();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.interactionDeclaration#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see org.xtext.athenaDSL.interactionDeclaration#getEvent()
   * @see #getinteractionDeclaration()
   * @generated
   */
  EAttribute getinteractionDeclaration_Event();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.interactionDeclaration#getIcalls <em>Icalls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Icalls</em>'.
   * @see org.xtext.athenaDSL.interactionDeclaration#getIcalls()
   * @see #getinteractionDeclaration()
   * @generated
   */
  EReference getinteractionDeclaration_Icalls();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.interactionCall <em>interaction Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>interaction Call</em>'.
   * @see org.xtext.athenaDSL.interactionCall
   * @generated
   */
  EClass getinteractionCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.interactionCall#getFctName <em>Fct Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fct Name</em>'.
   * @see org.xtext.athenaDSL.interactionCall#getFctName()
   * @see #getinteractionCall()
   * @generated
   */
  EReference getinteractionCall_FctName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.athenaDSL.interactionCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.xtext.athenaDSL.interactionCall#getArguments()
   * @see #getinteractionCall()
   * @generated
   */
  EReference getinteractionCall_Arguments();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.farg <em>farg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>farg</em>'.
   * @see org.xtext.athenaDSL.farg
   * @generated
   */
  EClass getfarg();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.farg#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see org.xtext.athenaDSL.farg#getVarName()
   * @see #getfarg()
   * @generated
   */
  EAttribute getfarg_VarName();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.referenceDeclaration <em>reference Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>reference Declaration</em>'.
   * @see org.xtext.athenaDSL.referenceDeclaration
   * @generated
   */
  EClass getreferenceDeclaration();

  /**
   * Returns the meta object for the reference '{@link org.xtext.athenaDSL.referenceDeclaration#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Name</em>'.
   * @see org.xtext.athenaDSL.referenceDeclaration#getTypeName()
   * @see #getreferenceDeclaration()
   * @generated
   */
  EReference getreferenceDeclaration_TypeName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.referenceDeclaration#isUpway <em>Upway</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upway</em>'.
   * @see org.xtext.athenaDSL.referenceDeclaration#isUpway()
   * @see #getreferenceDeclaration()
   * @generated
   */
  EAttribute getreferenceDeclaration_Upway();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.athenaDSL.referenceDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.athenaDSL.referenceDeclaration#getName()
   * @see #getreferenceDeclaration()
   * @generated
   */
  EReference getreferenceDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.referenceDeclaration#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.xtext.athenaDSL.referenceDeclaration#getAlias()
   * @see #getreferenceDeclaration()
   * @generated
   */
  EAttribute getreferenceDeclaration_Alias();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.qualifiedName <em>qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>qualified Name</em>'.
   * @see org.xtext.athenaDSL.qualifiedName
   * @generated
   */
  EClass getqualifiedName();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.athenaDSL.qualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.xtext.athenaDSL.qualifiedName#getName()
   * @see #getqualifiedName()
   * @generated
   */
  EAttribute getqualifiedName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.athenaDSL.wrapperDeclaration <em>wrapper Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>wrapper Declaration</em>'.
   * @see org.xtext.athenaDSL.wrapperDeclaration
   * @generated
   */
  EClass getwrapperDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.wrapperDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.athenaDSL.wrapperDeclaration#getName()
   * @see #getwrapperDeclaration()
   * @generated
   */
  EAttribute getwrapperDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.athenaDSL.wrapperDeclaration#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link</em>'.
   * @see org.xtext.athenaDSL.wrapperDeclaration#getLink()
   * @see #getwrapperDeclaration()
   * @generated
   */
  EAttribute getwrapperDeclaration_Link();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.athenaDSL.wrapperDeclaration#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Functions</em>'.
   * @see org.xtext.athenaDSL.wrapperDeclaration#getFunctions()
   * @see #getwrapperDeclaration()
   * @generated
   */
  EAttribute getwrapperDeclaration_Functions();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.athenaDSL.wrapperDeclaration#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Objects</em>'.
   * @see org.xtext.athenaDSL.wrapperDeclaration#getObjects()
   * @see #getwrapperDeclaration()
   * @generated
   */
  EAttribute getwrapperDeclaration_Objects();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.athenaDSL.wrapperDeclaration#getLibraries <em>Libraries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Libraries</em>'.
   * @see org.xtext.athenaDSL.wrapperDeclaration#getLibraries()
   * @see #getwrapperDeclaration()
   * @generated
   */
  EAttribute getwrapperDeclaration_Libraries();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.athenaDSL.wrapperDeclaration#getTests <em>Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tests</em>'.
   * @see org.xtext.athenaDSL.wrapperDeclaration#getTests()
   * @see #getwrapperDeclaration()
   * @generated
   */
  EAttribute getwrapperDeclaration_Tests();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AthenaDSLFactory getAthenaDSLFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.ProjectImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__IMPORTS = eINSTANCE.getProject_Imports();

    /**
     * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__LANGUAGES = eINSTANCE.getProject_Languages();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__TYPES = eINSTANCE.getProject_Types();

    /**
     * The meta object literal for the '<em><b>Validities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__VALIDITIES = eINSTANCE.getProject_Validities();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__FUNCTIONS = eINSTANCE.getProject_Functions();

    /**
     * The meta object literal for the '<em><b>Processings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PROCESSINGS = eINSTANCE.getProject_Processings();

    /**
     * The meta object literal for the '<em><b>Prototypes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PROTOTYPES = eINSTANCE.getProject_Prototypes();

    /**
     * The meta object literal for the '<em><b>Wrappers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__WRAPPERS = eINSTANCE.getProject_Wrappers();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.ImportImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.LanguageDeclarationImpl <em>Language Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.LanguageDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getLanguageDeclaration()
     * @generated
     */
    EClass LANGUAGE_DECLARATION = eINSTANCE.getLanguageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_DECLARATION__NAME = eINSTANCE.getLanguageDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.DataTypeImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.defineTypeImpl <em>define Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.defineTypeImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getdefineType()
     * @generated
     */
    EClass DEFINE_TYPE = eINSTANCE.getdefineType();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE_TYPE__TYPENAME = eINSTANCE.getdefineType_Typename();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.validityFunctionDeclarationImpl <em>validity Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.validityFunctionDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getvalidityFunctionDeclaration()
     * @generated
     */
    EClass VALIDITY_FUNCTION_DECLARATION = eINSTANCE.getvalidityFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDITY_FUNCTION_DECLARATION__TYPENAME = eINSTANCE.getvalidityFunctionDeclaration_Typename();

    /**
     * The meta object literal for the '<em><b>Fct Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDITY_FUNCTION_DECLARATION__FCT_NAME = eINSTANCE.getvalidityFunctionDeclaration_FctName();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.basicTypeImpl <em>basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.basicTypeImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getbasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getbasicType();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__INCLUDES = eINSTANCE.getbasicType_Includes();

    /**
     * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__LANGUAGES = eINSTANCE.getbasicType_Languages();

    /**
     * The meta object literal for the '<em><b>Casts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TYPE__CASTS = eINSTANCE.getbasicType_Casts();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.includeDeclImpl <em>include Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.includeDeclImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getincludeDecl()
     * @generated
     */
    EClass INCLUDE_DECL = eINSTANCE.getincludeDecl();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE_DECL__LANG = eINSTANCE.getincludeDecl_Lang();

    /**
     * The meta object literal for the '<em><b>Include Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DECL__INCLUDE_NAME = eINSTANCE.getincludeDecl_IncludeName();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.languageDeclImpl <em>language Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.languageDeclImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getlanguageDecl()
     * @generated
     */
    EClass LANGUAGE_DECL = eINSTANCE.getlanguageDecl();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE_DECL__LANG = eINSTANCE.getlanguageDecl_Lang();

    /**
     * The meta object literal for the '<em><b>Trans</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_DECL__TRANS = eINSTANCE.getlanguageDecl_Trans();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_DECL__VALUE = eINSTANCE.getlanguageDecl_Value();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.lexicalCastDeclImpl <em>lexical Cast Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.lexicalCastDeclImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getlexicalCastDecl()
     * @generated
     */
    EClass LEXICAL_CAST_DECL = eINSTANCE.getlexicalCastDecl();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXICAL_CAST_DECL__LANG = eINSTANCE.getlexicalCastDecl_Lang();

    /**
     * The meta object literal for the '<em><b>Cast</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEXICAL_CAST_DECL__CAST = eINSTANCE.getlexicalCastDecl_Cast();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.arrayTypeImpl <em>array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.arrayTypeImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getarrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getarrayType();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__TYPENAME = eINSTANCE.getarrayType_Typename();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__INDICES = eINSTANCE.getarrayType_Indices();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.vectorTypeImpl <em>vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.vectorTypeImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getvectorType()
     * @generated
     */
    EClass VECTOR_TYPE = eINSTANCE.getvectorType();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_TYPE__TYPENAME = eINSTANCE.getvectorType_Typename();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.mapTypeImpl <em>map Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.mapTypeImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getmapType()
     * @generated
     */
    EClass MAP_TYPE = eINSTANCE.getmapType();

    /**
     * The meta object literal for the '<em><b>Keytype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__KEYTYPE = eINSTANCE.getmapType_Keytype();

    /**
     * The meta object literal for the '<em><b>Valtype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__VALTYPE = eINSTANCE.getmapType_Valtype();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.structTypeImpl <em>struct Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.structTypeImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstructType()
     * @generated
     */
    EClass STRUCT_TYPE = eINSTANCE.getstructType();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_TYPE__INDICES = eINSTANCE.getstructType_Indices();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_TYPE__PARAMETERS = eINSTANCE.getstructType_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.structElementImpl <em>struct Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.structElementImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstructElement()
     * @generated
     */
    EClass STRUCT_ELEMENT = eINSTANCE.getstructElement();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ELEMENT__TYPENAME = eINSTANCE.getstructElement_Typename();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ELEMENT__INDICES = eINSTANCE.getstructElement_Indices();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_ELEMENT__NAME = eINSTANCE.getstructElement_Name();

    /**
     * The meta object literal for the '<em><b>Has Init Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_ELEMENT__HAS_INIT_VALUE = eINSTANCE.getstructElement_HasInitValue();

    /**
     * The meta object literal for the '<em><b>Init Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_ELEMENT__INIT_VALUE = eINSTANCE.getstructElement_InitValue();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.indexImpl <em>index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.indexImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getindex()
     * @generated
     */
    EClass INDEX = eINSTANCE.getindex();

    /**
     * The meta object literal for the '<em><b>Dim</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEX__DIM = eINSTANCE.getindex_Dim();

    /**
     * The meta object literal for the '<em><b>Has Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEX__HAS_VALUE = eINSTANCE.getindex_HasValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEX__VALUE = eINSTANCE.getindex_Value();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.unionTypeImpl <em>union Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.unionTypeImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getunionType()
     * @generated
     */
    EClass UNION_TYPE = eINSTANCE.getunionType();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_TYPE__ELEMENTS = eINSTANCE.getunionType_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.FuncProcImpl <em>Func Proc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.FuncProcImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getFuncProc()
     * @generated
     */
    EClass FUNC_PROC = eINSTANCE.getFuncProc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNC_PROC__NAME = eINSTANCE.getFuncProc_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_PROC__ARGS = eINSTANCE.getFuncProc_Args();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.functionDeclarationImpl <em>function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.functionDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getfunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getfunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__LANG = eINSTANCE.getfunctionDeclaration_Lang();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.argumentsDeclarationImpl <em>arguments Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.argumentsDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getargumentsDeclaration()
     * @generated
     */
    EClass ARGUMENTS_DECLARATION = eINSTANCE.getargumentsDeclaration();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTS_DECLARATION__ARGUMENTS = eINSTANCE.getargumentsDeclaration_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.argImpl <em>arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.argImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getarg()
     * @generated
     */
    EClass ARG = eINSTANCE.getarg();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARG__MODIFIER = eINSTANCE.getarg_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG__TYPE = eINSTANCE.getarg_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARG__NAME = eINSTANCE.getarg_Name();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.ProcessingDeclarationImpl <em>Processing Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.ProcessingDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getProcessingDeclaration()
     * @generated
     */
    EClass PROCESSING_DECLARATION = eINSTANCE.getProcessingDeclaration();

    /**
     * The meta object literal for the '<em><b>Local Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESSING_DECLARATION__LOCAL_PARAMETERS = eINSTANCE.getProcessingDeclaration_LocalParameters();

    /**
     * The meta object literal for the '<em><b>Local Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESSING_DECLARATION__LOCAL_EVENTS = eINSTANCE.getProcessingDeclaration_LocalEvents();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESSING_DECLARATION__STATEMENTS = eINSTANCE.getProcessingDeclaration_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.statementImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CALL = eINSTANCE.getstatement_Call();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.localParameterDeclarationImpl <em>local Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.localParameterDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getlocalParameterDeclaration()
     * @generated
     */
    EClass LOCAL_PARAMETER_DECLARATION = eINSTANCE.getlocalParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_PARAMETER_DECLARATION__TYPE = eINSTANCE.getlocalParameterDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_PARAMETER_DECLARATION__NAME = eINSTANCE.getlocalParameterDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Has Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_PARAMETER_DECLARATION__HAS_VALUE = eINSTANCE.getlocalParameterDeclaration_HasValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_PARAMETER_DECLARATION__VALUE = eINSTANCE.getlocalParameterDeclaration_Value();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.localEventDeclarationImpl <em>local Event Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.localEventDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getlocalEventDeclaration()
     * @generated
     */
    EClass LOCAL_EVENT_DECLARATION = eINSTANCE.getlocalEventDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.ifblockImpl <em>ifblock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.ifblockImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getifblock()
     * @generated
     */
    EClass IFBLOCK = eINSTANCE.getifblock();

    /**
     * The meta object literal for the '<em><b>Event Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFBLOCK__EVENT_NAME = eINSTANCE.getifblock_EventName();

    /**
     * The meta object literal for the '<em><b>If Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFBLOCK__IF_BLOCKS = eINSTANCE.getifblock_IfBlocks();

    /**
     * The meta object literal for the '<em><b>Has Else</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IFBLOCK__HAS_ELSE = eINSTANCE.getifblock_HasElse();

    /**
     * The meta object literal for the '<em><b>Else Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFBLOCK__ELSE_BLOCKS = eINSTANCE.getifblock_ElseBlocks();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.whileblockImpl <em>whileblock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.whileblockImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getwhileblock()
     * @generated
     */
    EClass WHILEBLOCK = eINSTANCE.getwhileblock();

    /**
     * The meta object literal for the '<em><b>Event Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILEBLOCK__EVENT_NAME = eINSTANCE.getwhileblock_EventName();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILEBLOCK__BLOCKS = eINSTANCE.getwhileblock_Blocks();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.functionCallImpl <em>function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.functionCallImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getfunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getfunctionCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__NAME = eINSTANCE.getfunctionCall_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getfunctionCall_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.prototypeDeclarationImpl <em>prototype Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.prototypeDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getprototypeDeclaration()
     * @generated
     */
    EClass PROTOTYPE_DECLARATION = eINSTANCE.getprototypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOTYPE_DECLARATION__NAME = eINSTANCE.getprototypeDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOTYPE_DECLARATION__SUPER_TYPE = eINSTANCE.getprototypeDeclaration_SuperType();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOTYPE_DECLARATION__DEFINITIONS = eINSTANCE.getprototypeDeclaration_Definitions();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.architectureElementImpl <em>architecture Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.architectureElementImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getarchitectureElement()
     * @generated
     */
    EClass ARCHITECTURE_ELEMENT = eINSTANCE.getarchitectureElement();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.signalDeclarationImpl <em>signal Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.signalDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getsignalDeclaration()
     * @generated
     */
    EClass SIGNAL_DECLARATION = eINSTANCE.getsignalDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL_DECLARATION__NAME = eINSTANCE.getsignalDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.eventDeclarationImpl <em>event Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.eventDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#geteventDeclaration()
     * @generated
     */
    EClass EVENT_DECLARATION = eINSTANCE.geteventDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DECLARATION__NAME = eINSTANCE.geteventDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DECLARATION__CONDITIONS = eINSTANCE.geteventDeclaration_Conditions();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.eventConditionImpl <em>event Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.eventConditionImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#geteventCondition()
     * @generated
     */
    EClass EVENT_CONDITION = eINSTANCE.geteventCondition();

    /**
     * The meta object literal for the '<em><b>Left Part</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_CONDITION__LEFT_PART = eINSTANCE.geteventCondition_LeftPart();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_CONDITION__COND = eINSTANCE.geteventCondition_Cond();

    /**
     * The meta object literal for the '<em><b>Right Part I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_CONDITION__RIGHT_PART_I = eINSTANCE.geteventCondition_RightPartI();

    /**
     * The meta object literal for the '<em><b>Right Part N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_CONDITION__RIGHT_PART_N = eINSTANCE.geteventCondition_RightPartN();

    /**
     * The meta object literal for the '<em><b>Right Part S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_CONDITION__RIGHT_PART_S = eINSTANCE.geteventCondition_RightPartS();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.parameterDeclarationImpl <em>parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.parameterDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getparameterDeclaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getparameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION__TYPE_NAME = eINSTANCE.getparameterDeclaration_TypeName();

    /**
     * The meta object literal for the '<em><b>Has Nb W</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__HAS_NB_W = eINSTANCE.getparameterDeclaration_HasNbW();

    /**
     * The meta object literal for the '<em><b>Nbw</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__NBW = eINSTANCE.getparameterDeclaration_Nbw();

    /**
     * The meta object literal for the '<em><b>Has Infinite Writer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__HAS_INFINITE_WRITER = eINSTANCE.getparameterDeclaration_HasInfiniteWriter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__NAME = eINSTANCE.getparameterDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Has Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__HAS_VALUE = eINSTANCE.getparameterDeclaration_HasValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__VALUE = eINSTANCE.getparameterDeclaration_Value();

    /**
     * The meta object literal for the '<em><b>Has Config</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__HAS_CONFIG = eINSTANCE.getparameterDeclaration_HasConfig();

    /**
     * The meta object literal for the '<em><b>Has Config With Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__HAS_CONFIG_WITH_DEFAULT_VALUE = eINSTANCE.getparameterDeclaration_HasConfigWithDefaultValue();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.statesetDeclarationImpl <em>stateset Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.statesetDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstatesetDeclaration()
     * @generated
     */
    EClass STATESET_DECLARATION = eINSTANCE.getstatesetDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATESET_DECLARATION__NAME = eINSTANCE.getstatesetDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATESET_DECLARATION__STATES = eINSTANCE.getstatesetDeclaration_States();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATESET_DECLARATION__INIT = eINSTANCE.getstatesetDeclaration_Init();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATESET_DECLARATION__TRANSITIONS = eINSTANCE.getstatesetDeclaration_Transitions();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.stateDeclarationImpl <em>state Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.stateDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getstateDeclaration()
     * @generated
     */
    EClass STATE_DECLARATION = eINSTANCE.getstateDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_DECLARATION__NAME = eINSTANCE.getstateDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.transitionDeclarationImpl <em>transition Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.transitionDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#gettransitionDeclaration()
     * @generated
     */
    EClass TRANSITION_DECLARATION = eINSTANCE.gettransitionDeclaration();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DECLARATION__FROM = eINSTANCE.gettransitionDeclaration_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DECLARATION__TO = eINSTANCE.gettransitionDeclaration_To();

    /**
     * The meta object literal for the '<em><b>Evt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DECLARATION__EVT = eINSTANCE.gettransitionDeclaration_Evt();

    /**
     * The meta object literal for the '<em><b>Raise</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DECLARATION__RAISE = eINSTANCE.gettransitionDeclaration_Raise();

    /**
     * The meta object literal for the '<em><b>Sig</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_DECLARATION__SIG = eINSTANCE.gettransitionDeclaration_Sig();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.instanceDeclarationImpl <em>instance Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.instanceDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getinstanceDeclaration()
     * @generated
     */
    EClass INSTANCE_DECLARATION = eINSTANCE.getinstanceDeclaration();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_DECLARATION__TYPE_NAME = eINSTANCE.getinstanceDeclaration_TypeName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE_DECLARATION__NAME = eINSTANCE.getinstanceDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.interactionDeclarationImpl <em>interaction Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.interactionDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getinteractionDeclaration()
     * @generated
     */
    EClass INTERACTION_DECLARATION = eINSTANCE.getinteractionDeclaration();

    /**
     * The meta object literal for the '<em><b>Wwhen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_DECLARATION__WWHEN = eINSTANCE.getinteractionDeclaration_Wwhen();

    /**
     * The meta object literal for the '<em><b>Stateset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_DECLARATION__STATESET = eINSTANCE.getinteractionDeclaration_Stateset();

    /**
     * The meta object literal for the '<em><b>Wstate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_DECLARATION__WSTATE = eINSTANCE.getinteractionDeclaration_Wstate();

    /**
     * The meta object literal for the '<em><b>Iif</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_DECLARATION__IIF = eINSTANCE.getinteractionDeclaration_Iif();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_DECLARATION__EVENT = eINSTANCE.getinteractionDeclaration_Event();

    /**
     * The meta object literal for the '<em><b>Icalls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_DECLARATION__ICALLS = eINSTANCE.getinteractionDeclaration_Icalls();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.interactionCallImpl <em>interaction Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.interactionCallImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getinteractionCall()
     * @generated
     */
    EClass INTERACTION_CALL = eINSTANCE.getinteractionCall();

    /**
     * The meta object literal for the '<em><b>Fct Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_CALL__FCT_NAME = eINSTANCE.getinteractionCall_FctName();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_CALL__ARGUMENTS = eINSTANCE.getinteractionCall_Arguments();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.fargImpl <em>farg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.fargImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getfarg()
     * @generated
     */
    EClass FARG = eINSTANCE.getfarg();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FARG__VAR_NAME = eINSTANCE.getfarg_VarName();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.referenceDeclarationImpl <em>reference Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.referenceDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getreferenceDeclaration()
     * @generated
     */
    EClass REFERENCE_DECLARATION = eINSTANCE.getreferenceDeclaration();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_DECLARATION__TYPE_NAME = eINSTANCE.getreferenceDeclaration_TypeName();

    /**
     * The meta object literal for the '<em><b>Upway</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_DECLARATION__UPWAY = eINSTANCE.getreferenceDeclaration_Upway();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_DECLARATION__NAME = eINSTANCE.getreferenceDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_DECLARATION__ALIAS = eINSTANCE.getreferenceDeclaration_Alias();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.qualifiedNameImpl <em>qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.qualifiedNameImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getqualifiedName()
     * @generated
     */
    EClass QUALIFIED_NAME = eINSTANCE.getqualifiedName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME__NAME = eINSTANCE.getqualifiedName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.athenaDSL.impl.wrapperDeclarationImpl <em>wrapper Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.athenaDSL.impl.wrapperDeclarationImpl
     * @see org.xtext.athenaDSL.impl.AthenaDSLPackageImpl#getwrapperDeclaration()
     * @generated
     */
    EClass WRAPPER_DECLARATION = eINSTANCE.getwrapperDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRAPPER_DECLARATION__NAME = eINSTANCE.getwrapperDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRAPPER_DECLARATION__LINK = eINSTANCE.getwrapperDeclaration_Link();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRAPPER_DECLARATION__FUNCTIONS = eINSTANCE.getwrapperDeclaration_Functions();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRAPPER_DECLARATION__OBJECTS = eINSTANCE.getwrapperDeclaration_Objects();

    /**
     * The meta object literal for the '<em><b>Libraries</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRAPPER_DECLARATION__LIBRARIES = eINSTANCE.getwrapperDeclaration_Libraries();

    /**
     * The meta object literal for the '<em><b>Tests</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRAPPER_DECLARATION__TESTS = eINSTANCE.getwrapperDeclaration_Tests();

  }

} //AthenaDSLPackage
