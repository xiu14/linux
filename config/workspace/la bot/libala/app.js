let PRESETS = [], currentSessionId = null, currentAiAvatar = null, isRequesting = false, uploadedFiles = [];
// 新增：当前会话模型的上下文长度
let currentContextLen = 0;
let authToken = localStorage.getItem('authToken'), isAdmin = localStorage.getItem('isAdmin') === 'true';
let isSearchEnabled = false;

// 注册模式状态
let isRegisterMode = false;

// --- 核心修复：Marked 配置 - 增加代码高亮和复制按钮 ---
try {
    // 增加复制按钮的 HTML 模板
    // 注意：不使用 onclick，因为 DOMPurify 会过滤掉，改用事件委托
    const copyButtonHtml = `
        <button class="copy-code-btn icon-btn" style="position:absolute; top:8px; right:8px; background:rgba(255,255,255,0.2); color:#fff; padding:6px; border-radius:6px; font-size:12px; z-index:10;" title="复制">
            <i data-lucide="copy" style="width:14px;height:14px;"></i>
        </button>
    `;

    marked.use({
        breaks: true,
        gfm: true,
        async: false, // 强制同步
        highlight: function (code, lang) {
            // 安全检查 hljs 是否存在
            if (typeof hljs === 'undefined') return code;
            try {
                const language = hljs.getLanguage(lang) ? lang : 'plaintext';
                return hljs.highlight(code, { language }).value;
            } catch (e) {
                return code;
            }
        },
        renderer: {
            // 兼容新版 marked.js (v4+): 参数是对象 { text, lang, escaped }
            code(codeArg, langArg, escapedArg) {
                // 兼容新旧版本 API
                let code, lang, escaped;
                if (typeof codeArg === 'object' && codeArg !== null) {
                    // 新版 marked.js: 参数是对象
                    code = codeArg.text || codeArg.raw || '';
                    lang = codeArg.lang || '';
                    escaped = codeArg.escaped || false;
                } else {
                    // 旧版 marked.js: 参数是单独的值
                    code = codeArg || '';
                    lang = langArg || '';
                    escaped = escapedArg || false;
                }

                // 应用高亮
                if (typeof hljs !== 'undefined' && code) {
                    try {
                        const language = hljs.getLanguage(lang) ? lang : 'plaintext';
                        code = hljs.highlight(code, { language }).value;
                    } catch (e) {
                        // 高亮失败则使用原始代码
                    }
                }

                const languageClass = lang ? `language-${lang}` : 'hljs';

                // 将代码块包装在 pre 标签内，并添加复制按钮
                // 关键：pre 必须 relative 定位，以便 button 绝对定位
                return `<pre style="position:relative; padding-top:32px;"><code class="${languageClass}">${code}\n</code>${copyButtonHtml}</pre>`;
            },
        },
        hooks: {
            postprocess(html) {
                return html;
            }
        }
    });
} catch (e) {
    console.warn("Marked 配置警告:", e);
}

window.onload = function () {
    // 注册 PWA Service Worker
    if ('serviceWorker' in navigator) {
        window.addEventListener('load', () => {
            navigator.serviceWorker.register('./sw.js')
                .then(registration => {
                    console.log('SW registered:', registration);
                })
                .catch(error => {
                    console.log('SW registration failed:', error);
                });
        });
    }

    const theme = localStorage.getItem('theme') || 'light';
    document.documentElement.setAttribute('data-theme', theme);

    if (typeof lucide !== 'undefined') lucide.createIcons();

    if (authToken) initApp();

    // 聊天输入框回车发送
    const userInput = document.getElementById('userInput');
    if (userInput) {
        userInput.addEventListener('keydown', (e) => {
            if (e.key === 'Enter' && !e.shiftKey && !isTouchDevice()) { e.preventDefault(); sendMessage(); }
        });
    }

    // 登录页输入框回车提交
    const loginInputs = document.querySelectorAll('.login-input');
    loginInputs.forEach(input => {
        input.addEventListener('keydown', (e) => {
            if (e.key === 'Enter') handleSubmit();
        });
    });

    window.addEventListener('paste', handlePaste);

    // 事件委托：处理代码块复制按钮点击（因为 DOMPurify 会过滤 onclick）
    document.addEventListener('click', function (e) {
        const copyBtn = e.target.closest('.copy-code-btn');
        if (copyBtn) {
            e.stopPropagation();
            copyCode(copyBtn);
        }
    });
};

function isTouchDevice() { return 'ontouchstart' in window || navigator.maxTouchPoints > 0; }

// --- 统一提交函数：判断是登录还是注册 ---
async function handleSubmit() {
    if (isRegisterMode) {
        await handleRegister();
    } else {
        await handleLogin();
    }
}

// --- 切换 登录/注册 模式 ---
function toggleRegisterMode() {
    isRegisterMode = !isRegisterMode;
    const btn = document.getElementById('actionBtn');
    const switchText = document.querySelector('.switch-mode-text');
    const user = document.getElementById('loginUser');
    const pass = document.getElementById('loginPass');
    const confirmPass = document.getElementById('loginPassConfirm');
    const inviteInput = document.getElementById('regInviteCode');

    btn.classList.remove('fade-in');
    void btn.offsetWidth; // 触发重绘
    btn.classList.add('fade-in');

    if (isRegisterMode) {
        btn.innerText = "注册账号";
        switchText.innerHTML = '已有账号？<span style="color: #22d3ee; font-weight:600;">返回登录</span>';
        user.placeholder = "起个响亮的名字...";
        confirmPass.style.display = 'block';
        inviteInput.style.display = 'block';
        pass.value = '';
        confirmPass.value = '';
        inviteInput.value = '';
    } else {
        btn.innerText = "进入站点";
        switchText.innerHTML = '没有通行证？<span style="color: #22d3ee; font-weight:600;">立即注册</span>';
        user.placeholder = "写上你的代号，黎吧啦在听。";
        confirmPass.style.display = 'none';
        inviteInput.style.display = 'none';
    }
}

