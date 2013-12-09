#ifndef ___DiagnosticArray_H__
#define ___DiagnosticArray_H__

#include "robotml/DiagnosticStatus.h"
#include "robotml/Header.h"
#include "robotml/KeyValue.h"

class DiagnosticArray {
	public:
	Header header;
	std::vector<DiagnosticStatus> status;
	std::vector<KeyValue> values;
};


#endif //___DiagnosticArray_H__
