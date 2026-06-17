# Telegram Memos Bot - Google Docs 集成
# 支持读取、追加、清空 Google 文档内容
# 支持多文档管理

import os
import logging
from datetime import datetime
from zoneinfo import ZoneInfo
from telegram import Update, BotCommand
from telegram.ext import Application, CommandHandler, ContextTypes, MessageHandler, filters
from google_docs import GoogleDocsClient

# 时区配置
TIMEZONE = ZoneInfo('Asia/Shanghai')

# 配置日志 (输出到标准流，适配 Docker)
logging.basicConfig(
    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s',
    level=logging.INFO,
    handlers=[logging.StreamHandler()]
)
logger = logging.getLogger(__name__)

# 环境变量配置
BOT_TOKEN = os.getenv('BOT_TOKEN')
ADMIN_ID = int(os.getenv('ADMIN_ID', '0'))

# 多文档配置
# 格式: 别名:文档ID,别名:文档ID
DOCS_CONFIG = os.getenv('DOCS', '')
DEFAULT_DOC_ALIAS = os.getenv('DEFAULT_DOC', '')

# 解析文档配置
DOCS: dict[str, str] = {}  # 别名 -> 文档ID
for item in DOCS_CONFIG.split(','):
    if ':' in item:
        alias, doc_id = item.strip().split(':', 1)
        DOCS[alias.strip()] = doc_id.strip()

# 当前默认文档别名
current_default_alias = DEFAULT_DOC_ALIAS

# 特殊格式文档配置 (这些文档使用日期格式化追加)
# 格式: 别名 -> 类型
# 'life' = 生活记录格式: ## 年份 / ### 日期
# 'writing' = 文字记录格式: ## 摘抄的和写下的文字 / ### 日期：类型
DOC_FORMATS = {
    '生活细节': 'life',     # 生活记录：按年份和日期分组
    '文字记录': 'writing',  # 文字记录：按摘抄/写下分类
}

# Google Docs 客户端
docs_client: GoogleDocsClient = None


def get_docs_client() -> GoogleDocsClient:
    """获取或初始化 Google Docs 客户端"""
    global docs_client
    if docs_client is None:
        docs_client = GoogleDocsClient()
    return docs_client


def get_default_doc_id() -> str:
    """获取当前默认文档的 ID"""
    if current_default_alias and current_default_alias in DOCS:
        return DOCS[current_default_alias]
    return ''


def resolve_doc_id(text: str) -> tuple[str, str]:
    """
    解析文档标识，返回 (文档ID, 显示名称)
    支持: 别名、完整URL、纯ID
    """
    if not text:
        doc_id = get_default_doc_id()
        return (doc_id, current_default_alias if current_default_alias else doc_id)
    
    text = text.strip()
    
    # 检查是否是别名
    if text in DOCS:
        return (DOCS[text], text)
    
    # 如果是完整 URL，提取 ID
    if 'docs.google.com' in text:
        parts = text.split('/d/')
        if len(parts) > 1:
            doc_id = parts[1].split('/')[0]
            # 反查别名
            for alias, did in DOCS.items():
                if did == doc_id:
                    return (doc_id, alias)
            return (doc_id, doc_id[:10] + '...')
    
    # 纯 ID，反查别名
    for alias, did in DOCS.items():
        if did == text:
            return (text, alias)
    
    return (text, text[:10] + '...' if len(text) > 10 else text)


async def start(update: Update, context: ContextTypes.DEFAULT_TYPE):
    """显示帮助信息"""
    docs_list = '\n'.join([f"  • `{alias}`" for alias in DOCS.keys()]) if DOCS else "  (未配置)"
    
    help_text = f"""
📝 **Memos Bot - Google Docs 管理**

**已配置文档:**
{docs_list}

**命令列表:**
/list - 查看所有文档及当前默认
/read `<别名>` - 读取文档内容
/append `<别名>` `<内容>` - 追加内容
/clear `<别名>` - 清空文档
/setdoc `<别名>` - 切换默认文档

**快捷方式:**
• 直接发消息 → 追加到默认文档
• 省略别名 → 使用默认文档
    """
    await update.message.reply_text(help_text, parse_mode='Markdown')


