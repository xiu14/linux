# R2 Video Player

一个适合手机播放的轻量视频播放器，前端提供视频列表、缩略图、目录浏览以及前进/后退 10 秒控制；后端负责使用 AList API 鉴权、列目录并代理视频流，避免把密钥暴露到浏览器。

## 功能

- 手机优先的单页播放器
- 视频列表与目录切换
- 支持 AList 鉴权访问私有目录
- 视频缩略图显示，缺失时自动回退占位图
- 快进 10 秒、后退 10 秒
- Docker 部署

## 快速开始

1. 安装依赖：

   ```bash
   npm install
   ```

2. 复制环境变量文件：

   ```bash
   cp .env.example .env
   ```

3. 编辑 `.env`，至少填这些：

   ```env
   PORT=3210
   ALIST_BASE_URL=http://104.168.74.151:5244
   ALIST_TOKEN=你的alist-token
   ALIST_ROOT_PATH=/你的视频目录
   STREAM_MODE=proxy
   ```

   如果你没有 token，也可以使用：

   ```env
   ALIST_USERNAME=你的用户名
   ALIST_PASSWORD=你的密码
   ```

4. 本地运行：

   ```bash
   npm start
   ```

5. 浏览器打开：

   ```text
   http://你的VPSIP:3210
   ```

## Docker 运行

```bash
docker compose up -d --build
```

## 建议配置

- `STREAM_MODE=proxy`
  兼容性最高，拖动进度和手机播放更稳，但视频流量会经过 VPS。

- `STREAM_MODE=redirect`
  VPS 压力更小，但要求 AList 返回的直链能被浏览器直接访问。

## AList Token 获取

登录 AList 后，浏览器开发者工具里请求头的 `Authorization` 就是 token。AList 官方 API 文档也支持通过 `/api/auth/login` 获取临时 token。

## 说明

- 当前仅展示常见视频扩展名文件。
- 如果目录是私有的，播放器必须配置 token 或账号密码，否则列表会返回 `Guest user is disabled, login please`。
