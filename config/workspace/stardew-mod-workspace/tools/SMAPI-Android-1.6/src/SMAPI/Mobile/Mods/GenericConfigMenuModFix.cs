using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using HarmonyLib;
using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Input;
using Newtonsoft.Json.Linq;
using Newtonsoft.Json;
using StardewModdingAPI;
using StardewModdingAPI.Events;
using StardewModdingAPI.Framework;
using StardewValley;

namespace StardewModdingAPI.Mobile.Mods;

internal static class GenericConfigMenuModFix
{
    static IMonitor monitor;
    static readonly Dictionary<string, string> GlobalTranslations = new(StringComparer.OrdinalIgnoreCase)
    {
        ["Enable"] = "启用",
        ["Enabled"] = "启用",
        ["Disable"] = "停用",
        ["Disabled"] = "停用",
        ["On"] = "开",
        ["Off"] = "关",
        ["Yes"] = "是",
        ["No"] = "否",
        ["true"] = "是",
        ["false"] = "否",
        ["None"] = "无",
        ["Default"] = "默认",
        ["General"] = "常规",
        ["General options"] = "常规选项",
        ["Options"] = "选项",
        ["Settings"] = "设置",
        ["Controls"] = "控制",
        ["Keybinds"] = "按键绑定",
        ["Hotkey"] = "快捷键",
        ["Range"] = "范围",
        ["Unlimited"] = "无限",
        ["All"] = "全部",
        ["Current location"] = "当前位置",
        ["Current world area"] = "当前世界区域",
        ["Open menu key"] = "打开菜单键",
        ["Scroll speed"] = "滚动速度",
        ["Toggle UI"] = "切换界面",
        ["Open Search Menu"] = "打开搜索菜单",
        ["Search Menu Preview Chest"] = "搜索菜单预览箱子"
    };
    static readonly Dictionary<string, Dictionary<string, string>> ModTranslations = new(StringComparer.OrdinalIgnoreCase)
    {
        ["Pathoschild.ChestsAnywhere"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["General options"] = "常规选项",
            ["Show hover tooltips"] = "显示悬浮提示",
            ["Whether to show the chest name in a tooltip when you point at a chest."] = "指向箱子时，是否在提示框中显示箱子名称。",
            ["Enable shipping bin"] = "启用出货箱",
            ["Whether to enable access to the shipping bin."] = "是否允许访问出货箱。",
            ["Enable sprinkler attachments"] = "启用洒水器附件",
            ["Whether to enable access to sprinkler attachments like enrichers."] = "是否允许访问肥料注入器等洒水器附件。",
            ["Add organize player items button"] = "添加整理玩家物品按钮",
            ["Whether to add an 'organize' button in chest UIs for the player inventory."] = "是否在箱子界面中为玩家背包添加“整理”按钮。",
            ["Remote access"] = "远程访问",
            ["Range"] = "范围",
            ["The range at which chests are accessible through the menu."] = "可通过菜单访问箱子的范围。",
            ["All chests"] = "所有箱子",
            ["Chests within the current world area"] = "当前世界区域内的箱子",
            ["Chests within the current location"] = "当前位置内的箱子",
            ["None (can't access chests remotely)"] = "无（不能远程访问箱子）",
            ["Disable in mines & skull cavern"] = "在矿井和骷髅洞穴中禁用",
            ["Whether to disable accessing chests remotely while in the mines or Skull Cavern."] = "在矿井或骷髅洞穴中时，是否禁用远程访问箱子。",
            ["Disable in location names"] = "在指定地点禁用",
            ["The internal names (as shown by the Debug Mode mod) for locations from which to disable accessing chests remotely. You can list multiple with commas."] = "要禁用远程访问箱子的地点内部名称（可由 Debug Mode mod 显示）。多个名称可用逗号分隔。",
            ["Hotkey to open chest UI"] = "打开箱子界面的快捷键",
            ["Toggle UI"] = "切换界面",
            ["The keys which show or hide the chest UI."] = "显示或隐藏箱子界面的按键。",
            ["Reopen last chest"] = "重新打开上一个箱子",
            ["When you press the 'toggle UI' button, whether to reopen the last chest you selected yourself during the current game session."] = "按下“切换界面”按钮时，是否重新打开本次游戏中你上次选择的箱子。",
            ["Default category"] = "默认分类",
            ["When you press the 'toggle UI' button, show the chests in this category by default (if set). This applies after 'reopen last chest'."] = "按下“切换界面”按钮时，默认显示此分类中的箱子（如果已设置）。此设置在“重新打开上一个箱子”之后生效。",
            ["Controls when chest UI is open"] = "箱子界面打开时的控制",
            ["Edit chest"] = "编辑箱子",
            ["The keys which edit the options for the current chest."] = "编辑当前箱子选项的按键。",
            ["Sort player items"] = "整理玩家物品",
            ["The keys which sort items in the player's inventory while a chest is open."] = "箱子打开时整理玩家背包物品的按键。",
            ["Navigate: previous chest"] = "导航：上一个箱子",
            ["The keys which navigate to the previous chest while the menu is open."] = "菜单打开时导航到上一个箱子的按键。",
            ["Navigate: next chest"] = "导航：下一个箱子",
            ["The keys which navigate to the next chest while the menu is open."] = "菜单打开时导航到下一个箱子的按键。",
            ["Navigate: previous category"] = "导航：上一个分类",
            ["The keys which navigate to the previous category while the menu is open."] = "菜单打开时导航到上一个分类的按键。",
            ["Navigate: next category"] = "导航：下一个分类",
            ["The keys which navigate to the next category while the menu is open."] = "菜单打开时导航到下一个分类的按键。",
            ["Hold to scroll categories"] = "按住以滚动分类",
            ["The keys which, when held, enable scrolling the category dropdown with the mouse scroll wheel."] = "按住后可用鼠标滚轮滚动分类下拉框的按键。",
            ["Hold to scroll chests"] = "按住以滚动箱子",
            ["The keys which, when held, enable scrolling the chests dropdown with the mouse scroll wheel."] = "按住后可用鼠标滚轮滚动箱子下拉框的按键。",
            ["Open Search Menu"] = "打开搜索菜单",
            ["While viewing a chest UI, the keys which open the search menu for all chests."] = "查看箱子界面时，打开所有箱子搜索菜单的按键。",
            ["Search Menu Preview Chest"] = "搜索菜单预览箱子",
            ["While viewing the search UI, the keys which can be held to show a preview tooltip of the hovered chest's contents."] = "查看搜索界面时，按住后可显示悬停箱子内容预览提示的按键。"
        },
        ["PeacefulEnd.AlternativeTextures"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["Paint Bucket"] = "油漆桶",
            ["Paint Brush"] = "油漆刷",
            ["Scissors"] = "剪刀",
            ["Spray Can"] = "喷漆罐",
            ["Texture Catalogue"] = "材质目录",
            ["Catalogue"] = "目录",
            ["Use Random Textures When Placing..."] = "放置时使用随机材质...",
            ["Content Packs"] = "内容包",
            ["Categories"] = "分类",
            ["Artifact Spots"] = "远古斑点",
            ["Flooring"] = "地板",
            ["Fruit Tree"] = "果树",
            ["Tree"] = "树木",
            ["Hoe Dirt"] = "耕地",
            ["Grass"] = "草丛",
            ["Furniture"] = "家具",
            ["Object"] = "物品",
            ["Farm Animal"] = "农场动物",
            ["Monster"] = "怪物",
            ["Building"] = "建筑",
            ["Unknown"] = "未知",
            ["Craftable"] = "可制作物",
            ["Crop"] = "作物",
            ["GiantCrop"] = "巨型作物",
            ["ResourceClump"] = "资源块",
            ["Bush"] = "灌木",
            ["Character"] = "角色",
            ["Decoration"] = "装饰",
            ["Variation: {{variation}}"] = "变体：{{variation}}",
            ["Type: {{textureType}}\nSeason(s): {{season}}\nVariations: {{variations}}"] = "类型：{{textureType}}\n季节：{{season}}\n变体：{{variations}}",
            ["Type: {{textureType}}\nSeason(s): {{season}}"] = "类型：{{textureType}}\n季节：{{season}}",
            ["If checked, this alternative texture will be available"] = "勾选后，此替换材质将可用",
            ["> (AT) Tanga forest Building"] = "> (AT) Tanga 森林建筑",
            ["building change."] = "建筑变化。"
        },

        ["Bouhm.NPCMapLocations"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["Whether the minimap should be displayed."] = "是否显示迷你地图。",
            ["Whether the minimap should be locked in its current position, so you can't move it in-game by holding right-click and dragging it."] = "是否锁定迷你地图当前位置，锁定后无法在游戏中按住右键拖动它。",
            ["The width in pixels of the minimap when shown on-screen."] = "迷你地图显示在屏幕上时的宽度（像素）。",
            ["75 pixels"] = "75 像素",
            ["The height in pixels of the minimap when shown on-screen."] = "迷你地图显示在屏幕上时的高度（像素）。",
            ["45 pixels"] = "45 像素",
            ["Minimap X position"] = "迷你地图 X 位置",
            ["The X pixel position of the minimap when shown on-screen."] = "迷你地图显示在屏幕上时的 X 像素位置。",
            ["12 pixels"] = "12 像素",
            ["Minimap Y position"] = "迷你地图 Y 位置",
            ["The Y pixel position of the minimap when shown on-screen."] = "迷你地图显示在屏幕上时的 Y 像素位置。",
            ["Minimap opacity"] = "迷你地图不透明度",
            ["The default opacity level for the minimap, as a value between 0% (transparent) and 100% (opaque)."] = "迷你地图的默认不透明度，范围为 0%（透明）到 100%（不透明）。",
            ["Map display"] = "地图显示",
            ["NPC marker style"] = "NPC 标记样式",
            ["The NPC map marker style to draw. The 'Default' style uses a tailored crop position for each NPC, but custom NPCs may not appear correctly. The 'Vanilla' style uses the game's built-in NPC icons, which has better compatibility but results in smaller icons on the map."] = "NPC 地图标记的绘制样式。“默认”会为每个 NPC 使用定制裁剪位置，但自定义 NPC 可能显示不正确。“原版”使用游戏内置 NPC 图标，兼容性更好，但地图上的图标会更小。",
            ["Vanilla (experimental)"] = "原版（实验性）",
            ["Map marker size (NPCs)"] = "地图标记大小（NPC）",
            ["The size of NPC map markers relative to the default."] = "NPC 地图标记相对于默认值的大小。",
            ["Map marker size (you)"] = "地图标记大小（你）",
            ["The size of your character's map marker relative to the default."] = "你的角色地图标记相对于默认值的大小。",
            ["Map marker size (other players)"] = "地图标记大小（其他玩家）",
            ["The size of other players' map marker relative to the default."] = "其他玩家地图标记相对于默认值的大小。",
            ["Show farm buildings"] = "显示农场建筑",
            ["Whether to show icons for constructed farm buildings on the map."] = "是否在地图上显示已建造农场建筑的图标。",
            ["Filters"] = "筛选",
            ["NPCs spoken to"] = "已交谈 NPC",
            ["Choose which NPCs are shown based on whether you've spoken to them today."] = "根据今天是否已经交谈来选择显示哪些 NPC。",
            ["Show all"] = "显示全部",
            ["Only show those spoken to today"] = "只显示今天交谈过的",
            ["Only show those not spoken to today"] = "只显示今天未交谈的",
            ["Whether to only show villagers on the map if the player is in the same location they're in."] = "是否只在玩家与村民处于同一地点时才在地图上显示他们。",
            ["The minimum friendship level for NPCs shown on the map."] = "地图上显示 NPC 所需的最低好感度。",
            ["The maximum friendship level for NPCs shown on the map."] = "地图上显示 NPC 的最高好感度。",
            ["Whether to show an icon on NPC markers when it's their birthday or they have an active quest."] = "当 NPC 生日或有可用任务时，是否在其标记上显示图标。",
            ["Whether to show villagers that would normally be hidden."] = "是否显示通常会隐藏的村民。",
            ["Show bookseller"] = "显示书商",
            ["Whether to show the bookseller when he's in town."] = "书商进城时是否显示他。",
            ["Whether to show the Traveling Merchant when she's in the forest."] = "旅行货车商人在森林时是否显示她。",
            ["Show players' children"] = "显示玩家的孩子",
            ["Whether to show players' children on the map."] = "是否在地图上显示玩家的孩子。",
            ["Whether to show horses on the map."] = "是否在地图上显示马。",
            ["Always visible"] = "始终显示",
            ["Always hidden"] = "始终隐藏",
            ["Performance"] = "性能",
            ["Minimap cache time"] = "迷你地图缓存时间",
            ["The time between each minimap render update. Lower values mean the minimap will follow your movement more smoothly, while higher values may improve performance."] = "迷你地图每次渲染更新之间的时间。数值越低，迷你地图跟随移动越流畅；数值越高，性能可能更好。",
            ["0.25 seconds"] = "0.25 秒",
            ["NPC cache time"] = "NPC 缓存时间",
            ["The time between each NPC marker update. Lower values mean smoother NPC movement on the map or minimap, while higher values may improve performance."] = "NPC 标记每次更新之间的时间。数值越低，NPC 在地图或迷你地图上的移动越流畅；数值越高，性能可能更好。",
            ["0.5 seconds"] = "0.5 秒"
        },
        ["CP.Peachyogurt.Sprites"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["Abigail"] = "阿比盖尔",
            ["Alex"] = "亚历克斯",
            ["Elliott"] = "艾利欧特",
            ["Harvey"] = "哈维",
            ["Sam"] = "山姆",
            ["Sebastian"] = "塞巴斯蒂安",
            ["Shane"] = "谢恩",
            ["Haley"] = "海莉",
            ["Leah"] = "莉亚",
            ["Maru"] = "玛鲁",
            ["Penny"] = "潘妮",
            ["Emily"] = "艾米丽"
        },
        ["YunHikari.TheMutteringFarmer"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["mute"] = "静音",
            ["smallSelect"] = "小选择音效",
            ["bigSelect"] = "大选择音效",
            ["button1"] = "按钮音效",
            ["coin"] = "金币音效",
            ["give_gift"] = "送礼音效",
            ["newRecipe"] = "新食谱音效",
            ["objectiveComplete"] = "目标完成音效",
            ["pickUpItem"] = "拾取物品音效",
            ["select"] = "选择音效",
            ["Farmer.TakeDamage"] = "玩家受伤",
            ["Monster.Killed"] = "怪物被击败",
            ["Monster.TakeDamage"] = "怪物受伤",
            ["Monster.Nearby"] = "附近有怪物",
            ["Inventory.GetItem"] = "获得物品",
            ["Inventory.Full"] = "背包已满",
            ["Child.Nearby"] = "附近有孩子",
            ["Pet.Nearby"] = "附近有宠物",
            ["Horse.Nearby"] = "附近有马",
            ["Npc.Nearby.Many"] = "附近有多个 NPC",
            ["Npc.Nearby"] = "附近有 NPC",
            ["BirthdayNpc.Nearby"] = "附近有生日 NPC",
            ["DatingNpc.Nearby"] = "附近有恋爱对象",
            ["DivorcedNpc.Nearby"] = "附近有离婚对象",
            ["Spouse.Nearby"] = "配偶在附近",
            ["Roommate.Nearby"] = "室友在附近",
            ["Farmer.SelectTool"] = "选择工具",
            ["Farmer.SelectItem"] = "选择物品",
            ["Farmer.Arrive"] = "玩家到达",
            ["Farmer.Eat"] = "玩家进食",
            ["Farmer.Drink"] = "玩家喝饮料",
            ["Tree.Fall"] = "树倒下",
            ["ResourceClump.Destroy"] = "摧毁资源块",
            ["Object.Destroy"] = "摧毁物品",
            ["Crop.Mature.Nearby"] = "附近作物成熟",
            ["Forage.Nearby"] = "附近有采集物"
        },
        ["flashshifter.GrandpasFarm"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["MistEffects"] = "雨天雾效",
            ["Mist Effects"] = "雨天雾效",
            ["SandboxLayout"] = "沙盒布局",
            ["Sandbox Layout"] = "沙盒布局",
            ["RemoveFences"] = "移除栅栏",
            ["Remove Fences"] = "移除栅栏",
            ["RemoveGrassStretch"] = "移除长条草地",
            ["Remove Grass Stretch"] = "移除长条草地",
            ["RemoveLandExpansionPond"] = "移除扩展区域池塘",
            ["Remove Land Expansion Pond"] = "移除扩展区域池塘",
            ["GrassCropField"] = "将耕地区改为草地",
            ["Grass Crop Field"] = "将耕地区改为草地",
            ["HeavyDebris"] = "大量资源杂物",
            ["Heavy Debris"] = "大量资源杂物",
            ["LargerBridgeToGrandpasShed"] = "加宽通往爷爷棚屋的桥",
            ["Larger Bridge To Grandpas Shed"] = "加宽通往爷爷棚屋的桥",
            ["Larger Bridge To Grandpa's Shed"] = "加宽通往爷爷棚屋的桥",
            ["LargerGreenhouse"] = "更大的温室",
            ["Larger Greenhouse"] = "更大的温室",
            ["RemoveGreenhouseObjects"] = "移除温室内固定物件",
            ["Remove Greenhouse Objects"] = "移除温室内固定物件",
            ["Adds mist during rainy days to many maps. This does impact performance, so disable this if you're experiencing lag on rainy days."] = "雨天在多个地图添加雾效。会影响性能，如果雨天卡顿请关闭。",
            ["Turns the farmland into a huge dirt field, similar to the standard farm. Perfect for players who want full control over map design."] = "将农场耕地区改成类似标准农场的大型泥土地，适合想完全自定义布局的玩家。",
            ["Removes pre-built fences on the farm."] = "移除农场预设栅栏。",
            ["Removes the long bit of grass adjacent to the dirt crop field."] = "移除耕地区旁边的长条草地。",
            ["Removes pond from later game expanded area of farm"] = "移除后期扩展农场区域里的池塘。",
            ["Changes the large dirt field to grass."] = "将大片泥土地改为草地。",
            ["Fills the farm landscape with a plethora of resources."] = "在农场中加入大量可采集资源。",
            ["Extends the patched bridge height by 1 tile, making it connect better with player-laid paths that are 2 tiles in height."] = "将修复后的桥高度增加 1 格，使它更适配玩家铺设的 2 格高道路。",
            ["Makes the greenhouse slightly bigger, with designated fruit tree spots."] = "略微扩大温室，并提供指定果树位置。",
            ["Removes static objects, such as plants and barrels, from the greenhouse interior."] = "移除温室内的植物、木桶等固定装饰。"
        },
        ["flashshifter.FrontierFarm"] = new(StringComparer.OrdinalIgnoreCase)
        {
            ["SandboxLayout"] = "沙盒布局",
            ["Sandbox Layout"] = "沙盒布局",
            ["LargerGreenhouse"] = "更大的温室",
            ["Larger Greenhouse"] = "更大的温室",
            ["RemoveGreenhouseObjects"] = "移除温室内固定物件",
            ["Remove Greenhouse Objects"] = "移除温室内固定物件",
            ["RemovePicnicTable"] = "移除野餐桌",
            ["Remove Picnic Table"] = "移除野餐桌",
            ["RemoveEasternVerticalFence"] = "移除东侧竖向栅栏",
            ["Remove Eastern Vertical Fence"] = "移除东侧竖向栅栏",
            ["RemoveStonePathways"] = "移除石质小路",
            ["Remove Stone Pathways"] = "移除石质小路",
            ["RemoveTreeHidingBackyardMouseStatue"] = "移除遮挡后院老鼠雕像的树",
            ["Remove Tree Hiding Backyard Mouse Statue"] = "移除遮挡后院老鼠雕像的树",
            ["SmallerBackyardFence"] = "缩小后院栅栏",
            ["Smaller Backyard Fence"] = "缩小后院栅栏",
            ["InstantlyUnlockBridge"] = "立即解锁桥",
            ["Instantly Unlock Bridge"] = "立即解锁桥",
            ["InstantlyUnlockDesertShortcut"] = "立即解锁沙漠捷径",
            ["Instantly Unlock Desert Shortcut"] = "立即解锁沙漠捷径",
            ["MistEffects"] = "雨天雾效",
            ["Mist Effects"] = "雨天雾效"
        }
    };
    static readonly Dictionary<string, Dictionary<string, string>> I18nTranslationCache = new(StringComparer.OrdinalIgnoreCase);
    static readonly HashSet<string> MissingTranslations = new(StringComparer.OrdinalIgnoreCase);
    static readonly object TranslationLock = new();
    static readonly object MissingLock = new();
    static Type Dropdown_Type;
    static FieldInfo Dropdown_Dropped_Field;
    static FieldInfo Dropdown_Callback_Field;
    static PropertyInfo Dropdown_Position_Property;
    static PropertyInfo Dropdown_Width_Property;
    static PropertyInfo Dropdown_Height_Property;
    static PropertyInfo Dropdown_MaxValuesAtOnce_Property;
    static PropertyInfo Dropdown_Choices_Property;
    static PropertyInfo Dropdown_ActiveChoice_Property;
    static PropertyInfo Dropdown_ActivePosition_Property;

