#ifndef _WAY_H_
#define _WAY_H_

#include "../DataTypes/CppDataTypes.hpp"
namespace Talc{
namespace Avionique{

	struct Way{
		public: UInt32 m_id ;
		
		public: UInt32 m_position_in_mission ;
		
		public: UInt32 m_nb_loops ;
		
		public: UInt32 m_nb_wp ;
		
		public: UInt32 m_first_wp_id ;
		
  
};

}
}

#endif // _WAY_H_
