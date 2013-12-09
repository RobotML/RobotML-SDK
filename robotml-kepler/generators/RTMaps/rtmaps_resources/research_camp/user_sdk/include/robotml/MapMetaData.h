#ifndef ___MapMetaData_H__
#define ___MapMetaData_H__

#include "robotml/Pose.h"

class MapMetaData {
	public:
	Time map_load_time;
	Float32 resolution;
	UInt32 width;
	Pose origin;
};


#endif //___MapMetaData_H__
