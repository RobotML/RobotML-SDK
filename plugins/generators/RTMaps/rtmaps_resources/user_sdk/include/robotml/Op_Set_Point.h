#ifndef ___Op_Set_Point_H__
#define ___Op_Set_Point_H__

#include "robotml/Velocity_Linear.h"
#include "robotml/Angular.h"

class Op_Set_Point {
	public:
	Velocity_Linear velocity;
	Angular orientation;
};


#endif //___Op_Set_Point_H__
