SUMMARY = "Clevis automated decryption framework"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
                    file://COPYING.openssl;md5=a78c00d154a43f35ef1dc1292a234c6d"

SRC_URI = " \
    git://github.com/latchset/clevis.git;protocol=https;branch=master \
    file://0001-Remove-checks-for-tpm-tools-in-tpm2-pin-config.patch \
"

PV = "21+git"
SRCREV = "29debf6a227ad467b6827eb9818ae5f2243c257c"

S = "${WORKDIR}/git"

DEPENDS = "jansson jose cryptsetup-native luksmeta"
RDEPENDS:${PN} = "cryptsetup tpm2-tools bash"

inherit meson pkgconfig

FILES:${PN} += "/usr/share/bash-completion"
