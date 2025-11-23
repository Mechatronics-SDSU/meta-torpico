DESCRIPTION = "import bistream for zybo"
LICENSE = "MIT"
SRC_URI = "file://design_1.bit"

S = "${WORKDIR}"

do_install() {
    install -Dm644 ${WORKDIR}/design_1.bit
}

FILES:${PN} = "/boot/design_1.bit"

# Allow FSBL to be built with DEBUG prints on
XSCTH_BUILD_DEBUG="1"