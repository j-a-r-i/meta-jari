DESCRIPTION = "llama.cpp - A lightweight C++ library for running LLMs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE"

SRC_URI = "https://github.com/ggerganov/llama.cpp;branch=main;protocol=https"
# SRCREV = "${AUTOREV}"
# SRC_URI[sha256sum] = "0e10354f3dcb36fee872cd6538d7c7cf50a4cca5f7bee03b490ebf1697752f35"

SRCREV = "gguv-v0.10.0"
# SRC_URI[sha256sum] = "46f8d6d2a845c9690cbe3c564f3eccef4712236b309e173ca9c836e45806e375"

S = "${WORKDIR}/llama.git"

inherit cmake

