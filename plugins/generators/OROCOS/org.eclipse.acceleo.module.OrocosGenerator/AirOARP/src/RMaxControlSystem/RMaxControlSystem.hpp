#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>
#include <rtt/Port.hpp>
#include <iostream>
#include <numeric>
		#include "../Datatypes/State.hpp"
		#include "../Datatypes/State.hpp"
		#include "../Datatypes/Image.hpp"
		#include "../Datatypes/Image.hpp"
		#include "../ObcInterface/ObcInterface.hpp"
		#include "../ObcInterface/ObcInterface.hpp"
		#include "../CameraInterface/CameraInterface.hpp"
		#include "../CameraInterface/CameraInterface.hpp"
#include <stdlib.h>
#include <math.h>

using namespace std;
using namespace RTT;














namespace Talc{



class RMaxControlSystem
	: public RTT::TaskContext 
{   
	// ports, operations and attributes

				
				
				
		RTT::OperationCaller ObcInterface_wayPop;
		RTT::OperationCaller ObcInterface_wayPush;
		RTT::OperationCaller ObcInterface_getMaxV;
		RTT::OperationCaller ObcInterface_waypointDel;
		RTT::OperationCaller ObcInterface_getMaxA;
		RTT::OperationCaller ObcInterface_getPhaseStr;
		RTT::OperationCaller ObcInterface_getPhase;
		RTT::OperationCaller ObcInterface_quickSetObj;
		RTT::OperationCaller ObcInterface_obstacleAdd;
		RTT::OperationCaller ObcInterface_getMinDt;
		RTT::OperationCaller ObcInterface_setObj;
		RTT::OperationCaller ObcInterface_setPhase;
		RTT::OperationCaller ObcInterface_waypointAdd;
		RTT::OperationCaller ObcInterface_getInterfaceName;
		RTT::OperationCaller ObcInterface_quickWaypointDel;
		RTT::OperationCaller ObcInterface_move;
		RTT::OperationCaller ObcInterface_setPhaseDescente;
		RTT::OperationCaller ObcInterface_wayDel;
		RTT::OperationCaller ObcInterface_getState;
		RTT::OperationCaller ObcInterface_setPhaseStr;
		RTT::OperationCaller ObcInterface_gotou;
		RTT::OperationCaller ObcInterface_wayAdd;
		RTT::OperationCaller ObcInterface_obstacleDel;
		RTT::OperationCaller ObcInterface_track;
		RTT::OperationCaller ObcInterface_altitude;
				
				
				
		RTT::OperationCaller CameraInterface_setGainAutoMax;
		RTT::OperationCaller CameraInterface_getGainAutoMin;
		RTT::OperationCaller CameraInterface_getInterfaceName;
		RTT::OperationCaller CameraInterface_setGainAutoMin;
		RTT::OperationCaller CameraInterface_getGainAuto;
		RTT::OperationCaller CameraInterface_setGainAuto;
		RTT::OperationCaller CameraInterface_getBrightness;
		RTT::OperationCaller CameraInterface_setShutterAutoMin;
		RTT::OperationCaller CameraInterface_getGain;
		RTT::OperationCaller CameraInterface_setShutterAutoMax;
		RTT::OperationCaller CameraInterface_getGainAutoMax;
		RTT::OperationCaller CameraInterface_getShutterAuto;
		RTT::OperationCaller CameraInterface_setShutter;
		RTT::OperationCaller CameraInterface_setBrightness;
		RTT::OperationCaller CameraInterface_setGain;
		RTT::OperationCaller CameraInterface_getShuter;
		RTT::OperationCaller CameraInterface_getShutterAutoMax;
		RTT::OperationCaller CameraInterface_getShutterAutoMin;
		RTT::OperationCaller CameraInterface_init;
		RTT::OperationCaller CameraInterface_setShutterAuto;


			public: InputPort<Talc::Avionique::State> state;
			public: InputPort<Video::Image> image;

	
	
	// Constructor
	public: RMaxControlSystem (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
			, state("state")	
			, image("image")	
			, ObcInterface_wayPop ("ObcInterface_wayPop")
			, ObcInterface_wayPush ("ObcInterface_wayPush")
			, ObcInterface_getMaxV ("ObcInterface_getMaxV")
			, ObcInterface_waypointDel ("ObcInterface_waypointDel")
			, ObcInterface_getMaxA ("ObcInterface_getMaxA")
			, ObcInterface_getPhaseStr ("ObcInterface_getPhaseStr")
			, ObcInterface_getPhase ("ObcInterface_getPhase")
			, ObcInterface_quickSetObj ("ObcInterface_quickSetObj")
			, ObcInterface_obstacleAdd ("ObcInterface_obstacleAdd")
			, ObcInterface_getMinDt ("ObcInterface_getMinDt")
			, ObcInterface_setObj ("ObcInterface_setObj")
			, ObcInterface_setPhase ("ObcInterface_setPhase")
			, ObcInterface_waypointAdd ("ObcInterface_waypointAdd")
			, ObcInterface_getInterfaceName ("ObcInterface_getInterfaceName")
			, ObcInterface_quickWaypointDel ("ObcInterface_quickWaypointDel")
			, ObcInterface_move ("ObcInterface_move")
			, ObcInterface_setPhaseDescente ("ObcInterface_setPhaseDescente")
			, ObcInterface_wayDel ("ObcInterface_wayDel")
			, ObcInterface_getState ("ObcInterface_getState")
			, ObcInterface_setPhaseStr ("ObcInterface_setPhaseStr")
			, ObcInterface_gotou ("ObcInterface_gotou")
			, ObcInterface_wayAdd ("ObcInterface_wayAdd")
			, ObcInterface_obstacleDel ("ObcInterface_obstacleDel")
			, ObcInterface_track ("ObcInterface_track")
			, ObcInterface_altitude ("ObcInterface_altitude")
			, CameraInterface_setGainAutoMax ("CameraInterface_setGainAutoMax")
			, CameraInterface_getGainAutoMin ("CameraInterface_getGainAutoMin")
			, CameraInterface_getInterfaceName ("CameraInterface_getInterfaceName")
			, CameraInterface_setGainAutoMin ("CameraInterface_setGainAutoMin")
			, CameraInterface_getGainAuto ("CameraInterface_getGainAuto")
			, CameraInterface_setGainAuto ("CameraInterface_setGainAuto")
			, CameraInterface_getBrightness ("CameraInterface_getBrightness")
			, CameraInterface_setShutterAutoMin ("CameraInterface_setShutterAutoMin")
			, CameraInterface_getGain ("CameraInterface_getGain")
			, CameraInterface_setShutterAutoMax ("CameraInterface_setShutterAutoMax")
			, CameraInterface_getGainAutoMax ("CameraInterface_getGainAutoMax")
			, CameraInterface_getShutterAuto ("CameraInterface_getShutterAuto")
			, CameraInterface_setShutter ("CameraInterface_setShutter")
			, CameraInterface_setBrightness ("CameraInterface_setBrightness")
			, CameraInterface_setGain ("CameraInterface_setGain")
			, CameraInterface_getShuter ("CameraInterface_getShuter")
			, CameraInterface_getShutterAutoMax ("CameraInterface_getShutterAutoMax")
			, CameraInterface_getShutterAutoMin ("CameraInterface_getShutterAutoMin")
			, CameraInterface_init ("CameraInterface_init")
			, CameraInterface_setShutterAuto ("CameraInterface_setShutterAuto")
  		{ 	
		this->ports()->addPort(state);	
		this->ports()->addPort(image);	

		


		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_wayPop);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_wayPush);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_getMaxV);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_waypointDel);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_getMaxA);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_getPhaseStr);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_getPhase);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_quickSetObj);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_obstacleAdd);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_getMinDt);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_setObj);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_setPhase);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_waypointAdd);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_getInterfaceName);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_quickWaypointDel);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_move);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_setPhaseDescente);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_wayDel);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_getState);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_setPhaseStr);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_gotou);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_wayAdd);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_obstacleDel);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_track);
		this->requires("ObcInterface")
			->addOperationCaller(ObcInterface_altitude);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setGainAutoMax);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getGainAutoMin);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getInterfaceName);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setGainAutoMin);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getGainAuto);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setGainAuto);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getBrightness);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setShutterAutoMin);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getGain);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setShutterAutoMax);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getGainAutoMax);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getShutterAuto);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setShutter);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setBrightness);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setGain);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getShuter);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getShutterAutoMax);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_getShutterAutoMin);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_init);
		this->requires("CameraInterface")
			->addOperationCaller(CameraInterface_setShutterAuto);
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