    internal static void Init(AndroidModFixManager modFix)
    {
        monitor = SCore.Instance.SMAPIMonitor;
        modFix.RegisterOnModLoaded("GenericModConfigMenu.dll", OnModLoaded);
    }
    static MethodInfo ModEntry_OnRendered_MethodInfo;
    static void OnModLoaded(Assembly asm)
    {
        monitor.Log("Start GenericModConfigFix");

        var hp = AndroidPatcher.harmony;
        var modEntry = asm.GetType("GenericModConfigMenu.Mod");
        ModEntry_OnRendered_MethodInfo = AccessTools.Method(modEntry, "OnRendered");
        hp.Patch(
            original: ModEntry_OnRendered_MethodInfo,
            prefix: new(typeof(GenericConfigMenuModFix), nameof(ModEntry_OnRendered))
        );
        //new rendered on Overlays
        SCore.OnRenderedStepEvent += SCore_OnRenderedStepEvent;

        monitor.Log("Patch ModEntry.OnRendered()");

        Dropdown_Type = asm.GetType("SpaceShared.UI.Dropdown");
        if (Dropdown_Type is not null)
        {
            Dropdown_Dropped_Field = AccessTools.Field(Dropdown_Type, "Dropped");
            Dropdown_Callback_Field = AccessTools.Field(Dropdown_Type, "Callback");
            Dropdown_Position_Property = AccessTools.Property(Dropdown_Type, "Position");
            Dropdown_Width_Property = AccessTools.Property(Dropdown_Type, "Width");
            Dropdown_Height_Property = AccessTools.Property(Dropdown_Type, "Height");
            Dropdown_MaxValuesAtOnce_Property = AccessTools.Property(Dropdown_Type, "MaxValuesAtOnce");
            Dropdown_Choices_Property = AccessTools.Property(Dropdown_Type, "Choices");
            Dropdown_ActiveChoice_Property = AccessTools.Property(Dropdown_Type, "ActiveChoice");
            Dropdown_ActivePosition_Property = AccessTools.Property(Dropdown_Type, "ActivePosition");

            var dropdownUpdate = AccessTools.Method(Dropdown_Type, "Update", [typeof(bool)]);
            hp.Patch(
                original: dropdownUpdate,
                prefix: new(typeof(GenericConfigMenuModFix), nameof(Dropdown_Update_Prefix)),
                postfix: new(typeof(GenericConfigMenuModFix), nameof(Dropdown_Update_Postfix))
            );

            monitor.Log("Patch SpaceShared.UI.Dropdown.Update()");
        }

        PatchTranslationApi(asm, hp);

        monitor.Log("Done GenericModConfigFix");
    }

