using System;
using System.Collections.Generic;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using StardewValley;
using StardewValley.Menus;

namespace UIInfoSuite2.Options;

internal class MobileUiInfoMenu : IClickableMenu
{
  private const int ButtonHeight = 72;
  private const int ButtonGap = 12;
  private readonly List<Entry> _entries;
  private readonly List<ClickableComponent> _buttons = new();

  public MobileUiInfoMenu(IEnumerable<Entry> entries)
    : base(0, 0, 0, 0, true)
  {
    _entries = new List<Entry>(entries);
    Reposition();
  }

  public override void gameWindowSizeChanged(Rectangle oldBounds, Rectangle newBounds)
  {
    Reposition();
  }

  public override void receiveLeftClick(int x, int y, bool playSound = true)
  {
    if (upperRightCloseButton != null && upperRightCloseButton.containsPoint(x, y))
    {
      exitThisMenu();
      return;
    }

    for (int i = 0; i < _buttons.Count; i++)
    {
      if (!_buttons[i].containsPoint(x, y))
      {
        continue;
      }

      Game1.playSound("smallSelect");
      Action action = _entries[i].Action;
      Game1.activeClickableMenu = null;
      action();
      return;
    }
  }

  public override void draw(SpriteBatch b)
  {
    Game1.drawDialogueBox(xPositionOnScreen, yPositionOnScreen, width, height, false, true);

    string title = "UI Info";
    Vector2 titleSize = Game1.dialogueFont.MeasureString(title);
    b.DrawString(
      Game1.dialogueFont,
      title,
      new Vector2(xPositionOnScreen + (width - titleSize.X) / 2f, yPositionOnScreen + 28),
      Game1.textColor
    );

    Point mouse = new(Game1.getMouseX(), Game1.getMouseY());
    for (int i = 0; i < _buttons.Count; i++)
    {
      ClickableComponent button = _buttons[i];
      Color tint = button.containsPoint(mouse.X, mouse.Y) ? Color.Wheat : Color.White;
      drawTextureBox(
        b,
        Game1.menuTexture,
        new Rectangle(0, 256, 60, 60),
        button.bounds.X,
        button.bounds.Y,
        button.bounds.Width,
        button.bounds.Height,
        tint,
        1f,
        false
      );

      string label = _entries[i].Label;
      Vector2 labelSize = Game1.dialogueFont.MeasureString(label);
      b.DrawString(
        Game1.dialogueFont,
        label,
        new Vector2(
          button.bounds.X + (button.bounds.Width - labelSize.X) / 2f,
          button.bounds.Y + (button.bounds.Height - labelSize.Y) / 2f
        ),
        Game1.textColor
      );
    }

    upperRightCloseButton?.draw(b);
  }

  private void Reposition()
  {
    width = Math.Min(520, Game1.uiViewport.Width - 96);
    height = 120 + _entries.Count * ButtonHeight + Math.Max(0, _entries.Count - 1) * ButtonGap;
    xPositionOnScreen = (Game1.uiViewport.Width - width) / 2;
    yPositionOnScreen = Math.Max(32, (Game1.uiViewport.Height - height) / 2);

    _buttons.Clear();
    int buttonWidth = width - 96;
    int x = xPositionOnScreen + 48;
    int y = yPositionOnScreen + 84;
    foreach (Entry entry in _entries)
    {
      _buttons.Add(new ClickableComponent(new Rectangle(x, y, buttonWidth, ButtonHeight), entry.Label));
      y += ButtonHeight + ButtonGap;
    }

    initializeUpperRightCloseButton();
  }

  internal readonly record struct Entry(string Label, Action Action);
}
