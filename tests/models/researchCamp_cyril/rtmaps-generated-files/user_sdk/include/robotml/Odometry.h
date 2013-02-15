#ifndef ___Odometry_H__
#define ___Odometry_H__

#include "robotml/Header.h"
#include "robotml/PoseWithCovariance.h"
#include "robotml/TwistWithCovariance.h"

class Odometry {
	public:
	Header header;
	String child_frame_id;
	PoseWithCovariance pose;
	TwistWithCovariance twist;
};


#endif //___Odometry_H__
