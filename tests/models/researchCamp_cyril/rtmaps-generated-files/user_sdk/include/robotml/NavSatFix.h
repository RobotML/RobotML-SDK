#ifndef ___NavSatFix_H__
#define ___NavSatFix_H__

#include "robotml/Header.h"
#include "robotml/STATUS_TYPE.h"
#include "robotml/COVARIANCE_TYPE.h"
#include "robotml/SERVICE_TYPE.h"

class NavSatFix {
	public:
	STATUS_TYPE status;
	SERVICE_TYPE service;
	Header header;
	Float64 latitude;
	Float64 longitude;
	Float64 altitude;
	Float64 position_covariance[9];
	COVARIANCE_TYPE position_covariance_type;
};


#endif //___NavSatFix_H__
