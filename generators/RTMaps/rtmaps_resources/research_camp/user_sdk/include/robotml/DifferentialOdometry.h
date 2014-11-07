#ifndef ___DifferentialOdometry_H__
#define ___DifferentialOdometry_H__

#include "robotml/Header.h"

class DifferentialOdometry {
	public:
	Header header;
	Float64 right_distance;
	Float64 left_distance;
	Float64 left_velocity;
	Float64 right_velocity;
};


#endif //___DifferentialOdometry_H__
