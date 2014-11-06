#ifndef ___Trajectory_H__
#define ___Trajectory_H__

#include "robotml/Metric.h"
#include "YouthChallengeModel/Nombre_Pos.h"
#include "robotml/Metric.h"
#include "robotml/Metric.h"

class Trajectory {
	public:
	std::vector<Metric> x_t;
	std::vector<Metric> y_t;
	std::vector<Metric> v_t;
	Time sample_time;
	Nombre_Pos sample_nb;
};


#endif //___Trajectory_H__