    static void PatchTranslationApi(Assembly asm, Harmony hp)
    {
        var apiType = asm.GetType("GenericModConfigMenu.Framework.Api");
        if (apiType is null)
            return;

        int patched = 0;
        foreach (var method in AccessTools.GetDeclaredMethods(apiType))
        {
            HarmonyMethod prefix = method.Name switch
            {
                "AddBoolOption" => new(typeof(GenericConfigMenuModFix), nameof(TranslateNameTooltip_Prefix)),
                "AddKeybind" => new(typeof(GenericConfigMenuModFix), nameof(TranslateNameTooltip_Prefix)),
                "AddKeybindList" => new(typeof(GenericConfigMenuModFix), nameof(TranslateNameTooltip_Prefix)),
                "AddComplexOption" => new(typeof(GenericConfigMenuModFix), nameof(TranslateNameTooltip_Prefix)),
                "AddTextOption" when method.GetParameters().Any(p => p.Name == "formatAllowedValue") => new(typeof(GenericConfigMenuModFix), nameof(TranslateTextOption_Prefix)),
                "AddTextOption" => new(typeof(GenericConfigMenuModFix), nameof(TranslateNameTooltip_Prefix)),
                "AddNumberOption" when method.GetParameters().Any(p => p.ParameterType == typeof(Func<int, string>)) => new(typeof(GenericConfigMenuModFix), nameof(TranslateNumberIntOption_Prefix)),
                "AddNumberOption" when method.GetParameters().Any(p => p.ParameterType == typeof(Func<float, string>)) => new(typeof(GenericConfigMenuModFix), nameof(TranslateNumberFloatOption_Prefix)),
                "AddNumberOption" => new(typeof(GenericConfigMenuModFix), nameof(TranslateNameTooltip_Prefix)),
                "AddSectionTitle" => new(typeof(GenericConfigMenuModFix), nameof(TranslateTextTooltip_Prefix)),
                "AddPageLink" => new(typeof(GenericConfigMenuModFix), nameof(TranslateTextTooltip_Prefix)),
                "AddParagraph" => new(typeof(GenericConfigMenuModFix), nameof(TranslateTextOnly_Prefix)),
                "AddSubHeader" => new(typeof(GenericConfigMenuModFix), nameof(TranslateTextOnly_Prefix)),
                "AddPage" => new(typeof(GenericConfigMenuModFix), nameof(TranslatePageTitle_Prefix)),
                "AddChoiceOption" => new(typeof(GenericConfigMenuModFix), nameof(TranslateChoiceOption_Prefix)),
                "RegisterSimpleOption" => new(typeof(GenericConfigMenuModFix), nameof(TranslateObsoleteOption_Prefix)),
                "RegisterClampedOption" => new(typeof(GenericConfigMenuModFix), nameof(TranslateObsoleteOption_Prefix)),
                "RegisterChoiceOption" => new(typeof(GenericConfigMenuModFix), nameof(TranslateObsoleteOption_Prefix)),
                "RegisterLabel" => new(typeof(GenericConfigMenuModFix), nameof(TranslateObsoleteLabel_Prefix)),
                "RegisterPageLabel" => new(typeof(GenericConfigMenuModFix), nameof(TranslateObsoleteLabel_Prefix)),
                "RegisterParagraph" => new(typeof(GenericConfigMenuModFix), nameof(TranslateObsoleteParagraph_Prefix)),
                _ => null
            };

            if (prefix is null)
                continue;

            hp.Patch(method, prefix: prefix);
            patched++;
        }

        monitor.Log($"Patch Generic Mod Config Menu translation API methods: {patched}");
    }

