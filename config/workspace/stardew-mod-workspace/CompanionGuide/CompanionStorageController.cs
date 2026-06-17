using Microsoft.Xna.Framework;
using StardewModdingAPI;
using StardewModdingAPI.Events;
using StardewValley;
using StardewValley.Objects;

namespace Libala.CompanionGuide;

internal sealed class CompanionStorageController
{
    private const string SaveKey = "work-storage-chest";
    private readonly IDataHelper data;
    private readonly IMonitor monitor;
    private readonly HashSet<Debris> ignoredOverflowDebris = new();
    private CompanionStorageBinding? binding;
    private GameLocation? collectingLocation;
    private Vector2 collectionOrigin;
    private int collectionTicks;

    public bool IsSelecting { get; private set; }

    public CompanionStorageController(IDataHelper data, IMonitor monitor)
    {
        this.data = data;
        this.monitor = monitor;
    }

    public void Load()
    {
        this.binding = this.data.ReadSaveData<CompanionStorageBinding>(SaveKey);
        this.ResetSession();
    }

    public void ResetSession()
    {
        this.IsSelecting = false;
        this.collectingLocation = null;
        this.collectionTicks = 0;
        this.ignoredOverflowDebris.Clear();
    }

    public void Update()
    {
        this.collectionTicks = Math.Max(0, this.collectionTicks - 1);
        if (this.collectionTicks == 0)
            this.collectingLocation = null;
    }

    public void BeginSelection()
    {
        this.IsSelecting = true;
        Game1.addHUDMessage(HUDMessage.ForCornerTextbox("请点击一个普通箱子作为小豪的收纳箱"));
    }

    public bool TrySelect(GameLocation location, Vector2 tile)
    {
        if (!this.IsSelecting)
            return false;

        this.IsSelecting = false;
        if (!TryGetOrdinaryChest(location, tile, out _))
        {
            Game1.addHUDMessage(HUDMessage.ForCornerTextbox("没有选中普通箱子，请重新设置"));
            return true;
        }

        this.binding = new CompanionStorageBinding
        {
            LocationName = location.NameOrUniqueName,
            TileX = (int)tile.X,
            TileY = (int)tile.Y
        };
        this.data.WriteSaveData(SaveKey, this.binding);
        Game1.playSound("coin");
        Game1.addHUDMessage(HUDMessage.ForCornerTextbox("小豪的工作收纳箱已设置"));
        return true;
    }

    public void ExpectDrops(GameLocation location, Vector2 origin)
    {
        if (this.binding is null)
            return;

        this.collectingLocation = location;
        this.collectionOrigin = origin;
        this.collectionTicks = 300;
    }

    public HashSet<Debris> SnapshotDebris(GameLocation location)
    {
        return new HashSet<Debris>(location.debris);
    }

    public void CollectNewDebris(GameLocation location, Vector2 origin, HashSet<Debris> knownDebris)
    {
        if (this.binding is null)
            return;

        Chest? chest = this.GetBoundChest();
        if (chest is null)
            return;

        Vector2 previousOrigin = this.collectionOrigin;
        this.collectionOrigin = origin;
        foreach (Debris debris in location.debris.Where(debris => !knownDebris.Contains(debris)).ToArray())
        {
            if (this.ignoredOverflowDebris.Remove(debris))
                continue;

            this.StoreDebris(location, chest, debris);
        }
        this.collectionOrigin = previousOrigin;
    }

    public void OnDebrisListChanged(object? sender, DebrisListChangedEventArgs e)
    {
        if (this.collectionTicks <= 0 || !ReferenceEquals(this.collectingLocation, e.Location))
            return;

        Chest? chest = this.GetBoundChest();
        if (chest is null)
            return;

        foreach (Debris debris in e.Added.ToArray())
        {
            if (this.ignoredOverflowDebris.Remove(debris))
                continue;

            this.StoreDebris(e.Location, chest, debris);
        }
    }

    public void StoreFishingCatch(Item item, GameLocation location, Vector2 originTile)
    {
        string displayName = item.DisplayName;
        if (this.TryShipFishingCatch(item))
        {
            Game1.addHUDMessage(HUDMessage.ForCornerTextbox($"小豪钓到了{displayName}，已放入出货箱"));
            return;
        }

        int originalStack = item.Stack;
        int storedInChest = 0;
        Chest? chest = this.GetBoundChest();
        Item? remaining = item;
        try
        {
            if (chest is not null)
            {
                remaining = chest.addItem(remaining);
                storedInChest = originalStack - (remaining?.Stack ?? 0);
            }

            if (remaining is not null)
                remaining = Game1.player.addItemToInventory(remaining);
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Storing companion fishing catch failed: {ex}", LogLevel.Warn);
            remaining = item;
        }

        if (remaining is not null)
            location.debris.Add(new Debris(remaining, originTile * Game1.tileSize));

        string destination = remaining is not null
            ? (storedInChest > 0 ? "，部分入箱，余下留在地面" : "，背包已满，留在地面")
            : storedInChest > 0 ? "，已放入收纳箱" : "，已放入背包";
        Game1.addHUDMessage(HUDMessage.ForCornerTextbox($"小豪钓到了{displayName}{destination}"));
    }

