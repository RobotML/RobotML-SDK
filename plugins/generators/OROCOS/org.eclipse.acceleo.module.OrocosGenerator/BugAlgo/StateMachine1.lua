-----create variables-----
local variable_twist0= rtt.Variable("/geometry_msgs/Twist")

-----FSM states-----------

	return rfsm.csta {
		
			motionToGoal = rfsm.sista {
	  		},
			identifyLeavePoint = rfsm.sista {
	  		},
			goToLeavePoint = rfsm.sista {
	  		},
			Failure = rfsm.sista {
	  		},
			Success = rfsm.sista {
	  		},
		    rfsm.transition {src="motionToGoal", tgt="identifyLeavePoint" 
			},
		    rfsm.transition {src="identifyLeavePoint", tgt="goToLeavePoint" 
			,guard=function()				
			end
			},
		    rfsm.transition {src="goToLeavePoint", tgt="motionToGoal" 
			},
		    rfsm.transition {src="EntryState", tgt="motionToGoal" 
			,guard=function()				
			end
			},
		    rfsm.transition {src="motionToGoal", tgt="Success" 
			,guard=function()				
			end
			},
		    rfsm.transition {src="goToLeavePoint", tgt="Failure" 
			},
	}