async def list_docs(update: Update, context: ContextTypes.DEFAULT_TYPE):
    """列出所有配置的文档"""
    if not DOCS:
        await update.message.reply_text("❌ 未配置任何文档，请在 .env 中设置 DOCS")
        return
    
    lines = ["📚 **已配置文档:**\n"]
    for alias, doc_id in DOCS.items():
        is_default = " ✅ (默认)" if alias == current_default_alias else ""
        lines.append(f"• **{alias}**{is_default}\n  ID: `{doc_id[:20]}...`")
    
    await update.message.reply_text('\n'.join(lines), parse_mode='Markdown')


async def read_doc(update: Update, context: ContextTypes.DEFAULT_TYPE):
    """读取文档内容"""
    if not context.args:
        doc_id, name = resolve_doc_id('')
        if not doc_id:
            await update.message.reply_text("❌ 请指定文档别名\n用法: /read <别名>")
            return
    else:
        doc_id, name = resolve_doc_id(context.args[0])
    
    try:
        client = get_docs_client()
        content = client.read_document(doc_id)
        
        if not content:
            await update.message.reply_text(f"📄 **{name}** 内容为空")
            return
        
        # 分段发送长内容
        max_length = 4000
        if len(content) > max_length:
            for i in range(0, len(content), max_length):
                part = i // max_length + 1
                await update.message.reply_text(f"📄 **{name}** ({part}):\n\n{content[i:i+max_length]}")
        else:
            await update.message.reply_text(f"📄 **{name}**:\n\n{content}")
            
    except Exception as e:
        logger.error(f"读取文档失败: {e}")
        await update.message.reply_text(f"❌ 读取失败: {e}")


async def append_doc(update: Update, context: ContextTypes.DEFAULT_TYPE):
    """追加内容到文档"""
    if not context.args:
        await update.message.reply_text("❌ 请提供内容\n用法: /append <内容> 或 /append <别名> <内容>")
        return
    
    first_arg = context.args[0]
    
    # 检查第一个参数是否是已知别名
    if first_arg in DOCS:
        doc_id, name = resolve_doc_id(first_arg)
        text = ' '.join(context.args[1:])
        if not text:
            await update.message.reply_text("❌ 请提供要追加的内容")
            return
    else:
        # 使用默认文档
        doc_id, name = resolve_doc_id('')
        text = ' '.join(context.args)
        if not doc_id:
            await update.message.reply_text("❌ 未设置默认文档，请用 /setdoc 设置或指定别名")
            return
    
    try:
        client = get_docs_client()
        client.append_text(doc_id, text)
        await update.message.reply_text(f"✅ 已追加到 **{name}**", parse_mode='Markdown')
    except Exception as e:
        logger.error(f"追加内容失败: {e}")
        await update.message.reply_text(f"❌ 追加失败: {e}")


async def clear_doc(update: Update, context: ContextTypes.DEFAULT_TYPE):
    """清空文档内容"""
    if not context.args:
        doc_id, name = resolve_doc_id('')
        if not doc_id:
            await update.message.reply_text("❌ 请指定文档别名\n用法: /clear <别名>")
            return
    else:
        doc_id, name = resolve_doc_id(context.args[0])
    
    try:
        client = get_docs_client()
        client.clear_document(doc_id)
        await update.message.reply_text(f"✅ **{name}** 已清空", parse_mode='Markdown')
    except Exception as e:
        logger.error(f"清空文档失败: {e}")
        await update.message.reply_text(f"❌ 清空失败: {e}")


async def set_default_doc(update: Update, context: ContextTypes.DEFAULT_TYPE):
    """切换默认文档"""
    global current_default_alias
    
    if not context.args:
        if current_default_alias:
            await update.message.reply_text(f"📌 当前默认: **{current_default_alias}**", parse_mode='Markdown')
        else:
            await update.message.reply_text("❌ 未设置默认文档\n用法: /setdoc <别名>")
        return
    
    alias = context.args[0].strip()
    
    if alias not in DOCS:
        available = ', '.join(DOCS.keys())
        await update.message.reply_text(f"❌ 未知别名: {alias}\n可用: {available}")
        return
    
    current_default_alias = alias
    await update.message.reply_text(f"✅ 默认文档已切换为: **{alias}**", parse_mode='Markdown')