    private bool TryShipFishingCatch(Item item)
    {
        try
        {
            if (!item.canBeShipped())
                return false;

            Farm farm = Game1.getFarm();
            farm.getShippingBin(Game1.player).Add(item);
            farm.lastItemShipped = item;
            farm.showShipment(item, playThrowSound: false);
            return true;
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Shipping companion fishing catch failed: {ex}", LogLevel.Warn);
            return false;
        }
    }

    public string StoreRequestedGift(string qualifiedItemId, string displayName, int quantity)
    {
        Chest? chest = this.GetBoundChest();
        int remainingCount = quantity;
        int storedInBackpack = 0;
        int storedInChest = 0;
        int leftOnGround = 0;
        while (remainingCount > 0)
        {
            Item? item = ItemRegistry.Create(qualifiedItemId, remainingCount, quality: 0, allowNull: true);
            if (item is null || item.Name == Item.ErrorItemName || !string.Equals(item.QualifiedItemId, qualifiedItemId, StringComparison.OrdinalIgnoreCase))
            {
                this.monitor.Log($"Rejected invalid companion requested item ID '{qualifiedItemId}'.", LogLevel.Warn);
                return $"我找到了{displayName}，但没有安全地拿出来。这次先不给你，避免物品损坏。";
            }

            int batchCount = Math.Max(1, item.Stack);
            Item? remaining = item;
            try
            {
                remaining = Game1.player.addItemToInventory(remaining);
                storedInBackpack += batchCount - (remaining?.Stack ?? 0);
                if (remaining is not null && chest is not null)
                {
                    int beforeChest = remaining.Stack;
                    remaining = chest.addItem(remaining);
                    storedInChest += beforeChest - (remaining?.Stack ?? 0);
                }
            }
            catch (Exception ex)
            {
                this.monitor.Log($"Giving requested companion item failed: {ex}", LogLevel.Warn);
            }

            if (remaining is not null)
            {
                leftOnGround += remaining.Stack;
                Game1.currentLocation.debris.Add(new Debris(remaining, Game1.player.Tile * Game1.tileSize));
            }

            remainingCount -= batchCount;
        }

        Game1.playSound("coin");
        if (leftOnGround > 0)
            return $"给你 {displayName} x{quantity}。背包和收纳箱放不下的 {leftOnGround} 个留在你脚边了。";
        if (storedInChest > 0 && storedInBackpack > 0)
            return $"给你 {displayName} x{quantity}。一部分在背包，一部分放进收纳箱了。";
        if (storedInChest > 0)
            return $"给你 {displayName} x{quantity}，已经放进收纳箱了。";
        return $"给你 {displayName} x{quantity}，已经放进背包了。";
    }

    private Chest? GetBoundChest()
    {
        if (this.binding is null)
            return null;

        GameLocation? location = Game1.getLocationFromName(this.binding.LocationName);
        Vector2 tile = new(this.binding.TileX, this.binding.TileY);
        if (location is not null && TryGetOrdinaryChest(location, tile, out Chest? chest))
            return chest;

        this.binding = null;
        this.data.WriteSaveData<CompanionStorageBinding>(SaveKey, null);
        this.collectingLocation = null;
        this.collectionTicks = 0;
        Game1.addHUDMessage(HUDMessage.ForCornerTextbox("小豪的收纳箱已不存在，请重新设置"));
        return null;
    }

    private void StoreDebris(GameLocation location, Chest chest, Debris debris)
    {
        if (debris.debrisType.Value is not Debris.DebrisType.OBJECT and not Debris.DebrisType.RESOURCE)
            return;

        Item? item = this.CreateItem(debris);
        if (item is null || item.Stack <= 0)
            return;

        int originalStack = item.Stack;
        Item? remaining;
        try
        {
            remaining = chest.addItem(item);
            if (remaining is not null)
                remaining = Game1.player.addItemToInventory(remaining);
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Storing companion work drops failed: {ex}", LogLevel.Warn);
            return;
        }

        int remainingStack = remaining?.Stack ?? 0;
        if (remainingStack >= originalStack)
            return;

        location.debris.Remove(debris);
        if (remaining is not null)
        {
            Debris overflow = new(remaining, this.collectionOrigin * Game1.tileSize);
            this.ignoredOverflowDebris.Add(overflow);
            location.debris.Add(overflow);
        }
    }

    private Item? CreateItem(Debris debris)
    {
        if (debris.item is not null)
        {
            Item item = debris.item.getOne();
            item.Stack = debris.item.Stack;
            return item;
        }

        if (string.IsNullOrWhiteSpace(debris.itemId.Value))
            return null;

        return ItemRegistry.Create(debris.itemId.Value, Math.Max(1, debris.Chunks.Count), debris.itemQuality);
    }

    private static bool TryGetOrdinaryChest(GameLocation location, Vector2 tile, out Chest? chest)
    {
        chest = null;
        if (!location.Objects.TryGetValue(tile, out StardewValley.Object? obj)
            || obj is not Chest found
            || !found.playerChest.Value
            || found.SpecialChestType != Chest.SpecialChestTypes.None)
            return false;

        chest = found;
        return true;
    }
}

internal sealed class CompanionStorageBinding
{
    public string LocationName { get; set; } = "";

    public int TileX { get; set; }

    public int TileY { get; set; }
}
