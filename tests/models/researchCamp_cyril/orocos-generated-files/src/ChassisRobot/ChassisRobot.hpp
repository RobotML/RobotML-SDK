#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>
#include <iostream>
#include <numeric>
#include "RobotMLModel_types.h"
#include <stdlib.h>
#include <math.h>


using namespace std;
using namespace RTT;
using namespace Orocos;
using namespace RobotMLModel_types;



namespace Robot1	 {
class ChassisRobot
	: public RTT::TaskContext 
{   
	// ports, operations and attributes
			public: InputPort<SpeedTics> Input;
		
			public: OutputPort<Velocity_Tics_LR> Velocity_out;
		
			public: OutputPort<Odo_Tics_LR> OdoTics_out;
		
			public: OutputPort<ProxyMeasurements> ProxyMeas_out;
		
			public: OutputPort<::Int8> Battery_out;
		
			public: OutputPort<::Int8> Current_out;

	
	
	// Constructor
	public: ChassisRobot (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
			, Input("Input")	
			, Velocity_out("Velocity_out")	
			, OdoTics_out("OdoTics_out")	
			, ProxyMeas_out("ProxyMeas_out")	
			, Battery_out("Battery_out")	
			, Current_out("Current_out")	
  		{ 	
		this->ports()->addPort(Input);	
		this->ports()->addPort(Velocity_out);	
		this->ports()->addPort(OdoTics_out);	
		this->ports()->addPort(ProxyMeas_out);	
		this->ports()->addPort(Battery_out);	
		this->ports()->addPort(Current_out);	

		


	}
	// Destructor
    ~ChassisRobot() {}
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
