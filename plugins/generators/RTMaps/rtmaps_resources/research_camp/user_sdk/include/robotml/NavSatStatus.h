#ifndef ___NavSatStatus_H__
#define ___NavSatStatus_H__


class NavSatStatus {
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
};


#endif //___NavSatStatus_H__
