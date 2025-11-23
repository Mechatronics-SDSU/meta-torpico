# meta-torpico/recipes-bsp/u-boot-xlnx_%.bbappend

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Add our UART1 config fragment for zybo-generic
SRC_URI:append:zybo-generic = " file://zybo-serial-uart1.cfg"
