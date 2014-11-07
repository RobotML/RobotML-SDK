////////////////////////////////
// RTMaps SDK Component header
////////////////////////////////

#ifndef _Maps_lidar_scan_robotml_to_rtmaps_H
#define _Maps_lidar_scan_robotml_to_rtmaps_H

// Includes maps sdk library header
#include "maps.hpp"
#include "RobotMLModel/RobotMLModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "RobotMLModel/RobotMLModel_datatype_filters.h"

// Declares a new MAPSComponent child class
class MAPSlidar_scan_robotml_to_rtmaps : public MAPSComponent 
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSlidar_scan_robotml_to_rtmaps)
private :
	// Place here your specific methods and attributes
	bool _first_time;
	int _max_nb_points;
};

#endif
