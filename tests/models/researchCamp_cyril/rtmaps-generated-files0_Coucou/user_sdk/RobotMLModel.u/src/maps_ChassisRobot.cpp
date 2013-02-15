
#include "maps_ChassisRobot.h"
// Start of user code Additional includes
// End of user code

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSChassisRobot)
	MAPS_INPUT("Input",MAPSFilterSpeedTics,MAPS::FifoReader)
// 	Start of user code Additional input definitions
// 	End of user code
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSChassisRobot)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("Velocity_out",Velocity_Tics_LR, 0)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("OdoTics_out",Odo_Tics_LR, 0)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("ProxyMeas_out",ProxyMeasurements, 0)
	MAPS_OUTPUT("Battery_out",MAPS::Integer32,NULL,NULL,1)
	MAPS_OUTPUT("Current_out",MAPS::Integer32,NULL,NULL,1)
// 	Start of user code Additional output definitions
// 	End of user code
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSChassisRobot)
// 	Start of user code Additional property definitions
// 	End of user code
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSChassisRobot)
// 	Start of user code Additional action definitions
// 	End of user code
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (ChassisRobot) behaviour
MAPS_COMPONENT_DEFINITION(MAPSChassisRobot,"ChassisRobot","1.0",128,
			  MAPS::Threaded,MAPS::Threaded,
			  -1, // Nb of inputs. Leave -1 to use the number of declared input definitions
			  -1, // Nb of outputs. Leave -1 to use the number of declared output definitions
			  -1, // Nb of properties. Leave -1 to use the number of declared property definitions
			  -1) // Nb of actions. Leave -1 to use the number of declared action definitions


// Start of user code Overloaded methods from MAPSComponent (Dynamic, Set...
// End of user code

//***********************************************
// INITIALIZATION FUNCTION.
// CALLED ONCE AT DIAGRAM EXECUTION START.
//***********************************************
void MAPSChassisRobot::Birth()
{

	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	_Velocity_out_buffers.Clear();
	MAPSIOMonitor &monitor_Velocity_out=Output(0).Monitor();
	MAPSFastIOHandle it_Velocity_out;
	it_Velocity_out=monitor_Velocity_out.InitBegin();
	while (it_Velocity_out) {
		MAPSIOElt &IOElt_Velocity_out=monitor_Velocity_out[it_Velocity_out];
		IOElt_Velocity_out.Data() = (void*) new Velocity_Tics_LR[1]; //TODO: replace 1 by port.upper.
		if (IOElt_Velocity_out.Data() == NULL)
			Error("Not enough memory.");
		_Velocity_out_buffers.Append((Velocity_Tics_LR*)IOElt_Velocity_out.Data());
		monitor_Velocity_out.InitNext(it_Velocity_out);
	}
	_OdoTics_out_buffers.Clear();
	MAPSIOMonitor &monitor_OdoTics_out=Output(1).Monitor();
	MAPSFastIOHandle it_OdoTics_out;
	it_OdoTics_out=monitor_OdoTics_out.InitBegin();
	while (it_OdoTics_out) {
		MAPSIOElt &IOElt_OdoTics_out=monitor_OdoTics_out[it_OdoTics_out];
		IOElt_OdoTics_out.Data() = (void*) new Odo_Tics_LR[1]; //TODO: replace 1 by port.upper.
		if (IOElt_OdoTics_out.Data() == NULL)
			Error("Not enough memory.");
		_OdoTics_out_buffers.Append((Odo_Tics_LR*)IOElt_OdoTics_out.Data());
		monitor_OdoTics_out.InitNext(it_OdoTics_out);
	}
	_ProxyMeas_out_buffers.Clear();
	MAPSIOMonitor &monitor_ProxyMeas_out=Output(2).Monitor();
	MAPSFastIOHandle it_ProxyMeas_out;
	it_ProxyMeas_out=monitor_ProxyMeas_out.InitBegin();
	while (it_ProxyMeas_out) {
		MAPSIOElt &IOElt_ProxyMeas_out=monitor_ProxyMeas_out[it_ProxyMeas_out];
		IOElt_ProxyMeas_out.Data() = (void*) new ProxyMeasurements[1]; //TODO: replace 1 by port.upper.
		if (IOElt_ProxyMeas_out.Data() == NULL)
			Error("Not enough memory.");
		_ProxyMeas_out_buffers.Append((ProxyMeasurements*)IOElt_ProxyMeas_out.Data());
		monitor_ProxyMeas_out.InitNext(it_ProxyMeas_out);
	}

	//Initialize a member array containing pointers to the component inputs for
	//use in the Core() function with the asynchronous StartReading.
	_nb_inputs = 1;
	_inputs = new MAPSInput*[_nb_inputs];
	for (int i=0; i<_nb_inputs; i++) {
		_inputs[i] = &Input(i);
	}

// 	Start of user code User-specific initalizations
// 	End of user code

}

//****************************************************************************
// Core() IS THE MAIN EXECUTION LOOP FUNCTION.
// THE ONE AND ONLY BLOCKING CALL IN HERE SHALL BE THE StartReading function.
//****************************************************************************
void MAPSChassisRobot::Core() 
{
	//Without specification of reading policies, let's implement the most generic case:
	//an asynchronous blocking read on all the inputs.
	int input_that_answered;
	MAPSIOElt* ioelt_in = StartReading(_nb_inputs, _inputs, &input_that_answered);
	if (ioelt_in == NULL)
		return;

	MAPSTimestamp timestamp_in = ioelt_in->Timestamp();

	switch (input_that_answered) {
		case 0: //We received an element from port Input.
			{
			int count = ioelt_in->VectorSize() / sizeof(SpeedTics);
			SpeedTics* data_in = (SpeedTics*)ioelt_in->Data();
			SpeedTics_Received_on_Input_InPort(data_in,count, ioelt_in->Timestamp());			
			} 
			break;
		default:
			Error("Unknown input.");	
	}
// 	Start of user code Core processing
// 	End of user code

}


