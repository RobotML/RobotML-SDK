////////////////////////////////
// RTMaps SDK Component
////////////////////////////////

////////////////////////////////
// Purpose of this module :
////////////////////////////////

#include "maps_camera_image_rtmaps_to_robotml.h"	// Includes the header of this component

// Use the macros to declare the inputs
MAPS_BEGIN_INPUTS_DEFINITION(MAPScamera_image_rtmaps_to_robotml)
	MAPS_INPUT("image_in",MAPS::FilterIplImage,MAPS::FifoReader)
MAPS_END_INPUTS_DEFINITION

// Use the macros to declare the outputs
MAPS_BEGIN_OUTPUTS_DEFINITION(MAPScamera_image_rtmaps_to_robotml)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("video",Image, 0)
	//Declare a vector of max 0 elements in order to be able to handle the output buffers
	//allocation "manually" later (in ::Birth()).
	MAPS_OUTPUT_USER_STRUCTURES_VECTOR("calibrate",CameraInfo, 0)
MAPS_END_OUTPUTS_DEFINITION

// Use the macros to declare the properties
MAPS_BEGIN_PROPERTIES_DEFINITION(MAPScamera_image_rtmaps_to_robotml)
    MAPS_PROPERTY("distorsion_model","plumb_bob",false,false)
	MAPS_PROPERTY("D","0.0;0.0;0.0;0.0;0.0",false,false)
	MAPS_PROPERTY("K","0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0",false,false)
	MAPS_PROPERTY("R","0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0",false,false)
	MAPS_PROPERTY("P","0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0;0.0",false,false)
	MAPS_PROPERTY("binning_x",0,false,false)
	MAPS_PROPERTY("binning_y",0, false,false)
	MAPS_PROPERTY("roi_x_offset",0,false,false)
	MAPS_PROPERTY("roi_y_offset",0,false,false)
	MAPS_PROPERTY("roi_width",0,false,false)
	MAPS_PROPERTY("roi_height",0,false,false)
	MAPS_PROPERTY("roi_do_rectify",false,false,false)
MAPS_END_PROPERTIES_DEFINITION

// Use the macros to declare the actions
MAPS_BEGIN_ACTIONS_DEFINITION(MAPScamera_image_rtmaps_to_robotml)
    //MAPS_ACTION("aName",MAPScamera_image_rtmaps_to_robotml::ActionName)
MAPS_END_ACTIONS_DEFINITION

// Use the macros to declare this component (camera_image_rtmaps_to_robotml) behaviour
MAPS_COMPONENT_DEFINITION(MAPScamera_image_rtmaps_to_robotml,"camera_image_rtmaps_to_robotml","1.0",128,
			MAPS::Threaded|MAPS::Sequential,MAPS::Sequential,
			  -1, // Nb of inputs. Leave -1 to use the number of declared input definitions
			  -1, // Nb of outputs. Leave -1 to use the number of declared output definitions
			  -1, // Nb of properties. Leave -1 to use the number of declared property definitions
			  -1) // Nb of actions. Leave -1 to use the number of declared action definitions

void MAPScamera_image_rtmaps_to_robotml::Birth()
{
	//********************************************************************
	//Output buffers allocation 
	//Performed "by hand" (the code is quite ugly but it is
	//the only way for the most generic cases we have to deal with
	//in RobotML).
	//********************************************************************
	m_video_buffers.Clear();
	MAPSIOMonitor &monitor_video=Output(0).Monitor();
	MAPSFastIOHandle it_video;
	it_video=monitor_video.InitBegin();
	while (it_video) {
		MAPSIOElt &IOElt_video=monitor_video[it_video];
		IOElt_video.Data() = (void*) new Image[1]; //TODO: replace 1 by port.upper.
		if (IOElt_video.Data() == NULL)
			Error("Not enough memory.");
		m_video_buffers.Append((Image*)IOElt_video.Data());
		monitor_video.InitNext(it_video);
	}
	m_calibrate_buffers.Clear();
	MAPSIOMonitor &monitor_calibrate=Output(1).Monitor();
	MAPSFastIOHandle it_calibrate;
	it_calibrate=monitor_calibrate.InitBegin();
	while (it_calibrate) {
		MAPSIOElt &IOElt_calibrate=monitor_calibrate[it_calibrate];
		IOElt_calibrate.Data() = (void*) new CameraInfo[1]; //TODO: replace 1 by port.upper.
		if (IOElt_calibrate.Data() == NULL)
			Error("Not enough memory.");
		m_calibrate_buffers.Append((CameraInfo*)IOElt_calibrate.Data());
		monitor_calibrate.InitNext(it_calibrate);
	}

	m_first_time = true;
	m_count = 0;

	m_info.beginning_x = (int)GetIntegerProperty("binning_x");
	m_info.beginning_y = (int)GetIntegerProperty("binning_y");
	m_info.distorsion_model = (const char*)GetStringProperty("distorsion_model");
	MAPSString Ds_str = GetStringProperty("D");
	MAPSArray<MAPSString> Ds = Ds_str.Split(';');
	m_info.D.clear();
	for (int i=0; i<Ds.Size(); i++) {
		m_info.D.push_back(atof((const char*)Ds[i]));
	}
	MAPSString Ks_str = GetStringProperty("K");
	MAPSArray<MAPSString> Ks = Ks_str.Split(';');
	if (Ks.Size() != 9) {
		Error("K property should be made of 9 fields as a 3x3 matrix.");
	}
	for (int i=0; i<9; i++) {
		m_info.K[i] = atof((const char*)Ks[i]);
	}
	MAPSString Rs_str = GetStringProperty("R");
	MAPSArray<MAPSString> Rs = Rs_str.Split(';');
	if (Rs.Size() != 9) {
		Error("R property should be made of 9 fields as a 3x3 matrix.");
	}
	for (int i=0; i<9; i++) {
		m_info.R[i] = atof((const char*)Rs[i]);
	}
	MAPSString Ps_str = GetStringProperty("P");
	MAPSArray<MAPSString> Ps = Ps_str.Split(';');
	if (Ps.Size() != 12) {
		Error("P property should be made of 12 fields as a 3x4 matrix.");
	}
	for (int i=0; i<12; i++) {
		m_info.P[i] = atof((const char*)Ps[i]);
	}

	m_info.roi.do_rectify = GetBoolProperty("roi_do_rectify");
	m_info.roi.height = (int)GetIntegerProperty("roi_height");
	m_info.roi.x_offset = (int)GetIntegerProperty("roi_x_offset");
	m_info.roi.y_offset = (int)GetIntegerProperty("roi_y_offset");
}

