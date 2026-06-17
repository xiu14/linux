# Google Docs API 封装模块
from google.oauth2 import service_account
from googleapiclient.discovery import build
from googleapiclient.errors import HttpError
import os
import logging

logger = logging.getLogger(__name__)

class GoogleDocsClient:
    """Google Docs API 客户端封装"""
    
    SCOPES = [
        'https://www.googleapis.com/auth/documents',
        'https://www.googleapis.com/auth/drive.readonly'
    ]
    
    def __init__(self, credentials_path: str = None):
        """
        初始化 Google Docs 客户端
        
        Args:
            credentials_path: 服务账号凭证文件路径，默认使用环境变量
        """
        self.credentials_path = credentials_path or os.getenv('GOOGLE_CREDENTIALS_PATH', '/app/credentials.json')
        self.docs_service = None
        self.drive_service = None
        self._init_services()
    
    def _init_services(self):
        """初始化 Google API 服务"""
        try:
            credentials = service_account.Credentials.from_service_account_file(
                self.credentials_path,
                scopes=self.SCOPES
            )
            self.docs_service = build('docs', 'v1', credentials=credentials)
            self.drive_service = build('drive', 'v3', credentials=credentials)
            logger.info("Google API 服务初始化成功")
        except Exception as e:
            logger.error(f"Google API 服务初始化失败: {e}")
            raise
    
    def read_document(self, document_id: str) -> str:
        """
        读取文档内容
        
        Args:
            document_id: Google 文档 ID
            
        Returns:
            文档的纯文本内容
        """
        try:
            document = self.docs_service.documents().get(documentId=document_id).execute()
            content = document.get('body', {}).get('content', [])
            
            text_content = []
            for element in content:
                if 'paragraph' in element:
                    paragraph = element['paragraph']
                    for elem in paragraph.get('elements', []):
                        if 'textRun' in elem:
                            text_content.append(elem['textRun'].get('content', ''))
            
            return ''.join(text_content).strip()
        except HttpError as e:
            logger.error(f"读取文档失败: {e}")
            raise
    
    def append_text(self, document_id: str, text: str) -> bool:
        """
        追加内容到文档末尾
        
        Args:
            document_id: Google 文档 ID
            text: 要追加的文本
            
        Returns:
            是否成功
        """
        try:
            # 获取文档末尾位置
            document = self.docs_service.documents().get(documentId=document_id).execute()
            end_index = document['body']['content'][-1]['endIndex'] - 1
            
            # 追加换行和新内容
            requests = [
                {
                    'insertText': {
                        'location': {'index': end_index},
                        'text': f'\n{text}'
                    }
                }
            ]
            
            self.docs_service.documents().batchUpdate(
                documentId=document_id,
                body={'requests': requests}
            ).execute()
            
            logger.info(f"成功追加内容到文档 {document_id}")
            return True
        except HttpError as e:
            logger.error(f"追加内容失败: {e}")
            raise
    
    def clear_document(self, document_id: str) -> bool:
        """
        清空文档内容
        
        Args:
            document_id: Google 文档 ID
            
        Returns:
            是否成功
        """
        try:
            # 获取文档内容范围
            document = self.docs_service.documents().get(documentId=document_id).execute()
            content = document.get('body', {}).get('content', [])
            
            if len(content) <= 1:
                logger.info("文档已经是空的")
                return True
            
            # 计算删除范围 (保留第一个段落的结构)
            start_index = content[0].get('endIndex', 1)
            end_index = content[-1].get('endIndex', 1) - 1
            
            if start_index >= end_index:
                logger.info("文档已经是空的")
                return True
            
            requests = [
                {
                    'deleteContentRange': {
                        'range': {
                            'startIndex': 1,
                            'endIndex': end_index
                        }
                    }
                }
            ]
            
            self.docs_service.documents().batchUpdate(
                documentId=document_id,
                body={'requests': requests}
            ).execute()
            
            logger.info(f"成功清空文档 {document_id}")
            return True
        except HttpError as e:
            logger.error(f"清空文档失败: {e}")
            raise
    
    def get_document_title(self, document_id: str) -> str:
        """
        获取文档标题
        
        Args:
            document_id: Google 文档 ID
            
        Returns:
            文档标题
        """
        try:
            document = self.docs_service.documents().get(documentId=document_id).execute()
            return document.get('title', '未知标题')
        except HttpError as e:
            logger.error(f"获取文档标题失败: {e}")
            raise
    
    def append_with_date_format(self, document_id: str, text: str, year: str, date: str) -> bool:
        """
        按日期格式追加内容到文档
        格式: ## 年份 -> ### 日期 -> 内容
        
        Args:
            document_id: Google 文档 ID
            text: 要追加的内容
            year: 年份 (如 "2025")
            date: 日期 (如 "2025-12-31")
            
        Returns:
            是否成功
        """
        try:
            # 读取当前文档内容
            content = self.read_document(document_id)
            lines = content.split('\n') if content else []
            
            year_header = f"## {year}"
            date_header = f"### {date}"
            
            # 查找年份和日期的位置
            year_line_idx = -1
            date_line_idx = -1
            next_year_idx = -1  # 下一个年份的位置 (用于插入新日期)
            
            for i, line in enumerate(lines):
                stripped = line.strip()
                if stripped == year_header:
                    year_line_idx = i
                elif year_line_idx >= 0 and stripped.startswith('## ') and stripped != year_header:
                    # 找到了下一个年份
                    if next_year_idx < 0:
                        next_year_idx = i
                elif stripped == date_header and year_line_idx >= 0:
                    date_line_idx = i
            
            if year_line_idx < 0:
                # 年份不存在，追加新年份、日期和内容到文档末尾
                append_text = f"\n{year_header}\n\n{date_header}\n{text}\n"
                self.append_text(document_id, append_text)
            elif date_line_idx < 0:
                # 年份存在但日期不存在，在年份下追加日期和内容
                # 找到该年份块的末尾 (下一个年份前或文档末尾)
                if next_year_idx > 0:
                    # 在下一个年份前插入
                    insert_text = f"\n{date_header}\n{text}\n\n"
                    self._insert_at_line(document_id, lines, next_year_idx, insert_text)
                else:
                    # 追加到文档末尾
                    append_text = f"\n{date_header}\n{text}\n"
                    self.append_text(document_id, append_text)
            else:
                # 日期已存在，在该日期下追加内容
                # 找到该日期块的末尾 (下一个日期/年份前)
                insert_idx = date_line_idx + 1
                for i in range(date_line_idx + 1, len(lines)):
                    stripped = lines[i].strip()
                    if stripped.startswith('### ') or stripped.startswith('## '):
                        insert_idx = i
                        break
                    insert_idx = i + 1
                
                self._insert_at_line(document_id, lines, insert_idx, text + '\n\n')
            
            logger.info(f"成功按日期格式追加内容到文档 {document_id}")
            return True
            
        except HttpError as e:
            logger.error(f"按日期格式追加失败: {e}")
            raise
    
    def _insert_at_line(self, document_id: str, lines: list, line_idx: int, text: str):
        """
        在指定行位置插入文本
        
        Args:
            document_id: 文档 ID
            lines: 文档行列表
            line_idx: 要插入的行索引
            text: 要插入的文本
        """
        try:
            document = self.docs_service.documents().get(documentId=document_id).execute()
            content = document.get('body', {}).get('content', [])
            
            # 计算插入位置的字符索引
            char_index = 1  # 文档起始位置
            current_line = 0
            
            for element in content:
                if 'paragraph' in element:
                    for elem in element['paragraph'].get('elements', []):
                        if 'textRun' in elem:
                            text_content = elem['textRun'].get('content', '')
                            for char in text_content:
                                if current_line >= line_idx:
                                    break
                                char_index += 1
                                if char == '\n':
                                    current_line += 1
                            if current_line >= line_idx:
                                break
                if current_line >= line_idx:
                    break
            
            # 插入文本
            requests = [
                {
                    'insertText': {
                        'location': {'index': char_index},
                        'text': text
                    }
                }
            ]
            
            self.docs_service.documents().batchUpdate(
                documentId=document_id,
                body={'requests': requests}
            ).execute()
            
        except HttpError as e:
            logger.error(f"插入文本失败: {e}")
            raise
    
    def append_with_writing_format(self, document_id: str, text: str, date: str, writing_type: str) -> bool:
        """
        按文字记录格式追加内容到文档
        格式: ## 摘抄的和写下的文字 -> ### 日期：类型 -> 内容
        
        Args:
            document_id: Google 文档 ID
            text: 要追加的内容
            date: 日期 (如 "2025-12-31")
            writing_type: 类型 ("摘抄" 或 "写下")
            
        Returns:
            是否成功
        """
        try:
            # 读取当前文档内容
            content = self.read_document(document_id)
            lines = content.split('\n') if content else []
            
            section_header = "## 摘抄的和写下的文字"
            date_header = f"### {date}：{writing_type}"
            
            # 查找章节和日期位置
            section_line_idx = -1
            date_line_idx = -1
            
            for i, line in enumerate(lines):
                stripped = line.strip()
                if stripped == section_header:
                    section_line_idx = i
                elif stripped == date_header and section_line_idx >= 0:
                    date_line_idx = i
            
            if section_line_idx < 0:
                # 章节不存在，创建章节、日期和内容
                append_text = f"\n{section_header}\n\n{date_header}\n{text}\n"
                self.append_text(document_id, append_text)
            elif date_line_idx < 0:
                # 章节存在但日期不存在，追加到文档末尾
                append_text = f"\n{date_header}\n{text}\n"
                self.append_text(document_id, append_text)
            else:
                # 日期已存在，在该日期下追加内容
                insert_idx = date_line_idx + 1
                for i in range(date_line_idx + 1, len(lines)):
                    stripped = lines[i].strip()
                    if stripped.startswith('### ') or stripped.startswith('## '):
                        insert_idx = i
                        break
                    insert_idx = i + 1
                
                self._insert_at_line(document_id, lines, insert_idx, text + '\n\n')
            
            logger.info(f"成功按文字记录格式追加内容到文档 {document_id}")
            return True
            
        except HttpError as e:
            logger.error(f"按文字记录格式追加失败: {e}")
            raise


