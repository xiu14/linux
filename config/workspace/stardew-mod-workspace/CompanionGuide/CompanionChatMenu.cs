using System.Collections.Concurrent;
using System.Reflection;
using System.Text;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using Microsoft.Xna.Framework.Input;
using StardewModdingAPI;
using StardewValley;
using StardewValley.Menus;
using StardewValley.Pathfinding;

namespace Libala.CompanionGuide;

internal sealed class CompanionChatMenu : IClickableMenu
{
    private readonly ModConfig config;
    private readonly IMonitor monitor;
    private readonly ConversationStore store;
    private readonly CompanionWorkController work;
    private readonly CompanionGiftController gifts;
    private readonly CompanionLoanController loans;
    private readonly CompanionActor actor;
    private readonly Action saveSettings;
    private readonly ApiChatClient client;
    private readonly CancellationTokenSource cancellationToken = new();
    private readonly ConcurrentQueue<Action> completedRequests = new();
    private readonly List<ChatMessage> conversation = new();
    private ConversationRecord memory;
    private TextBox inputBox = null!;
    private Rectangle messagesArea;
    private Rectangle settingsArea;
    private Rectangle sendButton;
    private Rectangle acceptGiftButton;
    private Rectangle cancelGiftButton;
    private Rectangle scrollUpButton;
    private Rectangle scrollDownButton;
    private Rectangle stopWorkButton;
    private Rectangle closeButton;
    private Rectangle chatTabButton;
    private Rectangle settingsTabButton;
    private Rectangle teleportTabButton;
    private Rectangle identityTabButton;
    private Rectangle appearanceTabButton;
    private Rectangle fishingTabButton;
    private Rectangle editNameButton;
    private Rectangle editPersonaButton;
    private Rectangle genderButton;
    private readonly Rectangle[] minusButtons = new Rectangle[5];
    private readonly Rectangle[] plusButtons = new Rectangle[5];
    private readonly Rectangle[] fishingToggleButtons = new Rectangle[4];
    private readonly Rectangle[] fishingMinusButtons = new Rectangle[2];
    private readonly Rectangle[] fishingPlusButtons = new Rectangle[2];
    private readonly List<Rectangle> teleportRowButtons = new();
    private readonly Rectangle[] teleportCategoryButtons = new Rectangle[4];
    private readonly List<NPC> teleportResidents = new();
    private readonly List<TeleportPlace> teleportPlaces = new()
    {
        TeleportPlace.Home("回家", TeleportPlaceCategory.Common),
        TeleportPlace.Direct("巴士站", TeleportPlaceCategory.Common, "BusStop"),
        TeleportPlace.Direct("镇中心", TeleportPlaceCategory.Common, "Town", new Point(47, 82)),
        TeleportPlace.Direct("山区", TeleportPlaceCategory.Common, "Mountain"),
        TeleportPlace.Direct("森林", TeleportPlaceCategory.Common, "Forest"),
        TeleportPlace.Direct("海滩", TeleportPlaceCategory.Common, "Beach"),
        TeleportPlace.Direct("铁路", TeleportPlaceCategory.Common, "Railroad"),
        TeleportPlace.Direct("沙漠", TeleportPlaceCategory.Common, "Desert"),
        TeleportPlace.Door("杂货铺门外", TeleportPlaceCategory.Town, "Town", "SeedShop"),
        TeleportPlace.Door("酒吧门外", TeleportPlaceCategory.Town, "Town", "Saloon"),
        TeleportPlace.Door("铁匠铺门外", TeleportPlaceCategory.Town, "Town", "Blacksmith"),
        TeleportPlace.Door("博物馆门外", TeleportPlaceCategory.Town, "Town", "ArchaeologyHouse"),
        TeleportPlace.Door("医院门外", TeleportPlaceCategory.Town, "Town", "Hospital"),
        TeleportPlace.Door("社区中心门外", TeleportPlaceCategory.Town, "Town", "CommunityCenter"),
        TeleportPlace.Door("Joja超市门外", TeleportPlaceCategory.Town, "Town", "JojaMart"),
        TeleportPlace.Door("电影院门外", TeleportPlaceCategory.Town, "Town", "MovieTheater"),
        TeleportPlace.Door("镇长家门外", TeleportPlaceCategory.Town, "Town", "ManorHouse"),
        TeleportPlace.Door("艾米丽家门外", TeleportPlaceCategory.Town, "Town", "HaleyHouse"),
        TeleportPlace.Door("山姆家门外", TeleportPlaceCategory.Town, "Town", "SamHouse"),
        TeleportPlace.Door("亚历克斯家门外", TeleportPlaceCategory.Town, "Town", "JoshHouse"),
        TeleportPlace.Door("潘姆家门外", TeleportPlaceCategory.Town, "Town", "Trailer"),
        TeleportPlace.Door("下水道入口", TeleportPlaceCategory.Town, "Town", "Sewer"),
        TeleportPlace.Door("木匠店门外", TeleportPlaceCategory.Wild, "Mountain", "ScienceHouse"),
        TeleportPlace.Direct("矿井入口", TeleportPlaceCategory.Wild, "Mine"),
        TeleportPlace.Direct("冒险家公会", TeleportPlaceCategory.Wild, "AdventureGuild"),
        TeleportPlace.Door("莱纳斯帐篷门外", TeleportPlaceCategory.Wild, "Mountain", "Tent"),
        TeleportPlace.Door("温泉门外", TeleportPlaceCategory.Wild, "Railroad", "BathHouse_Entry"),
        TeleportPlace.Door("鱼店门外", TeleportPlaceCategory.Wild, "Beach", "FishShop"),
        TeleportPlace.Door("艾利欧特小屋门外", TeleportPlaceCategory.Wild, "Beach", "ElliottHouse"),
        TeleportPlace.Door("玛妮牧场门外", TeleportPlaceCategory.Wild, "Forest", "AnimalShop"),
        TeleportPlace.Door("莉亚小屋门外", TeleportPlaceCategory.Wild, "Forest", "LeahHouse"),
        TeleportPlace.Door("法师塔门外", TeleportPlaceCategory.Wild, "Forest", "WizardHouse"),
        TeleportPlace.Door("沙漠商店门外", TeleportPlaceCategory.Wild, "Desert", "SandyHouse"),
        TeleportPlace.Direct("姜岛南部", TeleportPlaceCategory.Island, "IslandSouth", new Point(17, 43)),
        TeleportPlace.Direct("姜岛西部", TeleportPlaceCategory.Island, "IslandWest"),
        TeleportPlace.Direct("姜岛北部", TeleportPlaceCategory.Island, "IslandNorth"),
        TeleportPlace.Direct("姜岛东部", TeleportPlaceCategory.Island, "IslandEast"),
        TeleportPlace.Door("姜岛农舍门外", TeleportPlaceCategory.Island, "IslandWest", "IslandFarmHouse"),
        TeleportPlace.Door("岛屿办事处门外", TeleportPlaceCategory.Island, "IslandNorth", "IslandFieldOffice"),
        TeleportPlace.Door("火山门外", TeleportPlaceCategory.Island, "IslandNorth", "VolcanoEntrance"),
        TeleportPlace.Door("齐先生核桃房门外", TeleportPlaceCategory.Island, "IslandWest", "QiNutRoom")
    };
    private Rectangle teleportPlacesTabButton;
    private Rectangle teleportResidentsTabButton;
    private Rectangle teleportUpButton;
    private Rectangle teleportDownButton;
    private bool waitingForReply;
    private bool openingMobileInput;
    private bool isClosed;
    private bool showSettings;
    private bool showTeleport;
    private bool showTeleportResidents;
    private bool showAppearanceSettings;
    private bool showFishingSettings;
    private CompanionGiftOffer? pendingGift;
    private CompanionLoanOffer? pendingLoan;
    private int scrollLineOffset;
    private int teleportOffset;
    private TeleportPlaceCategory teleportCategory = TeleportPlaceCategory.Common;
    private string status = "";
    private string settingsStatus = "修改后立即保存";
    private string teleportStatus = "选择目的地";