// --- 注册处理 ---
async function handleRegister() {
    const userVal = document.getElementById('loginUser').value.trim();
    const passVal = document.getElementById('loginPass').value.trim();
    const confirmVal = document.getElementById('loginPassConfirm').value.trim();
    const inviteVal = document.getElementById('regInviteCode').value.trim();

    if (!userVal || !passVal) return alert("代号和暗号都不能少。");
    if (passVal !== confirmVal) return alert("两次输入的暗号不一致。");

    try {
        const btn = document.getElementById('actionBtn');
        const originalText = btn.innerText;
        btn.innerText = "注册中...";
        btn.disabled = true;

        const res = await fetch('/api/register', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ username: userVal, password: passVal, inviteCode: inviteVal })
        });
        const data = await res.json();

        btn.innerText = originalText;
        btn.disabled = false;

        if (data.success) {
            alert(data.message);
            toggleRegisterMode();
            document.getElementById('loginUser').value = userVal;
            document.getElementById('loginPass').value = '';
            document.getElementById('loginPass').focus();
        } else {
            alert(data.message);
        }
    } catch (e) {
        alert("信号中断，无法连接注册中心。");
        document.getElementById('actionBtn').disabled = false;
    }
}

// --- 登录处理 ---
async function handleLogin() {
    const userVal = document.getElementById('loginUser').value.trim();
    const passVal = document.getElementById('loginPass').value.trim();

    if (!userVal || !passVal) return alert("请输入账号和密码");

    try {
        const btn = document.getElementById('actionBtn');
        const originalText = btn.innerText;
        btn.innerText = "验证中...";
        btn.disabled = true;

        const res = await fetch('/api/login', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ username: userVal, password: passVal })
        });
        const data = await res.json();

        btn.innerText = originalText;
        btn.disabled = false;

        if (data.success) {
            authToken = data.token;
            isAdmin = data.isAdmin;
            localStorage.setItem('authToken', authToken);
            localStorage.setItem('isAdmin', isAdmin);
            initApp();
        } else {
            alert(data.message || "账号或密码错误");
        }
    } catch (e) {
        alert("网络错误，请检查连接");
        document.getElementById('actionBtn').disabled = false;
    }
}

function logout() { localStorage.removeItem('authToken'); localStorage.removeItem('isAdmin'); location.reload(); }

async function initApp() {
    document.getElementById('login-screen').style.display = 'none';
    document.getElementById('app').style.display = 'flex';
    if (isAdmin) document.getElementById('adminBtn').style.display = 'flex';
    await fetchPresets();
    await fetchSessions();
    lucide.createIcons();
    checkAnnouncement(false);
}

// --- 搜索开关 ---
function toggleSearch() {
    isSearchEnabled = !isSearchEnabled;
    const btn = document.getElementById('searchToggleBtn');
    if (isSearchEnabled) {
        btn.style.color = '#10b981'; btn.style.background = 'rgba(16, 185, 129, 0.1)';
    } else {
        btn.style.color = ''; btn.style.background = '';
    }
}

// --- 公告系统逻辑 ---
let currentAnnounceTime = 0;

function switchAnnounceTab(tab) {
    document.querySelectorAll('.announce-tab').forEach(t => t.classList.remove('active'));
    document.getElementById(`tab-${tab}`).classList.add('active');

    document.getElementById('view-latest').style.display = tab === 'latest' ? 'block' : 'none';
    document.getElementById('view-history').style.display = tab === 'history' ? 'block' : 'none';

    if (tab === 'history') {
        fetchHistoryAnnouncements();
    }
}

async function fetchHistoryAnnouncements() {
    const container = document.getElementById('announceHistoryList');
    container.innerHTML = '<div style="text-align:center; padding:20px; color:var(--text-secondary);">加载中...</div>';

    try {
        const res = await fetch('/api/announcements/history', { headers: { 'Authorization': `Bearer ${authToken}` } });
        const json = await res.json();

        if (json.success && json.data && json.data.length > 0) {
            container.innerHTML = json.data.map(item => {
                const dateStr = new Date(item.timestamp).toLocaleString();
                // 使用 try-catch 保护 marked
                let htmlContent = item.content;
                try { htmlContent = DOMPurify.sanitize(marked.parse(item.content)); } catch (e) { }

                return `
                    <div style="background:var(--bg-color); border:1px solid var(--border-color); border-radius:8px; padding:16px; font-size:14px;">
                        <div style="font-size:12px; color:var(--text-secondary); margin-bottom:8px; border-bottom:1px solid var(--border-color); padding-bottom:8px; display:flex; justify-content:space-between;">
                            <span>${dateStr}</span>
                            <span style="opacity:0.5">#${item.id}</span>
                        </div>
                        <div style="line-height:1.6; color:var(--text-color);">${htmlContent}</div>
                    </div>
                `;
            }).join('');
        } else {
            container.innerHTML = '<div style="text-align:center; padding:20px; color:var(--text-secondary);">暂无历史公告</div>';
        }
    } catch (e) {
        container.innerHTML = '<div style="text-align:center; padding:20px; color:var(--danger-color);">加载失败</div>';
    }
}

async function checkAnnouncement(force) {
    switchAnnounceTab('latest');

    try {
        const res = await fetch('/api/announcement', { headers: { 'Authorization': `Bearer ${authToken}` } });
        const json = await res.json();
        const contentDiv = document.getElementById('view-latest');

        if (json.success && json.data) {
            const { content, timestamp } = json.data;
            currentAnnounceTime = timestamp;
            const last = localStorage.getItem('lastReadAnnounce');

            try {
                contentDiv.innerHTML = DOMPurify.sanitize(marked.parse(content));
            } catch (err) {
                contentDiv.innerText = content;
            }

            if (force || (!last || parseInt(last) < timestamp)) {
                document.getElementById('announceModal').classList.add('open');
            }
        } else {
            contentDiv.innerHTML = '<div style="text-align:center; padding:40px; color:var(--text-secondary);">暂无最新公告</div>';
            if (force) document.getElementById('announceModal').classList.add('open');
        }
    } catch (e) { }
}

function closeAnnouncement() {
    document.getElementById('announceModal').classList.remove('open');
    if (currentAnnounceTime > 0) localStorage.setItem('lastReadAnnounce', currentAnnounceTime);
}

async function postAnnouncement() {
    const content = document.getElementById('announceInput').value;
    if (!content.trim()) return alert("内容不能为空");
    if (!confirm("确定发布？会自动追加当前时间。")) return;
    await fetch('/api/admin/announcement', { method: 'POST', headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${authToken}` }, body: JSON.stringify({ content }) });
    alert("发布成功"); document.getElementById('announceInput').value = ''; fetchAdminAnnouncements();
}
async function fetchAdminAnnouncements() {
    const res = await fetch('/api/admin/announcement/list', { headers: { 'Authorization': `Bearer ${authToken}` } });
    const json = await res.json();
    const div = document.getElementById('adminAnnounceList'); div.innerHTML = '';
    if (json.success && json.data) {
        json.data.forEach(a => {
            div.innerHTML += `
            <div style="padding:8px; border:1px solid var(--border-color); border-radius:6px; background:var(--bg-color); font-size:13px; display:flex; justify-content:space-between; align-items:center;">
                <div style="white-space:nowrap; overflow:hidden; text-overflow:ellipsis; max-width:80%;">${a.content.substring(0, 30)}...</div>
                <button class="icon-btn" style="color:var(--danger-color); padding:4px;" onclick="deleteAnnouncement(${a.id})"><i data-lucide="trash-2" style="width:14px"></i></button>
            </div>`;
        });
        lucide.createIcons();
    }
}
async function deleteAnnouncement(id) {
    if (!confirm("确定删除此公告？")) return;
    await fetch('/api/admin/announcement/delete', { method: 'POST', headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${authToken}` }, body: JSON.stringify({ id }) });
    fetchAdminAnnouncements();
}

