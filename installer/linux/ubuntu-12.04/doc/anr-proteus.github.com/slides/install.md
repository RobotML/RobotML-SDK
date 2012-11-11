Install PROTEUS distribution
============================

Pierrick Koch - [GREYC](https://www.greyc.fr/) - [CNRS](http://www.cnrs.fr/)

This presentation aims at helping you to install PROTEUS tools and related
software.

[anr-proteus.fr](http://anr-proteus.fr/)

---

Introduction
============

![proteus](http://anr-proteus.github.com/slides/misc/proteus.svg "proteus")

---

Introduction (2)
================

PROTEUS distribution is a set of tools developped or selected within the
project. They are available as Debian packages for the selected project's
operating system Ubuntu Linux distribution.

Those tools are up-to-date on PROTEUS APT repository hosted by
[univ-orleans.fr](http://proteus.bourges.univ-orleans.fr).

The repository's access is secured, as some software are not free, every member
has credentials to install and update his distribution.

---

PROTEUS tools
=============

* Main tools
    - [ROS](http://www.ros.org) Robot Operating System
    - [Eclipse](http://eclipse.org)/[Papyrus](http://eclipse.org/papyrus)
    - [Protege](http://protege.stanford.edu)
* Simulation plateform
    - [CycabTK](http://cycabtk.gforge.inria.fr)
    - [MORSE](http://morse.openrobots.org)
    - [VLE](http://www.vle-project.org)
* Robotic framework
    - [Arrocam](http://effidence.com/fr/effibox/decouvrir.html)
    - [RTMaps](http://intempora.com/technology/rtmaps-software)
    - [Urbi](http://gostai.com/products/urbi)
    - [Orocos](http://orocos.org)

---

Installation: Ubuntu
====================

Within PROTEUS project, in order to harmonize software integration, we choosed
to work on Ubuntu Linux distribuition.

We started with the version 10.04, we are currently using the 11.04, and we will
switch to the latest [LTS](https://wiki.ubuntu.com/LTS), the 12.04, in June. LTS
stands for Long Term Support (5 years), meaning for the 12.04, untill 2017!

[Download Ubuntu 11.04 (Natty)](http://releases.ubuntu.com/11.04/ubuntu-11.04-desktop-i386.iso)
(image CD ISO ~700 MB)

_nb_: allow at least 10 GB for your installation (15 should be enough)

---

Installation: base tools
========================

Run `proteus.run` in:

  * [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

with the following command in a terminal (do not `sudo`):

    sh proteus.run

You will need to provided you login and password for the
[repository](https://packages.greyc.fr/proteus). And your root pass as well to
install the packages.

_nb_: in case of download or network failure, you can restart this script when
you want. It will overwrite the configuration without re-downloading what was
already done.

---

Installation tool: Run in Terminal
==================================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-runterm](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot0runterm.png "install-runterm")

Click on "`Run in Terminal`"

---

Installation tool: login
========================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-login](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot1login.png "install-login")

Login and password for the [repository](https://packages.greyc.fr/proteus)

---

Installation tool: next
=======================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-loginnext](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot2loginnext.png "install-loginnext")

Next...

---

Installation tool: choose apps
==============================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-selectapp](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot3selectapp.png "install-selectapp")

Choose your packages

---

Installation tool: install
==========================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-install](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot4install.png "install-install")

Install...

---

Installation tool: checking password
====================================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-checklogin](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot5checklogin.png "install-checklogin")

Checking your password for [packages.greyc.fr/proteus](https://packages.greyc.fr/proteus/)

---

Installation tool: root
=======================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-rootpw](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot6rootpw.png "install-rootpw")

Give your `root` password (aka. super user)

---

VirtualBox
==========

If you install PROTEUS tools through a virtual machine, remember that 3D
simulation software wont work well since they need OpenGL, which is not
supported by VirtualBox. You will need to change some default settings:

  * Activate PEA/NX
  * Activate 3D acceleration
  * Add video memory

Once Ubuntu installation is over, go to "Devices > Install the Guest Additions",
then activate the VirtualBox video driver.

In MORSE, it is recomanded to use the "WIREFRAME" mode for your simultaion. cf.
[morsebuilder.py#L401](https://github.com/laas/morse/blob/0.5.1/src/morse/builder/morsebuilder.py#L401):

    env.set_viewport(viewport_shade = 'WIREFRAME')

---

VirtualBox Settings
===================

![vb-settings](http://anr-proteus.github.com/slides/misc/screenshots/vb1.png "vb-settings")

---

VirtualBox PEA/NX
=================

![vb-peanx](http://anr-proteus.github.com/slides/misc/screenshots/vb2.png "vb-peanx")

---

VirtualBox 3D
=============

![vb-3d](http://anr-proteus.github.com/slides/misc/screenshots/vb3.png "vb-3d")

---

Demo / Tests
============

A MORSE presentaiton containing examples and video is available at:
[bit.ly/proteus2](http://bit.ly/proteus2)

[![demo-slides](http://anr-proteus.github.com/slides/misc/screenshots/demo-slides.png "demo-slides")](http://anr-proteus.github.com/slides/demo.html#slide14)

---

Installation: Eclipse
======================

version: Eclipse Modeling Indigo (3.7) & Papyrus 0.8.2

`sudo apt-get install ` [`proteus-base-eclipse`](http://apt.ubuntu.com/p/proteus-base-eclipse)

Test install
------------

Run the following command in a terminal:

    eclipse

Update
------

![eclipse-update](http://anr-proteus.github.com/slides/misc/screenshots/screen-eclipse-update.png "eclipse-update")

---

Installation: CycabTK
=====================

version: 2.0

`sudo apt-get install ` [`proteus-cycabtk`](http://apt.ubuntu.com/p/proteus-cycabtk)

---

Installation: MORSE
===================

version: 0.4

`sudo apt-get install ` [`proteus-morse`](http://apt.ubuntu.com/p/proteus-morse)

Test install
------------

Run the following command in a terminal:

    morse check

see [MORSE README](https://github.com/laas/morse#readme)

---

Installation: RTMaps
====================

version: 4.0.1

`sudo apt-get install ` [`proteus-rtmaps`](http://apt.ubuntu.com/p/proteus-rtmaps)

Test install
------------

Run the following command in a terminal:

    rtmaps /opt/rtmaps/samples/demo_lidar_linux.rtd

---

Installation: RTMaps (2)
========================

[![demo-rtmaps](http://anr-proteus.github.com/slides/misc/screenshots/demo_rtmaps.png "demo-rtmaps")](http://intempora.com/technology/rtmaps-software)

---

Installation: Urbi
==================

version: 2.7.1

`sudo apt-get install ` [`proteus-urbi`](http://apt.ubuntu.com/p/proteus-urbi)

---

Installation: VLE
=================

version: 1.0

`sudo apt-get install ` [`proteus-vle`](http://apt.ubuntu.com/p/proteus-vle)

---

Installation: Orocos
====================

version: 0.4

`sudo apt-get install ` [`proteus-orocos`](http://apt.ubuntu.com/p/proteus-orocos)

---

Installation: Effibox
=====================

version: XXX

`sudo apt-get install ` [`proteus-aroccam`](http://apt.ubuntu.com/p/proteus-aroccam)

---

Installation: Protege
=====================

version: 4.1

`sudo apt-get install ` [`proteus-base-protege`](http://apt.ubuntu.com/p/proteus-base-protege)

---

Update the distribution
=======================

First, you need to update the repositories list:

    sudo apt-get update

Then, upgrade your packages:

    sudo apt-get upgrade

---

Remove a package
================

    sudo apt-get remove vle

and autoremove to clean the former dependencies:

    sudo apt-get autoremove

---

SVN
===

### Install SVN (Ubuntu)

`sudo apt-get install ` [`subversion`](http://apt.ubuntu.com/p/subversion)

### Get the workspace from a server with your login

    svn checkout --username USERNAME URI LOCALDIR

### Update your local copy

    svn update

### Commit your changes to the server

    svn commit

[![svn](http://covers.oreilly.com/images/9780596004484/cat.gif "svn") svnbook.red-bean.com](http://svnbook.red-bean.com/en/1.7)

---

Proxy
=====

To update root's proxy settings:

    sudo gnome-network-properties

or see `sudo -i`:

    The -i (simulate initial login) option runs the shell specified in the
    passwd(5) entry of the target user as a login shell.  This means that
    login-specific resource files such as .profile or .login will be read by
    the shell.  If a command is specified, it is passed to the shell for
    execution.  Otherwise, an interactive shell is executed.  sudo attempts to
    change to that user's home directory before running the shell.  It also
    initializes the environment, leaving DISPLAY and TERM unchanged, setting
    HOME, MAIL, SHELL, USER, LOGNAME, and PATH, as well as the contents of
    /etc/environment on Linux and AIX systems.  All other environment
    variables are removed.

or with `pip --proxy`:

    sudo pip --proxy=http://myproxy:8080 -U rosinstall

---

That's all Folks!
=================

short link to this presentation: [bit.ly/proteus1](http://bit.ly/proteus1)

![proteus-install](http://bit.ly/proteus1.qrcode "proteus-install")

1 page doc: [bit.ly/proteus1md](http://bit.ly/proteus1md)

sources on GitHub: [bit.ly/proteus-src](http://bit.ly/proteus-src)

[![printfriendly](http://cdn.printfriendly.com/pf-button-both.gif "pdf")](http://www.printfriendly.com/print/v2?url=http%3A%2F%2Fanr-proteus.github.com%2Fslides%2Finstall.plain.html)
