Installation de la distribution PROTEUS
=======================================

Pierrick Koch - [GREYC](https://www.greyc.fr/) - [CNRS](http://www.cnrs.fr/)

[anr-proteus.fr](http://anr-proteus.fr/)

---

Introduction
============

![proteus](http://anr-proteus.github.com/slides/misc/proteus.svg "proteus")

---

Introduction (suite)
====================

La distribution PROTEUS est un ensemble d'outils (sélectionnés ou développés 
par les partenaires).

PROTEUS est disponible sous forme de paquetages Debian pour la distribution 
GNU/Linux Ubuntu.

Un soin tout particulier à été apporté afin que ses outils puissent fonctionner 
dans le même environnement sans incompatibilité majeure et que leur installation 
soit la plus simple possible pour tout le monde. Ces outils seront mis à jour au 
fur et à mesure du déroulement du projet.

L'accès au dépôts de paquetages s'effectue de manière sécurisé (certains 
logiciels n'étant pas des logiciels libres). Chaque partenaire dispose pour 
cela d'un login et d'un mdp (à demander à Pierrick).

---

Paquetages Debian
=================

Paquets Debian = un ensemble de données (sources, binaires, ...) qu'il est 
possible d'installer ou de désinstaller facilement. Un paquet Debian contient 
également une liste de dépendances avec d'autres paquets.

Les paquets sont disponibles sur des dépôts de paquets.

---

Principaux outils de la distribution
====================================

Les outils de base de la distribution sont :

- ROS (middleware de communication) - Version Electric
- Eclipse/Papyrus - Version 3.7

Liste des simulateurs supportés :

- CycabTK
- MORSE
- VLE

Liste des outils supportés :

- Arrocam
- RTMaps
- Urbi
- Orocos
- Protege

---

Installation: Ubuntu
====================

Dans le cadre de ce projet, afin de faciliter l'intégration des développements logiciels entre les équipes du projet, nous avons choisi de travailler sous le système d'exploitation Gnu-Linux Ubuntu.

La version retenue est une [LTS](https://wiki.ubuntu.com/LTS) (pour Long Term 
Support). Ce qui signifie que cette version 10.04, sortie en avril 2010, sera 
supportée (lire mise à jour) jusqu'en 2013.

La prochaine LTS, la 12.04, sortira fin avril 2012 et sera supportée jusqu'en 
2015.

_EDIT_: mise à jour suite au workshop: passage à la 11.04

[Télécharger Ubuntu 11.04 (natty)](http://releases.ubuntu.com/11.04/ubuntu-11.04-desktop-i386.iso) 
(image CD ISO ~700 Mo)

---

Installation des outils de base
===============================

Exécuter l'application `proteus.run` se trouvant dans:

  * [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

en tapant la commande suivante dans le terminal (ne pas faire de sudo): 

    sh proteus.run

Dès le début de l'exécution du script, indiquez votre login et mot de passe 
relatif au serveur `packages.greyc.fr/proteus`, ainsi que votre mot de passe 
super-utilisateur afin de :

- pouvoir installer les outils indispensables à l'installation de ROS et PROTEUS 
si ceux-ci sont absents,
- ajouter les dépôts contenant les outils développés dans le cadre du projet 
PROTEUS comme sources de
logiciels de votre système (avec les clés d'authentification associées à ses 
dépôts),
- conclure par une mise à jour de la liste des fichiers disponibles dans les 
sources de logiciel de votre système d'exploitation.

_nb_: en cas d'échec (problème réseaux, mauvais mot de passe) ce script peut-être 
réexécuter indéfiniment. Il écrasera l'ancienne configuration, sans 
re-télécharger les paquets fonctionnels.

---

Installation des outils de base
===============================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-runterm](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot0runterm.png "install-runterm")

Cliquez sur "`Run in Terminal`"

---

Installation des outils de base
===============================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-login](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot1login.png "install-login")

Entrez votre identifiant et mot de passe pour [packages.greyc.fr/proteus](https://packages.greyc.fr/proteus/)

---

Installation des outils de base
===============================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-loginnext](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot2loginnext.png "install-loginnext")

Next...

---

Installation des outils de base
===============================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-selectapp](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot3selectapp.png "install-selectapp")

Selectionnez vos applications

---

Installation des outils de base
===============================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-install](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot4install.png "install-install")

Install...

---

Installation des outils de base
===============================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-checklogin](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot5checklogin.png "install-checklogin")

L'installeur vérifie votre indentifiant sur [packages.greyc.fr/proteus](https://packages.greyc.fr/proteus/)

---

Installation des outils de base
===============================

