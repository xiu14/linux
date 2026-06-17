/**
 * QQ Bot 管理面板 - 前端交互逻辑
 */

// ==================== 全局状态 ====================
let currentConfig = null;

// ==================== DOM 元素 ====================
const elements = {
    // 状态显示
    statusIndicator: document.getElementById('status-indicator'),
    containerStatus: document.getElementById('container-status'),
    lastChat: document.getElementById('last-chat'),
    memoryCount: document.getElementById('memory-count'),

    // 配置输入
    adminId: document.getElementById('admin-id'),
    deepseekKey: document.getElementById('deepseek-key'),
    deepseekUrl: document.getElementById('deepseek-url'),
    deepseekModel: document.getElementById('deepseek-model'),
    chatKey: document.getElementById('chat-key'),
    chatUrl: document.getElementById('chat-url'),
    chatModel: document.getElementById('chat-model'),
    personaDefault: document.getElementById('persona-default'),
    personaSuffix: document.getElementById('persona-suffix'),
    proactiveEnabled: document.getElementById('proactive-enabled'),
    proactiveProb: document.getElementById('proactive-prob'),
    proactiveHours: document.getElementById('proactive-hours'),
    memoryThreshold: document.getElementById('memory-threshold'),

    // 列表容器
    volcList: document.getElementById('volc-list'),
    gmailList: document.getElementById('gmail-list'),

    // 按钮
    btnSave: document.getElementById('btn-save'),
    btnRestart: document.getElementById('btn-restart'),
    btnClearMemory: document.getElementById('btn-clear-memory'),
    btnAddVolc: document.getElementById('btn-add-volc'),
    btnAddGmail: document.getElementById('btn-add-gmail'),

    // 弹窗
    modal: document.getElementById('modal'),
    modalTitle: document.getElementById('modal-title'),
    modalMessage: document.getElementById('modal-message'),
    modalCancel: document.getElementById('modal-cancel'),
    modalConfirm: document.getElementById('modal-confirm'),
    modalVolc: document.getElementById('modal-volc'),
    modalGmail: document.getElementById('modal-gmail'),

    // Toast
    toast: document.getElementById('toast')
};

// ==================== 工具函数 ====================
function showToast(message, type = 'success') {
    elements.toast.textContent = message;
    elements.toast.className = `toast ${type} show`;
    setTimeout(() => {
        elements.toast.classList.remove('show');
    }, 3000);
}

function showModal(title, message, onConfirm) {
    elements.modalTitle.textContent = title;
    elements.modalMessage.textContent = message;
    elements.modal.classList.add('show');

    elements.modalConfirm.onclick = () => {
        elements.modal.classList.remove('show');
        onConfirm();
    };
    elements.modalCancel.onclick = () => {
        elements.modal.classList.remove('show');
    };
}

function maskKey(key, showLength = 4) {
    if (!key || key.length <= showLength * 2) return key;
    return key.slice(0, showLength) + '...' + key.slice(-showLength);
}

// ==================== API 调用 ====================
async function fetchAPI(url, options = {}) {
    try {
        const response = await fetch(url, {
            headers: {
                'Content-Type': 'application/json',
            },
            ...options
        });
        return await response.json();
    } catch (error) {
        showToast(`请求失败: ${error.message}`, 'error');
        throw error;
    }
}

async function loadConfig() {
    try {
        currentConfig = await fetchAPI('/api/config');
        populateForm(currentConfig);
        renderVolcList(currentConfig.volc_accounts || []);
        renderGmailList(currentConfig.gmail_accounts || []);
    } catch (error) {
        console.error('加载配置失败:', error);
    }
}

