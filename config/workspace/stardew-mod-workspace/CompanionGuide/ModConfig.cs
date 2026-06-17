namespace Libala.CompanionGuide;

internal sealed class ModConfig
{
    public string CompanionName { get; set; } = "小豪";

    public string Persona { get; set; } = "你是住在星露谷、陪伴玩家生活的伙伴。你温和、可靠，愿意陪玩家聊天，也熟悉小镇生活。";

    public string ApiBaseUrl { get; set; } = "https://newww.koyeb.app/v1";

    public string ApiKey { get; set; } = "";

    public string Model { get; set; } = "gemini-3.5-flash";

    public string Language { get; set; } = "zh-CN";

    public int TimeoutSeconds { get; set; } = 45;

    public double Temperature { get; set; } = 0.85;

    public int MaxHistoryMessages { get; set; } = 18;

    public bool EnableMemory { get; set; } = true;

    public int HairStyle { get; set; } = 13;

    public bool IsMale { get; set; } = true;

    public int Skin { get; set; } = 2;

    public string Shirt { get; set; } = "1003";

    public string Pants { get; set; } = "0";

    public string Shoes { get; set; } = "2";

    public bool FishingAssistEnabled { get; set; } = false;

    public bool FishingSkipMinigame { get; set; } = false;

    public bool FishingAutoHook { get; set; } = false;

    public bool FishingInfiniteBait { get; set; } = false;

    public int FishingSuccessChance { get; set; } = 100;

    public int FishingTreasureChance { get; set; } = 0;
}
