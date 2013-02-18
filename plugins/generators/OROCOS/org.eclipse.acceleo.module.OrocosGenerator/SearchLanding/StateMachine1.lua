-----create variables-----
local variable_image0= rtt.Variable("/sensor_msgs/Image")
local variable_point1= rtt.Variable("/geometry_msgs/Point")
local variable_string2= rtt.Variable("/std_msgs/String")

-----FSM states-----------

	return rfsm.csta {
		
			State2 = rfsm.sista {
	  		},
			State3 = rfsm.sista {
	  		},
			NotRNotF = rfsm.sista {
	  		},
		    rfsm.transition {src="NotRNotF", tgt="State1" 
			,guard=function()				
					  
if(((x-route[curent_wp].x)*(x-route[curent_wp].x) + (y-route[curent_wp].y)*(y-route[curent_wp].y) + (z-route[curent_wp].z)*(z-route[curent_wp].z)) < 0.5) then return true
else return false
end
			end
			},
		    rfsm.transition {src="State1", tgt="NotRNotF" 
			,guard=function()				
					  return true
			end
			,effect=function()
					  wp=wp+1;
			end
			},
		    rfsm.transition {src="NotRNotF", tgt="NotRNotF" 
			,guard=function()				
					  if(wp < route.size()) then return true
else return false
end
			end
			,effect=function()
					  outport.write(route[wp])
			end
			},
		    rfsm.transition {src="NotRNotF", tgt="State3" 
			,guard=function()				
					  if(wp < route.size()) then return true
else return false
end
			end
			,effect=function()
					              geometry_msgs::Point* pt = new geometry_msgs::Point()
            pt->x = argminx; pt->y = argminy; pt->z = 10.0
            route.push_back(*pt)
            pt->x = argminx pt->y = argminy; pt->z = 0.0
            route.push_back(*pt)
            delete pt
            outport.write(route[wp])

			end
			},
		    rfsm.transition {src="State3", tgt="State2" 
			,guard=function()				
					  
if(((x-route[curent_wp].x)*(x-route[curent_wp].x) + (y-route[curent_wp].y)*(y-route[curent_wp].y) + (z-route[curent_wp].z)*(z-route[curent_wp].z)) < 0.5) then return true
else return false
end
			end
			},
		    rfsm.transition {src="State2", tgt="State3" 
			,guard=function()				
					  return true
			end
			,effect=function()
					  wp=wp+1;
			end
			},
	}
