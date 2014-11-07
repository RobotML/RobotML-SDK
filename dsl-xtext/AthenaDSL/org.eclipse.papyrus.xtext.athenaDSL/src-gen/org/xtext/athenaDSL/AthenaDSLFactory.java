/**
 */
package org.xtext.athenaDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.athenaDSL.AthenaDSLPackage
 * @generated
 */
public interface AthenaDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AthenaDSLFactory eINSTANCE = org.xtext.athenaDSL.impl.AthenaDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Language Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language Declaration</em>'.
   * @generated
   */
  LanguageDeclaration createLanguageDeclaration();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>define Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>define Type</em>'.
   * @generated
   */
  defineType createdefineType();

  /**
   * Returns a new object of class '<em>validity Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>validity Function Declaration</em>'.
   * @generated
   */
  validityFunctionDeclaration createvalidityFunctionDeclaration();

  /**
   * Returns a new object of class '<em>basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>basic Type</em>'.
   * @generated
   */
  basicType createbasicType();

  /**
   * Returns a new object of class '<em>include Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>include Decl</em>'.
   * @generated
   */
  includeDecl createincludeDecl();

  /**
   * Returns a new object of class '<em>language Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>language Decl</em>'.
   * @generated
   */
  languageDecl createlanguageDecl();

  /**
   * Returns a new object of class '<em>lexical Cast Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>lexical Cast Decl</em>'.
   * @generated
   */
  lexicalCastDecl createlexicalCastDecl();

  /**
   * Returns a new object of class '<em>array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>array Type</em>'.
   * @generated
   */
  arrayType createarrayType();

  /**
   * Returns a new object of class '<em>vector Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>vector Type</em>'.
   * @generated
   */
  vectorType createvectorType();

  /**
   * Returns a new object of class '<em>map Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>map Type</em>'.
   * @generated
   */
  mapType createmapType();

  /**
   * Returns a new object of class '<em>struct Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct Type</em>'.
   * @generated
   */
  structType createstructType();

  /**
   * Returns a new object of class '<em>struct Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct Element</em>'.
   * @generated
   */
  structElement createstructElement();

  /**
   * Returns a new object of class '<em>index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>index</em>'.
   * @generated
   */
  index createindex();

  /**
   * Returns a new object of class '<em>union Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>union Type</em>'.
   * @generated
   */
  unionType createunionType();

  /**
   * Returns a new object of class '<em>Func Proc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Proc</em>'.
   * @generated
   */
  FuncProc createFuncProc();

  /**
   * Returns a new object of class '<em>function Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Declaration</em>'.
   * @generated
   */
  functionDeclaration createfunctionDeclaration();

  /**
   * Returns a new object of class '<em>arguments Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arguments Declaration</em>'.
   * @generated
   */
  argumentsDeclaration createargumentsDeclaration();

  /**
   * Returns a new object of class '<em>arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arg</em>'.
   * @generated
   */
  arg createarg();

  /**
   * Returns a new object of class '<em>Processing Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Processing Declaration</em>'.
   * @generated
   */
  ProcessingDeclaration createProcessingDeclaration();

  /**
   * Returns a new object of class '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>statement</em>'.
   * @generated
   */
  statement createstatement();

  /**
   * Returns a new object of class '<em>local Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>local Parameter Declaration</em>'.
   * @generated
   */
  localParameterDeclaration createlocalParameterDeclaration();

  /**
   * Returns a new object of class '<em>local Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>local Event Declaration</em>'.
   * @generated
   */
  localEventDeclaration createlocalEventDeclaration();

  /**
   * Returns a new object of class '<em>ifblock</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ifblock</em>'.
   * @generated
   */
  ifblock createifblock();

  /**
   * Returns a new object of class '<em>whileblock</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>whileblock</em>'.
   * @generated
   */
  whileblock createwhileblock();

  /**
   * Returns a new object of class '<em>function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function Call</em>'.
   * @generated
   */
  functionCall createfunctionCall();

  /**
   * Returns a new object of class '<em>prototype Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>prototype Declaration</em>'.
   * @generated
   */
  prototypeDeclaration createprototypeDeclaration();

  /**
   * Returns a new object of class '<em>architecture Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>architecture Element</em>'.
   * @generated
   */
  architectureElement createarchitectureElement();

  /**
   * Returns a new object of class '<em>signal Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>signal Declaration</em>'.
   * @generated
   */
  signalDeclaration createsignalDeclaration();

  /**
   * Returns a new object of class '<em>event Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>event Declaration</em>'.
   * @generated
   */
  eventDeclaration createeventDeclaration();

  /**
   * Returns a new object of class '<em>event Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>event Condition</em>'.
   * @generated
   */
  eventCondition createeventCondition();

  /**
   * Returns a new object of class '<em>parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>parameter Declaration</em>'.
   * @generated
   */
  parameterDeclaration createparameterDeclaration();

  /**
   * Returns a new object of class '<em>stateset Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stateset Declaration</em>'.
   * @generated
   */
  statesetDeclaration createstatesetDeclaration();

  /**
   * Returns a new object of class '<em>state Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>state Declaration</em>'.
   * @generated
   */
  stateDeclaration createstateDeclaration();

  /**
   * Returns a new object of class '<em>transition Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>transition Declaration</em>'.
   * @generated
   */
  transitionDeclaration createtransitionDeclaration();

  /**
   * Returns a new object of class '<em>instance Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>instance Declaration</em>'.
   * @generated
   */
  instanceDeclaration createinstanceDeclaration();

  /**
   * Returns a new object of class '<em>interaction Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>interaction Declaration</em>'.
   * @generated
   */
  interactionDeclaration createinteractionDeclaration();

  /**
   * Returns a new object of class '<em>interaction Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>interaction Call</em>'.
   * @generated
   */
  interactionCall createinteractionCall();

  /**
   * Returns a new object of class '<em>farg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>farg</em>'.
   * @generated
   */
  farg createfarg();

  /**
   * Returns a new object of class '<em>reference Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>reference Declaration</em>'.
   * @generated
   */
  referenceDeclaration createreferenceDeclaration();

  /**
   * Returns a new object of class '<em>qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>qualified Name</em>'.
   * @generated
   */
  qualifiedName createqualifiedName();

  /**
   * Returns a new object of class '<em>wrapper Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>wrapper Declaration</em>'.
   * @generated
   */
  wrapperDeclaration createwrapperDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AthenaDSLPackage getAthenaDSLPackage();

} //AthenaDSLFactory
