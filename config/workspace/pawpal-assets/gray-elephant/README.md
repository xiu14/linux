# Gray Elephant PawPal Asset Pack

This is a draft custom pet asset pack for PawPal.

## Character

- Name: Gray Elephant
- Style: cute 2D sticker / emoji-like desktop pet
- Source: generated with Codex image generation in this workspace
- Background handling: source images used a chroma-key green background; transparent PNGs are exported in `transparent/`

## Included States

| State | File |
| --- | --- |
| idle | `gif/idle.gif` |
| happy | `transparent/happy.png` |
| breakPrompt | `transparent/breakPrompt.png` |
| hydrationPrompt | `transparent/hydrationPrompt.png` |
| focusAlert | `transparent/focusAlert.png` |

## Notes

- `source/concept.png` is the original character concept preview.
- `source/*.png` keeps the unprocessed chroma-key versions.
- `transparent/*.png` is the usable desktop pet output.
- `frames/idle/*.png` contains the individual transparent frames used to build `gif/idle.gif`.
- The manifest in this folder is a draft mapping for future PawPal custom import support, not an official PawPal schema.
