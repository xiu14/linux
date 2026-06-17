using System;
using System.Linq;
using Microsoft.Xna.Framework;
using StardewModdingAPI;
using StardewModdingAPI.Events;
using StardewModdingAPI.Utilities;
using StardewValley;
using StardewValley.Menus;

namespace UIInfoSuite2.UIElements;

internal sealed class MobileBillboardLongPress : IDisposable
{
  private const int LongPressTicks = 30;
  private const int MaxMovePixels = 18;

  private readonly IModHelper _helper;
  private readonly PerScreen<Point?> _pressPosition = new();
  private readonly PerScreen<int> _heldTicks = new();
  private readonly PerScreen<bool> _handled = new();

  public MobileBillboardLongPress(IModHelper helper)
  {
    _helper = helper;

    _helper.Events.Input.ButtonPressed += OnButtonPressed;
    _helper.Events.Input.ButtonReleased += OnButtonReleased;
    _helper.Events.GameLoop.UpdateTicked += OnUpdateTicked;
  }

  public void Dispose()
  {
    _helper.Events.Input.ButtonPressed -= OnButtonPressed;
    _helper.Events.Input.ButtonReleased -= OnButtonReleased;
    _helper.Events.GameLoop.UpdateTicked -= OnUpdateTicked;
  }

  private void OnButtonPressed(object? sender, ButtonPressedEventArgs e)
  {
    if (e.Button != SButton.MouseLeft || e.IsSuppressed() || Game1.activeClickableMenu is not Billboard)
    {
      Reset();
      return;
    }

    _pressPosition.Value = GetMousePosition();
    _heldTicks.Value = 0;
    _handled.Value = false;
  }

  private void OnButtonReleased(object? sender, ButtonReleasedEventArgs e)
  {
    if (e.Button == SButton.MouseLeft)
    {
      Reset();
    }
  }

  private void OnUpdateTicked(object? sender, UpdateTickedEventArgs e)
  {
    if (Game1.activeClickableMenu is not Billboard billboard ||
        !_helper.Input.IsDown(SButton.MouseLeft) ||
        _pressPosition.Value is not Point start)
    {
      Reset();
      return;
    }

    Point current = GetMousePosition();
    if (Math.Abs(current.X - start.X) > MaxMovePixels || Math.Abs(current.Y - start.Y) > MaxMovePixels)
    {
      Reset();
      return;
    }

    if (_handled.Value || !billboard.calendarDays.Any(day => day.containsPoint(current.X, current.Y)))
    {
      return;
    }

    _heldTicks.Value++;
    if (_heldTicks.Value < LongPressTicks)
    {
      return;
    }

    _handled.Value = true;
    _helper.Input.Suppress(SButton.MouseLeft);
    billboard.receiveRightClick(current.X, current.Y);
  }

  private static Point GetMousePosition()
  {
    return new Point(Game1.getMouseX(true), Game1.getMouseY(true));
  }

  private void Reset()
  {
    _pressPosition.Value = null;
    _heldTicks.Value = 0;
    _handled.Value = false;
  }
}
