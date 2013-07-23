#ifndef ___MultiArrayLayout_H__
#define ___MultiArrayLayout_H__

#include "robotml/MultiArrayDimension.h"

class MultiArrayLayout {
	public:
	std::vector<MultiArrayDimension> dim;
	UInt32 data_offset;
};


#endif //___MultiArrayLayout_H__
