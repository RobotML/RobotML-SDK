#ifndef ___Int16MultiArray_H__
#define ___Int16MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class Int16MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<Int16> data;
};


#endif //___Int16MultiArray_H__
