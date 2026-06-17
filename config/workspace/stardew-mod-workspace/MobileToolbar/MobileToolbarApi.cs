namespace Libala.MobileToolbar;

public sealed class MobileToolbarApi : IMobileToolbarApi
{
    private readonly Action<string, string, int, Action, Func<bool>> register;

    public MobileToolbarApi(Action<string, string, int, Action, Func<bool>> register)
    {
        this.register = register;
    }

    public void RegisterButton(string id, string label, int order, Action action, Func<bool> isAvailable)
    {
        this.register(id, label, order, action, isAvailable);
    }
}
