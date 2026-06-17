namespace Libala.NpcChat;

public interface IMobileToolbarApi
{
    void RegisterButton(string id, string label, int order, Action action, Func<bool> isAvailable);
}
