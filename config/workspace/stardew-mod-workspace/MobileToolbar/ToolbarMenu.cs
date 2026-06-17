using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using StardewModdingAPI;
using StardewValley;
using StardewValley.Menus;

namespace Libala.MobileToolbar;

internal sealed class ToolbarMenu : IClickableMenu
{
    private const int ButtonHeight = 54;
    private const int Gap = 8;
    private const long DuplicateClickWindowMs = 180;
    private const int DuplicateClickDistance = 10;
    private readonly ModConfig config;
    private readonly Func<IReadOnlyList<ToolbarRegistration>> getRegistrations;
    private readonly Action saveConfig;
    private readonly Action<string> log;
    private readonly List<(Rectangle Bounds, ToolbarRegistration Registration)> actionButtons = new();
    private Rectangle managerButton;
    private Rectangle rowBounds;
    private bool dragging;
    private Point dragOffset;
    private long lastHandledClickMs;
    private Point lastHandledClickPoint;

    public bool IsDragging => this.dragging;

    public ToolbarMenu(ModConfig config, Func<IReadOnlyList<ToolbarRegistration>> getRegistrations, Action saveConfig, Action<string> log)
    {
        this.config = config;
        this.getRegistrations = getRegistrations;
        this.saveConfig = saveConfig;
        this.log = log;
        this.Reflow();
    }

    public override void draw(SpriteBatch b)
    {
        if (!this.CanDisplay())
            return;

        this.Reflow();
        this.DrawButton(b, this.managerButton, this.config.Locked ? "移动" : "锁定", !this.config.Locked);
        foreach ((Rectangle bounds, ToolbarRegistration registration) in this.actionButtons)
            this.DrawButton(b, bounds, registration.Label, false);
    }

    public override bool isWithinBounds(int x, int y)
    {
        if (!this.CanDisplay())
            return false;

        this.Reflow();
        return this.rowBounds.Contains(x, y);
    }

    public bool TryHandlePress(int x, int y)
    {
        if (!this.CanDisplay())
            return false;

        this.Reflow();
        if (!this.rowBounds.Contains(x, y))
            return false;

        if (this.IsDuplicatePress(x, y))
            return true;

        if (this.managerButton.Contains(x, y))
        {
            this.config.Locked = !this.config.Locked;
            this.dragging = false;
            this.saveConfig();
            this.log($"MobileToolbar handled manager toggle at {x},{y}");
            Game1.playSound("smallSelect");
            return true;
        }

        if (!this.config.Locked)
        {
            this.dragging = true;
            this.dragOffset = new Point(x - this.rowBounds.X, y - this.rowBounds.Y);
            return true;
        }

        ToolbarRegistration? target = null;
        foreach ((Rectangle bounds, ToolbarRegistration registration) in this.actionButtons)
        {
            if (!bounds.Contains(x, y))
                continue;

            target = registration;
            break;
        }

        if (target is not null)
        {
            this.log($"MobileToolbar handled {target.Id} ({target.Label}) at {x},{y}");
            target.Action();
        }
        return true;
    }

    public override void receiveLeftClick(int x, int y, bool playSound = true)
    {
        _ = this.TryHandlePress(x, y);
    }

    public override void receiveRightClick(int x, int y, bool playSound = true)
    {
        this.receiveLeftClick(x, y, playSound);
    }

    public override void leftClickHeld(int x, int y)
    {
        if (!this.dragging || this.config.Locked)
            return;

        this.MoveRowTo(x - this.dragOffset.X, y - this.dragOffset.Y);
    }

    public override void releaseLeftClick(int x, int y)
    {
        if (!this.dragging)
            return;

        this.MoveRowTo(x - this.dragOffset.X, y - this.dragOffset.Y);
        this.dragging = false;
        this.saveConfig();
    }

    public override void gameWindowSizeChanged(Rectangle oldBounds, Rectangle newBounds)
    {
        this.Reflow();
    }

    private bool CanDisplay()
    {
        return Context.IsWorldReady
            && Game1.currentLocation is not null
            && Game1.activeClickableMenu is null
            && Game1.currentMinigame is null
            && !Game1.eventUp;
    }

    private bool IsDuplicatePress(int x, int y)
    {
        long now = Environment.TickCount64;
        int deltaX = Math.Abs(x - this.lastHandledClickPoint.X);
        int deltaY = Math.Abs(y - this.lastHandledClickPoint.Y);
        if (now - this.lastHandledClickMs <= DuplicateClickWindowMs && deltaX <= DuplicateClickDistance && deltaY <= DuplicateClickDistance)
            return true;

        this.lastHandledClickMs = now;
        this.lastHandledClickPoint = new Point(x, y);
        return false;
    }

    private void Reflow()
    {
        IReadOnlyList<ToolbarRegistration> visibleButtons = this.getRegistrations()
            .Where(registration => this.IsAvailable(registration))
            .ToArray();
        int slotCount = visibleButtons.Count + 1;
        int availableWidth = Math.Max(0, Game1.uiViewport.Width - 24);
        int width = Math.Min(104, Math.Max(64, (availableWidth - Gap * (slotCount - 1)) / Math.Max(1, slotCount)));
        int totalWidth = width * slotCount + Gap * (slotCount - 1);
        int x = Math.Clamp((int)(Game1.uiViewport.Width * this.config.AnchorX), 12, Math.Max(12, Game1.uiViewport.Width - totalWidth - 12));
        int y = Math.Clamp((int)(Game1.uiViewport.Height * this.config.AnchorY), 12, Math.Max(12, Game1.uiViewport.Height - ButtonHeight - 12));

        this.rowBounds = new Rectangle(x, y, totalWidth, ButtonHeight);
        this.managerButton = new Rectangle(x, y, width, ButtonHeight);
        this.actionButtons.Clear();
        for (int index = 0; index < visibleButtons.Count; index++)
        {
            Rectangle bounds = new(x + (index + 1) * (width + Gap), y, width, ButtonHeight);
            this.actionButtons.Add((bounds, visibleButtons[index]));
        }
    }

    private void MoveRowTo(int x, int y)
    {
        int maxX = Math.Max(12, Game1.uiViewport.Width - this.rowBounds.Width - 12);
        int maxY = Math.Max(12, Game1.uiViewport.Height - ButtonHeight - 12);
        int clampedX = Math.Clamp(x, 12, maxX);
        int clampedY = Math.Clamp(y, 12, maxY);
        this.config.AnchorX = clampedX / (float)Math.Max(1, Game1.uiViewport.Width);
        this.config.AnchorY = clampedY / (float)Math.Max(1, Game1.uiViewport.Height);
        this.Reflow();
    }

    private bool IsAvailable(ToolbarRegistration registration)
    {
        try
        {
            return registration.IsAvailable();
        }
        catch
        {
            return false;
        }
    }

    private void DrawButton(SpriteBatch b, Rectangle bounds, string label, bool active)
    {
        IClickableMenu.drawTextureBox(
            b,
            Game1.menuTexture,
            new Rectangle(0, 256, 60, 60),
            bounds.X,
            bounds.Y,
            bounds.Width,
            bounds.Height,
            active ? Color.Wheat : Color.White,
            1f,
            false
        );
        Vector2 size = Game1.smallFont.MeasureString(label);
        Utility.drawTextWithShadow(
            b,
            label,
            Game1.smallFont,
            new Vector2(bounds.X + (bounds.Width - size.X) / 2f, bounds.Y + (bounds.Height - size.Y) / 2f),
            Game1.textColor
        );
    }
}
