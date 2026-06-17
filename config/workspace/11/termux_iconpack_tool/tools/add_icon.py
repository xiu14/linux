#!/usr/bin/env python3
import argparse
import os
import re
import shutil
import subprocess
import sys
import time
import xml.etree.ElementTree as ET
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
TEMPLATE = ROOT / "template"
OUTPUT = ROOT / "output"
KEYSTORE = ROOT / "signing" / "custom_iconpack.keystore"
STORE_PASS = "android"
KEY_ALIAS = "custom_iconpack"
ICON_SIZE = 216


def die(message: str) -> None:
    print(f"错误：{message}", file=sys.stderr)
    sys.exit(1)


def run(cmd: list[str], cwd: Path | None = None) -> None:
    print("+ " + " ".join(cmd))
    try:
        subprocess.run(cmd, cwd=cwd, check=True)
    except FileNotFoundError:
        die(f"找不到命令：{cmd[0]}。请先安装依赖。")
    except subprocess.CalledProcessError as exc:
        die(f"命令执行失败，退出码 {exc.returncode}：{' '.join(cmd)}")


def require_tools() -> None:
    missing = [tool for tool in ["apktool", "zipalign", "apksigner"] if shutil.which(tool) is None]
    if missing:
        die("缺少依赖：" + ", ".join(missing) + "\nTermux 可先执行：pkg install openjdk-17 python apktool apksigner zipalign")
    try:
        import PIL  # noqa: F401
    except Exception:
        die("缺少 Pillow 图片库。Termux 可先执行：pkg install python-pillow，或者 python -m pip install pillow")


def normalize_name(raw: str) -> str:
    name = Path(raw).stem.lower()
    name = re.sub(r"[^a-z0-9_]+", "_", name).strip("_")
    if not name:
        die("图标资源名为空，请用 --name 指定，例如 --name chrome")
    if not re.match(r"^[a-z][a-z0-9_]*$", name):
        name = "icon_" + name
    if not re.match(r"^[a-z][a-z0-9_]*$", name):
        die(f"非法资源名：{name}。只能用小写字母、数字、下划线，并且以字母开头。")
    return name


def normalize_component(raw: str) -> str:
    value = raw.strip()
    if not value:
        die("component 不能为空")
    if value.startswith("ComponentInfo{") and value.endswith("}"):
        return value
    if value.startswith(":"):
        return value
    if "/" not in value:
        die(f"component 格式不对：{raw}\n请使用 包名/Activity，例如 com.android.chrome/com.google.android.apps.chrome.Main")
    package, activity = value.split("/", 1)
    if activity.startswith("."):
        activity = package + activity
    return f"ComponentInfo{{{package}/{activity}}}"


def process_image(image_path: Path, resource_name: str) -> None:
    from PIL import Image

    if not image_path.exists():
        die(f"图片不存在：{image_path}")
    try:
        image = Image.open(image_path)
    except Exception as exc:
        die(f"无法读取图片：{image_path}，{exc}")

    has_alpha = image.mode in ("RGBA", "LA") or ("transparency" in image.info)
    image = image.convert("RGBA" if has_alpha else "RGB")
    width, height = image.size
    side = min(width, height)
    left = (width - side) // 2
    top = (height - side) // 2
    image = image.crop((left, top, left + side, top + side))
    image = image.resize((ICON_SIZE, ICON_SIZE), Image.Resampling.LANCZOS)

    target = TEMPLATE / "res" / "drawable-nodpi" / f"{resource_name}.png"
    target.parent.mkdir(parents=True, exist_ok=True)
    image.save(target, format="PNG", optimize=True)
    print(f"已写入图标资源：{target.relative_to(ROOT)}")


def add_to_drawable_xml(resource_name: str) -> None:
    for rel in ["assets/drawable.xml", "res/xml/drawable.xml"]:
        path = TEMPLATE / rel
        tree = ET.parse(path)
        root = tree.getroot()

        for child in list(root):
            if child.tag == "item" and child.attrib.get("drawable") == resource_name:
                root.remove(child)

        children = list(root)
        insert_at = 0
        for idx, child in enumerate(children):
            if child.tag == "category" and child.attrib.get("title", "").lower() == "new":
                insert_at = idx + 1
                break
        item = ET.Element("item", {"drawable": resource_name})
        root.insert(insert_at, item)

        ET.indent(tree, space="    ")
        tree.write(path, encoding="utf-8", xml_declaration=True)
        print(f"已更新图标列表：{rel}")


