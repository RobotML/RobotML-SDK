#ifndef ___PointStamped_H__
#define ___PointStamped_H__

#include "robotml/Point.h"
#include "robotml/Header.h"

class PointStamped {
	public:
	Header header;
	Point point;
};


#endif //___PointStamped_H__
