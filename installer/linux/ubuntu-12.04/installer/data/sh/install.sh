#!/bin/sh

#
# Proteus install
# http://anr-proteus.fr
#

check_and_install() {
  if  dpkg -l $1 > /dev/null 2>&1  ;
  then
    echo "$1 already installed"
  else
    echo "Installing $1"
    sudo apt-get -q -y install $1
  fi
}

add_gpg_key() {
if ! apt-key list | grep -q $1 ; then
 if ping -c 1 -w 5 keyserver.ubuntu.com > /dev/null 2>&1 ;
 then
  sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys $1
 else
  echo "-> Unable to connect to keyserver."
  echo "-> Aborting"
 fi
else
 echo "Key already added"
fi
}

#
# Check OS Release
#
OS_ID=`lsb_release -si`;
OS_RELEASE=`lsb_release -sr`;
OS_BIT=`uname -i` ;

if [ "${OS_ID}" != "Ubuntu" ] & [ "${OS_RELEASE}" != "12.04" ] ;
then
  echo "Wrong OS Release :\n\t- Supported OS is Ubuntu 12.04 LTS precise" ;
  exit 1 ;
elif [ "${OS_BIT}" != "i386" ] ; then
  echo "Wrong OS Architecture :\n\t- Supported Architecture is 32bits" ;
  exit 1 ;
else
  echo "OS Ok: Proceed to install"
fi

#
# Installing python-gtk2, required for pygtk interface.
#
sudo apt-get update
check_and_install "python-gtk2"

