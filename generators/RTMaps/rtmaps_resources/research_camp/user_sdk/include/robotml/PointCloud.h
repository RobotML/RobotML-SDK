#ifndef ___PointCloud_H__
#define ___PointCloud_H__

#include "robotml/ChannelFloat32.h"
#include "robotml/Header.h"
#include "robotml/Point32.h"

class PointCloud {
	public:
	Header header;
	std::vector<Point32> points;
	std::vector<ChannelFloat32> channels;
};


#endif //___PointCloud_H__
