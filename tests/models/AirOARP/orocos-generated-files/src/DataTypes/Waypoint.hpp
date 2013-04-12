#ifndef _WAYPOINT_H_
#define _WAYPOINT_H_

#include <std_msgs/UInt32.h>
#include <std_msgs/Float64.h>
#include <std_msgs/Float64.h>
#include <std_msgs/Float64.h>
#include <std_msgs/Float64.h>
#include <std_msgs/Float64.h>
#include <std_msgs/Float64.h>
#include <std_msgs/Float64.h>
#include <std_msgs/Float64.h>
#include <std_msgs/Float64.h>
namespace Talc::Avionique{
	struct Waypoint{
		public: UInt32 m_id;
		
		public: Float64 m_x;
		
		public: Float64 m_y;
		
		public: Float64 m_z;
		
		public: Float64 m_cap;
		
		public: Float64 m_derap;
		
		public: Float64 m_vel;
		
		public: Float64 m_v_prox;
		
		public: Float64 m_d_prox;
		
		public: Float64 m_wait;
		
  };
};
#endif // _WAYPOINT_H_
