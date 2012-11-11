Démonstration: MORSE & ROS
==========================

Pierrick Koch - [GREYC](https://www.greyc.fr/) - [CNRS](http://www.cnrs.fr/)

[anr-proteus.fr](http://anr-proteus.fr/)

Objectif: check your Proteus distribution installation.

---

ROS
===

Robot Operating System (ROS) comprend deux parties :

- Un [middleware](http://fr.wikipedia.org/wiki/Middleware) de communication, 
ainsi que les API associées (C++, Python, Java),
- Une suite de composant logiciels robotique (abstraction matérielle, pilotes, 
bibliothèque de programmation, gestion de paquets).

[roscore](http://www.ros.org/wiki/roscore): lancement du noeud 
[maître](http://www.ros.org/wiki/Master)

    $ roscore

_TIP_: pour stopper `roscore`: pressez Ctrl+C dans la console

Commandes de base:

    $ roscd : se déplacer dans le package
    Usage: roscd [package] 
    $ roslaunch : executer un fichier de lancement (.launch)
    Usage: roslaunch [options] [package] <filename> [arg_name:=value...]

cf. [Tutorials](http://ros.org/wiki/ROS/Tutorials)

---

rostopic
========

    $ rostopic 
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

Publication d'un message sur un topic:

    $ rostopic pub /test std_msgs/String "Bonjour Proteus"
    $ rostopic echo /test 

[![rostopic](http://anr-proteus.github.com/slides/misc/screenshot-rostopic.png "rostopic")](http://www.ros.org/wiki/rostopic)

---

MORSE
=====

Développé au LAAS/CNRS à Toulouse, MORSE est une plateforme de simulation 
robotique générique basée sur Blender. Blender est une plateforme libre de 
modélisation 3D. Elle intègre différentes méthodes de rendu, d'animation, et un 
moteur de jeu, utilisées par MORSE pour la simulation (notamment le moteur 
physique Bullet). MORSE permet de créer une simulation robotique en utilisant 
l'interface utilisateur de Blender.

La version 2.5 de Blender a introduit une nouvelle interface de programmation 
permettant d'unifier les méthodes d'accès et de modification des données.

[![blender-data-api](http://anr-proteus.github.com/slides/misc/blender-data-api.jpg "blender-data-api")](http://www.blender.org/development/release-logs/blender-256-beta/data-access)

[![blender-roadmap](http://anr-proteus.github.com/slides/misc/blender-roadmap.jpg "blender-roadmap")](http://download.blender.org/release/)

---

MORSE
=====

[![morse](http://anr-proteus.github.com/slides/misc/screenshot-morse.png "morse")](http://morse.openrobots.org)

---

MORSE GLSL
==========

MORSE est [prévu](http://www.openrobots.org/morse/doc/latest/user/installation.html#hardware) 
pour fonctionner avec une carte graphique compatible [OpenGL Shading Language](http://en.wikipedia.org/wiki/GLSL)

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

- Coordonnées: [main droite](http://en.wikibooks.org/wiki/Blender_3D:_Noob_to_Pro/Understanding_Coordinates)

![right](http://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Rechte-hand-regel.jpg/200px-Rechte-hand-regel.jpg "right")

- Unités: système métrique, angle: degré dans l'UI, radian dans la simulation
- ROS: [ROS Standard Units of Measure and Coordinate Conventions](http://www.ros.org/reps/rep-0103.html)

![metric](http://anr-proteus.github.com/slides/misc/screenshot-morse-metric.png "metric")

---

MORSE & ROS
===========

- Convention de [nommage des topics](http://www.openrobots.org/morse/doc/latest/user/middlewares/ros.html#generation-of-ros-node-and-topics)

  `/Robot/Composant` alphanumérique CamelCase

### ie.

    $ rostopic list -v

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

Une fois installé, MORSE se lance via la commande `morse {check,edit,run} [scene]`, 
il est possible de lui passer différents arguments:

- fichier .blend (scène de simulation)
- fichier .py (script d'assemblage de robots)

Par exemple, les commandes:

    $ morse edit monScriptDAssemblage.py

    $ morse edit maSceneSauvegarde.blend

... effectuent respectivement:

1. edite un script d'assemblage dans l'interface Blender.
1. edite une scène sauvegardée dans l'interface Blender.

---

MORSE: boucle de simulation
===========================

[![morse-main-loop](http://anr-proteus.github.com/slides/misc/morse_main_loop.png "morse-main-loop")](http://www.openrobots.org/morse/doc/latest/dev/dev_overview.html#morse-execution-loop)

---

MORSE: scene builder API
========================

[![morse-builder](http://anr-proteus.github.com/slides/misc/morsebuilder_uml.png "morse-builder")](http://www.openrobots.org/morse/doc/latest/dev/builder.html)

cf. [openrobots.org/morse/doc/latest/dev/builder.html](http://www.openrobots.org/morse/doc/latest/dev/builder.html)

---

Démo: intro
===========

# robot constitué d'un controleur (v, ω)

    !python
    from morse.builder import *

    # Ajout du robot
    simplebot = Robot('atrv')

    # Ajout du contrôleur
    motion = Actuator('v_omega')
    motion.translate(z=0.3)
    # Connexion du contrôleur au robot
    simplebot.append(motion)

    # Configure le contrôleur avec le middleware ROS
    motion.configure_mw('ros')

    # Choix de l'environement
    env = Environment('indoors-1/indoor-1')
    env.aim_camera([1.0470, 0, 0.7854])


([code](https://github.com/anr-proteus/proteus/blob/master/proteus_demo/data/wifibot.py))

---

Démo: intro (suite)
===================

# commandes à exécuter

## lancer un noeud ros maître

    $ roscore

## lancer morse avec le script d'assemblage (dans un autre Terminal)

    $ morse edit /usr/local/share/morse/examples/scenarii/ros_example.py

### ⌨ la touche "`P`" dans la vue 3D lance la simulation

### ⌨ la touche "`CTRL`" + souris et les touches "`Z,Q,S,D`" bougent la camera

## publier un message (commande de mouvement) sur le topic du contrôleur (dans un autre Terminal)

    $ rostopic pub -1 /ATRV/Motion_Controller geometry_msgs/Twist [1,0,0] [0,0,1]

---

Démo: intro (vidéo)
===================

<iframe src="http://player.vimeo.com/video/22116926?portrait=0" width="800" height="500" frameborder="0" allowfullscreen></iframe>


([vidéo](http://vimeo.com/22116926))

---

Démo: avancé
============

# évitement d'obstacles w/ laser

    $ mkdir -p ~/work/ros-addons
    $ rosinstall ~/work/ros-addons /opt/ros/electric/ \
        http://anr-proteus.github.com/proteus.rosinstall 
    $ source ~/work/ros-addons/setup.bash
    $ roscd proteus_demo && git pull && cd data
    $ morse run wifibot.py 

## lancer un noeud ros maître (dans un autre Terminal)

    $ roscore

## lancer le noeud de contrôle du robot (dans un autre Terminal)

    $ source ~/work/ros-addons/setup.bash
    $ roslaunch proteus_demo AvoidObstacleLaser.launch

_TIP_: si la commande rosinstall n'est pas reconnue:

    $ sudo pip install -U rosinstall

_WARN_: dû à une régression, il est necessaire de patcher ROS via les commandes

    wget http://anr-proteus.github.com/slides/rospy3k.patch 
    sudo patch -Np0 < rospy3k.patch 

---

Démo: avancé (vidéo)
====================

<iframe src="http://player.vimeo.com/video/24550587?portrait=0" width="800" height="500" frameborder="0" allowfullscreen></iframe>


([vidéo](http://vimeo.com/24550587))

---

Démo: avancé (code)
===================

    !python
    # fonction executé à chaque nouveau scan laser
    def handle_sick(msg):
        mid = len(msg.ranges) // 2
        cmd = Twist()
        # stop si un objet est détecté à moins de 2m dans un angle de 30 degrés
        halt=False
        for distance_to_object in msg.ranges[mid-15:mid+15]:
            if distance_to_object < 2:
                halt=True
                break
        if halt:
            # tourne du coté où il y a le plus d'espace scanné
            if sum(msg.ranges[:mid]) > sum(msg.ranges[mid:]):
                cmd.angular.z = -1
            else:
                cmd.angular.z = 1
        else:
            cmd.linear.x = 1
        # publie la commande au contrôleur (msg Twist)
        topic.publish(cmd)

    if __name__ == '__main__':
        rospy.init_node('AvoidObstacleLaser')
        topic=rospy.Publisher('/ATRV/Motion_Controller', Twist)
        rospy.Subscriber('/ATRV/Sick', LaserScan, handle_sick)
        rospy.spin()
    
    # http://www.ros.org/doc/api/sensor_msgs/html/msg/LaserScan.html
    # http://www.ros.org/doc/api/geometry_msgs/html/msg/Twist.html


([code](https://github.com/anr-proteus/proteus/blob/master/proteus_demo/nodes/AvoidObstacleLaser.py))

---

Démo: Orocos
============

Le code de cet exemple implémenté pour Orocos est [disponible ici](https://github.com/anr-proteus/proteus/tree/master/proteus_orocos_obstaclelaser)

    $ roscd proteus_demo/data
    $ morse run wifibot.py 

    $ rosmake proteus_orocos_obstaclelaser 
    $ roslaunch proteus_orocos_obstaclelaser AvoidObstacleLaser.launch 


[![morse-orocos](http://anr-proteus.github.com/slides/misc/screenshot-morse-orocos.png "morse-orocos")](https://github.com/anr-proteus/proteus/tree/master/proteus_orocos_obstaclelaser)

---

RViz (vidéo)
============

<iframe src="http://player.vimeo.com/video/23244699?portrait=0" width="800" height="375" frameborder="0" allowfullscreen></iframe>

    $ rosrun rviz rviz

## lancer rviz avec un fichier de configuration

    $ roscd proteus_demo/data
    $ rosrun rviz rviz -d rviz.vcg

([vidéo](http://vimeo.com/23244699))

---

Outdoor (vidéo)
===============

<iframe src="http://player.vimeo.com/video/26054198?portrait=0" width="800" height="350" frameborder="0" allowfullscreen></iframe>

    $ roscd proteus_demo/data
    $ morse run wifibot.py

([vidéo](http://vimeo.com/26054198))

---

Exploration (Bosch demo w/ Stage)
=================================

    $ sudo apt-get install ros-electric-bosch-common
    $ roslaunch explore_stage explore.launch

    $ roscd explore_stage
    $ rosrun rviz rviz -d explore.vcg 

[![exploration](http://anr-proteus.github.com/slides/misc/screenshot-explor.png "exploration")](http://www.ros.org/wiki/explore_stage)

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

MORSE créer des fichiers de sauvegarde dans le dossier courant,

    rm scene.*.blend

permet de supprimer ces fichiers.

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

présentation en ligne: [bit.ly/proteus2](http://bit.ly/proteus2)

![proteus-morse-demo](http://bit.ly/proteus2.qrcode "proteus-morse-demo")

source de cette présentation: [bit.ly/proteus2md](http://bit.ly/proteus2md)

sources sur GitHub: [bit.ly/proteus-src](http://bit.ly/proteus-src)

_made with_ [landslide](https://github.com/adamzap/landslide)

[![printfriendly](http://cdn.printfriendly.com/pf-button-both.gif "pdf")](http://www.printfriendly.com/print/v2?url=http%3A%2F%2Fanr-proteus.github.com%2Fslides%2Fdemo.plain.html)

