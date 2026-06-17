# NPC CHAT

一个为 NPC 原始对话框增加独立“聊天”按钮的 SMAPI MOD。打开聊天窗口后，它会通过兼容 OpenAI Chat Completions 的接口生成 NPC 回复；关闭窗口会返回原始对话。

## 远程联系人

- 正常游玩界面的屏幕右侧会显示“聊天”入口，原本与 NPC 当面对话时的按钮仍保留。
- 联系人页支持“最近聊天”和“全部居民”切换，并显示 NPC 头像预览。
- 已认识的 NPC 显示真实头像与名字；未认识居民显示剪影和 `???`，且不能直接聊天。
- 认识判定沿用游戏社交系统：当前存档的 `friendshipData` 已包含该 NPC。
- 从联系人页发起的聊天会标记为远程交流，让角色不会误称玩家正站在面前。

## 记忆与人设

- `assets/npc-profiles.json` 包含原版主要可交流 NPC 的本地人设档案，可继续修改扩展。
- API 请求会带上当前时间、天气、地点、好感度、关系状态与本周送礼情况。
- 对话记忆按存档和 NPC 保存到 MOD 运行目录下的 `data/<save>/<npc>.json`。
- 窗口中的“清除记忆”需要点击两次确认，只清除当前 NPC 的记录。
- 旧聊天超过请求上下文范围后，会通过 API 自动生成摘要；完整原文仍保存在本地文件中。

## 配置

`config.json` 中可以修改接口地址、密钥、模型、按钮文字和超时时间。当前实现会向以下地址发送请求：

```text
{ApiBaseUrl}/chat/completions
```

并读取兼容以下路径的回复：

```text
choices[0].message.content
```

## 构建

在本工作区内执行：

```bash
source ../env.sh
dotnet build -c Release
```

最终安装包应包含 `manifest.json`、`config.json`、`assets/npc-profiles.json` 和编译得到的 `NpcChat.dll`，不要发布 `GameRefs` 或 `SmapiRefs` 中的程序集。
