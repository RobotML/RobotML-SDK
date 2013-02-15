
cmake_minimum_required(VERSION 2.8 FATAL_ERROR)

find_package(Effidence)

project(RobotMLModelApplication)

include_directories(src/${PROJECT_NAME})

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wno-unused-parameter")

effibox_add_application(RobotMLModelApplication
  EFFIBOX_PLUGIN_DEPENDS qtviewer camera rangefinder gps vehicle timer thread imu
  INTERNAL_DEPENDS
  effiqtviewer effitools
  EXTERNAL_DEPENDS
  boost|all opencv
)

