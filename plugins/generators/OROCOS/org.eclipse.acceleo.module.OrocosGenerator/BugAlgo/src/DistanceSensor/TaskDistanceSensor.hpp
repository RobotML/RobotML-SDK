#ifndef __TASK_DISTANCESENSOR_hpp__
#define __TASK_DISTANCESENSOR_hpp__
#include <string>
#include <numeric>
#include <rtt/TaskContext.hpp>
#include <rtt/Operation.hpp>
#include"DistanceSensor.hpp"
class TaskDistanceSensor 
		:  public RTT::TaskContext, public DistanceSensor{
public:
TaskDistanceSensor(std::string& name): 
TaskContext(name){
		this->provides("DistanceSensor"->addOperation("DistanceSensor_obstacleOnTheLeft", &DistanceSensor::DistanceSensor_obstacleOnTheLeft, this, RTT::ClientThread)
			.doc("Description : Bool");
		this->provides("DistanceSensor"->addOperation("DistanceSensor_obstacleOnTheRight", &DistanceSensor::DistanceSensor_obstacleOnTheRight, this, RTT::ClientThread)
			.doc("Description : Bool");
		this->provides("DistanceSensor"->addOperation("DistanceSensor_obstacleInFrontOfTheRobot", &DistanceSensor::DistanceSensor_obstacleInFrontOfTheRobot, this, RTT::ClientThread)
			.doc("Description : Bool");
		this->provides("DistanceSensor"->addOperation("DistanceSensor_getLeftDistance", &DistanceSensor::DistanceSensor_getLeftDistance, this, RTT::ClientThread)
			.doc("Description : Double");
		this->provides("DistanceSensor"->addOperation("DistanceSensor_getSafeDistance", &DistanceSensor::DistanceSensor_getSafeDistance, this, RTT::ClientThread)
			.doc("Description : Double");
		this->provides("DistanceSensor"->addOperation("DistanceSensor_getRightDistance", &DistanceSensor::DistanceSensor_getRightDistance, this, RTT::ClientThread)
			.doc("Description : Double");
}
};
#endif
