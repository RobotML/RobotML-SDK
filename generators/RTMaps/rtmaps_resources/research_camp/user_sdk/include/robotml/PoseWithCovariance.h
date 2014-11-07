#ifndef ___PoseWithCovariance_H__
#define ___PoseWithCovariance_H__

#include "robotml/Pose.h"

class PoseWithCovariance {
	public:
	Pose pose;
	Float64 covariance[36];
};


#endif //___PoseWithCovariance_H__
