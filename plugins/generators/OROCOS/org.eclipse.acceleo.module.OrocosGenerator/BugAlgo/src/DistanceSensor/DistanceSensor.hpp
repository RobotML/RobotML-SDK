#ifndef __DISTANCESENSOR_hpp__
#define __DISTANCESENSOR_hpp__
#include <string>
#include <numeric>


	class DistanceSensor 
	{
  
				

				public: virtual double DistanceSensor_getSafeDistance(

					

        ) = 0;
				

				public: virtual bool DistanceSensor_obstacleInFrontOfTheRobot(

					

        ) = 0;
				

				public: virtual bool DistanceSensor_obstacleOnTheLeft(

					

        ) = 0;
				

				public: virtual bool DistanceSensor_obstacleOnTheRight(

					

        ) = 0;
				

				public: virtual double DistanceSensor_getRightDistance(

					

        ) = 0;
				

				public: virtual double DistanceSensor_getLeftDistance(

					

        ) = 0;
	};

#endif
