#ifndef ___UInt8MultiArray_H__
#define ___UInt8MultiArray_H__

#include "robotml/MultiArrayLayout.h"

class UInt8MultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<UInt8> data;
};


#endif //___UInt8MultiArray_H__