// --- 管理后台：邀请码逻辑 ---
async function fetchInviteInfo() {
    try {
        const res = await fetch(`/api/admin/invite/info?_=${Date.now()}`, { headers: { 'Authorization': `Bearer ${authToken}` } });
        const data = await res.json();
        if (data.success) {
            const statusText = document.getElementById('inviteStatusText');
            const toggleBtn = document.getElementById('inviteToggleBtn');
            if (data.inviteRequired) {
                statusText.innerText = '已开启'; statusText.style.color = '#10b981';
                toggleBtn.innerText = '关闭'; toggleBtn.style.background = 'var(--danger-color)';
            } else {
                statusText.innerText = '已关闭'; statusText.style.color = 'var(--text-secondary)';
                toggleBtn.innerText = '开启'; toggleBtn.style.background = 'var(--text-secondary)';
            }
            const listDiv = document.getElementById('inviteCodeList');
            if (data.codes.length === 0) listDiv.innerHTML = '<div style="grid-column:1/-1; text-align:center; padding:10px; opacity:0.5;">暂无可用邀请码</div>';
            else listDiv.innerHTML = data.codes.map(code => `<div onclick="copyText('${code}')" style="background:var(--bg-color); border:1px solid var(--border-color); border-radius:6px; padding:8px; text-align:center; cursor:pointer; font-family:monospace; letter-spacing:1px; position:relative;" title="点击复制">${code}</div>`).join('');
        }
    } catch (e) { console.error(e); }
}
async function toggleInviteSystem() {
    try { const res = await fetch('/api/admin/invite/toggle', { method: 'POST', headers: { 'Authorization': `Bearer ${authToken}` } }); const data = await res.json(); if (data.success) fetchInviteInfo(); } catch (e) { alert("操作失败"); }
}
async function generateInviteCode() {
    try { const res = await fetch('/api/admin/invite/generate', { method: 'POST', headers: { 'Authorization': `Bearer ${authToken}` } }); const data = await res.json(); if (data.success) fetchInviteInfo(); } catch (e) { alert("生成失败"); }
}
function copyText(text) {
    // 使用 document.execCommand('copy') 作为备用方案
    if (navigator.clipboard) {
        navigator.clipboard.writeText(text).then(() => {
            // 避免使用 alert，这里改用一个轻量级提示
            showToast("已复制到剪贴板");
        });
    } else {
        const textarea = document.createElement('textarea');
        textarea.value = text;
        document.body.appendChild(textarea);
        textarea.select();
        try {
            document.execCommand('copy');
            showToast("已复制到剪贴板 (Fallback)");
        } catch (err) {
            console.error('Fallback copy failed: ', err);
        }
        document.body.removeChild(textarea);
    }
}

// --- 模型预设逻辑 ---
async function fetchPresets() {
    try {
        const res = await fetch('/api/config');
        const data = await res.json();
        if (data.success) {
            let presets = data.presets;
            // 确保 libala_main 在最前面
            const libalaIndex = presets.findIndex(p => p.id === 'libala_main');
            if (libalaIndex !== -1) {
                const libalaPreset = presets.splice(libalaIndex, 1)[0];
                presets.unshift(libalaPreset);
            }
            PRESETS = presets;
            renderPresetsSidebar();
        }
    } catch (e) { }
}

function renderPresetsSidebar() {
    const list = document.getElementById('presetList');
    list.innerHTML = '';
    PRESETS.forEach(p => {
        let iconHtml = p.icon || '⚡';
        if (iconHtml.startsWith('http') || iconHtml.startsWith('/') || iconHtml.startsWith('data:image') || iconHtml.includes('.')) {
            iconHtml = `<img src="${iconHtml}" class="model-logo-img" alt="${p.name}">`;
        }

        list.innerHTML += `
        <div class="mode-card" onclick="createNewSession('${p.id}')">
            <div class="mode-icon">${iconHtml}</div>
            <div class="mode-info">
                <div>${p.name}</div>
                <div>${p.desc}</div>
            </div>
        </div>`;
    });
}

// --- 管理后台逻辑 ---
async function openAdmin() {
    document.getElementById('adminModal').classList.add('open');
    await fetchAdminStats();
    await fetchAdminPresets();
}

async function fetchAdminStats() {
    const grid = document.getElementById('statGrid');
    try {
        const res = await fetch(`/api/admin/data?_=${Date.now()}`, { headers: { 'Authorization': `Bearer ${authToken}` } });
        const data = await res.json();
        if (data.success && data.usage) {
            grid.innerHTML = '';
            for (const [u, map] of Object.entries(data.usage)) {
                let t = 0, list = '';
                for (const [mid, c] of Object.entries(map)) {
                    t += c;
                    const preset = data.presets.find(p => p.id === mid);
                    let iconHtml = '';
                    if (preset) {
                        const rawIcon = preset.icon || '';
                        if (rawIcon.startsWith('http') || rawIcon.startsWith('/') || rawIcon.startsWith('data:') || rawIcon.includes('.')) {
                            iconHtml = `<img src="${rawIcon}" style="width:16px;height:16px;object-fit:contain;vertical-align:text-bottom;margin-right:4px;border-radius:2px;">`;
                        } else {
                            iconHtml = rawIcon + ' ';
                        }
                    }
                    const displayName = preset ? `${preset.name}` : mid;
                    list += `<div style="display:flex;justify-content:space-between;font-size:13px;padding:4px 0;">
                        <span style="display:flex;align-items:center;overflow:hidden;text-overflow:ellipsis;white-space:nowrap;max-width:85%;">
                            ${iconHtml} ${displayName}
                        </span>
                        <strong>${c}</strong>
                    </div>`;
                }
                grid.innerHTML += `<div style="background:var(--bg-color);border:1px solid var(--border-color);padding:16px;border-radius:12px;">
                    <div style="font-weight:600;margin-bottom:8px;">${u} <span style="float:right;background:var(--primary-color);color:#fff;padding:0 6px;border-radius:8px;font-size:12px;">${t}</span></div>
                    ${list}
                </div>`;
            }
        }
    } catch (e) { console.error("Stats load failed", e); }
}

