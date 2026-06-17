namespace Libala.MobileToolbar;

public interface IMobileToolbarApi
{
    void RegisterButton(string id, string label, int order, Action action, Func<bool> isAvailable);
}
