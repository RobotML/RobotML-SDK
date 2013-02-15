


# RTMaps Makefile
# Copyright 2002-2011 (C) Intempora S.A.

ROOTDIR  := $(realpath $(CURDIR)/..)
ifeq ($(ROOTDIR),)
$(error Please use make at least version 3.81)
endif

# Add C++ sources here
sources  =  \
		maps_hokuyo.cpp \
		maps_ChassisRobot.cpp \
		maps_Perception.cpp \
		maps_Pilote.cpp \
# Start of user code Additional C++ sources
# End of user code

# Add C sources here
# Start of user code Additional C sources
csources = 
# End of user code

PCK      = rtmaps_RobotMLModel.pck 

# To add options to link:
# Start of user code Additional libraries
# LDLIBS  += -lMyLib
# LDFLAGS += -L/my/directory/
# End of user code

# To add options to the compiler:
# Start of user code Additional compiler options
# CFLAGS   += my specific C flags
# CXXFLAGS += my specific C++ flags
CPPFLAGS += -I../include
# End of user code

all: pck

RTMAPS_SDKDIR ?=/opt/rtmaps
include $(RTMAPS_SDKDIR)/templates.u/makefile.inc

