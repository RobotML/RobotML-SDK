# The shell in which to execute make rules.
SHELL = /bin/sh

# Default target executed when no arguments are given to make.
default_target: doc plain

# Build rule for target named doc.
# https://github.com/adamzap/landslide
doc:
	for i in *.cfg; do landslide $${i}; done
plain:
	for i in *.md; do markdown $${i} > $${i%.md}.plain.html; done
pdf:
	for i in *.md; do landslide -i $${i} -d $${i%.md}.pdf; done
html:
	for i in *.md; do landslide -i $${i} -d $${i%.md}.html; done

