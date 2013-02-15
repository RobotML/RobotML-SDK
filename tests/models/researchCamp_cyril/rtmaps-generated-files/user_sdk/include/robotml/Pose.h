#ifndef ___Pose_H__
#define ___Pose_H__

#include "robotml/Quaternion.h"
#include "robotml/Point.h"

class Pose {
	public:
	Point position;
	Quaternion orientation;
};


#endif //___Pose_H__
