PACKAGECONFIG_remove = "jpeg libpng cups gl gles2 xcb xcursor xinerama xinput xinput2 xfixes xrand xrender xshape xsync xvideo openvg iconv xkb directfb linuxfb icu pulseaudio tests examples accessibility freetype harfbuzz sql-mysql sql-odbc sql-oci sql-ibase sql-db2 sql-tds widgets"

PACKAGECONFIG += "nogui nogif nofreetype noqpa"

PACKAGECONFIG[nogui] = "-no-gui"
PACKAGECONFIG[noeglfs] = "-no-eglfs"
PACKAGECONFIG[nogif] = "-no-gif"
PACKAGECONFIG[nofreetype] = "-no-freetype"
PACKAGECONFIG[noqpa] = "-no-qpa-platform-guard"


EXTRA_OECONF += "-no-qpa-platform-guard "