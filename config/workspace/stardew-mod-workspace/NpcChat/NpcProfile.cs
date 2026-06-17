using StardewValley;

namespace Libala.NpcChat;

internal sealed class NpcProfile
{
    public string Identity { get; set; } = "";

    public string Personality { get; set; } = "";

    public string SpeechStyle { get; set; } = "";

    public string Boundaries { get; set; } = "";

    public static NpcProfile CreateFallback(NPC npc)
    {
        return new NpcProfile
        {
            Identity = $"{npc.displayName} 是鹈鹕镇中可交谈的一位居民。",
            Personality = "根据当下关系，以自然且符合小镇生活的态度回应玩家。",
            SpeechStyle = "言简意赅，不夸张，不跳出角色。",
            Boundaries = "不要虚构重大已发生事件；不确定的事情可以含蓄回应。"
        };
    }
}
