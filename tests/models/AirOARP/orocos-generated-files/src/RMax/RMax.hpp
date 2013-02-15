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
class RMax
	: public RTT::TaskContext 
{   
	// ports, operations and attributes

	
	
	// Constructor
	public: RMax (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
  		{ 	

		


	}
	// Destructor
    ~RMax() {}
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
