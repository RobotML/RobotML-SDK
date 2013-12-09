#ifndef ___TwistWithCovariance_H__
#define ___TwistWithCovariance_H__

#include "robotml/Twist.h"

class TwistWithCovariance {
	public:
	Twist twist;
	Float64 covariance[36];
};


#endif //___TwistWithCovariance_H__
