----- Library -----
require "rttlib"
require "rttros"
require "rfsm"
require "rfsm_rtt"
require "rfsmpp"

----- Init local variables -----
local StateMachine1

----- Ports -----
Camera = rtt.InputPort("/sensor_msgs/Image")			
inport_gyro = rtt.InputPort("/std_msgs/String")			
Target = rtt.OutputPort("/geometry_msgs/Point")		
rtt.getTC():addPort(Camera, "Camera", "A sensor_msgs::Image Port in Component SearchLandingSite");	
rtt.getTC():addPort(Target, "Target", "A geometry_msgs::Point Port in Component SearchLandingSite");	
rtt.getTC():addPort(inport_gyro, "inport_gyro", "A std_msgs::String Port in Component SearchLandingSite");	

----- Property -----
f = rtt.Property("bool");
rtt.getTC():addProperty(f, "f", " A bool Port in Component RobotMLModel ")
r = rtt.Property("bool");
rtt.getTC():addProperty(r, "r", " A bool Port in Component RobotMLModel ")
wp = rtt.Property("int");
rtt.getTC():addProperty(wp, "wp", " A int Port in Component RobotMLModel ")
size = rtt.Property("int");
rtt.getTC():addProperty(size, "size", " A int Port in Component RobotMLModel ")
route = rtt.Property("/geometry_msgs/Point");
rtt.getTC():addProperty(route, "route", " A geometry_msgs::Point Port in Component RobotMLModel ")
x = rtt.Property("double");
rtt.getTC():addProperty(x, "x", " A double Port in Component RobotMLModel ")
y = rtt.Property("double");
rtt.getTC():addProperty(y, "y", " A double Port in Component RobotMLModel ")
z = rtt.Property("double");
rtt.getTC():addProperty(z, "z", " A double Port in Component RobotMLModel ")
argminx = rtt.Property("double");
rtt.getTC():addProperty(argminx, "argminx", " A double Port in Component RobotMLModel ")
argminy = rtt.Property("double");
rtt.getTC():addProperty(argminy, "argminy", " A double Port in Component RobotMLModel ")
landing_site_found = rtt.Property("bool");
rtt.getTC():addProperty(landing_site_found, "landing_site_found", " A bool Port in Component RobotMLModel ")

----- Operation ----- 
 
function configureHook()        
	-----configure fsm-----
	StateMachine1 = rfsm.init(rfsm.load("StateMachine1.lua"))
	--~ StateMachine1.dbg=rfsmpp.gen_dbgcolor()
    return true
end
 
function updateHook()
    -----start fsm-----
    rfsm.run(StateMachine1)
end

function cleanupHook()
    -----cleanup ports-----
	rtt.getTC():removePort(Camera:info().name)
	rtt.getTC():removePort(Target:info().name)
	rtt.getTC():removePort(inport_gyro:info().name)
	Camera:delete()	
	Target:delete()	
	inport_gyro:delete()	
end

function stopHook()
end

