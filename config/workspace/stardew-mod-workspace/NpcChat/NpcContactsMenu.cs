using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;
using StardewModdingAPI;
using StardewValley;
using StardewValley.Menus;

namespace Libala.NpcChat;

internal sealed class NpcContactsMenu : IClickableMenu
{
    private const int VisibleRows = 5;

    private readonly ModConfig config;
    private readonly IMonitor monitor;
    private readonly ConversationStore conversationStore;
    private readonly Func<NPC, NpcProfile> getProfile;
    private readonly List<ContactEntry> allContacts;
    private readonly Dictionary<string, Texture2D> previewPortraits = new(StringComparer.OrdinalIgnoreCase);
    private readonly List<Rectangle> rowBounds = new();
    private Rectangle recentTab;
    private Rectangle allTab;
    private Rectangle closeButton;
    private Rectangle upButton;
    private Rectangle downButton;
    private bool showRecent = true;
    private int scrollIndex;
    private string status = "";

    public NpcContactsMenu(ModConfig config, IMonitor monitor, ConversationStore conversationStore, Func<NPC, NpcProfile> getProfile)
    {
        this.config = config;
        this.monitor = monitor;
        this.conversationStore = conversationStore;
        this.getProfile = getProfile;
        this.allContacts = this.LoadContacts();
        this.Reflow();
    }

    public override void draw(SpriteBatch b)
    {
        b.Draw(Game1.fadeToBlackRect, Game1.graphics.GraphicsDevice.Viewport.Bounds, Color.Black * 0.55f);
        IClickableMenu.drawTextureBox(
            b,
            Game1.menuTexture,
            new Rectangle(0, 256, 60, 60),
            this.xPositionOnScreen,
            this.yPositionOnScreen,
            this.width,
            this.height,
            Color.White,
            1f,
            true
        );

        Utility.drawTextWithShadow(b, "联系人", Game1.dialogueFont, new Vector2(this.xPositionOnScreen + 28, this.yPositionOnScreen + 22), Game1.textColor);
        this.DrawButton(b, this.closeButton, "X", false);
        this.DrawButton(b, this.recentTab, "最近聊天", this.showRecent);
        this.DrawButton(b, this.allTab, "全部居民", !this.showRecent);

        List<ContactEntry> contacts = this.GetVisibleContacts();
        for (int i = 0; i < this.rowBounds.Count; i++)
        {
            int index = this.scrollIndex + i;
            if (index >= contacts.Count)
                break;

            this.DrawContactRow(b, this.rowBounds[i], contacts[index]);
        }

        this.DrawButton(b, this.upButton, "^", false);
        this.DrawButton(b, this.downButton, "v", false);
        if (!string.IsNullOrWhiteSpace(this.status))
        {
            string text = Game1.parseText(this.status, Game1.smallFont, this.width - 70);
            Utility.drawTextWithShadow(b, text, Game1.smallFont, new Vector2(this.xPositionOnScreen + 34, this.yPositionOnScreen + this.height - 47), Color.DarkSlateGray);
        }
        else if (contacts.Count == 0)
            Utility.drawTextWithShadow(b, "还没有最近聊天记录", Game1.smallFont, new Vector2(this.xPositionOnScreen + 42, this.yPositionOnScreen + 190), Game1.textColor);

        this.drawMouse(b);
    }

    public override void receiveLeftClick(int x, int y, bool playSound = true)
    {
        if (this.closeButton.Contains(x, y))
        {
            Game1.playSound("bigDeSelect");
            Game1.activeClickableMenu = null;
            return;
        }

        if (this.recentTab.Contains(x, y))
        {
            this.showRecent = true;
            this.scrollIndex = 0;
            this.status = "";
            Game1.playSound("smallSelect");
            return;
        }

        if (this.allTab.Contains(x, y))
        {
            this.showRecent = false;
            this.scrollIndex = 0;
            this.status = "";
            Game1.playSound("smallSelect");
            return;
        }

        List<ContactEntry> contacts = this.GetVisibleContacts();
        if (this.upButton.Contains(x, y))
        {
            this.scrollIndex = Math.Max(0, this.scrollIndex - 1);
            Game1.playSound("shiny4");
            return;
        }

        if (this.downButton.Contains(x, y))
        {
            this.scrollIndex = Math.Min(Math.Max(0, contacts.Count - VisibleRows), this.scrollIndex + 1);
            Game1.playSound("shiny4");
            return;
        }

        for (int i = 0; i < this.rowBounds.Count; i++)
        {
            int index = this.scrollIndex + i;
            if (index >= contacts.Count || !this.rowBounds[i].Contains(x, y))
                continue;

            ContactEntry contact = contacts[index];
            if (!contact.IsMet)
            {
                this.status = "先在镇上和对方见面吧。";
                Game1.playSound("cancel");
                return;
            }

            Game1.playSound("smallSelect");
            Game1.activeClickableMenu = new NpcChatMenu(
                contact.Npc,
                new NpcContactsMenu(this.config, this.monitor, this.conversationStore, this.getProfile),
                this.config,
                this.monitor,
                this.getProfile(contact.Npc),
                this.conversationStore,
                isRemoteChat: true
            );
            return;
        }
    }

    public override void receiveKeyPress(Keys key)
    {
        if (key == Keys.Escape)
        {
            Game1.activeClickableMenu = null;
            return;
        }

        base.receiveKeyPress(key);
    }

