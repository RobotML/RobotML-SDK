#ifndef ___CameraInfo_H__
#define ___CameraInfo_H__

#include "robotml/RegionOfInterest.h"
#include "robotml/Header.h"

class CameraInfo {
	public:
	Header header;
	UInt32 height;
	UInt32 width;
	String distorsion_model;
	std::vector<Float64> D;
	Float64 K[9];
	Float64 R[9];
	Float64 P[12];
	UInt32 beginning_x;
	UInt32 beginning_y;
	RegionOfInterest roi;
};


#endif //___CameraInfo_H__
