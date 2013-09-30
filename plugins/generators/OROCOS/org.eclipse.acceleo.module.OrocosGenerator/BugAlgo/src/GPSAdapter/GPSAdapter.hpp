#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>
#include <rtt/Port.hpp>
#include <iostream>
#include <numeric>
		#include "../Localisation/TaskLocalisation.hpp"
		#include "../Localisation/TaskLocalisation.hpp"
		#include "../Datatypes/Point.hpp"
		#include "../Datatypes/Point.hpp"
#include <stdlib.h>
#include <math.h>

using namespace std;
using namespace RTT;




namespace RobotMLModel{
namespace BugController{
class GPSAdapter:
	public TaskLocalisation,
	public RTT::TaskContext 
{   
	// ports, operations and attributes

				
				
				


			public: InputPort<geometry_msgs::Point> gps_in;

	
	// Constructor
	public: GPSAdapter (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
			, gps_in("gps_in")	
  		{ 	
		this->ports()->addPort(gps_in);	

		


	}
	// Destructor
    ~GPSAdapter() {}
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