def add_to_appfilter_xml(resource_name: str, components: list[str]) -> None:
    for rel in ["assets/appfilter.xml", "res/xml/appfilter.xml"]:
        path = TEMPLATE / rel
        tree = ET.parse(path)
        root = tree.getroot()

        existing = {
            child.attrib.get("component"): child
            for child in root.findall("item")
            if child.attrib.get("component")
        }

        for component in components:
            if component in existing:
                existing[component].set("drawable", resource_name)
            else:
                root.append(ET.Element("item", {"component": component, "drawable": resource_name}))

        ET.indent(tree, space="    ")
        tree.write(path, encoding="utf-8", xml_declaration=True)
        print(f"已更新映射：{rel}")


def update_version_code() -> int:
    version_code = int(time.time())
    if version_code > 2_000_000_000:
        version_code = version_code % 2_000_000_000

    yml = TEMPLATE / "apktool.yml"
    text = yml.read_text(encoding="utf-8")
    text = re.sub(r"versionCode: '?\d+'?", f"versionCode: '{version_code}'", text)
    yml.write_text(text, encoding="utf-8")
    print(f"已更新 versionCode：{version_code}")
    return version_code


def build_apk(resource_name: str, version_code: int) -> Path:
    OUTPUT.mkdir(parents=True, exist_ok=True)
    unsigned = OUTPUT / f"iconpack_{resource_name}_{version_code}_unsigned.apk"
    aligned = OUTPUT / f"iconpack_{resource_name}_{version_code}_aligned.apk"
    signed = OUTPUT / f"iconpack_{resource_name}_{version_code}_signed.apk"

    for path in [unsigned, aligned, signed, signed.with_suffix(signed.suffix + ".idsig")]:
        if path.exists():
            path.unlink()

    run(["apktool", "b", "--use-aapt2", str(TEMPLATE), "-o", str(unsigned)])
    run(["zipalign", "-f", "-p", "4", str(unsigned), str(aligned)])
    run([
        "apksigner",
        "sign",
        "--ks",
        str(KEYSTORE),
        "--ks-pass",
        f"pass:{STORE_PASS}",
        "--key-pass",
        f"pass:{STORE_PASS}",
        "--ks-key-alias",
        KEY_ALIAS,
        "--out",
        str(signed),
        str(aligned),
    ])
    run(["apksigner", "verify", "--verbose", str(signed)])

    if unsigned.exists():
        unsigned.unlink()
    if aligned.exists():
        aligned.unlink()
    idsig = signed.with_suffix(signed.suffix + ".idsig")
    if idsig.exists():
        idsig.unlink()

    return signed


def main() -> None:
    parser = argparse.ArgumentParser(
        description="把一张图片加入黏土图标包模板，并自动打包签名 APK。"
    )
    parser.add_argument("image", help="图片路径，例如 input/chrome.png")
    parser.add_argument("component", nargs="+", help="目标组件，例如 com.android.chrome/com.google.android.apps.chrome.Main。可写多个。也兼容：图片 资源名 组件。")
    parser.add_argument("--name", help="资源名，例如 chrome。默认从图片文件名生成。")
    parser.add_argument("--no-build", action="store_true", help="只处理图片和 XML，不编译 APK。")
    args = parser.parse_args()

    require_tools()
    if not TEMPLATE.exists():
        die(f"模板目录不存在：{TEMPLATE}")
    if not KEYSTORE.exists():
        die(f"签名文件不存在：{KEYSTORE}")

    image_path = Path(args.image)
    if not image_path.is_absolute():
        image_path = (Path.cwd() / image_path).resolve()
    component_values = list(args.component)
    resource_hint = args.name
    if resource_hint is None and len(component_values) >= 2:
        first = component_values[0]
        if "/" not in first and not first.startswith("ComponentInfo{") and not first.startswith(":"):
            resource_hint = first
            component_values = component_values[1:]

    resource_name = normalize_name(resource_hint or image_path.name)
    components = [normalize_component(value) for value in component_values]

    process_image(image_path, resource_name)
    add_to_drawable_xml(resource_name)
    add_to_appfilter_xml(resource_name, components)
    version_code = update_version_code()

    if args.no_build:
        print("已完成资源更新，按 --no-build 跳过编译。")
        return

    apk = build_apk(resource_name, version_code)
    print()
    print(f"完成：{apk}")
    print("在 Termux 中可运行：")
    print(f"termux-open {apk}")


if __name__ == "__main__":
    main()
