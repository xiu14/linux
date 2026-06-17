# QQ Bot 管理面板使用说明

## 📂 项目结构

```
cove/
├── qqbot/                  # Bot 主程序
│   ├── qqbot.py           # (已修改) 支持从 config.json 加载配置
│   ├── config.json        # (首次运行后生成) 配置文件
│   └── ...
│
└── qqbot-admin/            # [NEW] Web 管理面板
    ├── app.py              # Flask 后端
    ├── templates/index.html
    ├── static/style.css
    ├── static/script.js
    ├── Dockerfile
    ├── docker-compose.yml
    └── requirements.txt
```

---

## 🚀 部署步骤

### 1. 上传文件到 VPS

将 `qqbot-admin/` 文件夹上传到 VPS，与 `qqbot/` 同级：

```bash
# 示例目录结构
/root/cove/
├── qqbot/
└── qqbot-admin/
```

### 2. 创建 Docker 网络 (如果不存在)

```bash
# 查看现有网络
docker network ls

# 如果 qqbot 使用默认网络，可能叫 qqbot_default 或 cove_default
# 如需创建共享网络:
docker network create qqbot-network
```

### 3. 修改 docker-compose.yml 网络名 (如需要)

编辑 `qqbot-admin/docker-compose.yml`，确保网络名与 qqbot 容器所在网络一致：

```yaml
networks:
  qqbot-network:
    external: true
    name: qqbot_default  # 改成你的实际网络名
```

### 4. 构建并启动管理面板

```bash
cd /root/cove/qqbot-admin
docker-compose up -d --build
```

### 5. 访问管理面板

浏览器打开: `http://你的VPS_IP:9090`

登录信息:
- 用户名: `xiu`
- 密码: `960718`

---

## 🔧 功能说明

### 配置管理
- 修改 AI API 配置 (DeepSeek / Gemini)
- 修改管理员 QQ
- 修改人设内容
- 开关主动聊天功能

### 账号管理
- 添加/删除 TTS 语音账号
- 添加/删除 Gmail 邮箱

### 控制功能
- **重启 Bot**: 保存配置后点击重启，使新配置生效
- **清空记忆**: 清除聊天记录

---

## ⚠️ 注意事项

1. **修改配置后需要重启 Bot**
   - 点击「保存所有配置」后，再点击「重启 Bot」使配置生效

2. **首次使用**
   - 首次访问管理面板会自动创建 `config.json`
   - Bot 下次启动时会自动读取此配置

3. **安全建议**
   - 建议使用 Nginx 反向代理 + HTTPS
   - 或者限制只有特定 IP 可访问 9090 端口

---

## 🐛 常见问题

### Q: 重启 Bot 失败
A: 检查管理面板容器是否正确挂载了 Docker Socket:
```bash
docker exec qqbot-admin docker ps
```

### Q: 配置没有生效
A: 确保:
1. 配置已保存 (看到成功提示)
2. 已点击重启 Bot
3. 检查 `qqbot/config.json` 是否存在且内容正确

### Q: 无法访问管理面板
A: 检查:
1. 容器是否运行: `docker ps`
2. 端口是否开放: `firewall-cmd --list-ports` 或 `ufw status`
3. 日志: `docker logs qqbot-admin`
