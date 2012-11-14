#!/bin/sh

if [ -f ~/.proteus/setup.sh ]; then
    echo "# UNINSTALL $(date +'%F %T UTC%z')" > ~/.proteus/setup.sh
fi

# -v: verbose. -i: interactive
sudo rm -vi /etc/apt/sources.list.d/ros-latest.list /etc/apt/sources.list.d/proteus.list /etc/apt/sources.list.d/intempora.list 

sudo apt-get remove proteus-base
