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
class Pilote
	: public RTT::TaskContext 
{   
	// ports, operations and attributes
			public: InputPort<Zone> input;
		
			public: OutputPort<SpeedTics> ouput;

	
	
	// Constructor
	public: Pilote (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
			, ouput("ouput")	
			, input("input")	
  		{ 	
		this->ports()->addPort(ouput);	
		this->ports()->addPort(input);	

		


	}
	// Destructor
    ~Pilote() {}
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
