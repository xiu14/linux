# Memos Bot - Google Docs 管理工具

一个 Telegram Bot，用于管理 Google 文档内容。

## 功能

- 📖 **读取文档**: 读取 Google 文档内容
- ➕ **追加内容**: 追加文本到文档末尾
- 🗑️ **清空文档**: 清空文档所有内容
- ⚡ **快速追加**: 直接发送消息自动追加到默认文档

## 快速开始

### 1. 创建 Google 服务账号

1. 访问 [Google Cloud Console](https://console.cloud.google.com/)
2. 创建或选择项目
3. 启用 **Google Docs API** 和 **Google Drive API**
4. 创建服务账号:
   - 导航到 `IAM & Admin` > `Service Accounts`
   - 点击 `Create Service Account`
   - 填写名称，完成创建
5. 创建密钥:
   - 点击服务账号 > `Keys` > `Add Key` > `Create new key`
   - 选择 JSON 格式
   - 下载并重命名为 `credentials.json`

### 2. 共享文档给服务账号

1. 打开你的 Google 文档
2. 点击右上角的 **共享** 按钮
3. 输入服务账号的邮箱地址 (格式: `xxx@project-id.iam.gserviceaccount.com`)
4. 设置权限为 **编辑者**

### 3. 配置环境变量

复制 `.env.example` 为 `.env` 并填写:

```bash
cp .env.example .env
```

编辑 `.env`:
```
BOT_TOKEN=your_telegram_bot_token
ADMIN_ID=your_telegram_id
DEFAULT_DOC_ID=your_google_doc_id
```

### 4. 放置凭证文件

将下载的 `credentials.json` 放到项目根目录。

### 5. 启动 Bot

```bash
docker compose up -d --build
```

## 命令列表

| 命令 | 说明 |
|------|------|
| `/start` | 显示帮助信息 |
| `/read <文档ID>` | 读取文档内容 |
| `/append <内容>` | 追加内容到默认文档 |
| `/append <文档ID> <内容>` | 追加内容到指定文档 |
| `/clear <文档ID>` | 清空文档内容 |
| `/title <文档ID>` | 获取文档标题 |
| `/setdoc <文档ID>` | 设置默认文档 |

## 提示

- 文档 ID 可以从 URL 获取: `https://docs.google.com/document/d/{文档ID}/edit`
- 设置默认文档后，直接发送消息会自动追加到该文档
