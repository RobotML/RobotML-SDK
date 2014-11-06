////////////////////////////////
// RTMaps SDK Component
////////////////////////////////

////////////////////////////////
// Purpose of this module :
////////////////////////////////

#include "maps_wifibot_inputs_robotml_to_rtmaps.h"	// Includes the header of this component

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSwifibot_inputs_robotml_to_rtmaps)
	MAPS_INPUT("speed_tics_left_right",MAPSFilterSpeedTics,MAPS::FifoReader)
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSwifibot_inputs_robotml_to_rtmaps)
	MAPS_OUTPUT("left_right_speeds",MAPS::Integer32,NULL,NULL,2)
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSwifibot_inputs_robotml_to_rtmaps)
    //MAPS_PROPERTY("pName",128,false,false)
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSwifibot_inputs_robotml_to_rtmaps)
    //MAPS_ACTION("aName",MAPSwifibot_inputs_robotml_to_rtmaps::ActionName)
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (wifibot_inputs_robotml_to_rtmaps) behaviour
MAPS_COMPONENT_DEFINITION(MAPSwifibot_inputs_robotml_to_rtmaps,"wifibot_inputs_robotml_to_rtmaps","1.0",128,
MAPS::Threaded|MAPS::Sequential,MAPS::Sequential,
			  -1, // Nb of inputs. Leave -1 to use the number of declared input definitions
			  -1, // Nb of outputs. Leave -1 to use the number of declared output definitions
			  -1, // Nb of properties. Leave -1 to use the number of declared property definitions
			  -1) // Nb of actions. Leave -1 to use the number of declared action definitions

void MAPSwifibot_inputs_robotml_to_rtmaps::Birth()
{
}

void MAPSwifibot_inputs_robotml_to_rtmaps::Core() 
{
	MAPSIOElt* ioeltin = StartReading(Input(0));
	if (ioeltin == NULL)
		return;

	SpeedTics* data_in = (SpeedTics*)ioeltin->Data();

	MAPSIOElt* ioeltout = StartWriting(Output(0));
	ioeltout->Integer32(0) = data_in->omega_l;
	ioeltout->Integer32(1) = data_in->omega_r;

	ioeltout->Timestamp() = ioeltin->Timestamp();
	StopWriting(ioeltout);
}

void MAPSwifibot_inputs_robotml_to_rtmaps::Death()
{
}
