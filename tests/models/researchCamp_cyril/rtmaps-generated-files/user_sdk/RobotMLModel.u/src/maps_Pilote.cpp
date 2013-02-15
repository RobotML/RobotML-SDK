
#include "maps_Pilote.h"
// Start of user code Additional includes
// End of user code

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSPilote)
	MAPS_INPUT("input",MAPSFilterZone,MAPS::FifoReader)
// 	Start of user code Additional input definitions
// 	End of user code
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSPilote)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("ouput",SpeedTics, 0)
// 	Start of user code Additional output definitions
// 	End of user code
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSPilote)
// 	Start of user code Additional property definitions
// 	End of user code
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSPilote)
// 	Start of user code Additional action definitions
// 	End of user code
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (Pilote) behaviour
MAPS_COMPONENT_DEFINITION(MAPSPilote,"Pilote","1.0",128,
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
void MAPSPilote::Birth()
{

	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	_ouput_buffers.Clear();
	MAPSIOMonitor &monitor_ouput=Output(0).Monitor();
	MAPSFastIOHandle it_ouput;
	it_ouput=monitor_ouput.InitBegin();
	while (it_ouput) {
		MAPSIOElt &IOElt_ouput=monitor_ouput[it_ouput];
		IOElt_ouput.Data() = (void*) new SpeedTics[1]; //TODO: replace 1 by port.upper.
		if (IOElt_ouput.Data() == NULL)
			Error("Not enough memory.");
		_ouput_buffers.Append((SpeedTics*)IOElt_ouput.Data());
		monitor_ouput.InitNext(it_ouput);
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
void MAPSPilote::Core() 
{
	//Without specification of reading policies, let's implement the most generic case:
	//an asynchronous blocking read on all the inputs.
	int input_that_answered;
	MAPSIOElt* ioelt_in = StartReading(_nb_inputs, _inputs, &input_that_answered);
	if (ioelt_in == NULL)
		return;

	MAPSTimestamp timestamp_in = ioelt_in->Timestamp();

	switch (input_that_answered) {
		case 0: //We received an element from port input.
			{
			int count = ioelt_in->VectorSize() / sizeof(Zone);
			Zone* data_in = (Zone*)ioelt_in->Data();
			Zone_Received_on_input_InPort(data_in,count, ioelt_in->Timestamp());			
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
void MAPSPilote::Zone_Received_on_input_InPort(Zone* data_in, int count, MAPSTimestamp t)
{
//	Start of user code Processing code for samples received on Zone




    MAPSStreamedString ss ;

    ss << "Mesures en cm :\n " ;
    ss << "         " <<  data_in->values[2] << "\n" ;
    ss << "    " <<  data_in->values[3] << "    " << data_in->values[1] << "\n" ;
    ss << "  " <<  data_in->values[4] << "      " << data_in->values[0] << "\n" ;

    ReportInfo( ss ) ;




//	End of user code
}


//**********************************************************************************************
// OUTPUT METHODS TO BE CALLED BY THE PROGRAMMER FOR EMITTING A SAMPLE ON AN OUTPUT PORT.
//**********************************************************************************************

//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port ouput
void MAPSPilote::Output_ouput(MAPSTimestamp t)
{
	MAPSIOElt* ioeltout = StartWriting(Output("ouput"));

// 	Start of user code Output on ouput implementation
	int count_SpeedTics_out = 1; 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	SpeedTics* data_out = (SpeedTics*)ioeltout->Data();

	//Fill in data_out here.
	//....

	ioeltout->VectorSize() =  count_SpeedTics_out * sizeof(SpeedTics); //For non-standard datatypes, by convention,  
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}

//**********************************************************************************************
// RELEASE FUNCTION.
// CALLED ONCE WHEN DIAGRAMS STOPS EXECUTING OR AFTER A CALL TO Error("..."); IN Birth OR Core.
//**********************************************************************************************
void MAPSPilote::Death()
{
// 	Start of user code Death implementation
// 	End of user code

}

//*******************************************************************************************************************
// OVERLOADED METHOD: WILL BE CALLED AT DIAGRAM EXECUTION SHUTDOWN ONCE ALL THE COMPONENTS HAVE GONE THROUGH Death().
// THIS IS THE PLACE WHERE TO RELEASE BUFFERS THAT WERE DYNAMICALLY ALLOCATED BY THE PROGRAMMER IN BIRTH. 
//*******************************************************************************************************************
void MAPSPilote::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_ouput;
	MAPSForallItems(it_ouput,_ouput_buffers) {
		delete [] _ouput_buffers[it_ouput ];
	}
	_ouput_buffers.Clear();
}

// Start of user code Additional methods for MAPSPilote
// End of user code

