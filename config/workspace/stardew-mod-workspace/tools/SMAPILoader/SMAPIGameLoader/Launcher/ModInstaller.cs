using Newtonsoft.Json.Linq;
using SharpCompress.Archives;
using SMAPIGameLoader.Tool;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using Xamarin.Essentials;

namespace SMAPIGameLoader.Launcher;

internal static class ModInstaller
{
    public static string ModDir = ModTool.ModsDir;
    private static readonly HashSet<string> SupportedExtensions = new(StringComparer.OrdinalIgnoreCase)
    {
        ".zip", ".rar", ".7z", ".tar", ".gz", ".bz2"
    };

    public static Version GetMinGameVersion(JObject manifest)
    {
        return Version.TryParse(manifest["MinimumGameVersion"]?.ToString(), out Version version) ? version : null;
    }

    public static Version GetMinSMAPIVersion(JObject manifest)
    {
        return Version.TryParse(manifest["MinimumApiVersion"]?.ToString(), out Version version) ? version : null;
    }

    public static async void OnClickInstallMod(Action onInstalledCallback = null)
    {
        try
        {
            IEnumerable<FileResult> pickedFiles = await FilePickerTool.PickArchiveFiles();
            List<string> results = new();
            int installedCount = 0;
            foreach (FileResult pickedFile in pickedFiles)
            {
                if (!SupportedExtensions.Contains(Path.GetExtension(pickedFile.FileName)))
                {
                    results.Add($"跳过 {pickedFile.FileName}：不支持的格式");
                    continue;
                }

                try
                {
                    int packageCount = InstallArchive(pickedFile.FullPath, pickedFile.FileName);
                    results.Add($"成功 {pickedFile.FileName}：{packageCount} 个 MOD");
                    installedCount += packageCount;
                }
                catch (Exception ex)
                {
                    results.Add($"失败 {pickedFile.FileName}：{ex.Message}");
                }
            }

            if (results.Count == 0)
                return;

            FileTool.ClearCache();
            DialogTool.Show(
                installedCount > 0 ? "MOD 导入完成" : "MOD 导入失败",
                string.Join(Environment.NewLine, results)
            );
            if (installedCount > 0)
                onInstalledCallback?.Invoke();
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "导入 MOD 失败");
        }
    }

    private static int InstallArchive(string archivePath, string displayName)
    {
        string stagingPath = Path.Combine(FileTool.ExternalFilesDir, "Cache", "ModImport", Guid.NewGuid().ToString("N"));
        Directory.CreateDirectory(stagingPath);
        try
        {
            using IArchive archive = ArchiveFactory.OpenArchive(archivePath);
            foreach (IArchiveEntry entry in archive.Entries.Where(entry => !entry.IsDirectory))
            {
                string key = (entry.Key ?? "").Replace('\\', '/');
                if (key.StartsWith("/") || key.Split('/').Any(part => part == ".."))
                    throw new InvalidDataException("压缩包包含不安全的路径");

                string destinationRoot = Path.GetFullPath(stagingPath).TrimEnd(Path.DirectorySeparatorChar) + Path.DirectorySeparatorChar;
                string destinationFile = Path.GetFullPath(Path.Combine(stagingPath, key));
                if (!destinationFile.StartsWith(destinationRoot, StringComparison.OrdinalIgnoreCase))
                    throw new InvalidDataException("压缩包包含不安全的路径");

                Directory.CreateDirectory(Path.GetDirectoryName(destinationFile)!);
                using Stream input = entry.OpenEntryStream();
                using FileStream output = File.Create(destinationFile);
                input.CopyTo(output);
            }

            string[] manifests = Directory.GetFiles(stagingPath, ModTool.ManifiestFileName, SearchOption.AllDirectories);
            if (manifests.Length == 0)
                throw new InvalidDataException("压缩包内没有 manifest.json");

            Directory.CreateDirectory(ModDir);
            string rootManifest = Path.Combine(stagingPath, ModTool.ManifiestFileName);
            if (File.Exists(rootManifest))
            {
                JObject manifest = JObject.Parse(File.ReadAllText(rootManifest));
                string folderName = SafeFolderName(manifest["UniqueID"]?.ToString() ?? Path.GetFileNameWithoutExtension(displayName));
                CopyDirectory(stagingPath, Path.Combine(ModDir, folderName));
            }
            else
            {
                foreach (string childDirectory in Directory.GetDirectories(stagingPath))
                    CopyDirectory(childDirectory, Path.Combine(ModDir, Path.GetFileName(childDirectory)));
            }

            return manifests.Length;
        }
        finally
        {
            if (Directory.Exists(stagingPath))
                Directory.Delete(stagingPath, true);
        }
    }

    private static string SafeFolderName(string value)
    {
        foreach (char invalidCharacter in Path.GetInvalidFileNameChars())
            value = value.Replace(invalidCharacter, '_');
        return string.IsNullOrWhiteSpace(value) ? "ImportedMod" : value;
    }

    private static void CopyDirectory(string sourcePath, string destinationPath)
    {
        Directory.CreateDirectory(destinationPath);
        foreach (string directory in Directory.GetDirectories(sourcePath, "*", SearchOption.AllDirectories))
            Directory.CreateDirectory(Path.Combine(destinationPath, Path.GetRelativePath(sourcePath, directory)));
        foreach (string file in Directory.GetFiles(sourcePath, "*", SearchOption.AllDirectories))
        {
            string destinationFile = Path.Combine(destinationPath, Path.GetRelativePath(sourcePath, file));
            Directory.CreateDirectory(Path.GetDirectoryName(destinationFile)!);
            File.Copy(file, destinationFile, overwrite: true);
        }
    }

    internal static bool TryDeleteMod(string folderPath, bool cleanupParentFolder)
    {
        try
        {
            if (!Directory.Exists(folderPath))
                return false;

            Directory.Delete(folderPath, true);
            if (cleanupParentFolder)
            {
                DirectoryInfo? parent = Directory.GetParent(folderPath);
                if (parent is not null
                    && !parent.FullName.Equals(ModTool.ModsDir, StringComparison.OrdinalIgnoreCase)
                    && !parent.FullName.Equals(ModTool.DisabledModsDir, StringComparison.OrdinalIgnoreCase)
                    && !parent.EnumerateFileSystemInfos().Any())
                    parent.Delete();
            }

            return true;
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "删除 MOD 失败");
            return false;
        }
    }
}
