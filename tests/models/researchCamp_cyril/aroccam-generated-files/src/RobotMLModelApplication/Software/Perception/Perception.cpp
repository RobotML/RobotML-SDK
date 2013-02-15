#include "Perception.hpp"

//boost
#include <boost/bind.hpp>



Perception::Perception()
{

	//ports initializations
	output = new effitools::TaskBuffer<Zone>();


}

void Perception::input(LaserScan const& data)
{
	lock(); //lock for thread safety

	lastDatainput = data;

	//PROCESSING

	//to complete


	unlock(); //do not forget to unlock !
}




