#!/usr/bin/env bash
set -euo pipefail

version="${1:-8.8}"
work_root="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

cd "$work_root"

source_smali="${work_root}/active-v8.7/smali_classes2"
base_apk="${work_root}/base/SMAPI-CN-v8.7-base.apk"
keystore="${work_root}/signing/debug.keystore"
build_dir="${work_root}/build/v${version}"
output_dir="${work_root}/output"
unsigned_apk="${build_dir}/SMAPI-CN-v${version}-unsigned.apk"
aligned_apk="${build_dir}/SMAPI-CN-v${version}-aligned.apk"
final_apk="${output_dir}/SMAPI-CN-v${version}.apk"

for tool in smali zip zipalign apksigner aapt; do
    if ! command -v "$tool" >/dev/null 2>&1; then
        echo "Missing required tool: $tool" >&2
        exit 1
    fi
done

rm -rf "$build_dir"
mkdir -p "$build_dir" "$output_dir"

smali assemble "$source_smali" -o "${build_dir}/classes2.dex"

cp "$base_apk" "$unsigned_apk"
zip -q -d "$unsigned_apk" "META-INF/*" classes2.dex || true
(
    cd "$build_dir"
    zip -q -X -0 "SMAPI-CN-v${version}-unsigned.apk" classes2.dex
)

rm -f "$aligned_apk" "$final_apk" "${final_apk}.idsig"
zipalign -p -f 4 "$unsigned_apk" "$aligned_apk"
apksigner sign \
    --ks "$keystore" \
    --ks-key-alias androiddebugkey \
    --ks-pass pass:android \
    --key-pass pass:android \
    --v1-signing-enabled false \
    --v2-signing-enabled false \
    --v3-signing-enabled true \
    --v4-signing-enabled false \
    --out "$final_apk" \
    "$aligned_apk"

zipalign -c -p 4 "$final_apk" >/dev/null
apksigner verify --verbose "$final_apk" >/dev/null
rm -f "$unsigned_apk" "$aligned_apk"

echo "Built: $final_apk"
aapt dump badging "$final_apk" | sed -n '1,3p'
sha256sum "$final_apk" "${build_dir}/classes2.dex"
