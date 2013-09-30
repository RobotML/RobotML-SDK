#include <rtt/TaskContext.hpp>
#include <ocl/Component.hpp>
#include <rtt/Port.hpp>
#include <iostream>
#include <numeric>
		#include "../DistanceSensor/TaskDistanceSensor.hpp"
		#include "../DistanceSensor/TaskDistanceSensor.hpp"
		#include "../Localisation/TaskLocalisation.hpp"
		#include "../Localisation/TaskLocalisation.hpp"
		#include "../Datatypes/Twist.hpp"
		#include "../Datatypes/Twist.hpp"
#include <stdlib.h>
#include <math.h>

using namespace std;
using namespace RTT;





namespace RobotMLModel{
namespace BugController{
class BugAlgorithm:
	public RTT::TaskContext 
{   
	// ports, operations and attributes

				
				
				
		RTT::OperationCaller <Bool(
		)>DistanceSensor_obstacleOnTheRight;
		RTT::OperationCaller <Float32(
		)>DistanceSensor_getLeftDistance;
		RTT::OperationCaller <Bool(
		)>DistanceSensor_obstacleOnTheLeft;
		RTT::OperationCaller <Float32(
		)>DistanceSensor_getRightDistance;
		RTT::OperationCaller <Bool(
		)>DistanceSensor_obstacleInFrontOfTheRobot;
		RTT::OperationCaller <Float32(
		)>DistanceSensor_getSafeDistance;
				
				
				
		RTT::OperationCaller <Quaternion(
		)>Localisation_getOrientation;
		RTT::OperationCaller <Point(
		)>Localisation_getPosition;


			public: OutputPort<geometry_msgs::Twist> outport;

	
	
	// Constructor
	public: BugAlgorithm (const std::string& name)
		: TaskContext(name) 						//Add Rostopics		
			, outport("outport")	
			, DistanceSensor_obstacleOnTheRight ("DistanceSensor_obstacleOnTheRight")
			, DistanceSensor_getLeftDistance ("DistanceSensor_getLeftDistance")
			, DistanceSensor_obstacleOnTheLeft ("DistanceSensor_obstacleOnTheLeft")
			, DistanceSensor_getRightDistance ("DistanceSensor_getRightDistance")
			, DistanceSensor_obstacleInFrontOfTheRobot ("DistanceSensor_obstacleInFrontOfTheRobot")
			, DistanceSensor_getSafeDistance ("DistanceSensor_getSafeDistance")
			, Localisation_getOrientation ("Localisation_getOrientation")
			, Localisation_getPosition ("Localisation_getPosition")
  		{ 	
		this->ports()->addPort(outport);	

		


		this->requires("TaskDistanceSensor")
			->addOperationCaller(DistanceSensor_obstacleOnTheRight);
		this->requires("TaskDistanceSensor")
			->addOperationCaller(DistanceSensor_getLeftDistance);
		this->requires("TaskDistanceSensor")
			->addOperationCaller(DistanceSensor_obstacleOnTheLeft);
		this->requires("TaskDistanceSensor")
			->addOperationCaller(DistanceSensor_getRightDistance);
		this->requires("TaskDistanceSensor")
			->addOperationCaller(DistanceSensor_obstacleInFrontOfTheRobot);
		this->requires("TaskDistanceSensor")
			->addOperationCaller(DistanceSensor_getSafeDistance);
		this->requires("TaskLocalisation")
			->addOperationCaller(Localisation_getOrientation);
		this->requires("TaskLocalisation")
			->addOperationCaller(Localisation_getPosition);
	}
	// Destructor
    ~BugAlgorithm() {}
	/**
	 * This function is for the configuration code.
     * Return false to abort configuration.
     */
	bool configureHook() {
		if (!(requires("DistanceSensor")->connectTo(getPeer("laserAdapter")->provides("DistanceSensor")))){
			log(Info) << "connection problem to service" << endlog();
		}
		if (!(requires("Localisation")->connectTo(getPeer("GPSAdapter")->provides("Localisation")))){
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
}
