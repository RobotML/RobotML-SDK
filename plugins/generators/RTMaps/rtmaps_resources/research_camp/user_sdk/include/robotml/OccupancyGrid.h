#ifndef ___OccupancyGrid_H__
#define ___OccupancyGrid_H__

#include "robotml/Header.h"
#include "robotml/MapMetaData.h"

class OccupancyGrid {
	public:
	Header header;
	MapMetaData info;
	std::vector<Int8> data;
};


#endif //___OccupancyGrid_H__
