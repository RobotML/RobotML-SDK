#ifndef ___Path_H__
#define ___Path_H__

#include "robotml/Header.h"
#include "robotml/PoseStamped.h"

class Path {
	public:
	Header header;
	std::vector<PoseStamped> poses;
};


#endif //___Path_H__
