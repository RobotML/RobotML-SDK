////////////////////////////////
// RTMaps SDK Component
////////////////////////////////

////////////////////////////////
// Purpose of this module :
////////////////////////////////

#include "maps_wifibot_outputs_rtmaps_to_robotml.h"	// Includes the header of this component

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSwifibot_outputs_rtmaps_to_robotml)
    MAPS_INPUT("speeds_left_right",MAPS::FilterInteger32,MAPS::FifoReader)
    MAPS_INPUT("odometers_left_right",MAPS::FilterInteger32,MAPS::FifoReader)
    MAPS_INPUT("infrared_left_right",MAPS::FilterInteger32,MAPS::FifoReader)
    MAPS_INPUT("battery",MAPS::FilterInteger32,MAPS::FifoReader)
    MAPS_INPUT("current",MAPS::FilterInteger32,MAPS::FifoReader)
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSwifibot_outputs_rtmaps_to_robotml)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("velocity_tics_left_right",Speed_Tics_Left_Right, 0)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("odometer_tics_left_right",Odometer_Tics_Left_Right, 0)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("proxi_left_right",Proxi_Left_Right, 0)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("batt_level",Percent, 0)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("current_level",Milli_Amp, 0)
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSwifibot_outputs_rtmaps_to_robotml)
    //MAPS_PROPERTY("pName",128,false,false)
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSwifibot_outputs_rtmaps_to_robotml)
    //MAPS_ACTION("aName",MAPSwifibot_outputs_rtmaps_to_robotml::ActionName)
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (wifibot_outputs_rtmaps_to_robotml) behaviour
MAPS_COMPONENT_DEFINITION(MAPSwifibot_outputs_rtmaps_to_robotml,"wifibot_outputs_rtmaps_to_robotml","1.0",128,
			  MAPS::Threaded,MAPS::Threaded,
			  -1, // Nb of inputs. Leave -1 to use the number of declared input definitions
			  -1, // Nb of outputs. Leave -1 to use the number of declared output definitions
			  -1, // Nb of properties. Leave -1 to use the number of declared property definitions
			  -1) // Nb of actions. Leave -1 to use the number of declared action definitions

void MAPSwifibot_outputs_rtmaps_to_robotml::Birth()
{
	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	m_velocity_tics_left_right_buffers.Clear();
	MAPSIOMonitor &monitor_velocity_tics_left_right=Output(0).Monitor();
	MAPSFastIOHandle it_velocity_tics_left_right;
	it_velocity_tics_left_right=monitor_velocity_tics_left_right.InitBegin();
	while (it_velocity_tics_left_right) {
		MAPSIOElt &IOElt_velocity_tics_left_right=monitor_velocity_tics_left_right[it_velocity_tics_left_right];
		IOElt_velocity_tics_left_right.Data() = (void*) new Speed_Tics_Left_Right[1]; //TODO: replace 1 by port.upper.
		if (IOElt_velocity_tics_left_right.Data() == NULL)
			Error("Not enough memory.");
		m_velocity_tics_left_right_buffers.Append((Speed_Tics_Left_Right*)IOElt_velocity_tics_left_right.Data());
		monitor_velocity_tics_left_right.InitNext(it_velocity_tics_left_right);
	}
	m_odometer_tics_left_right_buffers.Clear();
	MAPSIOMonitor &monitor_odometer_tics_left_right=Output(1).Monitor();
	MAPSFastIOHandle it_odometer_tics_left_right;
	it_odometer_tics_left_right=monitor_odometer_tics_left_right.InitBegin();
	while (it_odometer_tics_left_right) {
		MAPSIOElt &IOElt_odometer_tics_left_right=monitor_odometer_tics_left_right[it_odometer_tics_left_right];
		IOElt_odometer_tics_left_right.Data() = (void*) new Odometer_Tics_Left_Right[1]; //TODO: replace 1 by port.upper.
		if (IOElt_odometer_tics_left_right.Data() == NULL)
			Error("Not enough memory.");
		m_odometer_tics_left_right_buffers.Append((Odometer_Tics_Left_Right*)IOElt_odometer_tics_left_right.Data());
		monitor_odometer_tics_left_right.InitNext(it_odometer_tics_left_right);
	}
	m_proxi_left_right_buffers.Clear();
	MAPSIOMonitor &monitor_proxi_left_right=Output(2).Monitor();
	MAPSFastIOHandle it_proxi_left_right;
	it_proxi_left_right=monitor_proxi_left_right.InitBegin();
	while (it_proxi_left_right) {
		MAPSIOElt &IOElt_proxi_left_right=monitor_proxi_left_right[it_proxi_left_right];
		IOElt_proxi_left_right.Data() = (void*) new Proxi_Left_Right[1]; //TODO: replace 1 by port.upper.
		if (IOElt_proxi_left_right.Data() == NULL)
			Error("Not enough memory.");
		m_proxi_left_right_buffers.Append((Proxi_Left_Right*)IOElt_proxi_left_right.Data());
		monitor_proxi_left_right.InitNext(it_proxi_left_right);
	}
	m_batt_level_buffers.Clear();
	MAPSIOMonitor &monitor_batt_level=Output(3).Monitor();
	MAPSFastIOHandle it_batt_level;
	it_batt_level=monitor_batt_level.InitBegin();
	while (it_batt_level) {
		MAPSIOElt &IOElt_batt_level=monitor_batt_level[it_batt_level];
		IOElt_batt_level.Data() = (void*) new Percent[1]; //TODO: replace 1 by port.upper.
		if (IOElt_batt_level.Data() == NULL)
			Error("Not enough memory.");
		m_batt_level_buffers.Append((Percent*)IOElt_batt_level.Data());
		monitor_batt_level.InitNext(it_batt_level);
	}
	m_current_level_buffers.Clear();
	MAPSIOMonitor &monitor_current_level=Output(4).Monitor();
	MAPSFastIOHandle it_current_level;
	it_current_level=monitor_current_level.InitBegin();
	while (it_current_level) {
		MAPSIOElt &IOElt_current_level=monitor_current_level[it_current_level];
		IOElt_current_level.Data() = (void*) new Milli_Amp[1]; //TODO: replace 1 by port.upper.
		if (IOElt_current_level.Data() == NULL)
			Error("Not enough memory.");
		m_current_level_buffers.Append((Milli_Amp*)IOElt_current_level.Data());
		monitor_current_level.InitNext(it_current_level);
	}
}

