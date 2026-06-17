using Microsoft.Xna.Framework;
using StardewValley;
using StardewValley.TerrainFeatures;
using StardewValley.Tools;

namespace Libala.CompanionGuide;

internal enum CompanionWorkType
{
    None,
    Water,
    Harvest,
    CutGrass,
    ChopWood,
    BreakStone
}

internal sealed class CompanionWorkController
{
    private readonly CompanionStorageController storage;
    private CompanionWorkType workType;
    private GameLocation? workLocation;
    private Vector2? targetTile;
    private readonly HashSet<Vector2> skippedTargets = new();
    private int cooldownMilliseconds;
    private int completedCount;
    private int statusVisibleMilliseconds;

    public bool IsWorking => this.workType != CompanionWorkType.None;

    public bool HasVisibleStatus => this.IsWorking || this.statusVisibleMilliseconds > 0;

    public string Status { get; private set; } = "";

    public CompanionWorkController(CompanionStorageController storage)
    {
        this.storage = storage;
    }

    public void Start(CompanionWorkType type, GameLocation location)
    {
        this.workType = type;
        this.workLocation = location;
        this.targetTile = null;
        this.skippedTargets.Clear();
        this.cooldownMilliseconds = 0;
        this.completedCount = 0;
        this.statusVisibleMilliseconds = 0;
        this.Status = $"开始{GetLabel(type)}：当前区域";
    }

    public void Stop(string status = "已停止工作")
    {
        this.workType = CompanionWorkType.None;
        this.workLocation = null;
        this.targetTile = null;
        this.skippedTargets.Clear();
        this.cooldownMilliseconds = 0;
        this.Status = status;
        this.statusVisibleMilliseconds = string.IsNullOrWhiteSpace(status) ? 0 : 3600;
    }

    public void UpdateElapsed(int elapsedMilliseconds)
    {
        this.cooldownMilliseconds = Math.Max(0, this.cooldownMilliseconds - elapsedMilliseconds);
        this.statusVisibleMilliseconds = Math.Max(0, this.statusVisibleMilliseconds - elapsedMilliseconds);
    }

    public void OnPlayerWarped()
    {
        if (this.IsWorking)
            this.Stop("换地图后已停止工作");
    }

    public bool TryGetDestination(GameLocation location, Point actorTile, out Point destination)
    {
        destination = Point.Zero;
        if (!this.IsWorking)
            return false;

        if (!ReferenceEquals(location, this.workLocation))
        {
            this.Stop("换地图后已停止工作");
            return false;
        }

        if (!this.targetTile.HasValue || !this.IsValidTarget(location, this.targetTile.Value))
            this.targetTile = this.FindNearestTarget(location, actorTile);

        if (!this.targetTile.HasValue)
        {
            this.Stop($"{GetLabel(this.workType)}完成，共操作 {this.completedCount} 次");
            return false;
        }

        destination = this.GetApproachTile(this.targetTile.Value, actorTile);
        this.Status = $"{GetLabel(this.workType)}中，已操作 {this.completedCount} 次";
        return true;
    }

    public void SkipCurrentTarget()
    {
        if (this.targetTile.HasValue)
            this.skippedTargets.Add(this.targetTile.Value);

        this.targetTile = null;
    }

    public void Fail(string message)
    {
        this.Stop($"工作失败：{message}");
    }

    public bool TryWorkInRange(GameLocation location, Point actorTile)
    {
        if (!this.IsWorking || !this.targetTile.HasValue || this.cooldownMilliseconds > 0)
            return false;

        Vector2 tile = this.targetTile.Value;
        if (Math.Abs(actorTile.X - tile.X) + Math.Abs(actorTile.Y - tile.Y) > 1)
            return false;

        if (this.workType == CompanionWorkType.ChopWood
            && location.terrainFeatures.TryGetValue(tile, out TerrainFeature? waitingFeature)
            && waitingFeature is Tree waitingTree
            && waitingTree.falling.Value)
        {
            this.cooldownMilliseconds = 120;
            return true;
        }

        bool changed = this.PerformWork(location, tile);
        this.cooldownMilliseconds = 200;
        if (changed)
            this.completedCount++;

        if (!this.IsValidTarget(location, tile))
            this.targetTile = null;

        return true;
    }

