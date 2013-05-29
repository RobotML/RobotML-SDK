/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.athenaDSL.AthenaDSLFactory;
import org.xtext.athenaDSL.AthenaDSLPackage;
import org.xtext.athenaDSL.DataType;
import org.xtext.athenaDSL.FuncProc;
import org.xtext.athenaDSL.Import;
import org.xtext.athenaDSL.LanguageDeclaration;
import org.xtext.athenaDSL.ProcessingDeclaration;
import org.xtext.athenaDSL.Project;
import org.xtext.athenaDSL.architectureElement;
import org.xtext.athenaDSL.arg;
import org.xtext.athenaDSL.argumentsDeclaration;
import org.xtext.athenaDSL.arrayType;
import org.xtext.athenaDSL.basicType;
import org.xtext.athenaDSL.defineType;
import org.xtext.athenaDSL.eventCondition;
import org.xtext.athenaDSL.eventDeclaration;
import org.xtext.athenaDSL.farg;
import org.xtext.athenaDSL.functionCall;
import org.xtext.athenaDSL.functionDeclaration;
import org.xtext.athenaDSL.ifblock;
import org.xtext.athenaDSL.includeDecl;
import org.xtext.athenaDSL.index;
import org.xtext.athenaDSL.instanceDeclaration;
import org.xtext.athenaDSL.interactionCall;
import org.xtext.athenaDSL.interactionDeclaration;
import org.xtext.athenaDSL.languageDecl;
import org.xtext.athenaDSL.lexicalCastDecl;
import org.xtext.athenaDSL.localEventDeclaration;
import org.xtext.athenaDSL.localParameterDeclaration;
import org.xtext.athenaDSL.mapType;
import org.xtext.athenaDSL.parameterDeclaration;
import org.xtext.athenaDSL.prototypeDeclaration;
import org.xtext.athenaDSL.qualifiedName;
import org.xtext.athenaDSL.referenceDeclaration;
import org.xtext.athenaDSL.signalDeclaration;
import org.xtext.athenaDSL.stateDeclaration;
import org.xtext.athenaDSL.statement;
import org.xtext.athenaDSL.statesetDeclaration;
import org.xtext.athenaDSL.structElement;
import org.xtext.athenaDSL.structType;
import org.xtext.athenaDSL.transitionDeclaration;
import org.xtext.athenaDSL.unionType;
import org.xtext.athenaDSL.validityFunctionDeclaration;
import org.xtext.athenaDSL.vectorType;
import org.xtext.athenaDSL.whileblock;
import org.xtext.athenaDSL.wrapperDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AthenaDSLPackageImpl extends EPackageImpl implements AthenaDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defineTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validityFunctionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lexicalCastDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vectorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass funcProcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentsDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processingDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localParameterDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localEventDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifblockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileblockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prototypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architectureElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statesetDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fargEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wrapperDeclarationEClass = null;

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
   * @see org.xtext.athenaDSL.AthenaDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AthenaDSLPackageImpl()
  {
    super(eNS_URI, AthenaDSLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AthenaDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AthenaDSLPackage init()
  {
    if (isInited) return (AthenaDSLPackage)EPackage.Registry.INSTANCE.getEPackage(AthenaDSLPackage.eNS_URI);

    // Obtain or create and register package
    AthenaDSLPackageImpl theAthenaDSLPackage = (AthenaDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AthenaDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AthenaDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAthenaDSLPackage.createPackageContents();

    // Initialize created meta-data
    theAthenaDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAthenaDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AthenaDSLPackage.eNS_URI, theAthenaDSLPackage);
    return theAthenaDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProject()
  {
    return projectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Imports()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Languages()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Types()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Validities()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Functions()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Processings()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Prototypes()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Wrappers()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLanguageDeclaration()
  {
    return languageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLanguageDeclaration_Name()
  {
    return (EAttribute)languageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_Name()
  {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdefineType()
  {
    return defineTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdefineType_Typename()
  {
    return (EReference)defineTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvalidityFunctionDeclaration()
  {
    return validityFunctionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvalidityFunctionDeclaration_Typename()
  {
    return (EReference)validityFunctionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvalidityFunctionDeclaration_FctName()
  {
    return (EAttribute)validityFunctionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbasicType()
  {
    return basicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasicType_Includes()
  {
    return (EReference)basicTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasicType_Languages()
  {
    return (EReference)basicTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbasicType_Casts()
  {
    return (EReference)basicTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getincludeDecl()
  {
    return includeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getincludeDecl_Lang()
  {
    return (EReference)includeDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getincludeDecl_IncludeName()
  {
    return (EAttribute)includeDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlanguageDecl()
  {
    return languageDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlanguageDecl_Lang()
  {
    return (EReference)languageDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlanguageDecl_Trans()
  {
    return (EAttribute)languageDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlanguageDecl_Value()
  {
    return (EAttribute)languageDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlexicalCastDecl()
  {
    return lexicalCastDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlexicalCastDecl_Lang()
  {
    return (EReference)lexicalCastDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlexicalCastDecl_Cast()
  {
    return (EAttribute)lexicalCastDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarrayType()
  {
    return arrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarrayType_Typename()
  {
    return (EReference)arrayTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarrayType_Indices()
  {
    return (EReference)arrayTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvectorType()
  {
    return vectorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvectorType_Typename()
  {
    return (EReference)vectorTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmapType()
  {
    return mapTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmapType_Keytype()
  {
    return (EReference)mapTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmapType_Valtype()
  {
    return (EReference)mapTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstructType()
  {
    return structTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructType_Indices()
  {
    return (EReference)structTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructType_Parameters()
  {
    return (EReference)structTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstructElement()
  {
    return structElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructElement_Typename()
  {
    return (EReference)structElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructElement_Indices()
  {
    return (EReference)structElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstructElement_Name()
  {
    return (EAttribute)structElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstructElement_HasInitValue()
  {
    return (EAttribute)structElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstructElement_InitValue()
  {
    return (EAttribute)structElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getindex()
  {
    return indexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getindex_Dim()
  {
    return (EAttribute)indexEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getindex_HasValue()
  {
    return (EAttribute)indexEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getindex_Value()
  {
    return (EAttribute)indexEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunionType()
  {
    return unionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunionType_Elements()
  {
    return (EReference)unionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuncProc()
  {
    return funcProcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFuncProc_Name()
  {
    return (EAttribute)funcProcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFuncProc_Args()
  {
    return (EReference)funcProcEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunctionDeclaration()
  {
    return functionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionDeclaration_Lang()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getargumentsDeclaration()
  {
    return argumentsDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getargumentsDeclaration_Arguments()
  {
    return (EReference)argumentsDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarg()
  {
    return argEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getarg_Modifier()
  {
    return (EAttribute)argEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getarg_Type()
  {
    return (EReference)argEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getarg_Name()
  {
    return (EAttribute)argEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessingDeclaration()
  {
    return processingDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessingDeclaration_LocalParameters()
  {
    return (EReference)processingDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessingDeclaration_LocalEvents()
  {
    return (EReference)processingDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcessingDeclaration_Statements()
  {
    return (EReference)processingDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatement_Call()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlocalParameterDeclaration()
  {
    return localParameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlocalParameterDeclaration_Type()
  {
    return (EReference)localParameterDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlocalParameterDeclaration_Name()
  {
    return (EAttribute)localParameterDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlocalParameterDeclaration_HasValue()
  {
    return (EAttribute)localParameterDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlocalParameterDeclaration_Value()
  {
    return (EAttribute)localParameterDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlocalEventDeclaration()
  {
    return localEventDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getifblock()
  {
    return ifblockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getifblock_EventName()
  {
    return (EReference)ifblockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getifblock_IfBlocks()
  {
    return (EReference)ifblockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getifblock_HasElse()
  {
    return (EAttribute)ifblockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getifblock_ElseBlocks()
  {
    return (EReference)ifblockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwhileblock()
  {
    return whileblockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhileblock_EventName()
  {
    return (EReference)whileblockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhileblock_Blocks()
  {
    return (EReference)whileblockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunctionCall()
  {
    return functionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionCall_Name()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunctionCall_Arguments()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprototypeDeclaration()
  {
    return prototypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getprototypeDeclaration_Name()
  {
    return (EAttribute)prototypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprototypeDeclaration_SuperType()
  {
    return (EReference)prototypeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getprototypeDeclaration_Definitions()
  {
    return (EReference)prototypeDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getarchitectureElement()
  {
    return architectureElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsignalDeclaration()
  {
    return signalDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsignalDeclaration_Name()
  {
    return (EAttribute)signalDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass geteventDeclaration()
  {
    return eventDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geteventDeclaration_Name()
  {
    return (EAttribute)eventDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference geteventDeclaration_Conditions()
  {
    return (EReference)eventDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass geteventCondition()
  {
    return eventConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geteventCondition_LeftPart()
  {
    return (EAttribute)eventConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geteventCondition_Cond()
  {
    return (EAttribute)eventConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geteventCondition_RightPartI()
  {
    return (EAttribute)eventConditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geteventCondition_RightPartN()
  {
    return (EAttribute)eventConditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute geteventCondition_RightPartS()
  {
    return (EAttribute)eventConditionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparameterDeclaration()
  {
    return parameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparameterDeclaration_TypeName()
  {
    return (EReference)parameterDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameterDeclaration_HasNbW()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameterDeclaration_Nbw()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameterDeclaration_HasInfiniteWriter()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameterDeclaration_Name()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameterDeclaration_HasValue()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameterDeclaration_Value()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameterDeclaration_HasConfig()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getparameterDeclaration_HasConfigWithDefaultValue()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstatesetDeclaration()
  {
    return statesetDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstatesetDeclaration_Name()
  {
    return (EAttribute)statesetDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatesetDeclaration_States()
  {
    return (EReference)statesetDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatesetDeclaration_Init()
  {
    return (EReference)statesetDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstatesetDeclaration_Transitions()
  {
    return (EReference)statesetDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstateDeclaration()
  {
    return stateDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstateDeclaration_Name()
  {
    return (EAttribute)stateDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettransitionDeclaration()
  {
    return transitionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettransitionDeclaration_From()
  {
    return (EAttribute)transitionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettransitionDeclaration_To()
  {
    return (EAttribute)transitionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettransitionDeclaration_Evt()
  {
    return (EAttribute)transitionDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettransitionDeclaration_Raise()
  {
    return (EAttribute)transitionDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettransitionDeclaration_Sig()
  {
    return (EAttribute)transitionDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinstanceDeclaration()
  {
    return instanceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinstanceDeclaration_TypeName()
  {
    return (EReference)instanceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinstanceDeclaration_Name()
  {
    return (EAttribute)instanceDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinteractionDeclaration()
  {
    return interactionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinteractionDeclaration_Wwhen()
  {
    return (EAttribute)interactionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinteractionDeclaration_Stateset()
  {
    return (EAttribute)interactionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinteractionDeclaration_Wstate()
  {
    return (EAttribute)interactionDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinteractionDeclaration_Iif()
  {
    return (EAttribute)interactionDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinteractionDeclaration_Event()
  {
    return (EAttribute)interactionDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinteractionDeclaration_Icalls()
  {
    return (EReference)interactionDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinteractionCall()
  {
    return interactionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinteractionCall_FctName()
  {
    return (EReference)interactionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinteractionCall_Arguments()
  {
    return (EReference)interactionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfarg()
  {
    return fargEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfarg_VarName()
  {
    return (EAttribute)fargEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getreferenceDeclaration()
  {
    return referenceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getreferenceDeclaration_TypeName()
  {
    return (EReference)referenceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getreferenceDeclaration_Upway()
  {
    return (EAttribute)referenceDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getreferenceDeclaration_Name()
  {
    return (EReference)referenceDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getreferenceDeclaration_Alias()
  {
    return (EAttribute)referenceDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getqualifiedName()
  {
    return qualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getqualifiedName_Name()
  {
    return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwrapperDeclaration()
  {
    return wrapperDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwrapperDeclaration_Name()
  {
    return (EAttribute)wrapperDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwrapperDeclaration_Link()
  {
    return (EAttribute)wrapperDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwrapperDeclaration_Functions()
  {
    return (EAttribute)wrapperDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwrapperDeclaration_Objects()
  {
    return (EAttribute)wrapperDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwrapperDeclaration_Libraries()
  {
    return (EAttribute)wrapperDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getwrapperDeclaration_Tests()
  {
    return (EAttribute)wrapperDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AthenaDSLFactory getAthenaDSLFactory()
  {
    return (AthenaDSLFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    projectEClass = createEClass(PROJECT);
    createEReference(projectEClass, PROJECT__IMPORTS);
    createEReference(projectEClass, PROJECT__LANGUAGES);
    createEReference(projectEClass, PROJECT__TYPES);
    createEReference(projectEClass, PROJECT__VALIDITIES);
    createEReference(projectEClass, PROJECT__FUNCTIONS);
    createEReference(projectEClass, PROJECT__PROCESSINGS);
    createEReference(projectEClass, PROJECT__PROTOTYPES);
    createEReference(projectEClass, PROJECT__WRAPPERS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    languageDeclarationEClass = createEClass(LANGUAGE_DECLARATION);
    createEAttribute(languageDeclarationEClass, LANGUAGE_DECLARATION__NAME);

    dataTypeEClass = createEClass(DATA_TYPE);
    createEAttribute(dataTypeEClass, DATA_TYPE__NAME);

    defineTypeEClass = createEClass(DEFINE_TYPE);
    createEReference(defineTypeEClass, DEFINE_TYPE__TYPENAME);

    validityFunctionDeclarationEClass = createEClass(VALIDITY_FUNCTION_DECLARATION);
    createEReference(validityFunctionDeclarationEClass, VALIDITY_FUNCTION_DECLARATION__TYPENAME);
    createEAttribute(validityFunctionDeclarationEClass, VALIDITY_FUNCTION_DECLARATION__FCT_NAME);

    basicTypeEClass = createEClass(BASIC_TYPE);
    createEReference(basicTypeEClass, BASIC_TYPE__INCLUDES);
    createEReference(basicTypeEClass, BASIC_TYPE__LANGUAGES);
    createEReference(basicTypeEClass, BASIC_TYPE__CASTS);

    includeDeclEClass = createEClass(INCLUDE_DECL);
    createEReference(includeDeclEClass, INCLUDE_DECL__LANG);
    createEAttribute(includeDeclEClass, INCLUDE_DECL__INCLUDE_NAME);

    languageDeclEClass = createEClass(LANGUAGE_DECL);
    createEReference(languageDeclEClass, LANGUAGE_DECL__LANG);
    createEAttribute(languageDeclEClass, LANGUAGE_DECL__TRANS);
    createEAttribute(languageDeclEClass, LANGUAGE_DECL__VALUE);

    lexicalCastDeclEClass = createEClass(LEXICAL_CAST_DECL);
    createEReference(lexicalCastDeclEClass, LEXICAL_CAST_DECL__LANG);
    createEAttribute(lexicalCastDeclEClass, LEXICAL_CAST_DECL__CAST);

    arrayTypeEClass = createEClass(ARRAY_TYPE);
    createEReference(arrayTypeEClass, ARRAY_TYPE__TYPENAME);
    createEReference(arrayTypeEClass, ARRAY_TYPE__INDICES);

    vectorTypeEClass = createEClass(VECTOR_TYPE);
    createEReference(vectorTypeEClass, VECTOR_TYPE__TYPENAME);

    mapTypeEClass = createEClass(MAP_TYPE);
    createEReference(mapTypeEClass, MAP_TYPE__KEYTYPE);
    createEReference(mapTypeEClass, MAP_TYPE__VALTYPE);

    structTypeEClass = createEClass(STRUCT_TYPE);
    createEReference(structTypeEClass, STRUCT_TYPE__INDICES);
    createEReference(structTypeEClass, STRUCT_TYPE__PARAMETERS);

    structElementEClass = createEClass(STRUCT_ELEMENT);
    createEReference(structElementEClass, STRUCT_ELEMENT__TYPENAME);
    createEReference(structElementEClass, STRUCT_ELEMENT__INDICES);
    createEAttribute(structElementEClass, STRUCT_ELEMENT__NAME);
    createEAttribute(structElementEClass, STRUCT_ELEMENT__HAS_INIT_VALUE);
    createEAttribute(structElementEClass, STRUCT_ELEMENT__INIT_VALUE);

    indexEClass = createEClass(INDEX);
    createEAttribute(indexEClass, INDEX__DIM);
    createEAttribute(indexEClass, INDEX__HAS_VALUE);
    createEAttribute(indexEClass, INDEX__VALUE);

    unionTypeEClass = createEClass(UNION_TYPE);
    createEReference(unionTypeEClass, UNION_TYPE__ELEMENTS);

    funcProcEClass = createEClass(FUNC_PROC);
    createEAttribute(funcProcEClass, FUNC_PROC__NAME);
    createEReference(funcProcEClass, FUNC_PROC__ARGS);

    functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__LANG);

    argumentsDeclarationEClass = createEClass(ARGUMENTS_DECLARATION);
    createEReference(argumentsDeclarationEClass, ARGUMENTS_DECLARATION__ARGUMENTS);

    argEClass = createEClass(ARG);
    createEAttribute(argEClass, ARG__MODIFIER);
    createEReference(argEClass, ARG__TYPE);
    createEAttribute(argEClass, ARG__NAME);

    processingDeclarationEClass = createEClass(PROCESSING_DECLARATION);
    createEReference(processingDeclarationEClass, PROCESSING_DECLARATION__LOCAL_PARAMETERS);
    createEReference(processingDeclarationEClass, PROCESSING_DECLARATION__LOCAL_EVENTS);
    createEReference(processingDeclarationEClass, PROCESSING_DECLARATION__STATEMENTS);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__CALL);

    localParameterDeclarationEClass = createEClass(LOCAL_PARAMETER_DECLARATION);
    createEReference(localParameterDeclarationEClass, LOCAL_PARAMETER_DECLARATION__TYPE);
    createEAttribute(localParameterDeclarationEClass, LOCAL_PARAMETER_DECLARATION__NAME);
    createEAttribute(localParameterDeclarationEClass, LOCAL_PARAMETER_DECLARATION__HAS_VALUE);
    createEAttribute(localParameterDeclarationEClass, LOCAL_PARAMETER_DECLARATION__VALUE);

    localEventDeclarationEClass = createEClass(LOCAL_EVENT_DECLARATION);

    ifblockEClass = createEClass(IFBLOCK);
    createEReference(ifblockEClass, IFBLOCK__EVENT_NAME);
    createEReference(ifblockEClass, IFBLOCK__IF_BLOCKS);
    createEAttribute(ifblockEClass, IFBLOCK__HAS_ELSE);
    createEReference(ifblockEClass, IFBLOCK__ELSE_BLOCKS);

    whileblockEClass = createEClass(WHILEBLOCK);
    createEReference(whileblockEClass, WHILEBLOCK__EVENT_NAME);
    createEReference(whileblockEClass, WHILEBLOCK__BLOCKS);

    functionCallEClass = createEClass(FUNCTION_CALL);
    createEReference(functionCallEClass, FUNCTION_CALL__NAME);
    createEReference(functionCallEClass, FUNCTION_CALL__ARGUMENTS);

    prototypeDeclarationEClass = createEClass(PROTOTYPE_DECLARATION);
    createEAttribute(prototypeDeclarationEClass, PROTOTYPE_DECLARATION__NAME);
    createEReference(prototypeDeclarationEClass, PROTOTYPE_DECLARATION__SUPER_TYPE);
    createEReference(prototypeDeclarationEClass, PROTOTYPE_DECLARATION__DEFINITIONS);

    architectureElementEClass = createEClass(ARCHITECTURE_ELEMENT);

    signalDeclarationEClass = createEClass(SIGNAL_DECLARATION);
    createEAttribute(signalDeclarationEClass, SIGNAL_DECLARATION__NAME);

    eventDeclarationEClass = createEClass(EVENT_DECLARATION);
    createEAttribute(eventDeclarationEClass, EVENT_DECLARATION__NAME);
    createEReference(eventDeclarationEClass, EVENT_DECLARATION__CONDITIONS);

    eventConditionEClass = createEClass(EVENT_CONDITION);
    createEAttribute(eventConditionEClass, EVENT_CONDITION__LEFT_PART);
    createEAttribute(eventConditionEClass, EVENT_CONDITION__COND);
    createEAttribute(eventConditionEClass, EVENT_CONDITION__RIGHT_PART_I);
    createEAttribute(eventConditionEClass, EVENT_CONDITION__RIGHT_PART_N);
    createEAttribute(eventConditionEClass, EVENT_CONDITION__RIGHT_PART_S);

    parameterDeclarationEClass = createEClass(PARAMETER_DECLARATION);
    createEReference(parameterDeclarationEClass, PARAMETER_DECLARATION__TYPE_NAME);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__HAS_NB_W);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__NBW);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__HAS_INFINITE_WRITER);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__NAME);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__HAS_VALUE);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__VALUE);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__HAS_CONFIG);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__HAS_CONFIG_WITH_DEFAULT_VALUE);

    statesetDeclarationEClass = createEClass(STATESET_DECLARATION);
    createEAttribute(statesetDeclarationEClass, STATESET_DECLARATION__NAME);
    createEReference(statesetDeclarationEClass, STATESET_DECLARATION__STATES);
    createEReference(statesetDeclarationEClass, STATESET_DECLARATION__INIT);
    createEReference(statesetDeclarationEClass, STATESET_DECLARATION__TRANSITIONS);

    stateDeclarationEClass = createEClass(STATE_DECLARATION);
    createEAttribute(stateDeclarationEClass, STATE_DECLARATION__NAME);

    transitionDeclarationEClass = createEClass(TRANSITION_DECLARATION);
    createEAttribute(transitionDeclarationEClass, TRANSITION_DECLARATION__FROM);
    createEAttribute(transitionDeclarationEClass, TRANSITION_DECLARATION__TO);
    createEAttribute(transitionDeclarationEClass, TRANSITION_DECLARATION__EVT);
    createEAttribute(transitionDeclarationEClass, TRANSITION_DECLARATION__RAISE);
    createEAttribute(transitionDeclarationEClass, TRANSITION_DECLARATION__SIG);

    instanceDeclarationEClass = createEClass(INSTANCE_DECLARATION);
    createEReference(instanceDeclarationEClass, INSTANCE_DECLARATION__TYPE_NAME);
    createEAttribute(instanceDeclarationEClass, INSTANCE_DECLARATION__NAME);

    interactionDeclarationEClass = createEClass(INTERACTION_DECLARATION);
    createEAttribute(interactionDeclarationEClass, INTERACTION_DECLARATION__WWHEN);
    createEAttribute(interactionDeclarationEClass, INTERACTION_DECLARATION__STATESET);
    createEAttribute(interactionDeclarationEClass, INTERACTION_DECLARATION__WSTATE);
    createEAttribute(interactionDeclarationEClass, INTERACTION_DECLARATION__IIF);
    createEAttribute(interactionDeclarationEClass, INTERACTION_DECLARATION__EVENT);
    createEReference(interactionDeclarationEClass, INTERACTION_DECLARATION__ICALLS);

    interactionCallEClass = createEClass(INTERACTION_CALL);
    createEReference(interactionCallEClass, INTERACTION_CALL__FCT_NAME);
    createEReference(interactionCallEClass, INTERACTION_CALL__ARGUMENTS);

    fargEClass = createEClass(FARG);
    createEAttribute(fargEClass, FARG__VAR_NAME);

    referenceDeclarationEClass = createEClass(REFERENCE_DECLARATION);
    createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__TYPE_NAME);
    createEAttribute(referenceDeclarationEClass, REFERENCE_DECLARATION__UPWAY);
    createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__NAME);
    createEAttribute(referenceDeclarationEClass, REFERENCE_DECLARATION__ALIAS);

    qualifiedNameEClass = createEClass(QUALIFIED_NAME);
    createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__NAME);

    wrapperDeclarationEClass = createEClass(WRAPPER_DECLARATION);
    createEAttribute(wrapperDeclarationEClass, WRAPPER_DECLARATION__NAME);
    createEAttribute(wrapperDeclarationEClass, WRAPPER_DECLARATION__LINK);
    createEAttribute(wrapperDeclarationEClass, WRAPPER_DECLARATION__FUNCTIONS);
    createEAttribute(wrapperDeclarationEClass, WRAPPER_DECLARATION__OBJECTS);
    createEAttribute(wrapperDeclarationEClass, WRAPPER_DECLARATION__LIBRARIES);
    createEAttribute(wrapperDeclarationEClass, WRAPPER_DECLARATION__TESTS);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    defineTypeEClass.getESuperTypes().add(this.getDataType());
    basicTypeEClass.getESuperTypes().add(this.getDataType());
    arrayTypeEClass.getESuperTypes().add(this.getDataType());
    vectorTypeEClass.getESuperTypes().add(this.getDataType());
    mapTypeEClass.getESuperTypes().add(this.getDataType());
    structTypeEClass.getESuperTypes().add(this.getDataType());
    unionTypeEClass.getESuperTypes().add(this.getDataType());
    functionDeclarationEClass.getESuperTypes().add(this.getFuncProc());
    processingDeclarationEClass.getESuperTypes().add(this.getFuncProc());
    signalDeclarationEClass.getESuperTypes().add(this.getarchitectureElement());
    eventDeclarationEClass.getESuperTypes().add(this.getlocalEventDeclaration());
    eventDeclarationEClass.getESuperTypes().add(this.getarchitectureElement());
    parameterDeclarationEClass.getESuperTypes().add(this.getarchitectureElement());
    statesetDeclarationEClass.getESuperTypes().add(this.getarchitectureElement());
    instanceDeclarationEClass.getESuperTypes().add(this.getarchitectureElement());
    interactionDeclarationEClass.getESuperTypes().add(this.getarchitectureElement());
    referenceDeclarationEClass.getESuperTypes().add(this.getarchitectureElement());

    // Initialize classes and features; add operations and parameters
    initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProject_Imports(), this.getImport(), null, "imports", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Languages(), this.getLanguageDeclaration(), null, "languages", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Types(), this.getDataType(), null, "types", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Validities(), this.getvalidityFunctionDeclaration(), null, "validities", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Functions(), this.getfunctionDeclaration(), null, "functions", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Processings(), this.getProcessingDeclaration(), null, "processings", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Prototypes(), this.getprototypeDeclaration(), null, "prototypes", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Wrappers(), this.getwrapperDeclaration(), null, "wrappers", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageDeclarationEClass, LanguageDeclaration.class, "LanguageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, LanguageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defineTypeEClass, defineType.class, "defineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdefineType_Typename(), this.getDataType(), null, "typename", null, 0, 1, defineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validityFunctionDeclarationEClass, validityFunctionDeclaration.class, "validityFunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvalidityFunctionDeclaration_Typename(), this.getDataType(), null, "typename", null, 0, 1, validityFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvalidityFunctionDeclaration_FctName(), ecorePackage.getEString(), "fctName", null, 0, 1, validityFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicTypeEClass, basicType.class, "basicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbasicType_Includes(), this.getincludeDecl(), null, "includes", null, 0, -1, basicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasicType_Languages(), this.getlanguageDecl(), null, "languages", null, 0, -1, basicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbasicType_Casts(), this.getlexicalCastDecl(), null, "casts", null, 0, -1, basicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeDeclEClass, includeDecl.class, "includeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getincludeDecl_Lang(), this.getLanguageDeclaration(), null, "lang", null, 0, 1, includeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getincludeDecl_IncludeName(), ecorePackage.getEString(), "includeName", null, 0, 1, includeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageDeclEClass, languageDecl.class, "languageDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlanguageDecl_Lang(), this.getLanguageDeclaration(), null, "lang", null, 0, 1, languageDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlanguageDecl_Trans(), ecorePackage.getEString(), "trans", null, 0, 1, languageDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlanguageDecl_Value(), ecorePackage.getEString(), "value", null, 0, 1, languageDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lexicalCastDeclEClass, lexicalCastDecl.class, "lexicalCastDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlexicalCastDecl_Lang(), this.getLanguageDeclaration(), null, "lang", null, 0, 1, lexicalCastDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlexicalCastDecl_Cast(), ecorePackage.getEString(), "cast", null, 0, 1, lexicalCastDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeEClass, arrayType.class, "arrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getarrayType_Typename(), this.getDataType(), null, "typename", null, 0, 1, arrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getarrayType_Indices(), this.getindex(), null, "indices", null, 0, -1, arrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vectorTypeEClass, vectorType.class, "vectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvectorType_Typename(), this.getDataType(), null, "typename", null, 0, 1, vectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapTypeEClass, mapType.class, "mapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmapType_Keytype(), this.getDataType(), null, "keytype", null, 0, 1, mapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmapType_Valtype(), this.getDataType(), null, "valtype", null, 0, 1, mapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structTypeEClass, structType.class, "structType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstructType_Indices(), this.getindex(), null, "indices", null, 0, -1, structType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructType_Parameters(), this.getstructElement(), null, "parameters", null, 0, -1, structType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structElementEClass, structElement.class, "structElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstructElement_Typename(), this.getDataType(), null, "typename", null, 0, 1, structElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructElement_Indices(), this.getindex(), null, "indices", null, 0, -1, structElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getstructElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, structElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getstructElement_HasInitValue(), ecorePackage.getEBoolean(), "hasInitValue", null, 0, 1, structElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getstructElement_InitValue(), ecorePackage.getEString(), "initValue", null, 0, 1, structElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexEClass, index.class, "index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getindex_Dim(), ecorePackage.getEString(), "dim", null, 0, 1, index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getindex_HasValue(), ecorePackage.getEBoolean(), "hasValue", null, 0, 1, index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getindex_Value(), ecorePackage.getEInt(), "value", null, 0, 1, index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unionTypeEClass, unionType.class, "unionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunionType_Elements(), this.getDataType(), null, "elements", null, 0, -1, unionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(funcProcEClass, FuncProc.class, "FuncProc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFuncProc_Name(), ecorePackage.getEString(), "name", null, 0, 1, FuncProc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFuncProc_Args(), this.getargumentsDeclaration(), null, "args", null, 0, 1, FuncProc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDeclarationEClass, functionDeclaration.class, "functionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunctionDeclaration_Lang(), this.getLanguageDeclaration(), null, "lang", null, 0, 1, functionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentsDeclarationEClass, argumentsDeclaration.class, "argumentsDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getargumentsDeclaration_Arguments(), this.getarg(), null, "arguments", null, 0, -1, argumentsDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argEClass, arg.class, "arg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getarg_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getarg_Type(), this.getDataType(), null, "type", null, 0, 1, arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getarg_Name(), ecorePackage.getEString(), "name", null, 0, 1, arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processingDeclarationEClass, ProcessingDeclaration.class, "ProcessingDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcessingDeclaration_LocalParameters(), this.getlocalParameterDeclaration(), null, "localParameters", null, 0, -1, ProcessingDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessingDeclaration_LocalEvents(), this.getlocalEventDeclaration(), null, "localEvents", null, 0, -1, ProcessingDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcessingDeclaration_Statements(), this.getstatement(), null, "statements", null, 0, -1, ProcessingDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, statement.class, "statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstatement_Call(), ecorePackage.getEObject(), null, "call", null, 0, 1, statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localParameterDeclarationEClass, localParameterDeclaration.class, "localParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlocalParameterDeclaration_Type(), this.getDataType(), null, "type", null, 0, 1, localParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlocalParameterDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, localParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlocalParameterDeclaration_HasValue(), ecorePackage.getEBoolean(), "hasValue", null, 0, 1, localParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlocalParameterDeclaration_Value(), ecorePackage.getEString(), "value", null, 0, 1, localParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localEventDeclarationEClass, localEventDeclaration.class, "localEventDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ifblockEClass, ifblock.class, "ifblock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getifblock_EventName(), this.getlocalEventDeclaration(), null, "eventName", null, 0, 1, ifblock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getifblock_IfBlocks(), this.getstatement(), null, "ifBlocks", null, 0, -1, ifblock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getifblock_HasElse(), ecorePackage.getEBoolean(), "hasElse", null, 0, 1, ifblock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getifblock_ElseBlocks(), this.getstatement(), null, "elseBlocks", null, 0, -1, ifblock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileblockEClass, whileblock.class, "whileblock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwhileblock_EventName(), this.getlocalEventDeclaration(), null, "eventName", null, 0, 1, whileblock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwhileblock_Blocks(), this.getstatement(), null, "blocks", null, 0, -1, whileblock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionCallEClass, functionCall.class, "functionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunctionCall_Name(), this.getFuncProc(), null, "name", null, 0, 1, functionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfunctionCall_Arguments(), this.getfarg(), null, "arguments", null, 0, -1, functionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prototypeDeclarationEClass, prototypeDeclaration.class, "prototypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getprototypeDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, prototypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprototypeDeclaration_SuperType(), this.getprototypeDeclaration(), null, "superType", null, 0, 1, prototypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getprototypeDeclaration_Definitions(), this.getarchitectureElement(), null, "definitions", null, 0, -1, prototypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(architectureElementEClass, architectureElement.class, "architectureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signalDeclarationEClass, signalDeclaration.class, "signalDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsignalDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, signalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventDeclarationEClass, eventDeclaration.class, "eventDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(geteventDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, eventDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(geteventDeclaration_Conditions(), this.geteventCondition(), null, "conditions", null, 0, -1, eventDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventConditionEClass, eventCondition.class, "eventCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(geteventCondition_LeftPart(), ecorePackage.getEString(), "leftPart", null, 0, 1, eventCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(geteventCondition_Cond(), ecorePackage.getEString(), "cond", null, 0, 1, eventCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(geteventCondition_RightPartI(), ecorePackage.getEString(), "rightPartI", null, 0, 1, eventCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(geteventCondition_RightPartN(), ecorePackage.getEInt(), "rightPartN", null, 0, 1, eventCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(geteventCondition_RightPartS(), ecorePackage.getEString(), "rightPartS", null, 0, 1, eventCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDeclarationEClass, parameterDeclaration.class, "parameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparameterDeclaration_TypeName(), this.getDataType(), null, "typeName", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameterDeclaration_HasNbW(), ecorePackage.getEBoolean(), "hasNbW", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameterDeclaration_Nbw(), ecorePackage.getEInt(), "nbw", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameterDeclaration_HasInfiniteWriter(), ecorePackage.getEBoolean(), "hasInfiniteWriter", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameterDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameterDeclaration_HasValue(), ecorePackage.getEBoolean(), "hasValue", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameterDeclaration_Value(), ecorePackage.getEString(), "value", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameterDeclaration_HasConfig(), ecorePackage.getEBoolean(), "hasConfig", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getparameterDeclaration_HasConfigWithDefaultValue(), ecorePackage.getEBoolean(), "hasConfigWithDefaultValue", null, 0, 1, parameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statesetDeclarationEClass, statesetDeclaration.class, "statesetDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstatesetDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, statesetDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatesetDeclaration_States(), this.getstateDeclaration(), null, "states", null, 0, -1, statesetDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatesetDeclaration_Init(), this.getstateDeclaration(), null, "init", null, 0, 1, statesetDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstatesetDeclaration_Transitions(), this.gettransitionDeclaration(), null, "transitions", null, 0, -1, statesetDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDeclarationEClass, stateDeclaration.class, "stateDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstateDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, stateDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionDeclarationEClass, transitionDeclaration.class, "transitionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettransitionDeclaration_From(), ecorePackage.getEString(), "from", null, 0, 1, transitionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettransitionDeclaration_To(), ecorePackage.getEString(), "to", null, 0, 1, transitionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettransitionDeclaration_Evt(), ecorePackage.getEString(), "evt", null, 0, 1, transitionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettransitionDeclaration_Raise(), ecorePackage.getEBoolean(), "raise", null, 0, 1, transitionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(gettransitionDeclaration_Sig(), ecorePackage.getEString(), "sig", null, 0, 1, transitionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceDeclarationEClass, instanceDeclaration.class, "instanceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinstanceDeclaration_TypeName(), this.getprototypeDeclaration(), null, "typeName", null, 0, 1, instanceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinstanceDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, instanceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionDeclarationEClass, interactionDeclaration.class, "interactionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinteractionDeclaration_Wwhen(), ecorePackage.getEBoolean(), "wwhen", null, 0, 1, interactionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinteractionDeclaration_Stateset(), ecorePackage.getEString(), "stateset", null, 0, 1, interactionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinteractionDeclaration_Wstate(), ecorePackage.getEString(), "wstate", null, 0, 1, interactionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinteractionDeclaration_Iif(), ecorePackage.getEBoolean(), "iif", null, 0, 1, interactionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinteractionDeclaration_Event(), ecorePackage.getEString(), "event", null, 0, 1, interactionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinteractionDeclaration_Icalls(), this.getinteractionCall(), null, "icalls", null, 0, -1, interactionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionCallEClass, interactionCall.class, "interactionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinteractionCall_FctName(), this.getFuncProc(), null, "fctName", null, 0, 1, interactionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinteractionCall_Arguments(), this.getfarg(), null, "arguments", null, 0, -1, interactionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fargEClass, farg.class, "farg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfarg_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, farg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceDeclarationEClass, referenceDeclaration.class, "referenceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getreferenceDeclaration_TypeName(), this.getDataType(), null, "typeName", null, 0, 1, referenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getreferenceDeclaration_Upway(), ecorePackage.getEBoolean(), "upway", null, 0, 1, referenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getreferenceDeclaration_Name(), this.getqualifiedName(), null, "name", null, 0, 1, referenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getreferenceDeclaration_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, referenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedNameEClass, qualifiedName.class, "qualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getqualifiedName_Name(), ecorePackage.getEString(), "name", null, 0, -1, qualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wrapperDeclarationEClass, wrapperDeclaration.class, "wrapperDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getwrapperDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, wrapperDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getwrapperDeclaration_Link(), ecorePackage.getEString(), "link", null, 0, 1, wrapperDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getwrapperDeclaration_Functions(), ecorePackage.getEString(), "functions", null, 0, -1, wrapperDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getwrapperDeclaration_Objects(), ecorePackage.getEString(), "objects", null, 0, -1, wrapperDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getwrapperDeclaration_Libraries(), ecorePackage.getEString(), "libraries", null, 0, -1, wrapperDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getwrapperDeclaration_Tests(), ecorePackage.getEString(), "tests", null, 0, -1, wrapperDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AthenaDSLPackageImpl
