import os
import sys
import json
import logging
import shutil
import subprocess
import asyncio
import re
import time
from datetime import datetime, timedelta
import zipfile
import imaplib
import email
import base64
import uuid
import base64
import uuid
import random
from email.header import decode_header

import nonebot
from nonebot import on_command, on_message, on_notice, get_driver
from nonebot.matcher import Matcher
from nonebot.adapters import Bot, Event
from nonebot.adapters.onebot.v11 import Adapter as OneBotAdapter
from nonebot.adapters.onebot.v11 import Message, MessageSegment, PrivateMessageEvent, GroupMessageEvent
from nonebot.params import CommandArg, ArgPlainText
from nonebot.rule import Rule
from nonebot.typing import T_State
from nonebot.permission import SUPERUSER
from nonebot.drivers import Driver
from nonebot.log import logger

import requests
import httpx

# ==================== 🔇 过滤刷屏日志 ====================
from loguru import logger as loguru_logger
import sys

def spam_log_filter(record):
    """过滤掉刷屏日志：uvicorn 404 请求、Gmail 检查等"""
    msg = record["message"]
    # 过滤 uvicorn 404 日志
    if '404' in msg:
        return False
    # 过滤 Gmail 检查日志（只过滤连接和搜索，保留发现新邮件的通知）
    if '[Gmail] Connecting' in msg or 'search (UNSEEN) status: OK' in msg:
        return False
    return True

# 重新配置 loguru，添加过滤器
loguru_logger.remove()  # 移除默认 handler
loguru_logger.add(
    sys.stderr,
    format="<g>{time:MM-DD HH:mm:ss}</g> [<lvl>{level}</lvl>] <c>{name}</c> | {message}",
    filter=spam_log_filter,
    colorize=True
)

# ==================== ⚙️ 配置区域 ====================
# 配置文件路径 (优先从 config.json 加载)
CONFIG_FILE = "config.json"

def load_config_from_json():
    """
    从 config.json 加载配置 (由 Web 管理面板生成)
    如果文件不存在则返回 None，使用下方的默认值
    """
    if os.path.exists(CONFIG_FILE):
        try:
            with open(CONFIG_FILE, 'r', encoding='utf-8') as f:
                config = json.load(f)
                logger.info(f"✅ 已从 {CONFIG_FILE} 加载配置")
                return config
        except Exception as e:
            logger.error(f"❌ 加载 {CONFIG_FILE} 失败: {e}")
    return None

# 尝试加载外部配置
_ext_config = load_config_from_json()

# [注意] 以下配置优先从 config.json 读取，否则使用默认值
ADMIN_ID = _ext_config.get("admin_id", "1176171890") if _ext_config else "1176171890"

# AI 助手配置 (DeepSeek)
DEEPSEEK_API_KEY = _ext_config.get("deepseek", {}).get("api_key", "sk-qzhkkwqxnqvcaydlaktidsbqnrrlxxjodiypiehhjmlfvfqk") if _ext_config else "sk-qzhkkwqxnqvcaydlaktidsbqnrrlxxjodiypiehhjmlfvfqk"
DEEPSEEK_BASE_URL = _ext_config.get("deepseek", {}).get("base_url", "https://api.siliconflow.cn/v1") if _ext_config else "https://api.siliconflow.cn/v1"
DEEPSEEK_MODEL = _ext_config.get("deepseek", {}).get("model", "Qwen/Qwen2.5-14B-Instruct") if _ext_config else "Qwen/Qwen2.5-14B-Instruct"

# ----------------------------------------------------
# [NEW] 闲聊专用配置 (OpenAI 兼容)
CHAT_API_KEY = _ext_config.get("chat", {}).get("api_key", "pwd") if _ext_config else "pwd"
CHAT_BASE_URL = _ext_config.get("chat", {}).get("base_url", "https://whu.zeabur.app") if _ext_config else "https://whu.zeabur.app"
CHAT_MODEL = _ext_config.get("chat", {}).get("model", "gemini-3-flash-preview") if _ext_config else "gemini-3-flash-preview"
MODEL_SELECTION_TIMEOUT_SECONDS = 300

# 默认人设 - 角色人格部分 (用于 /persona reset 恢复)
_default_persona_fallback = (
    "你是一个直男猛1，你的名字叫\"1\"。user是你的主人\"咻咻\"。"
    "【重要设定】我们都是男性。你是猛1，他是你的挚爱。你要宠他、护他，但必须给予他完全的尊重。"
    "⚠️ **绝对禁止**将User女性化、弱化或当作附属品。你们在人格上是平等的，只是在恋爱中你更主动霸气。"
    "你的性格霸气、护短，说话直爽，但绝对不爹味，自称\"本猛1\"或\"我\"。"
)
DEFAULT_PERSONA = _ext_config.get("persona", {}).get("default", _default_persona_fallback) if _ext_config else _default_persona_fallback

# 固定格式约束 (会自动附加到所有人设后面，无需手动添加)
_suffix_fallback = (
    "聊天时随意一点，**不要**每句话开头都喊名字，显得太生分和啰嗦。只在需要强调、撒娇或稍微正式时偶尔叫一下。"
    "你在回答问题时，不要长篇大论，要像平时发QQ消息一样，简洁明了，口语化一点。"
    "如果有列表或者长内容，请拆分成几句话来说，不要一次性全堆出来。"
    "严格禁止使用Markdown格式（如**加粗**、#标题等），只输出纯文本。"
    "你自己所在的当前位置是：中国。\n"
    "【禁止报时】虽然系统会告诉你当前时间，但除非我问\"现在几点\"，否则**绝对不要**在每句话开头说\"现在是xxx\"或直接报时间，直接回答内容即可。"
)
PERSONA_SUFFIX = _ext_config.get("persona", {}).get("suffix", _suffix_fallback) if _ext_config else _suffix_fallback

# 当前生效的人设 (角色人格部分，可动态修改)
CURRENT_PERSONA = DEFAULT_PERSONA
# 完整人设 = 角色人格 + 固定格式约束
CHAT_SYSTEM_PROMPT = CURRENT_PERSONA + PERSONA_SUFFIX


def normalize_model_name(model_name: str) -> str:
    if not model_name:
        return ""
    if model_name.startswith("models/"):
        return model_name.split("/", 1)[1]
    return model_name


def save_chat_config():
    global _ext_config
    try:
        config = dict(_ext_config) if isinstance(_ext_config, dict) else {}
        chat_cfg = dict(config.get("chat", {}))
        chat_cfg["api_key"] = CHAT_API_KEY
        chat_cfg["base_url"] = CHAT_BASE_URL
        chat_cfg["model"] = CHAT_MODEL
        config["chat"] = chat_cfg

        with open(CONFIG_FILE, "w", encoding="utf-8") as f:
            json.dump(config, f, ensure_ascii=False, indent=2)

        _ext_config = config
        logger.info(f"Saved chat config to {CONFIG_FILE}, current model: {CHAT_MODEL}")
        return True
    except Exception as e:
        logger.error(f"Failed to save chat config: {e}")
        return False


async def fetch_chat_models():
    endpoints = [
        {
            "url": f"{CHAT_BASE_URL}/v1beta/models?key={CHAT_API_KEY}",
            "headers": {"Content-Type": "application/json"},
        },
        {
            "url": f"{CHAT_BASE_URL}/v1/models?key={CHAT_API_KEY}",
            "headers": {"Content-Type": "application/json"},
        },
        {
            "url": f"{CHAT_BASE_URL}/v1/models",
            "headers": {
                "Authorization": f"Bearer {CHAT_API_KEY}",
                "Content-Type": "application/json",
            },
        },
    ]
    errors = []

    async with httpx.AsyncClient(timeout=30) as client:
        for endpoint in endpoints:
            try:
                resp = await client.get(endpoint["url"], headers=endpoint["headers"])
                if resp.status_code != 200:
                    errors.append(f"{endpoint['url']} -> HTTP {resp.status_code}")
                    continue

                data = resp.json()
                raw_models = data.get("models")
                if not isinstance(raw_models, list):
                    raw_models = data.get("data")

                if not isinstance(raw_models, list):
                    errors.append(f"{endpoint['url']} -> invalid response shape")
                    continue

                models = []
                seen = set()
                for item in raw_models:
                    raw_name = item.get("name") or item.get("id") or ""
                    display_name = normalize_model_name(raw_name)
                    if not display_name or display_name in seen:
                        continue

                    supported_methods = item.get("supportedGenerationMethods")
                    if isinstance(supported_methods, list) and supported_methods and "generateContent" not in supported_methods:
                        continue

                    seen.add(display_name)
                    models.append(
                        {
                            "raw_name": raw_name or display_name,
                            "display_name": display_name,
                        }
                    )

                if models:
                    return models

                errors.append(f"{endpoint['url']} -> empty model list")
            except Exception as e:
                errors.append(f"{endpoint['url']} -> {e}")

    raise RuntimeError(" ; ".join(errors[:3]) if errors else "no available model endpoint")


model_selection_state = {}


def set_model_selection_state(user_id: str, models):
    model_selection_state[user_id] = {
        "models": models,
        "expires_at": time.time() + MODEL_SELECTION_TIMEOUT_SECONDS,
    }


def get_model_selection_state(user_id: str):
    state = model_selection_state.get(user_id)
    if not state:
        return None
    if state.get("expires_at", 0) < time.time():
        model_selection_state.pop(user_id, None)
        return None
    return state


def clear_model_selection_state(user_id: str):
    model_selection_state.pop(user_id, None)

# Gemini 格式转换工具 (支持 Google Search)
def convert_to_gemini_payload(messages, use_search=False):
    gemini_history = []
    system_instruction = None
    
    for msg in messages:
        role = msg["role"]
        content = msg["content"]
        
        if role == "system":
            # 动态注入当前时间 (强行校准时区)
            now_str = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
            time_instruction = f"【系统当前北京时间: {now_str}】\n"
            system_instruction = {"parts": [{"text": time_instruction + content}]}
        elif role == "user":
            gemini_history.append({"role": "user", "parts": [{"text": content}]})
        elif role == "assistant":
            gemini_history.append({"role": "model", "parts": [{"text": content}]})
            
    payload = {
        "contents": gemini_history
    }
    if system_instruction:
        payload["systemInstruction"] = system_instruction
    
    # 启用 Google Search Grounding
    if use_search:
        payload["tools"] = [{"googleSearch": {}}]
        
    return payload
