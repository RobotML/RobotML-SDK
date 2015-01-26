/**
 */
package RobotMLExtension.impl;

import RobotMLExtension.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotMLExtensionFactoryImpl extends EFactoryImpl implements RobotMLExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotMLExtensionFactory init() {
		try {
			RobotMLExtensionFactory theRobotMLExtensionFactory = (RobotMLExtensionFactory)EPackage.Registry.INSTANCE.getEFactory(RobotMLExtensionPackage.eNS_URI);
			if (theRobotMLExtensionFactory != null) {
				return theRobotMLExtensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotMLExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotMLExtensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RobotMLExtensionPackage.ARRAY: return createArray();
			case RobotMLExtensionPackage.VECTOR: return createVector();
			case RobotMLExtensionPackage.MAP: return createMap();
			case RobotMLExtensionPackage.ALIAS: return createAlias();
			case RobotMLExtensionPackage.UNION: return createUnion();
			case RobotMLExtensionPackage.PARAMETERS: return createParameters();
			case RobotMLExtensionPackage.DEFINE: return createDefine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector createVector() {
		VectorImpl vector = new VectorImpl();
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Define createDefine() {
		DefineImpl define = new DefineImpl();
		return define;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotMLExtensionPackage getRobotMLExtensionPackage() {
		return (RobotMLExtensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotMLExtensionPackage getPackage() {
		return RobotMLExtensionPackage.eINSTANCE;
	}

} //RobotMLExtensionFactoryImpl
