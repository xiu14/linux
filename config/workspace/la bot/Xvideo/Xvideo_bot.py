import os
import asyncio
import sys
import logging
import subprocess
import glob
import shutil
import html as html_lib
import http.cookiejar
import requests  # 用于调用 AList API
from telegram import Update, BotCommand
from telegram.ext import ApplicationBuilder, ContextTypes, CommandHandler, MessageHandler, filters

# ==================== ⚙️ 配置区域 (请仔细修改这里) ====================

# 1. Telegram 配置
BOT_TOKEN = os.getenv("BOT_TOKEN", "7735812062:AAGTlz39K3P3VzuVfu6QHsYvuqhFRQh6wec")
try:
    ADMIN_ID = int(os.getenv("ADMIN_ID", "7181386196"))
except ValueError:
    ADMIN_ID = 7181386196

# 2. 工具配置
COOKIE_FILE = os.getenv("COOKIE_FILE", "/root/cookies.txt")
COOKIE_DIR = os.getenv("COOKIE_DIR", os.path.join(os.path.dirname(COOKIE_FILE), "cookies"))
DOWNLOAD_DIR = os.getenv("DOWNLOAD_DIR", "/root/downloads/bot_temp")
LOG_FILE = os.getenv("LOG_FILE", "bot.log")
USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"

# 3. [核心] AList 配置 (用于上传到 R2)
# AList 地址
ALIST_HOST = os.getenv("ALIST_HOST", "http://127.0.0.1:5244")

# AList 管理员 Token
ALIST_TOKEN = os.getenv("ALIST_TOKEN", "alist-6c1a4f0a-3710-4ef6-b55f-90ea816bc7b1hKAPXqhoN5adpwRQElLZdRar0UuW5gvj0YcvFPtGfpBg0GEpHtVfAzLFRs0Iiv64")

# 上传目标路径
ALIST_UPLOAD_PATH = os.getenv("ALIST_UPLOAD_PATH", "/2R2/Download")
ALIST_IMAGE_PATH = os.getenv("ALIST_IMAGE_PATH", "/2R2/Images")

# ====================================================================

# 配置日志
logging.basicConfig(
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s',
    level=logging.INFO,
    handlers=[
        logging.FileHandler(LOG_FILE, encoding='utf-8'),
        logging.StreamHandler(sys.stdout)
    ]
)
logger = logging.getLogger(__name__)
logging.getLogger("httpx").setLevel(logging.WARNING)  # 抑制轮询日志刷屏

# 存储待上传文件信息 (等待用户确认改名)
pending_uploads = {}

# --- 装饰器：只允许管理员使用 ---
def admin_only(func):
    async def wrapper(update: Update, context: ContextTypes.DEFAULT_TYPE, *args, **kwargs):
        user_id = update.effective_user.id
        if user_id != ADMIN_ID:
            await context.bot.send_message(chat_id=update.effective_chat.id, text="⛔️ 你没有权限执行此操作。")
            return
        return await func(update, context, *args, **kwargs)
    return wrapper

# --- 指令：/start ---
async def start(update: Update, context: ContextTypes.DEFAULT_TYPE):
    msg = (
        "👋 **我是你的通用视频下载管家**\n\n"
        "📥 **功能：**\n支持 1000+ 网站 (Twitter, PlayVids, YouTube, TikTok 等)\n下载视频 -> 上传到 AList (R2) -> 删除本地文件。\n\n"
        "🛠 **指令：**\n/log - 查看日志\n/status - 查看服务器状态\n/update_tool - 更新 yt-dlp"
    )
    await context.bot.send_message(chat_id=update.effective_chat.id, text=msg, parse_mode='Markdown')

# --- 指令：/log (查看日志) ---
@admin_only
async def view_log(update: Update, context: ContextTypes.DEFAULT_TYPE):
    try:
        if not os.path.exists(LOG_FILE):
             await context.bot.send_message(chat_id=update.effective_chat.id, text="⚠️ 暂时还没有日志文件。")
             return

        cmd = ["tail", "-n", "15", LOG_FILE]
        output = subprocess.check_output(cmd, text=True)
        
        if len(output) > 4000:
            output = output[-4000:]

        await context.bot.send_message(chat_id=update.effective_chat.id, text=f"📄 **服务器最近日志：**\n```\n{output}\n```", parse_mode='Markdown')
    except Exception as e:
        await context.bot.send_message(chat_id=update.effective_chat.id, text=f"❌ 读取失败：{str(e)}")