    public CompanionChatMenu(ModConfig config, IMonitor monitor, ConversationStore store, CompanionWorkController work, CompanionGiftController gifts, CompanionLoanController loans, CompanionActor actor, Action saveSettings, bool openTeleport = false)
    {
        this.config = config;
        this.monitor = monitor;
        this.store = store;
        this.work = work;
        this.gifts = gifts;
        this.loans = loans;
        this.actor = actor;
        this.saveSettings = saveSettings;
        this.client = new ApiChatClient(config);
        this.memory = config.EnableMemory ? store.Load() : new ConversationRecord();
        this.conversation.AddRange(this.memory.Messages);
        this.showTeleport = openTeleport;
        if (this.showTeleport)
            this.LoadTeleportResidents();
        this.Reflow();
        this.status = this.conversation.Count == 0 ? "输入内容开始聊天" : "已载入此前记忆";
    }

    public override void update(GameTime time)
    {
        base.update(time);
        while (this.completedRequests.TryDequeue(out Action? action))
            action();
        this.inputBox.Update();
    }

    public override void draw(SpriteBatch b)
    {
        b.Draw(Game1.fadeToBlackRect, Game1.graphics.GraphicsDevice.Viewport.Bounds, Color.Black * 0.55f);
        IClickableMenu.drawTextureBox(b, Game1.menuTexture, new Rectangle(0, 256, 60, 60), this.xPositionOnScreen, this.yPositionOnScreen, this.width, this.height, Color.White, 1f, true);
        Utility.drawTextWithShadow(b, $"{this.config.CompanionName} - 陪伴", Game1.dialogueFont, new Vector2(this.xPositionOnScreen + 28, this.yPositionOnScreen + 22), Game1.textColor);
        this.DrawButton(b, this.closeButton, "X");
        this.DrawButton(b, this.chatTabButton, "聊天", !this.showSettings && !this.showTeleport);
        this.DrawButton(b, this.settingsTabButton, "设置", this.showSettings);
        this.DrawButton(b, this.teleportTabButton, "传送", this.showTeleport);
        this.DrawButton(b, this.stopWorkButton, "停止工作");

        if (this.showTeleport)
            this.DrawTeleport(b);
        else if (this.showSettings)
            this.DrawSettings(b);
        else
            this.DrawChat(b);

        this.drawMouse(b);
    }

    public override void receiveLeftClick(int x, int y, bool playSound = true)
    {
        if (this.closeButton.Contains(x, y))
        {
            Game1.playSound("bigDeSelect");
            this.Close();
            return;
        }

        if (this.chatTabButton.Contains(x, y))
        {
            this.showSettings = false;
            this.showTeleport = false;
            Game1.playSound("smallSelect");
            return;
        }

        if (this.settingsTabButton.Contains(x, y))
        {
            this.showSettings = true;
            this.showTeleport = false;
            this.ReleaseChatInput();
            Game1.playSound("smallSelect");
            return;
        }

        if (this.teleportTabButton.Contains(x, y))
        {
            this.showSettings = false;
            this.showTeleport = true;
            this.ReleaseChatInput();
            this.LoadTeleportResidents();
            Game1.playSound("smallSelect");
            return;
        }

        if (this.stopWorkButton.Contains(x, y))
        {
            this.work.Stop();
            this.actor.CancelMovement();
            this.status = this.work.Status;
            this.settingsStatus = this.work.Status;
            Game1.playSound("smallSelect");
            return;
        }

        if (this.showTeleport)
        {
            this.ReceiveTeleportClick(x, y);
            return;
        }

        if (this.showSettings)
        {
            this.ReceiveSettingsClick(x, y);
            return;
        }

        if (this.scrollUpButton.Contains(x, y))
        {
            this.ScrollConversation(1);
            return;
        }

        if (this.scrollDownButton.Contains(x, y))
        {
            this.ScrollConversation(-1);
            return;
        }

        if (this.pendingGift is not null && this.acceptGiftButton.Contains(x, y))
        {
            string response = this.gifts.Accept(this.pendingGift);
            this.pendingGift = null;
            this.conversation.Add(new ChatMessage("assistant", response));
            this.status = "";
            this.scrollLineOffset = 0;
            this.SaveMemory();
            return;
        }

        if (this.pendingLoan is not null && this.acceptGiftButton.Contains(x, y))
        {
            string response = this.loans.Accept(this.pendingLoan);
            this.pendingLoan = null;
            this.conversation.Add(new ChatMessage("assistant", response));
            this.status = "";
            this.scrollLineOffset = 0;
            this.SaveMemory();
            return;
        }

        if ((this.pendingGift is not null || this.pendingLoan is not null) && this.cancelGiftButton.Contains(x, y))
        {
            this.pendingGift = null;
            this.pendingLoan = null;
            this.conversation.Add(new ChatMessage("assistant", "好，这次就算了。"));
            this.status = "";
            this.scrollLineOffset = 0;
            this.SaveMemory();
            Game1.playSound("bigDeSelect");
            return;
        }

        if (this.sendButton.Contains(x, y))
        {
            this.SendCurrentText();
            return;
        }

        Rectangle inputBounds = new(this.inputBox.X, this.inputBox.Y, this.inputBox.Width, 52);
        this.inputBox.Selected = inputBounds.Contains(x, y);
        if (this.inputBox.Selected)
        {
            Game1.keyboardDispatcher.Subscriber = this.inputBox;
            if (!this.TryOpenMobileTextInput($"{this.config.CompanionName} - 陪伴", "输入你想说的话", this.inputBox.Text, entered => this.inputBox.Text = entered))
                Game1.showTextEntry(this.inputBox);
        }
    }

