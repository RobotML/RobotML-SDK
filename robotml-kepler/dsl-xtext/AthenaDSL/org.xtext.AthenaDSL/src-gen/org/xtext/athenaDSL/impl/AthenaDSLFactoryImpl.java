/**
 */
package org.xtext.athenaDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.athenaDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AthenaDSLFactoryImpl extends EFactoryImpl implements AthenaDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AthenaDSLFactory init()
  {
    try
    {
      AthenaDSLFactory theAthenaDSLFactory = (AthenaDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/AthenaDSL"); 
      if (theAthenaDSLFactory != null)
      {
        return theAthenaDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AthenaDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AthenaDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AthenaDSLPackage.PROJECT: return createProject();
      case AthenaDSLPackage.IMPORT: return createImport();
      case AthenaDSLPackage.LANGUAGE_DECLARATION: return createLanguageDeclaration();
      case AthenaDSLPackage.DATA_TYPE: return createDataType();
      case AthenaDSLPackage.DEFINE_TYPE: return createdefineType();
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION: return createvalidityFunctionDeclaration();
      case AthenaDSLPackage.BASIC_TYPE: return createbasicType();
      case AthenaDSLPackage.INCLUDE_DECL: return createincludeDecl();
      case AthenaDSLPackage.LANGUAGE_DECL: return createlanguageDecl();
      case AthenaDSLPackage.LEXICAL_CAST_DECL: return createlexicalCastDecl();
      case AthenaDSLPackage.ARRAY_TYPE: return createarrayType();
      case AthenaDSLPackage.VECTOR_TYPE: return createvectorType();
      case AthenaDSLPackage.MAP_TYPE: return createmapType();
      case AthenaDSLPackage.STRUCT_TYPE: return createstructType();
      case AthenaDSLPackage.STRUCT_ELEMENT: return createstructElement();
      case AthenaDSLPackage.INDEX: return createindex();
      case AthenaDSLPackage.UNION_TYPE: return createunionType();
      case AthenaDSLPackage.FUNC_PROC: return createFuncProc();
      case AthenaDSLPackage.FUNCTION_DECLARATION: return createfunctionDeclaration();
      case AthenaDSLPackage.ARGUMENTS_DECLARATION: return createargumentsDeclaration();
      case AthenaDSLPackage.ARG: return createarg();
      case AthenaDSLPackage.PROCESSING_DECLARATION: return createProcessingDeclaration();
      case AthenaDSLPackage.STATEMENT: return createstatement();
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION: return createlocalParameterDeclaration();
      case AthenaDSLPackage.LOCAL_EVENT_DECLARATION: return createlocalEventDeclaration();
      case AthenaDSLPackage.IFBLOCK: return createifblock();
      case AthenaDSLPackage.WHILEBLOCK: return createwhileblock();
      case AthenaDSLPackage.FUNCTION_CALL: return createfunctionCall();
      case AthenaDSLPackage.PROTOTYPE_DECLARATION: return createprototypeDeclaration();
      case AthenaDSLPackage.ARCHITECTURE_ELEMENT: return createarchitectureElement();
      case AthenaDSLPackage.SIGNAL_DECLARATION: return createsignalDeclaration();
      case AthenaDSLPackage.EVENT_DECLARATION: return createeventDeclaration();
      case AthenaDSLPackage.EVENT_CONDITION: return createeventCondition();
      case AthenaDSLPackage.PARAMETER_DECLARATION: return createparameterDeclaration();
      case AthenaDSLPackage.STATESET_DECLARATION: return createstatesetDeclaration();
      case AthenaDSLPackage.STATE_DECLARATION: return createstateDeclaration();
      case AthenaDSLPackage.TRANSITION_DECLARATION: return createtransitionDeclaration();
      case AthenaDSLPackage.INSTANCE_DECLARATION: return createinstanceDeclaration();
      case AthenaDSLPackage.INTERACTION_DECLARATION: return createinteractionDeclaration();
      case AthenaDSLPackage.INTERACTION_CALL: return createinteractionCall();
      case AthenaDSLPackage.FARG: return createfarg();
      case AthenaDSLPackage.REFERENCE_DECLARATION: return createreferenceDeclaration();
      case AthenaDSLPackage.QUALIFIED_NAME: return createqualifiedName();
      case AthenaDSLPackage.WRAPPER_DECLARATION: return createwrapperDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageDeclaration createLanguageDeclaration()
  {
    LanguageDeclarationImpl languageDeclaration = new LanguageDeclarationImpl();
    return languageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public defineType createdefineType()
  {
    defineTypeImpl defineType = new defineTypeImpl();
    return defineType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public validityFunctionDeclaration createvalidityFunctionDeclaration()
  {
    validityFunctionDeclarationImpl validityFunctionDeclaration = new validityFunctionDeclarationImpl();
    return validityFunctionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public basicType createbasicType()
  {
    basicTypeImpl basicType = new basicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public includeDecl createincludeDecl()
  {
    includeDeclImpl includeDecl = new includeDeclImpl();
    return includeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public languageDecl createlanguageDecl()
  {
    languageDeclImpl languageDecl = new languageDeclImpl();
    return languageDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lexicalCastDecl createlexicalCastDecl()
  {
    lexicalCastDeclImpl lexicalCastDecl = new lexicalCastDeclImpl();
    return lexicalCastDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arrayType createarrayType()
  {
    arrayTypeImpl arrayType = new arrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vectorType createvectorType()
  {
    vectorTypeImpl vectorType = new vectorTypeImpl();
    return vectorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mapType createmapType()
  {
    mapTypeImpl mapType = new mapTypeImpl();
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structType createstructType()
  {
    structTypeImpl structType = new structTypeImpl();
    return structType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structElement createstructElement()
  {
    structElementImpl structElement = new structElementImpl();
    return structElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public index createindex()
  {
    indexImpl index = new indexImpl();
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unionType createunionType()
  {
    unionTypeImpl unionType = new unionTypeImpl();
    return unionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncProc createFuncProc()
  {
    FuncProcImpl funcProc = new FuncProcImpl();
    return funcProc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionDeclaration createfunctionDeclaration()
  {
    functionDeclarationImpl functionDeclaration = new functionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public argumentsDeclaration createargumentsDeclaration()
  {
    argumentsDeclarationImpl argumentsDeclaration = new argumentsDeclarationImpl();
    return argumentsDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arg createarg()
  {
    argImpl arg = new argImpl();
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessingDeclaration createProcessingDeclaration()
  {
    ProcessingDeclarationImpl processingDeclaration = new ProcessingDeclarationImpl();
    return processingDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public localParameterDeclaration createlocalParameterDeclaration()
  {
    localParameterDeclarationImpl localParameterDeclaration = new localParameterDeclarationImpl();
    return localParameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public localEventDeclaration createlocalEventDeclaration()
  {
    localEventDeclarationImpl localEventDeclaration = new localEventDeclarationImpl();
    return localEventDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ifblock createifblock()
  {
    ifblockImpl ifblock = new ifblockImpl();
    return ifblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public whileblock createwhileblock()
  {
    whileblockImpl whileblock = new whileblockImpl();
    return whileblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionCall createfunctionCall()
  {
    functionCallImpl functionCall = new functionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public prototypeDeclaration createprototypeDeclaration()
  {
    prototypeDeclarationImpl prototypeDeclaration = new prototypeDeclarationImpl();
    return prototypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public architectureElement createarchitectureElement()
  {
    architectureElementImpl architectureElement = new architectureElementImpl();
    return architectureElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public signalDeclaration createsignalDeclaration()
  {
    signalDeclarationImpl signalDeclaration = new signalDeclarationImpl();
    return signalDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public eventDeclaration createeventDeclaration()
  {
    eventDeclarationImpl eventDeclaration = new eventDeclarationImpl();
    return eventDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public eventCondition createeventCondition()
  {
    eventConditionImpl eventCondition = new eventConditionImpl();
    return eventCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterDeclaration createparameterDeclaration()
  {
    parameterDeclarationImpl parameterDeclaration = new parameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statesetDeclaration createstatesetDeclaration()
  {
    statesetDeclarationImpl statesetDeclaration = new statesetDeclarationImpl();
    return statesetDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stateDeclaration createstateDeclaration()
  {
    stateDeclarationImpl stateDeclaration = new stateDeclarationImpl();
    return stateDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public transitionDeclaration createtransitionDeclaration()
  {
    transitionDeclarationImpl transitionDeclaration = new transitionDeclarationImpl();
    return transitionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public instanceDeclaration createinstanceDeclaration()
  {
    instanceDeclarationImpl instanceDeclaration = new instanceDeclarationImpl();
    return instanceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interactionDeclaration createinteractionDeclaration()
  {
    interactionDeclarationImpl interactionDeclaration = new interactionDeclarationImpl();
    return interactionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interactionCall createinteractionCall()
  {
    interactionCallImpl interactionCall = new interactionCallImpl();
    return interactionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public farg createfarg()
  {
    fargImpl farg = new fargImpl();
    return farg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public referenceDeclaration createreferenceDeclaration()
  {
    referenceDeclarationImpl referenceDeclaration = new referenceDeclarationImpl();
    return referenceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public qualifiedName createqualifiedName()
  {
    qualifiedNameImpl qualifiedName = new qualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public wrapperDeclaration createwrapperDeclaration()
  {
    wrapperDeclarationImpl wrapperDeclaration = new wrapperDeclarationImpl();
    return wrapperDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AthenaDSLPackage getAthenaDSLPackage()
  {
    return (AthenaDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AthenaDSLPackage getPackage()
  {
    return AthenaDSLPackage.eINSTANCE;
  }

} //AthenaDSLFactoryImpl
