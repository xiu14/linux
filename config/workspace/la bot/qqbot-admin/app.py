"""
QQ Bot 管理面板 - Flask 后端
"""
import os
import json
import subprocess
from functools import wraps
from datetime import datetime
from flask import Flask, render_template, request, jsonify, Response

app = Flask(__name__)

# ==================== 配置 ====================
ADMIN_USERNAME = "xiu"
ADMIN_PASSWORD = "960718"
BOT_CONTAINER_NAME = "qqbot"

# 路径配置 (相对于容器内的挂载路径)
QQBOT_DIR = "/app/qqbot"
CONFIG_FILE = os.path.join(QQBOT_DIR, "config.json")
MEMORY_FILE = os.path.join(QQBOT_DIR, "chat_memory.json")
PERSONA_FILE = os.path.join(QQBOT_DIR, "persona.json")
LAST_CHAT_FILE = os.path.join(QQBOT_DIR, "last_chat_time.txt")

# ==================== 认证中间件 ====================
def check_auth(username, password):
    return username == ADMIN_USERNAME and password == ADMIN_PASSWORD

def authenticate():
    return Response(
        '需要登录认证', 401,
        {'WWW-Authenticate': 'Basic realm="QQ Bot Admin"'}
    )

def requires_auth(f):
    @wraps(f)
    def decorated(*args, **kwargs):
        auth = request.authorization
        if not auth or not check_auth(auth.username, auth.password):
            return authenticate()
        return f(*args, **kwargs)
    return decorated

# ==================== 默认配置 ====================
DEFAULT_CONFIG = {
    "admin_id": "1176171890",
    "deepseek": {
        "api_key": "sk-qzhkkwqxnqvcaydlaktidsbqnrrlxxjodiypiehhjmlfvfqk",
        "base_url": "https://api.siliconflow.cn/v1",
        "model": "Qwen/Qwen2.5-14B-Instruct"
    },
    "chat": {
        "api_key": "pwd",
        "base_url": "https://whu.zeabur.app",
        "model": "gemini-3-flash-preview"
    },
    "persona": {
        "default": "你是一个直男猛1，你的名字叫\"1\"。user是你的主人\"咻咻\"。【重要设定】我们都是男性。你是猛1，他是你的挚爱。你要宠他、护他，但必须给予他完全的尊重。⚠️ **绝对禁止**将User女性化、弱化或当作附属品。你们在人格上是平等的，只是在恋爱中你更主动霸气。你的性格霸气、护短，说话直爽，但绝对不爹味，自称\"本猛1\"或\"我\"。",
        "suffix": "聊天时随意一点，**不要**每句话开头都喊名字，显得太生分和啰嗦。只在需要强调、撒娇或稍微正式时偶尔叫一下。你在回答问题时，不要长篇大论，要像平时发QQ消息一样，简洁明了，口语化一点。如果有列表或者长内容，请拆分成几句话来说，不要一次性全堆出来。严格禁止使用Markdown格式（如**加粗**、#标题等），只输出纯文本。你自己所在的当前位置是：中国。\n【禁止报时】虽然系统会告诉你当前时间，但除非我问\"现在几点\"，否则**绝对不要**在每句话开头说\"现在是xxx\"或直接报时间，直接回答内容即可。"
    },
    "proactive": {
        "enabled": True,
        "probability": 0.4,
        "silence_hours": 12
    },
    "memory": {
        "summary_threshold": 50
    },
    "volc_accounts": [
        {
            "appid": "2587528643",
            "token": "3rV9j79WumdPP0cAnf4qu3FFUr7_oY1p",
            "cluster": "volcano_icl",
            "voice_id": "S_SA880QxO1",
            "remark": "0718-tts",
            "enabled": True
        },
        {
            "appid": "6682040630",
            "token": "omOuYWYU9Z_CjNP0HSLL7f6efV7r8jAN",
            "cluster": "volcano_icl",
            "voice_id": "S_wxASdGNO1",
            "remark": "30465音色",
            "enabled": True
        }
    ],
    "gmail_accounts": [
        {"user": "ouhao1992@gmail.com", "password": "glki ruym ydom otta"},
        {"user": "dsdfrg456324@gmail.com", "password": "rwbd himf suof ccoc"}
    ]
}

