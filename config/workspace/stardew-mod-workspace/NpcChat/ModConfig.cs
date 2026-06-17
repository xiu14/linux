namespace Libala.NpcChat;

internal sealed class ModConfig
{
    public string ApiBaseUrl { get; set; } = "https://newww.koyeb.app/v1";

    public string ApiKey { get; set; } = "";

    public string Model { get; set; } = "gemini-3.5-flash";

    public string ButtonText { get; set; } = "聊天";

    public string Language { get; set; } = "zh-CN";

    public int TimeoutSeconds { get; set; } = 45;

    public double Temperature { get; set; } = 0.85;

    public int MaxHistoryMessages { get; set; } = 18;

    public bool EnableMemory { get; set; } = true;

    public bool EnableSummaries { get; set; } = true;
}
