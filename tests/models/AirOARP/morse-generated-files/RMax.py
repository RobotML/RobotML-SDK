from morse.builder import *

#Import sensors & actuators of this robot
import CameraMain_002
import Gyroscope_001
import GPS_001
import Motion_Controller
import RMaxControlSystem
import AvionicSystem
import CameraSystem
import RmaxHardwareArchitecture
import RMaxSoftwareArchitecture
import Camera
import Obc

robotRMax = Robot('missing path')

#Generate & use each sensors and actuators of this robot

CameraMain_002.CameraMain_002(RMax)

GPS_001.GPS_001(RMax)
#TBD: at the moment, we have no way in the meta-model to know what is the type of Actuator used
#generic_actuator = Actuator('Motion_Controller')
#generic_actuator.add_stream('ros')
#robot.append(generic_actuator)
#Motion_Controller.Motion_Controller(RMax)