# --- 指令：/status (查看磁盘) ---
@admin_only
async def check_status(update: Update, context: ContextTypes.DEFAULT_TYPE):
    try:
        df = subprocess.check_output(["df", "-h", "/"], text=True)
        lines = df.strip().split('\n')
        info = lines[1] if len(lines) > 1 else "无法获取"
        
        await context.bot.send_message(chat_id=update.effective_chat.id, text=f"🖥 **VPS 存储状态：**\n`{info}`", parse_mode='Markdown')
    except Exception as e:
        await context.bot.send_message(chat_id=update.effective_chat.id, text=f"❌ 获取状态失败：{str(e)}")

# --- 辅助函数：获取当前环境中的 yt-dlp 版本 ---
def get_yt_dlp_version():
    commands = [
        [sys.executable, "-m", "yt_dlp", "--version"],
        ["yt-dlp", "--version"],
    ]

    for cmd in commands:
        try:
            process = subprocess.run(cmd, capture_output=True, text=True, timeout=30)
            if process.returncode == 0:
                version = (process.stdout or process.stderr).strip()
                if version:
                    return version
        except Exception:
            continue

    return "未知"

# --- [新增] 指令：/update_tool (更新 yt-dlp) ---
@admin_only
async def update_tool(update: Update, context: ContextTypes.DEFAULT_TYPE):
    status_msg = await context.bot.send_message(chat_id=update.effective_chat.id, text="🔄 正在更新 yt-dlp 内核...")
    
    try:
        before_version = get_yt_dlp_version()

        # 这个项目中的 yt-dlp 是通过 pip 安装的，必须用 pip 升级
        cmd = [sys.executable, "-m", "pip", "install", "--upgrade", "--disable-pip-version-check", "yt-dlp"]
        process = subprocess.run(cmd, capture_output=True, text=True, timeout=300)
        after_version = get_yt_dlp_version()

        if process.returncode == 0:
            output = (process.stdout or process.stderr).strip()
            if len(output) > 3500:
                output = output[-3500:]

            if before_version == after_version:
                msg = (
                    f"✅ yt-dlp 已检查完成，无需更新\n"
                    f"当前版本：{after_version}\n\n"
                    f"pip 输出：\n{output or 'Requirement already satisfied'}"
                )
            else:
                msg = (
                    f"✅ yt-dlp 更新成功\n"
                    f"更新前：{before_version}\n"
                    f"更新后：{after_version}\n\n"
                    f"pip 输出：\n{output or '更新完成'}"
                )
        else:
            error_output = (process.stderr or process.stdout or "未知错误").strip()
            if len(error_output) > 3500:
                error_output = error_output[-3500:]

            msg = (
                f"❌ yt-dlp 更新失败\n"
                f"当前版本：{before_version}\n\n"
                f"错误信息：\n{error_output}"
            )

        await context.bot.edit_message_text(
            chat_id=update.effective_chat.id,
            message_id=status_msg.message_id,
            text=msg
        )

    except Exception as e:
        await context.bot.edit_message_text(
            chat_id=update.effective_chat.id,
            message_id=status_msg.message_id,
            text=f"❌ 执行出错：{str(e)}"
        )

from urllib.parse import quote, urljoin, urlparse # 解决中文路径报错

# --- 辅助函数：刷新 AList 目录 ---
def refresh_alist_path(path):
    refresh_url = f"{ALIST_HOST}/api/fs/list"
    refresh_data = {
        "path": path,
        "refresh": True
    }
    try:
        requests.post(refresh_url, headers={"Authorization": ALIST_TOKEN}, json=refresh_data)
        logger.info(f"已触发目录刷新: {path}")
    except Exception as e:
        logger.warning(f"目录刷新失败: {e}")

import re # 用于正则替换文件名

# --- 辅助函数：清洗文件名 ---
def resolve_cookie_file(url):
    try:
        hostname = (urlparse(url).hostname or "").lower().strip(".")
    except Exception:
        hostname = ""

    if hostname and os.path.isdir(COOKIE_DIR):
        candidates = []
        if hostname in {"x.com", "www.x.com", "twitter.com", "www.twitter.com", "mobile.x.com", "mobile.twitter.com"}:
            candidates.extend(["x.com", "twitter.com"])

        parts = hostname.split(".")
        for i in range(len(parts) - 1):
            candidate = ".".join(parts[i:])
            if candidate not in candidates:
                candidates.append(candidate)

        for candidate in candidates:
            candidate_path = os.path.join(COOKIE_DIR, f"{candidate}.txt")
            if os.path.exists(candidate_path):
                logger.info(f"Using site-specific cookies: {candidate_path}")
                return candidate_path

    if os.path.exists(COOKIE_FILE):
        logger.info(f"Using default cookies: {COOKIE_FILE}")
        return COOKIE_FILE

    logger.warning(f"No cookie file found for url: {url}")
    return None


