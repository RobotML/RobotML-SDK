#ifndef __EFFIBOX_Pilote_HPP__
#define __EFFIBOX_Pilote_HPP__

//effitools
#include <effitools/data/taskbuffer.hpp>
#include <effitools/data/shareddata.hpp>
#include <effitools/data/lock.hpp>

//local includes
#include "Datatypes/all.hpp"




class Pilote: public effitools::Lock
{
public:
	//constructor
	Pilote();


	//input ports declaration (events)
	void input(Zone const& data);

	//output ports declaration (pointer on a concrete sub-component output port)
	effitools::TaskBuffer<SpeedTics> * ouput;





private:
	//last data on each input port
	Zone lastDatainput;
};

#endif
