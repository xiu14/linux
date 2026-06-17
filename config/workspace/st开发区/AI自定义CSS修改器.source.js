(function () {
    const SCRIPT_ID = 'th-ai-custom-css-editor';
    const MENU_ID = `${SCRIPT_ID}-menu-item`;
    const STYLE_ID = `${SCRIPT_ID}-style`;
    const DIALOG_ID = `${SCRIPT_ID}-dialog`;
    const BACKUP_KEY = `${SCRIPT_ID}:last-css-backup`;
    const MODEL_SELECTOR_KEY = `${SCRIPT_ID}:last-model-selector`;
    const MODEL_VALUE_KEY = `${SCRIPT_ID}:last-model-value`;
    const INCLUDE_SELECTOR_CONTEXT_KEY = `${SCRIPT_ID}:include-selector-context`;
    const MANAGED_PATCH_START = '/* === AI CSS MANAGED PATCH START === */';
    const MANAGED_PATCH_END = '/* === AI CSS MANAGED PATCH END === */';
    const MAX_VERIFY_ATTEMPTS = 3;
    const VERIFY_ELEMENT_CAP = 25;
    const LAST_INSTRUCTION_KEY = `${SCRIPT_ID}:last-instruction`;
    const HISTORY_KEY = `${SCRIPT_ID}:history`;
    const HISTORY_MAX = 8;
    const MAX_PROMPT_TURNS = 4;
    const TURN_RESPONSE_CAP = 1500;

    const SELECTOR_CHEATSHEET = `
SillyTavern 常用选择器速查：
- 页面主体：body, #sheld, #top-bar
- 聊天区：#chat, #chat .mes, .mes, .mes_block, .mes_text, .mes_text p
- 消息元信息：.name_text, .timestamp, .mes_buttons, .mes_button, .mes_edit, .mes_copy, .mes_delete
- 头像：.avatar, .mesAvatarWrapper, .ch_name, .avatar img
- 输入栏：#form_sheld, #send_form, #leftSendForm, #rightSendForm, #send_textarea, #send_but
- 魔法棒菜单：#extensionsMenuButton, #extensionsMenu, .extensionsMenuExtensionButton
- 通用按钮/输入：.menu_button, .menu_button_icon, .interactable, .text_pole, textarea, select, input
- 抽屉/设置：.drawer, .drawer-toggle, .drawer-content, .inline-drawer, .inline-drawer-toggle, .inline-drawer-content
- 弹窗：.popup, .popup-content, .popup-controls, .popup-button
- 角色/群组列表：#rm_button_panel, #rm_print_characters_block, .character_select, .group_select
- 右侧设置面板：#right-nav-panel, #user-settings-block, #CustomCSS-block, #customCSS
- 常用主题变量：var(--SmartThemeBodyColor), var(--SmartThemeEmColor), var(--SmartThemeQuoteColor), var(--SmartThemeBorderColor), var(--SmartThemeBlurTintColor), var(--mainFontFamily), var(--monoFontFamily)
使用原则：
- 新增美化时优先使用这些真实选择器，不要凭空发明类名。
- 需要覆盖已有样式时可提高选择器精度，必要时才使用 !important。
- 尽量使用 SillyTavern 主题变量适配不同主题。
`.trim();

    const MODEL_SELECTORS = {
        openai: '#model_openai_select',
        claude: '#model_claude_select',
        openrouter: '#model_openrouter_select',
        ai21: '#model_ai21_select',
        makersuite: '#model_google_select',
        vertexai: '#model_vertexai_select',
        mistralai: '#model_mistralai_select',
        cohere: '#model_cohere_select',
        perplexity: '#model_perplexity_select',
        groq: '#model_groq_select',
        siliconflow: '#model_siliconflow_select',
        electronhub: '#model_electronhub_select',
        nanogpt: '#model_nanogpt_select',
        deepseek: '#model_deepseek_select',
        aimlapi: '#model_aimlapi_select',
        xai: '#model_xai_select',
        pollinations: '#model_pollinations_select',
        moonshot: '#model_moonshot_select',
        fireworks: '#model_fireworks_select',
        cometapi: '#model_cometapi_select',
        custom: '#model_custom_select',
        azure_openai: '#azure_openai_model',
        zai: '#model_zai_select',
    };

    const parentWindow = window.parent || window;
    const parentDocument = parentWindow.document;
    let modelSwitchSequence = 0;

    function createId() {
        if (window.crypto?.randomUUID) {
            return window.crypto.randomUUID();
        }
        if (parentWindow.crypto?.randomUUID) {
            return parentWindow.crypto.randomUUID();
        }
        return `${SCRIPT_ID}-${Date.now()}-${Math.random().toString(16).slice(2)}`;
    }

    function getContext() {
        const st = window.SillyTavern || parentWindow.SillyTavern;
        if (!st?.getContext) {
            throw new Error('无法获取 SillyTavern.getContext()');
        }
        return st.getContext();
    }

    function notify(type, message) {
        const toastr = parentWindow.toastr || window.toastr;
        if (toastr?.[type]) {
            toastr[type](message);
            return;
        }
        console[type === 'error' ? 'error' : 'log'](`[AI CSS] ${message}`);
    }

    function waitForElement(selector, timeout = 30000) {
        return new Promise((resolve, reject) => {
            const started = Date.now();
            const tick = () => {
                const element = parentDocument.querySelector(selector);
                if (element) {
                    resolve(element);
                    return;
                }
                if (Date.now() - started > timeout) {
                    reject(new Error(`等待元素超时: ${selector}`));
                    return;
                }
                parentWindow.requestAnimationFrame(tick);
            };
            tick();
        });
    }

    function installStyle() {
        if (parentDocument.getElementById(STYLE_ID)) {
            return;
        }

        const style = parentDocument.createElement('style');
        style.id = STYLE_ID;
        style.textContent = `
            #${DIALOG_ID} {
                position: fixed;
                inset: 0;
                z-index: 10050;
                display: flex;
                align-items: center;
                justify-content: center;
                padding: 18px;
                background: rgba(0, 0, 0, 0.48);
            }
            #${DIALOG_ID} .th-ai-css-modal {
                width: min(760px, 96vw);
                max-height: min(760px, 92vh);
                display: flex;
                flex-direction: column;
                gap: 12px;
                padding: 14px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 8px;
                background: var(--SmartThemeBlurTintColor);
                color: var(--SmartThemeBodyColor);
                box-shadow: 0 18px 60px rgba(0, 0, 0, 0.45);
                backdrop-filter: blur(calc(var(--blurStrength, 10) * 1px));
            }
            #${DIALOG_ID} .th-ai-css-header,
            #${DIALOG_ID} .th-ai-css-actions {
                display: flex;
                align-items: center;
                gap: 8px;
            }
            #${DIALOG_ID} .th-ai-css-header {
                justify-content: space-between;
            }
            #${DIALOG_ID} .th-ai-css-title {
                display: flex;
                align-items: center;
                gap: 8px;
                min-width: 0;
                font-weight: 700;
            }
            #${DIALOG_ID} .th-ai-css-title span {
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
            }
            #${DIALOG_ID} textarea {
                width: 100%;
                min-height: 180px;
                resize: vertical;
                box-sizing: border-box;
            }
            #${DIALOG_ID} .th-ai-css-stream-preview {
                display: block;
                width: 100%;
                max-height: 180px;
                min-height: 64px;
                overflow: auto;
                box-sizing: border-box;
                margin: 0;
                padding: 10px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 6px;
                background: rgba(0, 0, 0, 0.22);
                color: var(--SmartThemeBodyColor);
                font-family: var(--monoFontFamily, monospace);
                font-size: 12px;
                line-height: 1.45;
                white-space: pre-wrap;
                overflow-wrap: anywhere;
            }
            #${DIALOG_ID} .th-ai-css-stream-preview.is-hidden {
                display: none;
            }
            #${DIALOG_ID} .th-ai-css-stop.is-hidden {
                display: none;
            }
            #${DIALOG_ID} .th-ai-css-meta {
                font-size: 12px;
                opacity: 0.8;
                line-height: 1.4;
            }
            #${DIALOG_ID} .th-ai-css-model-row {
                display: grid;
                grid-template-columns: auto minmax(0, 1fr);
                gap: 8px;
                align-items: center;
            }
            #${DIALOG_ID} .th-ai-css-model-row select {
                width: 100%;
                min-width: 0;
                box-sizing: border-box;
            }
            #${DIALOG_ID} .th-ai-css-option-row {
                display: flex;
                align-items: center;
                gap: 8px;
                min-width: 0;
                font-size: 13px;
                line-height: 1.35;
            }
            #${DIALOG_ID} .th-ai-css-option-row input {
                flex: 0 0 auto;
            }
            #${DIALOG_ID} .th-ai-css-option-row span {
                min-width: 0;
                overflow-wrap: anywhere;
            }
            #${DIALOG_ID} .th-ai-css-status {
                min-height: 20px;
                padding: 9px 10px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 6px;
                font-size: 13px;
                line-height: 1.4;
                opacity: 0.95;
                background: rgba(255, 255, 255, 0.06);
                transition: background 160ms ease, border-color 160ms ease, color 160ms ease;
            }
            #${DIALOG_ID} .th-ai-css-status.is-idle {
                display: none;
            }
            #${DIALOG_ID} .th-ai-css-status.is-busy {
                display: block;
                border-color: color-mix(in srgb, var(--SmartThemeQuoteColor) 70%, transparent);
                background: color-mix(in srgb, var(--SmartThemeQuoteColor) 18%, transparent);
            }
            #${DIALOG_ID} .th-ai-css-status.is-success {
                display: block;
                border-color: rgba(60, 190, 110, 0.95);
                background: rgba(42, 145, 84, 0.26);
                color: #d9ffe7;
                font-weight: 700;
            }
            #${DIALOG_ID} .th-ai-css-status.is-error {
                display: block;
                border-color: rgba(255, 100, 110, 0.95);
                background: rgba(180, 42, 52, 0.28);
                color: #ffe0e2;
                font-weight: 700;
            }
            #${DIALOG_ID} .th-ai-css-status.is-warning {
                display: block;
                border-color: rgba(235, 185, 72, 0.95);
                background: rgba(190, 135, 34, 0.24);
                color: #fff2cf;
            }
            #${DIALOG_ID} .th-ai-css-history-wrap {
                display: flex;
                flex-direction: column;
                gap: 4px;
            }
            #${DIALOG_ID} .th-ai-css-history-head {
                display: flex;
                align-items: center;
                justify-content: space-between;
                gap: 8px;
                font-size: 12px;
                opacity: 0.8;
            }
            #${DIALOG_ID} .th-ai-css-clear-history {
                background: transparent;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 6px;
                color: inherit;
                font-size: 12px;
                padding: 2px 8px;
                cursor: pointer;
                white-space: nowrap;
            }
            #${DIALOG_ID} .th-ai-css-history {
                max-height: 110px;
                overflow: auto;
                display: flex;
                flex-direction: column;
                gap: 4px;
            }
            #${DIALOG_ID} .th-ai-css-history-item {
                padding: 6px 8px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 6px;
                background: rgba(255, 255, 255, 0.04);
                font-size: 12px;
                line-height: 1.35;
                cursor: pointer;
                overflow-wrap: anywhere;
            }
            #${DIALOG_ID} .th-ai-css-history-empty {
                font-size: 12px;
                opacity: 0.6;
            }
            #${DIALOG_ID} .th-ai-css-actions {
                justify-content: flex-end;
                flex-wrap: wrap;
            }
            #${DIALOG_ID} .th-ai-css-actions .menu_button,
            #${DIALOG_ID} .th-ai-css-model-row .menu_button {
                min-width: max-content;
                white-space: nowrap;
                writing-mode: horizontal-tb;
                text-orientation: mixed;
                display: inline-flex;
                align-items: center;
                justify-content: center;
                gap: 6px;
            }
            #${DIALOG_ID} .th-ai-css-close {
                min-width: 32px;
                width: 32px;
                height: 32px;
                display: inline-flex;
                align-items: center;
                justify-content: center;
            }
            @media (max-width: 600px) {
                #${DIALOG_ID} {
                    align-items: stretch;
                    justify-content: stretch;
                    padding: 0;
                }
                #${DIALOG_ID} .th-ai-css-modal {
                    width: 100vw;
                    max-height: none;
                    height: 100vh;
                    height: 100dvh;
                    border-radius: 0;
                    border-left: 0;
                    border-right: 0;
                    padding: 12px;
                    box-sizing: border-box;
                }
                #${DIALOG_ID} textarea {
                    flex: 1 1 auto;
                    min-height: 150px;
                    resize: none;
                }
                #${DIALOG_ID} .th-ai-css-model-row {
                    grid-template-columns: 1fr;
                }
                #${DIALOG_ID} .th-ai-css-option-row {
                    align-items: flex-start;
                }
                #${DIALOG_ID} .th-ai-css-actions {
                    display: grid;
                    grid-template-columns: repeat(2, minmax(0, 1fr));
                    gap: 8px;
                }
                #${DIALOG_ID} .th-ai-css-actions .menu_button {
                    min-width: 0;
                    width: 100%;
                    justify-content: center;
                    padding-left: 8px;
                    padding-right: 8px;
                    overflow-wrap: anywhere;
                }
                #${DIALOG_ID} .th-ai-css-status {
                    max-height: 84px;
                    overflow-y: auto;
                }
                #${DIALOG_ID} .th-ai-css-stream-preview {
                    max-height: 22vh;
                    min-height: 72px;
                }
            }
            @media (max-width: 380px) {
                #${DIALOG_ID} .th-ai-css-modal {
                    gap: 10px;
                    padding: 10px;
                }
                #${DIALOG_ID} .th-ai-css-title span,
                #${DIALOG_ID} .th-ai-css-actions .menu_button,
                #${DIALOG_ID} .th-ai-css-model-row .menu_button {
                    font-size: 13px;
                }
            }
        `;
        parentDocument.head.appendChild(style);
    }

    function getCurrentCss() {
        const textarea = parentDocument.querySelector('#customCSS');
        if (textarea) {
            return String(textarea.value || '');
        }
        return String(getContext().powerUserSettings?.custom_css || '');
    }

    function applyAndSaveCss(css) {
        const context = getContext();
        if (context.powerUserSettings) {
            context.powerUserSettings.custom_css = css;
        }

        const textarea = parentDocument.querySelector('#customCSS');
        if (textarea) {
            textarea.value = css;
            textarea.dispatchEvent(new parentWindow.Event('input', { bubbles: true }));
        } else {
            let style = parentDocument.getElementById('custom-style');
            if (!style) {
                style = parentDocument.createElement('style');
                style.id = 'custom-style';
                style.type = 'text/css';
                parentDocument.head.appendChild(style);
            }
            style.textContent = css;
            context.saveSettingsDebounced?.();
        }
    }

    function escapeHtml(value) {
        return String(value)
            .replace(/&/g, '&amp;')
            .replace(/</g, '&lt;')
            .replace(/>/g, '&gt;')
            .replace(/"/g, '&quot;')
            .replace(/'/g, '&#39;');
    }

    function setStatus(statusElement, type, message) {
        statusElement.className = `th-ai-css-status is-${type || 'idle'}`;
        statusElement.textContent = message || '';
    }

    function formatElapsed(ms) {
        const totalSeconds = Math.max(0, Math.floor(ms / 1000));
        const minutes = Math.floor(totalSeconds / 60);
        const seconds = totalSeconds % 60;
        return minutes > 0 ? `${minutes}分${String(seconds).padStart(2, '0')}秒` : `${seconds}秒`;
    }

    function startBusyFeedback(statusElement, baseMessage) {
        const startedAt = Date.now();
        const frames = ['.', '..', '...'];
        let frameIndex = 0;

        const update = () => {
            const elapsed = formatElapsed(Date.now() - startedAt);
            const dots = frames[frameIndex % frames.length];
            frameIndex += 1;
            setStatus(statusElement, 'busy', `${baseMessage}${dots} 已等待 ${elapsed}。可关闭窗口或点击“停止生成”。`);
        };

        update();
        const timer = parentWindow.setInterval(update, 1000);
        return () => parentWindow.clearInterval(timer);
    }

    function getActiveModelSelector() {
        const context = getContext();
        const source = String(
            context.chatCompletionSettings?.chat_completion_source ||
            parentDocument.querySelector('#chat_completion_source')?.value ||
            ''
        );
        return {
            source,
            selector: MODEL_SELECTORS[source] || '',
        };
    }

    function getOptionText(option) {
        return option.textContent.trim() || option.label || option.value;
    }

    function collectAvailableModels() {
        const { source, selector } = getActiveModelSelector();
        const models = [];

        if (selector) {
            const element = parentDocument.querySelector(selector);
            if (element?.matches('select')) {
                element.querySelectorAll('option').forEach((option) => {
                    const value = String(option.value || '').trim();
                    if (!value) {
                        return;
                    }
                    models.push({
                        source,
                        selector,
                        value,
                        label: getOptionText(option),
                        selected: option.selected,
                    });
                });
            } else if (element?.matches('input')) {
                const value = String(element.value || '').trim();
                if (value) {
                    models.push({
                        source,
                        selector,
                        value,
                        label: value,
                        selected: true,
                    });
                }
            }
        }

        if (source === 'custom') {
            const inputValue = String(parentDocument.querySelector('#custom_model_id')?.value || '').trim();
            if (inputValue && !models.some(model => model.value === inputValue)) {
                models.unshift({
                    source,
                    selector: '#custom_model_id',
                    value: inputValue,
                    label: inputValue,
                    selected: true,
                });
            }
        }

        const unique = new Map();
        models.forEach((model) => unique.set(`${model.selector}\n${model.value}`, model));
        return [...unique.values()];
    }

    function populateModelSelect(select, statusElement) {
        const models = collectAvailableModels();
        const savedSelector = parentWindow.localStorage.getItem(MODEL_SELECTOR_KEY);
        const savedValue = parentWindow.localStorage.getItem(MODEL_VALUE_KEY);
        const activeModel = models.find(model => model.selected) || models[0];

        select.innerHTML = '';
        if (!models.length) {
            select.disabled = true;
            select.innerHTML = '<option value="">未获取到当前来源的模型</option>';
            setStatus(statusElement, 'warning', '没有从当前聊天补全来源读取到模型列表。请先在 ST 连接设置里完成模型加载。');
            return;
        }

        models.forEach((model, index) => {
            const option = parentDocument.createElement('option');
            option.value = String(index);
            option.textContent = `${model.source || 'model'} / ${model.label}`;
            option.dataset.selector = model.selector;
            option.dataset.modelValue = model.value;
            if (
                (savedSelector && savedValue && model.selector === savedSelector && model.value === savedValue) ||
                (!savedSelector && activeModel && model.selector === activeModel.selector && model.value === activeModel.value)
            ) {
                option.selected = true;
            }
            select.appendChild(option);
        });

        select.disabled = false;
        const selected = getSelectedModel(select);
        setStatus(statusElement, 'success', `已获取 ${models.length} 个模型。当前将使用：${selected?.label || selected?.value || '未选择'}`);
    }

    function getSelectedModel(select) {
        const option = select.selectedOptions?.[0];
        if (!option?.dataset.selector || !option.dataset.modelValue) {
            return null;
        }
        return {
            selector: option.dataset.selector,
            value: option.dataset.modelValue,
            label: option.textContent.trim(),
        };
    }

    function restoreElementValue(element, value) {
        const $ = parentWindow.$;
        if ($) {
            $(element).val(value).trigger('change');
            if (element.matches('input')) {
                $(element).trigger('input');
            }
        } else {
            element.value = value;
            element.dispatchEvent(new parentWindow.Event('change', { bubbles: true }));
            if (element.matches('input')) {
                element.dispatchEvent(new parentWindow.Event('input', { bubbles: true }));
            }
        }
    }

    async function withTemporaryModel(model, statusElement, run, callback) {
        if (!model) {
            return callback();
        }

        const element = parentDocument.querySelector(model.selector);
        if (!element) {
            setStatus(statusElement, 'warning', '选择的模型控件不在当前页面中，将使用 ST 当前模型生成。');
            return callback();
        }

        const originalValue = String(element.value || '');
        const shouldSwitch = originalValue !== model.value;
        const switchId = ++modelSwitchSequence;
        let restored = false;
        const restoreModel = () => {
            if (!shouldSwitch || restored || switchId !== modelSwitchSequence) {
                return;
            }
            restored = true;
            restoreElementValue(element, originalValue);
        };

        if (run) {
            run.restoreModel = restoreModel;
        }

        try {
            if (shouldSwitch) {
                setStatus(statusElement, 'busy', `已临时切换到 ${model.label}，正在生成 CSS...`);
                restoreElementValue(element, model.value);
                await new Promise(resolve => parentWindow.setTimeout(resolve, 120));
            }

            parentWindow.localStorage.setItem(MODEL_SELECTOR_KEY, model.selector);
            parentWindow.localStorage.setItem(MODEL_VALUE_KEY, model.value);
            return await callback();
        } finally {
            restoreModel();
            if (run?.restoreModel === restoreModel) {
                run.restoreModel = null;
            }
        }
    }

    function stripCodeFence(raw) {
        let text = String(raw || '').trim();

        text = text.replace(/<think>[\s\S]*?<\/think>/gi, '').trim();

        const fenced = text.match(/```(?:json|css)?\s*([\s\S]*?)```/i);
        if (fenced) {
            text = fenced[1].trim();
        }

        return text;
    }

    function extractJsonPatch(raw) {
        const text = stripCodeFence(raw);
        const firstBrace = text.indexOf('{');
        const lastBrace = text.lastIndexOf('}');
        const jsonText = firstBrace >= 0 && lastBrace > firstBrace
            ? text.slice(firstBrace, lastBrace + 1)
            : text;

        try {
            const parsed = JSON.parse(jsonText);
            if (!parsed || !Array.isArray(parsed.operations)) {
                throw new Error('JSON 中缺少 operations 数组');
            }
            return parsed;
        } catch (error) {
            throw new Error(`AI 未返回有效 JSON 补丁：${error?.message || error}`);
        }
    }

    function countOccurrences(haystack, needle) {
        if (!needle) {
            return 0;
        }

        let count = 0;
        let index = 0;
        while ((index = haystack.indexOf(needle, index)) !== -1) {
            count += 1;
            index += needle.length;
        }
        return count;
    }

    function getManagedPatch(css) {
        const start = css.indexOf(MANAGED_PATCH_START);
        const end = css.indexOf(MANAGED_PATCH_END);
        if (start === -1 || end === -1 || end < start) {
            return {
                exists: false,
                content: '',
                before: css.trimEnd(),
                after: '',
            };
        }

        const contentStart = start + MANAGED_PATCH_START.length;
        return {
            exists: true,
            content: css.slice(contentStart, end).trim(),
            before: css.slice(0, start).trimEnd(),
            after: css.slice(end + MANAGED_PATCH_END.length).trimStart(),
        };
    }

    function setManagedPatch(css, patchCss) {
        const patch = getManagedPatch(css);
        const cleanPatch = String(patchCss || '')
            .replace(MANAGED_PATCH_START, '')
            .replace(MANAGED_PATCH_END, '')
            .trim();

        if (!cleanPatch) {
            return patch.exists
                ? `${patch.before}${patch.after ? `\n\n${patch.after}` : ''}`.trim()
                : css;
        }

        const block = `${MANAGED_PATCH_START}\n${cleanPatch}\n${MANAGED_PATCH_END}`;
        return `${patch.before}\n\n${block}${patch.after ? `\n\n${patch.after}` : ''}`.trim();
    }

    function appendManagedPatch(css, patchCss) {
        const patch = getManagedPatch(css);
        const cleanPatch = String(patchCss || '')
            .replace(MANAGED_PATCH_START, '')
            .replace(MANAGED_PATCH_END, '')
            .trim();
        if (!cleanPatch) {
            return css;
        }

        const mergedPatch = [patch.content, cleanPatch].filter(Boolean).join('\n\n');
        return setManagedPatch(css, mergedPatch);
    }

    function applyPatchOperations(currentCss, patch) {
        let nextCss = String(currentCss || '');
        const failures = [];
        const applied = [];

        patch.operations.forEach((operation, index) => {
            const type = String(operation?.type || '').toLowerCase();
            const label = operation?.targetHint || operation?.summary || `operation ${index + 1}`;

            if (type === 'replace' || type === 'delete') {
                const oldText = String(operation.oldText || '');
                if (!oldText.trim()) {
                    failures.push(`${label}: oldText 为空`);
                    return;
                }

                const count = countOccurrences(nextCss, oldText);
                if (count !== 1) {
                    failures.push(`${label}: oldText 匹配次数为 ${count}，需要唯一匹配`);
                    return;
                }

                const newText = type === 'delete' ? '' : String(operation.newText ?? '');
                nextCss = nextCss.replace(oldText, newText);
                applied.push(`${type}:${label}`);
                return;
            }

            if (type === 'append') {
                const css = String(operation.css || '');
                if (!css.trim()) {
                    failures.push(`${label}: append css 为空`);
                    return;
                }

                nextCss = appendManagedPatch(nextCss, css);
                applied.push(`append:${label}`);
                return;
            }

            if (type === 'setmanagedpatch' || type === 'replace_managed_patch') {
                const css = String(operation.css || operation.managedCss || '');
                nextCss = setManagedPatch(nextCss, css);
                applied.push(`managed:${label}`);
                return;
            }

            failures.push(`${label}: 不支持的操作类型 ${operation?.type}`);
        });

        if (!applied.length) {
            throw new Error(`没有成功应用任何补丁。${failures.join('；')}`);
        }

        if (failures.length) {
            throw new Error(`部分补丁无法安全应用，已取消保存：${failures.join('；')}`);
        }

        if (nextCss === currentCss) {
            throw new Error('补丁应用后 CSS 没有变化，已取消保存');
        }

        return {
            css: nextCss,
            summary: patch.summary || '',
            applied,
        };
    }

    function cssPathForElement(element) {
        if (!element || element.nodeType !== 1) {
            return '';
        }

        const tag = element.tagName.toLowerCase();
        const id = element.id ? `#${element.id}` : '';
        const classes = [...element.classList]
            .filter(Boolean)
            .slice(0, 5)
            .map(className => `.${className}`)
            .join('');

        return `${tag}${id}${classes}`;
    }

    function sampleDomSelectors() {
        const roots = [
            ['chat', '#chat'],
            ['input', '#form_sheld'],
            ['leftSendForm', '#leftSendForm'],
            ['rightSendForm', '#rightSendForm'],
            ['extensionsMenu', '#extensionsMenu'],
            ['rightPanel', '#right-nav-panel'],
            ['topBar', '#top-bar'],
            ['popups', '.popup'],
        ];
        const lines = [];
        const seen = new Set();

        for (const [label, selector] of roots) {
            const root = parentDocument.querySelector(selector);
            if (!root) {
                continue;
            }

            const samples = [root, ...root.querySelectorAll('[id], [class]')]
                .slice(0, 90)
                .map(cssPathForElement)
                .filter(Boolean)
                .filter(path => {
                    if (seen.has(path)) {
                        return false;
                    }
                    seen.add(path);
                    return true;
                })
                .slice(0, 35);

            if (samples.length) {
                lines.push(`【${label}】`);
                lines.push(...samples.map(path => `- ${path}`));
            }
        }

        return lines.join('\n') || '未采样到 DOM 选择器。';
    }


    function loadHistory() {
        try {
            const raw = parentWindow.localStorage.getItem(HISTORY_KEY);
            const parsed = raw ? JSON.parse(raw) : [];
            return Array.isArray(parsed) ? parsed : [];
        } catch (error) {
            return [];
        }
    }

    function saveHistory(entries) {
        try {
            parentWindow.localStorage.setItem(HISTORY_KEY, JSON.stringify(entries.slice(-HISTORY_MAX)));
        } catch (error) {
            // localStorage 不可用时忽略
        }
    }

    function pushHistory(entry) {
        const entries = loadHistory();
        entries.push(entry);
        saveHistory(entries);
        return entries;
    }

    function clearHistory() {
        try {
            parentWindow.localStorage.removeItem(HISTORY_KEY);
        } catch (error) {
            // 忽略
        }
    }

    function renderHistory(container, textarea) {
        if (!container) {
            return;
        }
        const entries = loadHistory();
        container.innerHTML = '';
        if (!entries.length) {
            const empty = parentDocument.createElement('div');
            empty.className = 'th-ai-css-history-empty';
            empty.textContent = '还没有修改记录。';
            container.appendChild(empty);
            return;
        }
        const icons = { verified: '✅', partial: '🟡', unverifiable: '⚪', failed: '🔴' };
        [...entries].reverse().forEach((entry) => {
            const item = parentDocument.createElement('div');
            item.className = 'th-ai-css-history-item';
            const icon = icons[entry.status] || '•';
            const note = entry.note ? ` — ${entry.note}` : '';
            item.textContent = `${icon} ${entry.time || ''} ${entry.instruction || ''}${note}`;
            item.title = '点击把这条需求填回输入框，便于重试或继续修改';
            item.addEventListener('click', () => {
                textarea.value = entry.instruction || '';
                parentWindow.localStorage.setItem(LAST_INSTRUCTION_KEY, textarea.value);
                textarea.focus();
            });
            container.appendChild(item);
        });
    }

    // 把历史条目转成真正的对话消息（user=需求，assistant=当时 AI 的真实响应），供下次生成接续上文。
    function buildConversationMessages(entries, maxTurns) {
        const recent = entries.slice(-maxTurns);
        const messages = [];
        recent.forEach((entry) => {
            if (entry.instruction) {
                messages.push({ role: 'user', content: String(entry.instruction) });
            }
            const response = String(entry.response || entry.note || '').slice(0, TURN_RESPONSE_CAP);
            messages.push({ role: 'assistant', content: response || '(已应用)' });
        });
        return messages;
    }

    // 原生 generateRaw 只能收单条 prompt，没有多消息接口；把对话线程转写进 prompt 文本。
    function renderTranscript(priorTurns) {
        if (!priorTurns || !priorTurns.length) {
            return '';
        }
        const lines = ['[之前的对话记录，最新在后，供你接续上文]'];
        priorTurns.forEach((message) => {
            lines.push(`${message.role === 'user' ? '用户' : '助手'}: ${message.content}`);
        });
        lines.push('[对话记录结束]', '');
        return lines.join('\n');
    }

    function buildCssPrompt(instruction, currentCss, includeSelectorContext = false) {
        const systemPrompt = [
            'You are an expert CSS patch generator for SillyTavern custom CSS.',
            'You will receive the complete current CSS, but you must not return the complete CSS.',
            'Return only a strict JSON object with an operations array.',
            'Allowed operations:',
            '1) replace: {"type":"replace","targetHint":"short hint","oldText":"exact existing CSS substring","newText":"replacement substring","verify":{"selector":"css selector that should visually change","properties":["css-property"]}}',
            '2) delete: {"type":"delete","targetHint":"short hint","oldText":"exact existing CSS substring","verify":{"selector":"...","properties":["..."]}}',
            '3) append: {"type":"append","targetHint":"short hint","css":"small override CSS to place in the managed patch block","verify":{"selector":"...","properties":["..."]}}',
            'Use replace/delete only when oldText is an exact substring from the current CSS and likely appears once.',
            'Use append for safe CSS cascade overrides.',
            'Every operation MUST include a "verify" object naming the selector that should change and the affected CSS properties. After applying your patch the host reads the live computed style of that selector; if it did not change, the host will ask you to retry with higher specificity. Choose verify.selector as the element whose own pixels visibly change (the painted element itself, not a wrapper or parent).',
            'This is a large theme made by someone else; existing rules may have high specificity or !important. Make sure your selector wins the cascade; use !important when necessary.',
            'Keep outputs small. Do not use markdown. Do not include explanations outside JSON.'
        ].join(' ');

        const userPrompt = [
            '请根据用户需求生成 SillyTavern 自定义 CSS 的 JSON 补丁。',
            '你可以查看完整 CSS，但禁止返回完整 CSS。',
            '',
            '返回格式必须是严格 JSON：',
            '{',
            '  "summary": "一句话说明",',
            '  "operations": [',
            '    { "type": "replace", "targetHint": "定位说明", "oldText": "原 CSS 精确片段", "newText": "替换后的片段", "verify": { "selector": "应当发生变化的选择器", "properties": ["相关 CSS 属性"] } },',
            '    { "type": "append", "targetHint": "定位说明", "css": "少量覆盖 CSS", "verify": { "selector": "应当发生变化的选择器", "properties": ["相关 CSS 属性"] } }',
            '  ]',
            '}',
            '',
            '规则：',
            '- 不要返回完整 CSS。',
            '- replace/delete 的 oldText 必须从当前 CSS 原文精确复制，且尽量选择能唯一匹配的完整规则块或小片段。',
            '- 如果不确定能唯一匹配，使用 append 返回少量覆盖 CSS。',
            '- append 会由脚本写入 AI 托管补丁区。',
            '- 每个操作必须带 verify，写明应当变化的 selector 和受影响的 CSS 属性（脚本据此自动核对是否真的生效）。',
            '- verify.selector 要写真正发生可见变化的那个元素（被绘制的元素本身），不要写它的父容器，否则可能"父元素变了但你看不到变化"。',
            '- 这是别人做好的大型主题，原规则可能优先级很高或带 !important；覆盖时务必让你的选择器特异度足够高，必要时使用 !important，否则会不生效。',
            '- 不要使用 markdown 代码块。',
            '',
            '用户需求:',
            instruction,
            '',
            '当前 AI 托管补丁区:',
            getManagedPatch(currentCss).content || '/* 当前没有 AI 托管补丁。 */',
            '',
            includeSelectorContext ? [
                'SillyTavern 选择器参考（用户已勾选附带）：',
                SELECTOR_CHEATSHEET,
                '',
                '当前页面 DOM 采样（只作选择器参考，可能包含扩展/当前页面状态）：',
                sampleDomSelectors(),
                '',
            ].join('\n') : '',
            '当前 CSS:',
            '/* --- BEGIN CURRENT CSS --- */',
            currentCss || '/* 当前没有自定义 CSS。 */',
            '/* --- END CURRENT CSS --- */',
            '',
            '请只返回 JSON 补丁。'
        ].join('\n');

        return { systemPrompt, userPrompt };
    }

    function updateStreamPreview(previewElement, text, isIncremental = false) {
        if (!previewElement) {
            return;
        }

        const value = String(text || '');
        if (!value) {
            return;
        }

        previewElement.classList.remove('is-hidden');
        if (isIncremental) {
            previewElement.textContent = `${previewElement.textContent || ''}${value}`;
        } else {
            previewElement.textContent = value;
        }
        previewElement.scrollTop = previewElement.scrollHeight;
    }

    function sleep(ms) {
        return new Promise((resolve) => parentWindow.setTimeout(resolve, ms));
    }

    function nextFrame() {
        return new Promise((resolve) => {
            parentWindow.requestAnimationFrame(() => parentWindow.setTimeout(resolve, 30));
        });
    }

    // 只把 CSS 渲染到页面（更新 #customCSS 并触发 ST 应用），不主动写入设置；用于"试用-核对"，确认生效后再正式保存。
    function applyCssRenderOnly(css) {
        const textarea = parentDocument.querySelector('#customCSS');
        if (textarea) {
            textarea.value = css;
            textarea.dispatchEvent(new parentWindow.Event('input', { bubbles: true }));
            return;
        }
        let style = parentDocument.getElementById('custom-style');
        if (!style) {
            style = parentDocument.createElement('style');
            style.id = 'custom-style';
            style.type = 'text/css';
            parentDocument.head.appendChild(style);
        }
        style.textContent = css;
    }

    // 粗略估算选择器特异度（a*100+b*10+c），仅用于给 AI 反馈"要盖过多少"，不要求绝对精确。
    function computeSpecificity(selector) {
        const sel = String(selector || '');
        const ids = (sel.match(/#[\w-]+/g) || []).length;
        const classesAttrsPseudo = (sel.match(/\.[\w-]+|\[[^\]]+\]|:(?!:)[\w-]+/g) || []).length;
        const typesAndPseudoElements = (sel.match(/(?:^|[\s>+~])[a-zA-Z][\w-]*|::[\w-]+/g) || []).length;
        return ids * 100 + classesAttrsPseudo * 10 + typesAndPseudoElements;
    }

    // 在所有同源样式表里找出"正在给某元素的某属性赋值"的规则，按 !important、特异度排序，作为反馈给 AI 的"拦路规则"。
    function findBlockingRules(element, property) {
        if (!element) {
            return [];
        }

        const blockers = [];

        const scan = (ruleList) => {
            for (let i = 0; i < ruleList.length; i += 1) {
                const rule = ruleList[i];
                if (rule.cssRules && !rule.selectorText) {
                    try {
                        scan(rule.cssRules);
                    } catch (error) {
                        // 嵌套规则（如 @media）访问失败时跳过
                    }
                    continue;
                }
                if (!rule.selectorText || !rule.style || !rule.style.getPropertyValue(property)) {
                    continue;
                }
                const subSelectors = rule.selectorText.split(',').map((part) => part.trim());
                const matches = subSelectors.some((sub) => {
                    try {
                        return element.matches(sub);
                    } catch (error) {
                        return false;
                    }
                });
                if (!matches) {
                    continue;
                }
                blockers.push({
                    selectorText: rule.selectorText,
                    important: rule.style.getPropertyPriority(property) === 'important',
                    specificity: Math.max(...subSelectors.map(computeSpecificity)),
                });
            }
        };

        const sheets = parentDocument.styleSheets;
        for (let i = 0; i < sheets.length; i += 1) {
            let rules;
            try {
                rules = sheets[i].cssRules;
            } catch (error) {
                continue; // 跨域样式表无法读取
            }
            if (rules) {
                scan(rules);
            }
        }

        blockers.sort((a, b) => (Number(b.important) - Number(a.important)) || (b.specificity - a.specificity));
        return blockers.slice(0, 4);
    }

    function isRenderedVisible(element) {
        if (!element || !element.isConnected) {
            return false;
        }
        const cs = parentWindow.getComputedStyle(element);
        if (cs.display === 'none' || cs.visibility === 'hidden') {
            return false;
        }
        return element.getClientRects().length > 0;
    }

    // 记录"基线"：每个目标可见元素的真实引用 + 当前属性值；之后用同一批元素对比，避免元素集合漂移造成的假变化。
    function prepareVerification(targets) {
        const probes = [];
        const counts = {};
        targets.forEach(({ selector, properties }) => {
            let elements = [];
            try {
                elements = [...parentDocument.querySelectorAll(selector)];
            } catch (error) {
                elements = [];
            }
            const visible = elements.filter(isRenderedVisible).slice(0, VERIFY_ELEMENT_CAP);
            counts[selector] = visible.length;
            properties.forEach((property) => {
                visible.forEach((element) => {
                    probes.push({
                        selector,
                        property,
                        element,
                        before: parentWindow.getComputedStyle(element).getPropertyValue(property),
                    });
                });
            });
        });
        return { probes, counts };
    }

    // 从补丁的每个 operation.verify 收集去重后的核对目标。
    function collectVerifyTargets(patch) {
        const map = new Map();
        (patch.operations || []).forEach((operation) => {
            const verify = operation?.verify;
            const selector = String(verify?.selector || '').trim();
            if (!selector) {
                return;
            }
            const rawProps = Array.isArray(verify.properties) ? verify.properties : [verify.property];
            const props = rawProps.filter(Boolean).map((property) => String(property).trim().toLowerCase());
            if (!props.length) {
                return;
            }
            const existing = map.get(selector) || new Set();
            props.forEach((property) => existing.add(property));
            map.set(selector, existing);
        });
        return [...map.entries()].map(([selector, props]) => ({ selector, properties: [...props] }));
    }

    // 用基线探针组装"哪些属性真的变了"。changedValues: `${selector}\n${property}` -> {before, after}
    function assembleDiff(targets, counts, changedValues) {
        const details = targets.map(({ selector, properties }) => {
            const matchedCount = counts[selector] || 0;
            const changed = [];
            const unchanged = [];
            properties.forEach((property) => {
                const entry = changedValues[`${selector}\n${property}`];
                if (matchedCount > 0 && entry) {
                    changed.push({ property, before: entry.before, after: entry.after });
                } else {
                    unchanged.push(property);
                }
            });
            return { selector, matchedCount, changed, unchanged };
        });
        return { details };
    }

    // 用同一批基线元素，读取应用后的 computed style，得出真实变化。
    function evaluateVerification(targets, prep) {
        const changedValues = {};
        prep.probes.forEach((probe) => {
            if (!probe.element.isConnected) {
                return;
            }
            const after = parentWindow.getComputedStyle(probe.element).getPropertyValue(probe.property);
            if (after !== probe.before) {
                const key = `${probe.selector}\n${probe.property}`;
                if (!changedValues[key]) {
                    changedValues[key] = { before: probe.before, after };
                }
            }
        });
        return assembleDiff(targets, prep.counts, changedValues);
    }

    // 稳定性复核：只保留两次测量都判定为"变化"的属性，过滤重排/瞬时造成的假变化。
    function intersectDiffDetails(diffA, diffB) {
        const stableKeys = new Set();
        diffB.details.forEach((detail) => {
            detail.changed.forEach((change) => stableKeys.add(`${detail.selector}\n${change.property}`));
        });
        const details = diffA.details.map((detail) => {
            const changed = detail.changed.filter((change) => stableKeys.has(`${detail.selector}\n${change.property}`));
            const stableProps = new Set(changed.map((change) => change.property));
            const droppedProps = detail.changed
                .filter((change) => !stableProps.has(change.property))
                .map((change) => change.property);
            return {
                selector: detail.selector,
                matchedCount: detail.matchedCount,
                changed,
                unchanged: [...detail.unchanged, ...droppedProps],
            };
        });
        return { details };
    }

    function describeDiff(diff) {
        return diff.details.map((detail) => {
            if (detail.matchedCount === 0) {
                return `${detail.selector}：未匹配到可见元素`;
            }
            const okPart = detail.changed.length
                ? `已变化 ${detail.changed.map((change) => `${change.property} ${change.before}→${change.after}`).join('，')}`
                : '';
            const noPart = detail.unchanged.length ? `未变化 ${detail.unchanged.join('/')}` : '';
            return `${detail.selector}（${detail.matchedCount} 个）：${[okPart, noPart].filter(Boolean).join('；')}`;
        }).join(' | ');
    }

    // 把"没生效"的核对结果整理成给 AI 的自然语言反馈，并附上拦路规则。
    function buildVerificationFeedback(diff) {
        const lines = [];
        diff.details.forEach((detail) => {
            if (detail.matchedCount === 0) {
                lines.push(`- 选择器 "${detail.selector}" 在当前页面没有匹配到任何元素，可能写错了，或该元素此刻不在页面上。请换一个真实存在的选择器。`);
                return;
            }
            if (!detail.unchanged.length) {
                return;
            }
            let element = null;
            try {
                element = parentDocument.querySelector(detail.selector);
            } catch (error) {
                element = null;
            }
            detail.unchanged.forEach((property) => {
                const blockers = findBlockingRules(element, property);
                const blockerText = blockers.length
                    ? blockers.map((blocker) => `${blocker.selectorText}${blocker.important ? ' !important' : ''}（特异度约 ${blocker.specificity}）`).join('  |  ')
                    : '未找到明确来源，可能来自内联样式或更复杂的规则';
                lines.push(`- "${detail.selector}" 的 ${property} 应用后没有变化。当前压制它的规则：${blockerText}。请提高你的选择器特异度，或对该属性使用 !important。`);
            });
        });
        return lines.join('\n');
    }

    function buildRetryPrompt(instruction, feedback) {
        const systemPrompt = [
            'You are fixing a SillyTavern custom CSS patch that did NOT take visual effect.',
            'Return ONLY a strict JSON object with an operations array. Use ONLY "append" operations this time.',
            'Each operation: {"type":"append","targetHint":"short hint","css":"override css","verify":{"selector":"...","properties":["..."]}}.',
            'The existing theme rules have high specificity or !important, so your override MUST WIN: raise selector specificity or use !important.',
            'Do not use markdown. Do not include explanations outside JSON.'
        ].join(' ');

        const userPrompt = [
            '上一次的修改没有在页面上生效。请只用 append 覆盖规则，并确保优先级足够高（可使用 !important）。',
            '',
            '原始需求：',
            instruction,
            '',
            '自动核对发现的问题：',
            feedback || '（没有更具体的信息，请直接用更高特异度或 !important 重写覆盖。）',
            '',
            '只返回 JSON 补丁，且每个操作都必须带 verify。'
        ].join('\n');

        return { systemPrompt, userPrompt };
    }

    function getHelperGenerateRaw() {
        const helperGenerateRaw = window.generateRaw || parentWindow.TavernHelper?.generateRaw;
        if (typeof helperGenerateRaw !== 'function') {
            return null;
        }

        return helperGenerateRaw;
    }

    function getEventSource() {
        return getContext().eventSource || parentWindow.eventSource || window.eventSource;
    }

    function addGenerationEventListeners(run, statusElement, previewElement) {
        const eventSource = getEventSource();
        if (!eventSource?.on) {
            return () => {};
        }

        let fullText = '';
        const disposers = [];
        const listen = (eventName, listener) => {
            eventSource.on(eventName, listener);
            disposers.push(() => eventSource.removeListener?.(eventName, listener));
        };

        listen('js_generation_started', (generationId) => {
            if (generationId !== run.generationId || run.cancelled) {
                return;
            }
            setStatus(statusElement, 'busy', `流式生成已开始，ID：${generationId}`);
        });

        listen('js_stream_token_received_fully', (text, generationId) => {
            if (generationId !== run.generationId || run.cancelled) {
                return;
            }
            run.stopFeedback?.();
            run.stopFeedback = null;
            fullText = String(text || '');
            run.lastStreamText = fullText;
            updateStreamPreview(previewElement, fullText, false);
            setStatus(statusElement, 'busy', `正在接收流式内容：${fullText.length} 字符。可关闭窗口或点击“停止生成”。`);
        });

        listen('js_stream_token_received_incrementally', (text, generationId) => {
            if (generationId !== run.generationId || run.cancelled) {
                return;
            }
            updateStreamPreview(previewElement, text, true);
        });

        listen('js_generation_ended', (text, generationId) => {
            if (generationId !== run.generationId || run.cancelled) {
                return;
            }
            fullText = String(text || fullText || '');
            run.lastStreamText = fullText;
            updateStreamPreview(previewElement, fullText, false);
            setStatus(statusElement, 'busy', `流式返回完成，正在清理 CSS：${fullText.length} 字符。`);
        });

        return () => {
            for (const dispose of disposers) {
                try {
                    dispose();
                } catch (error) {
                    console.warn('[AI CSS] 清理流式事件监听失败', error);
                }
            }
        };
    }

    async function generateCssWithHelperStream(prompts, run, statusElement, previewElement, priorTurns) {
        const helperGenerateRaw = getHelperGenerateRaw();
        if (!helperGenerateRaw) {
            throw new Error('当前 JS-Slash-Runner 环境未暴露 TavernHelper.generateRaw()');
        }

        setStatus(statusElement, 'busy', '正在启动 TavernHelper 流式生成...');
        previewElement.classList.remove('is-hidden');
        previewElement.textContent = '';
        run.lastStreamText = '';

        const response = await helperGenerateRaw({
            generation_id: run.generationId,
            user_input: prompts.userPrompt,
            should_stream: true,
            should_silence: true,
            max_chat_history: 0,
            ordered_prompts: [
                { role: 'system', content: prompts.systemPrompt },
                ...(priorTurns || []),
                'user_input',
            ],
        });

        return response || run.lastStreamText || '';
    }

    async function generateCssWithNativeSt(prompts, priorTurns) {
        const context = getContext();
        if (typeof context.generateRaw !== 'function') {
            throw new Error('当前环境没有可用的 generateRaw()');
        }

        const transcript = renderTranscript(priorTurns);
        return await context.generateRaw({
            systemPrompt: prompts.systemPrompt,
            prompt: transcript ? `${transcript}\n${prompts.userPrompt}` : prompts.userPrompt,
            responseLength: 12000,
        });
    }

    // 调一次模型拿原始文本：优先 TavernHelper 流式，失败回退 ST 原生 generateRaw。priorTurns 为接续上文的对话消息。
    async function runGeneration(prompts, run, statusElement, previewElement, priorTurns) {
        let response = '';
        let usedFallback = false;

        try {
            response = await generateCssWithHelperStream(prompts, run, statusElement, previewElement, priorTurns);
        } catch (error) {
            if (run.cancelled) {
                throw error;
            }
            console.warn('[AI CSS] TavernHelper 流式生成不可用，回退到 SillyTavern generateRaw()', error);
            usedFallback = true;
            setStatus(statusElement, 'warning', `流式生成不可用，已回退到 ST 原生生成：${error?.message || error}`);
            response = await generateCssWithNativeSt(prompts, priorTurns);
        }

        if (usedFallback) {
            updateStreamPreview(previewElement, response, false);
        }

        return response;
    }

    // 核心：生成 -> 从干净基线应用 -> 读 computed style 核对是否真的变了 -> 没变就带反馈重试。
    // 返回 { status, finalCss, applied, summary, attempts, report }，status ∈ verified/partial/unverifiable/cancelled/failed。
    async function generateApplyVerify(instruction, beforeCss, run, statusElement, previewElement, includeSelectorContext, priorTurns) {
        let lastFeedback = '';
        let lastRaw = '';
        let bestOutcome = null;

        for (let attempt = 1; attempt <= MAX_VERIFY_ATTEMPTS; attempt += 1) {
            if (run.cancelled) {
                break;
            }

            const prompts = attempt === 1
                ? buildCssPrompt(instruction, beforeCss, includeSelectorContext)
                : buildRetryPrompt(instruction, lastFeedback);

            run.generationId = createId();
            if (attempt > 1) {
                setStatus(statusElement, 'busy', `上次修改未检测到生效，正在第 ${attempt}/${MAX_VERIFY_ATTEMPTS} 次尝试（提高优先级重写）...`);
            }

            let patch;
            let result;
            let targets;
            let rawResponse = '';
            try {
                rawResponse = await runGeneration(prompts, run, statusElement, previewElement, priorTurns);
                lastRaw = rawResponse;
                if (run.cancelled) {
                    break;
                }
                patch = extractJsonPatch(rawResponse);
                result = applyPatchOperations(beforeCss, patch);
                targets = collectVerifyTargets(patch);
            } catch (error) {
                if (run.cancelled) {
                    break;
                }
                console.warn(`[AI CSS] 第 ${attempt} 次补丁应用失败`, error);
                lastFeedback = `上次返回无法应用：${error?.message || error}。请改用 append 覆盖规则，保证 JSON 严格合法，且每个操作都带 verify。`;
                continue;
            }

            // AI 没声明 verify 目标，无法自动核对：先应用、如实标注"未能核对"。
            if (!targets.length) {
                applyCssRenderOnly(result.css);
                await nextFrame();
                return {
                    status: 'unverifiable',
                    finalCss: result.css,
                    applied: result.applied,
                    summary: result.summary,
                    attempts: attempt,
                    report: 'AI 未声明可核对的 verify 目标，无法自动确认是否生效。',
                };
            }

            // 先回到干净基线、记录同一批可见元素的基线值，再应用候选 CSS，用同一批元素对比是否真的变化。
            applyCssRenderOnly(beforeCss);
            await sleep(200);
            if (run.cancelled) {
                break;
            }
            const prep = prepareVerification(targets);

            applyCssRenderOnly(result.css);
            let diff = evaluateVerification(targets, prep);
            let waited = 0;
            while (!diff.details.some((detail) => detail.changed.length) && waited < 900) {
                await sleep(150);
                waited += 150;
                if (run.cancelled) {
                    break;
                }
                diff = evaluateVerification(targets, prep);
            }
            if (run.cancelled) {
                break;
            }

            // 稳定性复核：再测一次，只保留两次都变化的属性，过滤重排/瞬时假象。
            if (diff.details.some((detail) => detail.changed.length)) {
                await sleep(250);
                if (run.cancelled) {
                    break;
                }
                diff = intersectDiffDetails(diff, evaluateVerification(targets, prep));
            }
            console.log('[AI CSS] 核对结果：', describeDiff(diff));

            const present = diff.details.filter((detail) => detail.matchedCount > 0);

            if (present.length && present.every((detail) => detail.unchanged.length === 0)) {
                return {
                    status: 'verified',
                    finalCss: result.css,
                    applied: result.applied,
                    summary: result.summary,
                    attempts: attempt,
                    report: describeDiff(diff),
                };
            }

            lastFeedback = buildVerificationFeedback(diff);

            if (present.some((detail) => detail.changed.length)) {
                bestOutcome = {
                    status: 'partial',
                    finalCss: result.css,
                    applied: result.applied,
                    summary: result.summary,
                    attempts: attempt,
                    report: describeDiff(diff),
                };
            } else if (!present.length && !bestOutcome) {
                bestOutcome = {
                    status: 'unverifiable',
                    finalCss: result.css,
                    applied: result.applied,
                    summary: result.summary,
                    attempts: attempt,
                    report: `未匹配到目标元素：${diff.details.map((detail) => detail.selector).join('、')}（可能选择器有误，或该元素此刻不在页面上）。`,
                };
            }
        }

        if (run.cancelled) {
            applyCssRenderOnly(beforeCss);
            return { status: 'cancelled', finalCss: beforeCss, applied: [], summary: '', attempts: 0, report: '' };
        }

        if (bestOutcome) {
            applyCssRenderOnly(bestOutcome.finalCss);
            await nextFrame();
            return bestOutcome;
        }

        // 全部尝试都没检测到变化：还原到干净基线。
        applyCssRenderOnly(beforeCss);
        await nextFrame();
        return {
            status: 'failed',
            finalCss: beforeCss,
            applied: [],
            summary: '',
            attempts: MAX_VERIFY_ATTEMPTS,
            report: lastFeedback || '多次尝试后仍未检测到任何样式变化。',
        };
    }

    function setBusy(dialog, busy) {
        dialog.querySelectorAll('button, .menu_button, textarea, select').forEach((element) => {
            if (element.classList.contains('th-ai-css-close') || element.classList.contains('th-ai-css-stop')) {
                element.removeAttribute('disabled');
                return;
            }
            if ('disabled' in element) {
                element.disabled = busy;
            } else {
                element.toggleAttribute('disabled', busy);
                element.style.pointerEvents = busy ? 'none' : '';
                element.style.opacity = busy ? '0.6' : '';
            }
        });

        dialog.querySelector('.th-ai-css-stop')?.classList.toggle('is-hidden', !busy);
    }

    function closeDialog() {
        const dialog = parentDocument.getElementById(DIALOG_ID);
        dialog?.__aiCssStopActiveRun?.('窗口已关闭，已请求停止生成，并会忽略稍后返回的结果');
        dialog?.remove();
    }

    function openDialog() {
        installStyle();
        parentDocument.getElementById(DIALOG_ID)?.remove();

        const currentCss = getCurrentCss();
        let currentRun = null;
        const dialog = parentDocument.createElement('div');
        dialog.id = DIALOG_ID;
        dialog.innerHTML = `
            <div class="th-ai-css-modal" role="dialog" aria-modal="true" aria-labelledby="${DIALOG_ID}-title">
                <div class="th-ai-css-header">
                    <div class="th-ai-css-title" id="${DIALOG_ID}-title">
                        <i class="fa-solid fa-wand-magic-sparkles"></i>
                        <span>AI 修改自定义 CSS</span>
                    </div>
                    <button class="menu_button th-ai-css-close" type="button" title="关闭">
                        <i class="fa-solid fa-xmark"></i>
                    </button>
                </div>
                <div class="th-ai-css-meta">
                    当前自定义 CSS 长度：${currentCss.length} 字符。生成前自动备份旧 CSS；应用后会自动核对是否真的生效，没生效会自动重试。
                </div>
                <div class="th-ai-css-model-row">
                    <button class="menu_button th-ai-css-load-models" type="button">
                        <i class="fa-solid fa-list"></i>
                        <span>获取模型</span>
                    </button>
                    <select class="text_pole th-ai-css-model-select" disabled>
                        <option value="">先点击“获取模型”</option>
                    </select>
                </div>
                <label class="th-ai-css-option-row" title="普通局部修改可关闭；新增美化、不知道类名或选择器时建议开启。">
                    <input class="th-ai-css-selector-context" type="checkbox">
                    <span>附带 SillyTavern 选择器速查表和当前页面 DOM 采样</span>
                </label>
                <textarea class="text_pole textarea_compact" spellcheck="false" placeholder="输入你想修改的部分。例如：把聊天区消息气泡改成半透明；把输入框字体调大；隐藏顶部栏某个按钮。"></textarea>
                <div class="th-ai-css-status is-idle"></div>
                <pre class="th-ai-css-stream-preview is-hidden" aria-live="polite"></pre>
                <div class="th-ai-css-history-wrap">
                    <div class="th-ai-css-history-head">
                        <span>最近修改（点条目可填回需求，便于重试或继续修改）</span>
                        <button class="th-ai-css-clear-history" type="button">清空</button>
                    </div>
                    <div class="th-ai-css-history"></div>
                </div>
                <div class="th-ai-css-actions">
                    <button class="menu_button th-ai-css-restore" type="button">
                        <i class="fa-solid fa-rotate-left"></i>
                        <span>恢复上次备份</span>
                    </button>
                    <button class="menu_button th-ai-css-stop is-hidden" type="button">
                        <i class="fa-solid fa-circle-stop"></i>
                        <span>停止生成</span>
                    </button>
                    <button class="menu_button th-ai-css-run" type="button">
                        <i class="fa-solid fa-floppy-disk"></i>
                        <span>生成并保存</span>
                    </button>
                </div>
            </div>
        `;

        const textarea = dialog.querySelector('textarea');
        const status = dialog.querySelector('.th-ai-css-status');
        const preview = dialog.querySelector('.th-ai-css-stream-preview');
        const runButton = dialog.querySelector('.th-ai-css-run');
        const restoreButton = dialog.querySelector('.th-ai-css-restore');
        const stopButton = dialog.querySelector('.th-ai-css-stop');
        const loadModelsButton = dialog.querySelector('.th-ai-css-load-models');
        const modelSelect = dialog.querySelector('.th-ai-css-model-select');
        const selectorContextCheckbox = dialog.querySelector('.th-ai-css-selector-context');

        selectorContextCheckbox.checked = parentWindow.localStorage.getItem(INCLUDE_SELECTOR_CONTEXT_KEY) === 'true';
        selectorContextCheckbox.addEventListener('change', () => {
            parentWindow.localStorage.setItem(INCLUDE_SELECTOR_CONTEXT_KEY, selectorContextCheckbox.checked ? 'true' : 'false');
            setStatus(status, selectorContextCheckbox.checked ? 'success' : 'warning', selectorContextCheckbox.checked
                ? '本次将附带选择器速查表和当前页面 DOM 采样。'
                : '已关闭选择器上下文，普通修改会更省 token。');
        });

        const historyContainer = dialog.querySelector('.th-ai-css-history');
        textarea.value = parentWindow.localStorage.getItem(LAST_INSTRUCTION_KEY) || '';
        textarea.addEventListener('input', () => {
            parentWindow.localStorage.setItem(LAST_INSTRUCTION_KEY, textarea.value);
        });
        renderHistory(historyContainer, textarea);
        dialog.querySelector('.th-ai-css-clear-history').addEventListener('click', () => {
            clearHistory();
            renderHistory(historyContainer, textarea);
        });

        const stopActiveRun = (message = '已请求停止生成') => {
            if (!currentRun || currentRun.cancelled) {
                return;
            }

            currentRun.cancelled = true;
            currentRun.finished = true;
            currentRun.stopFeedback?.();
            currentRun.stopStreamListeners?.();
            currentRun.restoreModel?.();
            try {
                const stopById = window.stopGenerationById || parentWindow.TavernHelper?.stopGenerationById;
                if (currentRun.generationId && typeof stopById === 'function') {
                    stopById(currentRun.generationId);
                }
                getContext().stopGeneration?.();
            } catch (error) {
                console.warn('[AI CSS] 请求停止生成失败', error);
            }

            setStatus(status, 'warning', `${message}。如果后端已经收到请求，可能还会稍后返回；本脚本会忽略这次结果，不会保存。`);
            currentRun = null;
            if (parentDocument.body.contains(dialog)) {
                setBusy(dialog, false);
            }
        };

        dialog.__aiCssStopActiveRun = stopActiveRun;

        dialog.querySelector('.th-ai-css-close').addEventListener('click', closeDialog);
        dialog.addEventListener('mousedown', (event) => {
            if (event.target === dialog) {
                closeDialog();
            }
        });

        stopButton.addEventListener('click', () => {
            stopActiveRun();
        });

        loadModelsButton.addEventListener('click', () => {
            try {
                populateModelSelect(modelSelect, status);
            } catch (error) {
                console.error('[AI CSS] 获取模型失败', error);
                setStatus(status, 'error', `获取模型失败：${error?.message || error}`);
                notify('error', `获取模型失败：${error?.message || error}`);
            }
        });

        modelSelect.addEventListener('change', () => {
            const selected = getSelectedModel(modelSelect);
            if (!selected) {
                return;
            }
            parentWindow.localStorage.setItem(MODEL_SELECTOR_KEY, selected.selector);
            parentWindow.localStorage.setItem(MODEL_VALUE_KEY, selected.value);
            setStatus(status, 'success', `已选择模型：${selected.label}`);
        });

        restoreButton.addEventListener('click', () => {
            const backup = parentWindow.localStorage.getItem(BACKUP_KEY);
            if (backup == null) {
                setStatus(status, 'warning', '还没有可恢复的 CSS 备份。');
                notify('warning', '还没有可恢复的 CSS 备份');
                return;
            }
            applyAndSaveCss(backup);
            setStatus(status, 'success', '已恢复上次备份并保存。');
            notify('success', '已恢复上次 CSS 备份');
        });

        runButton.addEventListener('click', async () => {
            if (currentRun && !currentRun.finished) {
                setStatus(status, 'warning', '已有一次生成仍在进行。请先点击“停止生成”，或关闭窗口后重新打开。');
                return;
            }

            const instruction = textarea.value.trim();
            if (!instruction) {
                setStatus(status, 'warning', '先写一下你想改哪里。');
                textarea.focus();
                return;
            }

            const run = {
                generationId: createId(),
                cancelled: false,
                finished: false,
                stopFeedback: null,
                stopStreamListeners: null,
                restoreModel: null,
                lastStreamText: '',
            };
            currentRun = run;

            const beforeCss = getCurrentCss();
            try {
                setBusy(dialog, true);
                const selectedModel = getSelectedModel(modelSelect);
                const includeSelectorContext = !!selectorContextCheckbox.checked;
                run.stopFeedback = startBusyFeedback(status, selectedModel
                    ? `正在使用 ${selectedModel.label} 生成 CSS`
                    : '正在调用当前 SillyTavern API 生成 CSS');
                run.stopStreamListeners = addGenerationEventListeners(run, status, preview);
                const outcome = await withTemporaryModel(selectedModel, status, run, () => generateApplyVerify(instruction, beforeCss, run, status, preview, includeSelectorContext));

                if (run.cancelled || !parentDocument.body.contains(dialog)) {
                    applyCssRenderOnly(beforeCss);
                    return;
                }

                if (outcome.status === 'failed') {
                    applyAndSaveCss(beforeCss);
                    setStatus(status, 'error', `试了 ${outcome.attempts} 次仍未检测到任何变化，已保持原 CSS 不变。\n诊断：\n${outcome.report}`);
                    notify('error', 'AI 修改未生效，已保持原样');
                    pushHistory({ time: new Date().toLocaleTimeString(), instruction, status: 'failed', note: '未检测到生效，已还原' });
                    renderHistory(historyContainer, textarea);
                    return;
                }

                parentWindow.localStorage.setItem(BACKUP_KEY, beforeCss);
                applyAndSaveCss(outcome.finalCss);

                if (outcome.status === 'verified') {
                    setStatus(status, 'success', `已确认生效并保存（第 ${outcome.attempts} 次尝试）。核对：${outcome.report}。旧 CSS 已备份，可用“恢复上次备份”撤回。${outcome.summary ? ` ${outcome.summary}` : ''}`);
                    notify('success', 'AI 已修改并确认生效');
                } else if (outcome.status === 'partial') {
                    setStatus(status, 'warning', `已保存，但只有部分生效：${outcome.report}。未变化的部分可能被更高优先级规则或 !important 挡住。旧 CSS 已备份，可“恢复上次备份”。`);
                    notify('warning', 'AI 修改部分生效，已保存');
                } else {
                    setStatus(status, 'warning', `已应用并保存，但脚本无法自动确认是否生效（${outcome.report}）。请肉眼检查页面；若没变化可点“恢复上次备份”。`);
                    notify('warning', 'AI 修改已保存（未能自动核对）');
                }

                pushHistory({
                    time: new Date().toLocaleTimeString(),
                    instruction,
                    status: outcome.status,
                    note: outcome.status === 'verified'
                        ? '已确认生效'
                        : outcome.status === 'partial'
                            ? '部分生效'
                            : '已保存但未能自动核对',
                });
                renderHistory(historyContainer, textarea);
            } catch (error) {
                console.error('[AI CSS] 生成或保存失败', error);
                applyCssRenderOnly(beforeCss);
                if (!run.cancelled && parentDocument.body.contains(dialog)) {
                    setStatus(status, 'error', `失败：${error?.message || error}`);
                    notify('error', `AI 修改 CSS 失败：${error?.message || error}`);
                }
            } finally {
                run.finished = true;
                run.stopFeedback?.();
                run.stopStreamListeners?.();
                run.restoreModel?.();
                const isLatestRun = currentRun === run;
                if (isLatestRun) {
                    currentRun = null;
                }
                if (isLatestRun && parentDocument.body.contains(dialog)) {
                    setBusy(dialog, false);
                }
            }
        });

        parentDocument.body.appendChild(dialog);
        try {
            populateModelSelect(modelSelect, status);
        } catch (error) {
            console.warn('[AI CSS] 初始获取模型失败', error);
            setStatus(status, 'warning', '未自动获取到模型；可稍后点击“获取模型”。');
        }
        textarea.focus();
    }

    async function installMenuItem() {
        const menu = await waitForElement('#extensionsMenu');
        parentDocument.getElementById(MENU_ID)?.remove();

        const container = parentDocument.createElement('div');
        container.id = MENU_ID;
        container.className = 'extension_container';
        container.innerHTML = `
            <div class="list-group-item flex-container flexGap5 interactable" tabindex="0" role="listitem" title="用 AI 修改并保存自定义 CSS">
                <div class="fa-fw fa-solid fa-wand-magic-sparkles extensionsMenuExtensionButton"></div>
                <span>AI 修改自定义 CSS</span>
            </div>
        `;

        container.querySelector('.list-group-item').addEventListener('click', () => {
            const dropdown = parentDocument.querySelector('#extensionsMenu');
            if (dropdown) {
                dropdown.style.display = 'none';
            }
            openDialog();
        });

        menu.appendChild(container);
        const button = parentDocument.querySelector('#extensionsMenuButton');
        if (button) {
            button.style.display = 'flex';
        }
    }

    function cleanup() {
        parentDocument.getElementById(MENU_ID)?.remove();
        const dialog = parentDocument.getElementById(DIALOG_ID);
        dialog?.__aiCssStopActiveRun?.('页面正在卸载，已请求停止生成');
        dialog?.remove();
    }

    installMenuItem().catch((error) => {
        console.error('[AI CSS] 菜单入口安装失败', error);
        notify('error', `AI CSS 菜单入口安装失败：${error.message || error}`);
    });

    window.addEventListener('pagehide', cleanup);
})();
