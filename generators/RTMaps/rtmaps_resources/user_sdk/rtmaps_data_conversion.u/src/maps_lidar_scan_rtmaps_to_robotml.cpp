////////////////////////////////
// RTMaps SDK Component
////////////////////////////////

////////////////////////////////
// Purpose of this module :
////////////////////////////////

#include "maps_lidar_scan_rtmaps_to_robotml.h"	// Includes the header of this component

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPSlidar_scan_rtmaps_to_robotml)
    MAPS_INPUT("scans_in",MAPS::FilterInteger32,MAPS::FifoReader) //For Hokuyo, int32 in mm
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPSlidar_scan_rtmaps_to_robotml)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("laser_scan",LaserScan, 0) //vectors of float32 in m
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("status",DiagnosticStatus, 0)
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPSlidar_scan_rtmaps_to_robotml)
    MAPS_PROPERTY("nb_layers",1,false,false)
	MAPS_PROPERTY("angle_min",-135.0,false,false)
	MAPS_PROPERTY("angle_max",135.0,false,false)
	MAPS_PROPERTY("angle_increment",0.25,false,false)
	MAPS_PROPERTY("range_min",0.0,false,false)
	MAPS_PROPERTY("range_max",30.0,false,false)
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPSlidar_scan_rtmaps_to_robotml)
    //MAPS_ACTION("aName",MAPSlidar_scan_rtmaps_to_robotml::ActionName)
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (lidar_scan_rtmaps_to_robotml) behaviour
MAPS_COMPONENT_DEFINITION(MAPSlidar_scan_rtmaps_to_robotml,"lidar_scan_rtmaps_to_robotml","1.0",128,
			  MAPS::Sequential|MAPS::Threaded,MAPS::Sequential,
			  -1, // Nb of inputs. Leave -1 to use the number of declared input definitions
			  -1, // Nb of outputs. Leave -1 to use the number of declared output definitions
			  -1, // Nb of properties. Leave -1 to use the number of declared property definitions
			  -1) // Nb of actions. Leave -1 to use the number of declared action definitions

void MAPSlidar_scan_rtmaps_to_robotml::Birth()
{
	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	_laser_scan_buffers.Clear();
	MAPSIOMonitor &monitor_laser_scan=Output(0).Monitor();
	MAPSFastIOHandle it_laser_scan;
	it_laser_scan=monitor_laser_scan.InitBegin();
	while (it_laser_scan) {
		MAPSIOElt &IOElt_laser_scan=monitor_laser_scan[it_laser_scan];
		IOElt_laser_scan.Data() = (void*) new LaserScan[1]; //TODO: replace 1 by port.upper.
		if (IOElt_laser_scan.Data() == NULL)
			Error("Not enough memory.");
		_laser_scan_buffers.Append((LaserScan*)IOElt_laser_scan.Data());
		monitor_laser_scan.InitNext(it_laser_scan);
	}
	_status_buffers.Clear();
	MAPSIOMonitor &monitor_status=Output(1).Monitor();
	MAPSFastIOHandle it_status;
	it_status=monitor_status.InitBegin();
	while (it_status) {
		MAPSIOElt &IOElt_status=monitor_status[it_status];
		IOElt_status.Data() = (void*) new DiagnosticStatus[1]; //TODO: replace 1 by port.upper.
		if (IOElt_status.Data() == NULL)
			Error("Not enough memory.");
		_status_buffers.Append((DiagnosticStatus*)IOElt_status.Data());
		monitor_status.InitNext(it_status);
	}

	m_nb_layers = (int)GetIntegerProperty("nb_layers");
	m_angle_min = GetFloatProperty("angle_min");
	m_angle_max = GetFloatProperty("angle_max");
	m_angle_inc = GetFloatProperty("angle_increment");
	m_range_min = GetFloatProperty("range_min");
	m_range_max = GetFloatProperty("range_max");
	m_seq = 0;

}

void MAPSlidar_scan_rtmaps_to_robotml::Core() 
{
	MAPSIOElt* ioeltin = StartReading(Input(0));
	if (ioeltin == NULL)
		return;

	MAPSInt32* scans_in = &ioeltin->Integer32();

	MAPSIOElt* ioeltout = StartWriting(Output("laser_scan"));

	int count_LaserScan_out = ioeltin->VectorSize(); 	//changed it to the number of samples to write in output MAPSIOElt 
											//(but never more than the max vector size allocated on the output).
	LaserScan* data_out = (LaserScan*)ioeltout->Data();

	//Fill in data_out here.
	data_out->range.reserve(count_LaserScan_out);
	for (int i=0; i<count_LaserScan_out; i++) {
		data_out->range.push_back((*(scans_in++))/1000.0f);
	}
	data_out->angle_increment = (Float32)m_angle_inc;
	data_out->angle_min = (Float32)m_angle_min;
	data_out->angle_max = (Float32)m_angle_max;
	data_out->range_min = (Float32)m_range_min;
	data_out->range_max = (Float32)m_range_max;
	data_out->header.stamp = ioeltin->Timestamp();
	data_out->header.seq = m_seq++;


	ioeltout->VectorSize() =  count_LaserScan_out * sizeof(LaserScan); //For non-standard datatypes, by convention,  
//	End of user code

	ioeltout->Timestamp() = ioeltin->Timestamp();	
	StopWriting(ioeltout);

}

void MAPSlidar_scan_rtmaps_to_robotml::Death()
{
}

//*******************************************************************************************************************
// OVERLOADED METHOD: WILL BE CALLED AT DIAGRAM EXECUTION SHUTDOWN ONCE ALL THE COMPONENTS HAVE GONE THROUGH Death().
// THIS IS THE PLACE WHERE TO RELEASE BUFFERS THAT WERE DYNAMICALLY ALLOCATED BY THE PROGRAMMER IN BIRTH. 
//*******************************************************************************************************************
void MAPSlidar_scan_rtmaps_to_robotml::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_laser_scan;
	MAPSForallItems(it_laser_scan,_laser_scan_buffers) {
		delete [] _laser_scan_buffers[it_laser_scan ];
	}
	_laser_scan_buffers.Clear();
	MAPSListIterator it_status;
	MAPSForallItems(it_status,_status_buffers) {
		delete [] _status_buffers[it_status ];
	}
	_status_buffers.Clear();
}
