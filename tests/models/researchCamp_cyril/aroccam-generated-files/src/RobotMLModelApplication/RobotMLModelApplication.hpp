#ifndef __EFFIBOX_RobotMLModelApplication_HPP__
#define __EFFIBOX_RobotMLModelApplication_HPP__

//effibox
#include <effibox/application/application.hpp>

//local includes
#include "Datatypes/all.hpp"

#include "Software/Perception/Perception.hpp"
#include "Software/Pilote/Pilote.hpp"

class RobotMLModelApplication: public Application
{
	APPLICATION_DECLARATION(RobotMLModelApplication)

public:
	void initialization(const std::string & inParameters);
	void finalization();

	//effibox cameras event callbacks

	//effibox rangefinder event callbacks
	void framehokuyo3(const effibox::FramePtr & f);

	//effibox gps events callbacks

	//effibox odometry events callbacks

	//effibox imu events callbacks

	void frameError(const effibox::FramePtr & f);

	//robotML components
	Perception Perception1;
	Pilote Pilote2;
};

#endif