    public override void receiveKeyPress(Keys key)
    {
        if (key == Keys.Escape)
        {
            this.Close();
            return;
        }

        if (key == Keys.Enter && !this.showSettings && !this.showTeleport)
        {
            this.SendCurrentText();
            return;
        }

        base.receiveKeyPress(key);
    }

    public override void gameWindowSizeChanged(Rectangle oldBounds, Rectangle newBounds)
    {
        base.gameWindowSizeChanged(oldBounds, newBounds);
        this.Reflow();
    }

    private void Reflow()
    {
        this.width = Math.Min(900, Math.Max(420, Game1.uiViewport.Width - 64));
        this.height = Math.Min(680, Math.Max(420, Game1.uiViewport.Height - 64));
        this.xPositionOnScreen = (Game1.uiViewport.Width - this.width) / 2;
        this.yPositionOnScreen = (Game1.uiViewport.Height - this.height) / 2;
        this.closeButton = new Rectangle(this.xPositionOnScreen + this.width - 68, this.yPositionOnScreen + 20, 42, 42);
        this.chatTabButton = new Rectangle(this.xPositionOnScreen + 28, this.yPositionOnScreen + 78, 58, 44);
        this.settingsTabButton = new Rectangle(this.xPositionOnScreen + 90, this.yPositionOnScreen + 78, 58, 44);
        this.teleportTabButton = new Rectangle(this.xPositionOnScreen + 152, this.yPositionOnScreen + 78, 58, 44);
        this.stopWorkButton = new Rectangle(this.xPositionOnScreen + 214, this.yPositionOnScreen + 78, 88, 44);
        this.messagesArea = new Rectangle(this.xPositionOnScreen + 28, this.yPositionOnScreen + 134, this.width - 56, this.height - 234);
        this.settingsArea = new Rectangle(this.xPositionOnScreen + 28, this.yPositionOnScreen + 134, this.width - 56, this.height - 160);
        this.sendButton = new Rectangle(this.xPositionOnScreen + this.width - 144, this.yPositionOnScreen + this.height - 76, 112, 52);
        this.acceptGiftButton = new Rectangle(this.xPositionOnScreen + this.width - 264, this.yPositionOnScreen + this.height - 76, 112, 52);
        this.cancelGiftButton = this.sendButton;
        this.scrollUpButton = new Rectangle(this.messagesArea.Right - 50, this.messagesArea.Y + 10, 40, 38);
        this.scrollDownButton = new Rectangle(this.messagesArea.Right - 50, this.messagesArea.Y + 54, 40, 38);
        this.identityTabButton = new Rectangle(this.settingsArea.X + 16, this.settingsArea.Y + 12, 88, 40);
        this.appearanceTabButton = new Rectangle(this.settingsArea.X + 110, this.settingsArea.Y + 12, 88, 40);
        this.fishingTabButton = new Rectangle(this.settingsArea.X + 204, this.settingsArea.Y + 12, 88, 40);
        this.editNameButton = new Rectangle(this.settingsArea.Right - 112, this.settingsArea.Y + 68, 94, 40);
        this.editPersonaButton = new Rectangle(this.settingsArea.Right - 112, this.settingsArea.Y + 138, 94, 40);
        this.genderButton = new Rectangle(this.settingsArea.X + 106, this.settingsArea.Y + 77, 116, 40);
        this.teleportPlacesTabButton = new Rectangle(this.settingsArea.X + 16, this.settingsArea.Y + 14, 110, 42);
        this.teleportResidentsTabButton = new Rectangle(this.settingsArea.X + 134, this.settingsArea.Y + 14, 110, 42);
        int categoryY = this.settingsArea.Y + 62;
        int categoryGap = 6;
        int categoryWidth = Math.Max(56, (this.settingsArea.Width - 32 - 3 * categoryGap) / 4);
        for (int i = 0; i < this.teleportCategoryButtons.Length; i++)
            this.teleportCategoryButtons[i] = new Rectangle(this.settingsArea.X + 16 + i * (categoryWidth + categoryGap), categoryY, categoryWidth, 38);
        this.teleportUpButton = new Rectangle(this.settingsArea.Right - 56, this.settingsArea.Y + 106, 40, 38);
        this.teleportDownButton = new Rectangle(this.settingsArea.Right - 56, this.settingsArea.Bottom - 51, 40, 38);
        int teleportY = this.settingsArea.Y + 107;
        int teleportAvailableHeight = this.settingsArea.Bottom - 50 - teleportY;
        int teleportRows = Math.Min(8, Math.Max(3, teleportAvailableHeight / 48));
        int teleportRowHeight = Math.Max(38, Math.Min(50, teleportAvailableHeight / teleportRows));
        this.teleportRowButtons.Clear();
        for (int i = 0; i < teleportRows; i++)
            this.teleportRowButtons.Add(new Rectangle(this.settingsArea.X + 16, teleportY + i * teleportRowHeight, this.settingsArea.Width - 82, teleportRowHeight - 5));
        int teleportCount = this.showTeleportResidents ? this.teleportResidents.Count : this.GetVisibleTeleportPlaces().Count;
        this.teleportOffset = Math.Min(this.teleportOffset, Math.Max(0, teleportCount - this.teleportRowButtons.Count));
        int leftX = this.settingsArea.X + 18;
        int rightX = this.settingsArea.X + this.settingsArea.Width / 2 + 6;
        int rowY = this.settingsArea.Y + 132;
        this.SetStepperBounds(0, leftX, rowY);
        this.SetStepperBounds(1, rightX, rowY);
        this.SetStepperBounds(2, leftX, rowY + 44);
        this.SetStepperBounds(3, rightX, rowY + 44);
        this.SetStepperBounds(4, leftX, rowY + 88);
        int fishingY = this.settingsArea.Y + 70;
        for (int i = 0; i < this.fishingToggleButtons.Length; i++)
            this.fishingToggleButtons[i] = new Rectangle(this.settingsArea.X + 20, fishingY + i * 46, Math.Min(280, this.settingsArea.Width - 40), 38);
        int chanceY = fishingY + this.fishingToggleButtons.Length * 46 + 8;
        this.SetFishingChanceBounds(0, this.settingsArea.X + 20, chanceY);
        this.SetFishingChanceBounds(1, this.settingsArea.X + 20, chanceY + 46);
        this.inputBox = new TextBox(null, null, Game1.smallFont, Game1.textColor)
        {
            X = this.xPositionOnScreen + 34,
            Y = this.yPositionOnScreen + this.height - 75,
            Width = this.width - 196,
            Text = this.inputBox?.Text ?? ""
        };
    }

