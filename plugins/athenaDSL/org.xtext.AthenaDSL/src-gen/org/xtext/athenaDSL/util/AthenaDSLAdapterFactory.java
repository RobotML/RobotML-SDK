/**
 */
package org.xtext.athenaDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.athenaDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.athenaDSL.AthenaDSLPackage
 * @generated
 */
public class AthenaDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AthenaDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AthenaDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AthenaDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AthenaDSLSwitch<Adapter> modelSwitch =
    new AthenaDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseLanguageDeclaration(LanguageDeclaration object)
      {
        return createLanguageDeclarationAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter casedefineType(defineType object)
      {
        return createdefineTypeAdapter();
      }
      @Override
      public Adapter casevalidityFunctionDeclaration(validityFunctionDeclaration object)
      {
        return createvalidityFunctionDeclarationAdapter();
      }
      @Override
      public Adapter casebasicType(basicType object)
      {
        return createbasicTypeAdapter();
      }
      @Override
      public Adapter caseincludeDecl(includeDecl object)
      {
        return createincludeDeclAdapter();
      }
      @Override
      public Adapter caselanguageDecl(languageDecl object)
      {
        return createlanguageDeclAdapter();
      }
      @Override
      public Adapter caselexicalCastDecl(lexicalCastDecl object)
      {
        return createlexicalCastDeclAdapter();
      }
      @Override
      public Adapter casearrayType(arrayType object)
      {
        return createarrayTypeAdapter();
      }
      @Override
      public Adapter casevectorType(vectorType object)
      {
        return createvectorTypeAdapter();
      }
      @Override
      public Adapter casemapType(mapType object)
      {
        return createmapTypeAdapter();
      }
      @Override
      public Adapter casestructType(structType object)
      {
        return createstructTypeAdapter();
      }
      @Override
      public Adapter casestructElement(structElement object)
      {
        return createstructElementAdapter();
      }
      @Override
      public Adapter caseindex(index object)
      {
        return createindexAdapter();
      }
      @Override
      public Adapter caseunionType(unionType object)
      {
        return createunionTypeAdapter();
      }
      @Override
      public Adapter caseFuncProc(FuncProc object)
      {
        return createFuncProcAdapter();
      }
      @Override
      public Adapter casefunctionDeclaration(functionDeclaration object)
      {
        return createfunctionDeclarationAdapter();
      }
      @Override
      public Adapter caseargumentsDeclaration(argumentsDeclaration object)
      {
        return createargumentsDeclarationAdapter();
      }
      @Override
      public Adapter casearg(arg object)
      {
        return createargAdapter();
      }
      @Override
      public Adapter caseProcessingDeclaration(ProcessingDeclaration object)
      {
        return createProcessingDeclarationAdapter();
      }
      @Override
      public Adapter casestatement(statement object)
      {
        return createstatementAdapter();
      }
      @Override
      public Adapter caselocalParameterDeclaration(localParameterDeclaration object)
      {
        return createlocalParameterDeclarationAdapter();
      }
      @Override
      public Adapter caselocalEventDeclaration(localEventDeclaration object)
      {
        return createlocalEventDeclarationAdapter();
      }
      @Override
      public Adapter caseifblock(ifblock object)
      {
        return createifblockAdapter();
      }
      @Override
      public Adapter casewhileblock(whileblock object)
      {
        return createwhileblockAdapter();
      }
      @Override
      public Adapter casefunctionCall(functionCall object)
      {
        return createfunctionCallAdapter();
      }
      @Override
      public Adapter caseprototypeDeclaration(prototypeDeclaration object)
      {
        return createprototypeDeclarationAdapter();
      }
      @Override
      public Adapter casearchitectureElement(architectureElement object)
      {
        return createarchitectureElementAdapter();
      }
      @Override
      public Adapter casesignalDeclaration(signalDeclaration object)
      {
        return createsignalDeclarationAdapter();
      }
      @Override
      public Adapter caseeventDeclaration(eventDeclaration object)
      {
        return createeventDeclarationAdapter();
      }
      @Override
      public Adapter caseeventCondition(eventCondition object)
      {
        return createeventConditionAdapter();
      }
      @Override
      public Adapter caseparameterDeclaration(parameterDeclaration object)
      {
        return createparameterDeclarationAdapter();
      }
      @Override
      public Adapter casestatesetDeclaration(statesetDeclaration object)
      {
        return createstatesetDeclarationAdapter();
      }
      @Override
      public Adapter casestateDeclaration(stateDeclaration object)
      {
        return createstateDeclarationAdapter();
      }
      @Override
      public Adapter casetransitionDeclaration(transitionDeclaration object)
      {
        return createtransitionDeclarationAdapter();
      }
      @Override
      public Adapter caseinstanceDeclaration(instanceDeclaration object)
      {
        return createinstanceDeclarationAdapter();
      }
      @Override
      public Adapter caseinteractionDeclaration(interactionDeclaration object)
      {
        return createinteractionDeclarationAdapter();
      }
      @Override
      public Adapter caseinteractionCall(interactionCall object)
      {
        return createinteractionCallAdapter();
      }
      @Override
      public Adapter casefarg(farg object)
      {
        return createfargAdapter();
      }
      @Override
      public Adapter casereferenceDeclaration(referenceDeclaration object)
      {
        return createreferenceDeclarationAdapter();
      }
      @Override
      public Adapter casequalifiedName(qualifiedName object)
      {
        return createqualifiedNameAdapter();
      }
      @Override
      public Adapter casewrapperDeclaration(wrapperDeclaration object)
      {
        return createwrapperDeclarationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.LanguageDeclaration <em>Language Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.LanguageDeclaration
   * @generated
   */
  public Adapter createLanguageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.defineType <em>define Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.defineType
   * @generated
   */
  public Adapter createdefineTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.validityFunctionDeclaration <em>validity Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.validityFunctionDeclaration
   * @generated
   */
  public Adapter createvalidityFunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.basicType <em>basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.basicType
   * @generated
   */
  public Adapter createbasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.includeDecl <em>include Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.includeDecl
   * @generated
   */
  public Adapter createincludeDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.languageDecl <em>language Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.languageDecl
   * @generated
   */
  public Adapter createlanguageDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.lexicalCastDecl <em>lexical Cast Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.lexicalCastDecl
   * @generated
   */
  public Adapter createlexicalCastDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.arrayType <em>array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.arrayType
   * @generated
   */
  public Adapter createarrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.vectorType <em>vector Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.vectorType
   * @generated
   */
  public Adapter createvectorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.mapType <em>map Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.mapType
   * @generated
   */
  public Adapter createmapTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.structType <em>struct Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.structType
   * @generated
   */
  public Adapter createstructTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.structElement <em>struct Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.structElement
   * @generated
   */
  public Adapter createstructElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.index <em>index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.index
   * @generated
   */
  public Adapter createindexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.unionType <em>union Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.unionType
   * @generated
   */
  public Adapter createunionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.FuncProc <em>Func Proc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.FuncProc
   * @generated
   */
  public Adapter createFuncProcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.functionDeclaration <em>function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.functionDeclaration
   * @generated
   */
  public Adapter createfunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.argumentsDeclaration <em>arguments Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.argumentsDeclaration
   * @generated
   */
  public Adapter createargumentsDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.arg <em>arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.arg
   * @generated
   */
  public Adapter createargAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.ProcessingDeclaration <em>Processing Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.ProcessingDeclaration
   * @generated
   */
  public Adapter createProcessingDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.statement
   * @generated
   */
  public Adapter createstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.localParameterDeclaration <em>local Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.localParameterDeclaration
   * @generated
   */
  public Adapter createlocalParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.localEventDeclaration <em>local Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.localEventDeclaration
   * @generated
   */
  public Adapter createlocalEventDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.ifblock <em>ifblock</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.ifblock
   * @generated
   */
  public Adapter createifblockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.whileblock <em>whileblock</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.whileblock
   * @generated
   */
  public Adapter createwhileblockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.functionCall <em>function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.functionCall
   * @generated
   */
  public Adapter createfunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.prototypeDeclaration <em>prototype Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.prototypeDeclaration
   * @generated
   */
  public Adapter createprototypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.architectureElement <em>architecture Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.architectureElement
   * @generated
   */
  public Adapter createarchitectureElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.signalDeclaration <em>signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.signalDeclaration
   * @generated
   */
  public Adapter createsignalDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.eventDeclaration <em>event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.eventDeclaration
   * @generated
   */
  public Adapter createeventDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.eventCondition <em>event Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.eventCondition
   * @generated
   */
  public Adapter createeventConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.parameterDeclaration <em>parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.parameterDeclaration
   * @generated
   */
  public Adapter createparameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.statesetDeclaration <em>stateset Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.statesetDeclaration
   * @generated
   */
  public Adapter createstatesetDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.stateDeclaration <em>state Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.stateDeclaration
   * @generated
   */
  public Adapter createstateDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.transitionDeclaration <em>transition Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.transitionDeclaration
   * @generated
   */
  public Adapter createtransitionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.instanceDeclaration <em>instance Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.instanceDeclaration
   * @generated
   */
  public Adapter createinstanceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.interactionDeclaration <em>interaction Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.interactionDeclaration
   * @generated
   */
  public Adapter createinteractionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.interactionCall <em>interaction Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.interactionCall
   * @generated
   */
  public Adapter createinteractionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.farg <em>farg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.farg
   * @generated
   */
  public Adapter createfargAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.referenceDeclaration <em>reference Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.referenceDeclaration
   * @generated
   */
  public Adapter createreferenceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.qualifiedName <em>qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.qualifiedName
   * @generated
   */
  public Adapter createqualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.athenaDSL.wrapperDeclaration <em>wrapper Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.athenaDSL.wrapperDeclaration
   * @generated
   */
  public Adapter createwrapperDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AthenaDSLAdapterFactory
