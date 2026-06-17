using System;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using StardewValley;
using StardewValley.Menus;

namespace Pathoschild.Stardew.ChestsAnywhere.Menus;

/// <summary>A compact touch-friendly HUD button for opening remote storage on Android.</summary>
internal sealed class MobileOpenButton : IClickableMenu
{
    private readonly Func<bool> canOpen;
    private readonly Action openMenu;
    private Rectangle bounds;

    public MobileOpenButton(Func<bool> canOpen, Action openMenu)
    {
        this.canOpen = canOpen;
        this.openMenu = openMenu;
        this.Reflow();
    }

    public override void draw(SpriteBatch b)
    {
        if (!this.canOpen())
            return;

        this.Reflow();
        IClickableMenu.drawTextureBox(
            b,
            Game1.menuTexture,
            new Rectangle(0, 256, 60, 60),
            this.bounds.X,
            this.bounds.Y,
            this.bounds.Width,
            this.bounds.Height,
            Color.White,
            1f,
            false
        );
        Vector2 size = Game1.smallFont.MeasureString("箱子");
        Utility.drawTextWithShadow(
            b,
            "箱子",
            Game1.smallFont,
            new Vector2(this.bounds.X + (this.bounds.Width - size.X) / 2f, this.bounds.Y + (this.bounds.Height - size.Y) / 2f),
            Game1.textColor
        );
    }

    public override bool isWithinBounds(int x, int y)
    {
        this.Reflow();
        return this.canOpen() && this.bounds.Contains(x, y);
    }

    public override void receiveLeftClick(int x, int y, bool playSound = true)
    {
        if (this.isWithinBounds(x, y))
        {
            Game1.playSound("bigSelect");
            this.openMenu();
        }
    }

    public override void receiveRightClick(int x, int y, bool playSound = true)
    {
        this.receiveLeftClick(x, y, playSound);
    }

    public override void gameWindowSizeChanged(Rectangle oldBounds, Rectangle newBounds)
    {
        this.Reflow();
    }

    private void Reflow()
    {
        // Slot 0 is reserved for a future draggable/lockable HUD-bar controller.
        this.bounds = GetToolbarSlot(3);
    }

    private static Rectangle GetToolbarSlot(int slot)
    {
        const int slots = 4;
        const int gap = 8;
        const int desiredWidth = 104;
        const int height = 54;
        int availableWidth = Math.Max(0, Game1.uiViewport.Width - 24);
        int width = Math.Min(desiredWidth, Math.Max(70, (availableWidth - gap * (slots - 1)) / slots));
        int totalWidth = width * slots + gap * (slots - 1);
        int startX = Math.Max(12, (Game1.uiViewport.Width - totalWidth) / 2);
        int y = Math.Max(20, Game1.uiViewport.Height - 224);
        return new Rectangle(startX + slot * (width + gap), y, width, height);
    }
}
