namespace Libala.CompanionGuide;

internal sealed class ConversationRecord
{
    public long LastUpdatedUtcTicks { get; set; }

    public List<ChatMessage> Messages { get; set; } = new();
}