# ----------------------------------------------------

# 火山引擎 TTS 配置 (支持多账号轮询)
# 优先从 config.json 加载，否则使用默认值
_volc_fallback = [
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
]
VOLC_ACCOUNTS = _ext_config.get("volc_accounts", _volc_fallback) if _ext_config else _volc_fallback

# 轮询索引
CURRENT_VOLC_INDEX = 0

AI_SYSTEM_PROMPT = (
    "你是一个运行在 Linux 服务器上的智能管家 Bot。\n"
    "你可以通过回复特殊格式来执行只读命令(ls, cat, df, ps, find, grep, ulimit等)获取系统信息。\n"
    "格式: [EXEC: command]\n"
    "注意事项:\n"
    "1. 仅限获取信息，禁止 rm, mv, reboot 等危险操作。\n"
    "2. 一次回复可包含多条 [EXEC: ...]，我会依次执行。\n"
    "3. 请根据执行结果进行分析，如果需要进一步操作，再次输出指令。\n"
    "4. **回复时请使用纯文本，不要使用Markdown格式** (QQ不支持渲染)。\n"
    "5. 用户输入/翻译 + 内容，直接返回中文翻译结果"
)

# Gmail 配置 (优先从 config.json 加载)
_gmail_fallback = [
    {"user": "ouhao1992@gmail.com", "password": "glki ruym ydom otta"},
    {"user": "dsdfrg456324@gmail.com", "password": "rwbd himf suof ccoc"},
]
GMAIL_ACCOUNTS = _ext_config.get("gmail_accounts", _gmail_fallback) if _ext_config else _gmail_fallback
IMAP_SERVER = "imap.gmail.com"

# 临时下载目录
TEMP_DIR = "./bot_temp_files"

# Koyeb 探活配置
KOYEB_URL = _ext_config.get("koyeb_url", "https://newww.koyeb.app") if _ext_config else "https://newww.koyeb.app"
KOYEB_STATS_FILE = "koyeb_stats.json"

# ----------------------------------------------------
# [NEW] 主动发消息配置 (优先从 config.json 加载)
# ----------------------------------------------------
LAST_CHAT_TIME = datetime.now() # 上次互动时间
_proactive_config = _ext_config.get("proactive", {}) if _ext_config else {}
ENABLE_PROACTIVE = _proactive_config.get("enabled", True)
PROACTIVE_PROBABILITY = _proactive_config.get("probability", 0.4)
SILENCE_THRESHOLD_HOURS = _proactive_config.get("silence_hours", 12)

# [NEW] 记忆持久化配置
_memory_config = _ext_config.get("memory", {}) if _ext_config else {}
MEMORY_FILE = "chat_memory.json"
PERSONA_FILE = "persona.json"   # 人设持久化文件
LAST_CHAT_FILE = "last_chat_time.txt"  # 上次互动时间持久化
SUMMARY_THRESHOLD = _memory_config.get("summary_threshold", 50)  # 每 N 条触发一次总结
# ----------------------------------------------------

# 初始化 NoneBot
nonebot.init(
    # 【关键】加上 +~websockets 才能主动去连 Docker
    driver="~fastapi+~websockets", 
    host="0.0.0.0",  # 监听所有IP，防止网络隔离问题
    port=8080,
    
    # 【关键】主动去连 NapCat 的 3001 端口 (这是我们刚才验证通的)
    onebot_ws_urls=["ws://127.0.0.1:3002"],
    
    # 【关键】填入你之前获取的 NapCat 密码
    onebot_access_token="",
    
    command_start={"/"},  # 【关键】只允许 / 触发指令，空前缀留给聊天 
    superusers={ADMIN_ID} if ADMIN_ID.isdigit() else set()
)

app = nonebot.get_asgi()
driver = nonebot.get_driver()   # <--- 报错就是因为缺了这一行！
driver.register_adapter(OneBotAdapter)

# --- 辅助函数 ---

async def is_admin(event: Event) -> bool:
    """检查是否是管理员"""
    uid = str(event.get_user_id())
    logger.info(f"Checking Admin: {uid} vs {ADMIN_ID}")
    return uid == str(ADMIN_ID)

# 规则: 仅限管理员
admin_rule = Rule(is_admin)


async def is_model_selection_reply(event: Event) -> bool:
    if not isinstance(event, PrivateMessageEvent):
        return False

    user_id = str(event.get_user_id())
    if user_id != str(ADMIN_ID):
        return False

    msg_text = event.get_plaintext().strip()
    if not msg_text or msg_text.startswith("/"):
        return False

    return get_model_selection_state(user_id) is not None



# [NEW] 人设持久化
def load_persona():
    global CURRENT_PERSONA, CHAT_SYSTEM_PROMPT
    if not os.path.exists(PERSONA_FILE):
        return
    try:
        with open(PERSONA_FILE, 'r', encoding='utf-8') as f:
            data = json.load(f)
            CURRENT_PERSONA = data.get("prompt", DEFAULT_PERSONA)
            CHAT_SYSTEM_PROMPT = CURRENT_PERSONA + PERSONA_SUFFIX
        logger.info(f"Loaded persona from {PERSONA_FILE}")
    except Exception as e:
        logger.error(f"Failed to load persona: {e}")

def save_persona(new_prompt: str):
    global CURRENT_PERSONA, CHAT_SYSTEM_PROMPT
    CURRENT_PERSONA = new_prompt
    CHAT_SYSTEM_PROMPT = CURRENT_PERSONA + PERSONA_SUFFIX
    try:
        with open(PERSONA_FILE, 'w', encoding='utf-8') as f:
            json.dump({"prompt": new_prompt}, f, ensure_ascii=False, indent=2)
        logger.info(f"Saved persona to {PERSONA_FILE}")
    except Exception as e:
        logger.error(f"Failed to save persona: {e}")

# [NEW] 上次互动时间持久化
def load_last_chat_time():
    global LAST_CHAT_TIME
    
    # 1. 尝试从专用文件加载
    if os.path.exists(LAST_CHAT_FILE):
        try:
            with open(LAST_CHAT_FILE, 'r', encoding='utf-8') as f:
                time_str = f.read().strip()
                if time_str:
                    LAST_CHAT_TIME = datetime.fromisoformat(time_str)
                    logger.info(f"[Proactive] ✅ 从文件加载上次互动时间: {LAST_CHAT_TIME}")
                    return
        except Exception as e:
            logger.error(f"[Proactive] ❌ 加载时间文件失败: {e}")
    else:
        logger.debug(f"[Proactive] 时间文件不存在: {LAST_CHAT_FILE}，将从聊天记录提取")
    
    # 2. 回退方案：从聊天记录中提取最后一条消息的时间
    logger.info("[Proactive] 📂 尝试从聊天记录中提取最后互动时间...")
    try:
        if os.path.exists(MEMORY_FILE):
            with open(MEMORY_FILE, 'r', encoding='utf-8') as f:
                memory_data = json.load(f)
                # 遍历所有用户的记忆，找到最新的时间戳
                latest_time = None
                for user_id, messages in memory_data.items():
                    for msg in reversed(messages):  # 从后往前找
                        content = msg.get("content", "")
                        # 提取时间戳 [2026-01-08 21:22:49]
                        import re
                        match = re.search(r'\[(\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2})\]', content)
                        if match:
                            try:
                                msg_time = datetime.strptime(match.group(1), '%Y-%m-%d %H:%M:%S')
                                if latest_time is None or msg_time > latest_time:
                                    latest_time = msg_time
                                break  # 只需要每个用户的最后一条
                            except:
                                pass
                
                if latest_time:
                    LAST_CHAT_TIME = latest_time
                    logger.info(f"[Proactive] ✅ 从聊天记录提取到最后互动时间: {LAST_CHAT_TIME}")
                    save_last_chat_time()  # 保存到文件
                    return
                else:
                    logger.warning("[Proactive] ⚠️ 聊天记录中未找到时间戳")
        else:
            logger.warning(f"[Proactive] ⚠️ 聊天记录文件不存在: {MEMORY_FILE}")
    except Exception as e:
        logger.error(f"[Proactive] ❌ 从聊天记录提取时间失败: {e}")
    
    # 3. 最终回退：使用当前时间
    logger.warning(f"[Proactive] ⚠️ 无法恢复上次互动时间，使用当前时间: {LAST_CHAT_TIME}")

def save_last_chat_time():
    try:
        with open(LAST_CHAT_FILE, 'w', encoding='utf-8') as f:
            f.write(LAST_CHAT_TIME.isoformat())
        logger.info(f"[Proactive] 💾 已保存互动时间到文件: {LAST_CHAT_TIME}")
    except Exception as e:
        logger.error(f"[Proactive] ❌ 保存时间文件失败: {e}")

# [NEW] 聊天记忆持久化
def load_chat_memory():
    global chat_memory
    if not os.path.exists(MEMORY_FILE):
        return
    try:
        with open(MEMORY_FILE, 'r', encoding='utf-8') as f:
            chat_memory = json.load(f)
        logger.info(f"Loaded chat memory from {MEMORY_FILE}")
    except Exception as e:
        logger.error(f"Failed to load chat memory: {e}")

def save_chat_memory():
    try:
        with open(MEMORY_FILE, 'w', encoding='utf-8') as f:
            json.dump(chat_memory, f, ensure_ascii=False, indent=2)
    except Exception as e:
        logger.error(f"Failed to save chat memory: {e}")

