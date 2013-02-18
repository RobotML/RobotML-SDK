from morse.builder import *
# Generate robots
robot = Robot('Robot1.blend')
robot.name = "Robot1"
# hokuyo
lidar = Sensor('sick')
lidar.properties(scan_window = 180, resolution = 1, laser_range = 0.0)
lidar.frequency(0.0)
lidar.configure_mw('ros')
robot.append(lidar)
# ChassisRobot
#   TBD
# ptf
#   TBD
motion = Actuator('v_omega')
motion.configure_mw('ros')
robot.append(motion)

# Select the environement
env = Environment("RobotMLModel.blend")

