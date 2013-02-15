#ifndef __MAPS_Perception_HPP__
#define __MAPS_Perception_HPP__

#include "RobotMLModel/RobotMLModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "RobotMLModel/RobotMLModel_datatype_filters.h"
#include "maps.hpp"

// Start of user code Additional includes
// End of user code

// Start of user code Default max output vector size
#define DEFAULT_OUTPUT_MAX_VECTOR_SIZE 1024
// End of user code

class MAPSPerception : public MAPSComponent
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSPerception)
// 	Start of user code Overloaded methods declarations (Dynamic, Set...)
// 	End of user code
private :
	// Place here your specific methods and attributes
	int 		_nb_inputs;
	MAPSInput** _inputs;

	void LaserScan_Received_on_input_InPort(LaserScan* data_in, int count, MAPSTimestamp t);
	

	MAPSList<Zone*> _output_buffers;

		void Output_output(MAPSTimestamp t);

	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();

// 	Start of user code Additional members and methods
// 	End of user code
};

#endif //__MAPS_Perception_HPP__
