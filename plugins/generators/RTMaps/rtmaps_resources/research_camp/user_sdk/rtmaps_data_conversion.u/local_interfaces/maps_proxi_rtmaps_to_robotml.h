////////////////////////////////
// RTMaps SDK Component header
////////////////////////////////

#ifndef _Maps_proxi_rtmaps_to_robotml_H
#define _Maps_proxi_rtmaps_to_robotml_H

#include "RobotMLModel/RobotMLModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "RobotMLModel/RobotMLModel_datatype_filters.h"

// Includes maps sdk library header
#include "maps.hpp"

// Declares a new MAPSComponent child class
class MAPSproxi_rtmaps_to_robotml : public MAPSComponent 
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSproxi_rtmaps_to_robotml)
private :
	// Place here your specific methods and attributes
	MAPSList<Proxi_Left_Right*> m_proxi_left_right_buffers;

	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();

};

#endif
