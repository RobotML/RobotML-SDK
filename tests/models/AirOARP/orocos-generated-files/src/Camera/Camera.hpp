#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>
#include <rtt/Port.hpp>
#include <iostream>
#include <numeric>
#include <sensor_msgs/Image.h>
#include <sensor_msgs/Image.h>
#include <sensor_msgs/CameraInfo.h>
#include <sensor_msgs/CameraInfo.h>
#include <Video/Image.h>
#include <Video/Image.h>
#include "Talc/Video/Thumb.h"	
#include "Talc/Video/Thumb.h"	
#include "Talc/Video/CameraInterface.h"	
#include "Talc/Video/CameraInterface.h"	
#include <stdlib.h>
#include <math.h>

using namespace std;
using namespace RTT;
using namespace Orocos;
using namespace RobotMLLibraries::RobotML_ModelLibrary::RobotML_DataTypes::sensor_datatypes;

using namespace RobotMLLibraries::RobotML_ModelLibrary::RobotML_DataTypes::sensor_datatypes;

using namespace RobotMLLibraries::RobotML_ModelLibrary::RobotML_DataTypes::sensor_datatypes;

using namespace RobotMLLibraries::RobotML_ModelLibrary::RobotML_DataTypes::sensor_datatypes;

using namespace Talc::Video;

using namespace Talc::Video;

using namespace Talc::Video;

using namespace Talc::Video;

using namespace Talc::Video;

using namespace Talc::Video;
















namespace Talc::Video::Orocos{	 {
class Camera
	: public RTT::TaskContext 
{   
	// ports, operations and attributes
			public: InputPort<sensor_msgs::Image> Image;
			public: InputPort<sensor_msgs::CameraInfo> Info;
			public: OutputPort<Video::Image> image;
			public: OutputPort<Thumb> thumb;

	
	
	// Constructor
	public: Camera (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
			, Image("Image")	
			, Info("Info")	
			, image("image")	
			, thumb("thumb")	
  		{ 	
		this->ports()->addPort(Image);	
		this->ports()->addPort(Info);	
		this->ports()->addPort(image);	
		this->ports()->addPort(thumb);	

		


		this->provides("CameraInterface")
			->addOperation("setBrightness",&Talc::Video::Orocos::Camera::setBrightness, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getGainAuto",&Talc::Video::Orocos::Camera::getGainAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setGain",&Talc::Video::Orocos::Camera::setGain, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setShutter",&Talc::Video::Orocos::Camera::setShutter, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("init",&Talc::Video::Orocos::Camera::init, this, ClientThread).arg("null", "Description of parameter : ")
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getShutterAutoMax",&Talc::Video::Orocos::Camera::getShutterAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getShutterAutoMin",&Talc::Video::Orocos::Camera::getShutterAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getGainAutoMin",&Talc::Video::Orocos::Camera::getGainAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getGain",&Talc::Video::Orocos::Camera::getGain, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getBrightness",&Talc::Video::Orocos::Camera::getBrightness, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setShutterAutoMax",&Talc::Video::Orocos::Camera::setShutterAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getShutterAuto",&Talc::Video::Orocos::Camera::getShutterAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setGainAutoMin",&Talc::Video::Orocos::Camera::setGainAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setGainAuto",&Talc::Video::Orocos::Camera::setGainAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setShutterAuto",&Talc::Video::Orocos::Camera::setShutterAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getShuter",&Talc::Video::Orocos::Camera::getShuter, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setGainAutoMax",&Talc::Video::Orocos::Camera::setGainAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setShutterAutoMin",&Talc::Video::Orocos::Camera::setShutterAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getGainAutoMax",&Talc::Video::Orocos::Camera::getGainAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getInterfaceName",&Talc::Video::Orocos::Camera::getInterfaceName, this, ClientThread)
				.doc("");
	}
	// Destructor
    ~Camera() {}
	/**
	 * This function is for the configuration code.
     * Return false to abort configuration.
     */
	bool configureHook() {
		// ...
		return true;
	}

	/**
	 * This function is for the application's start up code.
	 * Return false to abort start up.
	 */
	bool startHook() {
		// ...
		return true;
	}

	/**
	 * This function is called by the Execution Engine.
	 */
	void updateHook() {
		// algorithm goes here.
	}

	/**
	 * This function is called when the task is stopped.
 	 */
	void stopHook() {
		// stop code after last updateHook()
	}

	/**
	 * This function is called when the task is being deconfigured.
	 */
	void cleanupHook() {
		// Your configuration cleanup code
	}	
};
}
