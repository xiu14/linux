using System;

namespace UIInfoSuite2.Compatibility;

public interface IMobileToolbarApi
{
  void RegisterButton(string id, string label, int order, Action action, Func<bool> isAvailable);
}
