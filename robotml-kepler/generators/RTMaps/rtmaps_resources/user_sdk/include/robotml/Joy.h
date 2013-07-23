#ifndef ___Joy_H__
#define ___Joy_H__

#include "robotml/Header.h"

class Joy {
	public:
	Header header;
	std::vector<Float32> axes;
	std::vector<Int32> buttons;
};


#endif //___Joy_H__
