DESCRIPTION = "Closed source binary files to help boot the ARM on the BCM2835."
LICENSE = "CLOSED"
#LICENSE = "Proprietary"
#LIC_FILES_CHKSUM = "file://LICENCE.broadcom;md5=e86e693d19572ee64cc8b17fb062faa9"

inherit deploy

RPIFW_S ?= "${WORKDIR}/git"

SRC_URI = "file://start_cd.elf file://fixup_cd.dat file://bootcode.bin"
SRCREV = "e42a747e8d5c4a2fb3e837d0924c7cc39999936a"
PV = "20150206"
#include recipes-bsp/common/firmware.inc

RDEPENDS_${PN} = "rpi-config"

COMPATIBLE_MACHINE = "raspberrypi"

#S = "${RPIFW_S}/boot"

PR = "r5"

do_deploy() {
    install -d ${DEPLOYDIR}/${PN}

    cp ${WORKDIR}/start_cd.elf ${DEPLOYDIR}/${PN}
    cp ${WORKDIR}/fixup_cd.dat ${DEPLOYDIR}/${PN}
    cp ${WORKDIR}/bootcode.bin ${DEPLOYDIR}/${PN}
}

addtask deploy before do_package after do_install
do_deploy[dirs] += "${DEPLOYDIR}/${PN}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