async function loadStatus() {
    try {
        const status = await fetchAPI('/api/status');

        // 更新状态指示器
        elements.statusIndicator.className = `status-dot ${status.container_running ? 'online' : 'offline'}`;
        elements.containerStatus.textContent = status.container_running ? '✅ 运行中' : '❌ 已停止';

        // 更新上次互动时间
        if (status.last_chat_time) {
            try {
                const date = new Date(status.last_chat_time);
                elements.lastChat.textContent = date.toLocaleString('zh-CN', {
                    month: '2-digit',
                    day: '2-digit',
                    hour: '2-digit',
                    minute: '2-digit'
                });
            } catch {
                elements.lastChat.textContent = status.last_chat_time;
            }
        } else {
            elements.lastChat.textContent = '-';
        }

        // 更新记忆条数
        elements.memoryCount.textContent = status.memory_count || 0;

    } catch (error) {
        console.error('加载状态失败:', error);
    }
}

async function saveConfig() {
    const config = collectFormData();

    try {
        elements.btnSave.disabled = true;
        elements.btnSave.innerHTML = '<span class="loading"></span> 保存中...';

        const result = await fetchAPI('/api/config', {
            method: 'POST',
            body: JSON.stringify(config)
        });

        if (result.success) {
            showToast('✅ 配置已保存', 'success');
            currentConfig = config;
        } else {
            showToast(`❌ ${result.message}`, 'error');
        }
    } catch (error) {
        showToast(`❌ 保存失败: ${error.message}`, 'error');
    } finally {
        elements.btnSave.disabled = false;
        elements.btnSave.innerHTML = '💾 保存所有配置';
    }
}

async function restartBot() {
    try {
        elements.btnRestart.disabled = true;
        elements.btnRestart.innerHTML = '<span class="loading"></span> 重启中...';

        const result = await fetchAPI('/api/restart', { method: 'POST' });

        if (result.success) {
            showToast('✅ Bot 已重启', 'success');
            // 延迟刷新状态
            setTimeout(loadStatus, 2000);
        } else {
            showToast(`❌ ${result.message}`, 'error');
        }
    } catch (error) {
        showToast(`❌ 重启失败: ${error.message}`, 'error');
    } finally {
        elements.btnRestart.disabled = false;
        elements.btnRestart.innerHTML = '🔄 重启 Bot';
    }
}

async function clearMemory() {
    try {
        const result = await fetchAPI('/api/memory/clear', { method: 'POST' });
        if (result.success) {
            showToast('✅ 记忆已清空', 'success');
            loadStatus();
        } else {
            showToast(`❌ ${result.message}`, 'error');
        }
    } catch (error) {
        showToast(`❌ 清空失败: ${error.message}`, 'error');
    }
}

// ==================== 表单数据处理 ====================
function populateForm(config) {
    elements.adminId.value = config.admin_id || '';

    // DeepSeek
    elements.deepseekKey.value = config.deepseek?.api_key || '';
    elements.deepseekUrl.value = config.deepseek?.base_url || '';
    elements.deepseekModel.value = config.deepseek?.model || '';

    // Chat
    elements.chatKey.value = config.chat?.api_key || '';
    elements.chatUrl.value = config.chat?.base_url || '';
    elements.chatModel.value = config.chat?.model || '';

    // Persona
    elements.personaDefault.value = config.persona?.default || '';
    elements.personaSuffix.value = config.persona?.suffix || '';

    // Proactive
    elements.proactiveEnabled.checked = config.proactive?.enabled ?? true;
    elements.proactiveProb.value = config.proactive?.probability || 0.4;
    elements.proactiveHours.value = config.proactive?.silence_hours || 12;

    // Memory
    elements.memoryThreshold.value = config.memory?.summary_threshold || 50;
}

