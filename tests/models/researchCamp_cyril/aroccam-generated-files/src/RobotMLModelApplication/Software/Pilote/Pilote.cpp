#include "Pilote.hpp"

//boost
#include <boost/bind.hpp>



Pilote::Pilote()
{

	//ports initializations
	ouput = new effitools::TaskBuffer<SpeedTics>();


}

void Pilote::input(Zone const& data)
{
	lock(); //lock for thread safety

	lastDatainput = data;

	//PROCESSING

	//to complete


	unlock(); //do not forget to unlock !
}




