
#include "maps_Perception.h"
// Start of user code Additional includes
// End of user code

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSPerception)
	MAPS_INPUT("input",MAPSFilterLaserScan,MAPS::FifoReader)
// 	Start of user code Additional input definitions
// 	End of user code
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSPerception)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("output",Zone, 0)
// 	Start of user code Additional output definitions
// 	End of user code
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSPerception)
// 	Start of user code Additional property definitions
// 	End of user code
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSPerception)
// 	Start of user code Additional action definitions
// 	End of user code
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (Perception) behaviour
MAPS_COMPONENT_DEFINITION(MAPSPerception,"Perception","1.0",128,
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
void MAPSPerception::Birth()
{

	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	_output_buffers.Clear();
	MAPSIOMonitor &monitor_output=Output(0).Monitor();
	MAPSFastIOHandle it_output;
	it_output=monitor_output.InitBegin();
	while (it_output) {
		MAPSIOElt &IOElt_output=monitor_output[it_output];
		IOElt_output.Data() = (void*) new Zone[1]; //TODO: replace 1 by port.upper.
		if (IOElt_output.Data() == NULL)
			Error("Not enough memory.");
		_output_buffers.Append((Zone*)IOElt_output.Data());
		monitor_output.InitNext(it_output);
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
void MAPSPerception::Core() 
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
			int count = ioelt_in->VectorSize() / sizeof(LaserScan);
			LaserScan* data_in = (LaserScan*)ioelt_in->Data();
			LaserScan_Received_on_input_InPort(data_in,count, ioelt_in->Timestamp());			
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
void MAPSPerception::LaserScan_Received_on_input_InPort(LaserScan* data_in, int count, MAPSTimestamp t)
{
//	Start of user code Processing code for samples received on LaserScan

    int i ;
    MAPSFloat32 Range_Min ;

    // Partie Droite (135° a 45) :
    Range_Min = 40.0 ;
    for (i=0 ; i < 361 ; i++ )
    {       if ( data_in->range[i] < Range_Min )
                        Range_Min = data_in->range[i] ;
    }
    m_rfl[0]= (UInt16)(Range_Min*100) ;

    // Partie Frontale Droite (45° a 20°) :
    Range_Min = 40.0 ;
    for (i=361 ; i < 421 ; i++ )
    {       if ( data_in->range[i] < Range_Min )
                        Range_Min = data_in->range[i] ;
    }
    m_rfl[1]= (UInt16)(Range_Min*100) ;

    // Partie Frontale (20° a -20°) :
    Range_Min = 40.0 ;
    for (i=461 ; i < 621 ; i++ )
    {       if ( data_in->range[i] < Range_Min )
                        Range_Min = data_in->range[i] ;
    }
    m_rfl[2]= (UInt16)(Range_Min*100) ;


    // Partie Frontale Gauche (-45° a -20°) :
    Range_Min = 40.0 ;
    for (i=621 ; i < 721 ; i++ )
    {       if ( data_in->range[i] < Range_Min )
                        Range_Min = data_in->range[i] ;
    }
    m_rfl[3]= (UInt16)(Range_Min*100) ;


    // Partie Gauche (-45° a -135) :
    Range_Min = 40.0 ;
    for (i=721 ; i < 1081 ; i++ )
    {       if ( data_in->range[i] < Range_Min )
                        Range_Min = data_in->range[i] ;
    }
    m_rfl[4]= (UInt16)(Range_Min*100) ;


    Output_output(t);


//	End of user code
}


//**********************************************************************************************
// OUTPUT METHODS TO BE CALLED BY THE PROGRAMMER FOR EMITTING A SAMPLE ON AN OUTPUT PORT.
//**********************************************************************************************

//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port output
void MAPSPerception::Output_output(MAPSTimestamp t)
{
	MAPSIOElt* ioeltout = StartWriting(Output("output"));

// 	Start of user code Output on output implementation
	int count_Zone_out = 1; 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	Zone* data_out = (Zone*)ioeltout->Data();

	//Fill in data_out here.
	data_out->values[0] = (UInt16)(m_rfl[0]) ;
	data_out->values[1] = (UInt16)(m_rfl[1]) ;
	data_out->values[2] = (UInt16)(m_rfl[2]) ;
	data_out->values[3] = (UInt16)(m_rfl[3]) ;
	data_out->values[4] = (UInt16)(m_rfl[4]) ;

	ioeltout->VectorSize() =  count_Zone_out * sizeof(Zone); //For non-standard datatypes, by convention,  
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}

//**********************************************************************************************
// RELEASE FUNCTION.
// CALLED ONCE WHEN DIAGRAMS STOPS EXECUTING OR AFTER A CALL TO Error("..."); IN Birth OR Core.
//**********************************************************************************************
void MAPSPerception::Death()
{
// 	Start of user code Death implementation
// 	End of user code

}

//*******************************************************************************************************************
// OVERLOADED METHOD: WILL BE CALLED AT DIAGRAM EXECUTION SHUTDOWN ONCE ALL THE COMPONENTS HAVE GONE THROUGH Death().
// THIS IS THE PLACE WHERE TO RELEASE BUFFERS THAT WERE DYNAMICALLY ALLOCATED BY THE PROGRAMMER IN BIRTH. 
//*******************************************************************************************************************
void MAPSPerception::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_output;
	MAPSForallItems(it_output,_output_buffers) {
		delete [] _output_buffers[it_output ];
	}
	_output_buffers.Clear();
}

// Start of user code Additional methods for MAPSPerception
// End of user code

