#ifndef __MAPS_ChassisRobot_HPP__
#define __MAPS_ChassisRobot_HPP__

#include "RobotMLModel/RobotMLModel_datatypes_all.h"
#include "robotml/maps_robotml_datatype_filters.h"
#include "RobotMLModel/RobotMLModel_datatype_filters.h"
#include "maps.hpp"

// Start of user code Additional includes
// End of user code

// Start of user code Default max output vector size
#define DEFAULT_OUTPUT_MAX_VECTOR_SIZE 1024
// End of user code

class MAPSChassisRobot : public MAPSComponent
{
	// Use standard header definition macro
	MAPS_COMPONENT_STANDARD_HEADER_CODE(MAPSChassisRobot)
// 	Start of user code Overloaded methods declarations (Dynamic, Set...)
// 	End of user code
private :
	// Place here your specific methods and attributes
	int 		_nb_inputs;
	MAPSInput** _inputs;

	void SpeedTics_Received_on_Input_InPort(SpeedTics* data_in, int count, MAPSTimestamp t);
	

	MAPSList<Velocity_Tics_LR*> _Velocity_out_buffers;
	MAPSList<Odo_Tics_LR*> _OdoTics_out_buffers;
	MAPSList<ProxyMeasurements*> _ProxyMeas_out_buffers;

		void Output_Velocity_out(MAPSTimestamp t);
		void Output_OdoTics_out(MAPSTimestamp t);
		void Output_ProxyMeas_out(MAPSTimestamp t);
		void Output_Battery_out(MAPSTimestamp t);
		void Output_Current_out(MAPSTimestamp t);

	//As we may allocate output buffers "by hand", we need to handle de-allocation as well
	//so we need to overload the FreeBuffers method.
	void FreeBuffers();

// 	Start of user code Additional members and methods
// 	End of user code
};

#endif //__MAPS_ChassisRobot_HPP__
