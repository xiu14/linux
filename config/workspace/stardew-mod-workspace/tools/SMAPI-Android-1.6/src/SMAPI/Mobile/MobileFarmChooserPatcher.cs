using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using Android.Widget;
using HarmonyLib;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using StardewModdingAPI.Framework;
using StardewValley;
using StardewValley.GameData;
using StardewValley.Menus;

namespace StardewModdingAPI.Mobile;

internal static class MobileFarmChooserPatcher
{
    public static void Patch(Harmony h)
    {
        {
            var ctor = AccessTools.Constructor(typeof(MobileFarmChooser),
                [typeof(int), typeof(int), typeof(int), typeof(int),
            typeof(CharacterCustomization.Source), typeof(bool), typeof(bool)]);
            h.Patch(ctor,
                prefix: AccessTools.Method(typeof(MobileFarmChooserPatcher), nameof(Prefix_Ctor)),
                postfix: AccessTools.Method(typeof(MobileFarmChooserPatcher), nameof(Postfix_Ctor)));
        }

        {
            var method = AccessTools.Method(typeof(MobileFarmChooser), "optionButtonClick");
            h.Patch(method,
                prefix: AccessTools.Method(
                    typeof(MobileFarmChooserPatcher),
                    nameof(Prefix_optionButtonClick)));
        }

        {
            var method = AccessTools.Method(typeof(MobileFarmChooser), nameof(MobileFarmChooser.receiveLeftClick));
            h.Patch(method,
                prefix: AccessTools.Method(typeof(MobileFarmChooserPatcher), nameof(Prefix_receiveLeftClick)));
        }

        {
            var method = AccessTools.Method(typeof(MobileFarmChooser), nameof(MobileFarmChooser.draw));
            h.Patch(method,
                prefix: AccessTools.Method(typeof(MobileFarmChooserPatcher), nameof(Prefix_draw)),
                postfix: AccessTools.Method(typeof(MobileFarmChooserPatcher), nameof(Postfix_draw)));
        }


        var monitor = SCore.Instance.SMAPIMonitor;
        monitor.Log("MobileFarmChooserPatcher patched");
    }

    static Dictionary<string, ModFarmType> modFarmsLookup = new();
    const string MeadowlandsFarm_ID = "MeadowlandsFarm";
    static int selectFarmIndexCounter = 0;
    static readonly FieldInfo? startXField = AccessTools.Field(typeof(MobileFarmChooser), "startX");
    static readonly FieldInfo? buttonYField = AccessTools.Field(typeof(MobileFarmChooser), "buttonY");
    static readonly FieldInfo? farmButtonWidthField = AccessTools.Field(typeof(MobileFarmChooser), "farmButtonWidth");
    static readonly FieldInfo? farmButtonSpacingField = AccessTools.Field(typeof(MobileFarmChooser), "farmButtonSpacing");
    static readonly FieldInfo? isStandaloneScreenField = AccessTools.Field(typeof(MobileFarmChooser), "isStandaloneScreen");
    static readonly FieldInfo? farmTypeButtonLookupField = AccessTools.Field(typeof(MobileFarmChooser), "farmTypeButtonLookup");
    static readonly FieldInfo? sourceField = AccessTools.Field(typeof(MobileFarmChooser), "source");
    static readonly FieldInfo? nameStringField = AccessTools.Field(typeof(MobileFarmChooser), "nameString");
    static readonly FieldInfo? descStringField = AccessTools.Field(typeof(MobileFarmChooser), "descString");
    static readonly FieldInfo? nameSizeField = AccessTools.Field(typeof(MobileFarmChooser), "nameSize");
    static readonly FieldInfo? descSizeField = AccessTools.Field(typeof(MobileFarmChooser), "descSize");
    static readonly FieldInfo? leftSelectButtonField = AccessTools.Field(typeof(MobileFarmChooser), "leftSelectButton");
    static readonly FieldInfo? rightSelectButtonField = AccessTools.Field(typeof(MobileFarmChooser), "rightSelectButton");
    static readonly FieldInfo? farmnameBoxField = AccessTools.Field(typeof(MobileFarmChooser), "farmnameBox");
    static readonly FieldInfo? backButtonField = AccessTools.Field(typeof(MobileFarmChooser), "backButton");
    static readonly FieldInfo? okButtonField = AccessTools.Field(typeof(MobileFarmChooser), "okButton");

