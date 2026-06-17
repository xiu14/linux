# SMAPI APK 工作目录

这是后续 APK 修改和构建的正式入口。AI 进入这个目录后，应以这里的基底、smali 源、签名文件、构建脚本和 M10 依赖包为准。

## 当前基线

- 基底 APK：`base/SMAPI-CN-v8.7-base.apk`
- smali 源：`active-v8.7/smali_classes2/`
- 签名文件：`signing/debug.keystore`
- 构建脚本：`build-smapi-cn.sh`
- APK 输出目录：`output/`
- 已测试成功 APK：`output/SMAPI-CN-v8.9.apk`
- 当前 SMAPI Android 运行依赖包：`../dist/SMAPI-Android-m10.zip`

以后继续改 SMAPI Android 运行依赖时，直接从 `../dist/SMAPI-Android-m10.zip` 作为基线，不再从 m6/m7/m8/m9 改。

## APK 构建方式

构建工具在 `code-server` Docker 容器内。宿主机执行：

```bash
docker exec code-server bash -lc 'cd /config/workspace/stardew-mod-workspace/apk-work && ./build-smapi-cn.sh 8.9'
```

不传版本号时脚本默认生成它内部配置的版本。构建产物在：

```text
output/SMAPI-CN-v*.apk
```

脚本只会重新汇编 `classes2.dex`，再替换进 v8.7 基底 APK 并签名。不要用 `apktool b` 重新编译整包资源；当前资源表用 aapt 重编译会报错。

## APK 修改入口

以后改启动器/APK 功能，默认修改：

```text
active-v8.7/smali_classes2/
```

常用文件：

```text
active-v8.7/smali_classes2/com/libala/smapi/ModManagerHelper.smali
active-v8.7/smali_classes2/com/libala/smapi/LogExportHelper.smali
```

当前 `ModManagerHelper` 的 MOD 管理器是 `AlertDialog` 弹窗样式。每个 MOD 行支持启用/停用、改名、重置名称和删除；删除会先弹确认框，确认后删除该 MOD 文件夹并清理显示名别名记录。

## 不要使用源码构建 APK

`../tools/SMAPILoader/` 只能作为参考代码查看，不要直接用它构建正式测试 APK。

原因：源码构建出来的包与已确认正常的 v8.7 基线不等价，已经确认会引入问题：

- 点击“开始游戏”后闪退。
- 日志导出逻辑变成只导出 `SMAPI-latest.txt`，不是原来的日志包导出。
- 页面和按钮可能退回原版状态，例如“上传日志”重新出现、应用名变回测试版。

如果之后看到 59M 左右、日志导出只生成 `latest.txt`、或页面按钮退回原版，优先判断为误用了源码构建路线。正确路线的包体约 57M。

## SMAPI Android M10

当前有效依赖包：

```text
../dist/SMAPI-Android-m10.zip
```

M10 只替换依赖包里的这个文件：

```text
SMAPI-4.3.2.1/StardewModdingAPI.dll
```

M10 包含的功能：

- 修复 Generic Mod Config Menu 下拉框在 Android 上点击/选择异常的问题。
- 对 `GenericModConfigMenu.Framework.Api` 做运行时拦截，集中翻译 mod 配置菜单的名称、说明、分页、段落和下拉显示值。
- 自动读取每个 mod 的 `i18n/default.json` 与中文 i18n，建立英文显示文本到中文显示文本的映射。
- 内置补词覆盖当前测试包里的 GMCM 漏词，包括 Chests Anywhere、Alternative Textures、Grandpa's Farm、Frontier Farm、NPC Map Locations、The Muttering Farmer、Peachyogurt Sprites 等。
- 漏翻英文会写入 `gmcm-missing-translations.tsv`，并同步写入 `ErrorLogs/gmcm-missing-translations.tsv`，所以导出日志包即可继续补词。

M10 校验：

```text
SMAPI-Android-m10.zip SHA-256:
2e704f7881e47af77f64c6c4fa09ac32de3b3634888687934ac2fa3258029481

StardewModdingAPI.dll SHA-256:
c38109bc801948cd97cade00788faa4b47978f9e875acfa5f157d43c856f96e8
```

## 继续修改 M10

源码入口：

```text
../tools/SMAPI-Android-1.6/src/SMAPI/Mobile/Mods/GenericConfigMenuModFix.cs
```

编译 DLL 使用 code-server 容器内的 `.dotnet9`：

```bash
docker exec code-server bash -lc 'export DOTNET_ROOT=/config/workspace/.dotnet9; export PATH=/config/workspace/.dotnet9:$PATH; cd /config/workspace/stardew-mod-workspace/tools/SMAPI-Android-1.6/src; dotnet build SMAPI/SMAPI.csproj -c "Android Release" -p:Platform=ARM64 -p:AndroidSdkDirectory=/opt/android-sdk -p:JavaSdkDirectory=/usr/lib/jvm/java-17-openjdk-amd64 -p:GamePath=/config/workspace/stardew-mod-workspace/GameRefs --no-restore'
```

这个构建在 Linux 下可能最后停在项目的 post-build 步骤并返回非 0。只要没有 C# 编译错误，并且下面的 DLL 更新时间已变化，就可以继续打包：

```text
../tools/SMAPI-Android-1.6/src/SMAPI/bin/ARM64/Android Release/StardewModdingAPI.dll
```

打下一版时，从 M10 复制出新包并替换 DLL，例如：

```bash
cp ../dist/SMAPI-Android-m10.zip ../dist/SMAPI-Android-m11.zip
# 然后把新 StardewModdingAPI.dll 更新进 zip 内的 SMAPI-4.3.2.1/StardewModdingAPI.dll
```

## 版本和安装

当前基底的 `versionCode` 是 `1780041495`，`versionName` 是 `1.1.7`。如果未来需要安装包版本高于当前已装版本，再单独处理 `AndroidManifest.xml` 的 `versionCode`；不要为了改版本号而重编译整包资源。

## 清理状态

旧的 SMAPI Android 测试包 m6/m7/m8/m9 已清理，只保留当前可继续迭代的：

```text
../dist/SMAPI-Android-m10.zip
```

保留 `../dist/reverse-test/SMAPI-CN-v8.7.apk` 作为已确认可运行的外部发布件；`base/SMAPI-CN-v8.7-base.apk` 是构建基底，不要删除。
