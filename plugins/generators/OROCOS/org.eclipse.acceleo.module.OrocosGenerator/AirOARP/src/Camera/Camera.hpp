#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>
#include <rtt/Port.hpp>
#include <iostream>
#include <numeric>
		#include "../Datatypes/Image.hpp"
		#include "../Datatypes/Image.hpp"
		#include "../Datatypes/CameraInfo.hpp"
		#include "../Datatypes/CameraInfo.hpp"
		#include "../Datatypes/Image.hpp"
		#include "../Datatypes/Image.hpp"
		#include "../Datatypes/Thumb.hpp"
		#include "../Datatypes/Thumb.hpp"
		#include "../CameraInterface/CameraInterface.hpp"
		#include "../CameraInterface/CameraInterface.hpp"
#include <stdlib.h>
#include <math.h>

using namespace std;
using namespace RTT;














namespace Talc{
namespace Video{
namespace Orocos{



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
			->addOperation("CameraInterface_setGainAutoMax/]",&Camera::setGainAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getGainAutoMin/]",&Camera::getGainAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getInterfaceName/]",&Camera::getInterfaceName, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_setGainAutoMin/]",&Camera::setGainAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getGainAuto/]",&Camera::getGainAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_setGainAuto/]",&Camera::setGainAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getBrightness/]",&Camera::getBrightness, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_setShutterAutoMin/]",&Camera::setShutterAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getGain/]",&Camera::getGain, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_setShutterAutoMax/]",&Camera::setShutterAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getGainAutoMax/]",&Camera::getGainAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getShutterAuto/]",&Camera::getShutterAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_setShutter/]",&Camera::setShutter, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_setBrightness/]",&Camera::setBrightness, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_setGain/]",&Camera::setGain, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getShuter/]",&Camera::getShuter, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getShutterAutoMax/]",&Camera::getShutterAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_getShutterAutoMin/]",&Camera::getShutterAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_init/]",&Camera::init, this, ClientThread).arg("null", "Description of parameter : ")
				.doc("");
		this->provides("CameraInterface")
			->addOperation("CameraInterface_setShutterAuto/]",&Camera::setShutterAuto, this, ClientThread)
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
}
}