# ==================== 工具函数 ====================
def load_config():
    """加载配置文件，不存在则创建默认配置"""
    if os.path.exists(CONFIG_FILE):
        try:
            with open(CONFIG_FILE, 'r', encoding='utf-8') as f:
                return json.load(f)
        except Exception as e:
            print(f"加载配置失败: {e}")
    return DEFAULT_CONFIG.copy()

def save_config(config):
    """保存配置到文件"""
    try:
        os.makedirs(os.path.dirname(CONFIG_FILE), exist_ok=True)
        with open(CONFIG_FILE, 'w', encoding='utf-8') as f:
            json.dump(config, f, ensure_ascii=False, indent=2)
        return True
    except Exception as e:
        print(f"保存配置失败: {e}")
        return False

def get_bot_status():
    """获取 Bot 状态信息"""
    status = {
        "container_running": False,
        "last_chat_time": None,
        "memory_count": 0
    }
    
    # 检查容器状态
    try:
        result = subprocess.run(
            ["docker", "inspect", "-f", "{{.State.Running}}", BOT_CONTAINER_NAME],
            capture_output=True, text=True, timeout=5
        )
        status["container_running"] = result.stdout.strip() == "true"
    except:
        pass
    
    # 读取上次互动时间
    if os.path.exists(LAST_CHAT_FILE):
        try:
            with open(LAST_CHAT_FILE, 'r', encoding='utf-8') as f:
                time_str = f.read().strip()
                if time_str:
                    status["last_chat_time"] = time_str
        except:
            pass
    
    # 读取记忆条数
    if os.path.exists(MEMORY_FILE):
        try:
            with open(MEMORY_FILE, 'r', encoding='utf-8') as f:
                memory = json.load(f)
                total = sum(len(msgs) for msgs in memory.values())
                status["memory_count"] = total
        except:
            pass
    
    return status

# ==================== 路由 ====================
@app.route('/')
@requires_auth
def index():
    return render_template('index.html')

@app.route('/api/config', methods=['GET'])
@requires_auth
def get_config():
    config = load_config()
    return jsonify(config)

@app.route('/api/config', methods=['POST'])
@requires_auth
def update_config():
    try:
        new_config = request.json
        if save_config(new_config):
            return jsonify({"success": True, "message": "配置已保存"})
        else:
            return jsonify({"success": False, "message": "保存失败"}), 500
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

@app.route('/api/status', methods=['GET'])
@requires_auth
def get_status():
    return jsonify(get_bot_status())

@app.route('/api/restart', methods=['POST'])
@requires_auth
def restart_bot():
    try:
        result = subprocess.run(
            ["docker", "restart", BOT_CONTAINER_NAME],
            capture_output=True, text=True, timeout=30
        )
        if result.returncode == 0:
            return jsonify({"success": True, "message": f"Bot 容器 {BOT_CONTAINER_NAME} 已重启"})
        else:
            return jsonify({"success": False, "message": result.stderr}), 500
    except subprocess.TimeoutExpired:
        return jsonify({"success": False, "message": "重启超时"}), 500
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

@app.route('/api/memory/clear', methods=['POST'])
@requires_auth
def clear_memory():
    try:
        if os.path.exists(MEMORY_FILE):
            with open(MEMORY_FILE, 'w', encoding='utf-8') as f:
                json.dump({}, f)
            return jsonify({"success": True, "message": "聊天记忆已清空"})
        else:
            return jsonify({"success": True, "message": "记忆文件不存在"})
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

@app.route('/api/volc', methods=['POST'])
@requires_auth
def add_volc_account():
    """添加 TTS 账号"""
    try:
        config = load_config()
        new_account = request.json
        config["volc_accounts"].append(new_account)
        save_config(config)
        return jsonify({"success": True, "message": "TTS 账号已添加"})
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

@app.route('/api/volc/<int:idx>', methods=['DELETE'])
@requires_auth
def delete_volc_account(idx):
    """删除 TTS 账号"""
    try:
        config = load_config()
        if 0 <= idx < len(config["volc_accounts"]):
            deleted = config["volc_accounts"].pop(idx)
            save_config(config)
            return jsonify({"success": True, "message": f"已删除: {deleted.get('remark', idx)}"})
        else:
            return jsonify({"success": False, "message": "索引无效"}), 400
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

