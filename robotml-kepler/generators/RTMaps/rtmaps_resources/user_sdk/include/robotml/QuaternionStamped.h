#ifndef ___QuaternionStamped_H__
#define ___QuaternionStamped_H__

#include "robotml/Header.h"
#include "robotml/Quaternion.h"

class QuaternionStamped {
	public:
	Header header;
	Quaternion quaternion;
};


#endif //___QuaternionStamped_H__