async function fetchAdminPresets() {
    const pl = document.getElementById('adminPresetList');
    try {
        const res = await fetch(`/api/admin/data?_=${Date.now()}`, { headers: { 'Authorization': `Bearer ${authToken}` } });
        const data = await res.json();
        if (data.success && data.presets) {
            pl.innerHTML = '';
            data.presets.forEach(p => {
                const presetJsonString = JSON.stringify(p);
                pl.innerHTML += `<div style="display:flex;justify-content:space-between;align-items:center;padding:12px;background:var(--bg-color);border:1px solid var(--border-color);border-radius:8px;"><div><strong>${p.name}</strong></div><div><button class="icon-btn" onclick='editPreset(JSON.stringify(${presetJsonString}))'><i data-lucide="edit-3" style="width:16px;"></i></button><button class="icon-btn" style="color:var(--danger-color)" onclick="deletePreset('${p.id}')"><i data-lucide="trash-2" style="width:16px;"></i></button></div></div>`;
            });
            lucide.createIcons();
        }
    } catch (e) { console.error("Presets load failed", e); }
}

function editPreset(jsonStr) {
    const p = JSON.parse(jsonStr);
    document.getElementById('addId').value = p.id;
    document.getElementById('addName').value = p.name;
    document.getElementById('addIcon').value = p.icon || '';
    document.getElementById('addDesc').value = p.desc;
    document.getElementById('addPrompt').value = p.system_prompt || '';
    document.getElementById('addUrl').value = p.url;
    document.getElementById('addKey').value = p.key;
    document.getElementById('addModelId').value = p.modelId;
    // 新增：上下文长度
    document.getElementById('addContextLen').value = p.context_length || '';
    document.getElementById('addFormTitle').innerText = "编辑预设";
    document.getElementById('savePresetBtn').innerText = "保存";
    document.querySelectorAll('.accordion-item')[3].classList.add('active');
}

function resetPresetForm() {
    document.getElementById('addId').value = '';
    document.getElementById('addPrompt').value = '';
    document.getElementById('addContextLen').value = ''; // 重置上下文长度
    document.querySelectorAll('#adminModal input[type="text"]').forEach(i => i.value = '');
    document.getElementById('addFormTitle').innerText = "添加新预设";
    document.getElementById('savePresetBtn').innerText = "保存";
}

