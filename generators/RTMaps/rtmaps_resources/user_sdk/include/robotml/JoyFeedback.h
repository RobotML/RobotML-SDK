#ifndef ___JoyFeedback_H__
#define ___JoyFeedback_H__


class JoyFeedback {
	public:
	UInt8 TYPE_LED;
	UInt8 TYPE_RUMBLE;
	UInt8 TYPE_BUZZER;
	UInt8 type;
	UInt8 id;
	Float32 intensity;
};


#endif //___JoyFeedback_H__