    private void DrawChat(SpriteBatch b)
    {
        b.Draw(Game1.staminaRect, this.messagesArea, Color.Wheat * 0.18f);
        this.DrawConversation(b);
        this.DrawButton(b, this.scrollUpButton, "上");
        this.DrawButton(b, this.scrollDownButton, "下");

        string loanSummary = this.loans.GetSummary();
        string footer = string.IsNullOrWhiteSpace(this.status)
            ? loanSummary
            : string.IsNullOrWhiteSpace(loanSummary) ? this.status : $"{this.status}  {loanSummary}";
        if (!string.IsNullOrWhiteSpace(footer))
            Utility.drawTextWithShadow(b, Game1.parseText(footer, Game1.smallFont, this.messagesArea.Width - 34), Game1.smallFont, new Vector2(this.messagesArea.X + 16, this.messagesArea.Bottom - 38), Color.DarkSlateGray);

        if (this.pendingGift is not null || this.pendingLoan is not null)
        {
            this.DrawButton(b, this.acceptGiftButton, "收下", true);
            this.DrawButton(b, this.cancelGiftButton, "取消");
        }
        else
        {
            this.inputBox.Draw(b);
            this.DrawButton(b, this.sendButton, this.waitingForReply ? "..." : "发送");
        }
    }

    private void DrawSettings(SpriteBatch b)
    {
        b.Draw(Game1.staminaRect, this.settingsArea, Color.Wheat * 0.18f);
        this.DrawButton(b, this.identityTabButton, "身份", !this.showAppearanceSettings && !this.showFishingSettings);
        this.DrawButton(b, this.appearanceTabButton, "外形", this.showAppearanceSettings);
        this.DrawButton(b, this.fishingTabButton, "钓鱼", this.showFishingSettings);
        if (this.showFishingSettings)
            this.DrawFishingSettings(b);
        else if (this.showAppearanceSettings)
            this.DrawAppearanceSettings(b);
        else
            this.DrawIdentitySettings(b);

        Utility.drawTextWithShadow(b, this.settingsStatus, Game1.smallFont, new Vector2(this.settingsArea.Right - 128, this.settingsArea.Y + 22), Color.DarkSlateGray);
    }

    private void DrawTeleport(SpriteBatch b)
    {
        b.Draw(Game1.staminaRect, this.settingsArea, Color.Wheat * 0.18f);
        this.DrawButton(b, this.teleportPlacesTabButton, "地点", !this.showTeleportResidents);
        this.DrawButton(b, this.teleportResidentsTabButton, "居民", this.showTeleportResidents);
        if (!this.showTeleportResidents)
        {
            for (int i = 0; i < this.teleportCategoryButtons.Length; i++)
            {
                TeleportPlaceCategory category = (TeleportPlaceCategory)i;
                this.DrawButton(b, this.teleportCategoryButtons[i], GetTeleportCategoryLabel(category), this.teleportCategory == category);
            }
        }
        this.DrawButton(b, this.teleportUpButton, "上");
        this.DrawButton(b, this.teleportDownButton, "下");

        List<TeleportPlace> visiblePlaces = this.GetVisibleTeleportPlaces();
        for (int i = 0; i < this.teleportRowButtons.Count; i++)
        {
            int index = this.teleportOffset + i;
            if (this.showTeleportResidents)
            {
                if (index >= this.teleportResidents.Count)
                    continue;

                NPC npc = this.teleportResidents[index];
                bool knownPosition = npc.currentLocation is not null;
                string label = npc.currentLocation?.IsOutdoors == true ? npc.displayName : $"{npc.displayName}（到门外）";
                this.DrawButton(b, this.teleportRowButtons[i], label, knownPosition);
            }
            else
            {
                if (index >= visiblePlaces.Count)
                    continue;

                this.DrawButton(b, this.teleportRowButtons[i], visiblePlaces[index].Label);
            }
        }

        string text = Game1.parseText(this.teleportStatus, Game1.smallFont, this.settingsArea.Width - 34);
        Utility.drawTextWithShadow(b, text, Game1.smallFont, new Vector2(this.settingsArea.X + 18, this.settingsArea.Bottom - 34), Color.DarkSlateGray);
    }

    private void ReceiveTeleportClick(int x, int y)
    {
        if (this.teleportPlacesTabButton.Contains(x, y))
        {
            this.showTeleportResidents = false;
            this.teleportOffset = 0;
            this.teleportStatus = "选择目的地";
            Game1.playSound("smallSelect");
            return;
        }

        if (this.teleportResidentsTabButton.Contains(x, y))
        {
            this.showTeleportResidents = true;
            this.teleportOffset = 0;
            this.teleportStatus = this.teleportResidents.Count == 0 ? "还没有认识可以寻找的居民" : "室内居民将传送到所在建筑门外";
            Game1.playSound("smallSelect");
            return;
        }

        if (!this.showTeleportResidents)
        {
            for (int i = 0; i < this.teleportCategoryButtons.Length; i++)
            {
                if (!this.teleportCategoryButtons[i].Contains(x, y))
                    continue;

                this.teleportCategory = (TeleportPlaceCategory)i;
                this.teleportOffset = 0;
                this.teleportStatus = "选择目的地";
                Game1.playSound("smallSelect");
                return;
            }
        }

        if (this.teleportUpButton.Contains(x, y))
        {
            this.teleportOffset = Math.Max(0, this.teleportOffset - this.teleportRowButtons.Count);
            Game1.playSound("shwip");
            return;
        }

        if (this.teleportDownButton.Contains(x, y))
        {
            int count = this.showTeleportResidents ? this.teleportResidents.Count : this.GetVisibleTeleportPlaces().Count;
            int maxOffset = Math.Max(0, count - this.teleportRowButtons.Count);
            this.teleportOffset = Math.Min(maxOffset, this.teleportOffset + this.teleportRowButtons.Count);
            Game1.playSound("shwip");
            return;
        }

        for (int i = 0; i < this.teleportRowButtons.Count; i++)
        {
            int index = this.teleportOffset + i;
            if (!this.teleportRowButtons[i].Contains(x, y))
                continue;

            if (!this.showTeleportResidents)
            {
                List<TeleportPlace> visiblePlaces = this.GetVisibleTeleportPlaces();
                if (index < visiblePlaces.Count)
                    this.TryTeleportPlace(visiblePlaces[index]);
                return;
            }

            if (index >= this.teleportResidents.Count)
                return;

            NPC npc = this.teleportResidents[index];
            if (npc.currentLocation is null)
            {
                this.teleportStatus = "目前找不到对方的位置";
                return;
            }

            if (npc.currentLocation.IsOutdoors)
            {
                if (!this.TryTeleport(npc.currentLocation, npc.TilePoint))
                    this.teleportStatus = "对方附近暂时没有安全的落脚位置";
                return;
            }

            if (!this.TryTeleportOutside(npc.currentLocation))
                this.teleportStatus = "暂时找不到对方所在建筑的室外入口";
            return;
        }
    }

