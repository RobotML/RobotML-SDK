#ifndef ___Int8MultiArray_H__
#define ___Int8MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class Int8MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<Int8> data;
};


#endif //___Int8MultiArray_H__
