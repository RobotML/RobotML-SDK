#ifndef ___Imu_H__
#define ___Imu_H__

#include "robotml/Vector3.h"
#include "robotml/Vector3.h"
#include "robotml/Header.h"
#include "robotml/Quaternion.h"

class Imu {
	public:
	Header header;
	Quaternion orientation;
	Float64 orientation_covariance[9];
	Vector3 angular_velocity;
	Float64 angular_velocity_covariance[9];
	Vector3 linear_acceleration;
	Float64 linear_acceleration_covariance[9];
};


#endif //___Imu_H__
