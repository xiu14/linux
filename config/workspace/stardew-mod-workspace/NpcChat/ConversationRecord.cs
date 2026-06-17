namespace Libala.NpcChat;

internal sealed class ConversationRecord
{
    public string NpcName { get; set; } = "";

    public string Summary { get; set; } = "";

    public int SummarizedMessageCount { get; set; }

    public long LastUpdatedUtcTicks { get; set; }

    public List<ChatMessage> Messages { get; set; } = new();
}
