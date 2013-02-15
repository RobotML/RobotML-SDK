
#if first time executing ros
echo "source /opt/ros/fuerte/setup.bash" >> ~/.bashrc
close terminal

#execute roscore
open a new terminal
roscore

#execute cycabtk
open a new terminal
ls /opt/UrbanChallenge/scripts/Scenario/ #to see available scenario
mgengine
mgengine> require "Scenario/UrbanChallenge" #adapt the scenario name

#execute effibox
open a terminal
cd applicationPath/build/
effibox -a libApplicationName

--------------------------------------------
--------GENERATOR DEBUG INFORMATIONS--------
--------------------------------------------

----DeploymentPlan
List of components instances in the model :

Name: aroccam Allocation:   
Name: RoboticSimulator12 Allocation:   
Name: mainInstance Allocation:   
Name: mainInstance.Perception1 Allocation: allocate to aroccam RealName:Perception1, Type: Perception, Stereotype:Software 
Name: mainInstance.Pilote2 Allocation: allocate to aroccam RealName:Pilote2, Type: Pilote, Stereotype:Software 
Name: mainInstance.hokuyo3 Allocation:  RealName:hokuyo3, Type: hokuyo, Stereotype:LidarSystem 
Name: mainInstance.ChassisRobot4 Allocation:  RealName:ChassisRobot4, Type: ChassisRobot, Stereotype:RoboticSystem 

