/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 *
 *****************************************************************************/
package FCM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import FCM.AutoIndex;
import FCM.AutoIndexPerNode;
import FCM.CompImplTemplate;
import FCM.ConfigOption;
import FCM.ConfigurableElementInstance;
import FCM.Configuration;
import FCM.ConfigurationProperty;
import FCM.Connector;
import FCM.ConnectorConfiguration;
import FCM.ContainerPort;
import FCM.ContainerRule;
import FCM.CopyAttributeValue;
import FCM.CppLibrary;
import FCM.DeploymentPlan;
import FCM.DerivedElement;
import FCM.ExtendedSignature;
import FCM.ExternalLibrary;
import FCM.FCMPackage;
import FCM.ImplementationGroup;
import FCM.ImplementationProperties;
import FCM.InitPrecedence;
import FCM.InstanceConfigurator;
import FCM.InteractionComponent;
import FCM.InterceptionRule;
import FCM.JavaLibrary;
import FCM.OperatingSystem;
import FCM.Part;
import FCM.Port;
import FCM.PortKind;
import FCM.RuleApplication;
import FCM.Singleton;
import FCM.Target;
import FCM.TargetArchitecture;
import FCM.Template;
import FCM.UseInstanceConfigurator;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see FCM.FCMPackage
 * @generated
 */
