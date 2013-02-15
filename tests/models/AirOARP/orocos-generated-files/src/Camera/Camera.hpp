#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>
#include <iostream>
#include <numeric>
#include "Talc_types.h"
#include <stdlib.h>
#include <math.h>


using namespace std;
using namespace RTT;
using namespace Orocos;
using namespace Talc_types;



namespace Orocos	 {
class Camera
	: public RTT::TaskContext 
{   
	// ports, operations and attributes
		    public: InputPort<::Image> Image;
		    public: InputPort<::CameraInfo> Info;
		
		
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
			->addOperation("getShuter",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getShuter, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setShutter",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setShutter, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getGain",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getGain, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setShutterAutoMin",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setShutterAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getShutterAutoMax",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getShutterAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getGainAutoMax",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getGainAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getShutterAuto",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getShutterAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setShutterAuto",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setShutterAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getGainAutoMin",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getGainAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getInterfaceName",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getInterfaceName, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setGainAutoMin",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setGainAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getBrightness",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getBrightness, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setShutterAutoMax",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setShutterAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getShutterAutoMin",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getShutterAutoMin, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("getGainAuto",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::getGainAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setGainAuto",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setGainAuto, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setGain",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setGain, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setGainAutoMax",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setGainAutoMax, this, ClientThread)
				.doc("");
		this->provides("CameraInterface")
			->addOperation("setBrightness",&org.eclipse.uml2.uml.internal.impl.PackageImpl@1969478 (name: Orocos, visibility: <unset>) (URI: null)::Camera::setBrightness, this, ClientThread)
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
