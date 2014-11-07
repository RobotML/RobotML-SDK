////////////////////////////////
// RTMaps SDK Component
////////////////////////////////

////////////////////////////////
// Purpose of this module :
////////////////////////////////

#include "maps_lidar_scan_robotml_to_rtmaps.h"	// Includes the header of this component

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSlidar_scan_robotml_to_rtmaps)
    MAPS_INPUT("LaserScan_in",MAPSFilterLaserScan,MAPS::FifoReader)
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSlidar_scan_robotml_to_rtmaps)
    MAPS_OUTPUT("scan_dists_mm",MAPS::Integer32,NULL,"mm",0)
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSlidar_scan_robotml_to_rtmaps)
    //MAPS_PROPERTY("pName",128,false,false)
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSlidar_scan_robotml_to_rtmaps)
    //MAPS_ACTION("aName",MAPSlidar_scan_robotml_to_rtmaps::ActionName)
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (lidar_scan_robotml_to_rtmaps) behaviour
MAPS_COMPONENT_DEFINITION(MAPSlidar_scan_robotml_to_rtmaps,"lidar_scan_robotml_to_rtmaps","1.0",128,
			  MAPS::Threaded,MAPS::Threaded,
			  -1, // Nb of inputs. Leave -1 to use the number of declared input definitions
			  -1, // Nb of outputs. Leave -1 to use the number of declared output definitions
			  -1, // Nb of properties. Leave -1 to use the number of declared property definitions
			  -1) // Nb of actions. Leave -1 to use the number of declared action definitions

void MAPSlidar_scan_robotml_to_rtmaps::Birth()
{
	_first_time = true;
}

void MAPSlidar_scan_robotml_to_rtmaps::Core() 
{
	MAPSIOElt* ioeltin = StartReading(Input(0));
	if (ioeltin == NULL)
		return;

	LaserScan* data_in = (LaserScan*)ioeltin->Data();
	if (_first_time) {
		_first_time = false;
		_max_nb_points = data_in->range.size();
		Output(0).AllocOutputBuffer(_max_nb_points);
	}

	MAPSIOElt* ioeltout = StartWriting(Output(0));
	MAPSInt32* int_out = &ioeltout->Integer32();

	int nb_points = data_in->range.size();
	if (nb_points > _max_nb_points) {
		MAPSStreamedString ss;
		ss << "Scan points number increased compared to first received packet. Too many scan points in scan (" << nb_points << ". Truncating to " << _max_nb_points;
		ReportError(ss);
		nb_points = _max_nb_points;
	}

	Float32* float_in = &data_in->range.front();
	for (int i=0; i<nb_points; i++) {
		*(int_out++) = (MAPSInt32)((*(float_in++))*1000);
	}

	ioeltout->VectorSize() = nb_points;
	ioeltout->Timestamp() = ioeltin->Timestamp();
	StopWriting(ioeltout);
}

void MAPSlidar_scan_robotml_to_rtmaps::Death()
{
}
