#ifndef __MAPS_RobotMLModel_DATATYPE_FILTERS_H__
#define __MAPS_RobotMLModel_DATATYPE_FILTERS_H__


#include "RobotMLModel/SpeedTics.h"
#include "RobotMLModel/Velocity_Tics_LR.h"
#include "RobotMLModel/Odo_Tics_LR.h"
#include "RobotMLModel/ProxyMeasurements.h"
#include "RobotMLModel/Zone.h"
#include "maps.hpp"

// The RTMaps input filter for the structure SpeedTics
const MAPSTypeFilterBase MAPSFilterSpeedTics = MAPS_FILTER_USER_STRUCTURE(SpeedTics);
// The RTMaps input filter for the structure Velocity_Tics_LR
const MAPSTypeFilterBase MAPSFilterVelocity_Tics_LR = MAPS_FILTER_USER_STRUCTURE(Velocity_Tics_LR);
// The RTMaps input filter for the structure Odo_Tics_LR
const MAPSTypeFilterBase MAPSFilterOdo_Tics_LR = MAPS_FILTER_USER_STRUCTURE(Odo_Tics_LR);
// The RTMaps input filter for the structure ProxyMeasurements
const MAPSTypeFilterBase MAPSFilterProxyMeasurements = MAPS_FILTER_USER_STRUCTURE(ProxyMeasurements);
// The RTMaps input filter for the structure Zone
const MAPSTypeFilterBase MAPSFilterZone = MAPS_FILTER_USER_STRUCTURE(Zone);

#endif //__MAPS_RobotMLModel_DATATYPE_FILTERS_H__
