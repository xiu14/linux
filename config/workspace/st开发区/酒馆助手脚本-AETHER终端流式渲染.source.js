(function () {
    'use strict';

    const parentWindow = window.parent;
    const parentDoc = parentWindow.document;
    const GLOBAL_KEY = '__aetherTerminalStreamRenderer';
    const STYLE_ID = 'aether-terminal-stream-renderer-style';
    const TERMINAL_CLASS = 'aether-stream-terminal';
    const VERSION = '0.1.0';

    if (parentWindow[GLOBAL_KEY]?.destroy) {
        parentWindow[GLOBAL_KEY].destroy();
    }

    const state = {
        observer: null,
        scheduled: false,
        activeStreamMessageId: null,
        activeStreamText: '',
        listeners: [],
    };

    function getContext() {
        const getter = parentWindow.SillyTavern?.getContext;
        return typeof getter === 'function' ? getter() : null;
    }

    function addListener(eventSource, event, handler) {
        if (!eventSource || !event || typeof handler !== 'function') return;
        eventSource.on(event, handler);
        state.listeners.push(() => eventSource.removeListener?.(event, handler));
    }

    function escapeHtml(value) {
        return String(value == null ? '' : value)
            .replace(/&/g, '&amp;')
            .replace(/</g, '&lt;')
            .replace(/>/g, '&gt;')
            .replace(/"/g, '&quot;')
            .replace(/'/g, '&#39;');
    }

    function escapeRegExp(value) {
        return String(value == null ? '' : value).replace(/[.*+?^${}()|[\]\\]/g, '\\$&');
    }

    function decodeEscapedNewlines(value) {
        return String(value == null ? '' : value).replace(/\\n/g, '\n');
    }

    function textToHtml(value) {
        return escapeHtml(decodeEscapedNewlines(value)).replace(/\n/g, '<br>');
    }

    function safeAttr(value) {
        return escapeHtml(String(value == null ? '' : value).replace(/[\r\n]/g, ' '));
    }

    function injectStyles() {
        const css = `
            .${TERMINAL_CLASS} {
                --aether-bg-darker: #1a1a1a;
                --aether-bg-dark: #2c2c2c;
                --aether-bg-medium: #3d3d3d;
                --aether-border: #444444;
                --aether-accent: #37d7ff;
                --aether-text: #e0e0e0;
                --aether-muted: #888888;
                display: flex;
                justify-content: center;
                align-items: center;
                width: 100%;
                margin: 8px auto;
                color: var(--aether-text);
                font-family: "Share Tech Mono", "Noto Sans SC", "Microsoft YaHei", monospace;
            }

            .${TERMINAL_CLASS} * {
                box-sizing: border-box;
            }

            .${TERMINAL_CLASS} .aether-device {
                position: relative;
                display: flex;
                flex-direction: column;
                flex-shrink: 1;
                width: 360px;
                max-width: 100%;
                height: 640px;
                overflow: hidden;
                padding: 4px;
                border: 1px solid #111;
                border-radius: 8px;
                background-color: var(--aether-bg-darker);
                box-shadow: 0 4px 20px rgba(0, 0, 0, 0.5);
            }

            .${TERMINAL_CLASS} .aether-screen-wrap {
                position: absolute;
                inset: 0;
                display: flex;
                flex-direction: column;
                overflow: hidden;
                width: 100%;
                height: 100%;
                border-radius: 4px;
            }

            .${TERMINAL_CLASS} .aether-topbar {
                z-index: 10;
                display: flex;
                align-items: center;
                justify-content: space-between;
                flex-shrink: 0;
                height: 48px;
                padding: 0 12px;
                border-bottom: 1px solid var(--aether-border);
                background: var(--aether-bg-darker);
            }

            .aether-title {
                min-width: 0;
            }

            .aether-title-main {
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
                color: var(--aether-accent);
                font-size: 16px;
                font-weight: 400;
                letter-spacing: 1px;
            }

            .aether-title-sub {
                margin-top: 2px;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
                color: var(--aether-muted);
                font-size: 12px;
            }

            .aether-status {
                display: inline-flex;
                align-items: center;
                gap: 6px;
                padding: 5px 8px;
                border: 1px solid var(--aether-border);
                border-radius: 2px;
                color: var(--aether-muted);
                font-size: 11px;
                background: rgba(0, 0, 0, 0.18);
            }

            .aether-status::before {
                content: "";
                width: 6px;
                height: 6px;
                border-radius: 50%;
                background: var(--aether-accent);
                box-shadow: 0 0 10px var(--aether-accent);
            }

            .${TERMINAL_CLASS} .aether-participants {
                display: none;
                flex-wrap: wrap;
                gap: 15px;
                min-height: 88px;
                padding: 15px;
                border-bottom: 1px solid var(--aether-border);
                background: var(--aether-bg-darker);
            }

            .${TERMINAL_CLASS} .aether-participants.has-participants {
                display: flex;
            }

            .${TERMINAL_CLASS} .aether-participant-card {
                display: flex;
                flex-direction: column;
                align-items: center;
                gap: 8px;
            }

            .${TERMINAL_CLASS} .aether-participant-card .avatar {
                border: 2px solid var(--aether-border);
            }

            .${TERMINAL_CLASS} .aether-participant-card .name {
                color: var(--aether-muted);
                font-size: 12px;
            }

            .${TERMINAL_CLASS} .aether-screen {
                flex: 1;
                overflow-y: auto;
                padding: 18px 12px;
                background: transparent;
                scrollbar-width: thin;
                scrollbar-color: var(--aether-muted) var(--aether-bg-dark);
            }

            .${TERMINAL_CLASS} .aether-screen::-webkit-scrollbar {
                width: 8px;
            }

            .${TERMINAL_CLASS} .aether-screen::-webkit-scrollbar-track {
                background: var(--aether-bg-dark);
            }

            .${TERMINAL_CLASS} .aether-screen::-webkit-scrollbar-thumb {
                border-radius: 4px;
                background-color: var(--aether-muted);
            }

            .aether-empty {
                margin: auto;
                color: var(--aether-muted);
                font-size: 13px;
                text-align: center;
            }

            .${TERMINAL_CLASS} .message {
                display: flex;
                align-items: flex-start;
                margin-bottom: 20px;
            }

            .${TERMINAL_CLASS} .message.sent {
                flex-direction: row-reverse;
            }

            .${TERMINAL_CLASS} .avatar {
                flex: 0 0 30px;
                width: 40px;
                height: 40px;
                overflow: hidden;
                border: 1px solid var(--aether-border);
                border-radius: 4px;
                background-color: var(--aether-bg-dark);
                background-size: cover !important;
                background-position: center !important;
                background-repeat: no-repeat !important;
                object-fit: cover;
            }

            .${TERMINAL_CLASS} .avatar-fallback {
                display: flex;
                align-items: center;
                justify-content: center;
                color: var(--aether-accent);
                font-size: 16px;
            }

            .${TERMINAL_CLASS} .message-wrapper {
                position: relative;
                display: flex;
                flex-direction: column;
                min-width: 0;
                max-width: calc(100% - 85px);
                margin: 0 10px;
            }

            .${TERMINAL_CLASS} .message.sent .message-wrapper {
                align-items: flex-end;
            }

            .${TERMINAL_CLASS} .sender-name {
                padding: 0 2px 4px;
                color: var(--aether-accent);
                font-size: 13px;
                font-weight: bold;
            }

            .${TERMINAL_CLASS} .message-content {
                position: relative;
                width: fit-content;
                overflow-wrap: anywhere;
                padding: 10px 12px;
                border-radius: 2px;
                background: var(--aether-bg-dark);
                color: #e0e0e0;
                cursor: pointer;
                font-size: 14px;
                line-height: 1.5;
            }

            .${TERMINAL_CLASS} .message.received .message-content {
                border-left: 2px solid var(--aether-accent);
            }

            .${TERMINAL_CLASS} .message.sent .message-content {
                border-right: 2px solid var(--aether-accent);
            }

            .${TERMINAL_CLASS} .message-time {
                margin-top: 4px;
                color: var(--aether-muted);
                font-size: 11px;
            }

            .${TERMINAL_CLASS} .system-alert {
                max-width: 92%;
                margin: 15px auto;
                padding: 5px 15px;
                color: var(--aether-muted);
                font-size: 12px;
                font-style: normal;
                text-align: center;
            }

            .${TERMINAL_CLASS} .system-alert::before,
            .${TERMINAL_CLASS} .system-alert::after {
                content: '// ';
            }

            .${TERMINAL_CLASS} .voice-message {
                display: flex;
                align-items: center;
                gap: 5px;
            }

            .${TERMINAL_CLASS} .file-message-card {
                display: flex;
                align-items: center;
                gap: 12px;
                width: 230px;
                padding: 12px;
                border-radius: 2px;
                background-color: var(--aether-bg-darker);
                cursor: pointer;
                transition: background-color 0.2s;
            }

            .${TERMINAL_CLASS} .message.received .file-message-card {
                border-left: 2px solid var(--aether-accent);
            }

            .${TERMINAL_CLASS} .message.sent .file-message-card {
                border-right: 2px solid var(--aether-accent);
            }

            .${TERMINAL_CLASS} .file-message-card:hover {
                background-color: var(--aether-bg-medium);
            }

            .${TERMINAL_CLASS} .file-icon {
                width: 40px;
                height: 40px;
                flex-shrink: 0;
                color: var(--aether-accent);
            }

            .${TERMINAL_CLASS} .file-info {
                flex-grow: 1;
                overflow: hidden;
                text-align: left;
            }

            .${TERMINAL_CLASS} .file-title {
                overflow: hidden;
                margin-bottom: 4px;
                color: var(--aether-text);
                font-size: 16px;
                text-overflow: ellipsis;
                white-space: nowrap;
            }

            .${TERMINAL_CLASS} .file-subtitle {
                color: var(--aether-muted);
                font-size: 13px;
            }

            .${TERMINAL_CLASS} .media-card {
                display: flex;
                align-items: center;
                gap: 8px;
                width: fit-content;
                max-width: 230px;
                padding: 10px;
                border-radius: 2px;
                background: var(--aether-bg-darker);
                color: var(--aether-text);
                font-size: 14px;
            }

            .${TERMINAL_CLASS} .message.received .media-card {
                border-left: 2px solid var(--aether-accent);
            }

            .${TERMINAL_CLASS} .message.sent .media-card {
                border-right: 2px solid var(--aether-accent);
            }

            .${TERMINAL_CLASS} .media-card svg {
                width: 24px;
                height: 24px;
                flex-shrink: 0;
                color: var(--aether-accent);
            }

            .${TERMINAL_CLASS} .location-container {
                width: 220px;
                overflow: hidden;
                border: 1px solid var(--aether-border);
                border-radius: 2px;
                background-color: var(--aether-bg-darker);
                cursor: pointer;
                text-align: left;
            }

            .${TERMINAL_CLASS} .location-map-placeholder {
                height: 105px;
                border-bottom: 1px solid var(--aether-border);
                background: url('https://files.catbox.moe/lyibxz.png') center center / cover no-repeat;
                opacity: 0.5;
            }

            .${TERMINAL_CLASS} .location-info-wrapper {
                padding: 10px 12px;
            }

            .${TERMINAL_CLASS} .location-grid {
                margin-bottom: 4px;
                color: var(--aether-text);
                font-size: 16px;
            }

            .${TERMINAL_CLASS} .location-notes {
                color: var(--aether-muted);
                font-size: 13px;
            }

            .aether-composer {
                display: flex;
                align-items: center;
                flex-shrink: 0;
                gap: 8px;
                min-height: 52px;
                display: grid;
                grid-template-columns: auto 1fr auto;
                padding: 8px 12px;
                border-top: 1px solid var(--aether-border);
                background: var(--aether-bg-darker);
            }

            .aether-input {
                min-width: 0;
                height: 36px;
                border: 1px solid var(--aether-border);
                border-radius: 2px;
                padding: 8px 12px;
                outline: none;
                background: var(--aether-bg-dark);
                color: var(--aether-text);
                font: inherit;
                font-size: 16px;
                line-height: 1.5;
            }

            .aether-input:focus {
                border-color: var(--aether-accent);
            }

            .aether-send {
                display: flex;
                align-items: center;
                justify-content: center;
                width: 90px;
                height: 36px;
                margin-left: 4px;
                border: 1px solid var(--aether-accent);
                border-radius: 2px;
                padding: 0;
                cursor: pointer;
                color: var(--aether-accent);
                background: transparent;
                font-size: 15px;
                letter-spacing: 1px;
            }

            .aether-send:hover {
                filter: brightness(1.08);
            }

            .aether-action-btn {
                display: flex;
                align-items: center;
                justify-content: center;
                flex-shrink: 0;
                width: 36px;
                height: 36px;
                border: none;
                background: transparent;
                cursor: pointer;
            }

            .aether-action-btn svg {
                width: 28px;
                height: 28px;
                color: var(--aether-muted);
            }

            @media (max-width: 560px) {
                .${TERMINAL_CLASS} {
                    width: 100%;
                }

                .aether-device {
                    height: min(640px, 78vh);
                }
            }
        `;

        let style = parentDoc.getElementById(STYLE_ID);
        if (!style) {
            style = parentDoc.createElement('style');
            style.id = STYLE_ID;
            parentDoc.head.appendChild(style);
        }
        style.textContent = css;
    }

    function parseAetherBlock(raw) {
        if (!raw || !raw.includes('[AETHER-UI-CHAT::')) return null;

        const startMatch = raw.match(/\[AETHER-UI-CHAT::([^\]|]+?)(?:\|participants=([^\]]+?))?\]/);
        if (!startMatch || startMatch.index == null) return null;

        const contact = startMatch[1].trim();
        const participants = (startMatch[2] || '').trim();
        const contentStart = startMatch.index + startMatch[0].length;
        const closeRegex = new RegExp(`\\[/AETHER-UI-CHAT::${escapeRegExp(contact)}(?:\\|participants=[^\\]]+)?\\]`);
        const closeMatch = closeRegex.exec(raw.slice(contentStart));
        const contentEnd = closeMatch ? contentStart + closeMatch.index : raw.length;
        const content = raw.slice(contentStart, contentEnd);

        return {
            contact,
            participants,
            complete: Boolean(closeMatch),
            items: parseItems(content),
        };
    }

    function collectMatches(content, regex, mapper) {
        const items = [];
        let match;
        regex.lastIndex = 0;
        while ((match = regex.exec(content)) !== null) {
            items.push({ index: match.index, end: regex.lastIndex, ...mapper(match) });
        }
        return items;
    }

    function parseItems(content) {
        const specs = [
            [
                /<div class=["']system-alert["']>([\s\S]+?)<\/div>/g,
                m => ({ kind: 'system', body: stripTags(m[1]) }),
            ],
            [
                /\[消息\s*-\s*系统提示\]([\s\S]+?)\[\/消息\s*-\s*系统提示\]/g,
                m => ({ kind: 'system', body: m[1] }),
            ],
            [
                /\[我方文本消息\|([^|]*?)\|([\s\S]+?)\|([^\]]*?)\]/g,
                m => ({ kind: 'text', side: 'sent', sender: '你', avatar: m[1], body: m[2], time: m[3] }),
            ],
            [
                /\[(?!我方)([^\]\s|]+?)文本消息\|([^|]*?)\|([\s\S]+?)\|([^\]]+?)\]/g,
                m => ({ kind: 'text', side: 'received', sender: m[1], avatar: m[2], body: m[3], time: m[4] }),
            ],
            [
                /\[我方语音消息\|([^|]*?)\|([\s\S]+?)\|([^\]]*?)\]/g,
                m => ({ kind: 'voice', side: 'sent', sender: '你', avatar: m[1], body: m[2], time: m[3] }),
            ],
            [
                /\[(?!我方)([^|]+?)语音消息\|([^|]+?)\|([\s\S]+?)\|([^\]]+?)\]/g,
                m => ({ kind: 'voice', side: 'received', sender: m[1], avatar: m[2], body: m[3], time: m[4] }),
            ],
            [
                /\[我方文件消息\|([^|]*?)\|([^|]*?)\|([\s\S]+?)\|([^\]]*?)\]/g,
                m => ({ kind: 'file', side: 'sent', sender: '你', avatar: m[1], title: m[2], body: m[3], time: m[4] }),
            ],
            [
                /\[(?!我方)([^|]+?)文件消息\|([^|]+?)\|([^|]+?)\|([\s\S]+?)\|([^\]]+?)\]/g,
                m => ({ kind: 'file', side: 'received', sender: m[1], avatar: m[2], title: m[3], body: m[4], time: m[5] }),
            ],
            [
                /\[我方图片消息\|([^|]*?)\|([\s\S]+?)\|([^\]]*?)\]/g,
                m => ({ kind: 'image', side: 'sent', sender: '你', avatar: m[1], body: m[2], time: m[3] }),
            ],
            [
                /\[(?!我方)([^|]+?)图片消息\|([^|]+?)\|([\s\S]+?)\|([^\]]+?)\]/g,
                m => ({ kind: 'image', side: 'received', sender: m[1], avatar: m[2], body: m[3], time: m[4] }),
            ],
            [
                /\[我方位置消息\|([^|]*?)\|([^|]*?)\|([\s\S]+?)\|([^\]]*?)\]/g,
                m => ({ kind: 'location', side: 'sent', sender: '你', avatar: m[1], title: m[2], body: m[3], time: m[4] }),
            ],
            [
                /\[(?!我方)([^|]+?)位置消息\|([^|]+?)\|([^|]+?)\|([^|]+?)\|([^\]]+?)\]/g,
                m => ({ kind: 'location', side: 'received', sender: m[1], avatar: m[2], title: m[3], body: m[4], time: m[5] }),
            ],
        ];

        const items = specs.flatMap(([regex, mapper]) => collectMatches(content, regex, mapper));
        return items
            .sort((a, b) => a.index - b.index || a.end - b.end)
            .filter((item, index, arr) => !arr.some((other, otherIndex) => otherIndex < index && item.index >= other.index && item.end <= other.end));
    }

    function stripTags(value) {
        const div = parentDoc.createElement('div');
        div.innerHTML = String(value == null ? '' : value);
        return div.textContent || '';
    }

    function resolveAvatarUrl(avatar) {
        const value = String(avatar || '').trim();
        if (!value) return '';
        if (/^https?:\/\//i.test(value) || value.startsWith('data:') || value.startsWith('/')) {
            return value;
        }
        if (/^[\w.-]+\.(?:png|jpe?g|webp|gif)$/i.test(value)) {
            return `https://files.catbox.moe/${value}`;
        }
        return '';
    }

    function renderAvatarElement(item) {
        const avatar = String(item.avatar || '').trim();
        const initial = escapeHtml((item.sender || '?').trim().slice(0, 1) || '?');
        const url = resolveAvatarUrl(avatar);
        if (url) {
            return `<img class="avatar" src="${safeAttr(url)}" alt="${safeAttr(item.sender || '')} 的头像" data-fallback="${safeAttr(initial)}" referrerpolicy="no-referrer">`;
        }
        return `<div class="avatar avatar-fallback">${initial}</div>`;
    }

    function renderItem(item) {
        if (item.kind === 'system') {
            return `<div class="system-alert">${textToHtml(item.body)}</div>`;
        }

        const side = item.side === 'sent' ? 'sent' : 'received';
        const sender = side === 'sent' ? '你' : item.sender;
        const body = renderMessageBody(item);
        return `
            <div class="message ${side}" data-sender-name="${safeAttr(sender || '')}">
                ${side === 'sent' ? '<div class="avatar user_avatar user-avatar"></div>' : renderAvatarElement({ ...item, sender })}
                <div class="message-wrapper">
                    ${side === 'received' ? `<div class="sender-name">${escapeHtml(sender || '')}</div>` : ''}
                    ${body}
                    ${item.time ? `<div class="message-time">${escapeHtml(item.time)}</div>` : ''}
                </div>
            </div>
        `;
    }

    function renderMessageBody(item) {
        if (item.kind === 'file') {
            return `
                <div class="file-message-card" data-title="${safeAttr(item.title || '未命名文件')}" data-content="${safeAttr(decodeEscapedNewlines(item.body))}" data-sender="${safeAttr(item.sender || '')}">
                    <svg class="file-icon" viewBox="0 0 24 24"><path fill="currentColor" d="M14 2H6a2 2 0 00-2 2v16a2 2 0 002 2h12a2 2 0 002-2V8l-6-6zM13 9V3.5L18.5 9H13z"></path></svg>
                    <div class="file-info">
                        <div class="file-title">${escapeHtml(item.title || '未命名文件')}</div>
                        <div class="file-subtitle">待查阅报告</div>
                    </div>
                </div>
            `;
        }
        if (item.kind === 'image') {
            return `
                <div class="media-card">
                    <svg viewBox="0 0 24 24"><path fill="currentColor" d="M21 19V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2zM8.5 13.5l2.5 3.01L14.5 12l4.5 6H5l8.5-13.5z"></path></svg>
                    <span>${textToHtml(item.body)}</span>
                </div>
            `;
        }
        if (item.kind === 'voice') {
            return `
                <div class="message-content voice-message" data-voice-text="${safeAttr(decodeEscapedNewlines(item.body))}">
                    <svg viewBox="0 0 24 24" style="width:24px;height:24px;${item.side === 'sent' ? 'transform:scaleX(-1);' : ''}"><path fill="currentColor" d="M3 9v6h4l5 5V4L7 9H3z"></path></svg>
                    <span>语音消息</span>
                </div>
            `;
        }
        if (item.kind === 'location') {
            return `
                <div class="location-container">
                    <div class="location-map-placeholder"></div>
                    <div class="location-info-wrapper">
                        <div class="location-grid">${escapeHtml(item.title || '坐标位置')}</div>
                        <div class="location-notes">${textToHtml(item.body)}</div>
                    </div>
                </div>
            `;
        }
        return `<div class="message-content">${textToHtml(item.body)}</div>`;
    }

    function renderTerminal(parsed, previousInputValue) {
        const status = parsed.complete ? 'LINK STABLE' : 'STREAMING';
        const messagesHtml = parsed.items.length
            ? parsed.items.map(renderItem).join('')
            : '<div class="aether-empty">正在接收终端数据...</div>';
        const participants = parsed.participants
            ? ['{{user}}', ...parsed.participants.split(',').map(item => item.trim()).filter(Boolean)]
            : [];
        const participantsHtml = participants.map(name => `
            <div class="aether-participant-card">
                <div class="avatar user_avatar user-avatar"></div>
                <div class="name">${escapeHtml(name)}</div>
            </div>
        `).join('');

        return `
            <div class="${TERMINAL_CLASS}" data-contact="${safeAttr(parsed.contact)}">
                <div class="aether-device">
                    <div class="aether-screen-wrap">
                        <div class="aether-topbar">
                            <div class="aether-title">
                                <div class="aether-title-main">${escapeHtml(parsed.contact)}</div>
                            </div>
                            <div class="aether-status">${status}</div>
                        </div>
                        <div class="aether-participants ${participants.length ? 'has-participants' : ''}">${participantsHtml}</div>
                        <div class="aether-screen">${messagesHtml}</div>
                        <div class="aether-composer">
                            <button class="aether-action-btn" type="button" title="语音">
                                <svg viewBox="0 0 24 24"><path fill="currentColor" d="M12 14q1.25 0 2.125-.875T15 11V5q0-1.25-.875-2.125T12 2T9.875 2.875T9 5v6q0 1.25.875 2.125T12 14Zm-1 7v-3.075q-2.6-.35-4.3-2.325T5 11H7q0 2.075 1.463 3.538T12 16q2.075 0 3.538-1.463T17 11h2q0 2.2-1.7 4.175T13 17.925V21h-2Z"></path></svg>
                            </button>
                            <input class="aether-input" type="text" value="${safeAttr(previousInputValue || '')}" placeholder="输入指令...">
                            <button class="aether-send" type="button" title="发送">发送</button>
                        </div>
                    </div>
                </div>
            </div>
        `;
    }

    function getMessageIdFromElement(mesText) {
        const mes = mesText.closest('.mes');
        const id = Number(mes?.getAttribute('mesid'));
        return Number.isFinite(id) ? id : null;
    }

    function getLastVisibleMessageId() {
        const messages = Array.from(parentDoc.querySelectorAll('#chat .mes[mesid]'));
        const last = messages[messages.length - 1];
        const id = Number(last?.getAttribute('mesid'));
        return Number.isFinite(id) ? id : null;
    }

    function getRawText(mesText) {
        const id = getMessageIdFromElement(mesText);
        const visibleText = mesText.textContent || '';

        if (id != null && id === state.activeStreamMessageId && state.activeStreamText) {
            return state.activeStreamText;
        }

        if (visibleText.includes('[AETHER-UI-CHAT::')) {
            return visibleText;
        }

        const context = getContext();
        const chatText = id != null ? context?.chat?.[id]?.mes : null;
        if (typeof chatText === 'string' && chatText.includes('[AETHER-UI-CHAT::')) {
            return chatText;
        }

        if (mesText.dataset.aetherRaw) {
            return mesText.dataset.aetherRaw;
        }

        return visibleText;
    }

    function bindTerminalEvents(mesText, parsed) {
        const terminal = mesText.querySelector(`.${TERMINAL_CLASS}`);
        if (!terminal) return;

        bindAvatarFallbacks(terminal);

        const screen = terminal.querySelector('.aether-screen');
        if (screen) {
            screen.scrollTop = screen.scrollHeight;
        }

        const input = terminal.querySelector('.aether-input');
        const send = terminal.querySelector('.aether-send');
        const submit = () => {
            const text = input?.value.trim();
            if (!text) return;
            sendTerminalReply(parsed.contact, text);
        };

        send?.addEventListener('click', submit);
        input?.addEventListener('keydown', event => {
            if (event.key === 'Enter' && !event.shiftKey) {
                event.preventDefault();
                submit();
            }
        });
    }

    function bindAvatarFallbacks(root) {
        root.querySelectorAll('img.avatar').forEach(img => {
            if (img.dataset.aetherFallbackBound === '1') return;
            img.dataset.aetherFallbackBound = '1';
            img.addEventListener('error', () => {
                const fallback = parentDoc.createElement('div');
                fallback.className = 'avatar avatar-fallback';
                fallback.textContent = img.dataset.fallback || '?';
                fallback.title = img.getAttribute('src') || '';
                img.replaceWith(fallback);
            }, { once: true });
        });
    }

    function isGenerating() {
        const sendButton = parentDoc.querySelector('#send_but');
        const stopButton = parentDoc.querySelector('#mes_stop');
        const sendHidden = sendButton?.classList.contains('displayNone');
        const stopVisible = Boolean(stopButton && stopButton.offsetParent !== null && !stopButton.classList.contains('displayNone'));
        return Boolean(sendHidden || stopVisible);
    }

    function sendTerminalReply(contact, text) {
        if (isGenerating()) {
            parentWindow.toastr?.warning?.('当前仍在生成中，等本轮结束后再发送终端回复。');
            return;
        }

        const command = `回复${contact}终端：${text}`;
        const textarea = parentDoc.querySelector('#send_textarea');
        const sendButton = parentDoc.querySelector('#send_but');
        if (!textarea || !sendButton) {
            parentWindow.toastr?.error?.('未找到 SillyTavern 发送框。');
            return;
        }

        textarea.value = command;
        textarea.dispatchEvent(new Event('input', { bubbles: true }));
        textarea.dispatchEvent(new Event('change', { bubbles: true }));
        sendButton.click();
    }

    function renderMessage(mesText) {
        if (!mesText) return;

        const raw = getRawText(mesText);
        const parsed = parseAetherBlock(raw);
        if (!parsed) return;

        const rawKey = `${raw.length}:${raw.slice(0, 80)}:${raw.slice(-80)}`;
        if (mesText.dataset.aetherRenderKey === rawKey && mesText.querySelector(`.${TERMINAL_CLASS}`)) {
            return;
        }

        const previousInputValue = mesText.querySelector('.aether-input')?.value || '';
        mesText.dataset.aetherRaw = raw;
        mesText.dataset.aetherRenderKey = rawKey;
        mesText.innerHTML = renderTerminal(parsed, previousInputValue);
        bindTerminalEvents(mesText, parsed);
    }

    function scanAll() {
        state.scheduled = false;
        const messageTexts = parentDoc.querySelectorAll('#chat .mes .mes_text');
        messageTexts.forEach(renderMessage);
    }

    function scheduleScan() {
        if (state.scheduled) return;
        state.scheduled = true;
        parentWindow.requestAnimationFrame(scanAll);
    }

    function initObserver() {
        const chat = parentDoc.querySelector('#chat');
        if (!chat) {
            setTimeout(initObserver, 500);
            return;
        }

        state.observer = new MutationObserver(() => scheduleScan());
        state.observer.observe(chat, {
            childList: true,
            subtree: true,
            characterData: true,
        });
    }

    function initEvents() {
        const context = getContext();
        const eventSource = context?.eventSource;
        const eventTypes = context?.event_types;
        if (!eventSource || !eventTypes) {
            setTimeout(initEvents, 500);
            return;
        }

        addListener(eventSource, eventTypes.STREAM_TOKEN_RECEIVED, text => {
            state.activeStreamMessageId = getLastVisibleMessageId();
            state.activeStreamText = String(text || '');
            scheduleScan();
        });

        addListener(eventSource, eventTypes.GENERATION_STARTED, () => {
            state.activeStreamMessageId = getLastVisibleMessageId();
            state.activeStreamText = '';
            scheduleScan();
        });

        const endStream = () => {
            scheduleScan();
            setTimeout(() => {
                state.activeStreamMessageId = null;
                state.activeStreamText = '';
                scheduleScan();
            }, 250);
        };

        addListener(eventSource, eventTypes.GENERATION_ENDED, endStream);
        addListener(eventSource, eventTypes.GENERATION_STOPPED, endStream);
        addListener(eventSource, eventTypes.CHARACTER_MESSAGE_RENDERED, scheduleScan);
        addListener(eventSource, eventTypes.USER_MESSAGE_RENDERED, scheduleScan);
        addListener(eventSource, eventTypes.MESSAGE_UPDATED, scheduleScan);
        addListener(eventSource, eventTypes.MESSAGE_SWIPED, scheduleScan);
        addListener(eventSource, eventTypes.CHAT_CHANGED, () => {
            state.activeStreamMessageId = null;
            state.activeStreamText = '';
            setTimeout(scheduleScan, 300);
        });
    }

    function destroy() {
        state.observer?.disconnect();
        state.listeners.forEach(remove => {
            try { remove(); } catch (_) { /* noop */ }
        });
        state.listeners.length = 0;
        parentDoc.getElementById(STYLE_ID)?.remove();
        delete parentWindow[GLOBAL_KEY];
    }

    function init() {
        injectStyles();
        initObserver();
        initEvents();
        scheduleScan();
        parentWindow[GLOBAL_KEY] = { version: VERSION, destroy, scan: scheduleScan };
        parentWindow.toastr?.success?.('AETHER 终端流式渲染脚本已加载');
        console.log(`[AETHER终端流式渲染] loaded v${VERSION}`);
    }

    init();
})();
