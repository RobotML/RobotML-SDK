#ifndef ___UInt32MultiArray_H__
#define ___UInt32MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class UInt32MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<UInt32> data;
};


#endif //___UInt32MultiArray_H__
