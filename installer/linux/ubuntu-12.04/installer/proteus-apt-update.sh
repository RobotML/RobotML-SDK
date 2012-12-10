#!/bin/sh

USE_UNSTABLE=0
USERNAME=
PASSWORD=

while getopts "l:p:h:u" opt; do
 case $opt in
 u)
  USE_UNSTABLE=1
  ;;
 l)
  USERNAME=$OPTARG
  ;;
 p)
  PASSWORD=$OPTARG
  ;;
 esac
done


# Setup :
if [ -z $USERNAME ] || [ -z $PASSWORD ] ;
then
 echo "Login required for proteus.bourges.univ-orleans.fr"
fi

if [ -z $USERNAME ] ;
then
 echo " -> user login :"
 read USERNAME
fi

if [ -z $PASSWORD ] ;
then
  echo " -> password:"
  read PASSWORD
fi

echo " "
# fetching gpg key
echo "Adding gpg key for Proteus apt-repository"
if ! apt-key list | grep -q "45928983" ; then
 if ping -c 1 -w 5 pool.sks-keyservers.net > /dev/null 2>&1 ;
 then
  gpg --keyserver pool.sks-keyservers.net --recv-keys 45928983
  gpg --export 45928983 | sudo apt-key add -
 else
  echo "-> Unable to connect to pgp.mit.edu."
  echo "-> Aborting"
  exit 1
 fi
else
 echo "Key already added"
fi

# writing the new proteus.list
echo "Installing new sources.list"
sudo cp /etc/apt/sources.list.d/proteus.list /etc/apt/sources.list.d/proteus.list.bak

if [ "$USE_UNSTABLE" -eq 0 ]; then
 echo "# PROTEUS apt repositories (http://anr-proteus.fr)
 deb http://${USERNAME}:${PASSWORD}@proteus.bourges.univ-orleans.fr/packages precise stable
 deb http://downloads.effidence.com/repository/public/effibox precise universe
 " | sudo tee /etc/apt/sources.list.d/proteus.list > /dev/null
else
 echo "# PROTEUS apt repositories (http://anr-proteus.fr)
 deb http://${USERNAME}:${PASSWORD}@proteus.bourges.univ-orleans.fr/packages precise stable unstable
 deb http://downloads.effidence.com/repository/public/effibox precise universe
 " | sudo tee /etc/apt/sources.list.d/proteus.list > /dev/null
fi
