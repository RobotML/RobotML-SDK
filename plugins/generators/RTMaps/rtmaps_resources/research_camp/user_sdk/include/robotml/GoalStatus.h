#ifndef ___GoalStatus_H__
#define ___GoalStatus_H__


class GoalStatus {
	public:
	UInt8 PENDING;
	UInt8 ACTIVE;
	UInt8 PREEMPTED;
	UInt8 SUCCEEDED;
	UInt8 ABORTED;
	UInt8 REJECTED;
	UInt8 PREEMPTING;
	UInt8 RECALLING;
	UInt8 RECALLED;
	UInt8 LOST;
	String text;
	UInt8 status;
};


#endif //___GoalStatus_H__
