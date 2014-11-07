#ifndef ___JointState_H__
#define ___JointState_H__


class JointState {
	public:
	std::vector<String> name;
	std::vector<Float64> position;
	std::vector<Float64> velocity;
	std::vector<Float64> effort;
};


#endif //___JointState_H__
