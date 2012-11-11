#!/bin/sh

VERSION=0.1
DIR_PKG=$(pwd)
REP_PKG=/media/data/work/paquets/depot

echo "==== init  ===="

DIR_TMP=$(mktemp -d)
cd ${DIR_TMP}

echo "==== wget   ===="

EFFI_PATH_DEB=downloads.effidence.com/repository/projects/201004-Proteus/dists/natty/universe/binary-i386
wget -r -k -np -R index.html* http://${EFFI_PATH_DEB}

echo "==== pack  ===="

cd ${EFFI_PATH_DEB}
for i in *.deb; do
    debfile=${i}
    debname=${i%%_*}
    echo "remove ${debname} add ${debfile}"
    reprepro -Vb ${REP_PKG} remove stable ${debname}
    reprepro -S main -P optional -Vb ${REP_PKG} includedeb stable ${debfile}
done

# fix for files like pavin-0.1.2-Linux.deb
for i in *-Linux.deb; do
    debfile=${i}
    debname=${i%%-*}
    echo "remove ${debname} add ${debfile}"
    reprepro -Vb ${REP_PKG} remove stable ${debname}
    reprepro -S main -P optional -Vb ${REP_PKG} includedeb stable ${debfile}
done

echo "==== clean ===="

cd ${DIR_PKG}
echo "rm -rf ${DIR_TMP}"

echo "==== done  ===="

#find . -name "*.deb" | xargs reprepro -S main -P optional -Vb ${REP_PKG} includedeb stable
#for i in $(find . -name "*.deb"); do echo ${i%.deb}; done
#for i in *.deb; do echo ${i%%_*}; done

