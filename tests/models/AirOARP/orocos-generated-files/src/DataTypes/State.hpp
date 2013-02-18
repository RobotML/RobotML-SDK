#ifndef _STATE_H_
#define _STATE_H_

namespace Talc{
 struct State{
	public Float32 m_ts_ref;
	public Float32 m_ts;
	public Float32 m_ts_remote;
	public UInt32 m_phase;
	public UInt32 m_wp;
	public UInt32 m_cpt;
	public Float32 m_h_int_time;
	public Float32 m_h;
	public Float32 m_gps_int_time;
	public Float32 m_pos;
	public Float32 m_att;
	public Float32 m_vel;
	public Float32 m_acc;
  }
}

#endif // _STATE_H_
