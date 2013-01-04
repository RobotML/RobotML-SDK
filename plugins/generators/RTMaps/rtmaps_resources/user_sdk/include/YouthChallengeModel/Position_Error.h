#ifndef ___Position_Error_H__
#define ___Position_Error_H__

#include "robotml/Metric.h"
#include "robotml/Angular.h"
#include "robotml/Metric.h"
#include "robotml/Metric.h"

class Position_Error {
	public:
	Metric x_err;
	Metric y_err;
	Metric alt_err;
	Angular orientation_err;
};


#endif //___Position_Error_H__
