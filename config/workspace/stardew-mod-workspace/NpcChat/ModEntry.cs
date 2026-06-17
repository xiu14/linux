using HarmonyLib;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using StardewModdingAPI;
using StardewModdingAPI.Events;
using StardewValley;
using StardewValley.Menus;

namespace Libala.NpcChat;

public sealed class ModEntry : Mod
{
    private static ModEntry instance = null!;
    private ModConfig config = null!;
    private IReadOnlyDictionary<string, NpcProfile> profiles = null!;
    private ConversationStore conversationStore = null!;
    private Rectangle chatButtonBounds;
    private HudChatButton? hudChatButton;
    private bool usingMobileToolbar;

    public override void Entry(IModHelper helper)
    {
        instance = this;
        this.config = helper.ReadConfig<ModConfig>();
        this.profiles = helper.ModContent.Load<Dictionary<string, NpcProfile>>("assets/npc-profiles.json");
        this.conversationStore = new ConversationStore(helper.Data, this.Monitor);
        helper.Events.Display.RenderedActiveMenu += this.OnRenderedActiveMenu;
        helper.Events.GameLoop.GameLaunched += this.OnGameLaunched;
        helper.Events.GameLoop.UpdateTicked += this.OnUpdateTicked;

        Harmony harmony = new("libala.NpcChat");
        harmony.Patch(
            AccessTools.Method(typeof(DialogueBox), nameof(DialogueBox.receiveLeftClick)),
            prefix: new HarmonyMethod(typeof(ModEntry), nameof(BeforeDialogueLeftClick))
        );
    }

    private void OnGameLaunched(object? sender, GameLaunchedEventArgs e)
    {
        IMobileToolbarApi? toolbar = this.Helper.ModRegistry.GetApi<IMobileToolbarApi>("libala.MobileToolbar");
        if (toolbar is null)
            return;

        toolbar.RegisterButton("libala.NpcChat.contacts", "聊天", 10, this.OpenContactsMenu, CanOpenHudMenu);
        this.usingMobileToolbar = true;
        if (this.hudChatButton is not null)
            Game1.onScreenMenus.Remove(this.hudChatButton);
    }

    private void OnRenderedActiveMenu(object? sender, RenderedActiveMenuEventArgs e)
    {
        if (!TryGetSpeakingNpc(out _))
            return;

        int width = Math.Max(128, (int)Game1.smallFont.MeasureString(this.config.ButtonText).X + 54);
        int height = 56;
        int x = Math.Min(Game1.uiViewport.Width - width - 28, Game1.uiViewport.Width / 2 + 272);
        int y = Math.Min(Game1.uiViewport.Height - height - 24, Game1.uiViewport.Height / 2 + 126);
        this.chatButtonBounds = new Rectangle(x, y, width, height);

        IClickableMenu.drawTextureBox(
            e.SpriteBatch,
            Game1.menuTexture,
            new Rectangle(0, 256, 60, 60),
            x,
            y,
            width,
            height,
            Color.White,
            1f,
            false
        );
        Utility.drawTextWithShadow(
            e.SpriteBatch,
            this.config.ButtonText,
            Game1.smallFont,
            new Vector2(x + (width - Game1.smallFont.MeasureString(this.config.ButtonText).X) / 2f, y + 14),
            Game1.textColor
        );
    }

    private void OnUpdateTicked(object? sender, UpdateTickedEventArgs e)
    {
        if (!Context.IsWorldReady)
            return;

        if (this.usingMobileToolbar)
            return;

        this.hudChatButton ??= new HudChatButton(CanOpenHudMenu, this.OpenContactsMenu);
        if (!Game1.onScreenMenus.Contains(this.hudChatButton))
            Game1.onScreenMenus.Add(this.hudChatButton);
    }

    private void OpenContactsMenu()
    {
        Game1.dialogueUp = false;
        Game1.playSound("bigSelect");
        Game1.activeClickableMenu = new NpcContactsMenu(this.config, this.Monitor, this.conversationStore, this.GetProfile);
    }

    private static bool CanOpenHudMenu()
    {
        return Context.IsWorldReady
            && Game1.currentLocation is not null
            && Game1.activeClickableMenu is null
            && Game1.currentMinigame is null
            && !Game1.eventUp;
    }

    private static bool BeforeDialogueLeftClick(DialogueBox __instance, int x, int y)
    {
        if (Game1.activeClickableMenu != __instance || !instance.chatButtonBounds.Contains(x, y) || !TryGetSpeakingNpc(out NPC? npc) || npc is null)
            return true;

        try
        {
            Game1.activeClickableMenu = instance.CreateChatMenu(npc, __instance, isRemoteChat: false);
        }
        catch (Exception ex)
        {
            instance.Monitor.Log($"Opening the NPC chat window failed: {ex}", LogLevel.Error);
        }

        return false;
    }

    private static bool TryGetSpeakingNpc(out NPC? npc)
    {
        npc = null;
        if (Game1.activeClickableMenu is not DialogueBox dialogue || dialogue.characterDialogue?.speaker is not NPC speaker)
            return false;

        npc = speaker;
        return true;
    }

    internal NpcChatMenu CreateChatMenu(NPC npc, IClickableMenu previousMenu, bool isRemoteChat)
    {
        return new NpcChatMenu(npc, previousMenu, this.config, this.Monitor, this.GetProfile(npc), this.conversationStore, isRemoteChat);
    }

    internal NpcProfile GetProfile(NPC npc)
    {
        return this.profiles.TryGetValue(npc.Name, out NpcProfile? profile)
            ? profile
            : NpcProfile.CreateFallback(npc);
    }
}
