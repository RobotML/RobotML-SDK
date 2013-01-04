#ifndef ___Velocity_Error_H__
#define ___Velocity_Error_H__

#include "robotml/Velocity_Angular.h"
#include "robotml/Velocity_Linear.h"

class Velocity_Error {
	public:
	Velocity_Linear velocity_linear_err;
	Velocity_Angular velocity_angular_err;
};


#endif //___Velocity_Error_H__
