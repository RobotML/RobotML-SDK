#ifndef __MAPS_ROBOTML_PRIMITIVE_DATATYPES_H__
#define __MAPS_ROBOTML_PRIMITIVE_DATATYPES_H__

#include <string>
#include <vector>

#include "maps_types.h"

/**************************************/
/* PRIMITIVE DATA TYPES */
/**************************************/
typedef bool Bool;
typedef MAPSUInt8 Byte;
typedef MAPSUInt8 Char;
typedef MAPSInt8 Int8;
typedef MAPSUInt8 UInt8;
typedef MAPSInt16 Int16;
typedef MAPSUInt16 UInt16;
typedef MAPSInt32 Int32;
typedef MAPSUInt32 UInt32;
typedef MAPSInt64 Int64;
typedef MAPSUInt64 UInt64;
typedef MAPSFloat32 Float32;
typedef MAPSFloat64 Float64;

typedef std::string String;

typedef MAPSTimestamp 	Time;
typedef MAPSDelay 		Duration;

class MAPSRobotMLString {
	std::string text;
};

#endif //__MAPS_ROBOTML_PRIMITIVE_DATATYPES_H__
