namespace Libala.MobileToolbar;

internal sealed record ToolbarRegistration(string Id, string Label, int Order, Action Action, Func<bool> IsAvailable);
