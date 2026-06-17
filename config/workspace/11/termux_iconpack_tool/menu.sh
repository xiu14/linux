#!/usr/bin/env bash
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

choose_python() {
  if command -v python >/dev/null 2>&1; then
    echo python
  elif command -v python3 >/dev/null 2>&1; then
    echo python3
  else
    echo "错误：找不到 python。请先执行：pkg install python" >&2
    exit 1
  fi
}

find_image_dir() {
  local preferred="${ICONPACK_IMAGE_DIR:-/storage/downloads/1111}"
  local candidates=(
    "$preferred"
    "/storage/emulated/0/Download/1111"
    "/sdcard/Download/1111"
    "/sdcard/downloads/1111"
    "$HOME/storage/downloads/1111"
  )

  for dir in "${candidates[@]}"; do
    if [ -d "$dir" ]; then
      echo "$dir"
      return
    fi
  done

  if mkdir -p "$preferred" 2>/dev/null; then
    echo "$preferred"
    return
  fi

  local fallback="$HOME/storage/downloads/1111"
  mkdir -p "$fallback"
  echo "$fallback"
}

sanitize_default_name() {
  "$PYTHON_BIN" - "$1" <<'PY'
import re
import sys
from pathlib import Path

name = Path(sys.argv[1]).stem.lower()
name = re.sub(r"[^a-z0-9_]+", "_", name).strip("_")
if not name or not re.match(r"^[a-z]", name):
    name = "icon_" + name
print(name or "icon_custom")
PY
}

resolve_component() {
  local package="$1"
  local line
  if ! command -v cmd >/dev/null 2>&1; then
    return 1
  fi

  line="$(cmd package resolve-activity --brief \
    -a android.intent.action.MAIN \
    -c android.intent.category.LAUNCHER \
    -p "$package" 2>/dev/null | tr -d '\r' | grep '/' | tail -n 1 || true)"

  [ -n "$line" ] || return 1
  echo "$line"
}

open_apk() {
  local apk="$1"
  if command -v termux-open >/dev/null 2>&1; then
    termux-open "$apk" || true
  else
    echo "未找到 termux-open，请手动打开安装：$apk"
  fi
}

PYTHON_BIN="$(choose_python)"
export PYTHONUNBUFFERED=1

IMAGE_DIR="$(find_image_dir)"
OUTPUT_DIR="$SCRIPT_DIR/output"
mkdir -p "$IMAGE_DIR" "$OUTPUT_DIR"

echo
echo "图片文件夹：$IMAGE_DIR"
echo "把 PNG/JPG/JPEG/WEBP 图片放进这个文件夹，然后运行本脚本。"
echo

images=()
while IFS= read -r -d '' file; do
  images+=("$file")
done < <(find "$IMAGE_DIR" -maxdepth 1 -type f \( \
  -iname '*.png' -o -iname '*.jpg' -o -iname '*.jpeg' -o -iname '*.webp' \
\) -print0 | sort -z)

if [ "${#images[@]}" -eq 0 ]; then
  echo "没有找到图片。"
  echo "请把图片放到：$IMAGE_DIR"
  exit 1
fi

echo "找到图片："
for i in "${!images[@]}"; do
  printf "  %2d. %s\n" "$((i + 1))" "$(basename "${images[$i]}")"
done
echo

read -r -p "选择图片序号：" choice
if ! [[ "$choice" =~ ^[0-9]+$ ]] || [ "$choice" -lt 1 ] || [ "$choice" -gt "${#images[@]}" ]; then
  echo "序号无效。"
  exit 1
fi

image="${images[$((choice - 1))]}"
default_name="$(sanitize_default_name "$image")"
read -r -p "图标资源名（直接回车用 $default_name）：" resource_name
resource_name="${resource_name:-$default_name}"

echo
echo "输入目标 App："
echo "  - 可以只输入包名，例如：com.android.chrome"
echo "  - 也可以输入完整组件，例如：com.android.chrome/com.google.android.apps.chrome.Main"
read -r -p "包名或完整组件：" target

if [ -z "$target" ]; then
  echo "目标不能为空。"
  exit 1
fi

component="$target"
if [[ "$target" != *"/"* ]] && [[ "$target" != ComponentInfo\{* ]]; then
  echo "正在尝试解析启动 Activity：$target"
  if component="$(resolve_component "$target")"; then
    echo "解析到：$component"
  else
    echo "自动解析失败。"
    read -r -p "请输入完整 Activity，例如 com.xxx/.MainActivity 或 com.xxx/com.xxx.MainActivity：" activity
    if [ -z "$activity" ]; then
      echo "Activity 不能为空。"
      exit 1
    fi
    if [[ "$activity" == *"/"* ]]; then
      component="$activity"
    else
      component="$target/$activity"
    fi
  fi
fi

echo
echo "开始打包..."
"$SCRIPT_DIR/add_icon.sh" --name "$resource_name" "$image" "$component"

latest="$(find "$OUTPUT_DIR" -maxdepth 1 -type f -name '*_signed.apk' -printf '%T@ %p\n' | sort -n | tail -n 1 | cut -d' ' -f2-)"
if [ -z "$latest" ] || [ ! -f "$latest" ]; then
  echo "没有找到生成的 APK。"
  exit 1
fi

dest="$IMAGE_DIR/$(basename "$latest")"
cp -f "$latest" "$dest"

echo
echo "APK 已复制到：$dest"
echo "正在打开安装界面..."
open_apk "$dest"
