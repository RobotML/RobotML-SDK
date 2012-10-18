#include <rtt/Port.hpp>#include<sensor_msgs/Range.h>

#include<sensor_msgs/Range.h>#include<geometry_msgs/Twist.h>

#include<geometry_msgs/Twist.h>
#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>

using namespace std;
using namespace RTT;
using namespace Orocos;
//in case of datatypes use, uncomment the using namespace command below
//using namespace RobotMLModel_types;
namespace RobotMLModel	 {
class Navigation
	: public RTT::TaskContext 
{   
	// ports, operations and attributes

// Operations 

	


	
	
	// Constructor
	public: Navigation (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
  		{ 	

		


	}
	// Destructor
    ~Navigation() {}
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
#include <rtt/Component.hpp>
ORO_CREATE_COMPONENT(RobotMLModel::Navigation)

