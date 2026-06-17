namespace Libala.NpcChat;

internal sealed class ChatMessage
{
    public ChatMessage()
    {
    }

    public ChatMessage(string role, string content)
    {
        this.Role = role;
        this.Content = content;
    }

    public string Role { get; set; } = "";

    public string Content { get; set; } = "";
}
