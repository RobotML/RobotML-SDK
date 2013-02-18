#ifndef _IMAGE_H_
#define _IMAGE_H_

namespace Talc{
 struct Image{
	public double m_compression_for_logging;
	private double m_ts;
	private unsigned m_width;
	private unsigned m_height;
	private bool m_color;
	private unsigned char * m_pnm_image;
	private unsigned char * m_pixels;
	private unsigned char ** m_rows;
  }
		virtual public unsigned getWidth (

		virtual public unsigned getHeight (

}

#endif // _IMAGE_H_