void MAPSwifibot_outputs_rtmaps_to_robotml::Core() 
{
	int input_that_answered;
	MAPSIOElt* ioeltin = StartReading(5,m_inputs,&input_that_answered);
	if (ioeltin == NULL)
		return;

	switch(input_that_answered) {
	case 0: //Received a velocity ticks input
		Output_velocity_tics_left_right(ioeltin->Timestamp(),ioeltin->Integer32(0),ioeltin->Integer32(1));
		break;
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	default:
		Error("Unknown input.");
	}
}

void MAPSwifibot_outputs_rtmaps_to_robotml::Output_velocity_tics_left_right(MAPSTimestamp t, MAPSInt32 speed_left, MAPSInt32 speed_right)
{
	MAPSIOElt* ioeltout = StartWriting(Output("velocity_tics_left_right"));

	Speed_Tics_Left_Right* data_out = (Speed_Tics_Left_Right*)ioeltout->Data();
	data_out->speed_tics_left.value = speed_left;
	data_out->speed_tics_right.value = speed_right;
	ioeltout->VectorSize() =  sizeof(Speed_Tics_Left_Right); //For non-standard datatypes, by convention,  
	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);

}
//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port odometer_tics_left_right
void MAPSwifibot_outputs_rtmaps_to_robotml::Output_odometer_tics_left_right(MAPSTimestamp t, MAPSInt32 tics_left, MAPSInt32 tics_right)
{
	MAPSIOElt* ioeltout = StartWriting(Output("odometer_tics_left_right"));

	Odometer_Tics_Left_Right* data_out = (Odometer_Tics_Left_Right*)ioeltout->Data();
	data_out->odometer_tics_left.value = tics_left;
	data_out->odometer_tics_right.value = tics_right;

	ioeltout->VectorSize() =  sizeof(Odometer_Tics_Left_Right); //For non-standard datatypes, by convention,  
	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}
//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port proxi_left_right
void MAPSwifibot_outputs_rtmaps_to_robotml::Output_proxi_left_right(MAPSTimestamp t, MAPSInt32 proxi_left, MAPSInt32 proxi_right)
{
	MAPSIOElt* ioeltout = StartWriting(Output("proxi_left_right"));

	Proxi_Left_Right* data_out = (Proxi_Left_Right*)ioeltout->Data();
	data_out->proxi_left.value = proxi_left;
	data_out->proxi_right.value = proxi_right;

	ioeltout->VectorSize() =  sizeof(Proxi_Left_Right); //For non-standard datatypes, by convention,  
	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}
//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port batt_level
void MAPSwifibot_outputs_rtmaps_to_robotml::Output_batt_level(MAPSTimestamp t, MAPSInt32 batt_level)
{
	MAPSIOElt* ioeltout = StartWriting(Output("batt_level"));

	Percent* data_out = (Percent*)ioeltout->Data();
	data_out->value = batt_level;
	ioeltout->VectorSize() =  sizeof(Percent); //For non-standard datatypes, by convention,  
	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}
//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port current_level
void MAPSwifibot_outputs_rtmaps_to_robotml::Output_current_level(MAPSTimestamp t, MAPSInt32 current_level)
{
	MAPSIOElt* ioeltout = StartWriting(Output("current_level"));

	Milli_Amp* data_out = (Milli_Amp*)ioeltout->Data();
	data_out->value = current_level;
	ioeltout->VectorSize() =  sizeof(Milli_Amp); //For non-standard datatypes, by convention,  
	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}

void MAPSwifibot_outputs_rtmaps_to_robotml::Death()
{
}

void MAPSwifibot_outputs_rtmaps_to_robotml::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_velocity_tics_left_right;
	MAPSForallItems(it_velocity_tics_left_right,m_velocity_tics_left_right_buffers) {
		delete [] m_velocity_tics_left_right_buffers[it_velocity_tics_left_right ];
	}
	m_velocity_tics_left_right_buffers.Clear();
	MAPSListIterator it_odometer_tics_left_right;
	MAPSForallItems(it_odometer_tics_left_right,m_odometer_tics_left_right_buffers) {
		delete [] m_odometer_tics_left_right_buffers[it_odometer_tics_left_right ];
	}
	m_odometer_tics_left_right_buffers.Clear();
	MAPSListIterator it_proxi_left_right;
	MAPSForallItems(it_proxi_left_right,m_proxi_left_right_buffers) {
		delete [] m_proxi_left_right_buffers[it_proxi_left_right ];
	}
	m_proxi_left_right_buffers.Clear();
	MAPSListIterator it_batt_level;
	MAPSForallItems(it_batt_level,m_batt_level_buffers) {
		delete [] m_batt_level_buffers[it_batt_level ];
	}
	m_batt_level_buffers.Clear();
	MAPSListIterator it_current_level;
	MAPSForallItems(it_current_level,m_current_level_buffers) {
		delete [] m_current_level_buffers[it_current_level ];
	}
	m_current_level_buffers.Clear();
}
