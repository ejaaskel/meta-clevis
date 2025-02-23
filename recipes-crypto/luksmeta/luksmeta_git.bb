SUMMARY = "Library for storing metadata in LUKSv1 header"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4e9dfcb21c14eb0c40ae8ba436d3bb7a"

SRC_URI = "git://github.com/latchset/luksmeta.git;protocol=https;branch=master"

PV = "9+git"
SRCREV = "3e3cba3944703b12b0010154654b032c78aaa94c"

S = "${WORKDIR}/git"

DEPENDS = "cryptsetup"

inherit pkgconfig autotools
