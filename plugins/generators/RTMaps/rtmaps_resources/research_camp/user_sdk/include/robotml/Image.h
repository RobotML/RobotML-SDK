#ifndef ___Image_H__
#define ___Image_H__

#include "robotml/Header.h"

class Image {
	public:
	Header header;
	UInt32 height;
	UInt32 width;
	String encoding;
	UInt8 is_bigendian;
	UInt32 step;
	std::vector<UInt8> data;
};


#endif //___Image_H__