def create_http_session(cookie_file=None):
    session = requests.Session()
    session.headers.update({"User-Agent": USER_AGENT})

    if cookie_file and os.path.exists(cookie_file):
        try:
            cookie_jar = http.cookiejar.MozillaCookieJar()
            cookie_jar.load(cookie_file, ignore_discard=True, ignore_expires=True)
            session.cookies.update(cookie_jar)
        except Exception as e:
            logger.warning(f"Failed to load cookies from {cookie_file}: {e}")

    return session


def normalize_extracted_url(raw_url, base_url):
    if not raw_url:
        return None

    candidate = html_lib.unescape(raw_url).replace("\\/", "/").strip().strip("'\"")
    if not candidate or candidate.startswith(("javascript:", "data:", "blob:")):
        return None

    if candidate.startswith("//"):
        scheme = urlparse(base_url).scheme or "https"
        candidate = f"{scheme}:{candidate}"
    elif re.match(r"^[a-z0-9.-]+\.[a-z]{2,}(?:[/:?].*)?$", candidate, re.IGNORECASE):
        candidate = f"https://{candidate}"

    return urljoin(base_url, candidate)


def extract_title_from_html(html_content):
    for pattern in [
        r'<meta[^>]+property=["\']og:title["\'][^>]+content=["\']([^"\']+)["\']',
        r'<meta[^>]+name=["\']twitter:title["\'][^>]+content=["\']([^"\']+)["\']',
        r'<title[^>]*>(.*?)</title>',
        r'<h1[^>]*>(.*?)</h1>',
    ]:
        match = re.search(pattern, html_content, re.IGNORECASE | re.DOTALL)
        if match:
            title = re.sub(r"<[^>]+>", "", html_lib.unescape(match.group(1))).strip()
            if title:
                return re.sub(r'[<>:"/\\|?*]', '_', title)
    return None


def extract_urls_from_html(base_url, html_content):
    media_candidates = []
    page_candidates = []
    seen_media = set()
    seen_pages = set()
    html_variants = [html_content]

    decoded_html = html_lib.unescape(html_content)
    decoded_html = decoded_html.replace("\\u002F", "/").replace("\\/", "/")
    if decoded_html != html_content:
        html_variants.append(decoded_html)

    def add_media(raw_url):
        normalized = normalize_extracted_url(raw_url, base_url)
        if not normalized:
            return
        lowered = normalized.lower()
        if any(token in lowered for token in [".m3u8", ".mp4", ".webm", ".mkv", ".mpd", ".mov", ".m4v"]):
            if normalized not in seen_media:
                seen_media.add(normalized)
                media_candidates.append(normalized)

    def add_page(raw_url):
        normalized = normalize_extracted_url(raw_url, base_url)
        if not normalized:
            return
        if normalized not in seen_pages:
            seen_pages.add(normalized)
            page_candidates.append(normalized)

    media_patterns = [
        r'<source[^>]+src=["\']([^"\']+)["\']',
        r'<video[^>]+src=["\']([^"\']+)["\']',
        r'["\'](?:file|src|video|videoUrl|video_url|playUrl|play_url|hlsUrl|hls_url|contentUrl|content_url|url)["\']\s*[:=]\s*["\']([^"\']+)["\']',
        r'(https?:\/\/[^\s"\'<>\\]+(?:\.m3u8|\.mp4|\.webm|\.mkv|\.mpd|\.mov|\.m4v)[^\s"\'<>\\]*)',
        r'(\/\/[^\s"\'<>\\]+(?:\.m3u8|\.mp4|\.webm|\.mkv|\.mpd|\.mov|\.m4v)[^\s"\'<>\\]*)',
        r'(https?:\\\\/\\\\/[^\s"\'<>]+(?:\.m3u8|\.mp4|\.webm|\.mkv|\.mpd|\.mov|\.m4v)[^\s"\'<>]*)',
        r'(video\.twimg\.com[^\s"\'<>]+(?:\.m3u8|\.mp4)[^\s"\'<>]*)',
    ]
    for variant in html_variants:
        for pattern in media_patterns:
            for match in re.findall(pattern, variant, re.IGNORECASE):
                add_media(match)

    page_patterns = [
        r'<iframe[^>]+src=["\']([^"\']+)["\']',
        r'<embed[^>]+src=["\']([^"\']+)["\']',
    ]
    for variant in html_variants:
        for pattern in page_patterns:
            for match in re.findall(pattern, variant, re.IGNORECASE):
                add_page(match)

    return media_candidates, page_candidates


