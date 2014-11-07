////////////////////////////////
// RTMaps SDK Component header
////////////////////////////////

#ifndef _Maps_wifibot_outputs_rtmaps_to_robotml_H
#define _Maps_wifibot_outputs_rtmaps_to_robotml_H

#include "RobotMLModel/RobotMLModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "RobotMLModel/RobotMLModel_datatype_filters.h"

// Includes maps sdk library header
#include "maps.hpp"

// Declares a new MAPSComponent child class
class MAPSwifibot_outputs_rtmaps_to_robotml : public MAPSComponent 
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSwifibot_outputs_rtmaps_to_robotml)
private :
	// Place here your specific methods and attributes
	MAPSList<Velocity_Tics_LR*>	m_velocity_tics_left_right_buffers;
	MAPSList<Odo_Tics_LR*> m_odometer_tics_left_right_buffers;
	MAPSList<ProxyMeasurements*>			m_proxi_left_right_buffers;

	void Output_velocity_tics_left_right(MAPSTimestamp t,MAPSInt32 speed_left, MAPSInt32 speed_right);
	void Output_odometer_tics_left_right(MAPSTimestamp t,MAPSInt32 tics_left, MAPSInt32 tics_right);
	void Output_proxi_left_right(MAPSTimestamp t, MAPSInt32 proxi_left, MAPSInt32 proxi_right);

	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();

	MAPSInput* m_inputs[3];


};

#endif
