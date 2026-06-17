using System;

namespace Pathoschild.Stardew.ChestsAnywhere;

public interface IMobileToolbarApi
{
    void RegisterButton(string id, string label, int order, Action action, Func<bool> isAvailable);
}
