class GPS_001:
	def __init(self, myRobot):
		self.sensor = Sensor('gps')

		self.sensor.frequency(0.0)
		self.sensor.configure_mw('ros')
		myRobot.append(self.sensor)