#
# Fetching login from input
#
if [ 2 -gt $# ];
then
  echo "usage: $0 login password [pkg...]"
  echo "  proteus.bourges.univ-orleans.fr - anr-proteus.fr"
  exit 1
fi

LOGIN=${1}
shift
PASSW=${1}
shift
PACKG=$@

#
# Checking distribution
#
DISTRIBUTION=$(lsb_release -sc)
if [ ! -d ~/.proteus ]; then
    mkdir ~/.proteus
fi
if [ ! -f ~/.proteus/setup.sh ]; then
    echo "#!/bin/bash" > ~/.proteus/setup.sh
    echo "[ -f ~/.proteus/setup.sh ] && . ~/.proteus/setup.sh" >> ~/.bashrc
fi

echo "
-------------------------------------------------------------------------------
Hello ${LOGIN}, welcome on PROTEUS ! $(lsb_release -sd)"

if [ ! -z "$PACKG" ]; then echo "( ${PACKG} )"; fi

if [ "$DISTRIBUTION" != "precise"  ]; then
    read -p "[WARNING] Could not detect Precise (Ubuntu 12.04), continue anyway? [y/N]: " CONT
    if [ "$CONT" != "y"  ]; then
        exit 1
    fi
fi

# check if the current DISTRIBUTION fit ros repo
if ! echo "lucid maverick natty oneiric precise" | grep -q $DISTRIBUTION; then
    echo "[WARNING] $DISTRIBUTION not available in ros repository, taking precise"
    DISTRIBUTION="precise"
fi
# see http://www.ros.org/wiki/electric/Installation/Ubuntu

# check if you can access the server
echo "[INFO] Login proteus.bourges.univ-orleans.fr ..."
wget http://proteus.bourges.univ-orleans.fr/packages/ --http-user=${LOGIN} --http-password=${PASSW} --no-cache --spider -q
if [ 0 -ne $? ]; then
    read -p "[WARNING] Can't access proteus.bourges.univ-orleans.fr, continue anyway? [y/N]: " CONT
    if [ "$CONT" != "y"  ]; then
        exit 1
    fi
else
    echo "[INFO] Login proteus.bourges.univ-orleans.fr : OK"
fi

echo "
-------------------------------------------------------------------------------
Note that the install can be long, in case of problem, you can restart this app
safely, packages are downloaded in /var/cache/apt/archives
Enter your root password to continue (aka. super-user or administrator)
-------------------------------------------------------------------------------"

echo "deb http://packages.ros.org/ros/ubuntu ${DISTRIBUTION} main
" | sudo tee /etc/apt/sources.list.d/ros-latest.list > /dev/null

echo "# PROTEUS repositories ( http://anr-proteus.fr )
deb http://${LOGIN}:${PASSW}@proteus.bourges.univ-orleans.fr/packages precise stable
deb http://downloads.effidence.com/repository/public/effibox precise universe
" | sudo tee /etc/apt/sources.list.d/proteus.list > /dev/null

# proteus.list contains the pass, only root should read it
#sudo chown root /etc/apt/sources.list.d/proteus.list
#sudo chmod 0600 /etc/apt/sources.list.d/proteus.list
# was messing up with apt-cache & packages listing

echo "[INFO] Add Intempora (RTMaps) repository and GPG key"
wget -q http://dl.intempora.com/linux/support_at_intempora.com.gpg.key -O - | sudo apt-key add -
wget -q http://dl.intempora.com/linux/debs/intempora.list -O - | sudo tee /etc/apt/sources.list.d/intempora.list > /dev/null

echo "[INFO] Add ROS GPG key"
wget -q http://packages.ros.org/ros.key -O - | sudo apt-key add -

mkdir -p ~/.gnupg

echo "[INFO] Add Effidence GPG key"
add_gpg_key A41212AD

echo "[INFO] Adding gpg key for Proteus apt-repository"
add_gpg_key 45928983

echo "

# -------------------------------------------------------------------------------
# [INFO] Update APT cache
# -------------------------------------------------------------------------------"
sudo apt-get -q update
if [ 0 -ne $? ]; then
    read -p "[WARNING] It seems that APT could not update, continue anyway? [y/N]: " CONT
    if [ "$CONT" != "y"  ]; then
        exit 1
    fi
fi

echo "
-------------------------------------------------------------------------------
[INFO] Upgrade
-------------------------------------------------------------------------------"
#sudo apt-get -q --force-yes -y upgrade
sudo apt-get --force-yes -q -y upgrade
# check reboot required
if [ -f /var/run/reboot-required ]; then
    echo "[WARNING] You might need to reboot (if you updated your kernel for instance)"
    echo "after rebooting, you can re-launch this app"
    echo "you won't need to download what you already did."
    read -p "[WARNING] continue anyway? [y/N]: " CONT
    if [ "$CONT" != "y"  ]; then
        exit 1
    fi
fi

echo "
-------------------------------------------------------------------------------
[INFO] Install
-------------------------------------------------------------------------------"
# install
check_and_install "python-dev"
check_and_install "python-pip"
check_and_install "libyaml-dev"
check_and_install "python-yaml"

sudo apt-get install ${PACKG}

echo "
-------------------------------------------------------------------------------
[INFO] Install: apt-get install done
-------------------------------------------------------------------------------"

if ! grep -q "/opt/ros/fuerte/setup.bash" ~/.proteus/setup.sh; then
    echo "[ -f /opt/ros/fuerte/setup.bash ] && . /opt/ros/fuerte/setup.bash" >> ~/.proteus/setup.sh
fi

if ! grep -q "/usr/local/lib/python3/dist-packages" ~/.proteus/setup.sh; then
    echo "export PYTHONPATH=/usr/local/lib/python3/dist-packages:\$PYTHONPATH" >> ~/.proteus/setup.sh
fi

echo "[INFO] check for rosinstall tool"
check_and_install "python-pip"
if ! which rosinstall > /dev/null 2>&1 ;
then
    sudo pip install -U rosinstall
else
  echo "rosinstall ok"
fi

echo "
-------------------------------------------------------------------------------
                                Done

    visit: http://anr-proteus.github.com/slides/demo.html for demo

                        http://anr-proteus.fr
-------------------------------------------------------------------------------"

# xdg-open http://bit.ly/proteus2

exit 0

