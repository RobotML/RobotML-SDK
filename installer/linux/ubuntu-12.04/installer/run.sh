#!/bin/bash
echo ""
echo "PROTEUS Self Extracting Installer - http://anr-proteus.fr "
echo ""

export TMPDIR=`mktemp -d /tmp/selfextract.XXXXXX`

# find the line number where the archive starts in the script
ARCHIVE=`awk "/^__ARCHIVE_BELOW__/ {print NR + 1; exit 0; }" "$0"`

# seperate the archive from the script and decompress it 
tail -n+$ARCHIVE "$0" | tar xz -C $TMPDIR

CDIR=`pwd`
cd $TMPDIR
python proteus.py

cd $CDIR
rm -rf $TMPDIR

exit 0

__ARCHIVE_BELOW__
