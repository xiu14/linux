#!/usr/bin/env bash
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
if command -v python >/dev/null 2>&1; then
  PYTHON_BIN=python
elif command -v python3 >/dev/null 2>&1; then
  PYTHON_BIN=python3
else
  echo "错误：找不到 python。请先安装：pkg install python" >&2
  exit 1
fi

export PYTHONUNBUFFERED=1
"$PYTHON_BIN" "$SCRIPT_DIR/tools/add_icon.py" "$@"
