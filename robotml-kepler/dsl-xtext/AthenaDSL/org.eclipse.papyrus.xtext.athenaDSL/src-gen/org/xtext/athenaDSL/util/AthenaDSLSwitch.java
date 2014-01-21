/**
 */
package org.xtext.athenaDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.athenaDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.athenaDSL.AthenaDSLPackage
 * @generated
 */
public class AthenaDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AthenaDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AthenaDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AthenaDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AthenaDSLPackage.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.LANGUAGE_DECLARATION:
      {
        LanguageDeclaration languageDeclaration = (LanguageDeclaration)theEObject;
        T result = caseLanguageDeclaration(languageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.DEFINE_TYPE:
      {
        defineType defineType = (defineType)theEObject;
        T result = casedefineType(defineType);
        if (result == null) result = caseDataType(defineType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.VALIDITY_FUNCTION_DECLARATION:
      {
        validityFunctionDeclaration validityFunctionDeclaration = (validityFunctionDeclaration)theEObject;
        T result = casevalidityFunctionDeclaration(validityFunctionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.BASIC_TYPE:
      {
        basicType basicType = (basicType)theEObject;
        T result = casebasicType(basicType);
        if (result == null) result = caseDataType(basicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.INCLUDE_DECL:
      {
        includeDecl includeDecl = (includeDecl)theEObject;
        T result = caseincludeDecl(includeDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.LANGUAGE_DECL:
      {
        languageDecl languageDecl = (languageDecl)theEObject;
        T result = caselanguageDecl(languageDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.LEXICAL_CAST_DECL:
      {
        lexicalCastDecl lexicalCastDecl = (lexicalCastDecl)theEObject;
        T result = caselexicalCastDecl(lexicalCastDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.ARRAY_TYPE:
      {
        arrayType arrayType = (arrayType)theEObject;
        T result = casearrayType(arrayType);
        if (result == null) result = caseDataType(arrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.VECTOR_TYPE:
      {
        vectorType vectorType = (vectorType)theEObject;
        T result = casevectorType(vectorType);
        if (result == null) result = caseDataType(vectorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.MAP_TYPE:
      {
        mapType mapType = (mapType)theEObject;
        T result = casemapType(mapType);
        if (result == null) result = caseDataType(mapType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.STRUCT_TYPE:
      {
        structType structType = (structType)theEObject;
        T result = casestructType(structType);
        if (result == null) result = caseDataType(structType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.STRUCT_ELEMENT:
      {
        structElement structElement = (structElement)theEObject;
        T result = casestructElement(structElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.INDEX:
      {
        index index = (index)theEObject;
        T result = caseindex(index);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.UNION_TYPE:
      {
        unionType unionType = (unionType)theEObject;
        T result = caseunionType(unionType);
        if (result == null) result = caseDataType(unionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.FUNC_PROC:
      {
        FuncProc funcProc = (FuncProc)theEObject;
        T result = caseFuncProc(funcProc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.FUNCTION_DECLARATION:
      {
        functionDeclaration functionDeclaration = (functionDeclaration)theEObject;
        T result = casefunctionDeclaration(functionDeclaration);
        if (result == null) result = caseFuncProc(functionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.ARGUMENTS_DECLARATION:
      {
        argumentsDeclaration argumentsDeclaration = (argumentsDeclaration)theEObject;
        T result = caseargumentsDeclaration(argumentsDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.ARG:
      {
        arg arg = (arg)theEObject;
        T result = casearg(arg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.PROCESSING_DECLARATION:
      {
        ProcessingDeclaration processingDeclaration = (ProcessingDeclaration)theEObject;
        T result = caseProcessingDeclaration(processingDeclaration);
        if (result == null) result = caseFuncProc(processingDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.STATEMENT:
      {
        statement statement = (statement)theEObject;
        T result = casestatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.LOCAL_PARAMETER_DECLARATION:
      {
        localParameterDeclaration localParameterDeclaration = (localParameterDeclaration)theEObject;
        T result = caselocalParameterDeclaration(localParameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.LOCAL_EVENT_DECLARATION:
      {
        localEventDeclaration localEventDeclaration = (localEventDeclaration)theEObject;
        T result = caselocalEventDeclaration(localEventDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.IFBLOCK:
      {
        ifblock ifblock = (ifblock)theEObject;
        T result = caseifblock(ifblock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.WHILEBLOCK:
      {
        whileblock whileblock = (whileblock)theEObject;
        T result = casewhileblock(whileblock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.FUNCTION_CALL:
      {
        functionCall functionCall = (functionCall)theEObject;
        T result = casefunctionCall(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.PROTOTYPE_DECLARATION:
      {
        prototypeDeclaration prototypeDeclaration = (prototypeDeclaration)theEObject;
        T result = caseprototypeDeclaration(prototypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.ARCHITECTURE_ELEMENT:
      {
        architectureElement architectureElement = (architectureElement)theEObject;
        T result = casearchitectureElement(architectureElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.SIGNAL_DECLARATION:
      {
        signalDeclaration signalDeclaration = (signalDeclaration)theEObject;
        T result = casesignalDeclaration(signalDeclaration);
        if (result == null) result = casearchitectureElement(signalDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.EVENT_DECLARATION:
      {
        eventDeclaration eventDeclaration = (eventDeclaration)theEObject;
        T result = caseeventDeclaration(eventDeclaration);
        if (result == null) result = caselocalEventDeclaration(eventDeclaration);
        if (result == null) result = casearchitectureElement(eventDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.EVENT_CONDITION:
      {
        eventCondition eventCondition = (eventCondition)theEObject;
        T result = caseeventCondition(eventCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.PARAMETER_DECLARATION:
      {
        parameterDeclaration parameterDeclaration = (parameterDeclaration)theEObject;
        T result = caseparameterDeclaration(parameterDeclaration);
        if (result == null) result = casearchitectureElement(parameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.STATESET_DECLARATION:
      {
        statesetDeclaration statesetDeclaration = (statesetDeclaration)theEObject;
        T result = casestatesetDeclaration(statesetDeclaration);
        if (result == null) result = casearchitectureElement(statesetDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.STATE_DECLARATION:
      {
        stateDeclaration stateDeclaration = (stateDeclaration)theEObject;
        T result = casestateDeclaration(stateDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.TRANSITION_DECLARATION:
      {
        transitionDeclaration transitionDeclaration = (transitionDeclaration)theEObject;
        T result = casetransitionDeclaration(transitionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.INSTANCE_DECLARATION:
      {
        instanceDeclaration instanceDeclaration = (instanceDeclaration)theEObject;
        T result = caseinstanceDeclaration(instanceDeclaration);
        if (result == null) result = casearchitectureElement(instanceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.INTERACTION_DECLARATION:
      {
        interactionDeclaration interactionDeclaration = (interactionDeclaration)theEObject;
        T result = caseinteractionDeclaration(interactionDeclaration);
        if (result == null) result = casearchitectureElement(interactionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.INTERACTION_CALL:
      {
        interactionCall interactionCall = (interactionCall)theEObject;
        T result = caseinteractionCall(interactionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.FARG:
      {
        farg farg = (farg)theEObject;
        T result = casefarg(farg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.REFERENCE_DECLARATION:
      {
        referenceDeclaration referenceDeclaration = (referenceDeclaration)theEObject;
        T result = casereferenceDeclaration(referenceDeclaration);
        if (result == null) result = casearchitectureElement(referenceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.QUALIFIED_NAME:
      {
        qualifiedName qualifiedName = (qualifiedName)theEObject;
        T result = casequalifiedName(qualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AthenaDSLPackage.WRAPPER_DECLARATION:
      {
        wrapperDeclaration wrapperDeclaration = (wrapperDeclaration)theEObject;
        T result = casewrapperDeclaration(wrapperDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageDeclaration(LanguageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>define Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>define Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedefineType(defineType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>validity Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>validity Function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevalidityFunctionDeclaration(validityFunctionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>basic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>basic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebasicType(basicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>include Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>include Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseincludeDecl(includeDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>language Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>language Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselanguageDecl(languageDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>lexical Cast Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>lexical Cast Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselexicalCastDecl(lexicalCastDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearrayType(arrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>vector Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>vector Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevectorType(vectorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>map Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>map Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemapType(mapType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>struct Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestructType(structType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>struct Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestructElement(structElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseindex(index object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>union Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>union Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunionType(unionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Proc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Proc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncProc(FuncProc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionDeclaration(functionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>arguments Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>arguments Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseargumentsDeclaration(argumentsDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearg(arg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Processing Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Processing Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessingDeclaration(ProcessingDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement(statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>local Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>local Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselocalParameterDeclaration(localParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>local Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>local Event Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselocalEventDeclaration(localEventDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ifblock</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ifblock</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseifblock(ifblock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>whileblock</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>whileblock</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewhileblock(whileblock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionCall(functionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>prototype Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>prototype Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprototypeDeclaration(prototypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>architecture Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>architecture Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearchitectureElement(architectureElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>signal Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>signal Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesignalDeclaration(signalDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>event Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>event Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseeventDeclaration(eventDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>event Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>event Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseeventCondition(eventCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparameterDeclaration(parameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>stateset Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stateset Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatesetDeclaration(statesetDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>state Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>state Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestateDeclaration(stateDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>transition Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>transition Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetransitionDeclaration(transitionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>instance Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>instance Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinstanceDeclaration(instanceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>interaction Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>interaction Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinteractionDeclaration(interactionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>interaction Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>interaction Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinteractionCall(interactionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>farg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>farg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefarg(farg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>reference Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>reference Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casereferenceDeclaration(referenceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequalifiedName(qualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>wrapper Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>wrapper Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewrapperDeclaration(wrapperDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AthenaDSLSwitch
