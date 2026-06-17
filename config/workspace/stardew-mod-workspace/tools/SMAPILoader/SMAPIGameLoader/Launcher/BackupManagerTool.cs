using System;
using System.Collections.Generic;
using System.IO;
using System.IO.Compression;
using System.Linq;
using System.Text;
using SMAPIGameLoader.Tool;

namespace SMAPIGameLoader.Launcher;

internal static class BackupManagerTool
{
    public static readonly string ExportsDir = Path.Combine(FileTool.ExternalFilesDir, "Exports");
    private static readonly string[] BackupFolders = ["Mods", "DisabledMods", "Saves", "LauncherData", "ErrorLogs"];

    public static void ExportCompleteBackup()
    {
        try
        {
            Directory.CreateDirectory(ExportsDir);
            string fileName = $"SMAPI-FULL-BACKUP-{DateTime.Now:yyyyMMdd-HHmmss}.zip";
            string outputPath = Path.Combine(ExportsDir, fileName);
            List<string> skippedFiles = new();
            using (ZipArchive archive = ZipFile.Open(outputPath, ZipArchiveMode.Create))
            {
                foreach (string folder in BackupFolders)
                    AddDirectory(archive, folder, skippedFiles);

                ZipArchiveEntry report = archive.CreateEntry("BackupInfo.txt", CompressionLevel.Optimal);
                using StreamWriter writer = new(report.Open(), Encoding.UTF8);
                writer.WriteLine($"Archive: {fileName}");
                writer.WriteLine($"Created: {DateTime.Now:yyyy-MM-dd HH:mm:ss}");
                writer.WriteLine("Contents: Mods, DisabledMods, Saves, LauncherData and ErrorLogs.");
                writer.WriteLine("This file may contain private API keys in mod configuration files.");
                writer.WriteLine(skippedFiles.Count == 0 ? "Result: Complete." : $"Result: Skipped {skippedFiles.Count} file(s).");
                foreach (string skippedFile in skippedFiles)
                    writer.WriteLine($"- {skippedFile}");
            }

            DialogTool.Show(
                "备份已导出",
                $"文件已生成：{fileName}\n\n请点击“打开导出文件夹”，将 ZIP 发送到其他设备。"
                    + (skippedFiles.Count == 0 ? "" : $"\n\n注意：有 {skippedFiles.Count} 个文件未能读取，请查看 ZIP 内的 BackupInfo.txt。")
            );
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "导出完整备份失败");
        }
    }

    public static async void PickAndImportCompleteBackup()
    {
        try
        {
            var file = await FilePickerTool.PickZipFile("请选择 SMAPI-FULL-BACKUP ZIP");
            if (file is null)
                return;

            DialogTool.Show(
                "导入完整备份",
                $"将导入：{file.FileName}\n\n同名 MOD、存档与备注会被覆盖。建议仅在新的测试启动器中操作。",
                buttonOKName: "确认导入",
                buttonCancelName: "取消",
                onClickYes: () => ImportCompleteBackup(file.FullPath),
                onClickCancel: () => { }
            );
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "选择备份文件失败");
        }
    }

    private static void ImportCompleteBackup(string backupPath)
    {
        try
        {
            int extractedFiles = 0;
            using ZipArchive archive = ZipFile.OpenRead(backupPath);
            foreach (ZipArchiveEntry entry in archive.Entries.Where(entry => !string.IsNullOrEmpty(entry.Name)))
            {
                string entryName = entry.FullName.Replace('\\', '/');
                string topFolder = entryName.Split('/', StringSplitOptions.RemoveEmptyEntries).FirstOrDefault() ?? "";
                if (!BackupFolders.Contains(topFolder, StringComparer.OrdinalIgnoreCase))
                    continue;
                if (entryName.Split('/').Any(part => part == ".."))
                    throw new InvalidDataException("备份 ZIP 中包含不安全路径");

                string destination = Path.GetFullPath(Path.Combine(FileTool.ExternalFilesDir, entryName));
                string root = Path.GetFullPath(FileTool.ExternalFilesDir).TrimEnd(Path.DirectorySeparatorChar) + Path.DirectorySeparatorChar;
                if (!destination.StartsWith(root, StringComparison.OrdinalIgnoreCase))
                    throw new InvalidDataException("备份 ZIP 中包含不安全路径");

                Directory.CreateDirectory(Path.GetDirectoryName(destination)!);
                entry.ExtractToFile(destination, overwrite: true);
                extractedFiles++;
            }

            DialogTool.Show("导入完成", $"已恢复 {extractedFiles} 个文件。\n\n请返回首页后启动游戏验证存档与 MOD。");
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "导入完整备份失败");
        }
    }

    private static void AddDirectory(ZipArchive archive, string folderName, List<string> skippedFiles)
    {
        string sourcePath = Path.Combine(FileTool.ExternalFilesDir, folderName);
        if (!Directory.Exists(sourcePath))
            return;

        foreach (string filePath in Directory.EnumerateFiles(sourcePath, "*", SearchOption.AllDirectories))
        {
            string entryName = $"{folderName}/{Path.GetRelativePath(sourcePath, filePath).Replace(Path.DirectorySeparatorChar, '/')}";
            try
            {
                archive.CreateEntryFromFile(filePath, entryName, CompressionLevel.Optimal);
            }
            catch (Exception ex) when (ex is IOException or UnauthorizedAccessException)
            {
                skippedFiles.Add($"{entryName} ({ex.Message})");
            }
        }
    }
}
