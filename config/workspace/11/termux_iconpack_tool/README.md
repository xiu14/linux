# Termux 黏土图标包自动打包工具

这个工具会把一张图片加入图标包模板，并自动生成可安装 APK。

它会自动做这些事：

- 把图片裁剪并缩放成 `216x216` PNG
- 写入 `res/drawable-nodpi/`
- 更新 `assets/drawable.xml` 和 `res/xml/drawable.xml`
- 更新 `assets/appfilter.xml` 和 `res/xml/appfilter.xml`
- 自动更新 `versionCode`
- 使用同一个签名文件打包签名，方便覆盖安装

## 1. 安装 Termux 依赖

在 Termux 里执行：

```bash
pkg update
pkg install openjdk-17 python apktool apksigner zipalign
pkg install python-pillow
```

如果 `python-pillow` 装不上，可以尝试：

```bash
python -m pip install pillow
```

## 2. 放置工具目录

把整个 `termux_iconpack_tool` 文件夹放到手机 Termux 能访问的位置。

推荐放到 Termux 家目录，例如：

```bash
~/termux_iconpack_tool
```

首次使用前进入目录：

```bash
cd ~/termux_iconpack_tool
chmod +x add_icon.sh menu.sh
mkdir -p input output
```

## 3. 最简单用法：固定文件夹 + 菜单

把图片放到手机这个文件夹：

```text
/storage/downloads/1111
```

如果这个路径在你的手机上不存在，脚本也会自动尝试这些常见路径：

```text
/storage/emulated/0/Download/1111
/sdcard/Download/1111
~/storage/downloads/1111
```

然后在 Termux 里运行固定命令：

```bash
./menu.sh
```

脚本会：

1. 列出 `1111` 文件夹里的图片
2. 让你选择图片
3. 让你输入图标资源名，可直接回车
4. 让你输入包名或完整组件
5. 自动打包签名
6. 把生成的 APK 复制回 `1111` 文件夹
7. 自动打开安装界面

目标 App 可以输入包名，例如：

```text
com.android.chrome
```

脚本会尝试自动解析启动 Activity。

如果你已经查到了完整组件，也可以直接输入：

```text
com.android.chrome/com.google.android.apps.chrome.Main
```

## 4. 命令行用法：添加一张图标

把图片放进 `input/`，然后运行：

```bash
./add_icon.sh input/chrome.png chrome "com.android.chrome/com.google.android.apps.chrome.Main"
```

参数说明：

- `input/chrome.png`：你的图片路径
- `--name chrome`：图标资源名，只能用小写字母、数字、下划线
- `"com.android.chrome/com.google.android.apps.chrome.Main"`：目标 App 的包名/Activity

注意：`--name` 是可选的。如果不写，会从图片文件名自动生成资源名。

所以也可以这样：

```bash
./add_icon.sh input/chrome.png "com.android.chrome/com.google.android.apps.chrome.Main"
```

## 5. 王者荣耀例子

```bash
./add_icon.sh input/5v5.png --name custom_5v5 "com.tencent.tmgp.sgame/com.tencent.tmgp.sgame.SGameActivity"
```

如果你的 shell 不喜欢这种参数顺序，也可以把 `--name` 放前面：

```bash
./add_icon.sh --name custom_5v5 input/5v5.png "com.tencent.tmgp.sgame/com.tencent.tmgp.sgame.SGameActivity"
```

## 6. 给一个图标绑定多个 Activity

有些 App 的桌面图标和任务小窗用的 Activity 不一样，可以一次写多个：

```bash
./add_icon.sh --name qq_alt input/qq.png \
  "com.tencent.mobileqq/com.tencent.mobileqq.activity.SplashActivity" \
  "com.tencent.mobileqq/com.tencent.mobileqq.activity.Alias6SplashActivity"
```

## 7. 输出 APK 在哪里

生成的 APK 会在：

```bash
output/
```

文件名类似：

```text
iconpack_chrome_1778239000_signed.apk
```

在 Termux 里可以直接打开安装：

```bash
termux-open output/iconpack_chrome_1778239000_signed.apk
```

使用 `menu.sh` 时，生成的 APK 还会额外复制到 `1111` 图片文件夹。

## 8. 怎么查 App 包名和 Activity

如果手机有 adb，可以在电脑上查：

```bash
adb shell pm list packages | grep chrome
adb shell cmd package resolve-activity --brief -a android.intent.action.MAIN -c android.intent.category.LAUNCHER -p com.android.chrome
```

也可以在手机上安装能查看 Activity 的应用，例如 Activity Launcher、App Manager 等。

格式通常是：

```text
包名/完整Activity名
```

例如：

```text
com.android.chrome/com.google.android.apps.chrome.Main
```

## 9. 重要提醒

- 不要删除 `signing/custom_iconpack.keystore`。
- 以后覆盖安装都依赖这个签名文件。
- 如果签名文件丢了，新 APK 就不能覆盖旧 APK，只能先卸载旧版再安装。
- 这个工具不会静默安装 APK，安装时还是需要你手动确认。
- 如果系统提示不能覆盖安装，先确认你装的是不是同一个签名生成的版本。

## 10. 当前模板已包含

- 王者荣耀 `custom_5v5`
- Chrome `chrome`
- 去重后的图标列表
- 未适配 App 不再被放大/套壳
