using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using StardewValley;
using StardewValley.Menus;

namespace Libala.CompanionGuide;

internal sealed class CompanionWorkMenu : IClickableMenu
{
    private readonly CompanionWorkController work;
    private readonly CompanionActor actor;
    private readonly Action close;
    private readonly Action selectStorage;
    private readonly List<(Rectangle Bounds, string Label, CompanionWorkType Type)> actions = new();
    private Rectangle stopButton;
    private Rectangle storageButton;

    public CompanionWorkMenu(CompanionWorkController work, CompanionActor actor, Action close, Action selectStorage)
    {
        this.work = work;
        this.actor = actor;
        this.close = close;
        this.selectStorage = selectStorage;
        this.Reflow();
    }

    public override void draw(SpriteBatch b)
    {
        this.Reflow();
        foreach ((Rectangle bounds, string label, CompanionWorkType type) in this.actions)
            this.DrawButton(b, bounds, label, this.work.IsWorking && this.GetCurrentLabel() == label);

        this.DrawButton(b, this.stopButton, "停止", false);
        this.DrawButton(b, this.storageButton, "收纳箱", false);
    }

    public override bool isWithinBounds(int x, int y)
    {
        this.Reflow();
        return this.actions.Any(action => action.Bounds.Contains(x, y)) || this.stopButton.Contains(x, y) || this.storageButton.Contains(x, y);
    }

    public override void receiveLeftClick(int x, int y, bool playSound = true)
    {
        this.Reflow();
        foreach ((Rectangle bounds, _, CompanionWorkType type) in this.actions)
        {
            if (!bounds.Contains(x, y))
                continue;

            this.actor.CancelMovement();
            this.work.Start(type, Game1.currentLocation);
            Game1.playSound("smallSelect");
            this.Close();
            return;
        }

        if (this.stopButton.Contains(x, y))
        {
            this.work.Stop();
            this.actor.CancelMovement();
            Game1.playSound("smallSelect");
            this.Close();
            return;
        }

        if (this.storageButton.Contains(x, y))
        {
            this.Close();
            this.selectStorage();
            return;
        }

        this.Close();
    }

    public override void receiveKeyPress(Microsoft.Xna.Framework.Input.Keys key)
    {
        if (key == Microsoft.Xna.Framework.Input.Keys.Escape)
            this.Close();
    }

    private void Reflow()
    {
        const int buttonWidth = 82;
        const int buttonHeight = 44;
        const int gap = 6;
        const int columns = 4;
        const int totalWidth = buttonWidth * columns + gap * (columns - 1);
        Rectangle companionScreenBounds = this.actor.GetScreenBounds();
        int x = Math.Clamp(companionScreenBounds.Center.X - totalWidth / 2, 12, Math.Max(12, Game1.uiViewport.Width - totalWidth - 12));
        int y = Math.Clamp(companionScreenBounds.Y - buttonHeight * 2 - gap - 12, 12, Math.Max(12, Game1.uiViewport.Height - buttonHeight * 2 - gap - 12));

        this.actions.Clear();
        string[] labels = { "浇水", "收割", "割草", "伐木", "采石" };
        CompanionWorkType[] types = { CompanionWorkType.Water, CompanionWorkType.Harvest, CompanionWorkType.CutGrass, CompanionWorkType.ChopWood, CompanionWorkType.BreakStone };
        for (int i = 0; i < labels.Length; i++)
        {
            int row = i / columns;
            int column = i % columns;
            this.actions.Add((new Rectangle(x + column * (buttonWidth + gap), y + row * (buttonHeight + gap), buttonWidth, buttonHeight), labels[i], types[i]));
        }

        this.stopButton = new Rectangle(x + buttonWidth + gap, y + buttonHeight + gap, buttonWidth, buttonHeight);
        this.storageButton = new Rectangle(x + 2 * (buttonWidth + gap), y + buttonHeight + gap, buttonWidth, buttonHeight);
    }

    private void DrawButton(SpriteBatch b, Rectangle bounds, string label, bool active)
    {
        IClickableMenu.drawTextureBox(b, Game1.menuTexture, new Rectangle(0, 256, 60, 60), bounds.X, bounds.Y, bounds.Width, bounds.Height, active ? Color.White : Color.White * 0.92f, 1f, false);
        Vector2 size = Game1.smallFont.MeasureString(label);
        Utility.drawTextWithShadow(b, label, Game1.smallFont, new Vector2(bounds.X + (bounds.Width - size.X) / 2f, bounds.Y + (bounds.Height - size.Y) / 2f), active ? new Color(43, 85, 116) : Game1.textColor);
    }

    private string GetCurrentLabel()
    {
        string status = this.work.Status;
        return this.actions.Select(action => action.Label).FirstOrDefault(status.Contains) ?? "";
    }

    private void Close()
    {
        this.close();
    }
}
