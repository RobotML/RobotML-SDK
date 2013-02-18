
#include "maps_RoboticSimulator1.h"
// Start of user code Additional includes
// End of user code

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSRoboticSimulator1)
// 	Start of user code Additional input definitions
// 	End of user code
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSRoboticSimulator1)
// 	Start of user code Additional output definitions
// 	End of user code
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSRoboticSimulator1)
// 	Start of user code Additional property definitions
// 	End of user code
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSRoboticSimulator1)
// 	Start of user code Additional action definitions
// 	End of user code
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (RoboticSimulator1) behaviour
MAPS_COMPONENT_DEFINITION(MAPSRoboticSimulator1,"RoboticSimulator1","1.0",128,
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
void MAPSRoboticSimulator1::Birth()
{


// 	Start of user code User-specific initalizations
// 	End of user code

}

//****************************************************************************
// Core() IS THE MAIN EXECUTION LOOP FUNCTION.
// THE ONE AND ONLY BLOCKING CALL IN HERE SHALL BE THE StartReading function.
//****************************************************************************
void MAPSRoboticSimulator1::Core() 
{
	//There are no inputs to read from in this component.
	//Make sure you have one and only blocking function (Rest, Wait, MAPS::Sleep, select, whatever...)
	//inside Core().
// 	Start of user code Core processing with no inputs
	Wait4Event(isDyingEvent); //Pause the current thread until shutdown.
// 	End of user code

}




//**********************************************************************************************
// RELEASE FUNCTION.
// CALLED ONCE WHEN DIAGRAMS STOPS EXECUTING OR AFTER A CALL TO Error("..."); IN Birth OR Core.
//**********************************************************************************************
void MAPSRoboticSimulator1::Death()
{
// 	Start of user code Death implementation
// 	End of user code

}


// Start of user code Additional methods for MAPSRoboticSimulator1
// End of user code