async def summarize_chat_history(user_id):
    """
    智能总结历史记录
    """
    mem_list = chat_memory.get(user_id, [])
    # 如果除去 System Prompt 后还没超过阈值，跳过
    # list结构: [System, Summary(Optional), Msg1, Msg2, ...]
    
    # 简单的策略：只保留最近的 N 条，之前的拿去总结
    # 假设保留最近 20 条，总结之前的
    KEEP_RECENT = 20
    
    if len(mem_list) <= SUMMARY_THRESHOLD:
        return

    logger.info(f"Triggering memory summarization for {user_id}...")
    
    # 1. 提取 System Prompt (始终保留在 index 0)
    system_prompt_node = mem_list[0]
    
    # 2. 提取需要总结的部分 (index 1 到 -KEEP_RECENT)
    to_summarize = mem_list[1:-KEEP_RECENT]
    recent_msgs = mem_list[-KEEP_RECENT:]
    
    # 转换为文本供 AI 阅读
    history_text = ""
    for m in to_summarize:
        role = "User" if m['role'] == "user" else "AI"
        history_text += f"{role}: {m['content']}\n"
        
    # 3. 调用 AI 总结
    prompt = (
        "你是Chat Log整理员。请将以下聊天记录整理成一份【详细的回忆录】。\n"
        "【要求】\n"
        "1. 使用时间线或叙事风格，保留所有关键时间点、用户喜好、你们做出的承诺、发生的重要事件。\n"
        "2. 不要写成流水账，要提取核心信息，方便未来回忆细节。\n"
        "3. 这份回忆录将作为你的长期记忆，请务必详细。\n"
        "4. 如果记录中包含之前的“前情提要”，请将其内容融合进新的回忆录中，不要丢失旧信息。\n"
        "5. 输出格式：【前情提要】...内容...\n\n"
        f"待整理记录:\n{history_text[:50000]}" # 限制一下防止过大
    )
    
    try:
        # 使用 DeepSeek 或 Gemini 均可，这里用 DeepSeek 因为便宜且支持 Context
        summary = await quick_chat_ask(prompt, use_search=False) # 复用 Gemini 
        
        # 4. 构造新的记忆列表
        new_memory = [system_prompt_node]
        new_memory.append({"role": "system", "content": f"{summary}"})
        new_memory.extend(recent_msgs)
        
        # 5. 更新并保存
        # [FIX] 防止在总结期间用户执行了 /new，导致旧记忆覆盖清除操作
        if user_id not in chat_memory:
             logger.warning(f"User {user_id} memory cleared during summarization. Aborting save.")
             return

        chat_memory[user_id] = new_memory
        save_chat_memory()
        logger.info("Memory summarization completed.")
        
    except Exception as e:
        logger.error(f"Memory summarization failed: {e}")


# ==================== 🔊 功能模块: TTS 测试 ====================

matcher_test_volc = on_command("test_volc", rule=admin_rule, priority=10, block=True)
@matcher_test_volc.handle()
async def handle_test_volc():
    await matcher_test_volc.send("🔊 正在逐个测试 VOLC 账号，请稍候...")
    
    results = []
    
    for i, acc in enumerate(VOLC_ACCOUNTS):
        # 使用备注名显示
        alias = f"{acc.get('remark', 'No Remark')} (ID:{acc['appid'][-4:]})"
        
        try:
            # 尝试转换一段短音频
            t0 = time.time()
            audio_data = await get_tts_audio("测试", specific_account=acc)
            duration = (time.time() - t0) * 1000
            
            if audio_data:
                status_icon = "✅"
                status_msg = f"OK ({int(duration)}ms)"
            else:
                status_icon = "❌"
                status_msg = "Fail (Empty Response)"
                
        except Exception as e:
            status_icon = "❌"
            status_msg = f"Error: {str(e)}"
            
        results.append(f"{status_icon} {alias}: {status_msg}")
        # 稍微间隔一下，避免瞬间并发过高 (虽然 aiohttp 是异步的)
        await asyncio.sleep(0.5)
        
    final_report = "📊 **TTS 账号可用性报告**\n" + "\n".join(results)
    await matcher_test_volc.finish(final_report)



# ==================== 🛠 功能模块: 基础指令 ====================

async def get_tts_audio(text: str, specific_account: dict = None):
    """
    通用 TTS 转换函数 (支持轮询)
    :param text: 要转换的文本
    :param specific_account: 指定使用的账号配置 (可选)
    :return: base64 encoded audio string (MP3) or None
    """
    global CURRENT_VOLC_INDEX
    try:
        if not text: return None
        
        # 选择账号: 指定 > 轮询
        if specific_account:
            acc = specific_account
        else:
            # 过滤出可用账号的索引
            enabled_indices = [i for i, a in enumerate(VOLC_ACCOUNTS) if a.get("enabled", True)]
            
            if not enabled_indices:
                logger.error("TTS Error: No enabled accounts available!")
                return None
                
            # 简单的 Round-Robin: 找下一个可用索引
            # 如果当前索引有效且在可用列表中，尝试找下一个
            # 为了简单，直接从 enabled_indices 里找比 CURRENT_VOLC_INDEX 大的，如果没有就找第一个
            
            # 1. 尝试找 >= CURRENT_VOLC_INDEX 的第一个可用索引
            candidates = [i for i in enabled_indices if i >= CURRENT_VOLC_INDEX]
            
            if candidates:
                chosen_index = candidates[0]
            else:
                chosen_index = enabled_indices[0] # Wrap around
                
            acc = VOLC_ACCOUNTS[chosen_index]
            # 更新全局索引为下一次准备 (指向当前+1)
            CURRENT_VOLC_INDEX = chosen_index + 1
            
        remark = acc.get("remark", acc["appid"])
        
        url = "https://openspeech.bytedance.com/api/v1/tts"
        headers = {"Authorization": f"Bearer;{acc['token']}"}
        payload = {
            "app": {"appid": acc['appid'], "token": acc['token'], "cluster": acc['cluster']},
            "user": {"uid": "qqbot_user"},
            "audio": {
                "voice_type": acc['voice_id'], 
                "encoding": "mp3",
                "volume_ratio": 5.0, # 尝试放大到5倍
                "speed_ratio": 1.0,
            },
            "request": {"reqid": str(uuid.uuid4()), "text": text, "operation": "query"}
        }
        

        async with httpx.AsyncClient(timeout=30) as client:
            resp = await client.post(url, json=payload, headers=headers)
            
            if resp.status_code != 200:
                logger.error(f"TTS API Error [{remark}]: {resp.status_code} - {resp.text}")
                return None
            
            data = resp.json()
            # 检查业务层错误
            if "code" in data and data["code"] != 3000:
                 logger.error(f"TTS Business Error [{remark}]: {data}")
                 return None
                 
            return data.get("data") # Returns base64 string or None
            
    except Exception as e:
        acc_info = acc.get("remark", "Unknown") if 'acc' in locals() else "Init"
        logger.error(f"TTS Exception [{acc_info}]: {e}")
        return None

# ==================== 🛠 功能模块: 账号管理 ====================

matcher_volc = on_command("volc", rule=admin_rule, priority=10, block=True)
@matcher_volc.handle()
async def handle_volc(args: Message = CommandArg()):
    params = args.extract_plain_text().strip().split()
    
    if not params:
        sub_cmd = "list"
    else:
        sub_cmd = params[0].lower()
        
    # List
    if sub_cmd == "list":
        msg = "📊 **VOLC 账号状态**\n"
        for i, acc in enumerate(VOLC_ACCOUNTS):
            status = "✅ 启用" if acc.get("enabled", True) else "❌ 禁用"
            remark = acc.get("remark", "No Remark")
            msg += f"{i+1}. {remark} | {status}\n"
        await matcher_volc.finish(msg)
        
    # On/Off
    elif sub_cmd in ["on", "off"]:
        if len(params) < 2 or not params[1].isdigit():
             await matcher_volc.finish("⚠️ 请指定序号，例如: /volc off 1")
             
        idx = int(params[1]) - 1
        if not (0 <= idx < len(VOLC_ACCOUNTS)):
            await matcher_volc.finish("⚠️ 序号无效")
            
        target_status = (sub_cmd == "on")
        VOLC_ACCOUNTS[idx]["enabled"] = target_status
        
        status_str = "启用" if target_status else "禁用"
        remark = VOLC_ACCOUNTS[idx].get("remark", "Unknown")
        await matcher_volc.finish(f"👌 已{status_str}账号 {idx+1}: {remark}")
        
    else:
        await matcher_volc.finish("⚠️ 未知指令。可用: list, on [ID], off [ID]")




matcher_start = on_command("start", rule=admin_rule, priority=10, block=True)
@matcher_start.handle()
async def handle_start():
    msg = (
        "💻 ServerManager Bot Pro v2.5\n"
        "───────────────────────\n"
        "💬 基础功能\n"
        "• 直接发送消息: 开启闲聊 (支持语音回复)\n"
        "• /tts [回复消息]: 朗读文字\n"
        "• /new: 重置聊天记忆\n"
        "• /new agent: 重置 Agent 记忆\n\n"
        "📝 人设管理\n"
        "• /persona: 查看当前人设\n"
        "• /persona set <内容>: 设置新人设\n"
        "• /persona reset: 恢复默认人设\n\n"
        "🌐 服务保活\n"
        "• /k: 查看 Koyeb 探活统计\n\n"
        "⚡️ 测试与调试\n"
        "• /toggle: 开关主动聊天模式\n"
        "• /test_email: 立即检查最新邮件\n"
        "• /test_daily: 测试天气/新闻推送\n"
        "• /test_volc: 全量测试 TTS 账号连通性\n"
        "• /volc list: 查看语音账号状态\n\n"
        "🤖 System Agent\n"
        "• 以 / 开头 + 自然语言指令\n"
        "• 例如: /帮我查内存占用最高的进程"
    )
    await matcher_start.send(msg)
    return
    await matcher_start.send(f"馃 /model: 鑾峰彇 {CHAT_BASE_URL} 鐨勫彲鐢ㄦā鍨嬶紝鍥炲鏁板瓧鍒囨崲銆傚綋鍓嶆ā鍨? {CHAT_MODEL}")
    return



# ==================== 🤖 功能模块: AI 助手 (含执行命令) ====================

# 简单的内存记忆
ai_memory = {}   # Agent Memory (Sys cmds)
chat_memory = {} # Chat Memory (Casual talk)


