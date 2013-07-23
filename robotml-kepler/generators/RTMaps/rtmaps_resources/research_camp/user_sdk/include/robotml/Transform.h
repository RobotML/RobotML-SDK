#ifndef ___Transform_H__
#define ___Transform_H__

#include "robotml/Vector3.h"
#include "robotml/Quaternion.h"

class Transform {
	public:
	Vector3 translation;
	Quaternion rotation;
};


#endif //___Transform_H__