async function savePreset() {
    const p = {
        id: document.getElementById('addId').value,
        name: document.getElementById('addName').value,
        url: document.getElementById('addUrl').value,
        key: document.getElementById('addKey').value,
        modelId: document.getElementById('addModelId').value,
        desc: document.getElementById('addDesc').value,
        icon: document.getElementById('addIcon').value,
        system_prompt: document.getElementById('addPrompt').value.trim(),
        // 新增：获取上下文长度
        context_length: document.getElementById('addContextLen').value.trim()
    };
    if (!p.name || !p.url || !p.key || !p.modelId) return alert("请填写完整");

    const scrollContainer = document.querySelector('.admin-body');
    const savedScrollTop = scrollContainer ? scrollContainer.scrollTop : 0;

    await fetch('/api/admin/preset', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${authToken}` },
        body: JSON.stringify(p)
    });

    resetPresetForm();
    await fetchAdminPresets();
    await fetchPresets();

    if (scrollContainer) scrollContainer.scrollTop = savedScrollTop;
}

// --- 辅助函数：替换 Alert 和 Copy Code ---
function showToast(message) {
    // 避免使用 alert()。使用轻量级提示。
    const existing = document.getElementById('toast');
    if (existing) existing.remove();

    const toast = document.createElement('div');
    toast.id = 'toast';
    toast.style.cssText = `
        position: fixed; bottom: 30px; left: 50%; transform: translateX(-50%); 
        background: var(--primary-color); color: white; padding: 10px 20px; 
        border-radius: 8px; font-size: 14px; z-index: 1000; opacity: 0; 
        transition: all 0.3s ease-in-out; box-shadow: 0 4px 12px rgba(0,0,0,0.2);
    `;
    toast.innerText = message;
    document.body.appendChild(toast);

    setTimeout(() => { toast.style.opacity = 1; }, 10);
    setTimeout(() => {
        toast.style.opacity = 0;
        setTimeout(() => toast.remove(), 300);
    }, 2000);
}

function copyCode(button) {
    // 复制 Markdown 代码块或指令
    // 防止冒泡触发其他点击事件
    if (event) event.stopPropagation();

    const pre = button.closest('pre');
    if (!pre) return;

    // 找到 pre 内的 code 标签，获取文本内容
    const codeElement = pre.querySelector('code');
    const textToCopy = codeElement.innerText;

    copyText(textToCopy); // 使用前面定义的 copyText 函数

    // 更改按钮图标和提示
    const icon = button.querySelector('i');
    if (icon) {
        icon.setAttribute('data-lucide', 'check');
        lucide.createIcons({ root: button });

        setTimeout(() => {
            icon.setAttribute('data-lucide', 'copy');
            lucide.createIcons({ root: button });
        }, 1500);
    }
}

/**
 * 处理思考链：检测并折叠 AI 的思考过程
 * 支持格式：<think>...</think>, <thinking>...</thinking>
 * @param {string} text - 原始文本
 * @returns {string} 处理后的文本
 */
function processThinkingChain(text) {
    if (!text) return text;

    // 匹配 <think>...</think> 或 <thinking>...</thinking> 标签（支持多行）
    const thinkRegex = /<(think|thinking)>([\s\S]*?)<\/\1>/gi;

    let hasThinking = false;
    let processedText = text.replace(thinkRegex, (match, tag, content) => {
        hasThinking = true;
        const trimmedContent = content.trim();
        if (!trimmedContent) return '';

        // 生成折叠的 HTML（不用 Markdown，直接用 HTML details 标签）
        // 注意：返回的内容会被 marked 解析，所以用特殊占位符
        return `\n\n<details class="thinking-block"><summary>💭 查看思考过程</summary>\n\n${trimmedContent}\n\n</details>\n\n`;
    });

    return processedText;
}


// --- Token 计算与显示逻辑 (简单模拟) ---
function formatToken(tokens) {
    if (tokens >= 1000000) return (tokens / 1000000).toFixed(1) + 'M';
    if (tokens >= 1000) return Math.round(tokens / 1000) + 'k';
    return tokens;
}

function countTokens(messages) {
    let count = 0;
    messages.forEach(msg => {
        let textContent = '';
        if (typeof msg.content === 'string') {
            textContent = msg.content;
        } else if (Array.isArray(msg.content)) {
            textContent = msg.content.map(c => c.type === 'text' ? c.text : '').join(' ');
            // 粗略估算图片 token: 170 tokens/image (实际复杂得多)
            const imageCount = msg.content.filter(c => c.type === 'image_url').length;
            count += imageCount * 170;
        }
        // 粗略估算 token: 1 字符约等于 0.5~1 token (中文/英文混合)
        count += textContent.length * 0.75;
    });
    return Math.round(count);
}

function updateTokenDisplay(currentTokens) {
    const tokenDisplay = document.getElementById('tokenDisplay');
    const tokenLimitText = document.getElementById('tokenLimitText');
    const tokenCurrentText = document.getElementById('tokenCurrentText');

    if (currentContextLen > 0) {
        tokenLimitText.innerText = formatToken(currentContextLen);
        tokenCurrentText.innerText = formatToken(currentTokens);
        tokenDisplay.style.display = 'flex';

        // 样式提醒
        const usage = currentTokens / currentContextLen;
        if (usage > 0.8) {
            tokenDisplay.style.color = 'var(--danger-color)';
            tokenDisplay.style.borderColor = 'var(--danger-color)';
        } else if (usage > 0.6) {
            tokenDisplay.style.color = '#f59e0b'; // Amber
            tokenDisplay.style.borderColor = '#f59e0b';
        } else {
            tokenDisplay.style.color = 'var(--text-secondary)';
            tokenDisplay.style.borderColor = 'var(--border-color)';
        }

    } else {
        tokenDisplay.style.display = 'none';
    }
}


// --- 会话/聊天逻辑 ---
async function fetchSessions() {
    const res = await fetch('/api/sessions', { headers: { 'Authorization': `Bearer ${authToken}` } });
    const json = await res.json();
    if (json.success) {
        const container = document.getElementById('sessionListContainer'); container.innerHTML = '';
        document.getElementById('sessionCount').innerText = `${json.data.length}`;
        const groups = { '今天': [], '昨天': [], '7天内': [], '更早': [] };
        json.data.forEach(s => {
            const d = new Date(s.updated_at), now = new Date(), diff = now - d, oneDay = 86400000;
            let label = '更早';
            if (d.toDateString() === now.toDateString()) label = '今天';
            else if (diff < oneDay * 2 && d.getDate() !== now.getDate()) label = '昨天';
            else if (diff < oneDay * 7) label = '7天内';
            groups[label].push(s);
        });
        ['今天', '昨天', '7天内', '更早'].forEach(label => {
            if (groups[label].length) {
                container.innerHTML += `<div class="session-group"><div class="group-header">${label}</div>` + groups[label].map(s => {
                    const p = PRESETS.find(x => x.id === s.mode);
                    let iconStr = p ? (p.icon || '⚡') : '⚡';
                    if (iconStr.startsWith('http') || iconStr.startsWith('/') || iconStr.includes('.')) {
                        iconStr = `<img src="${iconStr}" style="width:16px;height:16px;object-fit:contain;border-radius:2px;">`;
                    }
                    return `<div class="session-item ${s.id === currentSessionId ? 'active' : ''}" onclick="loadSession('${s.id}')"><div class="session-title"><span style="font-size:16px;display:flex;align-items:center;">${iconStr}</span><span>${s.title}</span></div><div class="session-actions"><button class="icon-btn" onclick="renameSession('${s.id}','${s.title}');event.stopPropagation()"><i data-lucide="edit-2" style="width:14px"></i></button><button class="icon-btn" style="color:var(--danger-color)" onclick="deleteSession('${s.id}');event.stopPropagation()"><i data-lucide="trash-2" style="width:14px"></i></button></div></div>`;
                }).join('') + `</div>`;
            }
        });
        if (!currentSessionId && json.data.length) loadSession(json.data[0].id);
        lucide.createIcons();
    }
}

async function loadSession(id) {
    if (isRequesting) return;
    currentSessionId = id;
    document.getElementById('searchInput').value = '';
    document.getElementById('normalSidebarList').style.display = 'flex'; document.getElementById('searchResultList').style.display = 'none';
    document.getElementById('chat-box').innerHTML = '<div style="text-align:center; padding:40px; color:var(--text-secondary);">加载中...</div>';

    try {
        const res = await fetch(`/api/session/${id}`, { headers: { 'Authorization': `Bearer ${authToken}` } });
        const json = await res.json();

        const currentPreset = PRESETS.find(p => p.id === json.session.mode);
        currentAiAvatar = currentPreset ? (currentPreset.icon || 'bot') : 'bot';
        // 更新上下文长度
        currentContextLen = currentPreset ? (currentPreset.context_length || 0) : 0;

        document.getElementById('headerTitle').innerText = json.session.title;
        const box = document.getElementById('chat-box');
        box.innerHTML = '';

        if (json.messages.length === 0)
            box.innerHTML = '<div id="emptyState" style="text-align:center; padding:80px; color:var(--text-secondary);"><i data-lucide="message-square-plus" style="width:48px;height:48px;opacity:0.2;margin-bottom:16px;"></i><br>开始新的对话</div>';

        // 计算 Token
        const currentTokens = countTokens(json.messages.map(m => ({ role: m.role, content: m.content })));
        updateTokenDisplay(currentTokens);

        // 渲染消息循环，增加 try-catch 保护
        json.messages.forEach(m => {
            try {
                let textContent = '';
                let images = [];

                if (typeof m.content === 'string') {
                    textContent = m.content;
                } else if (Array.isArray(m.content)) {
                    // 处理多部分内容
                    const textParts = [];
                    m.content.forEach(c => {
                        if (c.type === 'text') {
                            // 检测文件附件格式：[文件 xxx.json]:\n内容...
                            const fileMatch = c.text.match(/^\[文件 ([^\]]+)\]:\n/);
                            if (fileMatch) {
                                // 只显示文件名，不显示完整内容
                                textParts.push(`📎 ${fileMatch[1]}`);
                            } else {
                                textParts.push(c.text);
                            }
                        } else if (c.type === 'image_url') {
                            images.push(c.image_url.url);
                        }
                    });
                    textContent = textParts.join('\n');
                }

                // 给 AI 消息一个 ID，用于重新生成
                const msgId = m.role === 'assistant' ? `msg-${m.timestamp}-${Math.random().toString(36).substring(2, 6)}` : null;
                appendUI(msgId, m.role, textContent, images, false, m.timestamp);
            } catch (err) {
                console.error("渲染消息失败:", err);
            }
        });

        fetchSessions();
        lucide.createIcons();
        if (window.innerWidth < 1000) { document.getElementById('sidebar').classList.remove('open'); document.querySelector('.overlay').classList.remove('show'); }
    } catch (e) { document.getElementById('chat-box').innerHTML = "加载失败: " + e.message; }
}

async function createNewSession(pid) {
    const res = await fetch('/api/session/new', { method: 'POST', headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${authToken}` }, body: JSON.stringify({ presetId: pid }) });
    const json = await res.json();
    if (json.success) { await fetchSessions(); loadSession(json.id); }
}
async function renameSession(id, old) {
    const t = prompt("新标题", old);
    if (t && t !== old) {
        await fetch('/api/session/rename', { method: 'POST', headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${authToken}` }, body: JSON.stringify({ id, title: t }) });
        fetchSessions(); if (currentSessionId === id) document.getElementById('headerTitle').innerText = t;
    }
}
async function deleteSession(id) {
    if (!confirm("确定删除?")) return;
    await fetch('/api/session/delete', { method: 'POST', headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${authToken}` }, body: JSON.stringify({ id }) });
    if (currentSessionId === id) { currentSessionId = null; document.getElementById('chat-box').innerHTML = ''; document.getElementById('headerTitle').innerText = '左耳 AI'; }
    fetchSessions();
}

