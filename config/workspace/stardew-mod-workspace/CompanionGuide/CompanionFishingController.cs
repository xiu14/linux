using Microsoft.Xna.Framework;
using StardewModdingAPI;
using StardewValley;
using StardewValley.Tools;

namespace Libala.CompanionGuide;

internal sealed class CompanionFishingController
{
    private readonly CompanionStorageController storage;
    private readonly IMonitor monitor;
    private readonly Dictionary<string, int> playerCatchCounts = new(StringComparer.OrdinalIgnoreCase);
    private GameLocation? lastFishingLocation;
    private int lastWaterDepth = 1;
    private bool joinedCurrentCast;

    public bool IsFishing { get; private set; }

    public Vector2 BobberWorldPosition { get; private set; }

    public CompanionFishingController(CompanionStorageController storage, IMonitor monitor)
    {
        this.storage = storage;
        this.monitor = monitor;
    }

    public void Reset()
    {
        this.IsFishing = false;
        this.lastFishingLocation = null;
        this.lastWaterDepth = 1;
        this.joinedCurrentCast = false;
        this.CaptureCatchCounts(Game1.player);
    }

    public bool WantsToFish(Farmer player, bool canFish)
    {
        return canFish && player.CurrentTool is FishingRod rod && rod.isFishing;
    }

    public bool TryGetFishingSpot(GameLocation location, Farmer player, out Point standingTile, out Vector2 bobberWorldPosition)
    {
        standingTile = Point.Zero;
        bobberWorldPosition = Vector2.Zero;
        if (player.CurrentTool is not FishingRod rod || !rod.isFishing)
        {
            return false;
        }

        this.lastFishingLocation = location;
        this.lastWaterDepth = Math.Max(1, rod.clearWaterDistance);
        this.BobberWorldPosition = rod.bobber.Value;

        Point playerTile = player.TilePoint;
        Point playerBobberTile = new((int)(rod.bobber.Value.X / Game1.tileSize), (int)(rod.bobber.Value.Y / Game1.tileSize));
        Point[] candidates = player.FacingDirection is 0 or 2
            ? new[]
            {
                new Point(playerTile.X - 1, playerTile.Y),
                new Point(playerTile.X + 1, playerTile.Y),
                new Point(playerTile.X - 2, playerTile.Y),
                new Point(playerTile.X + 2, playerTile.Y)
            }
            : new[]
            {
                new Point(playerTile.X, playerTile.Y - 1),
                new Point(playerTile.X, playerTile.Y + 1),
                new Point(playerTile.X, playerTile.Y - 2),
                new Point(playerTile.X, playerTile.Y + 2)
            };

        foreach (Point candidate in candidates)
        {
            if (!this.IsValidStandingTile(location, candidate))
                continue;

            Point offset = new(candidate.X - playerTile.X, candidate.Y - playerTile.Y);
            Point adjacentBobber = new(playerBobberTile.X + offset.X, playerBobberTile.Y + offset.Y);
            if (location.isTileFishable(adjacentBobber.X, adjacentBobber.Y))
            {
                standingTile = candidate;
                bobberWorldPosition = ToCenteredWorldPosition(adjacentBobber);
                this.BobberWorldPosition = bobberWorldPosition;
                return true;
            }

            for (int distance = 1; distance <= 5; distance++)
            {
                Point forwardTile = GetForwardTile(candidate, player.FacingDirection, distance);
                if (!location.isTileFishable(forwardTile.X, forwardTile.Y))
                    continue;

                standingTile = candidate;
                bobberWorldPosition = ToCenteredWorldPosition(forwardTile);
                this.BobberWorldPosition = bobberWorldPosition;
                return true;
            }
        }

        return false;
    }

    public void BeginFishing(GameLocation location, Farmer player, Vector2 bobberWorldPosition)
    {
        if (player.CurrentTool is not FishingRod rod || !rod.isFishing)
        {
            this.IsFishing = false;
            return;
        }

        this.IsFishing = true;
        this.BobberWorldPosition = bobberWorldPosition;
        this.lastFishingLocation = location;
        this.lastWaterDepth = Math.Max(1, rod.clearWaterDistance);
        this.joinedCurrentCast = true;
    }

    public void Pause()
    {
        this.IsFishing = false;
    }

    public void MatchPlayerCatches(GameLocation location, Farmer player, bool canFish)
    {
        foreach (KeyValuePair<string, int[]> pair in player.fishCaught.Pairs)
        {
            int count = pair.Value.Length > 0 ? pair.Value[0] : 0;
            int previousCount = this.playerCatchCounts.GetValueOrDefault(pair.Key);
            this.playerCatchCounts[pair.Key] = count;
            int newCatches = Math.Max(0, count - previousCount);
            if (newCatches <= 0 || !canFish || !this.CanMatchCatch(player))
                continue;

            for (int index = 0; index < newCatches; index++)
                this.TryCatchFish(this.lastFishingLocation ?? location, player);
            this.joinedCurrentCast = false;
        }
    }

    private bool CanMatchCatch(Farmer player)
    {
        return this.joinedCurrentCast || player.CurrentTool is FishingRod;
    }

    private void CaptureCatchCounts(Farmer? player)
    {
        this.playerCatchCounts.Clear();
        if (player is null)
            return;

        foreach (KeyValuePair<string, int[]> pair in player.fishCaught.Pairs)
            this.playerCatchCounts[pair.Key] = pair.Value.Length > 0 ? pair.Value[0] : 0;
    }

    private void TryCatchFish(GameLocation location, Farmer player)
    {
        try
        {
            Vector2 bobberTile = this.BobberWorldPosition == Vector2.Zero
                ? player.Tile
                : this.BobberWorldPosition / Game1.tileSize;
            Item? fish = location.getFish(
                millisecondsAfterNibble: 600f,
                bait: null,
                waterDepth: this.lastWaterDepth,
                who: player,
                baitPotency: 0d,
                bobberTile: bobberTile
            );
            if (fish is null)
                return;

            this.storage.StoreFishingCatch(fish, location, bobberTile);
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Companion fishing catch failed: {ex}", LogLevel.Warn);
        }
    }

    private bool IsValidStandingTile(GameLocation location, Point tile)
    {
        Vector2 tilePosition = new(tile.X, tile.Y);
        return location.isTileOnMap(tilePosition)
            && location.isTilePassable(tilePosition)
            && !location.isTileFishable(tile.X, tile.Y)
            && location.CanItemBePlacedHere(tilePosition);
    }

    private static Point GetForwardTile(Point standingTile, int facingDirection, int distance)
    {
        return facingDirection switch
        {
            0 => new Point(standingTile.X, standingTile.Y - distance),
            1 => new Point(standingTile.X + distance, standingTile.Y),
            2 => new Point(standingTile.X, standingTile.Y + distance),
            _ => new Point(standingTile.X - distance, standingTile.Y)
        };
    }

    private static Vector2 ToCenteredWorldPosition(Point tile)
    {
        return new Vector2(
            tile.X * Game1.tileSize + Game1.tileSize / 2f,
            tile.Y * Game1.tileSize + Game1.tileSize / 2f
        );
    }
}
