#ifndef ___Int32MultiArray_H__
#define ___Int32MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class Int32MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<Int32> data;
};


#endif //___Int32MultiArray_H__