async def quick_append(update: Update, context: ContextTypes.DEFAULT_TYPE):
    """快速追加：自动根据消息内容选择文档"""
    text = update.message.text
    if text.startswith('/'):
        return  # 忽略命令
    
    try:
        client = get_docs_client()
        now = datetime.now(TIMEZONE)
        date = now.strftime('%Y-%m-%d')
        text_stripped = text.strip()
        
        # 自动识别消息类型并选择文档
        if text_stripped.startswith('摘抄') or text_stripped.startswith('写下'):
            # 文字记录
            doc_alias = '文字记录'
            doc_id = DOCS.get(doc_alias)
            
            if not doc_id:
                await update.message.reply_text("❌ 未配置文字记录文档")
                return
            
            if text_stripped.startswith('摘抄'):
                writing_type = '摘抄'
                content = text_stripped[2:].strip()
            else:
                writing_type = '写下'
                content = text_stripped[2:].strip()
            
            if not content:
                await update.message.reply_text("❌ 请提供内容\n用法: 摘抄 内容 或 写下 内容")
                return
            
            client.append_with_writing_format(doc_id, f"[{now.strftime('%H:%M')}] {content}", date, writing_type)
            await update.message.reply_text(
                f"✅ 已{writing_type}到 **{doc_alias}** ({date})", 
                parse_mode='Markdown'
            )
        else:
            # 生活细节
            doc_alias = '生活细节'
            doc_id = DOCS.get(doc_alias)
            
            if not doc_id:
                await update.message.reply_text("❌ 未配置生活细节文档")
                return
            
            year = now.strftime('%Y')
            time_str = now.strftime('%H:%M')
            content_with_time = f"[{time_str}] {text}"
            client.append_with_date_format(doc_id, content_with_time, year, date)
            await update.message.reply_text(
                f"✅ 已记录到 **{doc_alias}** ({date})", 
                parse_mode='Markdown'
            )
    except Exception as e:
        logger.error(f"快速追加失败: {e}")
        await update.message.reply_text(f"❌ 追加失败: {e}")


async def post_init(application: Application):
    """Bot 启动后设置命令菜单"""
    commands = [
        BotCommand("start", "显示帮助信息"),
        BotCommand("list", "查看所有文档"),
        BotCommand("read", "读取文档内容"),
        BotCommand("append", "追加内容到文档"),
        BotCommand("clear", "清空文档内容"),
        BotCommand("setdoc", "切换默认文档"),
    ]
    await application.bot.set_my_commands(commands)
    
    # 打印已加载的文档配置
    logger.info(f"已加载 {len(DOCS)} 个文档配置:")
    for alias, doc_id in DOCS.items():
        logger.info(f"  - {alias}: {doc_id[:20]}...")
    logger.info(f"默认文档: {current_default_alias or '(未设置)'}")


def main():
    """启动 Bot"""
    if not BOT_TOKEN:
        logger.error("未设置 BOT_TOKEN 环境变量")
        return
    
    if not DOCS:
        logger.warning("未配置 DOCS 环境变量，请在 .env 中设置")
    
    logger.info("正在启动 Memos Bot...")
    
    # 创建应用
    application = Application.builder().token(BOT_TOKEN).post_init(post_init).build()
    
    # 注册命令处理器
    application.add_handler(CommandHandler("start", start))
    application.add_handler(CommandHandler("help", start))
    application.add_handler(CommandHandler("list", list_docs))
    application.add_handler(CommandHandler("read", read_doc))
    application.add_handler(CommandHandler("append", append_doc))
    application.add_handler(CommandHandler("clear", clear_doc))
    application.add_handler(CommandHandler("setdoc", set_default_doc))
    
    # 快速追加：直接发送文本自动追加到默认文档
    application.add_handler(MessageHandler(filters.TEXT & ~filters.COMMAND, quick_append))
    
    # 启动轮询
    logger.info("Bot 已启动，正在监听消息...")
    application.run_polling(allowed_updates=Update.ALL_TYPES)


if __name__ == '__main__':
    main()
