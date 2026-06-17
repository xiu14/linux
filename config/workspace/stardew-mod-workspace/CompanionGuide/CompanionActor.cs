using Microsoft.Xna.Framework;
using Microsoft.Xna.Framework.Graphics;
using StardewModdingAPI;
using StardewValley;
using StardewValley.Pathfinding;

namespace Libala.CompanionGuide;

internal sealed class CompanionActor
{
    private readonly ModConfig config;
    private readonly CompanionWorkController work;
    private readonly CompanionFishingController fishing;
    private readonly IMonitor monitor;
    private Farmer? visual;
    private PathFindController? movement;
    private MovementMode movementMode;
    private GameLocation? activeLocation;
    private int stalledMilliseconds;
    private int pathRetryCooldownMilliseconds;

    public CompanionActor(ModConfig config, CompanionWorkController work, CompanionFishingController fishing, IMonitor monitor)
    {
        this.config = config;
        this.work = work;
        this.fishing = fishing;
        this.monitor = monitor;
    }

    public void Reset()
    {
        this.work.Stop("");
        this.fishing.Reset();
        this.ClearMovement();
        this.visual = null;
        this.activeLocation = null;
    }

    public void OnPlayerWarped(GameLocation newLocation)
    {
        this.work.OnPlayerWarped();
        this.fishing.Reset();
        this.ClearMovement();
        this.visual = null;
        this.activeLocation = null;
    }

    public void CancelMovement()
    {
        this.ClearMovement();
    }

    public void Update(GameTime time)
    {
        if (!Context.IsWorldReady || Game1.currentLocation is null || Game1.player is null || Game1.eventUp)
            return;

        int elapsedMilliseconds = Math.Max(1, time.ElapsedGameTime.Milliseconds);
        this.work.UpdateElapsed(elapsedMilliseconds);
        this.pathRetryCooldownMilliseconds = Math.Max(0, this.pathRetryCooldownMilliseconds - elapsedMilliseconds);
        GameLocation location = Game1.currentLocation;
        Farmer player = Game1.player;
        this.EnsureVisual(player, location);
        Farmer? visual = this.visual;
        if (visual is null)
            return;

        if (!ReferenceEquals(this.activeLocation, location))
        {
            this.MoveBesidePlayer(location);
        }

        this.fishing.MatchPlayerCatches(location, player, !this.work.IsWorking);
        bool wantsFishing = this.fishing.WantsToFish(player, !this.work.IsWorking);
        if (!this.work.IsWorking && Vector2.Distance(visual.Position, player.Position) > 900f)
        {
            visual.Position = player.Position + new Vector2(-64f, 0f);
            this.ClearMovement();
        }

        Point destination;
        MovementMode mode;
        try
        {
            if (this.work.TryWorkInRange(location, visual.TilePoint))
                this.ClearMovement(100);

            if (this.work.TryGetDestination(location, visual.TilePoint, out destination))
            {
                this.fishing.Pause();
                mode = MovementMode.Working;
                visual.speed = Farmer.runningSpeed;
            }
            else if (wantsFishing && this.fishing.TryGetFishingSpot(location, player, out Point fishingTile, out Vector2 bobberPosition))
            {
                mode = MovementMode.Fishing;
                visual.speed = Farmer.walkingSpeed;
                destination = fishingTile;
                if (GetTileDistance(visual.TilePoint, destination) == 0)
                {
                    this.ClearMovement();
                    visual.faceDirection(player.FacingDirection);
                    this.fishing.BeginFishing(location, player, bobberPosition);
                    visual.updateMovementAnimation(time);
                    return;
                }

                this.fishing.Pause();
            }
            else
            {
                this.fishing.Pause();
                mode = MovementMode.Following;
                visual.speed = Farmer.walkingSpeed;
                if (GetTileDistance(visual.TilePoint, player.TilePoint) <= 2)
                {
                    this.ClearMovement();
                    visual.faceDirection(player.FacingDirection);
                    visual.updateMovementAnimation(time);
                    return;
                }

                destination = this.GetFollowingTile(player);
            }
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Companion work action failed; stopping current work: {ex}", LogLevel.Error);
            this.work.Fail("目标处理异常，请查看 SMAPI 日志");
            this.ClearMovement();
            return;
        }

        if (mode is MovementMode.Working or MovementMode.Fishing && GetTileDistance(visual.TilePoint, destination) == 0)
        {
            this.ClearMovement(80);
            if (mode == MovementMode.Fishing)
                visual.faceDirection(player.FacingDirection);
            visual.updateMovementAnimation(time);
            return;
        }

        bool routeFinished = this.movement is null || this.movement.pathToEndPoint is null || this.movement.pathToEndPoint.Count == 0;
        bool movementModeChanged = this.movement is not null && this.movementMode != mode;
        if ((routeFinished || movementModeChanged) && this.pathRetryCooldownMilliseconds == 0)
        {
            this.TryStartMovement(visual, location, destination, mode);
        }

        PathFindController? movement = this.movement;
        if (movement?.pathToEndPoint is not null && movement.pathToEndPoint.Count > 0)
        {
            Vector2 priorPosition = visual.Position;
            try
            {
                if (movement.update(time))
                    this.ClearMovement();
            }
            catch (Exception ex)
            {
                this.monitor.Log($"Companion route update failed; resetting its path: {ex}", LogLevel.Warn);
                this.ClearMovement(1000);
            }

            if (Vector2.DistanceSquared(priorPosition, visual.Position) < 1f)
            {
                this.stalledMilliseconds += elapsedMilliseconds;
                if (this.stalledMilliseconds >= 1500)
                {
                    if (mode == MovementMode.Working)
                        this.work.SkipCurrentTarget();
                    this.ClearMovement(750);
                }
            }
            else
                this.stalledMilliseconds = 0;
        }
        else if (mode is MovementMode.Following or MovementMode.Fishing)
            visual.faceDirection(player.FacingDirection);

        visual.updateMovementAnimation(time);
    }