function collectFormData() {
    return {
        admin_id: elements.adminId.value,
        deepseek: {
            api_key: elements.deepseekKey.value,
            base_url: elements.deepseekUrl.value,
            model: elements.deepseekModel.value
        },
        chat: {
            api_key: elements.chatKey.value,
            base_url: elements.chatUrl.value,
            model: elements.chatModel.value
        },
        persona: {
            default: elements.personaDefault.value,
            suffix: elements.personaSuffix.value
        },
        proactive: {
            enabled: elements.proactiveEnabled.checked,
            probability: parseFloat(elements.proactiveProb.value) || 0.4,
            silence_hours: parseInt(elements.proactiveHours.value) || 12
        },
        memory: {
            summary_threshold: parseInt(elements.memoryThreshold.value) || 50
        },
        volc_accounts: currentConfig?.volc_accounts || [],
        gmail_accounts: currentConfig?.gmail_accounts || []
    };
}

// ==================== 账号列表渲染 ====================
function renderVolcList(accounts) {
    if (!accounts || accounts.length === 0) {
        elements.volcList.innerHTML = '<div class="empty-state">暂无 TTS 账号</div>';
        return;
    }

    elements.volcList.innerHTML = accounts.map((acc, idx) => `
        <div class="account-item">
            <div class="account-info">
                <span class="account-name">${acc.remark || acc.appid}</span>
                <span class="account-detail">Voice: ${acc.voice_id || '-'}</span>
            </div>
            <div class="account-actions">
                <span class="account-status ${acc.enabled !== false ? 'enabled' : 'disabled'}">
                    ${acc.enabled !== false ? '启用' : '禁用'}
                </span>
                <button class="btn-delete" onclick="deleteVolcAccount(${idx})">🗑️</button>
            </div>
        </div>
    `).join('');
}

function renderGmailList(accounts) {
    if (!accounts || accounts.length === 0) {
        elements.gmailList.innerHTML = '<div class="empty-state">暂无 Gmail 账号</div>';
        return;
    }

    elements.gmailList.innerHTML = accounts.map((acc, idx) => `
        <div class="account-item">
            <div class="account-info">
                <span class="account-name">${acc.user}</span>
                <span class="account-detail">密码: ${maskKey(acc.password, 4)}</span>
            </div>
            <div class="account-actions">
                <button class="btn-delete" onclick="deleteGmailAccount(${idx})">🗑️</button>
            </div>
        </div>
    `).join('');
}

// ==================== 账号管理操作 ====================
async function deleteVolcAccount(idx) {
    showModal('删除确认', '确定要删除这个 TTS 账号吗？', async () => {
        try {
            const result = await fetchAPI(`/api/volc/${idx}`, { method: 'DELETE' });
            if (result.success) {
                showToast('✅ 已删除', 'success');
                currentConfig.volc_accounts.splice(idx, 1);
                renderVolcList(currentConfig.volc_accounts);
            } else {
                showToast(`❌ ${result.message}`, 'error');
            }
        } catch (error) {
            showToast(`❌ 删除失败`, 'error');
        }
    });
}

async function deleteGmailAccount(idx) {
    showModal('删除确认', '确定要删除这个 Gmail 账号吗？', async () => {
        try {
            const result = await fetchAPI(`/api/gmail/${idx}`, { method: 'DELETE' });
            if (result.success) {
                showToast('✅ 已删除', 'success');
                currentConfig.gmail_accounts.splice(idx, 1);
                renderGmailList(currentConfig.gmail_accounts);
            } else {
                showToast(`❌ ${result.message}`, 'error');
            }
        } catch (error) {
            showToast(`❌ 删除失败`, 'error');
        }
    });
}

function showAddVolcModal() {
    // 清空输入
    document.getElementById('volc-appid').value = '';
    document.getElementById('volc-token').value = '';
    document.getElementById('volc-cluster').value = 'volcano_icl';
    document.getElementById('volc-voice').value = '';
    document.getElementById('volc-remark').value = '';

    elements.modalVolc.classList.add('show');
}

function showAddGmailModal() {
    document.getElementById('gmail-user').value = '';
    document.getElementById('gmail-password').value = '';
    elements.modalGmail.classList.add('show');
}

