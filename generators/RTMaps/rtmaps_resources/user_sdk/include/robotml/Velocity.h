#ifndef ___Velocity_H__
#define ___Velocity_H__

#include "robotml/Velocity_Linear.h"
#include "robotml/Velocity_Angular.h"

class Velocity {
	public:
	Velocity_Linear velocity_linear;
	Velocity_Angular velocity_angular;
};


#endif //___Velocity_H__
