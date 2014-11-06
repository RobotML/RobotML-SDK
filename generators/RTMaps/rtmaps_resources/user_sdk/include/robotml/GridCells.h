#ifndef ___GridCells_H__
#define ___GridCells_H__

#include "robotml/Point.h"
#include "robotml/Header.h"

class GridCells {
	public:
	Header header;
	Float32 cell_width;
	Float32 cell_height;
	std::vector<Point> cells;
};


#endif //___GridCells_H__