async function submitVolcAccount() {
    const account = {
        appid: document.getElementById('volc-appid').value,
        token: document.getElementById('volc-token').value,
        cluster: document.getElementById('volc-cluster').value,
        voice_id: document.getElementById('volc-voice').value,
        remark: document.getElementById('volc-remark').value,
        enabled: true
    };

    if (!account.appid || !account.token) {
        showToast('请填写 App ID 和 Token', 'error');
        return;
    }

    try {
        const result = await fetchAPI('/api/volc', {
            method: 'POST',
            body: JSON.stringify(account)
        });

        if (result.success) {
            showToast('✅ 账号已添加', 'success');
            currentConfig.volc_accounts.push(account);
            renderVolcList(currentConfig.volc_accounts);
            elements.modalVolc.classList.remove('show');
        } else {
            showToast(`❌ ${result.message}`, 'error');
        }
    } catch (error) {
        showToast('❌ 添加失败', 'error');
    }
}

async function submitGmailAccount() {
    const account = {
        user: document.getElementById('gmail-user').value,
        password: document.getElementById('gmail-password').value
    };

    if (!account.user || !account.password) {
        showToast('请填写邮箱和密码', 'error');
        return;
    }

    try {
        const result = await fetchAPI('/api/gmail', {
            method: 'POST',
            body: JSON.stringify(account)
        });

        if (result.success) {
            showToast('✅ 账号已添加', 'success');
            currentConfig.gmail_accounts.push(account);
            renderGmailList(currentConfig.gmail_accounts);
            elements.modalGmail.classList.remove('show');
        } else {
            showToast(`❌ ${result.message}`, 'error');
        }
    } catch (error) {
        showToast('❌ 添加失败', 'error');
    }
}

// ==================== 密码显示切换 ====================
function setupPasswordToggles() {
    document.querySelectorAll('.btn-toggle-pwd').forEach(btn => {
        btn.addEventListener('click', () => {
            const targetId = btn.dataset.target;
            const input = document.getElementById(targetId);
            if (input.type === 'password') {
                input.type = 'text';
                btn.textContent = '🙈';
            } else {
                input.type = 'password';
                btn.textContent = '👁';
            }
        });
    });
}

// ==================== 记忆查看 ====================
async function showMemoryModal() {
    const modal = document.getElementById('modal-memory');
    const content = document.getElementById('memory-content');

    modal.classList.add('show');
    content.innerHTML = '<div class="empty-state">加载中...</div>';

    try {
        const result = await fetchAPI('/api/memory/view');

        if (!result.success) {
            content.innerHTML = `<div class="empty-state">❌ ${result.message}</div>`;
            return;
        }

        if (!result.data || result.data.length === 0) {
            content.innerHTML = '<div class="empty-state">暂无聊天记录</div>';
            return;
        }

        // 渲染聊天记录
        let html = '';
        for (const user of result.data) {
            html += `<div class="chat-user-section">`;
            html += `<div class="chat-user-header">👤 用户 ${user.user_id} (${user.message_count} 条消息)</div>`;

            for (const msg of user.conversations) {
                const roleClass = msg.role.includes('用户') ? 'user' :
                    msg.role.includes('Bot') ? 'bot' : 'summary';
                html += `
                    <div class="chat-message ${roleClass}">
                        <div class="chat-role">${msg.role}</div>
                        <div class="chat-content">${escapeHtml(msg.content)}</div>
                    </div>
                `;
            }

            html += `</div>`;
        }

        content.innerHTML = html;

    } catch (error) {
        content.innerHTML = `<div class="empty-state">❌ 加载失败: ${error.message}</div>`;
    }
}

