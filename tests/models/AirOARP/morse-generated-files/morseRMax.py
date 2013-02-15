from morse.builder import *
# Generate robots
robot = Robot('RMax.blend')
robot.name = "RMax"
# CameraMain_002
camera = Sensor('video_camera')
camera.properties(cam_width = 0.0,
                  cam_height = 0.0)
camera.frequency(0.0)
camera.configure_mw('ros')
robot.append(camera)
# Gyroscope_001
#generic_sensor = Sensor('Gyroscope_001')
#generic_sensor.frequency(0.0)
#generic_sensor.configure_mw('ros')
#robot.append(generic_sensor)
# GPS_001
gps = Sensor('gps')
gps.frequency(0.0)
gps.configure_mw('ros')
robot.append(gps)
# Motion_Controller
#generic_actuator = Actuator('Motion_Controller')
#generic_actuator.configure_mw('ros')
#robot.append(generic_actuator)
# RMaxControlSystem
#   TBD
# AvionicSystem
#   TBD
# CameraSystem
#   TBD
# RmaxHardwareArchitecture
#   TBD
# RMaxSoftwareArchitecture
#   TBD
# Camera
#   TBD
# Obc
#   TBD
motion = Actuator('v_omega')
motion.configure_mw('ros')
robot.append(motion)

# Select the environement
env = Environment("RMax.blend")

