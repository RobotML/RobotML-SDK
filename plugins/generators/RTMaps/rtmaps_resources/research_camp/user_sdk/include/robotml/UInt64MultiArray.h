#ifndef ___UInt64MultiArray_H__
#define ___UInt64MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class UInt64MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<UInt64> data;
};


#endif //___UInt64MultiArray_H__
