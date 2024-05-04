# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	mosquitto \
	python3-paho-mqtt \
	dropbear \
	redis \
	redis-plus-plus \
	python3-redis \
	sqlite3 \
	htop \
	yaha \
	iptables \
	sudo \
	"

#	yaha \
# influxdb
# kernel-modules
# dotnet-core
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