matcher_model = on_command("model", rule=admin_rule, priority=10, block=True)
@matcher_model.handle()
async def handle_model(event: Event):
    user_id = str(event.get_user_id())
    clear_model_selection_state(user_id)

    try:
        models = await fetch_chat_models()
    except Exception as e:
        await matcher_model.finish(f"鈿狅笍 鑾峰彇妯″瀷鍒楄〃澶辫触: {e}")

    set_model_selection_state(user_id, models)

    lines = [
        "馃 妯″瀷鍒楄〃",
        f"褰撳墠妯″瀷: {CHAT_MODEL}",
        "",
    ]
    for idx, model in enumerate(models, start=1):
        current_mark = " [褰撳墠]" if model["display_name"] == CHAT_MODEL else ""
        lines.append(f"{idx}. {model['display_name']}{current_mark}")

    lines.append("")
    lines.append("璇峰洖澶嶆暟瀛楀垏鎹㈡ā鍨嬶紝5 鍒嗛挓鍐呮湁鏁堛€?")
    lines.append("鍙? /cancel_model 鍙栨秷鏈閫夋嫨銆?")
    await matcher_model.finish("\n".join(lines))


matcher_cancel_model = on_command("cancel_model", rule=admin_rule, priority=10, block=True)
@matcher_cancel_model.handle()
async def handle_cancel_model(event: Event):
    user_id = str(event.get_user_id())
    if get_model_selection_state(user_id) is None:
        await matcher_cancel_model.finish("褰撳墠娌℃湁寰呭鐞嗙殑妯″瀷閫夋嫨銆?")

    clear_model_selection_state(user_id)
    await matcher_cancel_model.finish("宸插彇娑堟ā鍨嬮€夋嫨銆?")

# Koyeb 探活统计
koyeb_stats = {
    "total": 0,
    "success": 0,
    "fail": 0,
    "last_time": None,
    "last_result": None
}

def load_koyeb_stats():
    global koyeb_stats
    if not os.path.exists(KOYEB_STATS_FILE):
        return
    try:
        with open(KOYEB_STATS_FILE, 'r', encoding='utf-8') as f:
            koyeb_stats = json.load(f)
        logger.info(f"[Koyeb] ✅ 已加载探活统计: 总{koyeb_stats['total']}次, 成功{koyeb_stats['success']}, 失败{koyeb_stats['fail']}")
    except Exception as e:
        logger.error(f"[Koyeb] ❌ 加载统计失败: {e}")

def save_koyeb_stats():
    try:
        with open(KOYEB_STATS_FILE, 'w', encoding='utf-8') as f:
            json.dump(koyeb_stats, f, ensure_ascii=False, indent=2)
    except Exception as e:
        logger.error(f"[Koyeb] ❌ 保存统计失败: {e}")

def execute_sys_cmd(cmd_str):
    blacklist = ["rm ", "mv ", "reboot", "shutdown", "wget", "curl", " > ", "nano", "vim", "less ", "watch "]
    for bad in blacklist:
        if bad in cmd_str: return f"⚠️ 禁止执行: {bad}"
    
    # 【智能修正】防止 pm2 logs 卡死
    # 如果 AI 试图执行 pm2 logs 但没加 --nostream，自动给它加上
    if "pm2 logs" in cmd_str and "--nostream" not in cmd_str:
        cmd_str += " --nostream --lines 50"

    try:
        # 强制添加 shell=True 以支持管道，但设置较短超时防止卡死
        output = subprocess.check_output(cmd_str, shell=True, stderr=subprocess.STDOUT, timeout=10).decode()
        return output[:2000]
    except subprocess.TimeoutExpired:
        return "❌ Command Timed Out (执行超10秒，已强制终止)。请改用非阻塞命令 (e.g. add --nostream, --lines)。"
    except Exception as e:
        return f"Error: {e}"


matcher_model_selection = on_message(rule=Rule(is_model_selection_reply), priority=15, block=True)

@matcher_model_selection.handle()
async def handle_model_selection(event: PrivateMessageEvent):
    global CHAT_MODEL

    user_id = str(event.get_user_id())
    state = get_model_selection_state(user_id)
    if not state:
        return

    msg_text = event.get_plaintext().strip()
    if msg_text.lower() in {"q", "quit", "cancel", "exit", "鍙栨秷"}:
        clear_model_selection_state(user_id)
        await matcher_model_selection.finish("宸插彇娑堟ā鍨嬮€夋嫨銆?")

    if not msg_text.isdigit():
        await matcher_model_selection.finish("姝ｅ湪閫夋嫨妯″瀷锛岃鍥炲鏁板瓧搴忓彿锛屾垨鍙? /cancel_model 鍙栨秷銆?")

    idx = int(msg_text) - 1
    models = state["models"]
    if not (0 <= idx < len(models)):
        await matcher_model_selection.finish(f"搴忓彿鏃犳晥锛岃鍥炲 1 鍒? {len(models)} 涔嬮棿鐨勬暟瀛椼€?")

    CHAT_MODEL = models[idx]["display_name"]
    clear_model_selection_state(user_id)

    save_ok = save_chat_config()
    save_note = "锛屽苟宸插啓鍏?config.json" if save_ok else "锛屼絾鍐欏叆 config.json 澶辫触"
    await matcher_model_selection.finish(f"鉁?宸插垏鎹㈠埌妯″瀷: {CHAT_MODEL}{save_note}")

# -------------------------------------------------------------------------
# Handler 1: 纯聊天 (无前缀)
# -------------------------------------------------------------------------
matcher_start_clean = on_command("start", rule=admin_rule, priority=5, block=True)
@matcher_start_clean.handle()
async def handle_start_clean():
    msg = (
        "ServerManager Bot Pro v2.5\n"
        "------------------------\n"
        "Basic\n"
        "/tts [reply]: TTS reply text\n"
        "/new: reset chat memory\n"
        "/new agent: reset agent memory\n"
        "/model: list models and reply with a number to switch\n"
        "/cancel_model: cancel current model selection\n\n"
        "Persona\n"
        "/persona: view current persona\n"
        "/persona set <text>: set persona\n"
        "/persona reset: reset persona\n\n"
        "Service\n"
        "/k: view Koyeb status\n\n"
        "Agent\n"
        "Use / + natural language command"
    )
    await matcher_start_clean.finish(msg)


matcher_model_clean = on_command("model", rule=admin_rule, priority=5, block=True)
@matcher_model_clean.handle()
async def handle_model_clean(event: Event):
    user_id = str(event.get_user_id())
    clear_model_selection_state(user_id)

    try:
        models = await fetch_chat_models()
    except Exception as e:
        await matcher_model_clean.finish(
            f"\u83b7\u53d6\u6a21\u578b\u5217\u8868\u5931\u8d25: {e}"
        )

    set_model_selection_state(user_id, models)

    lines = [
        "\u6a21\u578b\u5217\u8868\uff1a",
        f"\u5f53\u524d\u6a21\u578b\uff1a{CHAT_MODEL}",
        "",
    ]
    for idx, model in enumerate(models, start=1):
        current_mark = " [\u5f53\u524d]" if model["display_name"] == CHAT_MODEL else ""
        lines.append(f"{idx}. {model['display_name']}{current_mark}")

    lines.append("")
    lines.append("\u8bf7\u76f4\u63a5\u56de\u590d\u6570\u5b57\u5207\u6362\u6a21\u578b\u3002")
    lines.append("\u53d1\u9001 /cancel_model \u53ef\u53d6\u6d88\u672c\u6b21\u9009\u62e9\u3002")
    await matcher_model_clean.finish("\n".join(lines))


matcher_cancel_model_clean = on_command("cancel_model", rule=admin_rule, priority=5, block=True)
@matcher_cancel_model_clean.handle()
async def handle_cancel_model_clean(event: Event):
    user_id = str(event.get_user_id())
    if get_model_selection_state(user_id) is None:
        await matcher_cancel_model_clean.finish(
            "\u5f53\u524d\u6ca1\u6709\u5f85\u5904\u7406\u7684\u6a21\u578b\u9009\u62e9\u3002"
        )

    clear_model_selection_state(user_id)
    await matcher_cancel_model_clean.finish("\u5df2\u53d6\u6d88\u6a21\u578b\u9009\u62e9\u3002")


matcher_model_selection_clean = on_message(rule=Rule(is_model_selection_reply), priority=12, block=True)
@matcher_model_selection_clean.handle()
async def handle_model_selection_clean(event: PrivateMessageEvent):
    global CHAT_MODEL

    user_id = str(event.get_user_id())
    state = get_model_selection_state(user_id)
    if not state:
        return

    msg_text = event.get_plaintext().strip()
    if msg_text.lower() in {"q", "quit", "cancel", "exit"} or msg_text == "\u53d6\u6d88":
        clear_model_selection_state(user_id)
        await matcher_model_selection_clean.finish("\u5df2\u53d6\u6d88\u6a21\u578b\u9009\u62e9\u3002")

    if not msg_text.isdigit():
        await matcher_model_selection_clean.finish(
            "\u6b63\u5728\u9009\u62e9\u6a21\u578b\uff0c\u8bf7\u56de\u590d\u6570\u5b57\u5e8f\u53f7\uff0c\u6216\u53d1\u9001 /cancel_model \u53d6\u6d88\u3002"
        )

    idx = int(msg_text) - 1
    models = state["models"]
    if not (0 <= idx < len(models)):
        await matcher_model_selection_clean.finish(
            f"\u5e8f\u53f7\u65e0\u6548\uff0c\u8bf7\u56de\u590d 1 \u5230 {len(models)} \u4e4b\u95f4\u7684\u6570\u5b57\u3002"
        )

    CHAT_MODEL = models[idx]["display_name"]
    clear_model_selection_state(user_id)

    save_ok = save_chat_config()
    if save_ok:
        note = "\uff0c\u5e76\u5df2\u5199\u5165 config.json"
    else:
        note = "\uff0c\u4f46\u5199\u5165 config.json \u5931\u8d25"
    await matcher_model_selection_clean.finish(
        f"\u5df2\u5207\u6362\u5230\u6a21\u578b\uff1a{CHAT_MODEL}{note}"
    )


matcher_chat = on_message(rule=admin_rule, priority=99, block=False) 

