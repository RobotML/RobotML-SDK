#ifndef __TASK_LOCALISATION_hpp__
#define __TASK_LOCALISATION_hpp__
#include <string>
#include <numeric>
#include <rtt/TaskContext.hpp>
#include <rtt/Operation.hpp>
#include"Localisation.hpp"
class TaskLocalisation 
		:  public RTT::TaskContext, public Localisation{
public:
TaskLocalisation(std::string& name): 
TaskContext(name){
		this->provides("Localisation"->addOperation("Localisation_getOrientation", &Localisation::Localisation_getOrientation, this, RTT::ClientThread)
			.doc("Description : Quaternion");
		this->provides("Localisation"->addOperation("Localisation_getPosition", &Localisation::Localisation_getPosition, this, RTT::ClientThread)
			.doc("Description : Point");
}
};
#endif