    private void LoadTeleportResidents()
    {
        this.teleportResidents.Clear();
        Utility.ForEachVillager(npc =>
        {
            if (npc.CanSocialize && Game1.player.friendshipData.ContainsKey(npc.Name))
                this.teleportResidents.Add(npc);
            return true;
        });
        this.teleportResidents.Sort((first, second) => string.Compare(first.displayName, second.displayName, StringComparison.CurrentCulture));
        this.teleportOffset = 0;
        this.teleportStatus = this.showTeleportResidents
            ? (this.teleportResidents.Count == 0 ? "还没有认识可以寻找的居民" : "室内居民将传送到所在建筑门外")
            : "选择目的地";
    }

    private List<TeleportPlace> GetVisibleTeleportPlaces()
    {
        return this.teleportPlaces.Where(place => place.Category == this.teleportCategory).ToList();
    }

    private static string GetTeleportCategoryLabel(TeleportPlaceCategory category)
    {
        return category switch
        {
            TeleportPlaceCategory.Common => "常用",
            TeleportPlaceCategory.Town => "镇上",
            TeleportPlaceCategory.Wild => "山林",
            TeleportPlaceCategory.Island => "岛屿",
            _ => "地点"
        };
    }

    private void TryTeleportPlace(TeleportPlace place)
    {
        if (place.Kind == TeleportPlaceKind.Home)
        {
            Farm farm = Game1.getFarm();
            Point homeDoorway = farm.GetMainFarmHouseEntry();
            if (!this.TryTeleport(farm, homeDoorway))
                this.teleportStatus = "暂时找不到农舍门外的落脚位置";
            return;
        }

        if (place.Kind == TeleportPlaceKind.Direct)
        {
            GameLocation? location = Game1.getLocationFromName(place.LocationName!);
            if (location is null)
            {
                this.teleportStatus = $"暂时找不到{place.Label}";
                return;
            }

            Point target = place.TargetTile ?? GetDefaultTeleportTarget(location);
            if (!this.TryTeleport(location, target))
                this.teleportStatus = $"暂时找不到{place.Label}的落脚位置";
            return;
        }

        GameLocation? outside = Game1.getLocationFromName(place.LocationName!);
        Point doorway = outside?.getWarpPointTo(place.InteriorLocation!, Game1.player) ?? Point.Zero;
        if (outside is not null && doorway != Point.Zero && this.TryTeleport(outside, doorway))
            return;

        GameLocation? interior = Game1.getLocationFromName(place.InteriorLocation!);
        if (interior is not null && this.TryTeleport(interior, GetDefaultTeleportTarget(interior)))
            return;

        this.teleportStatus = $"暂时找不到{place.Label}的落脚位置";
    }

    private bool TryTeleport(GameLocation location, Point target)
    {
        Point? destination = this.FindSafeTile(location, target);
        if (!destination.HasValue)
            return false;

        this.work.Stop("");
        this.actor.CancelMovement();
        this.Close();
        Game1.warpFarmer(location.NameOrUniqueName, destination.Value.X, destination.Value.Y, Game1.player.FacingDirection, location.isStructure.Value);
        return true;
    }

    private bool TryTeleportOutside(GameLocation indoor)
    {
        if (!this.TryFindOutsideEntrance(indoor, out GameLocation? outside, out Point doorway) || outside is null)
            return false;

        return this.TryTeleport(outside, doorway);
    }

    private bool TryFindOutsideEntrance(GameLocation indoor, out GameLocation? outside, out Point doorway)
    {
        outside = null;
        doorway = Point.Zero;
        List<GameLocation> outdoors = Game1.locations.Where(location => location.IsOutdoors).ToList();
        foreach (GameLocation location in outdoors)
        {
            Point entry = this.GetWarpPointTo(location, indoor);
            if (entry != Point.Zero)
            {
                outside = location;
                doorway = entry;
                return true;
            }
        }

        try
        {
            WarpPathfindingCache.PopulateCache();
            (GameLocation Outside, Point Doorway, int Length)? shortest = null;
            foreach (GameLocation location in outdoors)
            {
                string[]? route = WarpPathfindingCache.GetLocationRoute(location.NameOrUniqueName, indoor.NameOrUniqueName, Game1.player.Gender);
                if (route is null && !string.Equals(indoor.Name, indoor.NameOrUniqueName, StringComparison.OrdinalIgnoreCase))
                    route = WarpPathfindingCache.GetLocationRoute(location.NameOrUniqueName, indoor.Name, Game1.player.Gender);

                if (route is not { Length: > 1 })
                    continue;

                Point entry = location.getWarpPointTo(route[1], Game1.player);
                if (entry == Point.Zero)
                    continue;

                if (!shortest.HasValue || route.Length < shortest.Value.Length)
                    shortest = (location, entry, route.Length);
            }

            if (shortest.HasValue)
            {
                outside = shortest.Value.Outside;
                doorway = shortest.Value.Doorway;
                return true;
            }
        }
        catch
        {
            return false;
        }

        return false;
    }

    private Point GetWarpPointTo(GameLocation outside, GameLocation indoor)
    {
        Point doorway = outside.getWarpPointTo(indoor.NameOrUniqueName, Game1.player);
        if (doorway == Point.Zero && !string.Equals(indoor.Name, indoor.NameOrUniqueName, StringComparison.OrdinalIgnoreCase))
            doorway = outside.getWarpPointTo(indoor.Name, Game1.player);
        return doorway;
    }

    private static Point GetDefaultTeleportTarget(GameLocation location)
    {
        Warp? firstWarp = location.GetFirstPlayerWarp();
        return firstWarp is null ? Point.Zero : new Point(firstWarp.X, firstWarp.Y);
    }

    private Point? FindSafeTile(GameLocation location, Point target)
    {
        return Enumerable.Range(0, 9)
            .SelectMany(radius => GetTilesAtRadius(target, radius))
            .Distinct()
            .Where(candidate =>
            {
                return this.IsSafeTeleportTile(location, candidate);
            })
            .Cast<Point?>()
            .FirstOrDefault();
    }

    private bool IsSafeTeleportTile(GameLocation location, Point candidate)
    {
        if (!location.isTileOnMap(candidate))
            return false;

        Rectangle feet = new(candidate.X * Game1.tileSize + 8, candidate.Y * Game1.tileSize + 32, Game1.tileSize - 16, 28);
        return !location.isCollidingPosition(feet, Game1.viewport, true, 0, false, Game1.player, false);
    }

    private static IEnumerable<Point> GetTilesAtRadius(Point center, int radius)
    {
        if (radius == 0)
        {
            yield return center;
            yield break;
        }

        for (int dx = -radius; dx <= radius; dx++)
        {
            int dy = radius - Math.Abs(dx);
            yield return new Point(center.X + dx, center.Y + dy);
            if (dy != 0)
                yield return new Point(center.X + dx, center.Y - dy);
        }
    }