    public void Draw(SpriteBatch spriteBatch)
    {
        if (!Context.IsWorldReady || Game1.eventUp || this.visual is null || Game1.activeClickableMenu is not null)
            return;

        Farmer visual = this.visual;
        visual.draw(spriteBatch);
        if (this.fishing.IsFishing)
            this.DrawFishing(spriteBatch, visual);
    }

    public void DrawPortrait(SpriteBatch spriteBatch, Rectangle bounds)
    {
        if (this.visual is null)
            return;

        spriteBatch.Draw(Game1.staminaRect, bounds, Color.Wheat * 0.24f);
        this.visual.FarmerRenderer.drawMiniPortrat(spriteBatch, new Vector2(bounds.X, bounds.Y), 0.99f, bounds.Width / 16f, 2, this.visual);
    }

    public bool ContainsWorldPosition(Vector2 point)
    {
        if (this.visual is null || !ReferenceEquals(this.activeLocation, Game1.currentLocation))
            return false;

        Rectangle bounds = this.visual.GetBoundingBox();
        bounds.Inflate(28, 48);
        return bounds.Contains((int)point.X, (int)point.Y);
    }

    public Rectangle GetScreenBounds()
    {
        Rectangle bounds = this.visual?.GetBoundingBox() ?? new Rectangle(Game1.viewport.Width / 2, Game1.viewport.Height / 2, 64, 64);
        return new Rectangle(bounds.X - Game1.viewport.X, bounds.Y - Game1.viewport.Y, bounds.Width, bounds.Height);
    }

    private void EnsureVisual(Farmer player, GameLocation location)
    {
        if (this.visual is not null)
            return;

        this.visual = new Farmer(new FarmerSprite(null), player.Position + new Vector2(-64f, 0f), 2, this.config.CompanionName, new List<Item>(), this.config.IsMale)
        {
            currentLocation = location,
            isFakeEventActor = true,
            ignoreCollisions = true
        };
        this.visual.FarmerRenderer = new FarmerRenderer("Characters\\Farmer\\farmer_base", this.visual);
        this.visual.changeHairStyle(this.config.HairStyle);
        this.visual.changeSkinColor(this.config.Skin);
        this.visual.changeShirt(this.config.Shirt);
        this.visual.changePantStyle(this.config.Pants);
        this.visual.changeShoeColor(this.config.Shoes);
        this.visual.hairstyleColor.Value = new Color(93, 62, 48);
        this.visual.pantsColor.Value = new Color(58, 92, 113);
        this.activeLocation = location;
    }

