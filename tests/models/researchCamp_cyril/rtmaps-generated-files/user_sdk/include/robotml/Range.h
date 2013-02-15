#ifndef ___Range_H__
#define ___Range_H__

#include "robotml/Header.h"

class Range {
	public:
	UInt8 ULTRASOUND;
	UInt8 INFRARED;
	Header header;
	UInt8 radiation_type;
	Float32 field_of_view;
	Float32 min_range;
	Float32 max_range;
	Float32 range;
};


#endif //___Range_H__