    private enum TeleportPlaceCategory
    {
        Common,
        Town,
        Wild,
        Island
    }

    private enum TeleportPlaceKind
    {
        Home,
        Door,
        Direct
    }

    private sealed record TeleportPlace(string Label, TeleportPlaceCategory Category, TeleportPlaceKind Kind, string? LocationName, string? InteriorLocation, Point? TargetTile)
    {
        public static TeleportPlace Home(string label, TeleportPlaceCategory category) => new(label, category, TeleportPlaceKind.Home, null, null, null);

        public static TeleportPlace Door(string label, TeleportPlaceCategory category, string outsideLocation, string interiorLocation) => new(label, category, TeleportPlaceKind.Door, outsideLocation, interiorLocation, null);

        public static TeleportPlace Direct(string label, TeleportPlaceCategory category, string locationName, Point? targetTile = null) => new(label, category, TeleportPlaceKind.Direct, locationName, null, targetTile);
    }

    private void DrawIdentitySettings(SpriteBatch b)
    {
        this.actor.DrawPortrait(b, new Rectangle(this.settingsArea.X + 20, this.settingsArea.Y + 68, 64, 64));
        Utility.drawTextWithShadow(b, "名字", Game1.smallFont, new Vector2(this.settingsArea.X + 104, this.settingsArea.Y + 68), Color.DarkSlateGray);
        string name = Game1.parseText(this.config.CompanionName, Game1.dialogueFont, Math.Max(90, this.settingsArea.Width - 238));
        Utility.drawTextWithShadow(b, name, Game1.dialogueFont, new Vector2(this.settingsArea.X + 104, this.settingsArea.Y + 91), Game1.textColor);
        this.DrawButton(b, this.editNameButton, "修改");

        Utility.drawTextWithShadow(b, "人设", Game1.smallFont, new Vector2(this.settingsArea.X + 20, this.settingsArea.Y + 144), Color.DarkSlateGray);
        this.DrawButton(b, this.editPersonaButton, "修改");
        string persona = this.config.Persona.Length > 115 ? this.config.Persona[..115] + "..." : this.config.Persona;
        persona = Game1.parseText(persona, Game1.smallFont, this.settingsArea.Width - 40);
        Utility.drawTextWithShadow(b, persona, Game1.smallFont, new Vector2(this.settingsArea.X + 20, this.settingsArea.Y + 188), Game1.textColor);
    }

    private void DrawAppearanceSettings(SpriteBatch b)
    {
        this.actor.DrawPortrait(b, new Rectangle(this.settingsArea.X + 20, this.settingsArea.Y + 68, 64, 64));
        Utility.drawTextWithShadow(b, "体型", Game1.smallFont, new Vector2(this.settingsArea.X + 106, this.settingsArea.Y + 60), Color.DarkSlateGray);
        this.DrawButton(b, this.genderButton, this.config.IsMale ? "男性" : "女性");
        this.DrawStepper(b, 0, "发型", this.config.HairStyle.ToString());
        this.DrawStepper(b, 1, "肤色", this.config.Skin.ToString());
        this.DrawStepper(b, 2, "上衣", this.config.Shirt);
        this.DrawStepper(b, 3, "裤子", this.config.Pants);
        this.DrawStepper(b, 4, "鞋子", this.config.Shoes);
    }

    private void DrawFishingSettings(SpriteBatch b)
    {
        this.DrawButton(b, this.fishingToggleButtons[0], $"辅助：{OnOff(this.config.FishingAssistEnabled)}", this.config.FishingAssistEnabled);
        this.DrawButton(b, this.fishingToggleButtons[1], $"跳过小游戏：{OnOff(this.config.FishingSkipMinigame)}", this.config.FishingSkipMinigame);
        this.DrawButton(b, this.fishingToggleButtons[2], $"自动咬钩：{OnOff(this.config.FishingAutoHook)}", this.config.FishingAutoHook);
        this.DrawButton(b, this.fishingToggleButtons[3], $"无限鱼饵：{OnOff(this.config.FishingInfiniteBait)}", this.config.FishingInfiniteBait);
        this.DrawFishingChanceControl(b, 0, "成功率", this.config.FishingSuccessChance);
        this.DrawFishingChanceControl(b, 1, "宝箱率", this.config.FishingTreasureChance);
    }

    private void DrawFishingChanceControl(SpriteBatch b, int index, string label, int value)
    {
        Rectangle minus = this.fishingMinusButtons[index];
        Rectangle plus = this.fishingPlusButtons[index];
        Utility.drawTextWithShadow(b, label, Game1.smallFont, new Vector2(this.settingsArea.X + 24, minus.Y + 8), Color.DarkSlateGray);
        this.DrawButton(b, minus, "-");
        this.DrawButton(b, plus, "+");
        string text = $"{value}%";
        Vector2 size = Game1.smallFont.MeasureString(text);
        Utility.drawTextWithShadow(b, text, Game1.smallFont, new Vector2(minus.Right + 10 + (plus.X - minus.Right - 20 - size.X) / 2f, minus.Y + 8), Game1.textColor);
    }

    private void DrawStepper(SpriteBatch b, int index, string label, string value)
    {
        Rectangle minus = this.minusButtons[index];
        Rectangle plus = this.plusButtons[index];
        Utility.drawTextWithShadow(b, label, Game1.smallFont, new Vector2(minus.X - 2, minus.Y + 8), Color.DarkSlateGray);
        this.DrawButton(b, minus, "<");
        this.DrawButton(b, plus, ">");
        string shortValue = value.Length > 8 ? value[..8] : value;
        Vector2 size = Game1.smallFont.MeasureString(shortValue);
        Utility.drawTextWithShadow(b, shortValue, Game1.smallFont, new Vector2(minus.Right + 6 + (plus.X - minus.Right - 12 - size.X) / 2f, minus.Y + 8), Game1.textColor);
    }

    private void SetStepperBounds(int index, int x, int y)
    {
        this.minusButtons[index] = new Rectangle(x + 48, y, 34, 34);
        this.plusButtons[index] = new Rectangle(x + 130, y, 34, 34);
    }

    private void SetFishingChanceBounds(int index, int x, int y)
    {
        this.fishingMinusButtons[index] = new Rectangle(x + 92, y, 36, 36);
        this.fishingPlusButtons[index] = new Rectangle(x + 202, y, 36, 36);
    }

