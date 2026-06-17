(function () {
    'use strict';

    const SCRIPT_ID = 'th-preset-entry-viewer';
    const SCRIPT_NAME = '预设条目查看器';
    const MENU_ID = `${SCRIPT_ID}-menu-item`;
    const DIALOG_ID = `${SCRIPT_ID}-dialog`;
    const STYLE_ID = `${SCRIPT_ID}-style`;
    const DELETE_DIALOG_ID = `${SCRIPT_ID}-delete-dialog`;
    const DEFAULT_PROMPT_ORDER_ID = '100001';

    const parentWindow = window.parent || window;
    const parentDocument = parentWindow.document;

    function getContext() {
        const st = parentWindow.SillyTavern || window.SillyTavern;
        if (!st || typeof st.getContext !== 'function') {
            throw new Error('无法获取 SillyTavern.getContext()');
        }
        return st.getContext();
    }

    function notify(type, message) {
        const toastr = parentWindow.toastr || window.toastr;
        if (toastr && typeof toastr[type] === 'function') {
            toastr[type](message);
            return;
        }
        console[type === 'error' ? 'error' : 'log'](`[${SCRIPT_NAME}] ${message}`);
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
                z-index: 10060;
                display: flex;
                align-items: center;
                justify-content: center;
                padding: 18px;
                box-sizing: border-box;
                background: rgba(0, 0, 0, 0.55);
            }
            #${DIALOG_ID} .th-pev-modal {
                width: min(980px, 96vw);
                max-height: min(760px, 92vh);
                display: grid;
                grid-template-rows: auto auto minmax(0, 1fr);
                gap: 12px;
                padding: 14px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 8px;
                background: var(--SmartThemeBlurTintColor);
                color: var(--SmartThemeBodyColor);
                box-shadow: 0 18px 70px rgba(0, 0, 0, 0.5);
                backdrop-filter: blur(calc(var(--blurStrength, 10) * 1px));
                box-sizing: border-box;
            }
            #${DIALOG_ID} .th-pev-header,
            #${DIALOG_ID} .th-pev-toolbar,
            #${DIALOG_ID} .th-pev-title {
                display: flex;
                align-items: center;
                gap: 8px;
                min-width: 0;
            }
            #${DIALOG_ID} .th-pev-header {
                justify-content: space-between;
            }
            #${DIALOG_ID} .th-pev-title {
                font-weight: 700;
            }
            #${DIALOG_ID} .th-pev-title span,
            #${DIALOG_ID} .th-pev-meta {
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
            }
            #${DIALOG_ID} .th-pev-close {
                width: 32px;
                min-width: 32px;
                height: 32px;
                display: inline-flex;
                align-items: center;
                justify-content: center;
            }
            #${DIALOG_ID} .th-pev-toolbar {
                display: grid;
                grid-template-columns: auto minmax(220px, 1fr);
                align-items: center;
            }
            #${DIALOG_ID} .th-pev-toolbar label {
                font-size: 13px;
                opacity: 0.82;
                white-space: nowrap;
            }
            #${DIALOG_ID} .th-pev-toolbar select {
                width: 100%;
                min-width: 0;
                box-sizing: border-box;
            }
            #${DIALOG_ID} .th-pev-meta {
                grid-column: 1 / -1;
                min-height: 18px;
                font-size: 12px;
                opacity: 0.72;
            }
            #${DIALOG_ID} .th-pev-columns {
                min-height: 0;
                display: grid;
                grid-template-columns: minmax(0, 1fr) minmax(0, 1fr);
                gap: 12px;
            }
            #${DIALOG_ID} .th-pev-panel {
                min-height: 0;
                display: grid;
                grid-template-rows: auto minmax(0, 1fr);
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 8px;
                background: rgba(255, 255, 255, 0.04);
                overflow: hidden;
            }
            #${DIALOG_ID} .th-pev-panel-head {
                display: flex;
                align-items: center;
                justify-content: space-between;
                gap: 8px;
                padding: 9px 10px;
                border-bottom: 1px solid var(--SmartThemeBorderColor);
                background: rgba(0, 0, 0, 0.16);
                font-weight: 700;
                font-size: 13px;
            }
            #${DIALOG_ID} .th-pev-panel-title,
            #${DIALOG_ID} .th-pev-panel-actions {
                display: inline-flex;
                align-items: center;
                gap: 8px;
                min-width: 0;
            }
            #${DIALOG_ID} .th-pev-panel-title span:first-child {
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
            }
            #${DIALOG_ID} .th-pev-delete-disabled {
                min-width: max-content;
                padding: 4px 8px;
                font-size: 12px;
                line-height: 1.2;
                white-space: nowrap;
            }
            #${DIALOG_ID} .th-pev-delete-disabled:disabled {
                cursor: not-allowed;
                opacity: 0.45;
            }
            #${DIALOG_ID} .th-pev-count {
                opacity: 0.7;
                font-weight: 400;
            }
            #${DIALOG_ID} .th-pev-list {
                min-height: 0;
                overflow: auto;
                padding: 8px;
                display: flex;
                flex-direction: column;
                gap: 8px;
            }
            #${DIALOG_ID} .th-pev-entry {
                display: grid;
                gap: 5px;
                padding: 9px 10px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 7px;
                background: rgba(0, 0, 0, 0.16);
            }
            #${DIALOG_ID} .th-pev-entry-name {
                font-weight: 700;
                line-height: 1.25;
                overflow-wrap: anywhere;
            }
            #${DIALOG_ID} .th-pev-entry-id,
            #${DIALOG_ID} .th-pev-entry-preview {
                font-size: 12px;
                line-height: 1.35;
                opacity: 0.72;
                overflow-wrap: anywhere;
            }
            #${DIALOG_ID} .th-pev-entry-preview {
                display: -webkit-box;
                -webkit-line-clamp: 3;
                -webkit-box-orient: vertical;
                overflow: hidden;
                white-space: pre-wrap;
            }
            #${DIALOG_ID} .th-pev-badges {
                display: flex;
                gap: 5px;
                flex-wrap: wrap;
            }
            #${DIALOG_ID} .th-pev-badge {
                padding: 1px 6px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 999px;
                font-size: 11px;
                line-height: 1.45;
                opacity: 0.82;
            }
            #${DIALOG_ID} .th-pev-empty,
            #${DIALOG_ID} .th-pev-error {
                padding: 14px;
                text-align: center;
                font-size: 13px;
                line-height: 1.45;
                opacity: 0.75;
            }
            #${DIALOG_ID} .th-pev-error {
                color: #ffb4ba;
                opacity: 1;
            }
            #${DELETE_DIALOG_ID} {
                position: fixed;
                inset: 0;
                z-index: 10070;
                display: flex;
                align-items: center;
                justify-content: center;
                padding: 18px;
                box-sizing: border-box;
                background: rgba(0, 0, 0, 0.62);
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-modal {
                width: min(620px, 94vw);
                max-height: min(680px, 90vh);
                display: grid;
                grid-template-rows: auto auto minmax(0, 1fr) auto;
                gap: 10px;
                padding: 14px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 8px;
                background: var(--SmartThemeBlurTintColor);
                color: var(--SmartThemeBodyColor);
                box-shadow: 0 18px 70px rgba(0, 0, 0, 0.55);
                box-sizing: border-box;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-head,
            #${DELETE_DIALOG_ID} .th-pev-delete-actions {
                display: flex;
                align-items: center;
                justify-content: space-between;
                gap: 8px;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-title {
                min-width: 0;
                font-weight: 700;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-note {
                font-size: 12px;
                line-height: 1.45;
                opacity: 0.78;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-list {
                min-height: 0;
                overflow: auto;
                display: flex;
                flex-direction: column;
                gap: 7px;
                padding: 8px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 7px;
                background: rgba(0, 0, 0, 0.14);
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-row {
                display: grid;
                grid-template-columns: auto minmax(0, 1fr);
                gap: 8px;
                align-items: start;
                padding: 8px;
                border: 1px solid var(--SmartThemeBorderColor);
                border-radius: 7px;
                background: rgba(255, 255, 255, 0.04);
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-row input {
                margin-top: 2px;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-name {
                font-weight: 700;
                line-height: 1.25;
                overflow-wrap: anywhere;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-id {
                margin-top: 3px;
                font-size: 12px;
                line-height: 1.3;
                opacity: 0.7;
                overflow-wrap: anywhere;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-actions {
                justify-content: flex-end;
                flex-wrap: wrap;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-confirm {
                border-color: rgba(255, 100, 110, 0.85);
                color: #ffdde0;
            }
            #${DELETE_DIALOG_ID} .th-pev-delete-confirm:disabled {
                cursor: not-allowed;
                opacity: 0.45;
            }
            @media (max-width: 760px) {
                #${DIALOG_ID} {
                    align-items: stretch;
                    justify-content: stretch;
                    padding: 0;
                }
                #${DIALOG_ID} .th-pev-modal {
                    width: 100vw;
                    max-height: none;
                    height: 100vh;
                    height: 100dvh;
                    border-radius: 0;
                    border-left: 0;
                    border-right: 0;
                    padding: 12px;
                }
                #${DIALOG_ID} .th-pev-toolbar {
                    grid-template-columns: 1fr;
                }
                #${DIALOG_ID} .th-pev-columns {
                    grid-template-columns: 1fr;
                    overflow: auto;
                }
                #${DIALOG_ID} .th-pev-panel {
                    min-height: 260px;
                }
                #${DELETE_DIALOG_ID} {
                    align-items: stretch;
                    justify-content: stretch;
                    padding: 0;
                }
                #${DELETE_DIALOG_ID} .th-pev-delete-modal {
                    width: 100vw;
                    max-height: none;
                    height: 100vh;
                    height: 100dvh;
                    border-radius: 0;
                    border-left: 0;
                    border-right: 0;
                    padding: 12px;
                }
            }
        `;
        parentDocument.head.appendChild(style);
    }

    function getPresetNames(manager) {
        if (!manager) {
            return [];
        }

        try {
            if (typeof manager.getAllPresets === 'function') {
                return [...new Set(manager.getAllPresets().map(String).map(x => x.trim()).filter(Boolean))];
            }
        } catch (error) {
            console.warn(`[${SCRIPT_NAME}] getAllPresets 失败`, error);
        }

        try {
            const list = manager.getPresetList();
            const names = Array.isArray(list.preset_names) ? list.preset_names : Object.keys(list.preset_names || {});
            return [...new Set(names.map(String).map(x => x.trim()).filter(Boolean))];
        } catch (error) {
            console.warn(`[${SCRIPT_NAME}] getPresetList 失败`, error);
            return [];
        }
    }

    function getPresetByName(manager, presetName) {
        if (!manager || !presetName) {
            return null;
        }

        const list = manager.getPresetList();
        const presets = Array.isArray(list.presets) ? list.presets : [];
        const names = list.preset_names || {};
        let index = -1;

        if (Array.isArray(names)) {
            index = names.indexOf(presetName);
        } else if (Object.prototype.hasOwnProperty.call(names, presetName)) {
            index = Number(names[presetName]);
        }

        if ((index < 0 || Number.isNaN(index)) && typeof manager.findPreset === 'function') {
            const value = manager.findPreset(presetName);
            const numeric = Number(value);
            if (!Number.isNaN(numeric)) {
                index = numeric;
            }
        }

        return index >= 0 ? presets[index] || null : null;
    }

    function managerHasPromptPresets(manager) {
        if (!manager) {
            return false;
        }
        return getPresetNames(manager).some(name => {
            const preset = getPresetByName(manager, name);
            return Array.isArray(preset && preset.prompts) || Array.isArray(preset && preset.prompt_order);
        });
    }

    function getBestManager() {
        const context = getContext();
        const current = context.getPresetManager && context.getPresetManager();
        if (managerHasPromptPresets(current)) {
            return current;
        }

        const openai = context.getPresetManager && context.getPresetManager('openai');
        if (managerHasPromptPresets(openai)) {
            return openai;
        }

        return current || openai || null;
    }

    function getManagerLabel(manager) {
        const apiId = String(manager && manager.apiId || '');
        const labels = {
            openai: 'Chat Completion',
            textgenerationwebui: 'Text Completion',
            kobold: 'Kobold',
            koboldhorde: 'Kobold Horde',
            novel: 'NovelAI',
            context: 'Context Template',
            instruct: 'Instruct Template',
            sysprompt: 'System Prompt',
            reasoning: 'Reasoning Formatting',
        };
        return labels[apiId] || apiId || '未知 API';
    }

    function selectPreset(manager, presetName) {
        if (!manager || !presetName || typeof manager.selectPreset !== 'function') {
            return;
        }

        const value = typeof manager.findPreset === 'function' ? manager.findPreset(presetName) : undefined;
        if (value !== undefined && value !== null) {
            manager.selectPreset(value);
        }
    }

    function getPromptOrder(preset) {
        const lists = Array.isArray(preset && preset.prompt_order) ? preset.prompt_order : [];
        const preferred = lists.find(list => String(list && list.character_id) === DEFAULT_PROMPT_ORDER_ID && Array.isArray(list.order));
        if (preferred) {
            return preferred.order;
        }
        const first = lists.find(list => Array.isArray(list && list.order));
        return first ? first.order : [];
    }

    function makeEntry(prompt, orderEntry, fallbackIdentifier) {
        const identifier = String((prompt && prompt.identifier) || (orderEntry && orderEntry.identifier) || fallbackIdentifier || '');
        return {
            identifier,
            name: String((prompt && prompt.name) || identifier || '未命名条目'),
            role: String((prompt && prompt.role) || ''),
            marker: Boolean(prompt && prompt.marker),
            system: Boolean(prompt && prompt.system_prompt),
            content: String((prompt && prompt.content) || ''),
            inOrder: Boolean(orderEntry),
        };
    }

    function groupPromptEntries(preset) {
        const prompts = Array.isArray(preset && preset.prompts) ? preset.prompts : [];
        const order = getPromptOrder(preset);
        const promptById = new Map();
        const used = new Set();
        const enabled = [];
        const disabled = [];

        prompts.forEach(prompt => {
            if (prompt && prompt.identifier) {
                promptById.set(prompt.identifier, prompt);
            }
        });

        if (order.length) {
            order.forEach((item, index) => {
                if (!item || !item.identifier) {
                    return;
                }
                const prompt = promptById.get(item.identifier) || null;
                const entry = makeEntry(prompt, item, `order-${index}`);
                used.add(entry.identifier);
                (item.enabled === true ? enabled : disabled).push(entry);
            });

            prompts.forEach(prompt => {
                if (!prompt || !prompt.identifier || used.has(prompt.identifier)) {
                    return;
                }
                disabled.push(makeEntry(prompt, null, prompt.identifier));
            });
        } else {
            prompts.forEach(prompt => {
                const entry = makeEntry(prompt, null, prompt && prompt.identifier);
                (prompt && prompt.enabled === true ? enabled : disabled).push(entry);
            });
        }

        return {
            enabled,
            disabled,
            orderCount: order.length,
            totalPrompts: prompts.length,
        };
    }

    function setPanelCount(root, side, count) {
        const element = root.querySelector(`.th-pev-count[data-side="${side}"]`);
        if (element) {
            element.textContent = String(count);
        }
    }

    function renderList(container, entries, emptyText) {
        container.innerHTML = '';
        if (!entries.length) {
            const empty = parentDocument.createElement('div');
            empty.className = 'th-pev-empty';
            empty.textContent = emptyText;
            container.appendChild(empty);
            return;
        }

        entries.forEach(entry => {
            const item = parentDocument.createElement('div');
            item.className = 'th-pev-entry';

            const name = parentDocument.createElement('div');
            name.className = 'th-pev-entry-name';
            name.textContent = entry.name;

            const id = parentDocument.createElement('div');
            id.className = 'th-pev-entry-id';
            id.textContent = entry.identifier;

            const badges = parentDocument.createElement('div');
            badges.className = 'th-pev-badges';
            [entry.role, entry.marker ? 'marker' : '', entry.system ? 'system' : '', entry.inOrder ? '' : '未在顺序列表'].filter(Boolean).forEach(text => {
                const badge = parentDocument.createElement('span');
                badge.className = 'th-pev-badge';
                badge.textContent = text;
                badges.appendChild(badge);
            });

            item.appendChild(name);
            item.appendChild(id);
            if (badges.childElementCount) {
                item.appendChild(badges);
            }
            if (entry.content) {
                const preview = parentDocument.createElement('div');
                preview.className = 'th-pev-entry-preview';
                preview.textContent = entry.content;
                item.appendChild(preview);
            }
            container.appendChild(item);
        });
    }


    function closeDeleteDialog() {
        parentDocument.getElementById(DELETE_DIALOG_ID)?.remove();
    }

    function removePromptsFromPreset(preset, identifiers) {
        const deleteSet = new Set(identifiers);
        const beforePrompts = Array.isArray(preset.prompts) ? preset.prompts.length : 0;
        const beforeRefs = Array.isArray(preset.prompt_order)
            ? preset.prompt_order.reduce((sum, list) => sum + (Array.isArray(list && list.order) ? list.order.length : 0), 0)
            : 0;

        if (Array.isArray(preset.prompts)) {
            preset.prompts = preset.prompts.filter(prompt => !deleteSet.has(prompt && prompt.identifier));
        }
        if (Array.isArray(preset.prompt_order)) {
            preset.prompt_order.forEach(list => {
                if (Array.isArray(list && list.order)) {
                    list.order = list.order.filter(item => !deleteSet.has(item && item.identifier));
                }
            });
        }

        const afterPrompts = Array.isArray(preset.prompts) ? preset.prompts.length : 0;
        const afterRefs = Array.isArray(preset.prompt_order)
            ? preset.prompt_order.reduce((sum, list) => sum + (Array.isArray(list && list.order) ? list.order.length : 0), 0)
            : 0;

        return {
            prompts: beforePrompts - afterPrompts,
            refs: beforeRefs - afterRefs,
        };
    }

    async function deleteDisabledEntries(root, manager, presetName, identifiers) {
        if (!identifiers.length) {
            notify('info', '没有选择要删除的条目。');
            return;
        }
        if (!manager || typeof manager.savePreset !== 'function') {
            throw new Error('当前预设管理器不支持保存。');
        }

        const preset = getPresetByName(manager, presetName);
        if (!preset) {
            throw new Error(`无法读取预设：${presetName}`);
        }

        const removed = removePromptsFromPreset(preset, identifiers);
        if (removed.prompts === 0 && removed.refs === 0) {
            notify('warning', '没有找到可删除的条目引用。');
            return;
        }

        await manager.savePreset(presetName, preset);
        notify('success', `已从“${presetName}”删除 ${identifiers.length} 个关闭条目。`);
        renderPreset(root, manager, presetName);
    }

    function openDeleteDialog(root, manager, presetName, entries) {
        closeDeleteDialog();

        const uniqueEntries = [];
        const seen = new Set();
        entries.forEach(entry => {
            if (!entry || !entry.identifier || seen.has(entry.identifier)) {
                return;
            }
            seen.add(entry.identifier);
            uniqueEntries.push(entry);
        });

        const dialog = parentDocument.createElement('div');
        dialog.id = DELETE_DIALOG_ID;
        dialog.tabIndex = -1;
        dialog.innerHTML = `
            <div class="th-pev-delete-modal" role="dialog" aria-modal="true">
                <div class="th-pev-delete-head">
                    <div class="th-pev-delete-title">删除关闭条目</div>
                    <button type="button" class="menu_button th-pev-delete-close" title="关闭">
                        <i class="fa-solid fa-xmark"></i>
                    </button>
                </div>
                <div class="th-pev-delete-note"></div>
                <div class="th-pev-delete-list"></div>
                <div class="th-pev-delete-actions">
                    <button type="button" class="menu_button th-pev-delete-select-all">全选</button>
                    <button type="button" class="menu_button th-pev-delete-cancel">取消</button>
                    <button type="button" class="menu_button th-pev-delete-confirm" disabled>删除选中</button>
                </div>
            </div>
        `;

        const note = dialog.querySelector('.th-pev-delete-note');
        const list = dialog.querySelector('.th-pev-delete-list');
        const selectAll = dialog.querySelector('.th-pev-delete-select-all');
        const confirm = dialog.querySelector('.th-pev-delete-confirm');
        const closeButtons = dialog.querySelectorAll('.th-pev-delete-close, .th-pev-delete-cancel');

        note.textContent = `预设“${presetName}”共有 ${uniqueEntries.length} 个关闭条目。删除会从该预设 JSON 的 prompts 和 prompt_order 中彻底移除。`;

        uniqueEntries.forEach(entry => {
            const label = parentDocument.createElement('label');
            label.className = 'th-pev-delete-row';

            const checkbox = parentDocument.createElement('input');
            checkbox.type = 'checkbox';
            checkbox.value = entry.identifier;

            const text = parentDocument.createElement('div');
            const name = parentDocument.createElement('div');
            name.className = 'th-pev-delete-name';
            name.textContent = entry.name;
            const id = parentDocument.createElement('div');
            id.className = 'th-pev-delete-id';
            id.textContent = entry.identifier;
            text.appendChild(name);
            text.appendChild(id);

            label.appendChild(checkbox);
            label.appendChild(text);
            list.appendChild(label);
        });

        const getChecked = () => Array.from(list.querySelectorAll('input[type="checkbox"]:checked')).map(input => input.value);
        const updateConfirm = () => {
            const count = getChecked().length;
            confirm.disabled = count === 0;
            confirm.textContent = count ? `删除选中（${count}）` : '删除选中';
        };

        list.addEventListener('change', updateConfirm);
        selectAll.addEventListener('click', () => {
            const boxes = Array.from(list.querySelectorAll('input[type="checkbox"]'));
            const shouldCheck = boxes.some(box => !box.checked);
            boxes.forEach(box => { box.checked = shouldCheck; });
            selectAll.textContent = shouldCheck ? '取消全选' : '全选';
            updateConfirm();
        });
        confirm.addEventListener('click', async () => {
            const identifiers = getChecked();
            if (!identifiers.length) {
                updateConfirm();
                return;
            }
            confirm.disabled = true;
            confirm.textContent = '正在删除...';
            try {
                await deleteDisabledEntries(root, manager, presetName, identifiers);
                closeDeleteDialog();
            } catch (error) {
                console.error(`[${SCRIPT_NAME}] 删除关闭条目失败`, error);
                notify('error', `删除失败：${error && error.message || error}`);
                updateConfirm();
            }
        });
        closeButtons.forEach(button => button.addEventListener('click', closeDeleteDialog));
        dialog.addEventListener('mousedown', event => {
            if (event.target === dialog) {
                closeDeleteDialog();
            }
        });
        dialog.addEventListener('keydown', event => {
            if (event.key === 'Escape') {
                closeDeleteDialog();
            }
        });

        parentDocument.documentElement.appendChild(dialog);
        dialog.querySelector('.th-pev-delete-close').focus();
    }

    function renderPreset(root, manager, presetName) {
        const meta = root.querySelector('.th-pev-meta');
        const enabledList = root.querySelector('.th-pev-list[data-side="enabled"]');
        const disabledList = root.querySelector('.th-pev-list[data-side="disabled"]');
        const deleteDisabledButton = root.querySelector('.th-pev-delete-disabled');
        const preset = getPresetByName(manager, presetName);

        if (!preset) {
            meta.textContent = `无法读取预设：${presetName || '未选择'}`;
            enabledList.innerHTML = '<div class="th-pev-error">没有读取到预设内容。</div>';
            disabledList.innerHTML = '<div class="th-pev-error">没有读取到预设内容。</div>';
            setPanelCount(root, 'enabled', 0);
            setPanelCount(root, 'disabled', 0);
            if (deleteDisabledButton) {
                deleteDisabledButton.disabled = true;
                deleteDisabledButton.onclick = null;
            }
            return;
        }

        if (!Array.isArray(preset.prompts) && !Array.isArray(preset.prompt_order)) {
            meta.textContent = `${getManagerLabel(manager)} / ${presetName} 不包含 prompts 或 prompt_order。`;
            enabledList.innerHTML = '<div class="th-pev-empty">当前预设类型没有可展示的 prompt 条目。</div>';
            disabledList.innerHTML = '<div class="th-pev-empty">当前预设类型没有可展示的 prompt 条目。</div>';
            setPanelCount(root, 'enabled', 0);
            setPanelCount(root, 'disabled', 0);
            if (deleteDisabledButton) {
                deleteDisabledButton.disabled = true;
                deleteDisabledButton.onclick = null;
            }
            return;
        }

        const groups = groupPromptEntries(preset);
        meta.textContent = `${getManagerLabel(manager)} / ${presetName} · prompts: ${groups.totalPrompts} · order: ${groups.orderCount || '未找到'}`;
        setPanelCount(root, 'enabled', groups.enabled.length);
        setPanelCount(root, 'disabled', groups.disabled.length);
        renderList(enabledList, groups.enabled, '没有开启的条目。');
        renderList(disabledList, groups.disabled, '没有关闭的条目。');
        if (deleteDisabledButton) {
            deleteDisabledButton.disabled = groups.disabled.length === 0;
            deleteDisabledButton.onclick = groups.disabled.length
                ? () => openDeleteDialog(root, manager, presetName, groups.disabled)
                : null;
        }
    }

    function closeDialog() {
        closeDeleteDialog();
        parentDocument.getElementById(DIALOG_ID)?.remove();
    }

    function openDialog() {
        installStyle();
        closeDialog();

        const manager = getBestManager();
        const names = getPresetNames(manager);
        const selectedName = manager && typeof manager.getSelectedPresetName === 'function' ? manager.getSelectedPresetName() : names[0];
        const initialName = names.includes(selectedName) ? selectedName : names[0];

        const dialog = parentDocument.createElement('div');
        dialog.id = DIALOG_ID;
        dialog.tabIndex = -1;
        dialog.innerHTML = `
            <div class="th-pev-modal" role="dialog" aria-modal="true">
                <div class="th-pev-header">
                    <div class="th-pev-title">
                        <i class="fa-solid fa-list-check"></i>
                        <span>${SCRIPT_NAME}</span>
                    </div>
                    <button type="button" class="menu_button th-pev-close" title="关闭">
                        <i class="fa-solid fa-xmark"></i>
                    </button>
                </div>
                <div class="th-pev-toolbar">
                    <label for="${SCRIPT_ID}-preset-select">预设</label>
                    <select id="${SCRIPT_ID}-preset-select"></select>
                    <div class="th-pev-meta"></div>
                </div>
                <div class="th-pev-columns">
                    <section class="th-pev-panel">
                        <div class="th-pev-panel-head">
                            <span class="th-pev-panel-title">
                                <span>已开启条目</span>
                                <span class="th-pev-count" data-side="enabled">0</span>
                            </span>
                        </div>
                        <div class="th-pev-list" data-side="enabled"></div>
                    </section>
                    <section class="th-pev-panel">
                        <div class="th-pev-panel-head">
                            <span class="th-pev-panel-title">
                                <span>已关闭条目</span>
                                <span class="th-pev-count" data-side="disabled">0</span>
                            </span>
                            <span class="th-pev-panel-actions">
                                <button type="button" class="menu_button th-pev-delete-disabled" disabled>
                                    <i class="fa-solid fa-trash-can"></i>
                                    删除条目
                                </button>
                            </span>
                        </div>
                        <div class="th-pev-list" data-side="disabled"></div>
                    </section>
                </div>
            </div>
        `;

        const select = dialog.querySelector(`#${SCRIPT_ID}-preset-select`);
        const meta = dialog.querySelector('.th-pev-meta');
        names.forEach(name => {
            const option = parentDocument.createElement('option');
            option.value = name;
            option.textContent = name;
            option.selected = name === initialName;
            select.appendChild(option);
        });

        if (!manager || !names.length) {
            meta.textContent = '没有找到可读取的预设管理器。';
            select.disabled = true;
        } else {
            renderPreset(dialog, manager, initialName);
        }

        select.addEventListener('change', () => {
            const name = select.value;
            selectPreset(manager, name);
            renderPreset(dialog, manager, name);
        });

        dialog.querySelector('.th-pev-close').addEventListener('click', closeDialog);
        dialog.addEventListener('mousedown', event => {
            if (event.target === dialog) {
                closeDialog();
            }
        });
        dialog.addEventListener('keydown', event => {
            if (event.key === 'Escape') {
                closeDialog();
            }
        });

        parentDocument.documentElement.appendChild(dialog);
        dialog.querySelector('.th-pev-close').focus();
    }

    async function installMenuItem() {
        const menu = await waitForElement('#extensionsMenu');
        parentDocument.getElementById(MENU_ID)?.remove();

        const container = parentDocument.createElement('div');
        container.id = MENU_ID;
        container.className = 'extension_container';
        container.innerHTML = `
            <div class="list-group-item flex-container flexGap5 interactable" tabindex="0" role="listitem" title="查看 Chat Completion 预设里的开启和关闭条目">
                <div class="fa-fw fa-solid fa-list-check extensionsMenuExtensionButton"></div>
                <span>预设条目查看器</span>
            </div>
        `;

        const item = container.querySelector('.list-group-item');
        const open = () => {
            menu.style.display = 'none';
            openDialog();
        };
        item.addEventListener('click', open);
        item.addEventListener('keydown', event => {
            if (event.key === 'Enter' || event.key === ' ') {
                event.preventDefault();
                open();
            }
        });

        menu.appendChild(container);

        const button = parentDocument.querySelector('#extensionsMenuButton');
        if (button) {
            button.style.display = 'flex';
        }
    }

    function cleanup() {
        parentDocument.getElementById(MENU_ID)?.remove();
        parentDocument.getElementById(STYLE_ID)?.remove();
        closeDeleteDialog();
        closeDialog();
    }

    try {
        installMenuItem().catch(error => {
            console.error(`[${SCRIPT_NAME}] 菜单入口安装失败`, error);
            notify('error', `菜单入口安装失败：${error && error.message || error}`);
        });
        window.addEventListener('pagehide', cleanup);
        console.info(`[${SCRIPT_NAME}] 已启动`);
    } catch (error) {
        console.error(`[${SCRIPT_NAME}] 启动失败`, error);
        notify('error', `启动失败：${error && error.message || error}`);
    }
})();
