/**
 */
package RobotMLExtension.util;

import RobotMLExtension.RobotMLExtensionPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotMLExtensionXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotMLExtensionXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		RobotMLExtensionPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the RobotMLExtensionResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new RobotMLExtensionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RobotMLExtensionResourceFactoryImpl());
		}
		return registrations;
	}

} //RobotMLExtensionXMLProcessor
