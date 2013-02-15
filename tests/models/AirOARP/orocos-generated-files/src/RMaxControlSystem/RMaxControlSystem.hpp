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
class RMaxControlSystem
	: public RTT::TaskContext 
{   
	// ports, operations and attributes
			public: InputPort<State> state;
		    public: InputPort<Image> image;

	
	
	// Constructor
	public: RMaxControlSystem (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
			, state("state")	
			, image("image")	
			, waypointAdd ("waypointAdd")
			, getState ("getState")
			, obstacleDel ("obstacleDel")
			, quickWaypointDel ("quickWaypointDel")
			, getPhaseStr ("getPhaseStr")
			, getPhase ("getPhase")
			, wayPop ("wayPop")
			, getMaxV ("getMaxV")
			, getMaxA ("getMaxA")
			, quickSetObj ("quickSetObj")
			, altitude ("altitude")
			, getInterfaceName ("getInterfaceName")
			, getMinDt ("getMinDt")
			, obstacleAdd ("obstacleAdd")
			, wayPush ("wayPush")
			, setPhase ("setPhase")
			, wayAdd ("wayAdd")
			, wayDel ("wayDel")
			, move ("move")
			, waypointDel ("waypointDel")
			, gotou ("gotou")
			, setPhaseStr ("setPhaseStr")
			, setPhaseDescente ("setPhaseDescente")
			, setObj ("setObj")
			, track ("track")
			, getShuter ("getShuter")
			, setShutter ("setShutter")
			, getGain ("getGain")
			, setShutterAutoMin ("setShutterAutoMin")
			, getShutterAutoMax ("getShutterAutoMax")
			, getGainAutoMax ("getGainAutoMax")
			, getShutterAuto ("getShutterAuto")
			, setShutterAuto ("setShutterAuto")
			, getGainAutoMin ("getGainAutoMin")
			, getInterfaceName ("getInterfaceName")
			, setGainAutoMin ("setGainAutoMin")
			, getBrightness ("getBrightness")
			, setShutterAutoMax ("setShutterAutoMax")
			, getShutterAutoMin ("getShutterAutoMin")
			, getGainAuto ("getGainAuto")
			, setGainAuto ("setGainAuto")
			, setGain ("setGain")
			, setGainAutoMax ("setGainAutoMax")
			, setBrightness ("setBrightness")
  		{ 	
		this->ports()->addPort(state);	
		this->ports()->addPort(image);	

		


		this->requires("ObcInterface")
			->addOperationCaller(waypointAdd);
		this->requires("ObcInterface")
			->addOperationCaller(getState);
		this->requires("ObcInterface")
			->addOperationCaller(obstacleDel);
		this->requires("ObcInterface")
			->addOperationCaller(quickWaypointDel);
		this->requires("ObcInterface")
			->addOperationCaller(getPhaseStr);
		this->requires("ObcInterface")
			->addOperationCaller(getPhase);
		this->requires("ObcInterface")
			->addOperationCaller(wayPop);
		this->requires("ObcInterface")
			->addOperationCaller(getMaxV);
		this->requires("ObcInterface")
			->addOperationCaller(getMaxA);
		this->requires("ObcInterface")
			->addOperationCaller(quickSetObj);
		this->requires("ObcInterface")
			->addOperationCaller(altitude);
		this->requires("ObcInterface")
			->addOperationCaller(getInterfaceName);
		this->requires("ObcInterface")
			->addOperationCaller(getMinDt);
		this->requires("ObcInterface")
			->addOperationCaller(obstacleAdd);
		this->requires("ObcInterface")
			->addOperationCaller(wayPush);
		this->requires("ObcInterface")
			->addOperationCaller(setPhase);
		this->requires("ObcInterface")
			->addOperationCaller(wayAdd);
		this->requires("ObcInterface")
			->addOperationCaller(wayDel);
		this->requires("ObcInterface")
			->addOperationCaller(move);
		this->requires("ObcInterface")
			->addOperationCaller(waypointDel);
		this->requires("ObcInterface")
			->addOperationCaller(gotou);
		this->requires("ObcInterface")
			->addOperationCaller(setPhaseStr);
		this->requires("ObcInterface")
			->addOperationCaller(setPhaseDescente);
		this->requires("ObcInterface")
			->addOperationCaller(setObj);
		this->requires("ObcInterface")
			->addOperationCaller(track);
		this->requires("CameraInterface")
			->addOperationCaller(getShuter);
		this->requires("CameraInterface")
			->addOperationCaller(setShutter);
		this->requires("CameraInterface")
			->addOperationCaller(getGain);
		this->requires("CameraInterface")
			->addOperationCaller(setShutterAutoMin);
		this->requires("CameraInterface")
			->addOperationCaller(getShutterAutoMax);
		this->requires("CameraInterface")
			->addOperationCaller(getGainAutoMax);
		this->requires("CameraInterface")
			->addOperationCaller(getShutterAuto);
		this->requires("CameraInterface")
			->addOperationCaller(setShutterAuto);
		this->requires("CameraInterface")
			->addOperationCaller(getGainAutoMin);
		this->requires("CameraInterface")
			->addOperationCaller(getInterfaceName);
		this->requires("CameraInterface")
			->addOperationCaller(setGainAutoMin);
		this->requires("CameraInterface")
			->addOperationCaller(getBrightness);
		this->requires("CameraInterface")
			->addOperationCaller(setShutterAutoMax);
		this->requires("CameraInterface")
			->addOperationCaller(getShutterAutoMin);
		this->requires("CameraInterface")
			->addOperationCaller(getGainAuto);
		this->requires("CameraInterface")
			->addOperationCaller(setGainAuto);
		this->requires("CameraInterface")
			->addOperationCaller(setGain);
		this->requires("CameraInterface")
			->addOperationCaller(setGainAutoMax);
		this->requires("CameraInterface")
			->addOperationCaller(setBrightness);
	}
	// Destructor
    ~RMaxControlSystem() {}
	/**
	 * This function is for the configuration code.
     * Return false to abort configuration.
     */
	bool configureHook() {
		if (!(requires("ObcInterface")->connectTo(getPeer("Obc")->provides("ObcInterface")))){
			log(Info) << "connection problem to service" << endlog();
		}
		if (!(requires("CameraInterface")->connectTo(getPeer("Camera")->provides("CameraInterface")))){
			log(Info) << "connection problem to service" << endlog();
		}
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
