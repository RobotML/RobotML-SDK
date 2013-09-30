----- Library -----
require "rttlib"
require "rttros"
require "rfsm"
require "rfsm_rtt"
require "rfsmpp"

----- Init local variables -----
local StateMachine1

----- Ports -----
outport = rtt.OutputPort("/geometry_msgs/Twist")		
rtt.getTC():addPort(outport, "outport", "A geometry_msgs::Twist Port in Component BugAlgorithm");	

----- Property -----

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
	rtt.getTC():removePort(outport:info().name)
	outport:delete()	
end

function stopHook()
end