/**
 * 重新生成回复
 * @param {string} msgId 要重新生成的 AI 消息的 ID
 */
async function regenerateResponse(msgId) {
    if (isRequesting || !currentSessionId) return;

    // 1. 从 DOM 中移除旧的 AI 消息
    const oldAiMsg = document.getElementById(msgId);
    if (!oldAiMsg) {
        showToast("无法定位旧消息进行删除，请刷新。");
        return;
    }

    // 在移除之前，获取它的前一个兄弟元素（用户消息），并检查它是用户消息
    const userMsg = oldAiMsg.previousElementSibling;
    if (!userMsg || !userMsg.classList.contains('user')) {
        showToast("消息结构错误或上下文不完整，正在重新加载会话...");
        loadSession(currentSessionId);
        return;
    }

    // 移除旧的 AI 消息
    oldAiMsg.remove();


    // 2. 重新加载会话以获取最新的消息列表
    const sessRes = await fetch(`/api/session/${currentSessionId}`, { headers: { 'Authorization': `Bearer ${authToken}` } });
    const sessData = await sessRes.json();

    // 3. 构造用于 API 的消息列表
    // 核心修复：后端可能还未删除那条 AI 消息，所以获取到的列表中最后一条可能是 assistant
    // 我们必须手动移除末尾的 assistant 消息，确保最后一条是 user
    let messages = sessData.messages.map(m => ({ role: m.role, content: m.content }));

    // 循环移除末尾的非 user 消息 (通常只有一条 assistant，但为了保险起见)
    while (messages.length > 0 && messages[messages.length - 1].role !== 'user') {
        messages.pop();
    }

    const lastMsg = messages[messages.length - 1];

    if (!lastMsg || lastMsg.role !== 'user') {
        showToast("无法进行重新生成，消息上下文不完整。");
        loadSession(currentSessionId); // 重新加载会话
        return;
    }

    // 4. 发起请求
    // 注意：我们将完整的消息历史（以用户消息结束）发送给后端，并标记 isRegenerate
    await sendMessage(messages, true, sessData.session.mode);
}


/**
 * 发送消息的核心函数
 * @param {Array<object>} [messageContext] - 可选。重新生成时传入完整的上下文消息列表。
 * @param {boolean} [isRegenerate=false] - 是否是重新生成请求。
 * @param {string} [presetIdOverride] - 重新生成时使用的预设 ID。
 */