    private Vector2? FindNearestTarget(GameLocation location, Point origin)
    {
        IEnumerable<Vector2> candidates = this.workType switch
        {
            CompanionWorkType.Water => location.terrainFeatures.Pairs
                .Where(pair => pair.Value is HoeDirt dirt && dirt.crop is not null && dirt.needsWatering() && !dirt.isWatered())
                .Select(pair => pair.Key),
            CompanionWorkType.Harvest => location.terrainFeatures.Pairs
                .Where(pair => pair.Value is HoeDirt dirt && dirt.readyForHarvest())
                .Select(pair => pair.Key),
            CompanionWorkType.CutGrass => location.terrainFeatures.Pairs
                .Where(pair => pair.Value is Grass)
                .Select(pair => pair.Key)
                .Concat(location.Objects.Pairs.Where(pair => pair.Value.IsWeeds()).Select(pair => pair.Key)),
            CompanionWorkType.ChopWood => location.terrainFeatures.Pairs
                .Where(pair => pair.Value is Tree tree && !tree.tapped.Value)
                .Select(pair => pair.Key)
                .Concat(location.Objects.Pairs.Where(pair => pair.Value.IsTwig()).Select(pair => pair.Key))
                .Concat(location.resourceClumps.Where(IsWoodClump).Select(clump => clump.Tile)),
            CompanionWorkType.BreakStone => location.Objects.Pairs
                .Where(pair => pair.Value.IsBreakableStone())
                .Select(pair => pair.Key),
            _ => Enumerable.Empty<Vector2>()
        };

        return candidates
            .Where(tile => !this.skippedTargets.Contains(tile))
            .OrderBy(tile => Math.Abs(origin.X - tile.X) + Math.Abs(origin.Y - tile.Y))
            .Cast<Vector2?>()
            .FirstOrDefault();
    }

    private bool IsValidTarget(GameLocation location, Vector2 tile)
    {
        return this.workType switch
        {
            CompanionWorkType.Water => location.terrainFeatures.TryGetValue(tile, out TerrainFeature? waterFeature)
                && waterFeature is HoeDirt waterDirt
                && waterDirt.crop is not null
                && waterDirt.needsWatering()
                && !waterDirt.isWatered(),
            CompanionWorkType.Harvest => location.terrainFeatures.TryGetValue(tile, out TerrainFeature? harvestFeature)
                && harvestFeature is HoeDirt harvestDirt
                && harvestDirt.readyForHarvest(),
            CompanionWorkType.CutGrass => location.terrainFeatures.TryGetValue(tile, out TerrainFeature? grassFeature)
                    && grassFeature is Grass
                || location.Objects.TryGetValue(tile, out StardewValley.Object? weed)
                    && weed.IsWeeds(),
            CompanionWorkType.ChopWood => location.terrainFeatures.TryGetValue(tile, out TerrainFeature? treeFeature)
                && treeFeature is Tree tree
                && !tree.tapped.Value
                || location.Objects.TryGetValue(tile, out StardewValley.Object? twig)
                && twig.IsTwig()
                || location.resourceClumps.Any(clump => clump.Tile == tile && IsWoodClump(clump)),
            CompanionWorkType.BreakStone => location.Objects.TryGetValue(tile, out StardewValley.Object? stone)
                && stone.IsBreakableStone(),
            _ => false
        };
    }