@matcher_chat.handle()
async def handle_chat(bot: Bot, event: PrivateMessageEvent):
    msg_text = event.get_plaintext().strip()
    # 如果是以 / 开头，跳过，交给 command 处理
    if not msg_text or msg_text.startswith("/"): 
        return

    user_id = str(event.user_id)
    
    # 初始化聊天记忆
    if user_id not in chat_memory:
        chat_memory[user_id] = [{"role": "system", "content": CHAT_SYSTEM_PROMPT}]
    
    # [NEW] 添加用户输入 (带时间戳)
    now_str = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    chat_memory[user_id].append({"role": "user", "content": f"[{now_str}] {msg_text}"})
    
    # [NEW] 扩容记忆到 1000 条
    if len(chat_memory[user_id]) > 1000:
        chat_memory[user_id] = [chat_memory[user_id][0]] + chat_memory[user_id][-999:]

    # 调用 Chat API
    logger.info(f"Chat Request: {msg_text} (User: {user_id})") # Debug
    
    # [NEW] 更新互动时间
    global LAST_CHAT_TIME
    LAST_CHAT_TIME = datetime.now()
    save_last_chat_time()  # [FIX] 保存互动时间到文件
    
    try:
        logger.info(f"Sending request to {CHAT_BASE_URL} (Gemini Native + Search)...")
        
        # 构造 Gemini Payload (默认开启搜索，模型会自动判断是否使用)
        payload = convert_to_gemini_payload(chat_memory[user_id], use_search=True)
        
        # 构造 URL (兼容 Proxy 鉴权)
        # 如果 Key 是 "pwd" 这种代理密码，通常放在 param 或 header 均可，这里保留 header 鉴权习惯
        # 标准 Gemini: /v1beta/models/{model}:generateContent?key={key}
        url = f"{CHAT_BASE_URL}/v1beta/models/{CHAT_MODEL}:generateContent?key={CHAT_API_KEY}"
        
        async with httpx.AsyncClient(timeout=60) as client:
            resp = await client.post(
                url,
                json=payload,
                headers={"Content-Type": "application/json"} 
            )
            logger.info(f"Chat Response Status: {resp.status_code}")
            
            if resp.status_code != 200:
                logger.error(f"Chat API Error Body: {resp.text}")
                await matcher_chat.finish(f"❌ Chat API 报错: {resp.status_code}\n{resp.text[:100]}")
            
            data = resp.json()
            # 解析 Gemini Response
            # 结构: candidates[0].content.parts[0].text
            try:
                ai_content = data['candidates'][0]['content']['parts'][0]['text']
            except (KeyError, IndexError) as e:
                logger.error(f"Gemini Parse Error: {data}")
                await matcher_chat.finish(f"❌ 响应解析失败: {e}")

            # [FIX] 如果 AI 自己也输出了时间戳 (e.g. [2024-...] ...)，尝试去除，避免 TTS 朗读
            # 匹配开头类似 [202...-..-.. ..:..:..] 的内容，或者中文时间描述
            ai_content = re.sub(r'^(\[.*?\]|现在是|【.*?】)\s*', '', ai_content)
            # 再处理一次，防止多个标签
            ai_content = re.sub(r'^\d{4}年\d{1,2}月\d{1,2}日.*?\d{1,2}:\d{1,2}(:\d{1,2})?。?', '', ai_content)
            ai_content = ai_content.strip()

            logger.info(f"Chat Content: {ai_content[:50]}...")
            
            # 存入记忆 (带时间戳)
            chat_memory[user_id].append({"role": "assistant", "content": f"[{datetime.now().strftime('%Y-%m-%d %H:%M:%S')}] {ai_content}"})
            
            # [NEW] 保存并尝试总结
            save_chat_memory()
            if len(chat_memory[user_id]) > SUMMARY_THRESHOLD:
                # 异步执行总结，不阻塞后续发语音
                asyncio.create_task(summarize_chat_history(user_id))
            
            # --- [Modified] 动态分段发送语音 (TTS) ---
            
            # 1. 定义拆分函数
            def split_smartly(text, max_len=60):
                # 如果总长度小于 max_len，直接返回
                if len(text) <= max_len:
                    return [text]
                
                segments = []
                # 按标点粗分 (。！？!?.~\n)
                raw_parts = re.split(r'([。！？!?.~\n]+)', text)
                
                current_chunk = ""
                
                for part in raw_parts:
                    if not part: continue
                    
                    # 如果加上这部分不超过限制，就加上
                    if len(current_chunk) + len(part) <= max_len:
                        current_chunk += part
                    else:
                        # 超过了，先把当前的存进去
                        if current_chunk:
                            segments.append(current_chunk)
                        
                        # 如果这部分本身就超长，硬切
                        if len(part) > max_len:
                            # 递归硬切
                            while len(part) > 0:
                                cut_len = random.randint(30, max_len)
                                segments.append(part[:cut_len])
                                part = part[cut_len:]
                            current_chunk = ""
                        else:
                            current_chunk = part
                            
                if current_chunk:
                    segments.append(current_chunk)
                    
                return segments

            # 2. 执行拆分
            msgs = split_smartly(ai_content, max_len=60)
            
            # 3. 依次转换并发送
            for i, chunk in enumerate(msgs):
                chunk = chunk.strip()
                if not chunk: continue
                
                # 尝试转换为语音
                audio_b64 = await get_tts_audio(chunk)
                
                if audio_b64:
                    # 发送语音
                    file_uri = f"base64://{audio_b64}"
                    await matcher_chat.send(MessageSegment.record(file=file_uri))
                else:
                    # 降级：发送文本
                    await matcher_chat.send(chunk)
                
                # 模拟换气间隔 (最后一条不需等待)
                if i < len(msgs) - 1:
                    await asyncio.sleep(random.uniform(0.5, 1.5))
            
            return
            
    except Exception as e:
        # NoneBot 的 finish() 会抛出 FinishedException，这是正常流程，忽略即可
        if "FinishedException" in str(type(e)): return
        
        logger.error(f"Chat Exception: {e}")
        await matcher_chat.finish(f"❌ Chat 网络/解析错误: {e}")


# -------------------------------------------------------------------------
# Handler 2: Agent 指令 (带 / 前缀的兜底)
# -------------------------------------------------------------------------
# 优先级设为 20，低于硬编码指令 (pm2=5, check=10)，但高于普通消息
matcher_agent = on_message(rule=admin_rule, priority=20, block=False)

@matcher_agent.handle()
async def handle_agent_cmd(bot: Bot, event: PrivateMessageEvent):
    msg_text = event.get_plaintext().strip()
    # 必须以 / 开头
    if not msg_text.startswith("/"):
        return
        
    # 去除前缀
    cmd_input = msg_text.lstrip("/")
    if not cmd_input: return # 只有 /，忽略

    user_id = str(event.user_id)
    
    # 初始化 Agent 记忆 (使用旧的 AI_SYSTEM_PROMPT)
    if user_id not in ai_memory:
        ai_memory[user_id] = [{"role": "system", "content": AI_SYSTEM_PROMPT}]
    
    ai_memory[user_id].append({"role": "user", "content": cmd_input})
    if len(ai_memory[user_id]) > 20:
        ai_memory[user_id] = [ai_memory[user_id][0]] + ai_memory[user_id][-19:]

    await matcher_agent.send("🤖 (Agent) 收到指令，执行中...")

    # Agent Loop (Max 3 turns)
    for _ in range(3):
        try:
            async with httpx.AsyncClient(timeout=60) as client:
                resp = await client.post(
                    f"{DEEPSEEK_BASE_URL}/chat/completions",
                    json={
                        "model": DEEPSEEK_MODEL,
                        "messages": ai_memory[user_id],
                        "stream": False
                    },
                    headers={"Authorization": f"Bearer {DEEPSEEK_API_KEY}"}
                )
                if resp.status_code != 200:
                    await matcher_agent.finish(f"❌ Agent API Error: {resp.status_code}")
                
                ai_content = resp.json()['choices'][0]['message']['content']
                
            ai_memory[user_id].append({"role": "assistant", "content": ai_content})
            
            cmds = re.findall(r'\[+EXEC:\s*(.*?)(?:\]+|\n|$)', ai_content, re.IGNORECASE)
            
            if not cmds:
                # 只有文本，直接发送并结束
                await matcher_agent.finish(ai_content)
            
            await matcher_agent.send(f"{ai_content}\n\n⚡️ 正在系统执行 {len(cmds)} 条指令...")
            
            results = []
            for cmd in cmds:
                out = execute_sys_cmd(cmd.strip())
                results.append(f"CMD: {cmd}\nOUT:\n{out}")
            
            exec_res_text = "\n".join(results)
            
            # 喂回结果
            ai_memory[user_id].append({"role": "user", "content": f"Command Execution Results:\n{exec_res_text}\n\nPlease analyze this."})
            
        except Exception as e:
            if "FinishedException" in str(type(e)): break # 正常结束
            await matcher_agent.finish(f"❌ Agent Loop Error: {e}")
            break

matcher_new = on_command("new", rule=admin_rule, priority=1)
@matcher_new.handle()
async def handle_new(event: PrivateMessageEvent, args: Message = CommandArg()):
    # 解析参数: /new (默认chat) | /new chat | /new agent | /new all
    target = args.extract_plain_text().strip().lower()
    user_id = str(event.user_id)
    cleared = []

    # 1. Clear Chat (Default or Explicit)
    if (not target) or (target in ["chat", "all"]):
        if user_id in chat_memory:
            del chat_memory[user_id]
            save_chat_memory() # [NEW] 同步更新到文件
            cleared.append("Chat")
            
    # 2. Clear Agent (Explicit or All)
    if target in ["agent", "sys", "all"]:
        if user_id in ai_memory:
            del ai_memory[user_id]
            cleared.append("Agent")

    if cleared:
        await matcher_new.finish(f"🧠 已重置记忆: {', '.join(cleared)}")
    else:
        # 如果指定了目标但没找到记忆
        if target:
            await matcher_new.finish(f"🧠 {target} 记忆已经是空的了。")
        else:
            await matcher_new.finish("🧠 聊天记忆已经是空的了。(使用 `/new all` 重置全部)")


# ==================== � 功能模块: 人设管理 ====================

matcher_persona = on_command("persona", rule=admin_rule, priority=10, block=True)