    static void TranslateNameTooltip_Prefix(IManifest mod, ref Func<string> name, ref Func<string> tooltip)
    {
        name = WrapTranslation(mod, name);
        tooltip = WrapTranslation(mod, tooltip);
    }

    static void TranslateTextTooltip_Prefix(IManifest mod, ref Func<string> text, ref Func<string> tooltip)
    {
        text = WrapTranslation(mod, text);
        tooltip = WrapTranslation(mod, tooltip);
    }

    static void TranslateTextOnly_Prefix(IManifest mod, ref Func<string> text)
    {
        text = WrapTranslation(mod, text);
    }

    static void TranslatePageTitle_Prefix(IManifest mod, ref Func<string> pageTitle)
    {
        pageTitle = WrapTranslation(mod, pageTitle);
    }

    static void TranslateTextOption_Prefix(IManifest mod, ref Func<string> name, ref Func<string> tooltip, ref Func<string, string> formatAllowedValue)
    {
        name = WrapTranslation(mod, name);
        tooltip = WrapTranslation(mod, tooltip);
        formatAllowedValue = WrapTranslation(mod, formatAllowedValue);
    }

    static void TranslateNumberIntOption_Prefix(IManifest mod, ref Func<string> name, ref Func<string> tooltip, ref Func<int, string> formatValue)
    {
        name = WrapTranslation(mod, name);
        tooltip = WrapTranslation(mod, tooltip);
        formatValue = WrapTranslation(mod, formatValue);
    }

