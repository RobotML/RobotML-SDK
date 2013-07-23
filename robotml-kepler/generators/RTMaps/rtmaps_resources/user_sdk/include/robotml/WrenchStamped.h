#ifndef ___WrenchStamped_H__
#define ___WrenchStamped_H__

#include "robotml/Wrench.h"
#include "robotml/Header.h"

class WrenchStamped {
	public:
	Header header;
	Wrench wrench;
};


#endif //___WrenchStamped_H__
