using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SMAPIGameLoader.Launcher;

internal static class ModTool
{
    const string ModsDirName = "Mods";
    public static string ModsDir { get; } = Path.Combine(FileTool.ExternalFilesDir, ModsDirName);
    public static string DisabledModsDir { get; } = Path.Combine(FileTool.ExternalFilesDir, "DisabledMods");

    public static string ManifiestFileName = "manifest.json";
    public static void FindManifestFile(string rootDirPath, List<string> manifestFiles)
    {
        if (Directory.Exists(rootDirPath) is false)
            return;

        HashSet<string> seen = new(manifestFiles.Select(Path.GetFullPath), StringComparer.OrdinalIgnoreCase);
        FindManifestFile(rootDirPath, rootDirPath, manifestFiles, seen);
    }

    private static void FindManifestFile(string rootDirPath, string currentDirPath, List<string> manifestFiles, HashSet<string> seen)
    {
        try
        {
            bool isRoot = Path.GetFullPath(rootDirPath).Equals(Path.GetFullPath(currentDirPath), StringComparison.OrdinalIgnoreCase);
            string manifestFilePath = GetManifestFilePath(currentDirPath);
            if (!isRoot && manifestFilePath is not null && seen.Add(Path.GetFullPath(manifestFilePath)))
                manifestFiles.Add(manifestFilePath);

            foreach (string folderPath in Directory.GetDirectories(currentDirPath).OrderBy(Path.GetFileName, StringComparer.OrdinalIgnoreCase))
                FindManifestFile(rootDirPath, folderPath, manifestFiles, seen);
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex);
        }
    }

    private static string GetManifestFilePath(string dirPath)
    {
        string exactPath = Path.Combine(dirPath, ManifiestFileName);
        if (File.Exists(exactPath))
            return exactPath;

        try
        {
            return Directory.GetFiles(dirPath)
                .FirstOrDefault(file => Path.GetFileName(file).Equals(ManifiestFileName, StringComparison.OrdinalIgnoreCase));
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex);
            return null;
        }
    }

    public static bool SetEnabled(ModItemView mod, bool enabled, out string error)
    {
        error = null;
        try
        {
            string targetRoot = enabled ? ModsDir : DisabledModsDir;
            Directory.CreateDirectory(targetRoot);
            string folderName = Path.GetFileName(mod.modFolderPath.TrimEnd(Path.DirectorySeparatorChar));
            string targetPath = Path.Combine(targetRoot, folderName);
            if (Path.GetFullPath(mod.modFolderPath).Equals(Path.GetFullPath(targetPath), StringComparison.OrdinalIgnoreCase))
                return true;
            if (Directory.Exists(targetPath))
            {
                error = $"目标目录已存在：{targetPath}";
                return false;
            }

            Directory.Move(mod.modFolderPath, targetPath);
            CleanupEmptyParent(mod.modFolderPath, mod.IsEnabled ? ModsDir : DisabledModsDir);
            return true;
        }
        catch (Exception ex)
        {
            error = ex.Message;
            return false;
        }
    }

    private static void CleanupEmptyParent(string oldPath, string rootPath)
    {
        DirectoryInfo? parent = Directory.GetParent(oldPath);
        if (parent is null || Path.GetFullPath(parent.FullName).Equals(Path.GetFullPath(rootPath), StringComparison.OrdinalIgnoreCase))
            return;
        if (!parent.EnumerateFileSystemInfos().Any())
            parent.Delete();
    }
}
