#ifndef ___TwistStamped_H__
#define ___TwistStamped_H__

#include "robotml/Twist.h"
#include "robotml/Header.h"

class TwistStamped {
	public:
	Header header;
	Twist twist;
};


#endif //___TwistStamped_H__
