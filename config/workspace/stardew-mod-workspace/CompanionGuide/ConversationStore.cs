using StardewModdingAPI;

namespace Libala.CompanionGuide;

internal sealed class ConversationStore
{
    private readonly IDataHelper data;
    private readonly IMonitor monitor;

    public ConversationStore(IDataHelper data, IMonitor monitor)
    {
        this.data = data;
        this.monitor = monitor;
    }

    public ConversationRecord Load()
    {
        try
        {
            return this.data.ReadJsonFile<ConversationRecord>(this.GetPath()) ?? new ConversationRecord();
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Unable to load companion memory: {ex}", LogLevel.Warn);
            return new ConversationRecord();
        }
    }

    public void Save(ConversationRecord memory)
    {
        try
        {
            this.data.WriteJsonFile(this.GetPath(), memory);
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Unable to save companion memory: {ex}", LogLevel.Error);
        }
    }

    private string GetPath()
    {
        string raw = Constants.SaveFolderName ?? $"save-{StardewValley.Game1.uniqueIDForThisGame}";
        string saveKey = string.Concat(raw.Select(character => char.IsLetterOrDigit(character) || character is '-' or '_' ? character : '_'));
        return $"data/{saveKey}/companion.json";
    }
}
