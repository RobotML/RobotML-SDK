#ifndef ___Path_Point_H__
#define ___Path_Point_H__

#include "robotml/Velocity_Linear.h"
#include "YouthChallengeModel/Position_Error.h"
#include "YouthChallengeModel/Position.h"

class Path_Point {
	public:
	Position position;
	Position_Error pos_error;
	Velocity_Linear velocity;
};


#endif //___Path_Point_H__
