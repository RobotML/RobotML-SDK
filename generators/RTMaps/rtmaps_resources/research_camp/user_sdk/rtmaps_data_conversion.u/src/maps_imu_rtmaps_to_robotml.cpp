////////////////////////////////
// RTMaps SDK Component
////////////////////////////////

////////////////////////////////
// Purpose of this module :
////////////////////////////////

#include "maps_imu_rtmaps_to_robotml.h"	// Includes the header of this component

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSimu_rtmaps_to_robotml)
    MAPS_INPUT("quaternion",MAPS::FilterFloat64,MAPS::FifoReader)
	MAPS_INPUT("accelerations",MAPS::FilterFloat64,MAPS::FifoReader)
	MAPS_INPUT("angular_rates",MAPS::FilterFloat64,MAPS::FifoReader)
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSimu_rtmaps_to_robotml)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("accel_girat",Imu, 0)
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSimu_rtmaps_to_robotml)
    //MAPS_PROPERTY("pName",128,false,false)
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSimu_rtmaps_to_robotml)
    //MAPS_ACTION("aName",MAPSimu_rtmaps_to_robotml::ActionName)
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (imu_rtmaps_to_robotml) behaviour
MAPS_COMPONENT_DEFINITION(MAPSimu_rtmaps_to_robotml,"imu_rtmaps_to_robotml","1.0",128,
			  MAPS::Threaded,MAPS::Threaded,
			  -1, // Nb of inputs. Leave -1 to use the number of declared input definitions
			  -1, // Nb of outputs. Leave -1 to use the number of declared output definitions
			  -1, // Nb of properties. Leave -1 to use the number of declared property definitions
			  -1) // Nb of actions. Leave -1 to use the number of declared action definitions

void MAPSimu_rtmaps_to_robotml::Birth()
{
	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	m_accel_girat_buffers.Clear();
	MAPSIOMonitor &monitor_accel_girat=Output(0).Monitor();
	MAPSFastIOHandle it_accel_girat;
	it_accel_girat=monitor_accel_girat.InitBegin();
	while (it_accel_girat) {
		MAPSIOElt &IOElt_accel_girat=monitor_accel_girat[it_accel_girat];
		IOElt_accel_girat.Data() = (void*) new Imu[1]; //TODO: replace 1 by port.upper.
		if (IOElt_accel_girat.Data() == NULL)
			Error("Not enough memory.");
		m_accel_girat_buffers.Append((Imu*)IOElt_accel_girat.Data());
		monitor_accel_girat.InitNext(it_accel_girat);
	}

	m_inputs[0] = &Input(0);
	m_inputs[1] = &Input(1);
	m_inputs[2] = &Input(2);
	m_count = 0;
}

void MAPSimu_rtmaps_to_robotml::Core() 
{
	MAPSTimestamp t = SynchroStartReading(3,m_inputs,m_ioelts);
	if (t <= 0)
		return;


	MAPSIOElt* ioeltout = StartWriting(Output("accel_girat"));

	Imu* data_out = (Imu*)ioeltout->Data();
	data_out->orientation.x = m_ioelts[0]->Float64(0);
	data_out->orientation.y = m_ioelts[0]->Float64(1);
	data_out->orientation.z = m_ioelts[0]->Float64(2);
	data_out->orientation.w = m_ioelts[0]->Float64(3);
	data_out->linear_acceleration.x = m_ioelts[1]->Float64(0);
	data_out->linear_acceleration.y = m_ioelts[1]->Float64(1);
	data_out->linear_acceleration.z = m_ioelts[1]->Float64(2);
	data_out->angular_velocity.x = m_ioelts[2]->Float64(0);
	data_out->angular_velocity.y = m_ioelts[2]->Float64(1);
	data_out->angular_velocity.z = m_ioelts[2]->Float64(2);
	data_out->header.stamp = t;
	data_out->header.seq = m_count++;

	ioeltout->VectorSize() =  sizeof(Imu); //For non-standard datatypes, by convention,  
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);

}

void MAPSimu_rtmaps_to_robotml::Death()
{
}

//*******************************************************************************************************************
// OVERLOADED METHOD: WILL BE CALLED AT DIAGRAM EXECUTION SHUTDOWN ONCE ALL THE COMPONENTS HAVE GONE THROUGH Death().
// THIS IS THE PLACE WHERE TO RELEASE BUFFERS THAT WERE DYNAMICALLY ALLOCATED BY THE PROGRAMMER IN BIRTH. 
//*******************************************************************************************************************
void MAPSimu_rtmaps_to_robotml::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_accel_girat;
	MAPSForallItems(it_accel_girat,m_accel_girat_buffers) {
		delete [] m_accel_girat_buffers[it_accel_girat ];
	}
	m_accel_girat_buffers.Clear();
}