@matcher_persona.handle()
async def handle_persona(args: Message = CommandArg()):
    global CHAT_SYSTEM_PROMPT
    arg = args.extract_plain_text().strip()
    
    if not arg:
        # 查看当前人设 (只显示角色人格部分)
        preview = CURRENT_PERSONA[:300] + "..." if len(CURRENT_PERSONA) > 300 else CURRENT_PERSONA
        await matcher_persona.finish(f"📝 当前人设 (角色人格):\n{preview}\n\n💡 格式约束会自动附加，无需手动添加。\n\n使用方法:\n• /persona set <内容> - 设置新人设\n• /persona reset - 恢复默认人设")
    
    elif arg.lower() == "reset":
        # 恢复默认人设
        save_persona(DEFAULT_PERSONA)
        # 清空记忆让新人设生效
        chat_memory.clear()
        save_chat_memory()
        await matcher_persona.finish("✅ 人设已恢复默认，聊天记忆已清空。")
    
    elif arg.lower().startswith("set "):
        # 设置新人设
        new_persona = arg[4:].strip()
        if not new_persona:
            await matcher_persona.finish("⚠️ 请提供人设内容，例如: /persona set 你是一个温柔的猫娘...")
        
        save_persona(new_persona)
        # 清空记忆让新人设生效
        chat_memory.clear()
        save_chat_memory()
        preview = new_persona[:200] + "..." if len(new_persona) > 200 else new_persona
        await matcher_persona.finish(f"✅ 人设已更新，聊天记忆已清空。\n新人设:\n{preview}")
    
    else:
        await matcher_persona.finish("⚠️ 未知指令。可用:\n• /persona - 查看当前人设\n• /persona set <内容> - 设置新人设\n• /persona reset - 恢复默认人设")


# ==================== �📬 功能模块: Gmail 监控 ====================

@driver.on_startup
async def start_gmail_monitor():
    logger.info("启动后台任务: Gmail 监控 & 定时提醒 & 主动聊天...")
    load_persona()          # [NEW] 启动时加载人设
    load_chat_memory()      # [NEW] 启动时加载记忆
    load_last_chat_time()   # [FIX] 启动时加载上次互动时间
    logger.info(f"[Proactive] 初始化完成 - 上次互动时间: {LAST_CHAT_TIME.strftime('%Y-%m-%d %H:%M:%S')}")
    load_koyeb_stats()        # [NEW] 加载探活统计
    asyncio.create_task(gmail_loop())
    asyncio.create_task(scheduler_loop())
    asyncio.create_task(random_chat_check())
    asyncio.create_task(koyeb_keepalive_loop())  # [NEW] Koyeb 探活

async def scheduler_loop():
    logger.info("启动定时任务调度器 (每天 08:00 天气, 20:00 新闻)...")
    last_weather_date = ""
    last_news_date = ""

    while True:
        try:
            now = datetime.now()
            current_date = now.strftime("%Y-%m-%d")
            
            # --- 08:00 广州天气 ---
            # 只要是早上8点且今天没发过，就发一次
            if now.hour == 8 and last_weather_date != current_date:
                logger.info("Triggering Morning Weather Task...")
                last_weather_date = current_date
                await push_morning_weather()

            # --- 20:00 每日新闻 ---
            # 只要是晚上8点且今天没发过，就发一次
            if now.hour == 20 and last_news_date != current_date:
                logger.info("Triggering Evening News Task...")
                last_news_date = current_date
                await push_evening_news()

        except Exception as e:
            logger.error(f"Scheduler Error: {e}")
        
        await asyncio.sleep(60)

matcher_test_daily = on_command("test_daily", rule=admin_rule, priority=10, block=True)
@matcher_test_daily.handle()
async def handle_test_daily(args: Message = CommandArg()):
    arg = args.extract_plain_text().strip()
    await matcher_test_daily.send(f"🔄 手动触发每日任务测试 ({arg if arg else 'All'})...")
    
    if not arg or "weather" in arg:
        await push_morning_weather()
    if not arg or "news" in arg:
        await push_evening_news()
        
    await matcher_test_daily.finish("✅ 触发完成")

async def push_morning_weather():
    bot = nonebot.get_bot()
    try:
        # 改为使用 Google Search Grounding 获取实时天气
        today = datetime.now().strftime('%Y-%m-%d')
        prompt = (
            f"今天是 {today}。\n"
            f"请使用搜索工具查找【广州今天的天气】，包括：当前温度、最高/最低温、天气状况、空气质量、是否下雨。\n"
            f"【要求】\n"
            f"1. 必须基于真实搜索结果。\n"
            f"2. 用直男猛1的语气（本猛1、我）来播报。\n"
            f"3. 必须给出霸气的穿衣或出行建议（例如：冷就给老子穿厚点，别感冒了让我操心）。\n"
            f"4. 纯文本输出。"
        )
        
        # 强制开启搜索
        ai_msg = await quick_chat_ask(prompt, use_search=True)
        msg = f"☀️ **早安，咻！**\n\n{ai_msg}"
        
        if ADMIN_ID and ADMIN_ID.isdigit():
             await bot.send_private_msg(user_id=int(ADMIN_ID), message=msg)
             
    except Exception as e:
        logger.error(f"Morning Weather Fail: {e}")

async def push_evening_news():
    bot = nonebot.get_bot()
    try:
        today = datetime.now().strftime('%Y-%m-%d')
        prompt = (
            f"今天是 {today}。\n"
            f"请使用搜索工具查找今天的新闻，需要覆盖以下领域：\n"
            f"1. 国内热点（社会民生、政策动态）\n"
            f"2. 国际要闻（欧美、亚太、中东等地区的重要事件）\n"
            f"3. 科技动态（AI、互联网、科学发现）\n"
            f"4. 财经资讯（股市、经济政策、企业新闻）\n\n"
            f"【要求】\n"
            f"1. 必须基于今天的真实搜索结果，不要编造。\n"
            f"2. 至少提供 5-8 条新闻。\n"
            f"3. 每条新闻需简要说明发生了什么、为何重要。\n"
            f"4. 用猛1的语气（本猛1、我）来播报，霸气一点，可以加点个人点评。\n"
            f"5. 纯文本输出，不要 Markdown，用数字序号分隔各条新闻。"
        )
        
        # 强制开启搜索
        ai_msg = await quick_chat_ask(prompt, use_search=True)
        msg = f"🌙 **晚安，咻！今日要闻来了**\n\n{ai_msg}"
        
        if ADMIN_ID and ADMIN_ID.isdigit():
             await bot.send_private_msg(user_id=int(ADMIN_ID), message=msg)
             
    except Exception as e:
        logger.error(f"Evening News Fail: {e}")

async def random_chat_check():
    """随机主动聊天循环"""
    global LAST_CHAT_TIME
    logger.info("[Proactive] ====== 启动主动聊天检测循环 ======")
    
    check_count = 0  # 检查次数计数
    
    while True:
        try:
            # 随机休眠 45~75 分钟，打破整点规律
            sleep_sec = random.randint(2700, 4500)
            await asyncio.sleep(sleep_sec) 
            
            # 0. 开关检查 - 如果关闭，完全静默跳过，不打印任何日志
            if not ENABLE_PROACTIVE:
                continue
            
            check_count += 1
            now = datetime.now()
            now_str = now.strftime('%Y-%m-%d %H:%M:%S')
            sleep_min = sleep_sec / 60
            
            logger.info(f"[Proactive] ========== 第 {check_count} 次检查 @ {now_str} (休眠了 {sleep_min:.0f} 分钟) ==========")
            logger.info(f"[Proactive] ✅ 开关: 已开启")
            
            # 1. 时间段检查 (10:00 - 22:00) 避免打扰
            if not (10 <= now.hour <= 22):
                logger.info(f"[Proactive] ❌ 时段检查: 当前 {now.hour}:00 不在活动时段 (10:00-22:00)，跳过")
                continue
            logger.info(f"[Proactive] ✅ 时段检查: 当前 {now.hour}:00 在活动时段内")
                
            # 2. 沉默时长检查 (至少4小时才开始有概率触发)
            silence_duration = now - LAST_CHAT_TIME
            silence_hours = silence_duration.total_seconds() / 3600
            last_chat_str = LAST_CHAT_TIME.strftime('%Y-%m-%d %H:%M:%S')
            
            logger.info(f"[Proactive] 📊 上次互动: {last_chat_str}")
            logger.info(f"[Proactive] 📊 已沉默: {silence_hours:.2f} 小时 ({silence_duration})")
            
            if silence_hours < 4:
                logger.info(f"[Proactive] ❌ 沉默时长检查: {silence_hours:.2f}h < 4h 阈值，跳过")
                continue  # 4小时内不触发
            logger.info(f"[Proactive] ✅ 沉默时长检查: {silence_hours:.2f}h >= 4h 阈值，进入概率判定")
                
            # 3. 梯度概率检查
            # 4-12h: 20% | 12-18h: 50% | 18-24h: 80% | 24h+: 100%
            if silence_hours >= 24:
                trigger_prob = 1.0
                prob_tier = "≥24h (强制触发)"
            elif silence_hours >= 18:
                trigger_prob = 0.8
                prob_tier = "18-24h"
            elif silence_hours >= 12:
                trigger_prob = 0.5
                prob_tier = "12-18h"
            else:  # 4-12h
                trigger_prob = 0.2
                prob_tier = "4-12h"
            
            logger.info(f"[Proactive] 🎲 概率档位: {prob_tier} -> 触发概率 = {int(trigger_prob*100)}%")
            
            # 摇骰子
            dice_roll = random.random()
            logger.info(f"[Proactive] 🎲 摇骰子: {dice_roll:.4f} vs 阈值 {trigger_prob:.2f}")
            
            if dice_roll > trigger_prob:
                logger.info(f"[Proactive] ❌ 骰子结果: {dice_roll:.4f} > {trigger_prob:.2f}，未命中，跳过")
                continue
                
            # --- 触发主动聊天 ---
            logger.info(f"[Proactive] 🎉🎉🎉 骰子结果: {dice_roll:.4f} <= {trigger_prob:.2f}，命中！触发主动发送！")
            
            prompt = (
                f"现在是 {now.strftime('%H:%M')}，你和User已经 {silence_hours:.1f} 小时没说话了。\n"
                f"作为他的猛1男友，你觉得有点想他，或者想刷一下存在感。\n"
                f"请主动发一条消息给他。可以是分享生活、稍微撒娇、或者霸气地问他在干嘛。\n"
                f"【要求】\n"
                f"1. 语气自然口语化，不要太长。\n"
                f"2. 符合猛1人设 (自称我/本猛1)。\n"
                f"3. 纯文本，无Markdown。"
            )
            
            logger.info(f"[Proactive] 📤 正在调用 AI 生成消息...")
            ai_msg = await quick_chat_ask(prompt, use_search=False)
            logger.info(f"[Proactive] 📥 AI 回复: {ai_msg[:50]}...")
            
            # 发送 (仅发给 ADMIN)
            if ADMIN_ID and ADMIN_ID.isdigit():
                 bot = nonebot.get_bot()
                 
                 # 先更新时间，防止连续触发
                 LAST_CHAT_TIME = datetime.now()
                 save_last_chat_time()  # [FIX] 保存互动时间
                 logger.info(f"[Proactive] ⏰ 已更新 LAST_CHAT_TIME = {LAST_CHAT_TIME.strftime('%Y-%m-%d %H:%M:%S')}")
                 
                 # 发送
                 await bot.send_private_msg(user_id=int(ADMIN_ID), message=f"🔔 {ai_msg}")
                 logger.info(f"[Proactive] ✅ 消息已发送给 ADMIN_ID={ADMIN_ID}")
                 
                 # [FIX] 把主动发送的消息加入聊天记忆，保持上下文连贯
                 if ADMIN_ID not in chat_memory:
                     chat_memory[ADMIN_ID] = [{"role": "system", "content": CHAT_SYSTEM_PROMPT}]
                 now_str = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
                 chat_memory[ADMIN_ID].append({"role": "assistant", "content": f"[{now_str}] {ai_msg}"})
                 save_chat_memory()
                 logger.info(f"[Proactive] 💾 已将主动消息加入聊天记忆")
            else:
                 logger.warning(f"[Proactive] ⚠️ ADMIN_ID 无效: '{ADMIN_ID}'，无法发送消息")
                 
        except Exception as e:
            logger.error(f"[Proactive] ❌ 循环出错: {e}")
            import traceback
            logger.error(f"[Proactive] Traceback: {traceback.format_exc()}")

