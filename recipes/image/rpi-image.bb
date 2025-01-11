# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Include modules in rootfs
IMAGE_INSTALL += " \
	mosquitto \
	dropbear \
	openssh-sftp-server \
	gdbserver \
	nano \
	wpa-supplicant linux-firmware-bcm43455 \
	nodejs \
	htop \
	git \
	screen tmux \
	samba-server \
	kernel-module-brcmfmac \
	kernel-module-brcmfmac-wcc \
	kernel-module-brcmutil \
	glibc-utils glibc-charmap-utf-8 \
"

#	sudo \
#	yaha \
#	nginx \
#	llamacpp \
#	libmicrohttpd \
#	dotnet-core \
#	vsdbg \
#	dropbear \
#	redis \
#	redis-plus-plus \
# kernel-modules
# aspnet-core

inherit extrausers

# This password is generated with `openssl passwd -6 <password>`, 
PASSWD = "\$6\$Oa7GELrE2FfNIWEo\$GaqRYWcvfbH2S9JdnIaXxQ058cENuqzq3eYLVqfwddrKbaAP5Z/aIDi6f3suskn1U1yJed7WKMfIBF3mpc.K51"
PASSYA = "\$6\$eSHJKNvxRaqTZzDy\$Av2fVD5rCdbU5zjjwfYmUGNCSANtKdahHXbVgzaqZAumA0JEcnCG9uIKYDxmdU8iskWlNE/KOYHScPPzqklCt/"
EXTRA_USERS_PARAMS:append = "\
    useradd -u 1200 -d /home/user -s /bin/sh -p '${PASSWD}' user; \
    usermod -a -G sudo user; \
    useradd -u 1201 -d /home/yaha -s /bin/sh -p '${PASSYA}' yaha; \
	"