def resolve_html_media_candidates(url, cookie_file=None, max_depth=2, max_pages=6):
    session = create_http_session(cookie_file)
    queue = [(url, 0)]
    visited = set()
    media_candidates = []
    seen_media = set()
    detected_title = None

    while queue and len(visited) < max_pages:
        current_url, depth = queue.pop(0)
        if current_url in visited:
            continue
        visited.add(current_url)

        try:
            response = session.get(
                current_url,
                headers={"Referer": current_url, "User-Agent": USER_AGENT},
                timeout=20,
            )
            response.raise_for_status()
        except Exception as e:
            logger.warning(f"HTML fallback fetch failed for {current_url}: {e}")
            continue

        content_type = (response.headers.get("Content-Type") or "").lower()
        final_url = response.url

        if any(token in content_type for token in ["application/vnd.apple.mpegurl", "video/", "application/dash+xml"]):
            if final_url not in seen_media:
                seen_media.add(final_url)
                media_candidates.append(final_url)
            continue

        html_content = response.text
        if not detected_title:
            detected_title = extract_title_from_html(html_content)

        found_media, found_pages = extract_urls_from_html(final_url, html_content)
        for candidate in found_media:
            if candidate not in seen_media:
                seen_media.add(candidate)
                media_candidates.append(candidate)

        if depth < max_depth:
            for candidate in found_pages:
                if candidate not in visited:
                    queue.append((candidate, depth + 1))

    return media_candidates, detected_title


def build_ytdlp_command(download_url, referer, cookie_file, output_template):
    cmd = ["yt-dlp"]
    if cookie_file:
        cmd.extend(["--cookies", cookie_file])

    cmd.extend([
        "--paths", DOWNLOAD_DIR,
        "-o", output_template,
        "--merge-output-format", "mp4",
        "--no-playlist",
        "--referer", referer,
        "--add-header", f"User-Agent: {USER_AGENT}",
        download_url,
    ])
    return cmd


def find_downloaded_media_files():
    patterns = ["*.mp4", "*.webm", "*.mkv", "*.mov", "*.m4v", "*.ts"]
    files = []
    for pattern in patterns:
        files.extend(glob.glob(os.path.join(DOWNLOAD_DIR, pattern)))
    return files


def is_direct_media_url(url):
    lowered = (url or "").lower()
    return any(token in lowered for token in [".mp4", ".m3u8", ".webm", ".mkv", ".mpd", ".mov", ".m4v", "video.twimg.com/"])


def guess_media_extension(download_url, content_type=""):
    path = urlparse(download_url).path
    ext = os.path.splitext(path)[1].lower()
    if ext in [".mp4", ".webm", ".mkv", ".mov", ".m4v", ".ts", ".mpd", ".m3u8"]:
        return ext

    content_type = (content_type or "").lower()
    if "mp4" in content_type:
        return ".mp4"
    if "webm" in content_type:
        return ".webm"
    if "mpegurl" in content_type:
        return ".m3u8"
    if "dash+xml" in content_type:
        return ".mpd"
    return ".mp4"


def build_direct_download_path(output_template, download_url, content_type=""):
    ext = guess_media_extension(download_url, content_type)
    filename = output_template.replace("%(ext)s", ext.lstrip("."))
    if "%(" in filename:
        filename = f"direct_media{ext}"
    filename = sanitize_filename(filename)
    return os.path.join(DOWNLOAD_DIR, filename)


def download_direct_media(download_url, referer, cookie_file, output_template):
    session = create_http_session(cookie_file)
    response = session.get(
        download_url,
        headers={"Referer": referer, "User-Agent": USER_AGENT},
        stream=True,
        timeout=60,
    )
    response.raise_for_status()

    save_path = build_direct_download_path(output_template, download_url, response.headers.get("Content-Type"))
    with open(save_path, "wb") as f:
        for chunk in response.iter_content(1024 * 1024):
            if chunk:
                f.write(chunk)

    return save_path