    private void ReceiveSettingsClick(int x, int y)
    {
        if (this.identityTabButton.Contains(x, y))
        {
            this.showAppearanceSettings = false;
            this.showFishingSettings = false;
            Game1.playSound("smallSelect");
            return;
        }

        if (this.appearanceTabButton.Contains(x, y))
        {
            this.showAppearanceSettings = true;
            this.showFishingSettings = false;
            Game1.playSound("smallSelect");
            return;
        }

        if (this.fishingTabButton.Contains(x, y))
        {
            this.showAppearanceSettings = false;
            this.showFishingSettings = true;
            Game1.playSound("smallSelect");
            return;
        }

        if (this.showFishingSettings)
        {
            this.ReceiveFishingSettingsClick(x, y);
            return;
        }

        if (!this.showAppearanceSettings)
        {
            if (this.editNameButton.Contains(x, y))
            {
                if (!this.TryOpenMobileTextInput("修改伙伴名字", "输入伙伴名字", this.config.CompanionName, entered =>
                {
                    string name = entered.Trim();
                    if (!string.IsNullOrWhiteSpace(name))
                    {
                        this.config.CompanionName = name;
                        this.CommitSettings("名字已保存");
                    }
                }))
                    this.settingsStatus = "无法打开系统输入框";
                return;
            }

            if (this.editPersonaButton.Contains(x, y))
            {
                if (!this.TryOpenMobileTextInput("修改伙伴人设", "输入伙伴性格与身份描述", this.config.Persona, entered =>
                {
                    string persona = entered.Trim();
                    if (!string.IsNullOrWhiteSpace(persona))
                    {
                        this.config.Persona = persona;
                        this.CommitSettings("人设已保存");
                    }
                }))
                    this.settingsStatus = "无法打开系统输入框";
                return;
            }
        }
        else
        {
            if (this.genderButton.Contains(x, y))
            {
                this.config.IsMale = !this.config.IsMale;
                this.CommitSettings("外形已保存");
                return;
            }

            for (int i = 0; i < this.minusButtons.Length; i++)
            {
                if (this.minusButtons[i].Contains(x, y))
                {
                    this.AdjustAppearance(i, -1);
                    return;
                }

                if (this.plusButtons[i].Contains(x, y))
                {
                    this.AdjustAppearance(i, 1);
                    return;
                }
            }
        }
    }

    private void ReceiveFishingSettingsClick(int x, int y)
    {
        for (int i = 0; i < this.fishingToggleButtons.Length; i++)
        {
            if (!this.fishingToggleButtons[i].Contains(x, y))
                continue;

            switch (i)
            {
                case 0:
                    this.config.FishingAssistEnabled = !this.config.FishingAssistEnabled;
                    break;
                case 1:
                    this.config.FishingSkipMinigame = !this.config.FishingSkipMinigame;
                    break;
                case 2:
                    this.config.FishingAutoHook = !this.config.FishingAutoHook;
                    break;
                case 3:
                    this.config.FishingInfiniteBait = !this.config.FishingInfiniteBait;
                    break;
            }

            this.CommitSettings("钓鱼设置已保存");
            return;
        }

        for (int i = 0; i < this.fishingMinusButtons.Length; i++)
        {
            if (this.fishingMinusButtons[i].Contains(x, y))
            {
                this.AdjustFishingChance(i, -10);
                return;
            }

            if (this.fishingPlusButtons[i].Contains(x, y))
            {
                this.AdjustFishingChance(i, 10);
                return;
            }
        }
    }

    private void AdjustFishingChance(int field, int delta)
    {
        if (field == 0)
            this.config.FishingSuccessChance = Math.Clamp(this.config.FishingSuccessChance + delta, 0, 100);
        else
            this.config.FishingTreasureChance = Math.Clamp(this.config.FishingTreasureChance + delta, 0, 100);

        this.CommitSettings("钓鱼设置已保存");
    }

    private void AdjustAppearance(int field, int direction)
    {
        switch (field)
        {
            case 0:
                this.config.HairStyle = Wrap(this.config.HairStyle + direction, Farmer.GetLastHairStyle() + 1);
                break;
            case 1:
                this.config.Skin = Wrap(this.config.Skin + direction, 24);
                break;
            case 2:
                this.config.Shirt = Cycle(Game1.shirtData.Keys, this.config.Shirt, direction);
                break;
            case 3:
                this.config.Pants = Cycle(Game1.pantsData.Keys, this.config.Pants, direction);
                break;
            case 4:
                int shoes = int.TryParse(this.config.Shoes, out int parsed) ? parsed : 0;
                this.config.Shoes = Wrap(shoes + direction, 18).ToString();
                break;
        }

        this.CommitSettings("外形已保存");
    }

    private void CommitSettings(string message)
    {
        this.saveSettings();
        this.settingsStatus = message;
        Game1.playSound("smallSelect");
    }

    private static string Cycle(IEnumerable<string> values, string current, int direction)
    {
        List<string> options = values.OrderBy(value => value, StringComparer.OrdinalIgnoreCase).ToList();
        if (options.Count == 0)
            return current;

        int index = options.FindIndex(value => string.Equals(value, current, StringComparison.OrdinalIgnoreCase));
        return options[Wrap((index < 0 ? 0 : index) + direction, options.Count)];
    }

    private static int Wrap(int value, int count)
    {
        return (value % count + count) % count;
    }

    private static string OnOff(bool value)
    {
        return value ? "开" : "关";
    }

    private void DrawConversation(SpriteBatch b)
    {
        int availableWidth = this.messagesArea.Width - 88;
        int top = this.messagesArea.Y + 12;
        int bottom = this.messagesArea.Bottom - 54;
        int lineHeight = Game1.smallFont.LineSpacing + 4;
        int visibleLines = Math.Max(1, (bottom - top) / lineHeight);
        List<(string Text, Color Color)> lines = new();
        foreach (ChatMessage message in this.conversation)
        {
            if (message.Role == "system")
                continue;

            string name = message.Role == "assistant" ? this.config.CompanionName : Game1.player.displayName;
            string text = Game1.parseText($"{name}: {message.Content}", Game1.smallFont, availableWidth);
            Color color = message.Role == "assistant" ? Game1.textColor : new Color(35, 82, 117);
            foreach (string line in text.Replace("\r\n", "\n").Split('\n'))
                lines.Add((line, color));
            lines.Add(("", color));
        }

        int maxScroll = Math.Max(0, lines.Count - visibleLines);
        this.scrollLineOffset = Math.Min(this.scrollLineOffset, maxScroll);
        int end = Math.Max(0, lines.Count - this.scrollLineOffset);
        int start = Math.Max(0, end - visibleLines);
        int y = bottom - (end - start) * lineHeight;
        for (int i = start; i < end; i++)
        {
            Utility.drawTextWithShadow(b, lines[i].Text, Game1.smallFont, new Vector2(this.messagesArea.X + 16, y), lines[i].Color);
            y += lineHeight;
        }
    }

