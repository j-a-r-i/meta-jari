SUMMARY = "Yaha - Your Awesome Hello Application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=7414294416b0831e0a7e3c09c4d4dd5d"

SRC_URI = "git://github.com/ojari/yaha.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = "mosquitto sqlite3 nlohmann-json"
EXTRA_OECMAKE = "-DYOCTO=YES"