public class FCMSwitch<T> extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static FCMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FCMSwitch() {
		if(modelPackage == null) {
			modelPackage = FCMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch(classifierID) {
		case FCMPackage.TEMPLATE:
		{
			Template template = (Template)theEObject;
			T result = caseTemplate(template);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CONFIGURATION_PROPERTY:
		{
			ConfigurationProperty configurationProperty = (ConfigurationProperty)theEObject;
			T result = caseConfigurationProperty(configurationProperty);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.IMPLEMENTATION_GROUP:
		{
			ImplementationGroup implementationGroup = (ImplementationGroup)theEObject;
			T result = caseImplementationGroup(implementationGroup);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.RULE_APPLICATION:
		{
			RuleApplication ruleApplication = (RuleApplication)theEObject;
			T result = caseRuleApplication(ruleApplication);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CONTAINER_RULE:
		{
			ContainerRule containerRule = (ContainerRule)theEObject;
			T result = caseContainerRule(containerRule);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CONFIG_OPTION:
		{
			ConfigOption configOption = (ConfigOption)theEObject;
			T result = caseConfigOption(configOption);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.SINGLETON:
		{
			Singleton singleton = (Singleton)theEObject;
			T result = caseSingleton(singleton);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.INTERACTION_COMPONENT:
		{
			InteractionComponent interactionComponent = (InteractionComponent)theEObject;
			T result = caseInteractionComponent(interactionComponent);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.PORT_KIND:
		{
			PortKind portKind = (PortKind)theEObject;
			T result = casePortKind(portKind);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.PORT:
		{
			Port port = (Port)theEObject;
			T result = casePort(port);
			if(result == null)
				result = caseConfigurableElementInstance(port);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CONFIGURABLE_ELEMENT_INSTANCE:
		{
			ConfigurableElementInstance configurableElementInstance = (ConfigurableElementInstance)theEObject;
			T result = caseConfigurableElementInstance(configurableElementInstance);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CONNECTOR:
		{
			Connector connector = (Connector)theEObject;
			T result = caseConnector(connector);
			if(result == null)
				result = caseConfigurableElementInstance(connector);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.DEPLOYMENT_PLAN:
		{
			DeploymentPlan deploymentPlan = (DeploymentPlan)theEObject;
			T result = caseDeploymentPlan(deploymentPlan);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.DERIVED_ELEMENT:
		{
			DerivedElement derivedElement = (DerivedElement)theEObject;
			T result = caseDerivedElement(derivedElement);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.COMP_IMPL_TEMPLATE:
		{
			CompImplTemplate compImplTemplate = (CompImplTemplate)theEObject;
			T result = caseCompImplTemplate(compImplTemplate);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CPP_LIBRARY:
		{
			CppLibrary cppLibrary = (CppLibrary)theEObject;
			T result = caseCppLibrary(cppLibrary);
			if(result == null)
				result = caseExternalLibrary(cppLibrary);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.EXTERNAL_LIBRARY:
		{
			ExternalLibrary externalLibrary = (ExternalLibrary)theEObject;
			T result = caseExternalLibrary(externalLibrary);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.JAVA_LIBRARY:
		{
			JavaLibrary javaLibrary = (JavaLibrary)theEObject;
			T result = caseJavaLibrary(javaLibrary);
			if(result == null)
				result = caseExternalLibrary(javaLibrary);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.IMPLEMENTATION_PROPERTIES:
		{
			ImplementationProperties implementationProperties = (ImplementationProperties)theEObject;
			T result = caseImplementationProperties(implementationProperties);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.OPERATING_SYSTEM:
		{
			OperatingSystem operatingSystem = (OperatingSystem)theEObject;
			T result = caseOperatingSystem(operatingSystem);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.TARGET_ARCHITECTURE:
		{
			TargetArchitecture targetArchitecture = (TargetArchitecture)theEObject;
			T result = caseTargetArchitecture(targetArchitecture);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CONFIGURATION:
		{
			Configuration configuration = (Configuration)theEObject;
			T result = caseConfiguration(configuration);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.INTERCEPTION_RULE:
		{
			InterceptionRule interceptionRule = (InterceptionRule)theEObject;
			T result = caseInterceptionRule(interceptionRule);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.TARGET:
		{
			Target target = (Target)theEObject;
			T result = caseTarget(target);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.PART:
		{
			Part part = (Part)theEObject;
			T result = casePart(part);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.COPY_ATTRIBUTE_VALUE:
		{
			CopyAttributeValue copyAttributeValue = (CopyAttributeValue)theEObject;
			T result = caseCopyAttributeValue(copyAttributeValue);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.AUTO_INDEX:
		{
			AutoIndex autoIndex = (AutoIndex)theEObject;
			T result = caseAutoIndex(autoIndex);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.AUTO_INDEX_PER_NODE:
		{
			AutoIndexPerNode autoIndexPerNode = (AutoIndexPerNode)theEObject;
			T result = caseAutoIndexPerNode(autoIndexPerNode);
			if(result == null)
				result = caseAutoIndex(autoIndexPerNode);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.INIT_PRECEDENCE:
		{
			InitPrecedence initPrecedence = (InitPrecedence)theEObject;
			T result = caseInitPrecedence(initPrecedence);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CONNECTOR_CONFIGURATION:
		{
			ConnectorConfiguration connectorConfiguration = (ConnectorConfiguration)theEObject;
			T result = caseConnectorConfiguration(connectorConfiguration);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.EXTENDED_SIGNATURE:
		{
			ExtendedSignature extendedSignature = (ExtendedSignature)theEObject;
			T result = caseExtendedSignature(extendedSignature);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.CONTAINER_PORT:
		{
			ContainerPort containerPort = (ContainerPort)theEObject;
			T result = caseContainerPort(containerPort);
			if(result == null)
				result = casePort(containerPort);
			if(result == null)
				result = caseConfigurableElementInstance(containerPort);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.USE_INSTANCE_CONFIGURATOR:
		{
			UseInstanceConfigurator useInstanceConfigurator = (UseInstanceConfigurator)theEObject;
			T result = caseUseInstanceConfigurator(useInstanceConfigurator);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FCMPackage.INSTANCE_CONFIGURATOR:
		{
			InstanceConfigurator instanceConfigurator = (InstanceConfigurator)theEObject;
			T result = caseInstanceConfigurator(instanceConfigurator);
			if(result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Impl Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Impl Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompImplTemplate(CompImplTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortKind(PortKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable Element Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurableElementInstance(ConfigurableElementInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationProperty(ConfigurationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentPlan(DeploymentPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedElement(DerivedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerRule(ContainerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigOption(ConfigOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleton(Singleton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionComponent(InteractionComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interception Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interception Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterceptionRule(InterceptionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpp Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpp Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCppLibrary(CppLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalLibrary(ExternalLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGroup(ImplementationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleApplication(RuleApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaLibrary(JavaLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationProperties(ImplementationProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingSystem(OperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetArchitecture(TargetArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarget(Target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyAttributeValue(CopyAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoIndex(AutoIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Index Per Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Index Per Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoIndexPerNode(AutoIndexPerNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitPrecedence(InitPrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorConfiguration(ConnectorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedSignature(ExtendedSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerPort(ContainerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Instance Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Instance Configurator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseInstanceConfigurator(UseInstanceConfigurator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Configurator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceConfigurator(InstanceConfigurator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *        the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FCMSwitch
