FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://smb.conf"

do_install:append () {
   install -d ${D}${sysconfdir}/samba
   install -D -m 600 ${WORKDIR}/smb.conf ${D}${sysconfdir}/samba
}