void MAPScamera_image_rtmaps_to_robotml::Core() 
{

	MAPSIOElt* ioeltin = StartReading(Input(0));
	if (ioeltin == NULL)
		return;

	IplImage& imagein = ioeltin->IplImage();
	if (m_first_time) {
		m_first_time = false;
		if (*(MAPSUInt32*)imagein.channelSeq != MAPS_CHANNELSEQ_BGR) {
			Error("This component only accepts BGR 24 images as input.");
		}
	}

	MAPSIOElt* ioeltout = StartWriting(Output("video"));

// 	Start of user code Output on video implementation
	Image* data_out = (Image*)ioeltout->Data();
	data_out->header.stamp = ioeltin->Timestamp();
	data_out->header.seq = m_count++;

	data_out->encoding = "bgr8";
	data_out->height = imagein.height;
	data_out->width = imagein.width;
	data_out->height = imagein.height;
	data_out->step = imagein.widthStep;
	data_out->data.resize(imagein.imageSize);
	MAPS::Memcpy(&(data_out->data[0]),imagein.imageData,imagein.imageSize);
	

	ioeltout->VectorSize() =  sizeof(Image); //For non-standard datatypes, by convention,  
//	End of user code


	m_info.width = imagein.width;
	m_info.height = imagein.height;

	MAPSIOElt* ioeltout_ci = StartWriting(Output("calibrate"));
	CameraInfo* caminfo_out = (CameraInfo*)ioeltout->Data();
	caminfo_out->beginning_x = m_info.beginning_x;
	caminfo_out->beginning_y = m_info.beginning_y;
	caminfo_out->D = m_info.D;
	caminfo_out->distorsion_model = m_info.distorsion_model;
	caminfo_out->height = m_info.height;
	caminfo_out->width = m_info.width;
	caminfo_out->roi = m_info.roi;
	MAPS::Memcpy(caminfo_out->K,m_info.K,sizeof(m_info.K));
	MAPS::Memcpy(caminfo_out->R,m_info.R,sizeof(m_info.R));
	MAPS::Memcpy(caminfo_out->P,m_info.P,sizeof(m_info.P));
	
	caminfo_out->header.stamp = ioeltin->Timestamp();
	caminfo_out->header.seq = data_out->header.seq;
	
	ioeltout->Timestamp() = ioeltin->Timestamp();	
	ioeltout_ci->Timestamp() = ioeltin->Timestamp();
	StopWriting(ioeltout);
	StopWriting(ioeltout_ci);	
}

void MAPScamera_image_rtmaps_to_robotml::Death()
{
}

//*******************************************************************************************************************
// OVERLOADED METHOD: WILL BE CALLED AT DIAGRAM EXECUTION SHUTDOWN ONCE ALL THE COMPONENTS HAVE GONE THROUGH Death().
// THIS IS THE PLACE WHERE TO RELEASE BUFFERS THAT WERE DYNAMICALLY ALLOCATED BY THE PROGRAMMER IN BIRTH. 
//*******************************************************************************************************************
void MAPScamera_image_rtmaps_to_robotml::FreeBuffers()
{
	//Let's release the memory we allocated on the output buffers.
	MAPSListIterator it_video;
	MAPSForallItems(it_video,m_video_buffers) {
		delete [] m_video_buffers[it_video ];
	}
	m_video_buffers.Clear();
	MAPSListIterator it_calibrate;
	MAPSForallItems(it_calibrate,m_calibrate_buffers) {
		delete [] m_calibrate_buffers[it_calibrate ];
	}
	m_calibrate_buffers.Clear();
}
