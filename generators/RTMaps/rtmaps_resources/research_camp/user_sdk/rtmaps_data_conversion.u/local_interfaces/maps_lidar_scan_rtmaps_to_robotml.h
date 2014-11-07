////////////////////////////////
// RTMaps SDK Component header
////////////////////////////////

#ifndef _Maps_lidar_scan_rtmaps_to_robotml_H
#define _Maps_lidar_scan_rtmaps_to_robotml_H

#include "RobotMLModel/RobotMLModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "RobotMLModel/RobotMLModel_datatype_filters.h"

// Includes maps sdk library header
#include "maps.hpp"

// Declares a new MAPSComponent child class
class MAPSlidar_scan_rtmaps_to_robotml : public MAPSComponent 
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSlidar_scan_rtmaps_to_robotml)
private :
	// Place here your specific methods and attributes
	MAPSList<LaserScan*> _laser_scan_buffers;
	MAPSList<DiagnosticStatus*> _status_buffers;
	
	int				m_nb_layers;
	MAPSFloat64		m_angle_min;
	MAPSFloat64		m_angle_max;
	MAPSFloat64		m_angle_inc;
	MAPSFloat64		m_range_min;
	MAPSFloat64		m_range_max;
	MAPSUInt32		m_seq;

	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();

};

#endif
