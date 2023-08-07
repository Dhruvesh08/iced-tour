# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get tour could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/tour/0.1.0"
SRC_URI += "git://github.com/Dhruvesh08/iced-tour.git;protocol=https;nobranch=1;branch=tour-wgpu"
SRCREV = "27b08fa336fa3c01c7f0ee106add8e759ea524f2"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+27b08fa336"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/ab_glyph/0.2.21 \
    crate://crates.io/ab_glyph_rasterizer/0.1.8 \
    crate://crates.io/addr2line/0.20.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/ahash/0.8.3 \
    crate://crates.io/aho-corasick/1.0.2 \
    crate://crates.io/aliasable/0.1.3 \
    crate://crates.io/allocator-api2/0.2.16 \
    crate://crates.io/android-activity/0.4.3 \
    crate://crates.io/android-properties/0.2.2 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/approx/0.5.1 \
    crate://crates.io/arrayref/0.3.7 \
    crate://crates.io/arrayvec/0.7.4 \
    crate://crates.io/ash/0.37.3+1.3.251 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.68 \
    crate://crates.io/bit-set/0.5.3 \
    crate://crates.io/bit-vec/0.6.3 \
    crate://crates.io/bit_field/0.10.2 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.3.3 \
    crate://crates.io/block-sys/0.1.0-beta.1 \
    crate://crates.io/block/0.1.6 \
    crate://crates.io/block2/0.2.0-alpha.6 \
    crate://crates.io/bumpalo/3.13.0 \
    crate://crates.io/bytemuck/1.13.1 \
    crate://crates.io/bytemuck_derive/1.4.1 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/calloop/0.10.6 \
    crate://crates.io/cc/1.0.82 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cfg_aliases/0.1.1 \
    crate://crates.io/clipboard-win/4.5.0 \
    crate://crates.io/clipboard_macos/0.1.0 \
    crate://crates.io/clipboard_wayland/0.2.0 \
    crate://crates.io/clipboard_x11/0.4.0 \
    crate://crates.io/cocoa-foundation/0.1.1 \
    crate://crates.io/cocoa/0.24.1 \
    crate://crates.io/codespan-reporting/0.11.1 \
    crate://crates.io/color_quant/1.1.0 \
    crate://crates.io/com-rs/0.2.1 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/core-graphics-types/0.1.2 \
    crate://crates.io/core-graphics/0.22.3 \
    crate://crates.io/cosmic-text/0.9.0 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.8 \
    crate://crates.io/crossbeam-deque/0.8.3 \
    crate://crates.io/crossbeam-epoch/0.9.15 \
    crate://crates.io/crossbeam-utils/0.8.16 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/d3d12/0.6.0 \
    crate://crates.io/dispatch/0.2.0 \
    crate://crates.io/dlib/0.5.2 \
    crate://crates.io/downcast-rs/1.2.0 \
    crate://crates.io/either/1.9.0 \
    crate://crates.io/env_logger/0.10.0 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.2 \
    crate://crates.io/error-code/2.3.1 \
    crate://crates.io/etagere/0.2.8 \
    crate://crates.io/euclid/0.22.9 \
    crate://crates.io/exr/1.6.4 \
    crate://crates.io/fast-srgb8/1.0.0 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fdeflate/0.3.0 \
    crate://crates.io/flate2/1.0.26 \
    crate://crates.io/flume/0.10.14 \
    crate://crates.io/fontdb/0.14.1 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-io/0.3.28 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/futures/0.3.28 \
    crate://crates.io/gethostname/0.2.3 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/gif/0.12.0 \
    crate://crates.io/gimli/0.27.3 \
    crate://crates.io/glam/0.24.1 \
    crate://crates.io/glow/0.12.3 \
    crate://crates.io/glyphon/0.3.0 \
    crate://crates.io/gpu-alloc-types/0.2.0 \
    crate://crates.io/gpu-alloc/0.5.4 \
    crate://crates.io/gpu-allocator/0.22.0 \
    crate://crates.io/gpu-descriptor-types/0.1.1 \
    crate://crates.io/gpu-descriptor/0.2.3 \
    crate://crates.io/guillotiere/0.6.2 \
    crate://crates.io/half/2.3.1 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.14.0 \
    crate://crates.io/hassle-rs/0.10.0 \
    crate://crates.io/hermit-abi/0.3.2 \
    crate://crates.io/hexf-parse/0.2.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/iced/0.10.0 \
    crate://crates.io/iced_core/0.10.0 \
    crate://crates.io/iced_futures/0.7.0 \
    crate://crates.io/iced_graphics/0.9.0 \
    crate://crates.io/iced_renderer/0.1.0 \
    crate://crates.io/iced_runtime/0.1.1 \
    crate://crates.io/iced_style/0.9.0 \
    crate://crates.io/iced_tiny_skia/0.1.0 \
    crate://crates.io/iced_wgpu/0.11.1 \
    crate://crates.io/iced_widget/0.1.3 \
    crate://crates.io/iced_winit/0.10.0 \
    crate://crates.io/image/0.24.6 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indexmap/2.0.0 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/is-terminal/0.4.9 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jobserver/0.1.26 \
    crate://crates.io/jpeg-decoder/0.3.0 \
    crate://crates.io/js-sys/0.3.64 \
    crate://crates.io/kamadak-exif/0.5.5 \
    crate://crates.io/khronos-egl/4.1.0 \
    crate://crates.io/kurbo/0.9.5 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lebe/0.5.2 \
    crate://crates.io/libc/0.2.147 \
    crate://crates.io/libloading/0.7.4 \
    crate://crates.io/libloading/0.8.0 \
    crate://crates.io/libm/0.2.7 \
    crate://crates.io/linux-raw-sys/0.4.5 \
    crate://crates.io/lock_api/0.4.10 \
    crate://crates.io/log/0.4.19 \
    crate://crates.io/lru/0.11.0 \
    crate://crates.io/malloc_buf/0.0.6 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memmap2/0.5.10 \
    crate://crates.io/memmap2/0.6.2 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/metal/0.24.0 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/mio/0.8.8 \
    crate://crates.io/mutate_once/0.1.1 \
    crate://crates.io/naga/0.12.3 \
    crate://crates.io/nanorand/0.7.0 \
    crate://crates.io/ndk-context/0.1.1 \
    crate://crates.io/ndk-sys/0.4.1+23.1.7779620 \
    crate://crates.io/ndk/0.7.0 \
    crate://crates.io/nix/0.22.3 \
    crate://crates.io/nix/0.24.3 \
    crate://crates.io/nix/0.25.1 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-rational/0.4.1 \
    crate://crates.io/num-traits/0.2.16 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/num_enum/0.5.11 \
    crate://crates.io/num_enum/0.6.1 \
    crate://crates.io/num_enum_derive/0.5.11 \
    crate://crates.io/num_enum_derive/0.6.1 \
    crate://crates.io/objc-foundation/0.1.1 \
    crate://crates.io/objc-sys/0.2.0-beta.2 \
    crate://crates.io/objc/0.2.7 \
    crate://crates.io/objc2-encode/2.0.0-pre.2 \
    crate://crates.io/objc2/0.3.0-beta.3.patch-leaks.3 \
    crate://crates.io/objc_exception/0.1.2 \
    crate://crates.io/objc_id/0.1.1 \
    crate://crates.io/object/0.31.1 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/orbclient/0.3.46 \
    crate://crates.io/owned_ttf_parser/0.19.0 \
    crate://crates.io/palette/0.7.2 \
    crate://crates.io/palette_derive/0.7.2 \
    crate://crates.io/parking_lot/0.11.2 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.8.6 \
    crate://crates.io/parking_lot_core/0.9.8 \
    crate://crates.io/percent-encoding/2.3.0 \
    crate://crates.io/phf/0.11.2 \
    crate://crates.io/phf_generator/0.11.2 \
    crate://crates.io/phf_macros/0.11.2 \
    crate://crates.io/phf_shared/0.11.2 \
    crate://crates.io/pin-project-internal/1.1.3 \
    crate://crates.io/pin-project-lite/0.2.11 \
    crate://crates.io/pin-project/1.1.3 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/png/0.17.9 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro2/1.0.66 \
    crate://crates.io/profiling/1.0.9 \
    crate://crates.io/qoi/0.4.1 \
    crate://crates.io/quick-xml/0.28.2 \
    crate://crates.io/quote/1.0.32 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/range-alloc/0.1.3 \
    crate://crates.io/rangemap/1.3.0 \
    crate://crates.io/raw-window-handle/0.5.2 \
    crate://crates.io/rayon-core/1.11.0 \
    crate://crates.io/rayon/1.7.0 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/regex-automata/0.3.6 \
    crate://crates.io/regex-syntax/0.7.4 \
    crate://crates.io/regex/1.9.3 \
    crate://crates.io/renderdoc-sys/1.0.0 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustix/0.38.7 \
    crate://crates.io/rustybuzz/0.8.0 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/sctk-adwaita/0.5.4 \
    crate://crates.io/simd-adler32/0.3.7 \
    crate://crates.io/siphasher/0.3.10 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/slotmap/1.0.6 \
    crate://crates.io/smallvec/1.11.0 \
    crate://crates.io/smithay-client-toolkit/0.16.0 \
    crate://crates.io/smithay-clipboard/0.6.6 \
    crate://crates.io/softbuffer/0.2.1 \
    crate://crates.io/spin/0.9.8 \
    crate://crates.io/spirv/0.2.0+1.5.4 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/str-buf/1.0.6 \
    crate://crates.io/strict-num/0.1.1 \
    crate://crates.io/svg_fmt/0.4.1 \
    crate://crates.io/swash/0.1.8 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.28 \
    crate://crates.io/sys-locale/0.3.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/thiserror-impl/1.0.44 \
    crate://crates.io/thiserror/1.0.44 \
    crate://crates.io/tiff/0.8.1 \
    crate://crates.io/tiny-skia-path/0.10.0 \
    crate://crates.io/tiny-skia-path/0.8.4 \
    crate://crates.io/tiny-skia/0.10.0 \
    crate://crates.io/tiny-skia/0.8.4 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/toml_datetime/0.6.3 \
    crate://crates.io/toml_edit/0.19.14 \
    crate://crates.io/ttf-parser/0.19.1 \
    crate://crates.io/twox-hash/1.6.3 \
    crate://crates.io/unicode-bidi-mirroring/0.1.0 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ccc/0.1.2 \
    crate://crates.io/unicode-general-category/0.6.0 \
    crate://crates.io/unicode-ident/1.0.11 \
    crate://crates.io/unicode-linebreak/0.1.5 \
    crate://crates.io/unicode-script/0.5.5 \
    crate://crates.io/unicode-segmentation/1.10.1 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.87 \
    crate://crates.io/wasm-bindgen-futures/0.4.37 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.87 \
    crate://crates.io/wasm-bindgen-macro/0.2.87 \
    crate://crates.io/wasm-bindgen-shared/0.2.87 \
    crate://crates.io/wasm-bindgen/0.2.87 \
    crate://crates.io/wasm-timer/0.2.5 \
    crate://crates.io/wayland-backend/0.1.2 \
    crate://crates.io/wayland-client/0.29.5 \
    crate://crates.io/wayland-client/0.30.2 \
    crate://crates.io/wayland-commons/0.29.5 \
    crate://crates.io/wayland-cursor/0.29.5 \
    crate://crates.io/wayland-protocols/0.29.5 \
    crate://crates.io/wayland-scanner/0.29.5 \
    crate://crates.io/wayland-scanner/0.30.1 \
    crate://crates.io/wayland-sys/0.29.5 \
    crate://crates.io/wayland-sys/0.30.1 \
    crate://crates.io/web-sys/0.3.64 \
    crate://crates.io/weezl/0.1.7 \
    crate://crates.io/wgpu-core/0.16.1 \
    crate://crates.io/wgpu-hal/0.16.2 \
    crate://crates.io/wgpu-types/0.16.1 \
    crate://crates.io/wgpu/0.16.3 \
    crate://crates.io/widestring/1.0.2 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-wsapoll/0.1.1 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/window_clipboard/0.3.0 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.1 \
    crate://crates.io/windows/0.44.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/winit/0.28.6 \
    crate://crates.io/winnow/0.5.4 \
    crate://crates.io/x11-dl/2.21.0 \
    crate://crates.io/x11rb-protocol/0.11.1 \
    crate://crates.io/x11rb/0.11.1 \
    crate://crates.io/x11rb/0.9.0 \
    crate://crates.io/xcursor/0.3.4 \
    crate://crates.io/xml-rs/0.8.16 \
    crate://crates.io/yazi/0.1.6 \
    crate://crates.io/zeno/0.2.2 \
    crate://crates.io/zune-inflate/0.2.54 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "tour"
HOMEPAGE = "https://github.com/Dhruvesh08/iced-tour"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include tour-${PV}.inc
include tour.inc
