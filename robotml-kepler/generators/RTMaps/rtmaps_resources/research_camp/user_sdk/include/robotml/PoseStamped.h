#ifndef ___PoseStamped_H__
#define ___PoseStamped_H__

#include "robotml/Pose.h"
#include "robotml/Header.h"

class PoseStamped {
	public:
	Header header;
	Pose pose;
};


#endif //___PoseStamped_H__
