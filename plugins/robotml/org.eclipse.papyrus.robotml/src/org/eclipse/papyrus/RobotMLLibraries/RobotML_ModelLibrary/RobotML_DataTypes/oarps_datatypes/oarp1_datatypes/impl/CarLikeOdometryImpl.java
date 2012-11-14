/**
 */
package org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.oarps_datatypes.oarp1_datatypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.oarps_datatypes.oarp1_datatypes.CarLikeOdometry;
import org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.oarps_datatypes.oarp1_datatypes.Oarp1_datatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car Like Odometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.oarps_datatypes.oarp1_datatypes.impl.CarLikeOdometryImpl#getRearLeftWheel <em>Rear Left Wheel</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.oarps_datatypes.oarp1_datatypes.impl.CarLikeOdometryImpl#getRearRightWheel <em>Rear Right Wheel</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.oarps_datatypes.oarp1_datatypes.impl.CarLikeOdometryImpl#getMotorSpeed <em>Motor Speed</em>}</li>
 *   <li>{@link org.eclipse.papyrus.RobotMLLibraries.RobotML_ModelLibrary.RobotML_DataTypes.oarps_datatypes.oarp1_datatypes.impl.CarLikeOdometryImpl#getSteeringAngle <em>Steering Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarLikeOdometryImpl extends EObjectImpl implements CarLikeOdometry {
	/**
	 * The default value of the '{@link #getRearLeftWheel() <em>Rear Left Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearLeftWheel()
	 * @generated
	 * @ordered
	 */
	protected static final double REAR_LEFT_WHEEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRearLeftWheel() <em>Rear Left Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearLeftWheel()
	 * @generated
	 * @ordered
	 */
	protected double rearLeftWheel = REAR_LEFT_WHEEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRearRightWheel() <em>Rear Right Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearRightWheel()
	 * @generated
	 * @ordered
	 */
	protected static final double REAR_RIGHT_WHEEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRearRightWheel() <em>Rear Right Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearRightWheel()
	 * @generated
	 * @ordered
	 */
	protected double rearRightWheel = REAR_RIGHT_WHEEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotorSpeed() <em>Motor Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double MOTOR_SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMotorSpeed() <em>Motor Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotorSpeed()
	 * @generated
	 * @ordered
	 */
	protected double motorSpeed = MOTOR_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteeringAngle() <em>Steering Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteeringAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double STEERING_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSteeringAngle() <em>Steering Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteeringAngle()
	 * @generated
	 * @ordered
	 */
	protected double steeringAngle = STEERING_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarLikeOdometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oarp1_datatypesPackage.Literals.CAR_LIKE_ODOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRearLeftWheel() {
		return rearLeftWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRearLeftWheel(double newRearLeftWheel) {
		double oldRearLeftWheel = rearLeftWheel;
		rearLeftWheel = newRearLeftWheel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_LEFT_WHEEL, oldRearLeftWheel, rearLeftWheel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRearRightWheel() {
		return rearRightWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRearRightWheel(double newRearRightWheel) {
		double oldRearRightWheel = rearRightWheel;
		rearRightWheel = newRearRightWheel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_RIGHT_WHEEL, oldRearRightWheel, rearRightWheel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMotorSpeed() {
		return motorSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotorSpeed(double newMotorSpeed) {
		double oldMotorSpeed = motorSpeed;
		motorSpeed = newMotorSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__MOTOR_SPEED, oldMotorSpeed, motorSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSteeringAngle() {
		return steeringAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteeringAngle(double newSteeringAngle) {
		double oldSteeringAngle = steeringAngle;
		steeringAngle = newSteeringAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__STEERING_ANGLE, oldSteeringAngle, steeringAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_LEFT_WHEEL:
				return getRearLeftWheel();
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_RIGHT_WHEEL:
				return getRearRightWheel();
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__MOTOR_SPEED:
				return getMotorSpeed();
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__STEERING_ANGLE:
				return getSteeringAngle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_LEFT_WHEEL:
				setRearLeftWheel((Double)newValue);
				return;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_RIGHT_WHEEL:
				setRearRightWheel((Double)newValue);
				return;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__MOTOR_SPEED:
				setMotorSpeed((Double)newValue);
				return;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__STEERING_ANGLE:
				setSteeringAngle((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_LEFT_WHEEL:
				setRearLeftWheel(REAR_LEFT_WHEEL_EDEFAULT);
				return;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_RIGHT_WHEEL:
				setRearRightWheel(REAR_RIGHT_WHEEL_EDEFAULT);
				return;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__MOTOR_SPEED:
				setMotorSpeed(MOTOR_SPEED_EDEFAULT);
				return;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__STEERING_ANGLE:
				setSteeringAngle(STEERING_ANGLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_LEFT_WHEEL:
				return rearLeftWheel != REAR_LEFT_WHEEL_EDEFAULT;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__REAR_RIGHT_WHEEL:
				return rearRightWheel != REAR_RIGHT_WHEEL_EDEFAULT;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__MOTOR_SPEED:
				return motorSpeed != MOTOR_SPEED_EDEFAULT;
			case Oarp1_datatypesPackage.CAR_LIKE_ODOMETRY__STEERING_ANGLE:
				return steeringAngle != STEERING_ANGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rearLeftWheel: ");
		result.append(rearLeftWheel);
		result.append(", rearRightWheel: ");
		result.append(rearRightWheel);
		result.append(", motorSpeed: ");
		result.append(motorSpeed);
		result.append(", steeringAngle: ");
		result.append(steeringAngle);
		result.append(')');
		return result.toString();
	}

} //CarLikeOdometryImpl