download: [svn-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run](https://dassault3.ddo.net/svn/proteus-wp2/trunk/S2.3.4-PROTEUS-Distribution/install/proteus.run)

![install-rootpw](http://anr-proteus.github.com/slides/misc/screenshots/Screenshot6rootpw.png "install-rootpw")

Entrez votre mot de passe `root` (aka. administrateur machine)

---

VirtualBox
==========

Si vous installé les outils sur une machine virtuelle, cela rendra difficile 
toute simulation 3D. Pour un apreçu, il faut cependant modifier quelques
paramètres par défaut:

  * Activer PEA/NX
  * Activer l'acceleration 3D
  * Ajouter de la mémoire vidéo

Une fois Ubuntu installé, "Devices > Install the Guest Additions", puis activer le driver vidéo VirtualBox.

Ensuite, dans MORSE, il est conseillé d'utiliser le mode "WIREFRAME" pour vos
simulations. cf. 
[morsebuilder.py#L401](https://github.com/laas/morse/blob/0.5.1/src/morse/builder/morsebuilder.py#L401):

    env.set_viewport(viewport_shade = 'WIREFRAME')

---

VirtualBox Préferences
======================

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

Une présentation de MORSE contenant exemples et vidéos est disponible ici:
[bit.ly/proteus2](http://bit.ly/proteus2)

[![demo-slides](http://anr-proteus.github.com/slides/misc/screenshots/demo-slides.png "demo-slides")](http://anr-proteus.github.com/slides/demo.html#slide14)

---

Paquets logiciels
=================

L'étape précédente vous a permis d'installer le noyaux de notre projet, les 
outils minimum et commun à ses variantes. Ainsi que les paquets logiciel relatif
a chaque challenge.

Les logiciels suivant peuvent être installé au choix, selon vos besoins.

---

Installation: Eclipse
======================

version: Eclipse Modeling Indigo (3.7) + Papyrus

`sudo apt-get install ` [`proteus-base-eclipse`](http://apt.ubuntu.com/p/proteus-base-eclipse) 

Test install
------------

Run the following command in a terminal:

    eclipse

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

Mise à jour de la distribution
==============================

Mise à jour de la liste des paquets :

  $ sudo apt-get update

Mise à jour des paquets installés :  

  $ sudo apt-get upgrade


Attention : pour l'instant la mise à jour des outils est partielle. Certains 
outils n'étant pas correctement packagés au format Debian.

---

Enlever un package Ubuntu
=========================

    $ sudo apt-get remove vle

Pour effacer les packages qui ne servent plus :

    $ sudo apt-get autoremove

---

SVN
===

### Installer SVN (Ubuntu)

`sudo apt-get install ` [`subversion`](http://apt.ubuntu.com/p/subversion)

### Récuperer l'espace de travail depuis un serveur via votre identifiant

    $ svn checkout --username USERNAME URI LOCALDIR

### Mettre à jour sa copie local

    $ svn update

### Envoyer ses modification au serveur

    $ svn commit

[![svn](http://covers.oreilly.com/images/9780596004484/cat.gif "svn") svnbook.red-bean.com](http://svnbook.red-bean.com/nightly/fr/svn-book.html)

---

Difficultés de la version courante
==================================

- problèmes liés à des librairies différentes entre plusieurs outils 
(exemple version différente de la librairie libboost entre ROS, CycabTK et 
ARROCAM). Prévoir une discussion pour choisir une version commune.
- Installation non-uniforme des outillages liée à des problèmes de paquetages 
mal fait ou à des paquets très complexes ou nécessitant des patchs ou des 
librairies spécifiques (par exemple MORSE qui nécessite des patchs Python 3 
pour le faire fonctionner avec ROS).
- Certains outils ne sont pas désinstallables automatiquement.
- OpenGL trop lent sous VirtualBox

---

Roadmap de la distribution des outils
=====================================

- Passage à ROS Electric (avec le support notamment de Python 3, permet de 
simplifier l'installation de MORSE)
- Empaquetage complet des outils utilisés par le projet sous forme de 
paquetages Ubuntu
- Test/empaquetage des outils développés par les partenaires au fur et à 
mesure de leur sortie.
- Changement de LTS (pas avant 2012) ?
- Distribution de PROTEUS sous forme d'une image VirtualBox (i.e tous les objets 
sont installés et configurés). Difficulté : taille de l'image à distribuer, 
lenteur de MORSE en mode émulé (peut-être en voie de résolution avec les 
dernières versions de Blender). Solution: distribution lors des réunions.

---

Documentation disponible
========================

- Comment installer la dernière version de la distribution
- Comment faire son serveur de paquets Ubuntu (avec authentification)
- Comment créer son paquet Ubuntu (les partenaires du projet sont vivement 
invités à faire leur empaquetage eux-mêmes)

---

Proxy
=====

Si vous vous trouvez derrière un proxy, vous devez modifier le proxy du super 
utilisateur (root) via la commande:

    sudo gnome-network-properties

Ou pour installer rosinstall par exemple:

    sudo -i easy_install -U rosinstall

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

---

That's all Folks!
=================

présentation en ligne: [bit.ly/proteus1](http://bit.ly/proteus1)

![proteus-install](http://bit.ly/proteus1.qrcode "proteus-install")

source de cette présentation: [bit.ly/proteus1md](http://bit.ly/proteus1md)

sources sur GitHub: [bit.ly/proteus-src](http://bit.ly/proteus-src)

[![printfriendly](http://cdn.printfriendly.com/pf-button-both.gif "pdf")](http://www.printfriendly.com/print/v2?url=http%3A%2F%2Fanr-proteus.github.com%2Fslides%2Finstall.plain.html)

