using System.Text;
using StardewModdingAPI;

namespace Libala.NpcChat;

internal sealed class ConversationStore
{
    private readonly IDataHelper data;
    private readonly IMonitor monitor;

    public ConversationStore(IDataHelper data, IMonitor monitor)
    {
        this.data = data;
        this.monitor = monitor;
    }

    public ConversationRecord Load(string npcName)
    {
        try
        {
            return this.data.ReadJsonFile<ConversationRecord>(this.GetPath(npcName))
                ?? new ConversationRecord { NpcName = npcName };
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Unable to load chat memory for {npcName}: {ex}", LogLevel.Warn);
            return new ConversationRecord { NpcName = npcName };
        }
    }

    public void Save(ConversationRecord record)
    {
        try
        {
            this.data.WriteJsonFile(this.GetPath(record.NpcName), record);
        }
        catch (Exception ex)
        {
            this.monitor.Log($"Unable to save chat memory for {record.NpcName}: {ex}", LogLevel.Error);
        }
    }

    public void Clear(string npcName)
    {
        this.Save(new ConversationRecord { NpcName = npcName });
    }

    private string GetPath(string npcName)
    {
        string saveKey = Sanitize(Constants.SaveFolderName ?? $"save-{StardewValley.Game1.uniqueIDForThisGame}");
        return $"data/{saveKey}/{Sanitize(npcName)}.json";
    }

    private static string Sanitize(string value)
    {
        StringBuilder result = new();
        foreach (char character in value)
        {
            if (char.IsLetterOrDigit(character) || character is '-' or '_')
                result.Append(character);
            else
                result.Append('_');
        }

        return result.ToString();
    }
}
