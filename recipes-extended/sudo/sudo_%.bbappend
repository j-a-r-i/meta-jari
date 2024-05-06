do_install:append() {
    echo "user ALL= (ALL:ALL) ALL " > ${D}${sysconfdir}/sudoers.d/user
}

FILES_${PN} += " ${sysconfdir}/sudoers.d/user"