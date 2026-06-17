using System;
using System.Linq;
using Mono.Cecil;

namespace SMAPIGameLoader.Game.Rewriter;

internal static class MonoGameFrameworkRewriter
{
    internal static void Rewrite(AssemblyDefinition assemblyDefinition)
    {
        try
        {
            var module = assemblyDefinition.MainModule;
            var gameType = module.Types.FirstOrDefault(t => t.FullName == "Microsoft.Xna.Framework.Game");
            if (gameType is null)
                return;

            MakePublic(gameType, "Update", "Microsoft.Xna.Framework.GameTime");

            Console.WriteLine("done Rewrite assembly: " + assemblyDefinition.FullName);
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex);
            ErrorDialogTool.Show(ex, nameof(MonoGameFrameworkRewriter));
        }
    }

    private static void MakePublic(TypeDefinition type, string methodName, string parameterTypeFullName)
    {
        var method = type.Methods.FirstOrDefault(m =>
            m.Name == methodName
            && m.Parameters.Count == 1
            && m.Parameters[0].ParameterType.FullName == parameterTypeFullName);

        if (method is null || method.IsPublic)
            return;

        method.IsPrivate = false;
        method.IsFamily = false;
        method.IsAssembly = false;
        method.IsFamilyAndAssembly = false;
        method.IsFamilyOrAssembly = false;
        method.IsPublic = true;
        Console.WriteLine($"changed method access to public: {type.FullName}.{method.Name}");
    }
}
