#ifndef ___ByteMultiArray_H__
#define ___ByteMultiArray_H__

#include "robotml/MultiArrayLayout.h"

class ByteMultiArray {
	public:
	MultiArrayLayout layout;
	std::vector<Byte> data;
};


#endif //___ByteMultiArray_H__
