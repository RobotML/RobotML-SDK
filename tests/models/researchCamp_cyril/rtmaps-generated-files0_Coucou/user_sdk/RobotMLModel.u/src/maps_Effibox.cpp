
#include "maps_Effibox.h"
// Start of user code Additional includes
// End of user code

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSEffibox)
// 	Start of user code Additional input definitions
// 	End of user code
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSEffibox)
// 	Start of user code Additional output definitions
// 	End of user code
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSEffibox)
// 	Start of user code Additional property definitions
// 	End of user code
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSEffibox)
// 	Start of user code Additional action definitions
// 	End of user code
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (Effibox) behaviour
MAPS_COMPONENT_DEFINITION(MAPSEffibox,"Effibox","1.0",128,
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
void MAPSEffibox::Birth()
{


// 	Start of user code User-specific initalizations
// 	End of user code

}

//****************************************************************************
// Core() IS THE MAIN EXECUTION LOOP FUNCTION.
// THE ONE AND ONLY BLOCKING CALL IN HERE SHALL BE THE StartReading function.
//****************************************************************************
void MAPSEffibox::Core() 
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
void MAPSEffibox::Death()
{
// 	Start of user code Death implementation
// 	End of user code

}


// Start of user code Additional methods for MAPSEffibox
// End of user code

