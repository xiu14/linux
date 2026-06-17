using System;
using System.Collections.Generic;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using Pathoschild.Stardew.ChestsAnywhere.Framework;
using StardewValley;
using StardewValley.Menus;

namespace Pathoschild.Stardew.ChestsAnywhere.Menus;

/// <summary>A touch-first chest chooser which opens the game's native mobile storage screen.</summary>
internal sealed class MobileChestMenu : IClickableMenu
{
    private readonly ManagedChest[] chests;
    private readonly Action<ManagedChest> openChest;
    private readonly List<Rectangle> rows = new();
    private Rectangle closeButton;
    private Rectangle upButton;
    private Rectangle downButton;
    private int offset;

    public MobileChestMenu(ManagedChest[] chests, Action<ManagedChest> openChest)
    {
        this.chests = chests;
        this.openChest = openChest;
        this.Reflow();
    }

    public override void draw(SpriteBatch b)
    {
        b.Draw(Game1.fadeToBlackRect, Game1.graphics.GraphicsDevice.Viewport.Bounds, Color.Black * 0.45f);
        IClickableMenu.drawTextureBox(b, Game1.menuTexture, new Rectangle(0, 256, 60, 60), this.xPositionOnScreen, this.yPositionOnScreen, this.width, this.height, Color.White, 1f, true);
        Utility.drawTextWithShadow(b, "远程箱子", Game1.dialogueFont, new Vector2(this.xPositionOnScreen + 27, this.yPositionOnScreen + 22), Game1.textColor);
        this.DrawButton(b, this.closeButton, "X");
        this.DrawButton(b, this.upButton, "上");
        this.DrawButton(b, this.downButton, "下");

        for (int i = 0; i < this.rows.Count; i++)
        {
            int index = this.offset + i;
            if (index >= this.chests.Length)
                break;

            ManagedChest chest = this.chests[index];
            Rectangle row = this.rows[i];
            b.Draw(Game1.staminaRect, row, Color.Wheat * 0.18f);
            string name = Game1.parseText(chest.DisplayName, Game1.dialogueFont, row.Width - 32);
            Utility.drawTextWithShadow(b, name, Game1.dialogueFont, new Vector2(row.X + 16, row.Y + 8), Game1.textColor);
            string details = $"{chest.DisplayCategory}  |  {chest.Location.NameOrUniqueName}";
            Utility.drawTextWithShadow(b, Game1.parseText(details, Game1.smallFont, row.Width - 32), Game1.smallFont, new Vector2(row.X + 18, row.Y + 44), Color.DarkSlateGray);
        }

        Utility.drawTextWithShadow(
            b,
            $"{Math.Min(this.offset + 1, this.chests.Length)}-{Math.Min(this.offset + this.rows.Count, this.chests.Length)} / {this.chests.Length}",
            Game1.smallFont,
            new Vector2(this.xPositionOnScreen + 30, this.yPositionOnScreen + this.height - 48),
            Color.DarkSlateGray
        );
    }

    public override void receiveLeftClick(int x, int y, bool playSound = true)
    {
        if (this.closeButton.Contains(x, y))
        {
            Game1.playSound("bigDeSelect");
            Game1.activeClickableMenu = null;
            return;
        }

        if (this.upButton.Contains(x, y))
        {
            this.offset = Math.Max(0, this.offset - this.rows.Count);
            Game1.playSound("shiny4");
            return;
        }

        if (this.downButton.Contains(x, y))
        {
            int maxOffset = Math.Max(0, this.chests.Length - this.rows.Count);
            this.offset = Math.Min(maxOffset, this.offset + this.rows.Count);
            Game1.playSound("shiny4");
            return;
        }

        for (int i = 0; i < this.rows.Count; i++)
        {
            int index = this.offset + i;
            if (index < this.chests.Length && this.rows[i].Contains(x, y))
            {
                Game1.playSound("bigSelect");
                this.openChest(this.chests[index]);
                return;
            }
        }
    }

    public override void receiveKeyPress(Microsoft.Xna.Framework.Input.Keys key)
    {
        if (key == Microsoft.Xna.Framework.Input.Keys.Escape)
            Game1.activeClickableMenu = null;
    }

    public override void gameWindowSizeChanged(Rectangle oldBounds, Rectangle newBounds)
    {
        this.Reflow();
    }

    private void Reflow()
    {
        this.width = Math.Min(680, Math.Max(410, Game1.uiViewport.Width - 52));
        this.height = Math.Min(690, Math.Max(470, Game1.uiViewport.Height - 52));
        this.xPositionOnScreen = (Game1.uiViewport.Width - this.width) / 2;
        this.yPositionOnScreen = (Game1.uiViewport.Height - this.height) / 2;
        this.closeButton = new Rectangle(this.xPositionOnScreen + this.width - 66, this.yPositionOnScreen + 22, 40, 40);
        this.upButton = new Rectangle(this.xPositionOnScreen + this.width - 64, this.yPositionOnScreen + 86, 40, 40);
        this.downButton = new Rectangle(this.xPositionOnScreen + this.width - 64, this.yPositionOnScreen + this.height - 92, 40, 40);

        int rowX = this.xPositionOnScreen + 27;
        int rowY = this.yPositionOnScreen + 84;
        int rowWidth = this.width - 102;
        int availableHeight = this.height - 146;
        int rowHeight = 78;
        int visibleRows = Math.Max(3, Math.Min(7, availableHeight / rowHeight));
        this.rows.Clear();
        for (int i = 0; i < visibleRows; i++)
            this.rows.Add(new Rectangle(rowX, rowY + i * rowHeight, rowWidth, rowHeight - 6));
        this.offset = Math.Min(this.offset, Math.Max(0, this.chests.Length - this.rows.Count));
    }

    private void DrawButton(SpriteBatch b, Rectangle bounds, string label)
    {
        IClickableMenu.drawTextureBox(b, Game1.menuTexture, new Rectangle(0, 256, 60, 60), bounds.X, bounds.Y, bounds.Width, bounds.Height, Color.White * 0.92f, 1f, false);
        Vector2 size = Game1.smallFont.MeasureString(label);
        Utility.drawTextWithShadow(b, label, Game1.smallFont, new Vector2(bounds.X + (bounds.Width - size.X) / 2f, bounds.Y + (bounds.Height - size.Y) / 2f), Game1.textColor);
    }
}
