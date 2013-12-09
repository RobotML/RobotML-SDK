#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>
#include <rtt/Port.hpp>
#include <iostream>
#include <numeric>
		#include "../DistanceSensor/TaskDistanceSensor.hpp"
		#include "../DistanceSensor/TaskDistanceSensor.hpp"
		#include "../Datatypes/LaserScan.hpp"
		#include "../Datatypes/LaserScan.hpp"
#include <stdlib.h>
#include <math.h>

using namespace std;
using namespace RTT;




namespace RobotMLModel{
namespace BugController{
class laserAdapter:
	public TaskDistanceSensor,
	public RTT::TaskContext 
{   
	// ports, operations and attributes

				
				
				


			public: InputPort<sensor_msgs::LaserScan> laser_in;

	
	// Constructor
	public: laserAdapter (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
			, laser_in("laser_in")	
  		{ 	
		this->ports()->addPort(laser_in);	

		


	}
	// Destructor
    ~laserAdapter() {}
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
