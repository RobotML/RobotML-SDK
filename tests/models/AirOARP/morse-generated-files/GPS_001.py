from morse.builder import *

class GPS_001:
	def __init(self, myRobot)__:
		self.sensor = GPS()

		self.sensor.translate(x=0, y=0, z=0)

		self.sensor.rotate(x=0)

		self.sensor.frequency(0.0)
		self.sensor.add_stream('ros')
		myRobot.append(self.sensor)
