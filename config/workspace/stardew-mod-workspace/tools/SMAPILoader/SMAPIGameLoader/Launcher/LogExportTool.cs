using System;
using System.IO;
using SMAPIGameLoader.Tool;

namespace SMAPIGameLoader.Launcher;

internal static class LogExportTool
{
    private const string LatestLogFileName = "SMAPI-latest.txt";

    public static void ExportLatest(ModItemView mod = null)
    {
        try
        {
            string sourcePath = Path.Combine(FileTool.ExternalFilesDir, "ErrorLogs", LatestLogFileName);
            if (!File.Exists(sourcePath))
            {
                DialogTool.Show("没有可导出的日志", "请先启动游戏并复现问题，再回到启动器导出日志。");
                return;
            }

            Directory.CreateDirectory(BackupManagerTool.ExportsDir);
            string subject = mod is null ? "完整" : SafeFileName(mod.modName);
            string outputName = $"SMAPI日志-{subject}-{DateTime.Now:yyyyMMdd-HHmmss}.txt";
            string outputPath = Path.Combine(BackupManagerTool.ExportsDir, outputName);
            File.Copy(sourcePath, outputPath, overwrite: true);
            string detail = mod is null
                ? "这是完整的最新 SMAPI 日志。"
                : $"这是在检查“{mod.modName}”时导出的完整最新日志，便于保留异常堆栈。";
            DialogTool.Show("日志已导出", $"{detail}\n\n文件：{outputName}\n请从“打开导出目录”中取出。");
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "导出日志失败");
        }
    }

    private static string SafeFileName(string value)
    {
        foreach (char invalid in Path.GetInvalidFileNameChars())
            value = value.Replace(invalid, '_');
        return value;
    }
}