def sanitize_filename(filename):
    # 将空格、#、?、& 等特殊符号替换为下划线
    # 保留中文、字母、数字、点、下划线、横线
    # AList/URL 中 # 号极其容易导致路径截断，必须去掉
    name, ext = os.path.splitext(filename)
    safe_name = re.sub(r'[#\s\?&]+', '_', name)
    return f"{safe_name}{ext}"

# --- 辅助函数：通用上传逻辑 ---
async def process_upload(file_path, target_folder, context, chat_id, message_id):
    # 1. 清洗文件名 (避免 AList 路径错误)
    original_name = os.path.basename(file_path)
    safe_name = sanitize_filename(original_name)
    
    # 如果文件名变了，重命名本地文件
    if safe_name != original_name:
        new_path = os.path.join(os.path.dirname(file_path), safe_name)
        os.rename(file_path, new_path)
        file_path = new_path
        file_name = safe_name
        # logger.info(f"文件名已自动清洗: {original_name} -> {safe_name}")
    else:
        file_name = original_name

    file_size_mb = os.path.getsize(file_path) / (1024 * 1024)

    try:
        await context.bot.edit_message_text(chat_id=chat_id, message_id=message_id, text=f"☁️ 正在上传到 R2 ({file_size_mb:.1f} MB)...")
        
        upload_url = f"{ALIST_HOST}/api/fs/put"
        full_upload_path = f"{target_folder}/{file_name}".replace("//", "/")
        
        # 关键修正：使用 latin-1 编码技巧透传 UTF-8 字节
        # 这样 AList 能收到原始的中文文件名，而不是 URL 编码后的 %E4...
        try:
             encoded_path = full_upload_path.encode('utf-8').decode('latin-1')
        except Exception:
             # 如果转换失败（极少见），回退到 URL 编码
             encoded_path = quote(full_upload_path)
             
        headers = {
            "Authorization": ALIST_TOKEN,
            "File-Path": encoded_path
        }

        # 使用 run_in_executor 将阻塞的 requests 操作放到线程池中运行
        # 否则上传大文件时，整个 Bot 会卡死，导致 Telegram 心跳丢失抛出 TimedOut
        loop = asyncio.get_running_loop()
        
        def upload_sync():
            with open(file_path, 'rb') as f:
                return requests.put(upload_url, headers=headers, data=f)

        response = await loop.run_in_executor(None, upload_sync)
            
        if response.status_code == 200 and response.json().get('code') == 200:
            os.remove(file_path) # 删除本地
            
            # 刷新也是网络请求，建议也放进 executor (虽然通常很快)
            await loop.run_in_executor(None, refresh_alist_path, target_folder) 
            
            await context.bot.edit_message_text(
                chat_id=chat_id, 
                message_id=message_id, 
                text=f"✅ **处理完成！**\n\n📄 `{file_name}`\n☁️ 已存入: `{target_folder}`\n🗑 本地缓存已清除, 目录已刷新", 
                parse_mode='Markdown'
            )
        else:
            await context.bot.edit_message_text(chat_id=chat_id, message_id=message_id, text=f"❌ 上传失败: {response.text}")
            
    except Exception as e:
        logger.error(f"上传异常: {e}")
        await context.bot.edit_message_text(chat_id=chat_id, message_id=message_id, text=f"❌ 上传过程出错: {e}")


# --- 核心功能：处理文本 (URL 或改名回复) ---
async def prompt_pending_upload(file_path, target_folder, context, chat_id, message_id, prefix_text="文件已准备完成"):
    file_name = os.path.basename(file_path)
    file_size_mb = os.path.getsize(file_path) / (1024 * 1024)

    pending_uploads[chat_id] = {
        'file_path': file_path,
        'target_folder': target_folder
    }

    await context.bot.edit_message_text(
        chat_id=chat_id,
        message_id=message_id,
        text=(
            f"{prefix_text} ({file_size_mb:.1f} MB)\n\n"
            f"当前文件名：\n{file_name}\n\n"
            f"回复 `/` 使用默认名称上传\n"
            f"或直接发送新的文件名（不含扩展名）"
        )
    )