    static void TranslateNumberFloatOption_Prefix(IManifest mod, ref Func<string> name, ref Func<string> tooltip, ref Func<float, string> formatValue)
    {
        name = WrapTranslation(mod, name);
        tooltip = WrapTranslation(mod, tooltip);
        formatValue = WrapTranslation(mod, formatValue);
    }

    static void TranslateChoiceOption_Prefix(IManifest mod, ref Func<string> name, ref Func<string> tooltip, ref Func<string, string> formatAllowedValues)
    {
        name = WrapTranslation(mod, name);
        tooltip = WrapTranslation(mod, tooltip);
        formatAllowedValues = WrapTranslation(mod, formatAllowedValues);
    }

    static void TranslateObsoleteOption_Prefix(IManifest mod, ref string optionName, ref string optionDesc)
    {
        optionName = Translate(mod, optionName);
        optionDesc = Translate(mod, optionDesc);
    }

    static void TranslateObsoleteLabel_Prefix(IManifest mod, ref string labelName, ref string labelDesc)
    {
        labelName = Translate(mod, labelName);
        labelDesc = Translate(mod, labelDesc);
    }

    static void TranslateObsoleteParagraph_Prefix(IManifest mod, ref string paragraph)
    {
        paragraph = Translate(mod, paragraph);
    }

