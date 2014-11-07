#ifndef ___Int64MultiArray_H__
#define ___Int64MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class Int64MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<Int64> data;
};


#endif //___Int64MultiArray_H__