    public override void gameWindowSizeChanged(Rectangle oldBounds, Rectangle newBounds)
    {
        base.gameWindowSizeChanged(oldBounds, newBounds);
        this.Reflow();
    }

    private List<ContactEntry> LoadContacts()
    {
        Dictionary<string, NPC> residents = new(StringComparer.OrdinalIgnoreCase);
        Utility.ForEachVillager(npc =>
        {
            if (npc.CanSocialize && !residents.ContainsKey(npc.Name))
                residents[npc.Name] = npc;

            return true;
        });

        return residents.Values
            .Select(npc =>
            {
                ConversationRecord memory = this.conversationStore.Load(npc.Name);
                return new ContactEntry(
                    npc,
                    Game1.player.friendshipData.ContainsKey(npc.Name),
                    memory.Messages.Count > 0,
                    memory.LastUpdatedUtcTicks
                );
            })
            .OrderByDescending(entry => entry.IsMet)
            .ThenBy(entry => entry.IsMet ? entry.Npc.displayName : entry.Npc.Name)
            .ToList();
    }

    private List<ContactEntry> GetVisibleContacts()
    {
        if (!this.showRecent)
            return this.allContacts;

        return this.allContacts
            .Where(contact => contact.HasChatMemory && contact.IsMet)
            .OrderByDescending(contact => contact.LastUpdatedUtcTicks)
            .ThenBy(contact => contact.Npc.displayName)
            .ToList();
    }

    private void Reflow()
    {
        this.width = Math.Min(660, Math.Max(430, Game1.uiViewport.Width - 58));
        this.height = Math.Min(690, Math.Max(540, Game1.uiViewport.Height - 58));
        this.xPositionOnScreen = (Game1.uiViewport.Width - this.width) / 2;
        this.yPositionOnScreen = (Game1.uiViewport.Height - this.height) / 2;
        this.closeButton = new Rectangle(this.xPositionOnScreen + this.width - 65, this.yPositionOnScreen + 22, 40, 40);
        this.recentTab = new Rectangle(this.xPositionOnScreen + 30, this.yPositionOnScreen + 82, 172, 52);
        this.allTab = new Rectangle(this.xPositionOnScreen + 208, this.yPositionOnScreen + 82, 172, 52);
        this.upButton = new Rectangle(this.xPositionOnScreen + this.width - 70, this.yPositionOnScreen + 154, 42, 42);
        this.downButton = new Rectangle(this.xPositionOnScreen + this.width - 70, this.yPositionOnScreen + this.height - 93, 42, 42);

        this.rowBounds.Clear();
        int rowX = this.xPositionOnScreen + 30;
        int rowWidth = this.width - 118;
        int rowY = this.yPositionOnScreen + 151;
        int rowHeight = Math.Min(86, (this.height - 224) / VisibleRows);
        for (int i = 0; i < VisibleRows; i++)
            this.rowBounds.Add(new Rectangle(rowX, rowY + i * rowHeight, rowWidth, rowHeight - 5));
    }

    private void DrawContactRow(SpriteBatch b, Rectangle bounds, ContactEntry contact)
    {
        b.Draw(Game1.staminaRect, bounds, contact.IsMet ? Color.Wheat * 0.18f : Color.Gray * 0.10f);
        Rectangle portraitBounds = new(bounds.X + 9, bounds.Y + 7, 64, 64);
        try
        {
            Texture2D portrait = this.GetPreviewPortrait(contact.Npc);
            b.Draw(portrait, portraitBounds, new Rectangle(0, 0, 64, 64), contact.IsMet ? Color.White : Color.Black * 0.66f);
        }
        catch
        {
            b.Draw(Game1.staminaRect, portraitBounds, Color.Black * 0.5f);
        }

        string name = contact.IsMet ? contact.Npc.displayName : "???";
        string state = contact.IsMet
            ? (contact.HasChatMemory ? "有聊天记录" : "可以聊天")
            : "尚未认识";
        Utility.drawTextWithShadow(b, name, Game1.dialogueFont, new Vector2(bounds.X + 87, bounds.Y + 10), contact.IsMet ? Game1.textColor : Color.DarkSlateGray);
        Utility.drawTextWithShadow(b, state, Game1.smallFont, new Vector2(bounds.X + 89, bounds.Y + 48), Color.DarkSlateGray);
    }

    private Texture2D GetPreviewPortrait(NPC npc)
    {
        if (this.previewPortraits.TryGetValue(npc.Name, out Texture2D? portrait))
            return portrait;

        try
        {
            portrait = Game1.content.Load<Texture2D>($"Portraits\\{npc.Name}");
        }
        catch
        {
            portrait = npc.Portrait;
        }

        this.previewPortraits[npc.Name] = portrait;
        return portrait;
    }

    private void DrawButton(SpriteBatch b, Rectangle bounds, string label, bool active)
    {
        IClickableMenu.drawTextureBox(b, Game1.menuTexture, new Rectangle(0, 256, 60, 60), bounds.X, bounds.Y, bounds.Width, bounds.Height, active ? Color.White : Color.White * 0.88f, 1f, false);
        Vector2 size = Game1.smallFont.MeasureString(label);
        Utility.drawTextWithShadow(b, label, Game1.smallFont, new Vector2(bounds.X + (bounds.Width - size.X) / 2f, bounds.Y + (bounds.Height - size.Y) / 2f), active ? new Color(43, 85, 116) : Game1.textColor);
    }

    private sealed record ContactEntry(NPC Npc, bool IsMet, bool HasChatMemory, long LastUpdatedUtcTicks);
}