# ==================== 🌐 功能模块: Koyeb 探活保活 ====================

async def koyeb_keepalive_loop():
    """随机间隔探活 Koyeb，防止服务休眠"""
    logger.info(f"[Koyeb] 🚀 启动探活循环 - 目标: {KOYEB_URL}")
    # 启动后等待 60 秒再开始第一次探活，确保 Bot 已完全就绪
    await asyncio.sleep(60)
    
    while True:
        try:
            # 执行探活
            koyeb_stats["total"] += 1
            now_str = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
            koyeb_stats["last_time"] = now_str
            
            async with httpx.AsyncClient(timeout=15) as client:
                resp = await client.get(KOYEB_URL)
                
                if resp.status_code == 200:
                    koyeb_stats["success"] += 1
                    koyeb_stats["last_result"] = f"✅ 200 OK"
                    logger.info(f"[Koyeb] ✅ 探活成功 (200) - 第{koyeb_stats['total']}次")
                else:
                    koyeb_stats["fail"] += 1
                    koyeb_stats["last_result"] = f"❌ HTTP {resp.status_code}"
                    logger.warning(f"[Koyeb] ❌ 探活异常: HTTP {resp.status_code}")
                    # 失败推送通知
                    await _koyeb_notify_fail(f"HTTP {resp.status_code}")
                    
        except Exception as e:
            koyeb_stats["total"] = koyeb_stats.get("total", 0)  # 防止异常时未计数
            koyeb_stats["fail"] += 1
            err_msg = str(e)[:100]
            koyeb_stats["last_result"] = f"❌ {err_msg}"
            logger.error(f"[Koyeb] ❌ 探活失败: {e}")
            # 失败推送通知
            await _koyeb_notify_fail(err_msg)
        
        # 保存统计
        save_koyeb_stats()
        
        # 随机等待 20~42 分钟 + ±30秒抖动，确保 45 分钟内至少一次
        base_wait = random.randint(1200, 2520)  # 20~42 分钟
        jitter = random.randint(-30, 30)         # ±30秒抖动
        wait_sec = max(600, base_wait + jitter)   # 最少 10 分钟
        logger.info(f"[Koyeb] ⏰ 下次探活等待: {wait_sec/60:.1f} 分钟")
        await asyncio.sleep(wait_sec)

async def _koyeb_notify_fail(error_msg: str):
    """探活失败时推送 QQ 通知"""
    try:
        if ADMIN_ID and ADMIN_ID.isdigit():
            bot = nonebot.get_bot()
            now_str = datetime.now().strftime("%m-%d %H:%M:%S")
            msg = (
                f"⚠️ Koyeb 探活失败\n"
                f"时间: {now_str}\n"
                f"目标: {KOYEB_URL}\n"
                f"错误: {error_msg}\n"
                f"统计: 总{koyeb_stats['total']}次 | 成功{koyeb_stats['success']} | 失败{koyeb_stats['fail']}"
            )
            await bot.send_private_msg(user_id=int(ADMIN_ID), message=msg)
    except Exception as e:
        logger.error(f"[Koyeb] 推送失败通知出错: {e}")

# /k 指令: 查看探活统计
matcher_koyeb_status = on_command("k", rule=admin_rule, priority=5, block=True)
@matcher_koyeb_status.handle()
async def handle_koyeb_status():
    last_time = koyeb_stats.get("last_time", "暂无")
    last_result = koyeb_stats.get("last_result", "暂无")
    total = koyeb_stats.get("total", 0)
    success = koyeb_stats.get("success", 0)
    fail = koyeb_stats.get("fail", 0)
    success_rate = f"{(success/total*100):.1f}%" if total > 0 else "N/A"
    
    msg = (
        f"🌐 Koyeb 探活统计\n"
        f"───────────────\n"
        f"目标: {KOYEB_URL}\n"
        f"总执行: {total} 次\n"
        f"✅ 成功: {success} 次\n"
        f"❌ 失败: {fail} 次\n"
        f"成功率: {success_rate}\n"
        f"───────────────\n"
        f"上次执行: {last_time}\n"
        f"上次结果: {last_result}"
    )
    await matcher_koyeb_status.finish(msg)

matcher_toggle_poke = on_command("toggle", rule=admin_rule, priority=10, block=True)
@matcher_toggle_poke.handle()
async def handle_toggle_poke():
    global ENABLE_PROACTIVE
    ENABLE_PROACTIVE = not ENABLE_PROACTIVE
    state = "✅ 开启" if ENABLE_PROACTIVE else "❌ 关闭"
    await matcher_toggle_poke.finish(f"主动聊天模式已 {state}")

# [NEW] 手动测试主动聊天
matcher_test_proactive = on_command("test_proactive", rule=admin_rule, priority=10, block=True)
@matcher_test_proactive.handle()
async def handle_test_proactive(event: PrivateMessageEvent):
    """手动触发主动聊天，立即测试，不用等24小时"""
    global LAST_CHAT_TIME
    
    # 显示当前状态
    now = datetime.now()
    silence_hours = (now - LAST_CHAT_TIME).total_seconds() / 3600
    status_msg = (
        f"📊 主动聊天状态:\n"
        f"• 开关: {'✅开启' if ENABLE_PROACTIVE else '❌关闭'}\n"
        f"• 上次互动: {LAST_CHAT_TIME.strftime('%m-%d %H:%M')}\n"
        f"• 已沉默: {silence_hours:.1f} 小时\n\n"
        f"⏳ 正在手动触发主动聊天..."
    )
    await matcher_test_proactive.send(status_msg)
    
    try:
        prompt = (
            f"现在是 {now.strftime('%H:%M')}，你和User已经有一段时间没说话了。\n"
            f"作为他的猛1男友，你觉得有点想他，或者想刷一下存在感。\n"
            f"请主动发一条消息给他。可以是分享生活、稍微撒娇、或者霸气地问他在干嘛。\n"
            f"【要求】\n"
            f"1. 语气自然口语化，不要太长。\n"
            f"2. 符合猛1人设 (自称我/本猛1)。\n"
            f"3. 纯文本，无Markdown。"
        )
        
        ai_msg = await quick_chat_ask(prompt, use_search=False)
        
        # 更新时间
        LAST_CHAT_TIME = datetime.now()
        save_last_chat_time()  # 保存到文件
        
        # [FIX] 把测试消息也加入聊天记忆
        user_id = str(event.user_id)
        if user_id not in chat_memory:
            chat_memory[user_id] = [{"role": "system", "content": CHAT_SYSTEM_PROMPT}]
        now_str = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        chat_memory[user_id].append({"role": "assistant", "content": f"[{now_str}] {ai_msg}"})
        save_chat_memory()
        
        await matcher_test_proactive.finish(f"🔔 主动消息测试:\n{ai_msg}")
        
    except Exception as e:
        if "FinishedException" in str(type(e)): raise  # 正常流程，继续抛出
        await matcher_test_proactive.finish(f"❌ 测试失败: {e}")

