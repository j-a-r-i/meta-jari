# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	mosquitto \
	dropbear \
	redis \
	redis-plus-plus \
	sqlite3 \
	htop \
	yaha \
	"

#	yaha \
# influxdb
# kernel-modules
# dotnet-core
# aspnet-core
