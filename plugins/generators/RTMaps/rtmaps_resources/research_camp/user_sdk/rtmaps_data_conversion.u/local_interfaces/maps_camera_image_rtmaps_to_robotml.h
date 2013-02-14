////////////////////////////////
// RTMaps SDK Component header
////////////////////////////////

#ifndef _Maps_camera_image_rtmaps_to_robotml_H
#define _Maps_camera_image_rtmaps_to_robotml_H

#include "RobotMLModel/RobotMLModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "RobotMLModel/RobotMLModel_datatype_filters.h"

// Includes maps sdk library header
#include "maps.hpp"

// Declares a new MAPSComponent child class
class MAPScamera_image_rtmaps_to_robotml : public MAPSComponent 
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPScamera_image_rtmaps_to_robotml)
private :
	// Place here your specific methods and attributes
	MAPSList<Image*> m_video_buffers;
	MAPSList<CameraInfo*> m_calibrate_buffers;
	bool m_first_time;
	int m_count;

	CameraInfo	m_info;
	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();
};

#endif
