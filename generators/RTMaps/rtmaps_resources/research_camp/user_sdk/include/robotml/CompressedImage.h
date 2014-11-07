#ifndef ___CompressedImage_H__
#define ___CompressedImage_H__

#include "robotml/Header.h"

class CompressedImage {
	public:
	Header header;
	String format;
	std::vector<UInt8> data;
};


#endif //___CompressedImage_H__
