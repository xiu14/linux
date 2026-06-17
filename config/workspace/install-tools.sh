#!/usr/bin/env bash
set -Eeuo pipefail

# Rebuild the disposable parts of this Docker dev environment.
# Safe to run more than once after a container restart/recreate.

APT_PACKAGES=(
  apt-utils
  ca-certificates
  curl
  git
  gnupg
  jq
  ripgrep
  build-essential
  make
  gcc
  g++
  python3
  python3-pip
  python3-pil
  openjdk-17-jdk
  ffmpeg
  apktool
  apksigner
  aapt
  zipalign
  libsmali-java
  xvfb
  net-tools
  netcat-openbsd
  openssh-client
  procps
  nano
  unzip
  tar
  gzip
  zip
  p7zip-full
  unrar
  less
  binutils
  openssl
  fonts-noto-color-emoji
  fonts-wqy-zenhei
)

NVM_DIR="${NVM_DIR:-/config/.nvm}"
NODE_VERSION="${NODE_VERSION:-24.14.1}"
NVM_INSTALL_VERSION="${NVM_INSTALL_VERSION:-v0.40.3}"
WORKSPACE_DIR="${WORKSPACE_DIR:-/config/workspace}"
DOTNET_INSTALL_SCRIPT="${DOTNET_INSTALL_SCRIPT:-$WORKSPACE_DIR/tools/dotnet-install.sh}"
DOTNET_SDKS=(
  "6.0:$WORKSPACE_DIR/.dotnet"
  "8.0:$WORKSPACE_DIR/.dotnet8"
  "9.0:$WORKSPACE_DIR/.dotnet9"
  "10.0:$WORKSPACE_DIR/.dotnet10"
)

run_root() {
  if [ "$(id -u)" -eq 0 ]; then
    "$@"
  elif command -v sudo >/dev/null 2>&1; then
    sudo "$@"
  else
    echo "Need root privileges for: $*" >&2
    echo "Run this script as root or install sudo first." >&2
    exit 1
  fi
}

section() {
  printf '\n==> %s\n' "$1"
}

section "安装 apt 工具"
run_root apt-get update
run_root env DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends "${APT_PACKAGES[@]}"

section "准备 nvm 和 Node.js"
mkdir -p "$NVM_DIR"

if [ ! -s "$NVM_DIR/nvm.sh" ]; then
  curl -fsSL "https://raw.githubusercontent.com/nvm-sh/nvm/${NVM_INSTALL_VERSION}/install.sh" | PROFILE=/dev/null NVM_DIR="$NVM_DIR" bash
fi

# shellcheck disable=SC1091
. "$NVM_DIR/nvm.sh"

if ! nvm ls "$NODE_VERSION" >/dev/null 2>&1; then
  nvm install "$NODE_VERSION"
fi

nvm alias default "$NODE_VERSION" >/dev/null
nvm use "$NODE_VERSION" >/dev/null
corepack enable || true

section "安装全局 npm 工具"
npm install -g npm@11.11.0 pnpm@10.33.0

section "安装 .NET SDK"
if [ ! -f "$DOTNET_INSTALL_SCRIPT" ]; then
  mkdir -p "$(dirname "$DOTNET_INSTALL_SCRIPT")"
  curl -fsSL https://dot.net/v1/dotnet-install.sh -o "$DOTNET_INSTALL_SCRIPT"
  chmod +x "$DOTNET_INSTALL_SCRIPT"
fi

for sdk in "${DOTNET_SDKS[@]}"; do
  channel="${sdk%%:*}"
  install_dir="${sdk#*:}"
  mkdir -p "$install_dir"
  if [ ! -x "$install_dir/dotnet" ]; then
    bash "$DOTNET_INSTALL_SCRIPT" --channel "$channel" --install-dir "$install_dir"
  elif ! "$install_dir/dotnet" --list-sdks 2>/dev/null | grep -q "^$channel"; then
    bash "$DOTNET_INSTALL_SCRIPT" --channel "$channel" --install-dir "$install_dir"
  fi
done