//**********************************************************************************************
// INPUT METHODS CALLED FROM THE Core() METHOD WHENEVER A SAMPLE IS RECEIVED ON AN INPUT PORT
// NOTE THAT IN CORE, OTHER SAMPLING STRATEGIES COULD BE AVAILABE (SYNCHRONIZED, TRIGGERED, RESAMPLING...)
// BUT ARE NOT IMPLEMENTED YET.
//**********************************************************************************************

//This callback will be called each time a new sample is received on the corresponding input port.
void MAPSChassisRobot::SpeedTics_Received_on_Input_InPort(SpeedTics* data_in, int count, MAPSTimestamp t)
{
//	Start of user code Processing code for samples received on SpeedTics
//	End of user code
}


//**********************************************************************************************
// OUTPUT METHODS TO BE CALLED BY THE PROGRAMMER FOR EMITTING A SAMPLE ON AN OUTPUT PORT.
//**********************************************************************************************

//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port Velocity_out
void MAPSChassisRobot::Output_Velocity_out(MAPSTimestamp t)
{
	MAPSIOElt* ioeltout = StartWriting(Output("Velocity_out"));

// 	Start of user code Output on Velocity_out implementation
	int count_Velocity_Tics_LR_out = 1; 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	Velocity_Tics_LR* data_out = (Velocity_Tics_LR*)ioeltout->Data();

	//Fill in data_out here.
	//....

	ioeltout->VectorSize() =  count_Velocity_Tics_LR_out * sizeof(Velocity_Tics_LR); //For non-standard datatypes, by convention,  
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}
//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port OdoTics_out
void MAPSChassisRobot::Output_OdoTics_out(MAPSTimestamp t)
{
	MAPSIOElt* ioeltout = StartWriting(Output("OdoTics_out"));

// 	Start of user code Output on OdoTics_out implementation
	int count_Odo_Tics_LR_out = 1; 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	Odo_Tics_LR* data_out = (Odo_Tics_LR*)ioeltout->Data();

	//Fill in data_out here.
	//....

	ioeltout->VectorSize() =  count_Odo_Tics_LR_out * sizeof(Odo_Tics_LR); //For non-standard datatypes, by convention,  
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}
//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port ProxyMeas_out
void MAPSChassisRobot::Output_ProxyMeas_out(MAPSTimestamp t)
{
	MAPSIOElt* ioeltout = StartWriting(Output("ProxyMeas_out"));

// 	Start of user code Output on ProxyMeas_out implementation
	int count_ProxyMeasurements_out = 1; 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	ProxyMeasurements* data_out = (ProxyMeasurements*)ioeltout->Data();

	//Fill in data_out here.
	//....

	ioeltout->VectorSize() =  count_ProxyMeasurements_out * sizeof(ProxyMeasurements); //For non-standard datatypes, by convention,  
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}
//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port Battery_out
void MAPSChassisRobot::Output_Battery_out(MAPSTimestamp t)
{
	MAPSIOElt* ioeltout = StartWriting(Output("Battery_out"));

// 	Start of user code Output on Battery_out implementation
	int count_Int8_out = 1; 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	MAPSInt32* data_out = &ioeltout->Integer32();

	//Fill in data_out here.
	//....

	ioeltout->VectorSize() =  count_Int8_out; //Number of elements in output vector (not number of bytes).
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}
//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port Current_out
void MAPSChassisRobot::Output_Current_out(MAPSTimestamp t)
{
	MAPSIOElt* ioeltout = StartWriting(Output("Current_out"));

// 	Start of user code Output on Current_out implementation
	int count_Int8_out = 1; 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	MAPSInt32* data_out = &ioeltout->Integer32();

	//Fill in data_out here.
	//....

	ioeltout->VectorSize() =  count_Int8_out; //Number of elements in output vector (not number of bytes).
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}

//**********************************************************************************************
// RELEASE FUNCTION.
// CALLED ONCE WHEN DIAGRAMS STOPS EXECUTING OR AFTER A CALL TO Error("..."); IN Birth OR Core.
//**********************************************************************************************
void MAPSChassisRobot::Death()
{
// 	Start of user code Death implementation
// 	End of user code

}

//*******************************************************************************************************************
// OVERLOADED METHOD: WILL BE CALLED AT DIAGRAM EXECUTION SHUTDOWN ONCE ALL THE COMPONENTS HAVE GONE THROUGH Death().
// THIS IS THE PLACE WHERE TO RELEASE BUFFERS THAT WERE DYNAMICALLY ALLOCATED BY THE PROGRAMMER IN BIRTH. 
//*******************************************************************************************************************
void MAPSChassisRobot::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_Velocity_out;
	MAPSForallItems(it_Velocity_out,_Velocity_out_buffers) {
		delete [] _Velocity_out_buffers[it_Velocity_out ];
	}
	_Velocity_out_buffers.Clear();
	MAPSListIterator it_OdoTics_out;
	MAPSForallItems(it_OdoTics_out,_OdoTics_out_buffers) {
		delete [] _OdoTics_out_buffers[it_OdoTics_out ];
	}
	_OdoTics_out_buffers.Clear();
	MAPSListIterator it_ProxyMeas_out;
	MAPSForallItems(it_ProxyMeas_out,_ProxyMeas_out_buffers) {
		delete [] _ProxyMeas_out_buffers[it_ProxyMeas_out ];
	}
	_ProxyMeas_out_buffers.Clear();
}

// Start of user code Additional methods for MAPSChassisRobot
// End of user code

