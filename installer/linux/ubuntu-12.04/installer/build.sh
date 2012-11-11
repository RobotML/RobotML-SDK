#!/bin/sh

DIR_PKG=$(pwd)

echo "==== init  ===="

DIR_TMP=$(mktemp -d)
cp -r proteus.py run.sh data ${DIR_TMP}
cd ${DIR_TMP}
# clean SVN cache
find . -name .svn | xargs rm -rf

echo "==== pack  ===="

tar czf proteus.tar.gz proteus.py data
cat run.sh proteus.tar.gz > proteus.run
chmod +x proteus.run
cp proteus.run ${DIR_PKG}/

echo "==== clean ===="

cd ${DIR_PKG}
rm -rf ${DIR_TMP}

echo "==== done  ===="

