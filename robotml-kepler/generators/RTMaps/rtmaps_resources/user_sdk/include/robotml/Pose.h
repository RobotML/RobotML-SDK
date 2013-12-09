#ifndef ___Pose_H__
#define ___Pose_H__

#include "robotml/Point.h"
#include "robotml/Quaternion.h"

class Pose {
	public:
	Point position;
	Quaternion orientation;
};


#endif //___Pose_H__
