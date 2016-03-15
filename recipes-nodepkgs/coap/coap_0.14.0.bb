SUMMARY = "A CoAP library for node modelled after 'http'"
SRC_URI = "npm://registry.npmjs.org;name=coap;version=${PV}"

S = "${WORKDIR}/npmpkg"

LICENSE = "ISC & MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=da7f67f400655f099bce24cf0e3d6f36 \
                    file://node_modules/capitalize/LICENSE;md5=2c1a595c4befc7ebc0724327e5ac4779 \
                    file://node_modules/debug/node_modules/ms/LICENSE;md5=2be2157b55ea281b7f4969d7ba05eea2 \
                    file://node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/lru-cache/node_modules/pseudomap/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/lru-cache/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/fastseries/LICENSE;md5=56874de30475be4c33420552523a60b4 \
                    file://node_modules/fastseries/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://node_modules/fastseries/node_modules/reusify/LICENSE;md5=64af5da073cd15043e95dc5b443951ee \
                    file://node_modules/coap-packet/LICENSE.md;md5=6e32ee24968e3857b09b109ac48e174c \
                    file://node_modules/readable-stream/LICENSE;md5=d7351a4fc8e956f1a68413490d5e655e \
                    file://node_modules/readable-stream/node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=fcf5cfdc777e49f11402422c72a86f43 \
                    file://node_modules/readable-stream/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/readable-stream/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/readable-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/bl/LICENSE.md;md5=7489efd5cf7c4575f9898b7eab7aeeb0"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-bl = "MIT"
LICENSE_${PN}-capitalize = "MIT"
LICENSE_${PN}-coap-packet = "MIT"
LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-fastseries-reusify = "MIT"
LICENSE_${PN}-fastseries-xtend = "MIT"
LICENSE_${PN}-fastseries = "ISC"
LICENSE_${PN}-lru-cache-pseudomap = "ISC"
LICENSE_${PN}-lru-cache-yallist = "ISC"
LICENSE_${PN}-lru-cache = "ISC"
LICENSE_${PN}-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-readable-stream-inherits = "ISC"
LICENSE_${PN}-readable-stream-isarray = "MIT"
LICENSE_${PN}-readable-stream-process-nextick-args = "MIT"
LICENSE_${PN}-readable-stream-string_decoder = "MIT"
LICENSE_${PN}-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-readable-stream = "MIT"
LICENSE_${PN} = "MIT"
