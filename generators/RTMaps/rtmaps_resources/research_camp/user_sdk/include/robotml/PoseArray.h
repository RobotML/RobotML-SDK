#ifndef ___PoseArray_H__
#define ___PoseArray_H__

#include "robotml/Header.h"
#include "robotml/Pose.h"

class PoseArray {
	public:
	Header header;
	std::vector<Pose> poses;
};


#endif //___PoseArray_H__
