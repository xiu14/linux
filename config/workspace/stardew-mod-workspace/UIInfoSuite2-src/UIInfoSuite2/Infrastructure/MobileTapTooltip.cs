using System;
using System.Collections.Generic;
using Microsoft.Xna.Framework;
using StardewModdingAPI;
using StardewModdingAPI.Events;
using StardewModdingAPI.Utilities;
using StardewValley;
using StardewValley.Menus;

namespace UIInfoSuite2.Infrastructure;

internal sealed class MobileTapTooltip : IDisposable
{
  private const int DisplayTicks = 180;

  private readonly IModHelper _helper;
  private readonly PerScreen<List<Entry>> _entries = new(() => new List<Entry>());
  private readonly PerScreen<string?> _activeText = new();
  private readonly PerScreen<int> _activeTicks = new();
  private readonly PerScreen<Point> _activePosition = new();

  public static MobileTapTooltip? Instance { get; private set; }

  public MobileTapTooltip(IModHelper helper)
  {
    _helper = helper;
    Instance = this;

    _helper.Events.Display.Rendering += OnRendering;
    _helper.Events.Display.RenderedHud += OnRenderedHud;
    _helper.Events.Display.RenderedActiveMenu += OnRenderedActiveMenu;
    _helper.Events.GameLoop.UpdateTicked += OnUpdateTicked;
    _helper.Events.Input.ButtonPressed += OnButtonPressed;
  }

  public void Dispose()
  {
    _helper.Events.Display.Rendering -= OnRendering;
    _helper.Events.Display.RenderedHud -= OnRenderedHud;
    _helper.Events.Display.RenderedActiveMenu -= OnRenderedActiveMenu;
    _helper.Events.GameLoop.UpdateTicked -= OnUpdateTicked;
    _helper.Events.Input.ButtonPressed -= OnButtonPressed;

    if (ReferenceEquals(Instance, this))
    {
      Instance = null;
    }
  }

  public static void Register(Rectangle bounds, string? text)
  {
    if (Instance is null || string.IsNullOrWhiteSpace(text))
    {
      return;
    }

    Instance._entries.Value.Add(new Entry(bounds, text));
  }

  public static bool IsActive(Rectangle bounds, string? text = null)
  {
    if (Instance is null || Instance._activeTicks.Value <= 0 || Instance._activeText.Value is null)
    {
      return false;
    }

    if (!string.IsNullOrEmpty(text) && Instance._activeText.Value != text)
    {
      return false;
    }

    return bounds.Contains(Instance._activePosition.Value);
  }

  private void OnRendering(object? sender, EventArgs e)
  {
    _entries.Value.Clear();
  }

  private void OnButtonPressed(object? sender, ButtonPressedEventArgs e)
  {
    if (e.IsSuppressed() || e.Button is not (SButton.MouseLeft or SButton.ControllerA))
    {
      return;
    }

    Point cursor = new(Game1.getMouseX(), Game1.getMouseY());
    List<Entry> entries = _entries.Value;
    for (int i = entries.Count - 1; i >= 0; i--)
    {
      Entry entry = entries[i];
      if (!entry.Bounds.Contains(cursor))
      {
        continue;
      }

      _activeText.Value = entry.Text;
      _activePosition.Value = cursor;
      _activeTicks.Value = DisplayTicks;
      return;
    }
  }

  private void OnUpdateTicked(object? sender, UpdateTickedEventArgs e)
  {
    if (_activeTicks.Value > 0)
    {
      _activeTicks.Value--;
    }
  }

  [EventPriority(EventPriority.Low)]
  private void OnRenderedHud(object? sender, RenderedHudEventArgs e)
  {
    if (Game1.activeClickableMenu is null)
    {
      DrawActiveTooltip();
    }
  }

  [EventPriority(EventPriority.Low)]
  private void OnRenderedActiveMenu(object? sender, RenderedActiveMenuEventArgs e)
  {
    if (Game1.activeClickableMenu is not null)
    {
      DrawActiveTooltip();
    }
  }

  private void DrawActiveTooltip()
  {
    if (_activeTicks.Value <= 0 || string.IsNullOrWhiteSpace(_activeText.Value))
    {
      return;
    }

    IClickableMenu.drawHoverText(
      Game1.spriteBatch,
      _activeText.Value,
      Game1.smallFont,
      overrideX: _activePosition.Value.X + 24,
      overrideY: _activePosition.Value.Y + 24
    );
  }

  private readonly record struct Entry(Rectangle Bounds, string Text);
}