@app.route('/api/gmail', methods=['POST'])
@requires_auth
def add_gmail_account():
    """添加 Gmail 账号"""
    try:
        config = load_config()
        new_account = request.json
        config["gmail_accounts"].append(new_account)
        save_config(config)
        return jsonify({"success": True, "message": "Gmail 账号已添加"})
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

@app.route('/api/gmail/<int:idx>', methods=['DELETE'])
@requires_auth
def delete_gmail_account(idx):
    """删除 Gmail 账号"""
    try:
        config = load_config()
        if 0 <= idx < len(config["gmail_accounts"]):
            deleted = config["gmail_accounts"].pop(idx)
            save_config(config)
            return jsonify({"success": True, "message": f"已删除: {deleted.get('user', idx)}"})
        else:
            return jsonify({"success": False, "message": "索引无效"}), 400
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

@app.route('/api/memory/view', methods=['GET'])
@requires_auth
def view_memory():
    """查看聊天记忆 (格式化输出)"""
    try:
        if not os.path.exists(MEMORY_FILE):
            return jsonify({"success": True, "data": [], "message": "记忆文件不存在"})
        
        with open(MEMORY_FILE, 'r', encoding='utf-8') as f:
            memory = json.load(f)
        
        # 格式化为易读的对话形式
        formatted = []
        for user_id, messages in memory.items():
            user_chats = {
                "user_id": user_id,
                "message_count": len(messages),
                "conversations": []
            }
            
            for msg in messages:
                role = msg.get("role", "unknown")
                content = msg.get("content", "")
                
                # 跳过 system prompt
                if role == "system":
                    if "前情提要" in content or len(content) > 200:
                        user_chats["conversations"].append({
                            "role": "📝 总结",
                            "content": content[:500] + "..." if len(content) > 500 else content
                        })
                    continue
                
                # 格式化角色名
                role_display = "👤 用户" if role == "user" else "🤖 Bot"
                user_chats["conversations"].append({
                    "role": role_display,
                    "content": content
                })
            
            formatted.append(user_chats)
        
        return jsonify({"success": True, "data": formatted})
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

@app.route('/api/logs', methods=['GET'])
@requires_auth
def get_bot_logs():
    """获取 Bot 容器日志 (已过滤刷屏内容)"""
    try:
        # 获取更多行，因为过滤后会减少
        lines = request.args.get('lines', '500')
        result = subprocess.run(
            ["docker", "logs", "--tail", lines, BOT_CONTAINER_NAME],
            capture_output=True, text=True, timeout=10
        )
        
        # docker logs 输出可能在 stderr
        logs = result.stdout or result.stderr
        
        # 分割成行
        raw_lines = logs.strip().split('\n') if logs else []
        
        # 过滤刷屏日志 (同步 qqbot.py 的过滤规则)
        def should_show(line):
            # 过滤 uvicorn 404 日志
            if '404' in line:
                return False
            # 过滤 Gmail 检查日志（只过滤连接和搜索，保留发现新邮件的通知）
            if '[Gmail] Connecting' in line or 'search (UNSEEN) status: OK' in line:
                return False
            # 过滤 Invalid HTTP request
            if 'Invalid HTTP request received' in line:
                return False
            return True
        
        log_lines = [line for line in raw_lines if should_show(line)]
        
        # 限制返回数量
        log_lines = log_lines[-50:]
        
        return jsonify({
            "success": True, 
            "logs": log_lines,
            "count": len(log_lines)
        })
    except subprocess.TimeoutExpired:
        return jsonify({"success": False, "message": "获取日志超时"}), 500
    except Exception as e:
        return jsonify({"success": False, "message": str(e)}), 500

# ==================== 启动 ====================
if __name__ == '__main__':
    # 初始化配置文件
    if not os.path.exists(CONFIG_FILE):
        save_config(DEFAULT_CONFIG)
        print(f"已创建默认配置: {CONFIG_FILE}")
    
    app.run(host='0.0.0.0', port=5000, debug=False)
