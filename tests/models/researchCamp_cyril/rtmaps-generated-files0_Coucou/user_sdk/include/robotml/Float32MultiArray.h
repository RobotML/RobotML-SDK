#ifndef ___Float32MultiArray_H__
#define ___Float32MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class Float32MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<Float32> data;
};


#endif //___Float32MultiArray_H__
