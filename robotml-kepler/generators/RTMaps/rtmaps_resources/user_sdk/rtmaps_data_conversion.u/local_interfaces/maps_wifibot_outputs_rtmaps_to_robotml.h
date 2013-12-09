////////////////////////////////
// RTMaps SDK Component header
////////////////////////////////

#ifndef _Maps_wifibot_outputs_rtmaps_to_robotml_H
#define _Maps_wifibot_outputs_rtmaps_to_robotml_H

#include "YouthChallengeModel/YouthChallengeModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "YouthChallengeModel/YouthChallengeModel_datatype_filters.h"
// Includes maps sdk library header
#include "maps.hpp"

// Declares a new MAPSComponent child class
class MAPSwifibot_outputs_rtmaps_to_robotml : public MAPSComponent 
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSwifibot_outputs_rtmaps_to_robotml)
private :
	// Place here your specific methods and attributes
	MAPSList<Speed_Tics_Left_Right*>	m_velocity_tics_left_right_buffers;
	MAPSList<Odometer_Tics_Left_Right*> m_odometer_tics_left_right_buffers;
	MAPSList<Proxi_Left_Right*>			m_proxi_left_right_buffers;
	MAPSList<Percent*>					m_batt_level_buffers;
	MAPSList<Milli_Amp*>				m_current_level_buffers;

	void Output_velocity_tics_left_right(MAPSTimestamp t,MAPSInt32 speed_left, MAPSInt32 speed_right);
	void Output_odometer_tics_left_right(MAPSTimestamp t,MAPSInt32 tics_left, MAPSInt32 tics_right);
	void Output_proxi_left_right(MAPSTimestamp t, MAPSInt32 proxi_left, MAPSInt32 proxi_right);
	void Output_batt_level(MAPSTimestamp t,MAPSInt32 batt_level);
	void Output_current_level(MAPSTimestamp t,MAPSInt32 current_level);

	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();

	MAPSInput* m_inputs[5];


};

#endif
