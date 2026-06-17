(function () {
    'use strict';

    if (window.__SGN_V28_DESTROY) {
        window.__SGN_V28_DESTROY();
    }
    if (window.__SGN_COMPASS_DESTROY) {
        window.__SGN_COMPASS_DESTROY();
    }

    const SCRIPT_NAME = '剧情罗盘';
    const STYLE_ID = 'sgn-compass-style';
    const PANEL_ID = 'sgn-compass-panel';
    const MENU_ID = 'sgn-compass-menu-item';
    const TOAST_ID = 'sgn-compass-toast';

    const STORAGE_KEYS = {
        url: 'sgn_v17_url_clean',
        key: 'sgn_v17_key_clean',
        model: 'sgn_v17_model_clean',
        models: 'sgn_v17_models_clean',
        data: 'sgn_v29_hook_data',
        sysPrompt: 'sgn_v29_hook_sys_prompt',
        userPrompt: 'sgn_v29_hook_user_prompt',
        apiLog: 'sgn_v29_hook_api_log',
        settings: 'sgn_v29_hook_settings',
    };

    const DEFAULT_SYS_PROMPT = `你是一名剧情灵感规划师，不是剧情执行者。
你的任务是基于已有剧情，生成未来连续7天内可能自然出现的剧情机会、场景钩子与NPC动向，供玩家参考挑选。

核心原则：
1. 这些内容只是后台参考，不代表玩家已经决定、不代表剧情必然发生。
2. 不要替 <user> 做决定，不要写成已经发生的剧情，不要替玩家完成行动。
3. 保持角色自主性、世界观一致性和当前关系阶段；不要为了完成大纲强行推进。
4. 每个钩子只提供开场契机、氛围、NPC准备和可选切入点，不写结局、不剧透后续结果。
5. 每天生成2到4个钩子。日期如无明确信息，可用“第1天/第2天”或结合用户提供的剧情日期推算。
6. 纯JSON输出：只输出JSON数组，不要输出Markdown、解释、前缀或后缀。`;

    const DEFAULT_USER_PROMPT = `【近期聊天记录】
{{context}}

【当前剧情日期或时间线】
{{plotDate}}

【设定补充/世界观/角色关系】
{{supplement}}

【长期剧情目标】
{{goal}}

【避免事项】
{{avoid}}

【本次额外方向】
{{direction}}

请输出未来连续7天的剧情钩子参考，严格使用下方JSON结构：
[
  {
    "day": "第1天 / 2024年05月20日 星期一",
    "weather": "天气或环境氛围",
    "story_mood": "当天整体氛围",
    "daily_note": "当天只作为参考的剧情观察，不写成已发生",
    "hooks": [
      {
        "time": "09:00-11:00",
        "location": "具体地点",
        "title": "钩子标题",
        "scene_seed": "当前场景的自然开场契机，不写结局，不替玩家行动",
        "user_intent_hint": "玩家可能注意到的线索、情绪或可选切入点，不写成已决定行动",
        "npc_setup": "主要NPC此时的独立动向、情绪、准备、误会或隐藏信息",
        "tension": "这幕可以保留的轻微冲突、悬念或情绪张力",
        "stop_point": "适合让模型停下等待玩家回应的位置"
      }
    ]
  }
]`;

    let state = {
        url: '',
        key: '',
        model: '',
        availableModels: [],
        hooksByChat: {},
        sysPrompt: DEFAULT_SYS_PROMPT,
        userPrompt: DEFAULT_USER_PROMPT,
        apiLog: { status: 'none', time: '', duration: '', req: '', res: '', error: '' },
        settings: {
            contextDepth: 40,
            plotDate: '',
            supplement: '',
            goal: '',
            avoid: '',
            direction: '',
        },
        isGenerating: false,
    };

    let panelEl = null;
    let activeTab = 'hooks';
    let globalListeners = [];

    const targetWindow = (() => {
        try {
            return window.parent && window.parent.document ? window.parent : window;
        } catch (error) {
            return window;
        }
    })();
    const targetDoc = targetWindow.document;

    function addListener(target, type, handler, options) {
        if (!target) return;
        target.addEventListener(type, handler, options);
        globalListeners.push({ target, type, handler, options });
    }

    function waitForElement(selector, timeout = 15000) {
        return new Promise((resolve, reject) => {
            const existing = targetDoc.querySelector(selector);
            if (existing) {
                resolve(existing);
                return;
            }

            const observer = new MutationObserver(() => {
                const element = targetDoc.querySelector(selector);
                if (element) {
                    observer.disconnect();
                    clearTimeout(timer);
                    resolve(element);
                }
            });

            const timer = setTimeout(() => {
                observer.disconnect();
                reject(new Error(`等待元素超时：${selector}`));
            }, timeout);

            observer.observe(targetDoc.documentElement, { childList: true, subtree: true });
        });
    }

    function notify(message, isError = false) {
        const toastr = targetWindow.toastr;
        if (toastr) {
            (isError ? toastr.error : toastr.success)(message);
            return;
        }

        let toast = targetDoc.getElementById(TOAST_ID);
        if (!toast) {
            toast = targetDoc.createElement('div');
            toast.id = TOAST_ID;
            targetDoc.body.appendChild(toast);
        }
        toast.textContent = message;
        toast.className = isError ? 'is-error' : '';
        requestAnimationFrame(() => toast.classList.add('is-visible'));
        setTimeout(() => toast.classList.remove('is-visible'), 1600);
    }

    function normalizeUrl(url) {
        let value = (url || '').trim().replace(/\/+$/, '');
        if (value.endsWith('/v1')) value = value.slice(0, -3);
        return value;
    }

    function safeJsonParse(value, fallback) {
        try {
            return value ? JSON.parse(value) : fallback;
        } catch (error) {
            return fallback;
        }
    }

    function loadState() {
        state.url = localStorage.getItem(STORAGE_KEYS.url) || '';
        state.key = localStorage.getItem(STORAGE_KEYS.key) || '';
        state.model = localStorage.getItem(STORAGE_KEYS.model) || '';
        state.availableModels = safeJsonParse(localStorage.getItem(STORAGE_KEYS.models), []);
        state.hooksByChat = safeJsonParse(localStorage.getItem(STORAGE_KEYS.data), {});
        state.sysPrompt = localStorage.getItem(STORAGE_KEYS.sysPrompt) || DEFAULT_SYS_PROMPT;
        state.userPrompt = localStorage.getItem(STORAGE_KEYS.userPrompt) || DEFAULT_USER_PROMPT;
        state.apiLog = safeJsonParse(localStorage.getItem(STORAGE_KEYS.apiLog), state.apiLog);
        state.settings = Object.assign(
            {},
            state.settings,
            safeJsonParse(localStorage.getItem(STORAGE_KEYS.settings), {})
        );
    }

    function saveState() {
        const chatIds = Object.keys(state.hooksByChat);
        if (chatIds.length > 20) {
            chatIds.slice(0, chatIds.length - 20).forEach(id => delete state.hooksByChat[id]);
        }

        localStorage.setItem(STORAGE_KEYS.url, state.url);
        localStorage.setItem(STORAGE_KEYS.key, state.key);
        localStorage.setItem(STORAGE_KEYS.model, state.model);
        localStorage.setItem(STORAGE_KEYS.models, JSON.stringify(state.availableModels || []));
        localStorage.setItem(STORAGE_KEYS.data, JSON.stringify(state.hooksByChat || {}));
        localStorage.setItem(STORAGE_KEYS.sysPrompt, state.sysPrompt);
        localStorage.setItem(STORAGE_KEYS.userPrompt, state.userPrompt);
        localStorage.setItem(STORAGE_KEYS.apiLog, JSON.stringify(state.apiLog || {}));
        localStorage.setItem(STORAGE_KEYS.settings, JSON.stringify(state.settings || {}));
    }

    function getContextInfo() {
        try {
            const ctx = targetWindow.SillyTavern && targetWindow.SillyTavern.getContext
                ? targetWindow.SillyTavern.getContext()
                : null;
            const chatId = ctx && (ctx.chatId || ctx.characterId) ? (ctx.chatId || ctx.characterId) : 'default_chat';
            let charName = '当前故事';
            if (ctx && ctx.characters && ctx.characterId != null && ctx.characters[ctx.characterId]) {
                charName = ctx.characters[ctx.characterId].name || charName;
            } else if (ctx && ctx.chatId) {
                charName = String(ctx.chatId).replace(/\.jsonl$/i, '');
            }

            const depth = Math.max(1, Math.min(200, parseInt(state.settings.contextDepth, 10) || 40));
            let context = '';
            if (ctx && Array.isArray(ctx.chat)) {
                context = ctx.chat.slice(-depth).map((message) => {
                    const speaker = message.is_user ? '<user>' : (message.name || '<char>');
                    const text = String(message.mes || '').replace(/<[^>]*>/g, '').trim();
                    return `${speaker}: ${text}`;
                }).filter(Boolean).join('\n');
            }
            return { chatId, charName, context };
        } catch (error) {
            return { chatId: 'default_chat', charName: '当前故事', context: '' };
        }
    }

    function escapeHtml(value) {
        return String(value == null ? '' : value).replace(/[&<>"']/g, (char) => ({
            '&': '&amp;',
            '<': '&lt;',
            '>': '&gt;',
            '"': '&quot;',
            "'": '&#39;',
        }[char]));
    }

    function replaceAllTokens(template, values) {
        let result = template || '';
        Object.entries(values).forEach(([key, value]) => {
            result = result.split(`{{${key}}}`).join(value || '(未填写)');
        });
        return result;
    }

    function extractJsonArray(content) {
        const raw = String(content || '').trim();
        const fenced = raw.replace(/^```(?:json)?\s*/i, '').replace(/\s*```$/i, '').trim();
        const match = fenced.match(/\[[\s\S]*\]/);
        return JSON.parse(match ? match[0] : fenced);
    }

    function normalizeHookDay(day) {
        const hooks = Array.isArray(day.hooks)
            ? day.hooks
            : Array.isArray(day.events)
                ? day.events.map(event => ({
                    time: event.time,
                    location: event.location,
                    title: event.title,
                    scene_seed: event.scene_seed || event.user_action || event.description,
                    user_intent_hint: event.user_intent_hint || event.user_action,
                    npc_setup: event.npc_setup || event.npc_action || event.char_action,
                    tension: event.tension || '',
                    stop_point: event.stop_point || '',
                }))
                : [];

        return {
            day: day.day || '未标记日期',
            weather: day.weather || '',
            story_mood: day.story_mood || day.mood || '',
            daily_note: day.daily_note || day.xiaoday_comment || '',
            hooks,
        };
    }

    function injectToInput(text) {
        const textarea = targetDoc.getElementById('send_textarea');
        if (!textarea) return false;
        textarea.value = text;
        textarea.dispatchEvent(new Event('input', { bubbles: true }));
        textarea.focus();
        return true;
    }

    function buildScenePrompt(day, hook, mode) {
        if (mode === 'brief') {
            return [
                '【轻量剧情方向】',
                `可以自然引出“${hook.title || '当前场景'}”这个方向，但不要强行推进。`,
                `地点：${hook.location || '未指定'}`,
                `氛围：${day.story_mood || day.weather || '顺着当前剧情'}`,
                '请保持角色自主反应，只写当前场景的一小段，在需要我回应时停下。',
            ].join('\n');
        }

        return [
            '【后台剧情参考，不是正文】',
            '请只自然引出当前这一幕，不要跳到后续日程，不要剧透计划，不要替我行动，不要总结结果。',
            '',
            `日期/阶段：${day.day || '当前阶段'}`,
            `时间：${hook.time || '未指定'}`,
            `地点：${hook.location || '未指定'}`,
            `当前场景方向：${hook.title || '未命名钩子'}`,
            `氛围：${day.story_mood || day.weather || '顺着当前剧情'}`,
            '',
            `开场契机：${hook.scene_seed || '从当前剧情自然衔接。'}`,
            `NPC准备：${hook.npc_setup || '保持NPC独立动机与当前人设。'}`,
            `玩家可选切入点：${hook.user_intent_hint || '让我保留选择空间，不要替我决定。'}`,
            hook.tension ? `保留张力：${hook.tension}` : '',
            hook.stop_point ? `停顿位置：${hook.stop_point}` : '请在需要我回应、选择或行动时停下。',
        ].filter(Boolean).join('\n');
    }

    function installStyles() {
        targetDoc.getElementById(STYLE_ID)?.remove();
        const style = targetDoc.createElement('style');
        style.id = STYLE_ID;
        style.textContent = `
            #${PANEL_ID} {
                position: fixed;
                inset: 0;
                display: none;
                align-items: center;
                justify-content: center;
                z-index: 2147483647;
                background: rgba(0, 0, 0, 0.62);
                padding: 16px;
                color: var(--SmartThemeBodyColor, #222);
                font-family: var(--mainFontFamily, -apple-system, BlinkMacSystemFont, "Segoe UI", sans-serif);
            }
            #${PANEL_ID}.is-open { display: flex; }
            #${PANEL_ID} * { box-sizing: border-box; }
            #${PANEL_ID} .sgn-shell {
                width: min(900px, 100%);
                max-height: min(780px, 90dvh);
                background: var(--SmartThemeBlurTintColor, #fff);
                border: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
                border-radius: 8px;
                box-shadow: 0 18px 48px rgba(0, 0, 0, .35);
                display: flex;
                flex-direction: column;
                overflow: hidden;
            }
            #${PANEL_ID} .sgn-head {
                display: flex;
                align-items: center;
                justify-content: space-between;
                gap: 12px;
                padding: 14px 16px;
                border-bottom: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
            }
            #${PANEL_ID} .sgn-title {
                display: flex;
                align-items: center;
                gap: 8px;
                font-size: 16px;
                font-weight: 700;
            }
            #${PANEL_ID} .sgn-tabs {
                display: flex;
                gap: 6px;
                padding: 10px 12px 0;
                border-bottom: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
                overflow-x: auto;
            }
            #${PANEL_ID} .sgn-tab {
                border: 0;
                border-bottom: 2px solid transparent;
                background: transparent;
                color: inherit;
                padding: 9px 12px;
                cursor: pointer;
                opacity: .72;
                white-space: nowrap;
            }
            #${PANEL_ID} .sgn-tab.is-active {
                border-bottom-color: var(--SmartThemeQuoteColor, #3b5998);
                opacity: 1;
                font-weight: 700;
            }
            #${PANEL_ID} .sgn-body {
                padding: 14px;
                overflow: auto;
            }
            #${PANEL_ID} .sgn-grid {
                display: grid;
                grid-template-columns: repeat(2, minmax(0, 1fr));
                gap: 12px;
            }
            #${PANEL_ID} label {
                display: block;
                font-size: 12px;
                font-weight: 700;
                margin: 0 0 6px;
            }
            #${PANEL_ID} input,
            #${PANEL_ID} select,
            #${PANEL_ID} textarea {
                width: 100%;
                border: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
                border-radius: 6px;
                background: var(--SmartThemeInputColor, rgba(255,255,255,.82));
                color: var(--SmartThemeInputTextColor, inherit);
                padding: 8px 10px;
                font: inherit;
            }
            #${PANEL_ID} textarea {
                resize: vertical;
                min-height: 90px;
                line-height: 1.45;
            }
            #${PANEL_ID} .sgn-row {
                display: flex;
                gap: 10px;
                align-items: center;
                flex-wrap: wrap;
                margin-bottom: 12px;
            }
            #${PANEL_ID} .sgn-button {
                display: inline-flex;
                align-items: center;
                justify-content: center;
                gap: 6px;
                border: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
                border-radius: 6px;
                background: var(--SmartThemeQuoteColor, #3b5998);
                color: var(--SmartThemeBodyColor, #fff);
                padding: 8px 12px;
                cursor: pointer;
                font-weight: 700;
            }
            #${PANEL_ID} .sgn-button.secondary {
                background: transparent;
                color: inherit;
            }
            #${PANEL_ID} .sgn-button:disabled {
                opacity: .55;
                cursor: not-allowed;
            }
            #${PANEL_ID} .sgn-empty,
            #${PANEL_ID} .sgn-help {
                color: var(--SmartThemeEmColor, currentColor);
                opacity: .78;
                line-height: 1.55;
            }
            #${PANEL_ID} .sgn-day {
                border: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
                border-radius: 8px;
                margin: 12px 0;
                overflow: hidden;
            }
            #${PANEL_ID} .sgn-day-head {
                padding: 10px 12px;
                background: rgba(127,127,127,.12);
                font-weight: 700;
            }
            #${PANEL_ID} .sgn-day-note {
                padding: 10px 12px;
                border-bottom: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
                font-size: 12px;
                line-height: 1.5;
                opacity: .86;
            }
            #${PANEL_ID} .sgn-hook {
                padding: 12px;
                border-bottom: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.12));
            }
            #${PANEL_ID} .sgn-hook:last-child { border-bottom: 0; }
            #${PANEL_ID} .sgn-hook-title {
                display: flex;
                justify-content: space-between;
                gap: 10px;
                font-weight: 700;
                margin-bottom: 6px;
            }
            #${PANEL_ID} .sgn-meta {
                font-size: 12px;
                opacity: .7;
                margin-bottom: 8px;
            }
            #${PANEL_ID} .sgn-text {
                margin: 6px 0;
                line-height: 1.55;
                font-size: 13px;
            }
            #${PANEL_ID} .sgn-actions {
                display: flex;
                justify-content: flex-end;
                gap: 8px;
                flex-wrap: wrap;
                margin-top: 10px;
            }
            #${PANEL_ID} pre {
                white-space: pre-wrap;
                word-break: break-word;
                max-height: 260px;
                overflow: auto;
                padding: 10px;
                border: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
                border-radius: 6px;
                background: rgba(0,0,0,.08);
                font-size: 12px;
            }
            #${TOAST_ID} {
                position: fixed;
                left: 50%;
                top: 42px;
                transform: translate(-50%, -12px);
                z-index: 2147483647;
                background: var(--SmartThemeBlurTintColor, #fff);
                color: var(--SmartThemeBodyColor, #222);
                border: 1px solid var(--SmartThemeBorderColor, rgba(0,0,0,.18));
                border-left: 5px solid var(--SmartThemeQuoteColor, #3b5998);
                border-radius: 6px;
                padding: 10px 16px;
                opacity: 0;
                pointer-events: none;
                transition: opacity .18s ease, transform .18s ease;
            }
            #${TOAST_ID}.is-error { border-left-color: #c53030; }
            #${TOAST_ID}.is-visible {
                opacity: 1;
                transform: translate(-50%, 0);
            }
            @media (max-width: 700px) {
                #${PANEL_ID} .sgn-grid { grid-template-columns: 1fr; }
                #${PANEL_ID} .sgn-shell { max-height: 94dvh; }
            }
        `;
        targetDoc.head.appendChild(style);
    }

    function createPanel() {
        targetDoc.getElementById(PANEL_ID)?.remove();
        panelEl = targetDoc.createElement('div');
        panelEl.id = PANEL_ID;
        panelEl.innerHTML = `
            <div class="sgn-shell" role="dialog" aria-modal="true">
                <div class="sgn-head">
                    <div class="sgn-title">
                        <i class="fa-solid fa-compass"></i>
                        <span>${SCRIPT_NAME}</span>
                    </div>
                    <button type="button" class="sgn-button secondary" data-action="close" title="关闭">
                        <i class="fa-solid fa-xmark"></i>
                    </button>
                </div>
                <div class="sgn-tabs">
                    <button type="button" class="sgn-tab" data-tab="hooks">剧情钩子</button>
                    <button type="button" class="sgn-tab" data-tab="api">通讯配置</button>
                    <button type="button" class="sgn-tab" data-tab="prompt">提示词</button>
                    <button type="button" class="sgn-tab" data-tab="log">日志</button>
                </div>
                <div class="sgn-body" id="sgn-compass-body"></div>
            </div>
        `;
        targetDoc.body.appendChild(panelEl);

        addListener(panelEl, 'mousedown', (event) => {
            if (event.target === panelEl) closePanel();
        });
        addListener(panelEl.querySelector('[data-action="close"]'), 'click', closePanel);
        panelEl.querySelectorAll('.sgn-tab').forEach((button) => {
            addListener(button, 'click', () => renderTab(button.dataset.tab));
        });
    }

    function openPanel() {
        installStyles();
        if (!panelEl || !targetDoc.body.contains(panelEl)) {
            createPanel();
        }
        renderTab(activeTab);
        panelEl.classList.add('is-open');
    }

    function closePanel() {
        panelEl?.classList.remove('is-open');
    }

    function renderTab(tab) {
        activeTab = tab || 'hooks';
        panelEl.querySelectorAll('.sgn-tab').forEach((button) => {
            button.classList.toggle('is-active', button.dataset.tab === activeTab);
        });
        const body = panelEl.querySelector('#sgn-compass-body');
        if (!body) return;

        if (activeTab === 'hooks') renderHooksTab(body);
        if (activeTab === 'api') renderApiTab(body);
        if (activeTab === 'prompt') renderPromptTab(body);
        if (activeTab === 'log') renderLogTab(body);
    }

    function renderHooksTab(body) {
        const { chatId, charName } = getContextInfo();
        const list = (state.hooksByChat[chatId] || []).map(normalizeHookDay);
        body.innerHTML = `
            <div class="sgn-grid">
                <div>
                    <label>读取最近聊天条数</label>
                    <input id="sgn-context-depth" type="number" min="1" max="200" value="${escapeHtml(state.settings.contextDepth)}">
                </div>
                <div>
                    <label>当前剧情日期或时间线</label>
                    <input id="sgn-plot-date" type="text" value="${escapeHtml(state.settings.plotDate)}" placeholder="例如：开学第二周周五 / 2026年6月11日傍晚">
                </div>
            </div>
            <label>设定补充 / 世界观 / 角色关系</label>
            <textarea id="sgn-supplement" placeholder="可粘贴世界书摘要、当前关系、重要NPC、禁忌设定。">${escapeHtml(state.settings.supplement)}</textarea>
            <div class="sgn-grid">
                <div>
                    <label>长期剧情目标</label>
                    <textarea id="sgn-goal" placeholder="例如：慢慢修复关系、铺垫某个误会、保留悬疑感。">${escapeHtml(state.settings.goal)}</textarea>
                </div>
                <div>
                    <label>避免事项</label>
                    <textarea id="sgn-avoid" placeholder="例如：不要跳过玩家选择、不要快速告白、不要剧透真相。">${escapeHtml(state.settings.avoid)}</textarea>
                </div>
            </div>
            <label>本次额外方向</label>
            <input id="sgn-direction" type="text" value="${escapeHtml(state.settings.direction)}" placeholder="例如：这周想多一点雨天、误会、日常暧昧，但不要强行推进。">
            <div class="sgn-row">
                <button id="sgn-generate-hooks" type="button" class="sgn-button" ${state.isGenerating ? 'disabled' : ''}>
                    <i class="fa-solid fa-wand-magic-sparkles"></i>
                    <span>${state.isGenerating ? '生成中...' : '生成剧情钩子'}</span>
                </button>
                <button id="sgn-save-settings" type="button" class="sgn-button secondary">
                    <i class="fa-solid fa-floppy-disk"></i>
                    <span>保存参考信息</span>
                </button>
                <span class="sgn-help">当前故事：${escapeHtml(charName)}</span>
            </div>
            <div id="sgn-hooks-list"></div>
        `;

        addListener(body.querySelector('#sgn-save-settings'), 'click', () => {
            syncSettingsFromUI();
            saveState();
            notify('参考信息已保存');
        });
        addListener(body.querySelector('#sgn-generate-hooks'), 'click', generateHooks);
        renderHooksList(body.querySelector('#sgn-hooks-list'), list);
    }

    function syncSettingsFromUI() {
        const read = (id) => panelEl.querySelector(id)?.value || '';
        state.settings.contextDepth = Math.max(1, Math.min(200, parseInt(read('#sgn-context-depth'), 10) || 40));
        state.settings.plotDate = read('#sgn-plot-date').trim();
        state.settings.supplement = read('#sgn-supplement').trim();
        state.settings.goal = read('#sgn-goal').trim();
        state.settings.avoid = read('#sgn-avoid').trim();
        state.settings.direction = read('#sgn-direction').trim();
    }

    function renderHooksList(container, list) {
        if (!container) return;
        if (!list.length) {
            container.innerHTML = '<div class="sgn-empty">还没有剧情钩子。生成后只挑单幕载入，别把整份计划一次性喂给模型。</div>';
            return;
        }

        container.innerHTML = list.map((day, dayIndex) => `
            <div class="sgn-day">
                <div class="sgn-day-head">${escapeHtml(day.day)} ${day.weather ? `<span class="sgn-meta">${escapeHtml(day.weather)}</span>` : ''}</div>
                ${day.story_mood || day.daily_note ? `<div class="sgn-day-note">${escapeHtml([day.story_mood, day.daily_note].filter(Boolean).join(' / '))}</div>` : ''}
                ${day.hooks.map((hook, hookIndex) => `
                    <div class="sgn-hook">
                        <div class="sgn-hook-title">
                            <span>${escapeHtml(hook.title || '未命名钩子')}</span>
                            <span class="sgn-meta">${escapeHtml(hook.time || '')}</span>
                        </div>
                        <div class="sgn-meta">${escapeHtml(hook.location || '地点未指定')}</div>
                        <div class="sgn-text"><b>开场契机：</b>${escapeHtml(hook.scene_seed || '')}</div>
                        <div class="sgn-text"><b>玩家切入点：</b>${escapeHtml(hook.user_intent_hint || '')}</div>
                        <div class="sgn-text"><b>NPC准备：</b>${escapeHtml(hook.npc_setup || '')}</div>
                        ${hook.tension ? `<div class="sgn-text"><b>保留张力：</b>${escapeHtml(hook.tension)}</div>` : ''}
                        ${hook.stop_point ? `<div class="sgn-text"><b>停顿位置：</b>${escapeHtml(hook.stop_point)}</div>` : ''}
                        <div class="sgn-actions">
                            <button type="button" class="sgn-button secondary" data-action="brief" data-day="${dayIndex}" data-hook="${hookIndex}">只载入方向</button>
                            <button type="button" class="sgn-button" data-action="scene" data-day="${dayIndex}" data-hook="${hookIndex}">载入此幕</button>
                        </div>
                    </div>
                `).join('')}
            </div>
        `).join('');

        container.querySelectorAll('[data-action="scene"], [data-action="brief"]').forEach((button) => {
            addListener(button, 'click', () => {
                const day = list[parseInt(button.dataset.day, 10)];
                const hook = day && day.hooks[parseInt(button.dataset.hook, 10)];
                if (!day || !hook) return;
                const text = buildScenePrompt(day, hook, button.dataset.action);
                if (injectToInput(text)) {
                    notify(button.dataset.action === 'brief' ? '已载入轻量方向' : '已载入单幕参考');
                    closePanel();
                } else {
                    notify('没有找到输入框', true);
                }
            });
        });
    }

    function renderApiTab(body) {
        body.innerHTML = `
            <label>API URL</label>
            <input id="sgn-api-url" type="text" value="${escapeHtml(state.url)}" placeholder="https://example.com">
            <label>API Key</label>
            <input id="sgn-api-key" type="password" value="${escapeHtml(state.key)}">
            <div class="sgn-grid">
                <div>
                    <label>模型</label>
                    <input id="sgn-api-model" type="text" value="${escapeHtml(state.model)}" placeholder="模型名称">
                </div>
                <div>
                    <label>已拉取模型</label>
                    <select id="sgn-model-select">
                        <option value="">手动输入或先拉取模型</option>
                        ${(state.availableModels || []).map(model => `<option value="${escapeHtml(model)}" ${model === state.model ? 'selected' : ''}>${escapeHtml(model)}</option>`).join('')}
                    </select>
                </div>
            </div>
            <div class="sgn-row">
                <button id="sgn-save-api" type="button" class="sgn-button">
                    <i class="fa-solid fa-floppy-disk"></i>
                    <span>保存配置</span>
                </button>
                <button id="sgn-fetch-models" type="button" class="sgn-button secondary">
                    <i class="fa-solid fa-list"></i>
                    <span>拉取模型</span>
                </button>
            </div>
            <p class="sgn-help">调用方式为 OpenAI 兼容的 /v1/chat/completions，只用于生成剧情钩子。</p>
        `;

        addListener(body.querySelector('#sgn-model-select'), 'change', (event) => {
            if (event.target.value) {
                body.querySelector('#sgn-api-model').value = event.target.value;
            }
        });
        addListener(body.querySelector('#sgn-save-api'), 'click', () => {
            state.url = body.querySelector('#sgn-api-url').value.trim();
            state.key = body.querySelector('#sgn-api-key').value.trim();
            state.model = body.querySelector('#sgn-api-model').value.trim();
            saveState();
            notify('通讯配置已保存');
        });
        addListener(body.querySelector('#sgn-fetch-models'), 'click', fetchModels);
    }

    function renderPromptTab(body) {
        body.innerHTML = `
            <label>System Prompt</label>
            <textarea id="sgn-sys-prompt" style="min-height:180px;">${escapeHtml(state.sysPrompt)}</textarea>
            <label>User Prompt</label>
            <textarea id="sgn-user-prompt" style="min-height:240px;">${escapeHtml(state.userPrompt)}</textarea>
            <p class="sgn-help">可用变量：{{context}}、{{plotDate}}、{{supplement}}、{{goal}}、{{avoid}}、{{direction}}。</p>
            <div class="sgn-row">
                <button id="sgn-save-prompt" type="button" class="sgn-button">
                    <i class="fa-solid fa-floppy-disk"></i>
                    <span>保存提示词</span>
                </button>
                <button id="sgn-reset-prompt" type="button" class="sgn-button secondary">
                    <i class="fa-solid fa-rotate-left"></i>
                    <span>恢复默认</span>
                </button>
            </div>
        `;

        addListener(body.querySelector('#sgn-save-prompt'), 'click', () => {
            state.sysPrompt = body.querySelector('#sgn-sys-prompt').value;
            state.userPrompt = body.querySelector('#sgn-user-prompt').value;
            saveState();
            notify('提示词已保存');
        });
        addListener(body.querySelector('#sgn-reset-prompt'), 'click', () => {
            state.sysPrompt = DEFAULT_SYS_PROMPT;
            state.userPrompt = DEFAULT_USER_PROMPT;
            saveState();
            renderPromptTab(body);
            notify('已恢复默认提示词');
        });
    }

    function renderLogTab(body) {
        const log = state.apiLog || {};
        body.innerHTML = `
            <div class="sgn-row">
                <span class="sgn-help">状态：${escapeHtml(log.status || 'none')}　时间：${escapeHtml(log.time || '')}　耗时：${escapeHtml(log.duration || '')}</span>
            </div>
            ${log.error ? `<p class="sgn-help">错误：${escapeHtml(log.error)}</p>` : ''}
            <label>请求</label>
            <pre>${escapeHtml(log.req || '')}</pre>
            <label>响应</label>
            <pre>${escapeHtml(log.res || '')}</pre>
        `;
    }

    async function fetchModels() {
        const body = panelEl.querySelector('#sgn-compass-body');
        state.url = body.querySelector('#sgn-api-url').value.trim();
        state.key = body.querySelector('#sgn-api-key').value.trim();
        if (!state.url || !state.key) {
            notify('请先填写 API URL 和 Key', true);
            return;
        }

        try {
            const base = normalizeUrl(state.url);
            const res = await fetch(`${base}/v1/models`, {
                headers: { Authorization: `Bearer ${state.key}` },
            });
            if (!res.ok) throw new Error(`HTTP ${res.status}`);
            const data = await res.json();
            state.availableModels = (data.data || []).map(item => item.id).filter(Boolean);
            saveState();
            notify(`已拉取 ${state.availableModels.length} 个模型`);
            renderApiTab(body);
        } catch (error) {
            notify(`拉取模型失败：${error.message || error}`, true);
        }
    }

    async function generateHooks() {
        syncSettingsFromUI();
        const { chatId, context } = getContextInfo();
        if (!state.url || !state.key || !state.model) {
            notify('请先在通讯配置里填写 API 信息', true);
            activeTab = 'api';
            renderTab('api');
            return;
        }
        if (!context) {
            notify('还没有可读取的聊天记录', true);
            return;
        }

        const userPrompt = replaceAllTokens(state.userPrompt, {
            context,
            plotDate: state.settings.plotDate,
            supplement: state.settings.supplement,
            goal: state.settings.goal,
            avoid: state.settings.avoid,
            direction: state.settings.direction,
        });

        const reqBody = {
            model: state.model,
            messages: [
                { role: 'system', content: state.sysPrompt },
                { role: 'user', content: userPrompt },
            ],
            temperature: 0.8,
        };

        const startTime = Date.now();
        state.isGenerating = true;
        state.apiLog = {
            status: 'loading',
            time: new Date().toLocaleString(),
            duration: '',
            req: JSON.stringify(reqBody, null, 2),
            res: '',
            error: '',
        };
        saveState();
        renderTab('hooks');

        try {
            const base = normalizeUrl(state.url);
            const res = await fetch(`${base}/v1/chat/completions`, {
                method: 'POST',
                headers: {
                    Authorization: `Bearer ${state.key}`,
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(reqBody),
            });
            const duration = ((Date.now() - startTime) / 1000).toFixed(1) + 's';
            if (!res.ok) throw new Error(`HTTP ${res.status}`);
            const data = await res.json();
            const content = data.choices && data.choices[0] && data.choices[0].message
                ? data.choices[0].message.content
                : '';
            const hooks = extractJsonArray(content).map(normalizeHookDay);
            if (!Array.isArray(hooks) || !hooks.length) {
                throw new Error('AI返回的JSON为空');
            }

            state.hooksByChat[chatId] = hooks;
            state.apiLog.status = 'success';
            state.apiLog.duration = duration;
            state.apiLog.res = JSON.stringify(data, null, 2);
            saveState();
            notify('剧情钩子已生成');
        } catch (error) {
            state.apiLog.status = 'error';
            state.apiLog.duration = ((Date.now() - startTime) / 1000).toFixed(1) + 's';
            state.apiLog.error = error.message || String(error);
            saveState();
            notify(`生成失败：${state.apiLog.error}`, true);
        } finally {
            state.isGenerating = false;
            saveState();
            renderTab('hooks');
        }
    }

    async function installMenuItem() {
        const menu = await waitForElement('#extensionsMenu');
        targetDoc.getElementById(MENU_ID)?.remove();

        const container = targetDoc.createElement('div');
        container.id = MENU_ID;
        container.className = 'extension_container';
        container.innerHTML = `
            <div class="list-group-item flex-container flexGap5 interactable" tabindex="0" role="listitem" title="打开剧情钩子参考面板">
                <div class="fa-fw fa-solid fa-compass extensionsMenuExtensionButton"></div>
                <span>${SCRIPT_NAME}</span>
            </div>
        `;
        addListener(container.querySelector('.list-group-item'), 'click', () => {
            const dropdown = targetDoc.querySelector('#extensionsMenu');
            if (dropdown) dropdown.style.display = 'none';
            openPanel();
        });
        menu.appendChild(container);

        const button = targetDoc.querySelector('#extensionsMenuButton');
        if (button) button.style.display = 'flex';
    }

    function destroyApp() {
        globalListeners.forEach(({ target, type, handler, options }) => {
            target.removeEventListener(type, handler, options);
        });
        globalListeners = [];
        targetDoc.getElementById(MENU_ID)?.remove();
        targetDoc.getElementById(PANEL_ID)?.remove();
        targetDoc.getElementById(STYLE_ID)?.remove();
        targetDoc.getElementById(TOAST_ID)?.remove();
        delete window.__SGN_COMPASS_DESTROY;
        console.log(`[${SCRIPT_NAME}] 已卸载`);
    }

    window.__SGN_COMPASS_DESTROY = destroyApp;

    loadState();
    installStyles();
    createPanel();
    installMenuItem().catch((error) => {
        console.error(`[${SCRIPT_NAME}] 菜单入口安装失败`, error);
        notify(`菜单入口安装失败：${error.message || error}`, true);
    });
    addListener(window, 'pagehide', destroyApp);
})();
