# clone PROTEUS repository

PATH_MIRROR=/path/to/mirror
cd $PATH_MIRROR
url=https://packages.greyc.fr/proteus/
user="login"
pass="*****"

wget --mirror --http-user=$user --http-password=$pass --no-check-certificate \
     --no-parent --no-host-directories --execute robots=off \
     --reject "index.html*" $url

# http://downloads.effidence.com/repository/projects/201004-Proteus
# http://dl.intempora.com/linux/debs = 403, see
# http://dl.intempora.com/linux/debs/dists/stable/main/binary-i386/Packages
# possible to do the same with http://packages.ros.org/ros/ubuntu/ but huge
# contains a lot of .deb for all Ubuntu distribution/version i386 + x64 + armel,
# hardy jaunty karmic lucid maverick natty oneiric precise ... for all ROS pkg !

# in /etc/apt/sources.list.d/proteus-local.list
echo "# PROTEUS local mirror
deb $PATH_MIRROR/proteus stable main
" | sudo tee /etc/apt/sources.list.d/proteus-local.list > /dev/null