    private void MoveBesidePlayer(GameLocation location)
    {
        if (this.visual is null)
            return;

        this.activeLocation = location;
        this.visual.currentLocation = location;
        this.visual.Position = Game1.player.Position + new Vector2(-64f, 0f);
        this.ClearMovement();
    }

    private void TryStartMovement(Farmer visual, GameLocation location, Point destination, MovementMode mode)
    {
        this.movementMode = mode;
        this.stalledMilliseconds = 0;
        try
        {
            this.movement = new PathFindController(visual, location, destination, -1);
            if (this.movement.pathToEndPoint is null || this.movement.pathToEndPoint.Count == 0)
            {
                this.movement = null;
                if (mode == MovementMode.Working)
                    this.work.SkipCurrentTarget();
                this.pathRetryCooldownMilliseconds = mode switch
                {
                    MovementMode.Following => 500,
                    MovementMode.Fishing => 400,
                    _ => 1000
                };
                visual.Halt();
            }
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Companion route creation failed; it will retry: {ex}", LogLevel.Warn);
            this.movement = null;
            this.pathRetryCooldownMilliseconds = 1000;
        }
    }

    private void ClearMovement(int retryDelayMilliseconds = 0)
    {
        this.movement = null;
        this.movementMode = MovementMode.Following;
        this.stalledMilliseconds = 0;
        this.pathRetryCooldownMilliseconds = Math.Max(this.pathRetryCooldownMilliseconds, retryDelayMilliseconds);
        this.visual?.Halt();
    }

    private void DrawFishing(SpriteBatch spriteBatch, Farmer visual)
    {
        Vector2 handPosition = Game1.GlobalToLocal(Game1.viewport, visual.Position + new Vector2(32f, 22f));
        Vector2 rodOffset = visual.FacingDirection switch
        {
            0 => new Vector2(0f, -42f),
            1 => new Vector2(42f, 0f),
            2 => new Vector2(0f, 42f),
            _ => new Vector2(-42f, 0f)
        };
        Vector2 rodTip = handPosition + rodOffset;
        Vector2 lineEnd = Game1.GlobalToLocal(Game1.viewport, this.fishing.BobberWorldPosition);
        DrawSegment(spriteBatch, handPosition, rodTip, new Color(113, 78, 43), 4f);
        DrawSegment(spriteBatch, rodTip, lineEnd, Color.White * 0.75f, 2f);

        spriteBatch.Draw(Game1.staminaRect, new Rectangle((int)lineEnd.X - 5, (int)lineEnd.Y - 5, 10, 10), new Color(210, 71, 60));
    }

    private static void DrawSegment(SpriteBatch spriteBatch, Vector2 start, Vector2 end, Color color, float thickness)
    {
        Vector2 line = end - start;
        float length = line.Length();
        if (length > 1f)
        {
            float rotation = (float)Math.Atan2(line.Y, line.X);
            spriteBatch.Draw(Game1.staminaRect, start, null, color, rotation, Vector2.Zero, new Vector2(length, thickness), SpriteEffects.None, 1f);
        }
    }

    private Point GetFollowingTile(Farmer player)
    {
        Point tile = player.TilePoint;
        return player.FacingDirection switch
        {
            0 => new Point(tile.X, tile.Y + 2),
            1 => new Point(tile.X - 2, tile.Y),
            2 => new Point(tile.X, tile.Y - 2),
            _ => new Point(tile.X + 2, tile.Y)
        };
    }

    private static int GetTileDistance(Point first, Point second)
    {
        return Math.Abs(first.X - second.X) + Math.Abs(first.Y - second.Y);
    }

    private enum MovementMode
    {
        Following,
        Working,
        Fishing
    }
}
