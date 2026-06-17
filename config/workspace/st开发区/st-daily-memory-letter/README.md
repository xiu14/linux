# ST Old Friend Letter

`ST Daily Memory Letter` is a SillyTavern frontend-only extension that scans inactive character chat archives, picks fragments from different saved chats, and turns them into a daily "memory letter" designed to make the user want to talk to that character again.

It installs as a normal GitHub URL extension and does not require a server plugin.

## Features

- Scans historical chat archives through SillyTavern's built-in chat APIs
- Prefers inactive characters instead of recently used ones
- Tries to pull fragments from different saved chat archives for the same card
- Runs silently on startup and only once every 24 hours
- Lets the user configure an external OpenAI-compatible URL in the extension panel
- Shows the result as an envelope popup with letter paper styling and a large portrait
- Can jump back into the recommended saved chat

## Install

In SillyTavern:

1. Open the extensions manager.
2. Choose install from GitHub URL.
3. Paste this repository URL.
4. Enable the extension if needed and reload SillyTavern.

## Configure

Open the extension panel and find `故人来信`.

You can configure:

- external AI URL
- API key
- model name
- inactive days threshold
- snippets per letter
- per-character cooldown
- custom system prompt

If no external AI URL is configured, the extension will still generate a local fallback old-friend letter for testing.

## Notes

- This is a frontend-only extension, so it runs when the SillyTavern page is open.
- API keys are currently stored in extension settings for convenience. If you use a relay URL that already handles auth, you can leave the key empty.
- The extension currently targets character chats, not full group-chat recommendation flows.
