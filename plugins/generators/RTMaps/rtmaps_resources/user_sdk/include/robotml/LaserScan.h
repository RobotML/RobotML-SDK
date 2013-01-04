#ifndef ___LaserScan_H__
#define ___LaserScan_H__

#include "robotml/Header.h"

class LaserScan {
	public:
	Header header;
	Float32 angle_min;
	Float32 angle_max;
	Float32 angle_increment;
	Float32 time_increment;
	Float32 scan_time;
	Float32 range_min;
	Float32 range_max;
	std::vector<Float32> range;
	std::vector<Float32> intensities;
};


#endif //___LaserScan_H__
