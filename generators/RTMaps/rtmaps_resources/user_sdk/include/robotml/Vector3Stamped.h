#ifndef ___Vector3Stamped_H__
#define ___Vector3Stamped_H__

#include "robotml/Vector3.h"
#include "robotml/Header.h"

class Vector3Stamped {
	public:
	Header header;
	Vector3 vector;
};


#endif //___Vector3Stamped_H__