@admin_only
async def handle_url_message(update: Update, context: ContextTypes.DEFAULT_TYPE):
    chat_id = update.effective_chat.id
    text = update.message.text.strip()
    
    # ========== 检查是否有待处理的改名任务 ==========
    if chat_id in pending_uploads:
        file_info = pending_uploads.pop(chat_id)
        file_path = file_info['file_path']
        target_folder = file_info['target_folder']
        
        # 发送新的状态消息
        status_msg = await context.bot.send_message(chat_id=chat_id, text="📝 处理中...")
        
        if text == '/':
            # 使用默认文件名，不做任何修改
            pass
        else:
            # 用户输入了新文件名，进行重命名
            ext = os.path.splitext(file_path)[1]  # 保留原扩展名
            safe_name = sanitize_filename(text)
            new_path = os.path.join(os.path.dirname(file_path), f"{safe_name}{ext}")
            try:
                os.rename(file_path, new_path)
                file_path = new_path
                logger.info(f"文件已重命名: {os.path.basename(file_info['file_path'])} -> {safe_name}{ext}")
            except Exception as e:
                await context.bot.edit_message_text(chat_id=chat_id, message_id=status_msg.message_id, text=f"❌ 重命名失败: {e}")
                return
        
        # 执行上传
        await process_upload(file_path, target_folder, context, chat_id, status_msg.message_id)
        return
    
    # ========== 正常的 URL 处理流程 ==========
    if "http" not in text: return
    url = text

    status_msg = await context.bot.send_message(chat_id=chat_id, text="🔍 正在解析链接...", reply_to_message_id=update.message.message_id)
    if not os.path.exists(DOWNLOAD_DIR): os.makedirs(DOWNLOAD_DIR)

    # 1. 判断是否为图片链接 (图片不询问改名，直接上传)
    lower_url = url.lower()
    if any(lower_url.endswith(ext) for ext in ['.jpg', '.jpeg', '.png', '.gif', '.webp']):
        # 图片下载流程
        try:
            await context.bot.edit_message_text(chat_id=chat_id, message_id=status_msg.message_id, text="⬇️ 正在下载图片...")
            filename = url.split("/")[-1].split("?")[0]
            if not filename: filename = f"image.jpg"
            save_path = os.path.join(DOWNLOAD_DIR, filename)

            headers = {'User-Agent': 'Mozilla/5.0'} 
            r = requests.get(url, headers=headers, stream=True)
            if r.status_code == 200:
                with open(save_path, 'wb') as f:
                    for chunk in r.iter_content(1024): f.write(chunk)
                await process_upload(save_path, ALIST_IMAGE_PATH, context, chat_id, status_msg.message_id)
            else:
                await context.bot.edit_message_text(chat_id=chat_id, message_id=status_msg.message_id, text=f"❌ 图片下载失败 HTTP {r.status_code}")
        except Exception as e:
            await context.bot.edit_message_text(chat_id=chat_id, message_id=status_msg.message_id, text=f"❌ 下载出错: {e}")
        return

    # 2. 视频下载流程 (yt-dlp)
    try:
        await context.bot.edit_message_text(chat_id=chat_id, message_id=status_msg.message_id, text="⬇️ 正在调用 yt-dlp 下载...")
        
        # 清理旧文件
        for f in glob.glob(os.path.join(DOWNLOAD_DIR, "*")):
            try: os.remove(f)
            except: pass

        cookie_file = resolve_cookie_file(url)
        video_title = None
        download_targets = [url]
        initial_html_targets = []
        attempted_targets = set()
        attempt_errors = []
        files = []
        process = None

        # 对明显的 HTML/论坛/播放器页先做一次通用解析，减少 Unsupported URL
        if any(marker in lower_url for marker in [".html", "/thread-", "/bbs/", "playvids.com"]):
            await context.bot.edit_message_text(chat_id=chat_id, message_id=status_msg.message_id, text="⬇️ 正在解析页面中的真实视频地址...")
            html_targets, detected_title = resolve_html_media_candidates(url, cookie_file)
            initial_html_targets = html_targets[:]
            if detected_title:
                video_title = detected_title
            if html_targets:
                download_targets = html_targets

        output_template = f"{video_title or '%(uploader)s_%(id)s'}.%(ext)s"

        def try_targets(targets):
            nonlocal process, files
            for target in targets:
                if target in attempted_targets:
                    continue
                attempted_targets.add(target)

                for f in glob.glob(os.path.join(DOWNLOAD_DIR, "*")):
                    try:
                        os.remove(f)
                    except Exception:
                        pass

                if is_direct_media_url(target):
                    try:
                        direct_file = download_direct_media(target, url, cookie_file, output_template)
                        if os.path.exists(direct_file) and os.path.getsize(direct_file) > 0:
                            files = [direct_file]
                            logger.info(f"Direct media download succeeded: {target}")
                            return True
                    except Exception as e:
                        attempt_errors.append(f"Direct download failed: {str(e)[:220]}")
                        continue

                cmd = build_ytdlp_command(target, url, cookie_file, output_template)
                process = subprocess.run(cmd, capture_output=True, text=True)
                files = find_downloaded_media_files()
                if files:
                    logger.info(f"yt-dlp 下载成功: {target}")
                    return True

                error_text = (process.stderr or process.stdout or "Unknown error").strip()
                if error_text:
                    attempt_errors.append(error_text[:300])

            return False

        success = try_targets(download_targets)

        if not success and not initial_html_targets:
            html_targets, detected_title = resolve_html_media_candidates(url, cookie_file)
            if detected_title and not video_title:
                video_title = detected_title

            if html_targets:
                output_template = f"{video_title or '%(uploader)s_%(id)s'}.%(ext)s"
                success = try_targets(html_targets)

        if not success or not files:
             error_message = attempt_errors[-1] if attempt_errors else (process.stderr[:300] if process and process.stderr else "Unknown error")
             candidate_hint = f"\nHTML candidates: {len(initial_html_targets)}" if initial_html_targets else "\nHTML candidates: 0"
             preview = ""
             if initial_html_targets:
                 preview_items = initial_html_targets[:3]
                 preview = "\nCandidates:\n" + "\n".join(preview_items)
             await context.bot.edit_message_text(chat_id=chat_id, message_id=status_msg.message_id, text=f"❌ 下载失败或未找到视频文件。{candidate_hint}{preview}\nError: {error_message}")
             return

        # ========== 下载完成，询问是否改名 ==========
        downloaded_file = files[0]
        file_name = os.path.basename(downloaded_file)
        file_size_mb = os.path.getsize(downloaded_file) / (1024 * 1024)
        
        # 存储待上传信息
        pending_uploads[chat_id] = {
            'file_path': downloaded_file,
            'target_folder': ALIST_UPLOAD_PATH
        }
        
        await context.bot.edit_message_text(
            chat_id=chat_id, 
            message_id=status_msg.message_id, 
            text=f"📥 **下载完成！** ({file_size_mb:.1f} MB)\n\n"
                 f"📄 当前文件名:\n`{file_name}`\n\n"
                 f"💬 回复 `/` 使用默认名称上传\n"
                 f"💬 或直接输入新文件名（不含扩展名）",
            parse_mode='Markdown'
        )

    except Exception as e:
        await context.bot.edit_message_text(chat_id=chat_id, message_id=status_msg.message_id, text=f"❌ 系统错误: {e}")