    static T? GetField<T>(MobileFarmChooser menu, FieldInfo? field)
    {
        return field != null ? (T?)field.GetValue(menu) : default;
    }

    static void SetField<T>(MobileFarmChooser menu, FieldInfo? field, T value)
    {
        field?.SetValue(menu, value);
    }

    static void Prefix_Ctor(MobileFarmChooser __instance)
    {
        // force reset to Standard Farm
        Game1.whichFarm = 0;
        selectFarmIndexCounter = 0;

        // setup first time
        if (modFarmsLookup.Count == 0)
        {
            var additionalFarms = DataLoader.AdditionalFarms(Game1.content);
            foreach (var farm in additionalFarms)
            {
                modFarmsLookup.TryAdd(farm.Id, farm);
            }
        }
    }

    static void Postfix_Ctor(MobileFarmChooser __instance)
    {
        var menu = __instance;
        // check if is already added
        if (menu.farmTypeButtons.Count != 8)
            return;

        int startX = GetField<int>(menu, startXField);
        int buttonY = GetField<int>(menu, buttonYField);
        int buttonOffset = GetField<int>(menu, farmButtonWidthField) + GetField<int>(menu, farmButtonSpacingField);
        var farmTypeButtonLookup = GetField<Dictionary<int, ClickableComponent>>(menu, farmTypeButtonLookupField);
        if (farmTypeButtonLookup == null)
            return;

        int modFarmIndex = 7;
        foreach (var farm in modFarmsLookup.Values)
        {
            if (farm.Id == MeadowlandsFarm_ID)
                continue;

            modFarmIndex++;

            var texture = Game1.content.Load<Texture2D>(farm.IconTexture);
            var farmDetail = GetFarmTypeTooltip(farm.TooltipStringPath);

            int currentButtonIndex = menu.farmTypeButtons.Count;
            var farmButton = new ClickableTextureComponent(
                "ModFarm_" + farm.Id,
                new Rectangle(startX + currentButtonIndex * buttonOffset, buttonY, 76, 76),
                null,
                farmDetail,
                texture,
                new Rectangle(0, 0, 22, 20),
                4f);

            menu.farmTypeButtons.Add(farmButton);
            farmTypeButtonLookup.TryAdd(modFarmIndex, farmButton);
        }

        // debug only
#if false
        Game1.player.name.Value = "Guy";
        Game1.player.farmName.Value = "Hello Guy";
        Game1.player.favoriteThing.Value = "I dont know";
#endif
    }

    static string GetFarmTypeTooltip(string translationKey)
    {
        string text = Game1.content.LoadString(translationKey);
        string[] parts = text.Split('_', 2);
        if (parts.Length == 1 || parts[1].Length == 0)
        {
            text = parts[0] + "_ ";
        }
        return text;
    }

    static bool Prefix_optionButtonClick(
        MobileFarmChooser __instance,
        string name
    )
    {
        // not initialize
        if (modFarmsLookup.Count == 0)
            return true;

        var menu = __instance;
        var farmTypeButtons = menu.farmTypeButtons;
        // check if you select any farm button
        var farmTypeButton = farmTypeButtons.SingleOrDefault(f => f.name == name);
        Console.WriteLine("selected farm btn: " + farmTypeButton?.name);
        if (farmTypeButton == null)
            return true;

        // ready
        // refresh first!!
        Game1.whichModFarm = null;
        // skip if not select any ModFarm type
        if (farmTypeButton.name.StartsWith("ModFarm_") == false)
            return true;

        var modFarmID = name.Replace("ModFarm_", "");
        if (modFarmsLookup.TryGetValue(modFarmID, out var pickModFarm) == false)
            return true;

        // assign current farm type mod

        var source = GetField<CharacterCustomization.Source>(menu, sourceField);
        if (source == CharacterCustomization.Source.NewGame
            || source == CharacterCustomization.Source.HostNewFarm)
        {
            Game1.whichFarm = 7;
            Game1.whichModFarm = pickModFarm;
            Game1.spawnMonstersAtNight = pickModFarm.SpawnMonstersByDefault;
            Game1.playSound("coin");

            var nameString = farmTypeButton.hoverText.Split('_')[0];
            var descString = farmTypeButton.hoverText.Split('_')[1];
            SetField(menu, nameStringField, nameString);
            SetField(menu, descStringField, descString);
            SetField(menu, nameSizeField, Game1.dialogueFont.MeasureString(nameString));
            SetField(menu, descSizeField, Game1.dialogueFont.MeasureString(descString));

            Console.WriteLine("apply which mod farm: " + pickModFarm.Id);

            return false;
        }

        return true;
    }

