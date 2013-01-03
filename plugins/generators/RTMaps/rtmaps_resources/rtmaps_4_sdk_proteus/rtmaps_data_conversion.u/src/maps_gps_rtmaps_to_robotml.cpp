////////////////////////////////
// RTMaps SDK Component
////////////////////////////////

////////////////////////////////
// Purpose of this module :
////////////////////////////////

#include "maps_gps_rtmaps_to_robotml.h"	// Includes the header of this component

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSgps_rtmaps_to_robotml)
	MAPS_INPUT("lla_pos",MAPS::FilterFloat64,MAPS::FifoReader)
	MAPS_INPUT("quality_indicator",MAPS::FilterInteger32,MAPS::FifoReader)
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSgps_rtmaps_to_robotml)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("gps",NavSatFix, 0)
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSgps_rtmaps_to_robotml)
    //MAPS_PROPERTY("pName",128,false,false)
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSgps_rtmaps_to_robotml)
    //MAPS_ACTION("aName",MAPSgps_rtmaps_to_robotml::ActionName)
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (gps_rtmaps_to_robotml) behaviour
MAPS_COMPONENT_DEFINITION(MAPSgps_rtmaps_to_robotml,"gps_rtmaps_to_robotml","1.0",128,
			  MAPS::Threaded,MAPS::Threaded,
			  -1, // Nb of inputs. Leave -1 to use the number of declared input definitions
			  -1, // Nb of outputs. Leave -1 to use the number of declared output definitions
			  -1, // Nb of properties. Leave -1 to use the number of declared property definitions
			  -1) // Nb of actions. Leave -1 to use the number of declared action definitions

void MAPSgps_rtmaps_to_robotml::Birth()
{
	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	m_gps_buffers.Clear();
	MAPSIOMonitor &monitor_gps=Output(0).Monitor();
	MAPSFastIOHandle it_gps;
	it_gps=monitor_gps.InitBegin();
	while (it_gps) {
		MAPSIOElt &IOElt_gps=monitor_gps[it_gps];
		IOElt_gps.Data() = (void*) new NavSatFix[1]; //TODO: replace 1 by port.upper.
		if (IOElt_gps.Data() == NULL)
			Error("Not enough memory.");
		m_gps_buffers.Append((NavSatFix*)IOElt_gps.Data());
		monitor_gps.InitNext(it_gps);
	}

	m_inputs[0] = &Input(0);
	m_inputs[1] = &Input(1);
	m_count = 0;
}

void MAPSgps_rtmaps_to_robotml::Core() 
{
	MAPSTimestamp t = SynchroStartReading(2,m_inputs,m_ioelts);
	if (t <= 0)
		return;

	if (m_ioelts[0]->VectorSize() < 3)
		Error("Unexpected vector size on lla_pos input. Should be 3 (lat, lon, alt).");

	MAPSIOElt* ioeltout = StartWriting(Output("gps"));

	NavSatFix* data_out = (NavSatFix*)ioeltout->Data();



	data_out->latitude =	m_ioelts[0]->Float64(0);
	data_out->longitude =	m_ioelts[0]->Float64(1);
	data_out->altitude =	m_ioelts[0]->Float64(2);
	data_out->status =		m_ioelts[1]->Integer32();
	data_out->position_covariance_type = 0;
	data_out->position_covariance.resize(9,0.0);
	data_out->service = 0;

	data_out->header.stamp = t;
	data_out->header.seq = m_count++;

	ioeltout->VectorSize() =  sizeof(NavSatFix); //For non-standard datatypes, by convention,  
	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);

}

void MAPSgps_rtmaps_to_robotml::Death()
{
}

//*******************************************************************************************************************
// OVERLOADED METHOD: WILL BE CALLED AT DIAGRAM EXECUTION SHUTDOWN ONCE ALL THE COMPONENTS HAVE GONE THROUGH Death().
// THIS IS THE PLACE WHERE TO RELEASE BUFFERS THAT WERE DYNAMICALLY ALLOCATED BY THE PROGRAMMER IN BIRTH. 
//*******************************************************************************************************************
void MAPSgps_rtmaps_to_robotml::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_gps;
	MAPSForallItems(it_gps,m_gps_buffers) {
		delete [] m_gps_buffers[it_gps ];
	}
	m_gps_buffers.Clear();
}
