using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using StardewValley;
using StardewValley.Menus;

namespace Libala.CompanionGuide;

internal sealed class HudCompanionButton : IClickableMenu
{
    private readonly Func<bool> canOpen;
    private readonly Action openMenu;
    private readonly CompanionWorkController work;
    private Rectangle bounds;

    public HudCompanionButton(Func<bool> canOpen, Action openMenu, CompanionWorkController work)
    {
        this.canOpen = canOpen;
        this.openMenu = openMenu;
        this.work = work;
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
        Vector2 labelSize = Game1.smallFont.MeasureString("伙伴");
        Utility.drawTextWithShadow(
            b,
            "伙伴",
            Game1.smallFont,
            new Vector2(this.bounds.X + (this.bounds.Width - labelSize.X) / 2f, this.bounds.Y + (this.bounds.Height - labelSize.Y) / 2f),
            Game1.textColor
        );

        string statusText = this.work.HasVisibleStatus ? this.work.Status : "";
        if (!string.IsNullOrWhiteSpace(statusText))
        {
            string status = Game1.parseText(statusText, Game1.smallFont, 330);
            Vector2 size = Game1.smallFont.MeasureString(status);
            int statusX = Math.Clamp(this.bounds.X, 16, Math.Max(16, Game1.uiViewport.Width - (int)size.X - 16));
            int statusY = Math.Max(16, this.bounds.Y - (int)size.Y - 8);
            Utility.drawTextWithShadow(b, status, Game1.smallFont, new Vector2(statusX, statusY), Color.White);
        }
    }

    public override bool isWithinBounds(int x, int y)
    {
        this.Reflow();
        return this.canOpen() && this.bounds.Contains(x, y);
    }

    public override void receiveLeftClick(int x, int y, bool playSound = true)
    {
        this.TryOpen(x, y);
    }

    public override void receiveRightClick(int x, int y, bool playSound = true)
    {
        this.TryOpen(x, y);
    }

    public override void gameWindowSizeChanged(Rectangle oldBounds, Rectangle newBounds)
    {
        this.Reflow();
    }

    private void TryOpen(int x, int y)
    {
        if (this.isWithinBounds(x, y))
            this.openMenu();
    }

    private void Reflow()
    {
        // Slot 0 is reserved for a future draggable/lockable HUD-bar controller.
        this.bounds = GetToolbarSlot(2);
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
