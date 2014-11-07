////////////////////////////////
// RTMaps SDK Component header
////////////////////////////////

#ifndef _Maps_gps_rtmaps_to_robotml_H
#define _Maps_gps_rtmaps_to_robotml_H

#include "YouthChallengeModel/YouthChallengeModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "YouthChallengeModel/YouthChallengeModel_datatype_filters.h"
// Includes maps sdk library header
#include "maps.hpp"

// Declares a new MAPSComponent child class
class MAPSgps_rtmaps_to_robotml : public MAPSComponent 
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSgps_rtmaps_to_robotml)
private :
	// Place here your specific methods and attributes
	MAPSList<NavSatFix*> m_gps_buffers;

	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();

	MAPSInput*	m_inputs[2];
	MAPSIOElt*	m_ioelts[2];
	int			m_count;
};

#endif
