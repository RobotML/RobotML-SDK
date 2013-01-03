# RTMaps Makefile
# Copyright 2002-2011 (C) Intempora S.A.

ROOTDIR  := $(realpath $(CURDIR)/..)
ifeq ($(ROOTDIR),)
$(error Please use make at least version 3.81)
endif

# Add C++ sources here
sources  =  maps_camera_image_rtmaps_to_robotml.cpp \
	    maps_gps_rtmaps_to_robotml.cpp \
	    maps_imu_rtmaps_to_robotml.cpp \
	    maps_lidar_scan_rtmaps_to_robotml.cpp \
	    maps_wifibot_inputs_robotml_to_rtmaps.cpp \
	    maps_wifibot_outputs_rtmaps_to_robotml.cpp

# Add C sources here
csources = 

PCK      = rtmaps_data_conversion.pck

# To add options to link:
# LDLIBS  += -lmylib
# LDFLAGS += -L/my/directory/

# To add options to the compiler:
# CFLAGS   += my specific C flags
# CXXFLAGS += my specific C++ flags
CPPFLAGS += -I../include

all: pck

RTMAPS_SDKDIR ?=/opt/rtmaps
include $(RTMAPS_SDKDIR)/templates.u/makefile.inc
