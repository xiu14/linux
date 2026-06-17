using HarmonyLib;
using StardewModdingAPI;
using StardewModdingAPI.Events;
using StardewValley;

namespace Libala.CompanionGuide;

public sealed class ModEntry : Mod
{
    private static ModEntry instance = null!;
    private ModConfig config = null!;
    private ConversationStore store = null!;
    private CompanionStorageController storage = null!;
    private CompanionGiftController gifts = null!;
    private CompanionLoanController loans = null!;
    private CompanionWorkController work = null!;
    private CompanionFishingController fishing = null!;
    private CompanionActor actor = null!;
    private HudCompanionButton? hudButton;
    private CompanionWorkMenu? workMenu;
    private bool usingMobileToolbar;

    public override void Entry(IModHelper helper)
    {
        instance = this;
        this.config = helper.ReadConfig<ModConfig>();
        FishingAssistController.Initialize(this.config, this.Monitor);
        this.store = new ConversationStore(helper.Data, this.Monitor);
        this.storage = new CompanionStorageController(helper.Data, this.Monitor);
        this.gifts = new CompanionGiftController(this.storage);
        this.loans = new CompanionLoanController();
        this.work = new CompanionWorkController(this.storage);
        this.fishing = new CompanionFishingController(this.storage, this.Monitor);
        this.actor = new CompanionActor(this.config, this.work, this.fishing, this.Monitor);
        helper.Events.GameLoop.GameLaunched += this.OnGameLaunched;
        helper.Events.GameLoop.SaveLoaded += this.OnSaveLoaded;
        helper.Events.GameLoop.ReturnedToTitle += this.OnReturnedToTitle;
        helper.Events.GameLoop.UpdateTicked += this.OnUpdateTicked;
        helper.Events.Player.Warped += this.OnWarped;
        helper.Events.Display.RenderedWorld += this.OnRenderedWorld;
        helper.Events.Input.ButtonPressed += this.OnButtonPressed;
        helper.Events.World.DebrisListChanged += this.storage.OnDebrisListChanged;

        Harmony harmony = new("libala.CompanionGuide");
        FishingAssistController.Patch(harmony);
        harmony.Patch(
            AccessTools.Method(typeof(GameLocation), nameof(GameLocation.answerDialogueAction)),
            prefix: new HarmonyMethod(typeof(ModEntry), nameof(BeforeAnswerDialogueAction))
        );
    }

    private void OnGameLaunched(object? sender, GameLaunchedEventArgs e)
    {
        IMobileToolbarApi? toolbar = this.Helper.ModRegistry.GetApi<IMobileToolbarApi>("libala.MobileToolbar");
        if (toolbar is null)
            return;

        toolbar.RegisterButton("libala.CompanionGuide.menu", "伙伴", 20, this.OpenCompanionMenu, CanOpenHudMenu);
        toolbar.RegisterButton("libala.CompanionGuide.teleport", "传送", 25, this.OpenTeleportMenu, CanOpenHudMenu);
        this.usingMobileToolbar = true;
        if (this.hudButton is not null)
            Game1.onScreenMenus.Remove(this.hudButton);
    }

    private void OnSaveLoaded(object? sender, SaveLoadedEventArgs e)
    {
        this.storage.Load();
        this.actor.Reset();
    }

    private void OnReturnedToTitle(object? sender, ReturnedToTitleEventArgs e)
    {
        this.CloseWorkMenu();
        this.storage.ResetSession();
        this.actor.Reset();
        this.hudButton = null;
    }

    private void OnUpdateTicked(object? sender, UpdateTickedEventArgs e)
    {
        if (!Context.IsWorldReady)
            return;

        this.storage.Update();
        if (!this.usingMobileToolbar)
        {
            this.hudButton ??= new HudCompanionButton(CanOpenHudMenu, this.OpenCompanionMenu, this.work);
            if (!Game1.onScreenMenus.Contains(this.hudButton))
                Game1.onScreenMenus.Add(this.hudButton);
        }

        this.actor.Update(Game1.currentGameTime);
    }

    private void OnWarped(object? sender, WarpedEventArgs e)
    {
        if (e.IsLocalPlayer)
        {
            this.CloseWorkMenu();
            this.actor.OnPlayerWarped(e.NewLocation);
        }
    }

    private void OnRenderedWorld(object? sender, RenderedWorldEventArgs e)
    {
        this.actor.Draw(e.SpriteBatch);
    }

    private void OnButtonPressed(object? sender, ButtonPressedEventArgs e)
    {
        if (this.storage.IsSelecting
            && Context.IsWorldReady
            && Game1.activeClickableMenu is null
            && (e.Button == SButton.MouseLeft || e.Button.IsActionButton() || e.Button.IsUseToolButton()))
        {
            this.Helper.Input.Suppress(e.Button);
            this.storage.TrySelect(Game1.currentLocation, e.Cursor.GrabTile);
            return;
        }

        if (!CanOpenHudMenu()
            || e.Button != SButton.MouseLeft && !e.Button.IsActionButton() && !e.Button.IsUseToolButton()
            || !this.actor.ContainsWorldPosition(e.Cursor.AbsolutePixels))
            return;

        this.Helper.Input.Suppress(e.Button);
        Game1.playSound("smallSelect");
        if (this.workMenu is not null)
        {
            this.CloseWorkMenu();
            return;
        }

        this.workMenu = new CompanionWorkMenu(this.work, this.actor, this.CloseWorkMenu, this.storage.BeginSelection);
        Game1.activeClickableMenu = this.workMenu;
    }

    private void OpenCompanionMenu()
    {
        this.CloseWorkMenu();
        Game1.dialogueUp = false;
        Game1.playSound("bigSelect");
        Game1.activeClickableMenu = new CompanionChatMenu(this.config, this.Monitor, this.store, this.work, this.gifts, this.loans, this.actor, this.SaveCompanionSettings);
    }

    private void OpenTeleportMenu()
    {
        this.CloseWorkMenu();
        Game1.dialogueUp = false;
        Game1.playSound("bigSelect");
        Game1.activeClickableMenu = new CompanionChatMenu(this.config, this.Monitor, this.store, this.work, this.gifts, this.loans, this.actor, this.SaveCompanionSettings, openTeleport: true);
    }

    private void SaveCompanionSettings()
    {
        this.Helper.WriteConfig(this.config);
        this.actor.Reset();
    }

    private void CloseWorkMenu()
    {
        if (this.workMenu is not null)
        {
            if (Game1.activeClickableMenu == this.workMenu)
                Game1.activeClickableMenu = null;
            Game1.onScreenMenus.Remove(this.workMenu);
        }
        this.workMenu = null;
    }

    private static bool CanOpenHudMenu()
    {
        return Context.IsWorldReady
            && Game1.currentLocation is not null
            && Game1.activeClickableMenu is null
            && Game1.currentMinigame is null
            && !Game1.eventUp;
    }

    private static bool BeforeAnswerDialogueAction(GameLocation __instance, string questionAndAnswer, ref bool __result)
    {
        if (questionAndAnswer != "Sleep_Yes" || instance.loans is null || !instance.loans.TryInterceptSleep(__instance))
            return true;

        __result = false;
        return false;
    }
}
