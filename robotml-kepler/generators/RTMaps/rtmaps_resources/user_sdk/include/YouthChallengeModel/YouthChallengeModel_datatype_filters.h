#ifndef __MAPS_YouthChallengeModel_DATATYPE_FILTERS_H__
#define __MAPS_YouthChallengeModel_DATATYPE_FILTERS_H__


#include "YouthChallengeModel/Mission_Type.h"
#include "YouthChallengeModel/Amer.h"
#include "YouthChallengeModel/Position.h"
#include "YouthChallengeModel/Position_Error.h"
#include "YouthChallengeModel/Path_Point.h"
#include "YouthChallengeModel/Velocity_Linear.h"
#include "YouthChallengeModel/Trajectory.h"
#include "YouthChallengeModel/Art_Set_Point.h"
#include "YouthChallengeModel/Goal.h"
#include "YouthChallengeModel/Distance.h"
#include "YouthChallengeModel/Metric.h"
#include "YouthChallengeModel/Angular.h"
#include "YouthChallengeModel/Color.h"
#include "YouthChallengeModel/Geometry.h"
#include "YouthChallengeModel/Velocity_Angular.h"
#include "YouthChallengeModel/Op_Set_Point.h"
#include "YouthChallengeModel/Nombre_Pos.h"
#include "YouthChallengeModel/Speed_Tics_Left_Right.h"
#include "YouthChallengeModel/Speed_Tics.h"
#include "YouthChallengeModel/Odometer_Tics.h"
#include "YouthChallengeModel/Odometer_Tics_Left_Right.h"
#include "YouthChallengeModel/Proxi_Left_Right.h"
#include "YouthChallengeModel/Percent.h"
#include "YouthChallengeModel/Milli_Amp.h"
#include "YouthChallengeModel/Odometer_Linear_Left_Right.h"
#include "YouthChallengeModel/Velocity_Angular_Left_Right.h"
#include "YouthChallengeModel/Velocity.h"
#include "YouthChallengeModel/Velocity_Error.h"
#include "YouthChallengeModel/Amer_Relative.h"
#include "YouthChallengeModel/Relative_Polar.h"
#include "YouthChallengeModel/Map.h"
#include "YouthChallengeModel/Attribute_robot.h"
#include "maps.hpp"

