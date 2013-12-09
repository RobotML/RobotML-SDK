////////////////////////////////
// RTMaps SDK Component header
////////////////////////////////

#ifndef _Maps_imu_rtmaps_to_robotml_H
#define _Maps_imu_rtmaps_to_robotml_H

#include "YouthChallengeModel/YouthChallengeModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "YouthChallengeModel/YouthChallengeModel_datatype_filters.h"

// Includes maps sdk library header
#include "maps.hpp"

// Declares a new MAPSComponent child class
class MAPSimu_rtmaps_to_robotml : public MAPSComponent 
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSimu_rtmaps_to_robotml)
private :
	// Place here your specific methods and attributes
	MAPSList<Imu*>	m_accel_girat_buffers;

	MAPSUInt32		m_count;

	MAPSInput*		m_inputs[3];
	MAPSIOElt*		m_ioelts[3];
	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();
};

#endif
