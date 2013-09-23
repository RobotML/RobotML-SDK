#include <string>
#include <numeric>


namespace Talc{
namespace Avionique{


	class ObcInterface 
		: public RTT::TaskContext 
	{
  
				

				public: String ObcInterface_getInterfaceName(

					

        );
				

				public: Bool ObcInterface_getState(

					
				Float64 date,

		 		State &state,
 
        );
				

				public: Bool ObcInterface_setPhase(

					
				UInt32 phase,

        );
				

				public: Bool ObcInterface_setPhaseStr(

					
				String str,

        );
				

				public: Bool ObcInterface_setPhaseDescente(

					
				Float64 altitude,

        );
				

				public: UInt32 ObcInterface_getPhase(

					

        );
				

				public: String ObcInterface_getPhaseStr(

					

        );
				

				public: Bool ObcInterface_move(

					
				Float64 x,
				Float64 y,
				Float64 z,
				Float64 psi,

        );
				

				public: Bool ObcInterface_gotou(

					
				Float64 x,
				Float64 y,
				Float64 z,
				Float64 psi,

        );
				

				public: Bool ObcInterface_track(

					
				Float64 vx,
				Float64 vy,
				Float64 z,
				Float64 psi,

        );
				

				public: Bool ObcInterface_altitude(

					
				Float64 altitude,
				Bool enable,

        );
				

				public: Bool ObcInterface_waypointAdd(

					
				Waypoint wp,

        );
				

				public: Bool ObcInterface_waypointDel(

					
				Waypoint wp,

        );
				

				public: Bool ObcInterface_wayAdd(

					
				Way w,

        );
				

				public: Bool ObcInterface_wayDel(

					
				Way w,

        );
				

				public: Bool ObcInterface_wayPush(

					
				Way w,

        );
				

				public: Bool ObcInterface_wayPop(

					

        );
		 void ObcInterface_obstacleAdd( 		
					

        );
		 void ObcInterface_obstacleDel( 		
					

        );
		 void ObcInterface_setObj( 		
					

        );
		 void ObcInterface_quickWaypointDel( 		
					

        );
		 void ObcInterface_quickSetObj( 		
					

        );
		 void ObcInterface_getMinDt( 		
					

        );
		 void ObcInterface_getMaxV( 		
					

        );
		 void ObcInterface_getMaxA( 		
					

        );

		ObcInterface (const std::string& name) = 0;
		virtual ~ObcInterface() {}
	};
}
}
}
