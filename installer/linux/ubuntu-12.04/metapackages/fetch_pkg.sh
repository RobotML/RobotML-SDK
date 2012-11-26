 #!/bin/sh

DIR=$(pwd)
OUT_DIR=${DIR}/deb

if [ ! -d "$OUT_DIR" ]; then
    echo "Creating $OUT_DIR"
    mkdir $OUT_DIR
fi

cd $OUT_DIR
apt-get download blender-proteus cycabtksimulator mgengine* openrobots-morse