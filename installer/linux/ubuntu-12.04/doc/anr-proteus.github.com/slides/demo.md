Demonstration: MORSE & ROS
==========================

Pierrick Koch - [GREYC](https://www.greyc.fr/) - [CNRS](http://www.cnrs.fr/)

[anr-proteus.fr](http://anr-proteus.fr/)

Objectif: First step with ROS and MORSE.

---

ROS
===

Robot Operating System (ROS) can be seen as 2 main parts:

- A communication [middleware](http://en.wikipedia.org/wiki/Middleware),
with related APIs (C++, Python, Java),
- A set of Robotic software (hardware abstraction, drivers, libs).

[roscore](http://ros.org/wiki/roscore): run a
[master](http://ros.org/wiki/Master) [node](http://ros.org/wiki/Nodes)

    roscore

_TIP_: to stop `roscore`: press Ctrl+C in the terminal

Basic commands:

[roscd](http://ros.org/wiki/roscd): change directory within ROS environment

    Usage: roscd [package]

[roslaunch](http://ros.org/wiki/roslaunch):
launching ROS nodes via `.launch` files

    Usage: roslaunch [options] [package] <filename> [arg_name:=value...]

cf. [Tutorials](http://ros.org/wiki/ROS/Tutorials)

---

rostopic
========

    rostopic
    rostopic is a command-line tool for printing information about ROS Topics.

    Commands:
      rostopic bw    display bandwidth used by topic
      rostopic echo  print messages to screen
      rostopic find  find topics by type
      rostopic hz    display publishing rate of topic
      rostopic info  print information about active topic
      rostopic list  list active topics
      rostopic pub   publish data to topic
      rostopic type  print topic type

    Type rostopic <command> -h for more detailed usage, e.g. 'rostopic echo -h'

---

rostopic: exemple
=================

Publish & print a message on ROS bus:

    rostopic pub /test std_msgs/String "Bonjour Proteus"
    rostopic echo /test

[![rostopic](http://anr-proteus.github.com/slides/misc/screenshot-rostopic.png "rostopic")](http://ros.org/wiki/rostopic)

---

MORSE
=====

Developped at LAAS/CNRS in Toulouse (France), MORSE is a generic robotic
simulation platform based on Blender. Blender is a free and open source 3D
modelisation platform. Which integrates differents methods for 3D rendering,
animating, and a game engine used by MORSE for the simulation, as well as the
physic engine Bullet. MORSE allow to build a robotic simulation by using Blender
GUI / API.

Blender 2.5 introduced a new API allowing to interact with all scene-data
through the Blender Python API, aka. `bpy`.

[![blender-data-api](http://anr-proteus.github.com/slides/misc/blender-data-api.jpg "blender-data-api")](http://www.blender.org/development/release-logs/blender-256-beta/data-access)

[![blender-roadmap](http://anr-proteus.github.com/slides/misc/blender-roadmap.jpg "blender-roadmap")](http://download.blender.org/release/)

---

MORSE
=====

[![morse](http://anr-proteus.github.com/slides/misc/screenshot-morse.png "morse")](http://morse.openrobots.org)

---

MORSE GLSL
==========

MORSE is [meant](http://www.openrobots.org/morse/doc/latest/user/installation.html#hardware)
to run with a graphic card compatible [OpenGL Shading Language](http://en.wikipedia.org/wiki/GLSL)

# ATI/AMD Radeon [![AMD](http://support.amd.com/Style%20Library/Images/AMD/AMD_logo.png "AMD")](http://support.amd.com/us/gpudownload/linux/Pages/radeon_linux.aspx)

### 9x00, Xx00, X1x00, HD2x00, HD3x00 & +

`sudo apt-get install ` [`xserver-xorg-video-radeon`](http://apt.ubuntu.com/p/xserver-xorg-video-radeon)


# nVidia [![nvidia](http://www.nvidia.com/content/includes/images/redesign08/nvidia_logo.png "nvidia")](http://www.nvidia.com/object/unix.html)

### Geforce FX, 6x00, 7x00, 8x00, 9x00, GTX 2x0 & +

`sudo apt-get install ` [`nvidia-current`](http://apt.ubuntu.com/p/nvidia-current)


cf. [Blender System Requirements](http://www.blender.org/features-gallery/requirements/)
[Blender 2.48 Realtime GLSL Materials](http://www.blender.org/development/release-logs/blender-248/realtime-glsl-materials/)

---

MORSE config
============

- Coordinates: [main droite](http://en.wikibooks.org/wiki/Blender_3D:_Noob_to_Pro/Understanding_Coordinates)

![right](http://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Rechte-hand-regel.jpg/200px-Rechte-hand-regel.jpg "right")

- Units: metric, angle: degree in UI, radian in simulation
- ROS: [ROS Standard Units of Measure and Coordinate Conventions](http://ros.org/reps/rep-0103.html)

![metric](http://anr-proteus.github.com/slides/misc/screenshot-morse-metric.png "metric")

---

MORSE & ROS
===========

- Naming convention of [topics](http://www.openrobots.org/morse/doc/latest/user/middlewares/ros.html#generation-of-ros-node-and-topics)

  `/Robot/Composant` alphanumeric CamelCase

### ie.

    rostopic list -v

    Published topics:
     * /ATRV/CameraMain [sensor_msgs/Image] 1 publisher
     * /rosout [rosgraph_msgs/Log] 1 publisher
     * /ATRV/Pose_sensor [nav_msgs/Odometry] 1 publisher
     * /rosout_agg [rosgraph_msgs/Log] 1 publisher
     * /ATRV/Odometry [geometry_msgs/Twist] 1 publisher
     * /ATRV/Sick [sensor_msgs/LaserScan] 1 publisher

    Subscribed topics:
     * /rosout [rosgraph_msgs/Log] 1 subscriber
     * /ATRV/Motion_Controller [geometry_msgs/Twist] 1 subscriber

---

MORSE CLI
=========

Once installed, MORSE is launch by the command `morse {check,edit,run} [scene]`,
it accept differents parameters:

- .blend file (simulation scene)
- .py file (scene builder script)

ie:

    morse edit my_builder_script.py

    morse edit my_saved_scene.blend

... respectively result in:

1. edit a scene build through a script in Blender GUI.
2. edit a scene saved in a .blend file in Blender GUI.

---

MORSE: simulation loop
======================

[![morse-main-loop](http://anr-proteus.github.com/slides/misc/morse_main_loop.png "morse-main-loop")](http://www.openrobots.org/morse/doc/latest/dev/dev_overview.html#morse-execution-loop)

---

MORSE: scene builder API
========================

[![morse-builder](http://anr-proteus.github.com/slides/misc/morsebuilder_uml.png "morse-builder")](http://www.openrobots.org/morse/doc/latest/dev/builder.html)

cf. [openrobots.org/morse/doc/latest/dev/builder.html](http://www.openrobots.org/morse/doc/latest/dev/builder.html)

---

Demo: intro
===========

# robot made of one controler (v, ω)

    !python
    from morse.builder import *

    # Add the robot
    simplebot = Robot('atrv')

    # Add a motion controler
    motion = Actuator('v_omega')
    motion.translate(z=0.3)
    # Connect the controler to the robot
    simplebot.append(motion)

    # Configure the controler with the ROS middleware
    motion.configure_mw('ros')

    # Setup the environment
    env = Environment('indoors-1/indoor-1')
    env.aim_camera([1.0470, 0, 0.7854])


([code](https://github.com/anr-proteus/proteus/blob/master/proteus_demo/data/wifibot.py))

---

Demo: intro (2)
===============

# commands to run

## start a ROS master node

    roscore

## start MORSE with a builder script (in another Terminal)

    morse edit /usr/local/share/morse/examples/scenarii/ros_example.py

### ⌨ Press "`P`" in the 3D view to start the simulation (Game Engine)

### ⌨ Use "`CTRL`" + mouse, and "`Z, Q/A, S, D/W`" to move the camera

## publish a message on the controler topic (in another Terminal)

    rostopic pub -1 /ATRV/Motion_Controller geometry_msgs/Twist [1,0,0] [0,0,1]

---

Demo: intro (video)
===================

<iframe src="http://player.vimeo.com/video/22116926?portrait=0" width="800" height="500" frameborder="0" allowfullscreen></iframe>


([video](http://vimeo.com/22116926))

---

ROS Python3 support
===================

If you installed ROS through the PROTEUS Debian repository, aka.
[`proteus-base`](http://apt.ubuntu.com/p/proteus-base), you won't need this
patch, you can ignore this slide and jump to the next one. If not you will need
to patch ROS due to a regression in their Python3 compatibility, as:

    wget http://anr-proteus.github.com/slides/rospy3k.patch
    sudo patch -Np0 < rospy3k.patch

_TIP_: if ROS is not in `/opt/ros`, patch as:

    roscd common_msgs
    wget http://anr-proteus.github.com/slides/rospy3k.patch -O - | patch -Np5

---

Demo: advanced
==============

# obstacles avoidance w/ laser

    mkdir -p ~/work/ros-addons
    rosinstall ~/work/ros-addons /opt/ros/electric/ \
        http://anr-proteus.github.com/proteus.rosinstall
    source ~/work/ros-addons/setup.bash
    roscd proteus_demo && git pull && cd data
    morse run wifibot.py

## run the master node (in another Terminal)

    roscore

## launch our node to control the robot (in another Terminal)

    source ~/work/ros-addons/setup.bash
    roslaunch proteus_demo AvoidObstacleLaser.launch

_TIP_: if `rosinstall` is not recognized, install it as:

    sudo pip install -U rosinstall

---

Demo: advanced (video)
======================

<iframe src="http://player.vimeo.com/video/24550587?portrait=0" width="800" height="500" frameborder="0" allowfullscreen></iframe>


([video](http://vimeo.com/24550587))

---

Demo: advanced (code)
=====================

    !python
    # callback for each laser scan
    def handle_sick(msg):
        mid = len(msg.ranges) // 2
        cmd = Twist()
        # stop if an object is less than 2m in a 30deg angle
        halt=False
        for distance_to_object in msg.ranges[mid-15:mid+15]:
            if distance_to_object < 2:
                halt=True
                break
        if halt:
            # rotate on the wider scanned side
            if sum(msg.ranges[:mid]) > sum(msg.ranges[mid:]):
                cmd.angular.z = -1
            else:
                cmd.angular.z = 1
        else:
            cmd.linear.x = 1
        # publie the command to the controler (Twist msg)
        topic.publish(cmd)

    if __name__ == '__main__':
        rospy.init_node('wander')
        topic=rospy.Publisher('/ATRV/Motion_Controller', Twist)
        rospy.Subscriber('/ATRV/Sick', LaserScan, handle_sick)
        rospy.spin()

    # http://ros.org/doc/api/sensor_msgs/html/msg/LaserScan.html
    # http://ros.org/doc/api/geometry_msgs/html/msg/Twist.html


([code](https://github.com/anr-proteus/proteus/blob/master/proteus_demo/nodes/AvoidObstacleLaser.py))

---

Demo: Orocos
============

The example's code is available on [GitHub](https://github.com/anr-proteus/proteus/tree/master/proteus_orocos_obstaclelaser)

    roscd proteus_demo/data
    morse run wifibot.py

    rosmake proteus_orocos_obstaclelaser
    roslaunch proteus_orocos_obstaclelaser AvoidObstacleLaser.launch


[![morse-orocos](http://anr-proteus.github.com/slides/misc/screenshot-morse-orocos.png "morse-orocos")](https://github.com/anr-proteus/proteus/tree/master/proteus_orocos_obstaclelaser)

---

RViz (video)
============

<iframe src="http://player.vimeo.com/video/23244699?portrait=0" width="800" height="375" frameborder="0" allowfullscreen></iframe>

    rosrun rviz rviz

## launch rviz with a configuration file

    roscd proteus_demo/data
    rosrun rviz rviz -d rviz.vcg

([video](http://vimeo.com/23244699))

---

Outdoor (video)
===============

<iframe src="http://player.vimeo.com/video/26054198?portrait=0" width="800" height="350" frameborder="0" allowfullscreen></iframe>

    roscd proteus_demo/data
    morse run wifibot.py

([video](http://vimeo.com/26054198))

---

Exploration (Bosch demo w/ Stage)
=================================

    sudo apt-get install ros-electric-bosch-common
    roslaunch explore_stage explore.launch

    roscd explore_stage
    rosrun rviz rviz -d explore.vcg

[![exploration](http://anr-proteus.github.com/slides/misc/screenshot-explor.png "exploration")](http://ros.org/wiki/explore_stage)

---

Exploration (Bosch demo w/ MORSE)
=================================

<iframe src="http://www.youtube.com/embed/videoseries?list=PL289431A5B18BD997&amp;hd=1&amp;rel=0" width="800" height="500" frameborder="0" allowfullscreen></iframe>

---

RTMaps
======

[![rtmaps](http://anr-proteus.github.com/slides/misc/screenshot-morse-rtmaps.png "rtmaps")](http://intempora.com)

---

TIPS
====

MORSE create cache files in the current directory,

    rm scene.*.blend

allow you to delete those files.

# Resources

Blender Cookie: [cgcookie.com/blender](http://cgcookie.com/blender/)

Blend Swap: [blendswap.com](http://www.blendswap.com/)
(ie. [Rover model](http://www.blendswap.com/3D-models/vehicles/rover/) )

Blender Wiki: [wiki.blender.org](http://wiki.blender.org/)

---

Build a robot
=============

<iframe src="http://www.youtube.com/embed/videoseries?list=PLDC1FC34E5AC69429&amp;hd=1&amp;rel=0" width="800" height="500" frameborder="0" allowfullscreen></iframe>

---

That's all Folks!
=================

short link to this presentation: [bit.ly/proteus2](http://bit.ly/proteus2)

![proteus-morse-demo](http://bit.ly/proteus2.qrcode "proteus-morse-demo")

1 page doc: [bit.ly/proteus2md](http://bit.ly/proteus2md)

sources on GitHub: [bit.ly/proteus-src](http://bit.ly/proteus-src)

_made with_ [landslide](https://github.com/adamzap/landslide)

[![printfriendly](http://cdn.printfriendly.com/pf-button-both.gif "pdf")](http://www.printfriendly.com/print/v2?url=http%3A%2F%2Fanr-proteus.github.com%2Fslides%2Fdemo.plain.html)

