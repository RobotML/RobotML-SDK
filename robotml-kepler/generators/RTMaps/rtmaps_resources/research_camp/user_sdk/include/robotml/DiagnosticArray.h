#ifndef ___DiagnosticArray_H__
#define ___DiagnosticArray_H__

#include "robotml/Header.h"
#include "robotml/KeyValue.h"
#include "robotml/DiagnosticStatus.h"

class DiagnosticArray {
	public:
	Header header;
	std::vector<DiagnosticStatus> status;
	std::vector<KeyValue> values;
};


#endif //___DiagnosticArray_H__
