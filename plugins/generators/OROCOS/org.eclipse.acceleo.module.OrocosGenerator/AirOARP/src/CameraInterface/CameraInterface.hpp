#include <string>
#include <numeric>


namespace Talc{
namespace Video{


	class CameraInterface 
		: public RTT::TaskContext 
	{
  
				

				public: std::string CameraInterface_getInterfaceName(

					

        );
		 void CameraInterface_setGain( 		
					

        );
		 void CameraInterface_getGain( 		
					

        );
		 void CameraInterface_setGainAuto( 		
					

        );
		 void CameraInterface_getGainAuto( 		
					

        );
		 void CameraInterface_setGainAutoMin( 		
					

        );
		 void CameraInterface_getGainAutoMin( 		
					

        );
		 void CameraInterface_setGainAutoMax( 		
					

        );
		 void CameraInterface_getGainAutoMax( 		
					

        );
		 void CameraInterface_setShutter( 		
					

        );
		 void CameraInterface_getShuter( 		
					

        );
		 void CameraInterface_setShutterAuto( 		
					

        );
		 void CameraInterface_getShutterAuto( 		
					

        );
		 void CameraInterface_setShutterAutoMin( 		
					

        );
		 void CameraInterface_getShutterAutoMin( 		
					

        );
		 void CameraInterface_setShutterAutoMax( 		
					

        );
		 void CameraInterface_getShutterAutoMax( 		
					

        );
		 void CameraInterface_setBrightness( 		
					

        );
		 void CameraInterface_getBrightness( 		
					

        );
				

				public: bool CameraInterface_init(

					
				Image ,

        );

		CameraInterface (const std::string& name) = 0;
		virtual ~CameraInterface() {}
	};
}
}
}
