#include "RobotMLModelApplication.hpp"

//stl
#include <iostream>

//opencv
#include <opencv/cv.h>

//effiqtviewer
#include <effiqtviewer/all.hpp>

//effibox
#include <effibox/interfaces/camera/all.hpp>
#include <effibox/interfaces/rangefinder/all.hpp>
#include <effibox/interfaces/gps/all.hpp>
#include <effibox/interfaces/vehicle/all.hpp>
#include <effibox/interfaces/imu/all.hpp>
#include <effibox/interfaces/timer/all.hpp>
#include <effibox/interfaces/thread/all.hpp>
#include <effibox/interface/frameerror.hpp>

using namespace effibox;
using namespace qtviewer;

void RobotMLModelApplication::initialization(const std::string &)
{
	//robotML component connections
  Perception1.output->addFunctionToExecute(boost::bind(&Pilote::input, &Pilote2, _1));
}

void RobotMLModelApplication::finalization()
{
}

//effibox cameras event callbacks

//effibox rangefinder event callbacks
void RobotMLModelApplication::framehokuyo3(const effibox::FramePtr & f)
{
	rangefinder::FrameRangefinderDistancePtr frame = frame_cast<rangefinder::FrameRangefinderDistance>(f);
	qtviewer::ShowFrame("hokuyo3", frame);

	//convert effibox sensor data to robotML sensor data
	const rangefinder::Layer & layer = frame->getLayer(0);
	LaserScan laserScan;
	laserScan.header.stamp = frame->getDate();
	laserScan.angle_min = layer.getScan(0).getAngle().value();
	laserScan.angle_max = layer.getScan(layer.getScanNumber()).getAngle().value();
	laserScan.angle_increment = (laserScan.angle_max-laserScan.angle_min)/(layer.getScanNumber()-1);
	laserScan.time_increment = 0; //NA
	laserScan.scan_time = 0; //NA
	laserScan.range_min = layer.getScan(0).getDistance().value();
	laserScan.range_max = layer.getScan(0).getDistance().value();
	laserScan.range.resize(layer.getScanNumber());
	for (size_t i = 0; i < layer.getScanNumber(); ++i)
	{
		laserScan.range.at(i) = layer.getScan(i).getDistance().value();
		if(laserScan.range.at(i) < laserScan.range_min)
			laserScan.range_min = laserScan.range.at(i);
		if(laserScan.range.at(i) > laserScan.range_max)
			laserScan.range_max = laserScan.range.at(i);
	}

	//Here send RobotML sensor data to your RobotML component input
	Perception1.input(laserScan);
}

//effibox gps events callbacks

//effibox odometry events callback

//effibox imu events callback

void RobotMLModelApplication::frameError(const FramePtr & f)
{
	effibox::FrameErrorPtr frame = frame_cast<FrameError>(f);
	std::cerr << "Frame error " << frame->getErrorMessage() << " occured at " << frame->getDate() << "!" << std::endl;
}