// ==================== 日志查看 ====================
async function loadLogs() {
    const content = document.getElementById('logs-content');
    content.innerHTML = '<div class="empty-state">加载中...</div>';

    try {
        const result = await fetchAPI('/api/logs');

        if (!result.success) {
            content.innerHTML = `<div class="empty-state">❌ ${result.message}</div>`;
            return;
        }

        if (!result.logs || result.logs.length === 0) {
            content.innerHTML = '<div class="empty-state">暂无日志</div>';
            return;
        }

        // 渲染日志 (倒序显示，最新的在上面)
        let html = '';
        const logs = result.logs.slice().reverse();

        for (const line of logs) {
            const logClass = getLogClass(line);
            html += `<div class="log-line ${logClass}">${escapeHtml(line)}</div>`;
        }

        content.innerHTML = html;

    } catch (error) {
        content.innerHTML = `<div class="empty-state">❌ 加载失败: ${error.message}</div>`;
    }
}

function showLogsModal() {
    const modal = document.getElementById('modal-logs');
    modal.classList.add('show');
    loadLogs();
}

function getLogClass(line) {
    const lower = line.toLowerCase();
    if (lower.includes('error') || lower.includes('exception') || lower.includes('❌')) {
        return 'error';
    }
    if (lower.includes('warning') || lower.includes('⚠️')) {
        return 'warning';
    }
    if (lower.includes('✅') || lower.includes('success')) {
        return 'success';
    }
    if (lower.includes('info') || lower.includes('[proactive]')) {
        return 'info';
    }
    return '';
}

function escapeHtml(text) {
    const div = document.createElement('div');
    div.textContent = text;
    return div.innerHTML;
}

// ==================== 事件绑定 ====================
function bindEvents() {
    // 保存配置
    elements.btnSave.addEventListener('click', saveConfig);

    // 重启 Bot
    elements.btnRestart.addEventListener('click', () => {
        showModal('确认重启', '确定要重启 Bot 吗？这将中断正在进行的对话。', restartBot);
    });

    // 清空记忆
    elements.btnClearMemory.addEventListener('click', () => {
        showModal('确认清空', '确定要清空所有聊天记忆吗？此操作不可恢复。', clearMemory);
    });

    // 查看记忆
    document.getElementById('btn-view-memory').addEventListener('click', showMemoryModal);

    // 查看日志
    document.getElementById('btn-view-logs').addEventListener('click', showLogsModal);

    // 添加账号
    elements.btnAddVolc.addEventListener('click', showAddVolcModal);
    elements.btnAddGmail.addEventListener('click', showAddGmailModal);

    // TTS 弹窗
    document.getElementById('volc-cancel').addEventListener('click', () => {
        elements.modalVolc.classList.remove('show');
    });
    document.getElementById('volc-submit').addEventListener('click', submitVolcAccount);

    // Gmail 弹窗
    document.getElementById('gmail-cancel').addEventListener('click', () => {
        elements.modalGmail.classList.remove('show');
    });
    document.getElementById('gmail-submit').addEventListener('click', submitGmailAccount);

    // 记忆弹窗关闭
    document.getElementById('memory-close').addEventListener('click', () => {
        document.getElementById('modal-memory').classList.remove('show');
    });

    // 日志弹窗
    document.getElementById('logs-close').addEventListener('click', () => {
        document.getElementById('modal-logs').classList.remove('show');
    });
    document.getElementById('logs-refresh').addEventListener('click', loadLogs);

    // 点击遮罩关闭弹窗
    const allModals = [
        elements.modal,
        elements.modalVolc,
        elements.modalGmail,
        document.getElementById('modal-memory'),
        document.getElementById('modal-logs')
    ];

    allModals.forEach(modal => {
        if (modal) {
            modal.addEventListener('click', (e) => {
                if (e.target === modal) {
                    modal.classList.remove('show');
                }
            });
        }
    });
}

// ==================== 初始化 ====================
document.addEventListener('DOMContentLoaded', () => {
    setupPasswordToggles();
    bindEvents();
    loadConfig();
    loadStatus();

    // 定时刷新状态
    setInterval(loadStatus, 30000);
});
