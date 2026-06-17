using HarmonyLib;
using Microsoft.Xna.Framework;
using StardewModdingAPI;
using StardewValley;
using StardewValley.Menus;
using StardewValley.Tools;

namespace Libala.CompanionGuide;

internal static class FishingAssistController
{
    private static ModConfig? config;
    private static IMonitor? monitor;

    public static void Initialize(ModConfig modConfig, IMonitor modMonitor)
    {
        config = modConfig;
        monitor = modMonitor;
    }

    public static void Patch(Harmony harmony)
    {
        harmony.Patch(
            AccessTools.Method(typeof(FishingRod), nameof(FishingRod.tickUpdate)),
            postfix: new HarmonyMethod(typeof(FishingAssistController), nameof(AfterFishingRodTickUpdate))
        );
        harmony.Patch(
            AccessTools.Method(typeof(FishingRod), nameof(FishingRod.startMinigameEndFunction)),
            prefix: new HarmonyMethod(typeof(FishingAssistController), nameof(BeforeStartMinigame))
        );
        harmony.Patch(
            AccessTools.Method(typeof(FishingRod), "doDoneFishing"),
            prefix: new HarmonyMethod(typeof(FishingAssistController), nameof(BeforeDoneFishing))
        );
        harmony.Patch(
            AccessTools.Constructor(typeof(BobberBar), new[]
            {
                typeof(string), typeof(float), typeof(bool), typeof(List<string>), typeof(string), typeof(bool), typeof(string), typeof(bool)
            }),
            postfix: new HarmonyMethod(typeof(FishingAssistController), nameof(AfterBobberBarCreated))
        );
    }

    private static void AfterFishingRodTickUpdate(FishingRod __instance, GameTime time, Farmer who)
    {
        ModConfig? cfg = config;
        if (cfg is null || !cfg.FishingAssistEnabled || who is null || !who.IsLocalPlayer)
            return;

        try
        {
            if (__instance.isFishing && __instance.timeUntilFishingBite > 250f)
                __instance.timeUntilFishingBite = 250f;

            if (cfg.FishingAutoHook && __instance.isNibbling && !__instance.hit)
                __instance.DoFunction(who.currentLocation, (int)__instance.bobber.X, (int)__instance.bobber.Y, 1, who);
        }
        catch (Exception ex)
        {
            monitor?.Log($"Fishing assist tick failed: {ex}", LogLevel.Warn);
        }
    }

    private static bool BeforeStartMinigame(FishingRod __instance, Item fish)
    {
        ModConfig? cfg = config;
        if (cfg is null || !cfg.FishingAssistEnabled || !cfg.FishingSkipMinigame || __instance.getLastFarmerToUse() is not { IsLocalPlayer: true })
            return true;

        try
        {
            if (!Roll(cfg.FishingSuccessChance))
                return true;

            bool treasure = Roll(cfg.FishingTreasureChance);
            fish.TryGetTempData<bool>("IsBossFish", out bool bossFish);
            __instance.pullFishFromWater(
                fish.ItemId,
                fishSize: -1,
                fishQuality: 0,
                fishDifficulty: 0,
                treasureCaught: treasure,
                wasPerfect: true,
                fromFishPond: false,
                setFlagOnCatch: fish.SetFlagOnPickup,
                isBossFish: bossFish,
                numCaught: 1
            );
            return false;
        }
        catch (Exception ex)
        {
            monitor?.Log($"Skipping fishing minigame failed: {ex}", LogLevel.Warn);
            return true;
        }
    }

    private static void BeforeDoneFishing(ref bool consumeBaitAndTackle)
    {
        ModConfig? cfg = config;
        if (cfg is { FishingAssistEnabled: true, FishingInfiniteBait: true })
            consumeBaitAndTackle = false;
    }

    private static void AfterBobberBarCreated(BobberBar __instance)
    {
        ModConfig? cfg = config;
        if (cfg is null || !cfg.FishingAssistEnabled || cfg.FishingTreasureChance <= 0 || __instance.treasure)
            return;

        if (Roll(cfg.FishingTreasureChance))
            __instance.treasure = true;
    }

    private static bool Roll(int chancePercent)
    {
        return Game1.random.NextDouble() < Math.Clamp(chancePercent, 0, 100) / 100d;
    }
}
