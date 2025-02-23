SUMMARY = "Tools for JSON Object Signing and Encryption (JOSE)"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "git://github.com/latchset/jose.git;protocol=https;branch=master"

PV = "10+git"
SRCREV = "339ad6c836587c3e481f5df56c22c5370c7a264b"

S = "${WORKDIR}/git"

DEPENDS = "zlib jansson openssl"

inherit meson pkgconfig

FILES:${PN} += "/usr/share/*"
