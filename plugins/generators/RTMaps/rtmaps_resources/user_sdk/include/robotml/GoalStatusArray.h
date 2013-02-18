#ifndef ___GoalStatusArray_H__
#define ___GoalStatusArray_H__

#include "robotml/GoalStatus.h"
#include "robotml/Header.h"

class GoalStatusArray {
	public:
	Header header;
	std::vector<GoalStatus> status_list;
};


#endif //___GoalStatusArray_H__