// The RTMaps input filter for the structure Mission_Type
const MAPSTypeFilterBase MAPSFilterMission_Type = MAPS_FILTER_USER_STRUCTURE(Mission_Type);
// The RTMaps input filter for the structure Amer
const MAPSTypeFilterBase MAPSFilterAmer = MAPS_FILTER_USER_STRUCTURE(Amer);
// The RTMaps input filter for the structure Position
const MAPSTypeFilterBase MAPSFilterPosition = MAPS_FILTER_USER_STRUCTURE(Position);
// The RTMaps input filter for the structure Position_Error
const MAPSTypeFilterBase MAPSFilterPosition_Error = MAPS_FILTER_USER_STRUCTURE(Position_Error);
// The RTMaps input filter for the structure Path_Point
const MAPSTypeFilterBase MAPSFilterPath_Point = MAPS_FILTER_USER_STRUCTURE(Path_Point);
// The RTMaps input filter for the structure Velocity_Linear
const MAPSTypeFilterBase MAPSFilterVelocity_Linear = MAPS_FILTER_USER_STRUCTURE(Velocity_Linear);
// The RTMaps input filter for the structure Trajectory
const MAPSTypeFilterBase MAPSFilterTrajectory = MAPS_FILTER_USER_STRUCTURE(Trajectory);
// The RTMaps input filter for the structure Art_Set_Point
const MAPSTypeFilterBase MAPSFilterArt_Set_Point = MAPS_FILTER_USER_STRUCTURE(Art_Set_Point);
// The RTMaps input filter for the structure Goal
const MAPSTypeFilterBase MAPSFilterGoal = MAPS_FILTER_USER_STRUCTURE(Goal);
// The RTMaps input filter for the structure Distance
const MAPSTypeFilterBase MAPSFilterDistance = MAPS_FILTER_USER_STRUCTURE(Distance);
// The RTMaps input filter for the structure Metric
const MAPSTypeFilterBase MAPSFilterMetric = MAPS_FILTER_USER_STRUCTURE(Metric);
// The RTMaps input filter for the structure Angular
const MAPSTypeFilterBase MAPSFilterAngular = MAPS_FILTER_USER_STRUCTURE(Angular);
// The RTMaps input filter for the structure Color
const MAPSTypeFilterBase MAPSFilterColor = MAPS_FILTER_USER_STRUCTURE(Color);
// The RTMaps input filter for the structure Geometry
const MAPSTypeFilterBase MAPSFilterGeometry = MAPS_FILTER_USER_STRUCTURE(Geometry);
// The RTMaps input filter for the structure Velocity_Angular
const MAPSTypeFilterBase MAPSFilterVelocity_Angular = MAPS_FILTER_USER_STRUCTURE(Velocity_Angular);
// The RTMaps input filter for the structure Op_Set_Point
const MAPSTypeFilterBase MAPSFilterOp_Set_Point = MAPS_FILTER_USER_STRUCTURE(Op_Set_Point);
// The RTMaps input filter for the structure Nombre_Pos
const MAPSTypeFilterBase MAPSFilterNombre_Pos = MAPS_FILTER_USER_STRUCTURE(Nombre_Pos);
// The RTMaps input filter for the structure Speed_Tics_Left_Right
const MAPSTypeFilterBase MAPSFilterSpeed_Tics_Left_Right = MAPS_FILTER_USER_STRUCTURE(Speed_Tics_Left_Right);
// The RTMaps input filter for the structure Speed_Tics
const MAPSTypeFilterBase MAPSFilterSpeed_Tics = MAPS_FILTER_USER_STRUCTURE(Speed_Tics);
// The RTMaps input filter for the structure Odometer_Tics
const MAPSTypeFilterBase MAPSFilterOdometer_Tics = MAPS_FILTER_USER_STRUCTURE(Odometer_Tics);
// The RTMaps input filter for the structure Odometer_Tics_Left_Right
const MAPSTypeFilterBase MAPSFilterOdometer_Tics_Left_Right = MAPS_FILTER_USER_STRUCTURE(Odometer_Tics_Left_Right);
// The RTMaps input filter for the structure Proxi_Left_Right
const MAPSTypeFilterBase MAPSFilterProxi_Left_Right = MAPS_FILTER_USER_STRUCTURE(Proxi_Left_Right);
// The RTMaps input filter for the structure Percent
const MAPSTypeFilterBase MAPSFilterPercent = MAPS_FILTER_USER_STRUCTURE(Percent);
// The RTMaps input filter for the structure Milli_Amp
const MAPSTypeFilterBase MAPSFilterMilli_Amp = MAPS_FILTER_USER_STRUCTURE(Milli_Amp);
// The RTMaps input filter for the structure Odometer_Linear_Left_Right
const MAPSTypeFilterBase MAPSFilterOdometer_Linear_Left_Right = MAPS_FILTER_USER_STRUCTURE(Odometer_Linear_Left_Right);
// The RTMaps input filter for the structure Velocity_Angular_Left_Right
const MAPSTypeFilterBase MAPSFilterVelocity_Angular_Left_Right = MAPS_FILTER_USER_STRUCTURE(Velocity_Angular_Left_Right);
// The RTMaps input filter for the structure Velocity
const MAPSTypeFilterBase MAPSFilterVelocity = MAPS_FILTER_USER_STRUCTURE(Velocity);
// The RTMaps input filter for the structure Velocity_Error
const MAPSTypeFilterBase MAPSFilterVelocity_Error = MAPS_FILTER_USER_STRUCTURE(Velocity_Error);
// The RTMaps input filter for the structure Amer_Relative
const MAPSTypeFilterBase MAPSFilterAmer_Relative = MAPS_FILTER_USER_STRUCTURE(Amer_Relative);
// The RTMaps input filter for the structure Relative_Polar
const MAPSTypeFilterBase MAPSFilterRelative_Polar = MAPS_FILTER_USER_STRUCTURE(Relative_Polar);
// The RTMaps input filter for the structure Map
const MAPSTypeFilterBase MAPSFilterMap = MAPS_FILTER_USER_STRUCTURE(Map);
// The RTMaps input filter for the structure Attribute_robot
const MAPSTypeFilterBase MAPSFilterAttribute_robot = MAPS_FILTER_USER_STRUCTURE(Attribute_robot);

#endif //__MAPS_YouthChallengeModel_DATATYPE_FILTERS_H__
