#ifndef ___Goal_H__
#define ___Goal_H__

#include "robotml/Velocity_Linear.h"
#include "robotml/Distance.h"
#include "YouthChallengeModel/Mission_Type.h"
#include "YouthChallengeModel/Amer.h"
#include "robotml/Pose2D.h"
#include "robotml/Pose2D.h"
#include "robotml/Angular.h"
#include "robotml/Angular.h"

class Goal {
	public:
	Mission_Type mission_type;
	Pose2D position;
	Pose2D position_error;
	Angular orientation;
	Angular angular_aperture;
	Distance distance;
	Velocity_Linear velocity_average;
	Amer amer_to_identify;
};


#endif //___Goal_H__