# --- 核心功能：处理图片文件 ---
@admin_only
async def handle_photo_file(update: Update, context: ContextTypes.DEFAULT_TYPE):
    status_msg = await context.bot.send_message(chat_id=update.effective_chat.id, text="📥 正在接收图片...", reply_to_message_id=update.message.message_id)
    if not os.path.exists(DOWNLOAD_DIR): os.makedirs(DOWNLOAD_DIR)

    try:
        photo = update.message.photo[-1] # 获取最大尺寸
        file_obj = await photo.get_file()
        file_name = f"tg_photo_{update.message.id}.jpg"
        save_path = os.path.join(DOWNLOAD_DIR, file_name)
        
        await file_obj.download_to_drive(save_path)
        await process_upload(save_path, ALIST_IMAGE_PATH, context, update.effective_chat.id, status_msg.message_id)

    except Exception as e:
        logger.error(f"图片处理异常: {e}")
        await context.bot.edit_message_text(chat_id=update.effective_chat.id, message_id=status_msg.message_id, text=f"❌ 图片处理失败: {e}")

# --- 设置 Bot 菜单 ---
@admin_only
async def handle_video_file(update: Update, context: ContextTypes.DEFAULT_TYPE):
    status_msg = await context.bot.send_message(
        chat_id=update.effective_chat.id,
        text="📥 正在接收视频...",
        reply_to_message_id=update.message.message_id
    )
    if not os.path.exists(DOWNLOAD_DIR):
        os.makedirs(DOWNLOAD_DIR)

    try:
        video = update.message.video
        file_obj = await video.get_file()

        original_name = video.file_name or f"tg_video_{update.message.id}.mp4"
        file_name = sanitize_filename(original_name)
        save_path = os.path.join(DOWNLOAD_DIR, file_name)

        await file_obj.download_to_drive(save_path)
        await prompt_pending_upload(
            save_path,
            ALIST_UPLOAD_PATH,
            context,
            update.effective_chat.id,
            status_msg.message_id,
            prefix_text="视频接收完成，等待你确认文件名"
        )
    except Exception as e:
        logger.error(f"视频处理异常: {e}")
        await context.bot.edit_message_text(
            chat_id=update.effective_chat.id,
            message_id=status_msg.message_id,
            text=f"❌ 视频处理失败: {e}"
        )


