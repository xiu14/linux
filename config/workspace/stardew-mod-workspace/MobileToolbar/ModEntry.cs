using Microsoft.Xna.Framework;
using StardewModdingAPI;
using StardewModdingAPI.Events;
using StardewValley;

namespace Libala.MobileToolbar;

public sealed class ModEntry : Mod
{
    private readonly Dictionary<string, ToolbarRegistration> registrations = new(StringComparer.OrdinalIgnoreCase);
    private ModConfig config = null!;
    private ToolbarMenu? toolbarMenu;
    private int suppressMovementTicks;
    private bool wasDraggingLastTick;

    public override void Entry(IModHelper helper)
    {
        this.config = helper.ReadConfig<ModConfig>();
        this.MigrateConfig();
        helper.Events.GameLoop.UpdateTicked += this.OnUpdateTicked;
        helper.Events.GameLoop.ReturnedToTitle += this.OnReturnedToTitle;
        helper.Events.Input.ButtonPressed += this.OnButtonPressed;
    }

    public override object GetApi()
    {
        return new MobileToolbarApi(this.RegisterButton);
    }

    private void RegisterButton(string id, string label, int order, Action action, Func<bool> isAvailable)
    {
        if (string.IsNullOrWhiteSpace(id) || string.IsNullOrWhiteSpace(label))
            return;

        this.registrations[id] = new ToolbarRegistration(id, label, order, action, isAvailable);
    }

    private void OnButtonPressed(object? sender, ButtonPressedEventArgs e)
    {
        if (!Context.IsWorldReady || this.toolbarMenu is null)
            return;

        if (!IsToolbarPress(e.Button))
            return;

        Point screenPos = e.Cursor.ScreenPixels.ToPoint();
        if (this.toolbarMenu.isWithinBounds(screenPos.X, screenPos.Y))
            this.BlockPlayerMovement();
    }

    private static bool IsToolbarPress(SButton button)
    {
        return button == SButton.MouseLeft
            || button == SButton.MouseRight
            || button.IsActionButton()
            || button.IsUseToolButton();
    }

    private void BlockPlayerMovement()
    {
        this.suppressMovementTicks = Math.Max(this.suppressMovementTicks, 12);
        StopPlayerMovement();
    }

    private void UpdateMovementBlock()
    {
        bool isDragging = this.toolbarMenu?.IsDragging == true;
        if (isDragging)
            this.suppressMovementTicks = Math.Max(this.suppressMovementTicks, 4);
        else if (this.wasDraggingLastTick)
            this.suppressMovementTicks = Math.Max(this.suppressMovementTicks, 24);
        this.wasDraggingLastTick = isDragging;

        if (this.suppressMovementTicks <= 0)
            return;

        StopPlayerMovement();
        this.suppressMovementTicks--;
        if (this.suppressMovementTicks == 0)
            Game1.player?.forceCanMove();
    }

    private static void StopPlayerMovement()
    {
        if (Game1.player is null)
            return;

        Game1.player.Halt();
        Game1.player.canMove = false;
    }

    private void OnUpdateTicked(object? sender, UpdateTickedEventArgs e)
    {
        if (!Context.IsWorldReady)
            return;

        this.UpdateMovementBlock();
        this.toolbarMenu ??= new ToolbarMenu(this.config, this.GetRegistrations, this.SaveConfig, message => this.Monitor.Log(message, LogLevel.Debug));
        if (!Game1.onScreenMenus.Contains(this.toolbarMenu))
            Game1.onScreenMenus.Add(this.toolbarMenu);
    }

    private void OnReturnedToTitle(object? sender, ReturnedToTitleEventArgs e)
    {
        if (this.toolbarMenu is not null)
            Game1.onScreenMenus.Remove(this.toolbarMenu);
        this.toolbarMenu = null;
    }

    private IReadOnlyList<ToolbarRegistration> GetRegistrations()
    {
        return this.registrations.Values.OrderBy(registration => registration.Order).ThenBy(registration => registration.Id).ToArray();
    }

    private void SaveConfig()
    {
        this.Helper.WriteConfig(this.config);
    }

    private void MigrateConfig()
    {
        if (this.config.LayoutVersion >= 1)
            return;

        if (Math.Abs(this.config.AnchorX - 0.04f) < 0.001f && Math.Abs(this.config.AnchorY - 0.80f) < 0.001f)
            this.config.AnchorY = 0.72f;

        this.config.LayoutVersion = 1;
        this.SaveConfig();
    }
}
