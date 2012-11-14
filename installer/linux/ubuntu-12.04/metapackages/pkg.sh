#!/bin/sh

VERSION=0.1
DIR_PKG=$(pwd)
REP_PKG=/media/data/work/repo
ALL_PKG="proteus-*"

echo "==== init  ===="

if [ -z "$@" ]; then
    pkgs="${ALL_PKG}"
else
    pkgs="$@"
fi

echo "${pkgs}"

DIR_TMP=$(mktemp -d)
cp -r . ${DIR_TMP}
cd ${DIR_TMP}
# clean SVN cache
find . -name .svn | xargs rm -rf

echo "==== pack  ===="

for p in ${pkgs}; do
    if [ -d "${p}" ]; then
        DEB_PKG="${p}_${VERSION}_i386.deb"
        #[ -e ${DEB_PKG} ] && mv ${DEB_PKG} ${DEB_PKG}.$(date +%s).bak
        fakeroot dpkg -b ${p} ${DEB_PKG}
        reprepro -Vb ${REP_PKG} remove stable ${p}
        reprepro -S main -P optional -Vb ${REP_PKG} includedeb stable ${DEB_PKG}
    fi
done

echo "==== clean ===="

cd ${DIR_PKG}
rm -rf ${DIR_TMP}

echo "==== done  ===="