    // helper method
    static void optionButtonClick(this MobileFarmChooser menu, string name)
    {
        var method = AccessTools.Method(typeof(MobileFarmChooser), "optionButtonClick");
        method.Invoke(menu, [name]);
    }


    static bool Prefix_receiveLeftClick(
        // my params
        MobileFarmChooser __instance,

        // original params
        int x, int y, bool playSound = true
    )
    {
        var menu = __instance;
        var farmTypeButtons = menu.farmTypeButtons;
        var leftSelectButton = GetField<ClickableTextureComponent>(menu, leftSelectButtonField);
        var rightSelectButton = GetField<ClickableTextureComponent>(menu, rightSelectButtonField);
        bool isStandaloneScreen = GetField<bool>(menu, isStandaloneScreenField);
        var farmnameBox = GetField<TextBox>(menu, farmnameBoxField);
        var backButton = GetField<ClickableTextureComponent>(menu, backButtonField);
        var okButton = GetField<ClickableTextureComponent>(menu, okButtonField);


        if (isStandaloneScreen)
        {
            foreach (ClickableTextureComponent farmTypeButton in farmTypeButtons)
            {
                if (farmTypeButton.containsPoint(x, y) && !farmTypeButton.name.Contains("Gray"))
                {
                    menu.optionButtonClick(farmTypeButton.name);
                }
            }
        }
        else
        {
            var oldSelectFarmIndex = selectFarmIndexCounter;
            if (leftSelectButton?.containsPoint(x, y) == true)
                selectFarmIndexCounter--;
            else if (rightSelectButton?.containsPoint(x, y) == true)
                selectFarmIndexCounter++;

            if (oldSelectFarmIndex != selectFarmIndexCounter)
            {
                if (selectFarmIndexCounter >= farmTypeButtons.Count)
                    selectFarmIndexCounter = 0;
                else if (selectFarmIndexCounter < 0)
                    selectFarmIndexCounter = farmTypeButtons.Count - 1;

                var currentSelectFarmType = farmTypeButtons[selectFarmIndexCounter];
                Game1.whichFarm = Math.Clamp(selectFarmIndexCounter, 0, 7);
                menu.optionButtonClick(currentSelectFarmType.name);
            }
        }

        if (isStandaloneScreen)
        {
            farmnameBox?.Update();
            if (okButton?.containsPoint(x, y) == true && menu.canLeaveMenu())
            {
                Game1.playSound("smallSelect");
            }
            if (backButton?.containsPoint(x, y) == true)
            {
                Game1.playSound("smallSelect");
            }
        }

        return false;
    }

    // fix FarmType button not render correct
    // On Single Player
    static void Prefix_draw(
        MobileFarmChooser __instance,

        // original params
        SpriteBatch b
    )
    {
        // fake with current farm type index 
        // Single Player
        var source = GetField<CharacterCustomization.Source>(__instance, sourceField);
        var farmTypeButtonLookup = GetField<Dictionary<int, ClickableComponent>>(__instance, farmTypeButtonLookupField);
        if (source.HasFlag(CharacterCustomization.Source.HostNewFarm) is false && farmTypeButtonLookup != null)
        {
            if (Game1.whichModFarm?.Id != MeadowlandsFarm_ID)
            {
                Game1.whichFarm = selectFarmIndexCounter;
                farmTypeButtonLookup[7] = __instance.farmTypeButtons[selectFarmIndexCounter];
            }
        }
    }

    // Fix farm type button render incorrect
    // on Single Player
    static void Postfix_draw(
        MobileFarmChooser __instance,

        SpriteBatch b)
    {
        // restore to back correct type
        var source = GetField<CharacterCustomization.Source>(__instance, sourceField);
        var farmTypeButtonLookup = GetField<Dictionary<int, ClickableComponent>>(__instance, farmTypeButtonLookupField);
        if (source.HasFlag(CharacterCustomization.Source.HostNewFarm) is false && farmTypeButtonLookup != null)
        {
            Game1.whichFarm = Math.Clamp(selectFarmIndexCounter, 0, 7);
            farmTypeButtonLookup[7] = __instance.farmTypeButtons[7];
        }
    }
}
