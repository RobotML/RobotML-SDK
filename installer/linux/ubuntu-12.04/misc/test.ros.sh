#!/bin/bash

if [ -f /opt/ros/fuerte/setup.bash ]; then
    . /opt/ros/fuerte/setup.bash
elif [ -f /opt/ros/electric/setup.bash ]; then
    . /opt/ros/electric/setup.bash
else
    echo "[ERROR] could not find ROS {fuerte,electric}"
    exit 1
fi

testresult=$(mktemp)

roscore &
rospid=$!
while ! rosnode list 2>/dev/null|grep rosout &>/dev/null; do
    sleep 1 # wait roscore init
done
echo "
###############################################################################
                                Start Testing
###############################################################################"
rostopic echo -n1 /test > $testresult &
rostopic pub -1 /test std_msgs/String "ProteusTestSucceed"
kill $rospid
wait $rospid

if grep "ProteusTestSucceed" $testresult; then
    echo "
###############################################################################
                                Test Passed OK
###############################################################################"
else
    echo "
###############################################################################
                                Test Failed
###############################################################################"
fi

rm $testresult
