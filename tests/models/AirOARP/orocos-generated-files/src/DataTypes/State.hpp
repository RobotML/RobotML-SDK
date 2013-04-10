#ifndef _STATE_H_
#define _STATE_H_

namespace Talc::Avionique{
	struct State{
		public: double m_ts_ref;
		
		public: double m_ts;
		
		public: double m_ts_remote;
		
		public: unsigned m_phase;
		
		public: unsigned m_wp;
		
		public: unsigned m_cpt;
		
		public: double m_h_int_time;
		
		public: double m_h;
		
		public: double m_gps_int_time;
		
		public: double m_pos;
		
		public: double m_att;
		
		public: double m_vel;
		
		public: double m_acc;
		
  };
};
#endif // _STATE_H_