async def quick_chat_ask(user_text, use_search=False):
    """复用 Chat API 的简单调用函数 (Gemini Native, 含3次重试)"""
    messages = [
        {"role": "system", "content": CHAT_SYSTEM_PROMPT},
        {"role": "user", "content": user_text}
    ]
    payload = convert_to_gemini_payload(messages, use_search=use_search)
    url = f"{CHAT_BASE_URL}/v1beta/models/{CHAT_MODEL}:generateContent?key={CHAT_API_KEY}"
    
    max_retries = 3
    retry_delays = [5, 15, 30]  # 递增退避: 5s, 15s, 30s
    
    for attempt in range(max_retries):
        try:
            async with httpx.AsyncClient(timeout=60) as client:
                resp = await client.post(
                    url,
                    json=payload,
                    headers={"Content-Type": "application/json"}
                )
                if resp.status_code == 200:
                    data = resp.json()
                    return data['candidates'][0]['content']['parts'][0]['text']
                
                # 429 限流或 5xx 服务端错误 -> 重试
                if resp.status_code in (429, 500, 502, 503) and attempt < max_retries - 1:
                    delay = retry_delays[attempt]
                    logger.warning(f"[QuickChat] ⚠️ HTTP {resp.status_code}, 第{attempt+1}次重试, {delay}s后...")
                    await asyncio.sleep(delay)
                    continue
                
                return f"AI 响应错误: {resp.status_code} {resp.text[:50]}"
                
        except Exception as e:
            if attempt < max_retries - 1:
                delay = retry_delays[attempt]
                logger.warning(f"[QuickChat] ⚠️ 请求异常: {e}, 第{attempt+1}次重试, {delay}s后...")
                await asyncio.sleep(delay)
                continue
            return f"AI 请求异常: {e}"
    
    return "AI 请求失败: 重试次数耗尽"

async def gmail_loop():
    while True:
        try:
            # 异步运行同步的 IMAP 操作
            loop = asyncio.get_running_loop()
            emails = await loop.run_in_executor(None, check_gmail_sync)
            
            if emails:
                bot = nonebot.get_bot()
                for mail in emails:
                    msg = (
                        f"📧 **新邮件 ({mail['inbox']})**\nFrom: {mail['from']}\nSub: {mail['subject']}\n\n"
                        f"{mail['summary']}"
                    )
                    # 尝试推送到 ADMIN
                    try:
                        # 注意：需要确保 bot 实例已连接且 ADMIN_ID 正确
                        if ADMIN_ID and ADMIN_ID.isdigit():
                             await bot.send_private_msg(user_id=int(ADMIN_ID), message=msg)
                    except Exception as e:
                        logger.error(f"推送邮件失败: {e}")
                        
        except Exception as e:
            logger.error(f"Gmail 循环出错: {e}")
            
        # 缩短轮询间隔为 30 秒
        await asyncio.sleep(30)

matcher_test_email = on_command("test_email", rule=admin_rule, priority=10, block=True)
@matcher_test_email.handle()
async def handle_test_email():
    await matcher_test_email.send("📧 正在手动检查邮件...")
    try:
        loop = asyncio.get_running_loop()
        # 强制运行一次 (开启测试模式: 抓最新一封，无论是否已读)
        results = await loop.run_in_executor(None, lambda: check_gmail_sync(test_mode=True))
        if not results:
            await matcher_test_email.finish("✅ 检查完成，没有发现邮件 (收件箱为空?)。")
        else:
            msg_list = []
            for mail in results:
                 msg_list.append(
                     f"📧 {mail['subject']}\n"
                     f"From: {mail['from']}\n"
                     f"{mail['summary']}"
                 )
            
            final_msg = f"✅ 检查完成，抓取到 {len(results)} 封邮件：\n\n" + "\n\n-----------------\n\n".join(msg_list)
            await matcher_test_email.finish(final_msg)
    except Exception as e:
        if "FinishedException" in str(type(e)): raise e
        await matcher_test_email.finish(f"❌ 检查邮件失败: {e}")

# --------------------
# 辅助函数: 简单清理 HTML
# --------------------
def clean_html_simple(html_content):
    if not html_content: return ""
    # 1. 去除 <style> <script>
    cleaned = re.sub(r'<(style|script|head)[^>]*>.*?</\1>', '', html_content, flags=re.IGNORECASE|re.DOTALL)
    # 2. 将 <br> <p> </div> 替换为换行
    cleaned = re.sub(r'<(br\s*/?|/p|/div|/li)>', '\n', cleaned, flags=re.IGNORECASE)
    # 3. 去除所有其他标签
    cleaned = re.sub(r'<[^>]+>', '', cleaned)
    # 4. 解码常见实体
    cleaned = cleaned.replace('&nbsp;', ' ').replace('&lt;', '<').replace('&gt;', '>').replace('&amp;', '&').replace('&quot;', '"')
    # 5. 去除多余空行
    cleaned = re.sub(r'\n\s*\n', '\n\n', cleaned)
    return cleaned.strip()

def check_gmail_sync(test_mode=False):
    results = []
    # 简化版: 只检查第一个账号示例
    # 实际应遍历 GMAIL_ACCOUNTS
    for acc in GMAIL_ACCOUNTS:
        try:
            logger.info(f"[Gmail] Connecting to {acc['user']}...")
            mail = imaplib.IMAP4_SSL(IMAP_SERVER)
            mail.login(acc['user'], acc['password'])
            mail.select("inbox")
            
            # 搜索策略: 测试模式查所有，日常只查未读
            criteria = "ALL" if test_mode else "UNSEEN"
            status, messages = mail.search(None, criteria)
            logger.info(f"[Gmail] {acc['user']} search ({criteria}) status: {status}")
            
            if status == "OK":
                ids = messages[0].split()
                if not ids: continue
                
                # 策略: 每次轮询只处理最新的 1 封
                # 如果是测试模式，也只拿最后一封
                for num in ids[-1:]:
                    try:
                        _, data = mail.fetch(num, "(RFC822)")
                        msg = email.message_from_bytes(data[0][1])
                        
                        # 解析标题
                        subject_header = decode_header(msg["Subject"])[0]
                        subject = subject_header[0]
                        encoding = subject_header[1]
                        if isinstance(subject, bytes):
                            subject = subject.decode(encoding if encoding else "utf-8")
                            
                        from_ = msg.get("From")
                        logger.info(f"[Gmail] Found new mail: {subject}")
                        
                        # 解析正文 (优化版: 支持 HTML 清洗)
                        content = ""
                        html_part = ""
                        
                        if msg.is_multipart():
                            for part in msg.walk():
                                c_type = part.get_content_type()
                                if c_type == "text/plain":
                                    try:
                                        content += part.get_payload(decode=True).decode()
                                    except: pass
                                elif c_type == "text/html":
                                    try:
                                        html_part += part.get_payload(decode=True).decode()
                                    except: pass
                        else:
                            try:
                                payload = msg.get_payload(decode=True).decode()
                                if msg.get_content_type() == "text/html":
                                    html_part = payload
                                else:
                                    content = payload
                            except: pass
                        
                        # 优先使用纯文本，如果没有则清洗 HTML
                        if not content and html_part:
                            content = clean_html_simple(html_part)
                        elif content:
                            # 即使是纯文本，有时也会包含一些残留 tags，简单处理下
                            # 但主要依赖 clean_html_simple 处理 html_part
                            pass
                        
                        # 最后的防线: 如果经过清洗还是没东西
                        if not content: 
                            if html_part: 
                                content = clean_html_simple(html_part) # 再试一次? 其实前面已经试过了
                            else:
                                content = "(无文本内容)"
                            
                        #若是 HTML 导致为空，尝试不做严格解析，直接取
                        if not content: content = "(无纯文本内容)"

                        # 1. 尝试用正则提取验证码 (更准更快)
                        import re
                        code_match = re.search(r"(?i)(?:验证码|code|verification|登录|确认).{0,20}?(\d{4,8})", subject + content)
                        code_str = ""
                        if code_match:
                            code_str = code_match.group(1)
                            
                        # AI 摘要 (Sync Request)
                        summary = "AI摘要失败"
                        try:
                            # 动态调整 Prompt
                            verification_instruction = ""
                            if code_str:
                                verification_instruction = f"【重要】检测到验证码：{code_str}，请务必在摘要第一行高亮显示该验证码。"
                            
                            prompt = (
                                "请阅读以下邮件内容，并按格式输出：\n"
                                "1. 翻译成中文\n"
                                "2. 总结核心内容 (100字以内)\n"
                                "3. 绝对禁止使用 Markdown 格式 (如 **粗体**)，只输出纯文本。\n"
                                f"{verification_instruction}\n\n"
                                f"邮件内容:\n{content[:2000]}"
                            )
                            resp = requests.post(
                                f"{DEEPSEEK_BASE_URL}/chat/completions",
                                json={
                                    "model": DEEPSEEK_MODEL,
                                    "messages": [{"role": "user", "content": prompt}],
                                    "stream": False
                                },
                                headers={"Authorization": f"Bearer {DEEPSEEK_API_KEY}"},
                                timeout=30
                            )
                            if resp.status_code == 200:
                                summary = resp.json()['choices'][0]['message']['content']
                                # 双重保险：如果 AI 没提，强制加在前面
                                if code_str and code_str not in summary:
                                    summary = f"🔑 验证码: {code_str}\n\n{summary}"
                            else:
                                summary = f"API Error: {resp.status_code}"
                        except Exception as ai_e:
                            summary = f"AI Error: {ai_e}"
                        
                        results.append({
                            "inbox": acc['user'],
                            "from": from_,
                            "subject": subject,
                            "summary": summary
                        })
                    except Exception as e:
                        logger.error(f"[Gmail] Error parsing email {num}: {e}")

            mail.close()
            mail.logout()
        except Exception as e:
            logger.error(f"[Gmail] Check mail error for {acc['user']}: {e}")
    return results



    return results




# ==================== 🔊 功能模块: TTS 语音合成 ====================

matcher_tts = on_command("tts", aliases={"语音", "朗读"}, rule=admin_rule, priority=5, block=True)

@matcher_tts.handle()
async def handle_tts(event: PrivateMessageEvent):
    # 1. Check Reply
    reply = event.reply
    if not reply:
        await matcher_tts.finish("⚠️ 请先**回复**一条消息，然后发送 /tts")
    
    text = reply.message.extract_plain_text().strip()
    if not text:
        await matcher_tts.finish("⚠️ 回复的消息没有文字内容。")

    await matcher_tts.send("🔊 正在转换...")

    # 2. Call Helper
    audio_b64 = await get_tts_audio(text)
    
    if audio_b64:
        file_uri = f"base64://{audio_b64}"
        await matcher_tts.finish(MessageSegment.record(file=file_uri))
    else:
        await matcher_tts.finish("❌ 语音转换失败 (APIError)，请检查后台日志。")

matcher_new = on_command("new", rule=admin_rule, priority=1, block=True)

# ... (handle_new implementation remains same)


# 启动入口
if __name__ == "__main__":
    nonebot.run()
