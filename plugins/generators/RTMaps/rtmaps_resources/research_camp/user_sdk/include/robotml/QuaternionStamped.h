#ifndef ___QuaternionStamped_H__
#define ___QuaternionStamped_H__

#include "robotml/Quaternion.h"
#include "robotml/Header.h"

class QuaternionStamped {
	public:
	Header header;
	Quaternion quaternion;
};


#endif //___QuaternionStamped_H__
