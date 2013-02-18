#ifndef ___DiagnosticStatus_H__
#define ___DiagnosticStatus_H__

#include "robotml/KeyValue.h"

class DiagnosticStatus {
	public:
	Byte OK;
	Byte WARN;
	Byte ERROR;
	Byte level;
	String name;
	String message;
	String hardware_id;
	std::vector<KeyValue> values;
};


#endif //___DiagnosticStatus_H__