section "写入 PATH 辅助脚本"
mkdir -p /config/.local/bin
PROFILE_SNIPPET=/config/.tool-env.sh
cat > "$PROFILE_SNIPPET" <<EOF
export NVM_DIR="$NVM_DIR"
[ -s "\$NVM_DIR/nvm.sh" ] && . "\$NVM_DIR/nvm.sh"
export DOTNET_ROOT="$WORKSPACE_DIR/.dotnet"
export PATH="$WORKSPACE_DIR/.dotnet:$WORKSPACE_DIR/.dotnet8:$WORKSPACE_DIR/.dotnet9:$WORKSPACE_DIR/.dotnet10:/config/.local/bin:\$PATH"
EOF

if [ -f /config/.bashrc ] && ! grep -Fq '/config/.tool-env.sh' /config/.bashrc; then
  printf '\n[ -f /config/.tool-env.sh ] && . /config/.tool-env.sh\n' >> /config/.bashrc
fi

section "验证安装结果"
# 让本次脚本里的验证也能找到 nvm 安装的 node/npm/pnpm。
# shellcheck disable=SC1091
[ -f /config/.tool-env.sh ] && . /config/.tool-env.sh

check_version() {
  cmd="$1"
  label="$2"
  version_args="$3"

  if ! command -v "$cmd" >/dev/null 2>&1; then
    printf '%-12s %s\n' "$label" "未找到"
    return
  fi

  # 有些 Android/APK 工具没有标准版本参数，这类工具只要能找到命令就算已安装。
  if [ -z "$version_args" ]; then
    printf '%-12s 已安装：%s\n' "$label" "$(command -v "$cmd")"
    return
  fi

  # shellcheck disable=SC2086
  version="$($cmd $version_args 2>&1 | head -n 1 || true)"
  if [ -n "$version" ]; then
    printf '%-12s %s\n' "$label" "$version"
  else
    printf '%-12s 已安装：%s\n' "$label" "$(command -v "$cmd")"
  fi
}

check_version git git "--version"
check_version rg rg "--version"
check_version jq jq "--version"
check_version curl curl "--version"
check_version make make "--version"
check_version gcc gcc "--version"
check_version g++ g++ "--version"
check_version python3 python3 "--version"
check_version pip3 pip3 "--version"
check_version node node "--version"
check_version npm npm "--version"
check_version pnpm pnpm "--version"
check_version dotnet dotnet "--version"
show_dotnet_sdks() {
  for item in "dotnet6:$WORKSPACE_DIR/.dotnet/dotnet" "dotnet8:$WORKSPACE_DIR/.dotnet8/dotnet" "dotnet9:$WORKSPACE_DIR/.dotnet9/dotnet" "dotnet10:$WORKSPACE_DIR/.dotnet10/dotnet"; do
    label="${item%%:*}"
    binary="${item#*:}"
    if [ -x "$binary" ]; then
      sdk_list="$($binary --list-sdks 2>/dev/null | paste -sd '; ' -)"
      printf '%-12s %s\n' "$label" "$sdk_list"
    else
      printf '%-12s %s\n' "$label" "未找到"
    fi
  done
}
show_dotnet_sdks
check_version java java "--version"
check_version javac javac "--version"
check_version ffmpeg ffmpeg "-version"
check_version ffprobe ffprobe "-version"
check_version apktool apktool "--version"
check_version apksigner apksigner "--version"
check_version aapt aapt ""
check_version aapt2 aapt2 ""
check_version smali smali "--version"
check_version baksmali baksmali "--version"
check_version zipalign zipalign ""
check_version Xvfb Xvfb ""
check_version ssh ssh "-V"
check_version scp scp ""
check_version unzip unzip "-v"
check_version tar tar "--version"
check_version zip zip "-v"
check_version 7z 7z ""
check_version 7za 7za ""
check_version unrar unrar ""
check_version strings strings "--version"
check_version keytool keytool ""
check_version jarsigner jarsigner ""
check_version openssl openssl "version"
check_version zipinfo zipinfo ""

cat <<'EOF'

完成。

如果上面显示“未找到”，说明这个命令当前环境里不可用，需要单独处理。
如果显示“已安装：路径”，说明命令已经存在，只是它没有标准的版本参数。

如果这是刚重建的容器，建议重新打开终端，或者手动执行：
  source /config/.tool-env.sh

EOF
