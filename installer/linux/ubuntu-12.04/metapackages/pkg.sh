#!/bin/sh

VERSION=0.1
DIR_PKG=$(pwd)
REP_PKG=${DIR_PKG}/repo
REP_DEB=${DIR_PKG}/deb
ALL_PKG="proteus-*"

echo "==== init  ===="

if [ -z "$@" ]; then
    pkgs="${ALL_PKG}"
else
    pkgs="$@"
fi

echo "${pkgs}"


echo "==== pack  ===="

for p in ${pkgs}; do
    if [ -d "${p}" ]; then
	chmod 0775 ${p}
        DEB_PKG="${REP_DEB}/${p}_${VERSION}_i386.deb"
        dpkg-deb --build ${p} ${DEB_PKG}
        reprepro -b ${REP_PKG} remove stable ${p}
    fi
done

dpkg-deb --build eclipse-proteus deb/eclipse-proteus_0.1_i386.deb

echo "==== additional package ======"

for f in ${REP_DEB}/*.deb
do
  reprepro -S main -P optional -b ${REP_PKG} includedeb stable ${f}
done
echo "==== clean ===="

cd ${DIR_PKG}
rm -rf ${DIR_TMP}

echo "==== done  ===="

