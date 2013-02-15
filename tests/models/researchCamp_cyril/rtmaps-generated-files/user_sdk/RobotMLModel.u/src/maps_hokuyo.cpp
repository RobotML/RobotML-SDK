
#include "maps_hokuyo.h"
// Start of user code Additional includes
// End of user code

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPShokuyo)
// 	Start of user code Additional input definitions
// 	End of user code
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPShokuyo)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("data",LaserScan, 0)
// 	Start of user code Additional output definitions
// 	End of user code
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPShokuyo)
// 	Start of user code Additional property definitions
// 	End of user code
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPShokuyo)
// 	Start of user code Additional action definitions
// 	End of user code
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (hokuyo) behaviour
MAPS_COMPONENT_DEFINITION(MAPShokuyo,"hokuyo","1.0",128,
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
void MAPShokuyo::Birth()
{

	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	_data_buffers.Clear();
	MAPSIOMonitor &monitor_data=Output(0).Monitor();
	MAPSFastIOHandle it_data;
	it_data=monitor_data.InitBegin();
	while (it_data) {
		MAPSIOElt &IOElt_data=monitor_data[it_data];
		IOElt_data.Data() = (void*) new LaserScan[1]; //TODO: replace 1 by port.upper.
		if (IOElt_data.Data() == NULL)
			Error("Not enough memory.");
		_data_buffers.Append((LaserScan*)IOElt_data.Data());
		monitor_data.InitNext(it_data);
	}

// 	Start of user code User-specific initalizations
// 	End of user code

}

//****************************************************************************
// Core() IS THE MAIN EXECUTION LOOP FUNCTION.
// THE ONE AND ONLY BLOCKING CALL IN HERE SHALL BE THE StartReading function.
//****************************************************************************
void MAPShokuyo::Core() 
{
	//There are no inputs to read from in this component.
	//Make sure you have one and only blocking function (Rest, Wait, MAPS::Sleep, select, whatever...)
	//inside Core().
// 	Start of user code Core processing with no inputs
//	Wait4Event(isDyingEvent); //Pause the current thread until shutdown.

    Output_data(MAPS::CurrentTime()) ;
    Rest(500000);


// 	End of user code

}



//**********************************************************************************************
// OUTPUT METHODS TO BE CALLED BY THE PROGRAMMER FOR EMITTING A SAMPLE ON AN OUTPUT PORT.
//**********************************************************************************************

//To be completed by programmer, then called by programmer whenever necessary in order to
//output a data sample on output port data
void MAPShokuyo::Output_data(MAPSTimestamp t)
{
	MAPSIOElt* ioeltout = StartWriting(Output("data"));

// 	Start of user code Output on data implementation
	int count_LaserScan_out = 1; 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	LaserScan* data_out = (LaserScan*)ioeltout->Data();

	int i ;

	//Fill in data_out here.

	    for (i=0 ; i < 361 ; i++ )
	    {		data_out->range.push_back(  10.10f  ) ;
			if (i == 300 ) data_out->range.push_back(  1.10f  ) ;
	    }

	    for (i=361 ; i < 421 ; i++ )
	    {		data_out->range.push_back(  10.10f  ) ;
			if (i == 400 ) data_out->range.push_back(  2.20f  ) ;
	    }


	    for (i=461 ; i < 621 ; i++ )
	    {		data_out->range.push_back(  10.10f ) ;
			if (i == 600 ) data_out->range.push_back(  3.30f  ) ;
	    }


	    for (i=621 ; i < 721 ; i++ )
	    {		data_out->range.push_back(  10.10f ) ;
			if (i == 700 ) data_out->range.push_back(  4.40f  ) ;
	    }


	    for (i=721 ; i < 1081 ; i++ )
	    {		data_out->range.push_back( 10.10f ) ;
			if (i == 900 ) data_out->range.push_back(  5.50f  ) ;
	    }




    data_out->angle_min = -135.0f ;
    data_out->angle_max = 135.0f ;
 

	//....

	ioeltout->VectorSize() =  count_LaserScan_out * sizeof(LaserScan); //For non-standard datatypes, by convention,  
//	End of user code

	ioeltout->Timestamp() = t;	
	StopWriting(ioeltout);
}

//**********************************************************************************************
// RELEASE FUNCTION.
// CALLED ONCE WHEN DIAGRAMS STOPS EXECUTING OR AFTER A CALL TO Error("..."); IN Birth OR Core.
//**********************************************************************************************
void MAPShokuyo::Death()
{
// 	Start of user code Death implementation
// 	End of user code

}

//*******************************************************************************************************************
// OVERLOADED METHOD: WILL BE CALLED AT DIAGRAM EXECUTION SHUTDOWN ONCE ALL THE COMPONENTS HAVE GONE THROUGH Death().
// THIS IS THE PLACE WHERE TO RELEASE BUFFERS THAT WERE DYNAMICALLY ALLOCATED BY THE PROGRAMMER IN BIRTH. 
//*******************************************************************************************************************
void MAPShokuyo::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_data;
	MAPSForallItems(it_data,_data_buffers) {
		delete [] _data_buffers[it_data ];
	}
	_data_buffers.Clear();
}

// Start of user code Additional methods for MAPShokuyo
// End of user code

