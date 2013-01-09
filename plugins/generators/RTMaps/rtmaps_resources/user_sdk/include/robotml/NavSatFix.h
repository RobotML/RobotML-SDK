#ifndef ___NavSatFix_H__
#define ___NavSatFix_H__

#include "robotml/Header.h"

class NavSatFix {
	public:
	Int8 STATUS_NO_FIX;
	Int8 STATUS_FIX;
	Int8 STATUS_SBAS_FIX;
	Int8 STATUS_GBAS_FIX;
	Int8 status;
	UInt16 SERVICE_GPS;
	UInt16 SERVICE_GLONASS;
	UInt16 SERVICE_COMPASS;
	UInt16 SERVICE_GALILEO;
	UInt16 service;
	Header header;
	Float64 latitude;
	Float64 longitude;
	Float64 altitude;
	std::vector<Float64> position_covariance;
	UInt8 COVARIANCE_TYPE_UNKNOWN;
	UInt8 COVARIANCE_TYPE_APPROXIMATED;
	UInt8  COVARIANCE_TYPE_DIAGONAL_KNOWN;
	UInt8 COVARIANCE_TYPE_KNOWN;
	UInt8 position_covariance_type;
};


#endif //___NavSatFix_H__
