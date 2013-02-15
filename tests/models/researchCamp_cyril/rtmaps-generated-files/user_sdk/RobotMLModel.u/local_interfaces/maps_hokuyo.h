#ifndef __MAPS_hokuyo_HPP__
#define __MAPS_hokuyo_HPP__

#include "RobotMLModel/RobotMLModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "RobotMLModel/RobotMLModel_datatype_filters.h"
#include "maps.hpp"

// Start of user code Additional includes
// End of user code

// Start of user code Default max output vector size
#define DEFAULT_OUTPUT_MAX_VECTOR_SIZE 1024
// End of user code

class MAPShokuyo : public MAPSComponent
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPShokuyo)
// 	Start of user code Overloaded methods declarations (Dynamic, Set...)
// 	End of user code
private :
	// Place here your specific methods and attributes
	

	MAPSList<LaserScan*> _data_buffers;

		void Output_data(MAPSTimestamp t);

	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();

// 	Start of user code Additional members and methods
// 	End of user code
};

#endif //__MAPS_hokuyo_HPP__
