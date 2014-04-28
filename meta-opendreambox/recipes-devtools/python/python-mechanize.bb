DESCRIPTION = "Stateful programmatic web browsing, after Andy Lester's Perl module WWW::Mechanize."
HOMEPAGE = "http://wwwsearch.sourceforge.net/mechanize/"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=a7939d3efc8493ae7054e3d2c4644b28"
PV = "0.2.5"
PRIORITY = "optional"
PR = "r1"

SRC_URI = "https://pypi.python.org/packages/source/m/mechanize/mechanize-0.2.5.tar.gz"
SRC_URI[sha256sum] = "2e67b20d107b30c00ad814891a095048c35d9d8cb9541801cebe85684cc84766"
SRC_URI[md5sum] = "32657f139fc2fb75bcf193b63b8c60b2"

S = "${WORKDIR}/mechanize-0.2.5/"

inherit setuptools

do_install_append() {
        rm -r ${D}${PYTHON_SITEPACKAGES_DIR}/mechanize-0.2.5-py2.7.egg-info
}

RDEPENDS = "python-robotparser"
