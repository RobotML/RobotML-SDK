////////////////////////////////
// RTMaps SDK Component
////////////////////////////////

////////////////////////////////
// Purpose of this module :
////////////////////////////////

#include "maps_gps_rtmaps_to_robotml.h"	// Includes the header of this component

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSgps_rtmaps_to_robotml)
    //MAPS_INPUT("iName",MAPS::FilterInteger32,MAPS::FifoReader)
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSgps_rtmaps_to_robotml)
    //MAPS_OUTPUT("oName",MAPS::Integer32,NULL,NULL,1)
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
    // Reports this information to the RTMaps console
    ReportInfo("gps_rtmaps_to_robotml: Passing through Birth() method");
}

void MAPSgps_rtmaps_to_robotml::Core() 
{
    // Reports this information to the RTMaps console
    ReportInfo("gps_rtmaps_to_robotml: Passing through Core() method");
    // Sleeps during 500 milliseconds (500000 microseconds)
    Rest(500000);
}

void MAPSgps_rtmaps_to_robotml::Death()
{
    // Reports this information to the RTMaps console
    ReportInfo("gps_rtmaps_to_robotml: Passing through Death() method");
}
