#ifndef __EFFIBOX_Perception_HPP__
#define __EFFIBOX_Perception_HPP__

//effitools
#include <effitools/data/taskbuffer.hpp>
#include <effitools/data/shareddata.hpp>
#include <effitools/data/lock.hpp>

//local includes
#include "Datatypes/all.hpp"




class Perception: public effitools::Lock
{
public:
	//constructor
	Perception();


	//input ports declaration (events)
	void input(LaserScan const& data);

	//output ports declaration (pointer on a concrete sub-component output port)
	effitools::TaskBuffer<Zone> * output;





private:
	//last data on each input port
	LaserScan lastDatainput;
};

#endif
