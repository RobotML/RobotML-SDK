#ifndef ___PolygonStamped_H__
#define ___PolygonStamped_H__

#include "robotml/Polygon.h"
#include "robotml/Header.h"

class PolygonStamped {
	public:
	Header header;
	Polygon polygon;
};


#endif //___PolygonStamped_H__
