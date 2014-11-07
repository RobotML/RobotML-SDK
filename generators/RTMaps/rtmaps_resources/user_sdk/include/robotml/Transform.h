#ifndef ___Transform_H__
#define ___Transform_H__

#include "robotml/Quaternion.h"
#include "robotml/Vector3.h"

class Transform {
	public:
	Vector3 translation;
	Quaternion rotation;
};


#endif //___Transform_H__
