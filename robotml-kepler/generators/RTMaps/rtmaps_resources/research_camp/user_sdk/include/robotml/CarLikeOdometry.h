#ifndef ___CarLikeOdometry_H__
#define ___CarLikeOdometry_H__

#include "robotml/Header.h"

class CarLikeOdometry {
	public:
	Header header;
	Float64 steering_angle;
	Float64 left_rear_wheel_distance;
	Float64 right_rear_wheel_distance;
	Float64 right_rear_wheel_velocity;
	Float64 left_rear_wheel_velocity;
};


#endif //___CarLikeOdometry_H__
