from morse.builder import *

class CameraMain_002:
	def __init(self, myRobot)__:
		self.sensor = VideoCamera()

		self.sensor.translate(x=0, y=0, z=0)

		self.sensor.rotate(x=0)
 
		height = 0.0*2
		width = 0.0*2
		alpha_u = 0.0
		alpha_v = 0.0

		if (width>height):
			focal = (alpha_u+alpha_v)/2*32/width
		else:
			focal = (alpha_u+alpha_v)/2*32/height

		self.sensor.properties(cam_width = width, cam_height = height, cam_focal = focal)

		self.sensor.frequency(0.0)

		self.sensor.add_stream('ros')
		myRobot.append(self.sensor)
