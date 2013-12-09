#ifndef _IMAGE_H_
#define _IMAGE_H_

#include "../DataTypes/CppDataTypes.hpp"
namespace Talc{
namespace Video{

	struct Image{
		public: int m_compression_for_logging ;
		
		private: double m_ts ;
		
		private: unsigned m_width ;
		
		private: unsigned m_height ;
		
		private: Bool m_color ;
		
		private: unsigned char * m_pnm_image ;
		
		private: unsigned char * m_pixels ;
		
		private: unsigned char ** m_rows ;
		
  

				public: unsigned getWidth(
			
		

        );

				public: unsigned getHeight(
			
		

        );
};

}
}

#endif // _IMAGE_H_
