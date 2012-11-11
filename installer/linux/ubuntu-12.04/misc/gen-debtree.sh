#!/bin/sh

# see also: apt-cache dotty proteus-all
# debtree ${pkg} --max-depth=${depth} | dot -Tpng -o ${pkg}-${depth}.png 

pkg="proteus-all"
for depth in 2 3; do
    debtree ${pkg} --max-depth=${depth} > ${pkg}-${depth}.dot 
    dot -Tpng -o ${pkg}-${depth}.png < ${pkg}-${depth}.dot 
done