    private void ScrollConversation(int direction)
    {
        int top = this.messagesArea.Y + 12;
        int bottom = this.messagesArea.Bottom - 54;
        int pageLines = Math.Max(1, (bottom - top) / (Game1.smallFont.LineSpacing + 4) - 1);
        this.scrollLineOffset = Math.Max(0, this.scrollLineOffset + direction * pageLines);
        Game1.playSound("shwip");
    }

    private void DrawButton(SpriteBatch b, Rectangle bounds, string label, bool active = false)
    {
        IClickableMenu.drawTextureBox(b, Game1.menuTexture, new Rectangle(0, 256, 60, 60), bounds.X, bounds.Y, bounds.Width, bounds.Height, active ? Color.White : Color.White * 0.9f, 1f, false);
        Vector2 size = Game1.smallFont.MeasureString(label);
        Utility.drawTextWithShadow(b, label, Game1.smallFont, new Vector2(bounds.X + (bounds.Width - size.X) / 2f, bounds.Y + (bounds.Height - size.Y) / 2f), active ? new Color(43, 85, 116) : Game1.textColor);
    }

    private void SendCurrentText()
    {
        string text = this.inputBox.Text.Trim();
        if (this.waitingForReply || string.IsNullOrWhiteSpace(text))
            return;

        this.pendingGift = null;
        this.pendingLoan = null;
        this.inputBox.Text = "";
        this.conversation.Add(new ChatMessage("user", text));
        this.scrollLineOffset = 0;
        this.SaveMemory();
        if (this.loans.TryCreateOffer(text, out CompanionLoanOffer? loanOffer, out string loanReply))
        {
            this.pendingLoan = loanOffer;
            this.conversation.Add(new ChatMessage("assistant", loanReply));
            this.status = loanOffer is null ? "" : "确认后金币才会到账";
            this.SaveMemory();
        }
        else if (this.gifts.TryCreateOffer(text, out CompanionGiftOffer? offer, out string localReply))
        {
            this.pendingGift = offer;
            this.conversation.Add(new ChatMessage("assistant", localReply));
            this.status = offer is null ? "" : "确认后物品才会进入背包";
            this.SaveMemory();
        }
        else
            this.RequestReply();
        Game1.playSound("smallSelect");
    }

    private void RequestReply()
    {
        this.waitingForReply = true;
        this.status = "正在等待回复...";
        List<ChatMessage> messages = this.BuildRequestMessages();
        _ = Task.Run(async () =>
        {
            try
            {
                string rawReply = await this.client.CompleteAsync(messages, this.cancellationToken.Token);
                this.completedRequests.Enqueue(() =>
                {
                    if (this.isClosed)
                        return;

                    this.conversation.Add(new ChatMessage("assistant", rawReply));
                    this.scrollLineOffset = 0;
                    this.waitingForReply = false;
                    this.status = "";
                    this.SaveMemory();
                });
            }
            catch (OperationCanceledException)
            {
            }
            catch (Exception ex)
            {
                this.monitor.Log($"Companion API request failed: {ex}", LogLevel.Error);
                this.completedRequests.Enqueue(() =>
                {
                    if (!this.isClosed)
                    {
                        this.waitingForReply = false;
                        this.status = $"请求失败：{ex.Message}";
                    }
                });
            }
        });
    }

    private List<ChatMessage> BuildRequestMessages()
    {
        StringBuilder context = new();
        context.Append($"你叫 {this.config.CompanionName}。{this.config.Persona} ");
        context.Append($"你正在和玩家 {Game1.player.displayName} 交流。当前是第 {Game1.year} 年 {Game1.currentSeason} 第 {Game1.dayOfMonth} 天，时间 {Game1.timeOfDay:0000}，玩家位于 {Game1.currentLocation?.NameOrUniqueName ?? "未知地点"}。");
        context.Append($"请使用 {this.config.Language} 简短自然地回复，不要提到 API 或游戏内部数据。");
        List<ChatMessage> request = new() { new ChatMessage("system", context.ToString()) };
        request.AddRange(this.conversation.TakeLast(Math.Max(4, this.config.MaxHistoryMessages)));
        return request;
    }

    private bool TryOpenMobileTextInput(string title, string prompt, string existingText, Action<string> onEntered)
    {
        if (this.openingMobileInput)
            return true;

        Type? inputType = AppDomain.CurrentDomain.GetAssemblies()
            .Select(assembly => assembly.GetType("Microsoft.Xna.Framework.Input.KeyboardInput", throwOnError: false))
            .FirstOrDefault(type => type is not null);
        MethodInfo? showMethod = inputType?.GetMethods(BindingFlags.Public | BindingFlags.Static)
            .FirstOrDefault(method =>
            {
                ParameterInfo[] parameters = method.GetParameters();
                return method.Name == "Show"
                    && parameters.Length == 4
                    && parameters[0].ParameterType == typeof(string)
                    && parameters[1].ParameterType == typeof(string)
                    && parameters[2].ParameterType == typeof(string)
                    && parameters[3].ParameterType == typeof(bool);
            });
        if (showMethod is null)
            return false;

        this.openingMobileInput = true;
        _ = Task.Run(async () =>
        {
            try
            {
                object? taskObject = showMethod.Invoke(null, new object?[]
                {
                    title,
                    prompt,
                    existingText,
                    false
                });
                if (taskObject is not Task task)
                    throw new InvalidOperationException("系统输入接口没有返回可等待的任务。");

                await task.ConfigureAwait(false);
                string? entered = task.GetType().GetProperty("Result")?.GetValue(task) as string;
                this.completedRequests.Enqueue(() =>
                {
                    this.openingMobileInput = false;
                    if (entered is not null)
                        onEntered(entered);
                });
            }
            catch (Exception ex)
            {
                this.monitor.Log($"Opening Android text input failed: {ex}", LogLevel.Error);
                this.completedRequests.Enqueue(() =>
                {
                    this.openingMobileInput = false;
                    this.status = "系统输入法打开失败，请查看 SMAPI 日志。";
                });
            }
        });
        return true;
    }

    private void SaveMemory()
    {
        if (!this.config.EnableMemory)
            return;

        this.memory.Messages = this.conversation.Select(message => new ChatMessage(message.Role, message.Content)).ToList();
        this.memory.LastUpdatedUtcTicks = DateTime.UtcNow.Ticks;
        this.store.Save(this.memory);
    }

    private void Close()
    {
        if (this.isClosed)
            return;

        this.isClosed = true;
        this.cancellationToken.Cancel();
        this.client.Dispose();
        this.ReleaseChatInput();
        Game1.activeClickableMenu = null;
    }

    private void ReleaseChatInput()
    {
        this.inputBox.Selected = false;
        if (Game1.keyboardDispatcher.Subscriber == this.inputBox)
            Game1.keyboardDispatcher.Subscriber = null;
        Game1.closeTextEntry();
    }
}