    static Func<string> WrapTranslation(IManifest mod, Func<string> getText)
    {
        if (getText is null)
            return null;

        return () => Translate(mod, getText());
    }

    static Func<string, string> WrapTranslation(IManifest mod, Func<string, string> format)
    {
        if (format is null)
            return value => Translate(mod, value);

        return value => Translate(mod, format(value));
    }

    static Func<int, string> WrapTranslation(IManifest mod, Func<int, string> format)
    {
        if (format is null)
            return null;

        return value => Translate(mod, format(value));
    }

    static Func<float, string> WrapTranslation(IManifest mod, Func<float, string> format)
    {
        if (format is null)
            return null;

        return value => Translate(mod, format(value));
    }

    static Dictionary<string, string> GetI18nTranslations(IManifest mod)
    {
        if (mod is null)
            return [];

        lock (TranslationLock)
        {
            if (I18nTranslationCache.TryGetValue(mod.UniqueID, out var cached))
                return cached;

            var result = new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase);
            try
            {
                IModMetadata metadata = SCore.Instance.GetModRegistry().Get(mod.UniqueID);
                string i18nPath = Path.Combine(metadata.DirectoryPath, "i18n");
                var defaults = ReadI18nFile(Path.Combine(i18nPath, "default.json"));
                var zh = ReadFirstExistingI18nFile(i18nPath, "zh.json", "zh-CN.json", "zh-Hans.json");

                foreach (var pair in defaults)
                {
                    if (!zh.TryGetValue(pair.Key, out string translated))
                        continue;

                    string source = pair.Value?.Trim();
                    translated = translated?.Trim();
                    if (string.IsNullOrWhiteSpace(source) || string.IsNullOrWhiteSpace(translated) || string.Equals(source, translated, StringComparison.Ordinal))
                        continue;

                    result[source] = translated;
                }
            }
            catch (Exception ex)
            {
                monitor.Log($"GMCM translation: failed reading i18n for {mod.UniqueID}: {ex.Message}", LogLevel.Trace);
            }

            I18nTranslationCache[mod.UniqueID] = result;
            if (result.Count > 0)
                monitor.Log($"GMCM translation: loaded {result.Count} i18n text mappings for {mod.UniqueID}.", LogLevel.Trace);

            return result;
        }
    }

    static Dictionary<string, string> ReadFirstExistingI18nFile(string i18nPath, params string[] names)
    {
        foreach (string name in names)
        {
            string path = Path.Combine(i18nPath, name);
            if (File.Exists(path))
                return ReadI18nFile(path);
        }

        return [];
    }

    static Dictionary<string, string> ReadI18nFile(string path)
    {
        if (!File.Exists(path))
            return [];

        var result = new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase);
        using var reader = new JsonTextReader(new StreamReader(path))
        {
            DateParseHandling = DateParseHandling.None
        };
        JObject root = JObject.Load(reader);
        foreach (var property in root.Properties())
        {
            if (property.Value.Type == JTokenType.String)
                result[property.Name] = property.Value.Value<string>();
        }

        return result;
    }

    static string Translate(IManifest mod, string text)
    {
        if (string.IsNullOrWhiteSpace(text))
            return text;

        string normalized = text.Trim();
        if (mod is not null)
        {
            var i18nTranslations = GetI18nTranslations(mod);
            if (i18nTranslations.TryGetValue(normalized, out string i18nTranslation))
                return PreservePadding(text, i18nTranslation);

            if (ModTranslations.TryGetValue(mod.UniqueID, out var modTranslations) && modTranslations.TryGetValue(normalized, out string modTranslation))
                return PreservePadding(text, modTranslation);
        }

        if (GlobalTranslations.TryGetValue(normalized, out string globalTranslation))
            return PreservePadding(text, globalTranslation);

        RecordMissingTranslation(mod, normalized);
        return text;
    }

    static void RecordMissingTranslation(IManifest mod, string text)
    {
        if (!ShouldRecordMissing(text))
            return;

        string modId = mod?.UniqueID ?? "unknown";
        string key = modId + "\t" + text;
        lock (MissingLock)
        {
            if (!MissingTranslations.Add(key))
                return;

            try
            {
                string line = $"{DateTime.Now:yyyy-MM-dd HH:mm:ss}\t{modId}\t{text.Replace("\r", " ").Replace("\n", "\\n")}\n";
                WriteMissingTranslationLine(Path.Combine(Constants.DataPath, "gmcm-missing-translations.tsv"), line);
                WriteMissingTranslationLine(Path.Combine(Constants.LogDir, "gmcm-missing-translations.tsv"), line);
            }
            catch (Exception ex)
            {
                monitor.Log($"GMCM translation: failed writing missing translation log: {ex.Message}", LogLevel.Trace);
            }
        }
    }

    static void WriteMissingTranslationLine(string path, string line)
    {
        string directory = Path.GetDirectoryName(path);
        if (!string.IsNullOrEmpty(directory))
            Directory.CreateDirectory(directory);

        File.AppendAllText(path, line);
    }

    static bool ShouldRecordMissing(string text)
    {
        if (string.IsNullOrWhiteSpace(text) || text.Length > 500)
            return false;

        bool hasAsciiLetter = text.Any(ch => ch is >= 'A' and <= 'Z' or >= 'a' and <= 'z');
        bool hasCjk = text.Any(ch => ch >= '\u4e00' && ch <= '\u9fff');
        return hasAsciiLetter && !hasCjk;
    }

    static string PreservePadding(string original, string translated)
    {
        int prefixLength = original.Length - original.TrimStart().Length;
        int suffixLength = original.Length - original.TrimEnd().Length;
        return original[..prefixLength] + translated + original[(original.Length - suffixLength)..];
    }

    private static void SCore_OnRenderedStepEvent(StardewValley.Mods.RenderSteps step, Microsoft.Xna.Framework.Graphics.SpriteBatch spriteBatch, Microsoft.Xna.Framework.Graphics.RenderTarget2D? renderTarget)
    {
        if (SModHooks.CurrentRenderedStep == StardewValley.Mods.RenderSteps.Overlays)
        {
            IModMetadata modAPI = SCore.Instance.GetModRegistry().Get("spacechase0.GenericModConfigMenu");
            ModEntry_OnRendered_MethodInfo.Invoke(modAPI.Mod, [null, new RenderedEventArgs()]);
        }
    }

    static bool ModEntry_OnRendered(object sender, RenderedEventArgs e)
    {
        if (SModHooks.CurrentRenderedStep != StardewValley.Mods.RenderSteps.Overlays)
            return false;

        return true;
    }

    static void Dropdown_Update_Prefix(object __instance, out DropdownUpdateState __state)
    {
        __state = new DropdownUpdateState(
            WasDropped: (bool)Dropdown_Dropped_Field.GetValue(__instance),
            WasFreshClick: IsFreshClick(),
            PreviousChoice: (int)Dropdown_ActiveChoice_Property.GetValue(__instance)
        );
    }

    static void Dropdown_Update_Postfix(object __instance, DropdownUpdateState __state)
    {
        if (!__state.WasDropped || !__state.WasFreshClick)
            return;

        var position = (Vector2)Dropdown_Position_Property.GetValue(__instance);
        int width = (int)Dropdown_Width_Property.GetValue(__instance);
        int height = (int)Dropdown_Height_Property.GetValue(__instance);
        int maxValuesAtOnce = (int)Dropdown_MaxValuesAtOnce_Property.GetValue(__instance);
        var choices = (string[])Dropdown_Choices_Property.GetValue(__instance);
        int activePosition = (int)Dropdown_ActivePosition_Property.GetValue(__instance);

        int rows = Math.Min(maxValuesAtOnce, choices.Length - activePosition);
        if (rows <= 0)
            return;

        int listHeight = rows * height;
        int listTop = Math.Min((int)position.Y, Game1.uiViewport.Height - listHeight);
        var bounds = new Rectangle((int)position.X, listTop, width, maxValuesAtOnce * height);
        int x = Game1.getMouseX();
        int y = Game1.getMouseY();
        if (!bounds.Contains(x, y))
            return;

        int choice = activePosition + (y - listTop) / height;
        if (choice < 0 || choice >= choices.Length)
            return;

        if (choice != __state.PreviousChoice)
        {
            Dropdown_ActiveChoice_Property.SetValue(__instance, choice);
            (Dropdown_Callback_Field.GetValue(__instance) as Delegate)?.DynamicInvoke(__instance);
        }
    }

    static bool IsFreshClick()
    {
        MouseState mouse = Game1.input.GetMouseState();
        return mouse.LeftButton == ButtonState.Pressed && Game1.oldMouseState.LeftButton == ButtonState.Released;
    }

    readonly record struct DropdownUpdateState(bool WasDropped, bool WasFreshClick, int PreviousChoice);
}
