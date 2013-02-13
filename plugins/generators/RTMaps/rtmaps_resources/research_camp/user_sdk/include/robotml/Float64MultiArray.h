#ifndef ___Float64MultiArray_H__
#define ___Float64MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class Float64MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<Float64> data;
};


#endif //___Float64MultiArray_H__
