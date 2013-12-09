#ifndef ___PoseStamped_H__
#define ___PoseStamped_H__

#include "robotml/Header.h"
#include "robotml/Pose.h"

class PoseStamped {
	public:
	Header header;
	Pose pose;
};


#endif //___PoseStamped_H__