    private bool PerformWork(GameLocation location, Vector2 tile)
    {
        this.storage.ExpectDrops(location, tile);
        HashSet<Debris> debrisBefore = this.storage.SnapshotDebris(location);
        bool changed = false;
        try
        {
            switch (this.workType)
            {
                case CompanionWorkType.Water:
                    if (location.terrainFeatures.TryGetValue(tile, out TerrainFeature? waterFeature) && waterFeature is HoeDirt dirt)
                    {
                        dirt.state.Value = HoeDirt.watered;
                        location.playSound("wateringCan");
                        changed = true;
                    }
                    break;

                case CompanionWorkType.Harvest:
                    if (location.terrainFeatures.TryGetValue(tile, out TerrainFeature? harvestFeature)
                        && harvestFeature is HoeDirt cropDirt
                        && cropDirt.crop is not null
                        && cropDirt.crop.harvest((int)tile.X, (int)tile.Y, cropDirt, null, isForcedScytheHarvest: true))
                    {
                        cropDirt.destroyCrop(showAnimation: true);
                        changed = true;
                    }
                    break;

                case CompanionWorkType.CutGrass:
                    MeleeWeapon scythe = new("66") { lastUser = Game1.player };
                    if (location.terrainFeatures.TryGetValue(tile, out TerrainFeature? grassFeature) && grassFeature is Grass grass)
                    {
                        if (grass.performToolAction(scythe, 0, tile))
                            location.terrainFeatures.Remove(tile);
                        changed = true;
                        break;
                    }
                    if (location.Objects.TryGetValue(tile, out StardewValley.Object? weed) && weed.IsWeeds())
                    {
                        if (weed.performToolAction(scythe))
                        {
                            weed.performRemoveAction();
                            location.Objects.Remove(tile);
                        }
                        changed = true;
                    }
                    break;

                case CompanionWorkType.ChopWood:
                    Axe axe = new() { lastUser = Game1.player };
                    axe.upgradeLevel.Value = 4;
                    if (location.terrainFeatures.TryGetValue(tile, out TerrainFeature? treeFeature) && treeFeature is Tree tree)
                    {
                        if (tree.performToolAction(axe, 0, tile))
                            location.terrainFeatures.Remove(tile);
                        changed = true;
                        break;
                    }
                    if (location.Objects.TryGetValue(tile, out StardewValley.Object? twig) && twig.IsTwig())
                    {
                        if (twig.performToolAction(axe))
                        {
                            twig.performRemoveAction();
                            location.Objects.Remove(tile);
                        }
                        changed = true;
                        break;
                    }
                    ResourceClump? clump = location.resourceClumps.FirstOrDefault(candidate => candidate.Tile == tile && IsWoodClump(candidate));
                    if (clump is not null)
                    {
                        if (clump.performToolAction(axe, 0, tile))
                            location.resourceClumps.Remove(clump);
                        changed = true;
                    }
                    break;

                case CompanionWorkType.BreakStone:
                    if (location.Objects.TryGetValue(tile, out StardewValley.Object? stone) && stone.IsBreakableStone())
                    {
                        Pickaxe pickaxe = new() { lastUser = Game1.player };
                        pickaxe.upgradeLevel.Value = 4;
                        if (stone.performToolAction(pickaxe))
                        {
                            location.destroyObject(tile, Game1.player);
                            location.playSound("stoneCrack", tile);
                            Game1.stats.RocksCrushed++;
                        }
                        changed = true;
                    }
                    break;
            }
        }
        finally
        {
            this.storage.CollectNewDebris(location, tile, debrisBefore);
        }

        return changed;
    }

    private Point GetApproachTile(Vector2 target, Point actorTile)
    {
        Point targetPoint = new((int)target.X, (int)target.Y);
        if (Math.Abs(actorTile.X - targetPoint.X) + Math.Abs(actorTile.Y - targetPoint.Y) <= 1)
            return actorTile;

        Point[] around =
        {
            new(targetPoint.X - 1, targetPoint.Y),
            new(targetPoint.X + 1, targetPoint.Y),
            new(targetPoint.X, targetPoint.Y - 1),
            new(targetPoint.X, targetPoint.Y + 1)
        };
        return around.OrderBy(tile => Math.Abs(actorTile.X - tile.X) + Math.Abs(actorTile.Y - tile.Y)).First();
    }

    private static string GetLabel(CompanionWorkType type)
    {
        return type switch
        {
            CompanionWorkType.Water => "浇水",
            CompanionWorkType.Harvest => "收割",
            CompanionWorkType.CutGrass => "割草",
            CompanionWorkType.ChopWood => "伐木",
            CompanionWorkType.BreakStone => "采石",
            _ => "工作"
        };
    }

    private static bool IsWoodClump(ResourceClump clump)
    {
        return clump.parentSheetIndex.Value is ResourceClump.stumpIndex or ResourceClump.hollowLogIndex;
    }
}
