#ifndef ___PointCloud2_H__
#define ___PointCloud2_H__

#include "robotml/PointField.h"
#include "robotml/Header.h"

class PointCloud2 {
	public:
	Header header;
	UInt32 height;
	UInt32 width;
	std::vector<PointField> fields;
	Bool is_bigendian;
	UInt32 point_step;
	UInt32 row_step;
	std::vector<UInt8> data;
	Bool is_dense;
};


#endif //___PointCloud2_H__