@admin_only
async def handle_video_document(update: Update, context: ContextTypes.DEFAULT_TYPE):
    document = update.message.document
    mime_type = (document.mime_type or "").lower()
    ext = os.path.splitext(document.file_name or "")[1].lower()
    video_exts = {".mp4", ".mov", ".mkv", ".webm", ".m4v", ".avi", ".ts"}

    if not (mime_type.startswith("video/") or ext in video_exts):
        return

    status_msg = await context.bot.send_message(
        chat_id=update.effective_chat.id,
        text="📥 正在接收视频文件...",
        reply_to_message_id=update.message.message_id
    )
    if not os.path.exists(DOWNLOAD_DIR):
        os.makedirs(DOWNLOAD_DIR)

    try:
        file_obj = await document.get_file()
        original_name = document.file_name or f"tg_video_file_{update.message.id}{ext or '.mp4'}"
        file_name = sanitize_filename(original_name)
        save_path = os.path.join(DOWNLOAD_DIR, file_name)

        await file_obj.download_to_drive(save_path)
        await prompt_pending_upload(
            save_path,
            ALIST_UPLOAD_PATH,
            context,
            update.effective_chat.id,
            status_msg.message_id,
            prefix_text="视频文件接收完成，等待你确认文件名"
        )
    except Exception as e:
        logger.error(f"视频文件处理异常: {e}")
        await context.bot.edit_message_text(
            chat_id=update.effective_chat.id,
            message_id=status_msg.message_id,
            text=f"❌ 视频文件处理失败: {e}"
        )


async def setup_menu(application):
    """设置 Bot 左下角的菜单按钮"""
    commands = [
        BotCommand("start", "📖 查看帮助信息"),
        BotCommand("log", "📄 查看最近日志"),
        BotCommand("status", "🖥 查看服务器存储状态"),
        BotCommand("update_tool", "🔄 更新 yt-dlp 内核")
    ]
    await application.bot.set_my_commands(commands)
    logger.info("✅ Bot 菜单已设置")


# --- 主程序启动 ---
async def safe_start(update: Update, context: ContextTypes.DEFAULT_TYPE):
    msg = (
        "我是你的通用视频下载管家\n\n"
        "功能：\n"
        "支持 1000+ 网站，例如 Twitter、PlayVids、YouTube、TikTok\n"
        "下载视频 -> 上传到 AList (R2) -> 删除本地缓存\n\n"
        "指令：\n"
        "/log - 查看日志\n"
        "/status - 查看服务器状态\n"
        "/update_tool - 更新 yt-dlp"
    )
    await context.bot.send_message(chat_id=update.effective_chat.id, text=msg)


async def handle_error(update: object, context: ContextTypes.DEFAULT_TYPE):
    logger.exception("Unhandled exception while processing update", exc_info=context.error)


if __name__ == '__main__':
    print("🤖 Bot 正在启动...")
    application = ApplicationBuilder().token(BOT_TOKEN).build()
    
    application.add_handler(CommandHandler('start', safe_start))
    application.add_handler(CommandHandler('log', view_log))
    application.add_handler(CommandHandler('status', check_status))
    application.add_handler(CommandHandler('update_tool', update_tool))

    # 消息监听
    application.add_handler(MessageHandler(filters.TEXT & (~filters.COMMAND), handle_url_message))
    application.add_handler(MessageHandler(filters.PHOTO, handle_photo_file))
    application.add_handler(MessageHandler(filters.VIDEO, handle_video_file))
    application.add_handler(MessageHandler(filters.Document.ALL, handle_video_document))
    application.add_error_handler(handle_error)
    
    # 设置 Bot 菜单
    application.post_init = setup_menu
    
    print("✅ Bot 菜单已配置，正在连接 Telegram...")
    application.run_polling()