async function sendMessage(messageContext = null, isRegenerate = false, presetIdOverride = null) {
    if (isRequesting || !currentSessionId) return;
    const input = document.getElementById('userInput');
    const text = input.value.trim();

    let messages = messageContext;
    let currentPresetId;
    let payload;
    let aiMsgElement;

    if (!isRegenerate) {
        if (!text && uploadedFiles.length === 0) return;

        // 1. 构建新的用户消息 payload
        payload = uploadedFiles.map(f => f.type.startsWith('image/') ? { type: "image_url", image_url: { url: f.data } } : { type: "text", text: `[文件 ${f.name}]:\n${f.data}\n` });
        if (text) payload.push({ type: "text", text });

        // 2. 立即显示用户消息
        appendUI(null, "user", text + (uploadedFiles.length ? `\n(📎 ${uploadedFiles.length} 附件)` : ''), uploadedFiles.filter(f => f.type.startsWith('image/')).map(f => f.data), false, Date.now());

        // 用户发送消息后，滚动到底部一次
        document.getElementById('chat-box').scrollTop = document.getElementById('chat-box').scrollHeight;

        // 3. 获取完整上下文，并将新消息加入
        const sessRes = await fetch(`/api/session/${currentSessionId}`, { headers: { 'Authorization': `Bearer ${authToken}` } });
        const sessData = await sessRes.json();
        currentPresetId = sessData.session.mode;

        messages = sessData.messages.map(m => ({ role: m.role, content: m.content }));
        messages.push({ role: "user", content: payload }); // 包含了 R2 链接或 Base64 的消息

        input.value = ''; uploadedFiles = []; renderPreviews(); autoResize(input);

    } else {
        // 重新生成模式：messages 已经被传入，不需要重新构建 payload 或清空输入框
        if (!messages) return;
        currentPresetId = presetIdOverride;
    }

    isRequesting = true; document.getElementById('sendBtn').disabled = true;

    // Get the ID string first
    const aiMsgId = appendUI(null, "ai", "", [], true);

    // 立即获取元素引用，以避免在流结束时因 ID 被删除而导致的空指针错误
    aiMsgElement = document.getElementById(aiMsgId);
    const aiContentDiv = aiMsgElement ? aiMsgElement.querySelector('.message-content') : null;
    const aiMsgBubble = aiMsgElement ? aiMsgElement.querySelector('.message-bubble') : null;

    if (!aiMsgElement || !aiContentDiv || !aiMsgBubble) {
        console.error("Critical UI error: Could not find AI message elements after appendUI.");
        isRequesting = false;
        document.getElementById('sendBtn').disabled = false;
        showToast("UI 渲染失败，请刷新页面。");
        return;
    }

    let aiFullText = "";

    try {
        const res = await fetch('/api/chat', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${authToken}` },
            body: JSON.stringify({
                sessionId: currentSessionId,
                presetId: currentPresetId,
                messages: messages,
                useSearch: isSearchEnabled,
                isRegenerate: isRegenerate
            })
        });

        if (!res.ok) {
            const errorJson = await res.json();
            throw new Error(`API 错误: ${errorJson.error.message || res.statusText}`);
        }

        const reader = res.body.getReader();
        const decoder = new TextDecoder("utf-8");
        while (true) {
            const { done, value } = await reader.read();
            if (done) break;
            const lines = decoder.decode(value, { stream: true }).split('\n');

            // 处理 SSE 流
            for (const line of lines) {
                if (line.startsWith('data: ')) {
                    const d = line.slice(6).trim();
                    if (d === '[DONE]') continue;
                    try {
                        const j = JSON.parse(d);
                        const chunk = j.choices?.[0]?.delta?.content || j.content || "";
                        if (chunk) { aiFullText += chunk; }
                    } catch (e) {
                        console.error("SSE JSON Parse Error:", e);
                    }
                }
            }

            // 流式渲染保护 - 优化 Markdown 渲染逻辑
            if (aiFullText) {
                try {
                    // 处理思考链并渲染 Markdown
                    const processedText = processThinkingChain(String(aiFullText));
                    const rawHtml = marked.parse(processedText);
                    aiContentDiv.innerHTML = DOMPurify.sanitize(rawHtml, { ADD_TAGS: ['details', 'summary'], ADD_ATTR: ['class'] });
                } catch (err) {
                    // 忽略流式过程中的解析错误
                }
            }

            // 流式输出过程中不再自动滚动，让用户可以自由查看历史消息
        }

        // 最终渲染保护：修复"消息完成后渲染失效"的问题
        try {
            // 1. 处理思考链并进行核心渲染
            const processedText = processThinkingChain(String(aiFullText));
            const finalHtml = marked.parse(processedText);
            aiContentDiv.innerHTML = DOMPurify.sanitize(finalHtml, { ADD_TAGS: ['details', 'summary'], ADD_ATTR: ['class'] });

            // 2. 渲染代码块中的 lucide 图标（复制按钮）
            try {
                lucide.createIcons({ root: aiContentDiv });
            } catch (iconError) {
                console.warn("渲染复制按钮图标失败:", iconError);
            }
        } catch (e) {
            console.error("Final render error:", e);
            // 只有核心 Markdown 解析彻底失败时，才回退到纯文本
            aiContentDiv.innerText = aiFullText;
        }

        // --- 修复关键：使用引用插入 meta 和按钮 ---
        // 插入元数据
        aiMsgBubble.insertAdjacentHTML('beforeend', `<div class="msg-meta">${formatTime(Date.now())}</div>`);

        // 插入重新生成按钮
        aiMsgBubble.insertAdjacentHTML('beforeend', `
            <div class="regenerate-action" style="margin-top:8px; text-align:right;">
                <button class="icon-btn" onclick="regenerateResponse('${aiMsgId}')" style="color:var(--primary-color); background:rgba(0,0,0,0.05); padding:4px 10px; border-radius:6px; font-size:12px;">
                    <i data-lucide="rotate-ccw" style="width:14px; margin-right:4px;"></i> 重新生成
                </button>
            </div>
        `);
        lucide.createIcons({ root: aiMsgBubble });

        // 刷新会话列表并更新 Token 显示
        fetchSessions();
        const updatedSessRes = await fetch(`/api/session/${currentSessionId}`, { headers: { 'Authorization': `Bearer ${authToken}` } });
        const updatedSessData = await updatedSessRes.json();
        const updatedTokens = countTokens(updatedSessData.messages.map(m => ({ role: m.role, content: m.content })));
        updateTokenDisplay(updatedTokens);

    } catch (e) {
        // --- 修复关键：使用引用插入错误提示和按钮 ---
        const errorMsgHtml = `<br><span style="color:var(--danger-color)">Error: ${e.message}</span>`;
        // 如果 aiContentDiv 已经被流式渲染填充，则追加错误信息
        aiContentDiv.innerHTML += errorMsgHtml;

        // 插入重新生成按钮
        aiMsgBubble.insertAdjacentHTML('beforeend', `
            <div class="regenerate-action" style="margin-top:8px; text-align:right;">
                <button class="icon-btn" onclick="regenerateResponse('${aiMsgId}')" style="color:var(--primary-color); background:rgba(0,0,0,0.05); padding:4px 10px; border-radius:6px; font-size:12px;">
                    <i data-lucide="rotate-ccw" style="width:14px; margin-right:4px;"></i> 重新生成
                </button>
            </div>
        `);
        lucide.createIcons({ root: aiMsgBubble }); // Refresh icons in the bubble
    } finally {
        isRequesting = false;
        document.getElementById('sendBtn').disabled = false;
    }
}

function formatTime(ts) { const d = new Date(ts); return `${String(d.getHours()).padStart(2, '0')}:${String(d.getMinutes()).padStart(2, '0')}`; }

/**
 * 渲染 UI 消息
 * @param {string | null} id - 消息的 DOM ID，用于重新生成。
 * @param {string} role - 角色 ('user' 或 'ai')
 * @param {string} text - 消息的纯文本内容。
 * @param {Array<string>} images - 图片 URL 数组。
 * @param {boolean} isLoading - 是否为加载状态。
 * @param {number | null} timestamp - 时间戳。
 * @returns {string} 消息的 DOM ID。
 */
function appendUI(id, role, text, images = [], isLoading = false, timestamp = null) {
    const empty = document.getElementById('emptyState');
    if (empty) empty.remove();
    const box = document.getElementById('chat-box');
    const div = document.createElement('div');
    div.className = `message-row ${role === 'user' ? 'user' : 'ai'}`;

    // 使用时间戳和随机数生成唯一的 ID，用于流式渲染和重新生成追踪
    const messageId = id || (role === 'ai' ? `msg-${Date.now()}-${Math.random().toString(36).substring(2, 6)}` : null);
    if (messageId) div.id = messageId;

    let avatarHtml = '';
    if (role === 'user') {
        avatarHtml = `<i data-lucide="user" style="width:18px"></i>`;
    } else {
        const icon = currentAiAvatar || 'bot';
        if (icon.startsWith('http') || icon.startsWith('/') || icon.startsWith('data:') || icon.includes('.')) {
            avatarHtml = `<img src="${icon}" style="width:100%; height:100%; object-fit: cover;">`;
        } else if (/^[\u0000-\u007F]+$/.test(icon) && icon.length > 2) {
            avatarHtml = `<i data-lucide="${icon}" style="width:18px"></i>`;
        } else {
            avatarHtml = `<span style="font-size: 20px; line-height: 1;">${icon}</span>`;
        }
    }

    let cHtml = '';

    if (role === 'user') {
        cHtml = images.map(u => `<img src="${u}">`).join('<br>') + (text ? text.replace(/</g, "&lt;") : '');
    } else {
        if (isLoading) {
            cHtml = '<span style="color:var(--text-secondary)">Thinking...</span>';
        } else {
            try {
                // 安全渲染，防止 marked 报错阻塞 UI
                cHtml = DOMPurify.sanitize(marked.parse(String(text)));
                // 渲染完整消息时也尝试添加按钮
                setTimeout(() => {
                    try { addCopyButtons(div.querySelector('.message-content')); } catch (e) { }
                }, 0);
            } catch (e) {
                console.error("Marked parse error:", e);
                cHtml = text.replace(/</g, "&lt;"); // 降级为纯文本
            }
        }
    }

    // 渲染 AI 消息时，只包含内容和头像，元数据和重新生成按钮由 sendMessage 负责追加
    div.innerHTML = `<div class="avatar ${role === 'user' ? 'user-avatar' : 'ai-avatar'}">${avatarHtml}</div><div class="message-bubble"><div class="message-content">${cHtml}</div>${(timestamp && !isLoading) ? `<div class="msg-meta">${formatTime(timestamp)}</div>` : ''}</div>`;
    box.appendChild(div); box.scrollTop = box.scrollHeight; lucide.createIcons({ root: div });
    return messageId;
}

/**
 * 遍历消息内容，为代码块添加复制按钮 (供最终渲染调用)
 */
function addCopyButtons(element) {
    if (!element) return;

    if (typeof element === 'string') {
        // 如果传入的是 HTML 字符串，不处理，marked renderer 已经处理了
        return element;
    }

    // 如果传入的是 DOM 元素
    element.querySelectorAll('pre').forEach(pre => {
        // 复制按钮已在 marked.js 的 renderer.code 中添加 HTML 结构
        // 这里只需确保 lucide 图标被创建
        lucide.createIcons({ root: pre });
    });
}


function handlePaste(e) { Array.from(e.clipboardData.items).forEach(i => { if (i.kind === 'file') processFile(i.getAsFile()); }); }
function handleFileSelect(input) { Array.from(input.files).forEach(processFile); input.value = ''; }
function processFile(file) {
    const r = new FileReader();
    r.onload = e => { uploadedFiles.push({ name: file.name, type: file.type, data: e.target.result }); renderPreviews(); };
    file.type.startsWith('image/') ? r.readAsDataURL(file) : r.readAsText(file);
}
function renderPreviews() {
    const area = document.getElementById('preview-area'); area.innerHTML = '';
    uploadedFiles.forEach((f, i) => {
        area.innerHTML += `<div class="preview-item">${f.type.startsWith('image/') ? `<img src="${f.data}">` :
            `<i data-lucide="file-text" style="width:20px; height:20px;"></i>`}<div class="remove-file" onclick="uploadedFiles.splice(${i},1);renderPreviews()"><i data-lucide="x" style="width:14px"></i></div></div>`;
    }); lucide.createIcons();
}
function autoResize(el) { el.style.height = 'auto'; el.style.height = el.scrollHeight + 'px'; }
function toggleAccordion(header) { header.parentElement.classList.toggle('active'); }
let searchTimeout;
async function handleSearch(query) {
    clearTimeout(searchTimeout);
    if (!query.trim()) { document.getElementById('normalSidebarList').style.display = 'flex'; document.getElementById('searchResultList').style.display = 'none'; return; }
    searchTimeout = setTimeout(async () => {
        const res = await fetch(`/api/search?q=${encodeURIComponent(query)}`, { headers: { 'Authorization': `Bearer ${authToken}` } });
        const json = await res.json();
        if (json.success) {
            document.getElementById('normalSidebarList').style.display = 'none'; document.getElementById('searchResultList').style.display = 'block';
            document.getElementById('searchOutput').innerHTML = json.data.map(item =>
                `<div class="session-item" onclick="loadSession('${item.session_id}')"><div><div style="font-weight:600;">${item.session_title}</div><div style="font-size:12px; color:var(--text-secondary);">${item.content.substring(0, 30)}...</div></div></div>`
            ).join('') || '<div style="padding:10px;text-align:center;font-size:13px;">无记录</div>';
        }
    }, 300);
}
async function deletePreset(id) {
    if (confirm("删除?")) {
        await fetch('/api/admin/preset/delete', { method: 'POST', headers: { 'Content-Type': 'application/json', 'Authorization': `Bearer ${authToken}` }, body: JSON.stringify({ id }) });
        fetchAdminPresets(); fetchPresets();
    }
}
async function forceMigrate() { if (confirm("导入旧数据?")) { const res = await fetch('/api/admin/migrate', { method: 'POST', headers: { 'Authorization': `Bearer ${authToken}` } }); showToast((await res.json()).message); location.reload(); } }
function toggleSidebar() { document.getElementById('sidebar').classList.toggle('open'); document.querySelector('.overlay').classList.toggle('show'); }
function toggleTheme() { const n = document.documentElement.getAttribute('data-theme') === 'dark' ? 'light' : 'dark'; document.documentElement.setAttribute('data-theme', n); localStorage.setItem('theme', n); lucide.createIcons(); }

// --- 新增：图片迁移功能 ---
// 这个函数对应 index.html 中的 "迁移旧图片到 R2" 按钮
async function forceMigrateImages() {
    if (!confirm("确定要开始迁移图片吗？这会将数据库中现有的 Base64 图片上传到 R2 并替换链接。\n过程可能需要几分钟，请勿关闭页面。")) return;

    const btn = document.querySelector('button[onclick="forceMigrateImages()"]');
    const originalText = btn.innerText;
    btn.innerText = "迁移中，请稍候...";
    btn.disabled = true;

    try {
        const res = await fetch('/api/admin/migrate-images', {
            method: 'POST',
            headers: { 'Authorization': `Bearer ${authToken}` }
        });
        const data = await res.json();

        if (data.success) {
            showToast(data.message);
            // 迁移完成后刷新会话列表，确保最新数据被加载
            fetchSessions();
        } else {
            showToast("迁移失败: " + data.message);
        }
    } catch (e) {
        showToast("请求失败: " + e.message);
    } finally {
        btn.innerText = originalText;
        btn.disabled = false;
    }
}
