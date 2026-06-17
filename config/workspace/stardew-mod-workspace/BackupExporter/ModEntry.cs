using System.IO.Compression;
using System.Text;
using StardewModdingAPI;
using StardewModdingAPI.Events;
using StardewValley;

namespace Libala.BackupExporter;

public sealed class ModEntry : Mod
{
    private const string ExportsFolderName = "Exports";
    private const string AutoBackupsFolderName = "AutoBackups";
    private const string StateFileName = "backup-exporter-state.json";
    private readonly object exportLock = new();
    private readonly Queue<string> pendingHudMessages = new();
    private readonly Queue<Action> pendingMainThreadActions = new();
    private bool exporting;
    private ModState state = new();

    public override void Entry(IModHelper helper)
    {
        this.state = helper.Data.ReadJsonFile<ModState>(StateFileName) ?? new ModState();
        helper.Events.GameLoop.GameLaunched += this.OnGameLaunched;
        helper.Events.GameLoop.DayStarted += this.OnDayStarted;
        helper.Events.GameLoop.UpdateTicked += this.OnUpdateTicked;
    }

    private void OnGameLaunched(object? sender, GameLaunchedEventArgs e)
    {
        IMobileToolbarApi? toolbar = this.Helper.ModRegistry.GetApi<IMobileToolbarApi>("libala.MobileToolbar");
        if (toolbar is null)
        {
            this.Monitor.Log("Could not access Mobile Toolbar API. The backup button won't be available.", LogLevel.Warn);
            return;
        }

        toolbar.RegisterButton("libala.BackupExporter.export", "备份", 90, this.ExportBackup, CanOpenMenu);
    }

    private void OnDayStarted(object? sender, DayStartedEventArgs e)
    {
        if (!Context.IsMainPlayer || !Context.IsWorldReady)
            return;

        string saveKey = GetSaveKey();
        string dateKey = GetDateKey();
        if (this.state.LastAutoBackupDateBySave.TryGetValue(saveKey, out string? lastDate) && lastDate == dateKey)
            return;

        if (!this.TryBeginExport())
        {
            this.Monitor.Log("Skipped automatic morning backup because another backup is already running.", LogLevel.Trace);
            return;
        }

        int slot = this.state.NextAutoBackupSlotBySave.TryGetValue(saveKey, out int nextSlot) && nextSlot == 2 ? 2 : 1;
        this.QueueHudMessage("正在自动备份存档...");
        Task.Run(() => this.ExportAutomaticBackup(saveKey, dateKey, slot));
    }

    private void OnUpdateTicked(object? sender, UpdateTickedEventArgs e)
    {
        if (!Context.IsWorldReady)
            return;

        while (true)
        {
            Action? action;
            lock (this.pendingMainThreadActions)
            {
                if (this.pendingMainThreadActions.Count == 0)
                    break;

                action = this.pendingMainThreadActions.Dequeue();
            }

            try
            {
                action();
            }
            catch (Exception ex)
            {
                this.Monitor.Log($"Queued backup action failed: {ex}", LogLevel.Error);
            }
        }

        lock (this.pendingHudMessages)
        {
            while (this.pendingHudMessages.Count > 0)
                Game1.addHUDMessage(HUDMessage.ForCornerTextbox(this.pendingHudMessages.Dequeue()));
        }
    }

    private void ExportBackup()
    {
        if (!this.TryBeginExport())
        {
            this.QueueHudMessage("已有备份正在进行，请稍等");
            return;
        }

        string dateKey = GetDateKey();
        this.QueueHudMessage("正在导出完整备份...");
        Task.Run(() => this.ExportManualBackup(dateKey));
    }

    private void ExportManualBackup(string dateKey)
    {
        try
        {
            string exportsPath = Path.Combine(this.Helper.DirectoryPath, ExportsFolderName);
            Directory.CreateDirectory(exportsPath);
            string fileName = $"SMAPI-FULL-BACKUP-{DateTime.Now:yyyyMMdd-HHmmss}.zip";
            string archivePath = Path.Combine(exportsPath, fileName);
            List<string> skippedFiles = this.CreateBackupArchive(archivePath, fileName, "Manual", dateKey);

            this.Monitor.Log($"Created complete transfer backup: {archivePath}", LogLevel.Info);
            string exportLocation = $"Mods/{Path.GetFileName(this.Helper.DirectoryPath)}/{ExportsFolderName}";
            string message = skippedFiles.Count == 0
                ? $"备份成功：{fileName}。请在 {exportLocation} 中取出"
                : $"备份已生成，但跳过 {skippedFiles.Count} 个文件，请查看 ZIP 内报告";
            this.QueueHudMessage(message);
        }
        catch (Exception ex)
        {
            this.Monitor.Log($"Creating backup failed: {ex}", LogLevel.Error);
            this.QueueHudMessage("备份失败，请查看 SMAPI 日志");
        }
        finally
        {
            this.EndExport();
        }
    }

    private void ExportAutomaticBackup(string saveKey, string dateKey, int slot)
    {
        string autoBackupsPath = Path.Combine(this.Helper.DirectoryPath, AutoBackupsFolderName);
        string fileName = $"SMAPI-AUTO-BACKUP-{slot}.zip";
        string archivePath = Path.Combine(autoBackupsPath, fileName);
        string tempPath = archivePath + ".tmp";

        try
        {
            Directory.CreateDirectory(autoBackupsPath);
            if (File.Exists(tempPath))
                File.Delete(tempPath);

            List<string> skippedFiles = this.CreateBackupArchive(tempPath, fileName, "Automatic morning", dateKey);
            File.Move(tempPath, archivePath, overwrite: true);
            this.PruneAutomaticBackups(autoBackupsPath);

            this.QueueMainThreadAction(() =>
            {
                this.state.LastAutoBackupDateBySave[saveKey] = dateKey;
                this.state.NextAutoBackupSlotBySave[saveKey] = slot == 1 ? 2 : 1;
                this.Helper.Data.WriteJsonFile(StateFileName, this.state);
            });

            this.Monitor.Log($"Created automatic morning backup: {archivePath}", LogLevel.Info);
            string message = skippedFiles.Count == 0
                ? $"自动备份完成：{fileName}"
                : $"自动备份完成，但跳过 {skippedFiles.Count} 个文件";
            this.QueueHudMessage(message);
        }
        catch (Exception ex)
        {
            this.Monitor.Log($"Creating automatic backup failed: {ex}", LogLevel.Error);
            this.QueueHudMessage("自动备份失败，请查看 SMAPI 日志");
        }
        finally
        {
            try
            {
                if (File.Exists(tempPath))
                    File.Delete(tempPath);
            }
            catch (Exception ex)
            {
                this.Monitor.Log($"Could not delete temporary automatic backup '{tempPath}': {ex.Message}", LogLevel.Warn);
            }

            this.EndExport();
        }
    }

    private List<string> CreateBackupArchive(string archivePath, string fileName, string mode, string dateKey)
    {
        string? modsPath = Directory.GetParent(this.Helper.DirectoryPath)?.FullName;
        if (modsPath is null || !Directory.Exists(modsPath))
            throw new DirectoryNotFoundException("Mods folder could not be resolved.");

        string exportsPath = Path.Combine(this.Helper.DirectoryPath, ExportsFolderName);
        string autoBackupsPath = Path.Combine(this.Helper.DirectoryPath, AutoBackupsFolderName);
        List<string> skippedFiles = new();
        string[] excludedPaths = new[] { exportsPath, autoBackupsPath };

        using FileStream output = File.Create(archivePath);
        using ZipArchive archive = new(output, ZipArchiveMode.Create);
        this.AddFolder(archive, modsPath, "Mods", excludedPaths, skippedFiles);
        this.AddFolder(archive, Constants.SavesPath, "Saves", excludedPaths: null, skippedFiles);
        this.AddReport(archive, fileName, mode, dateKey, skippedFiles);
        return skippedFiles;
    }

    private void AddFolder(ZipArchive archive, string sourcePath, string archiveFolder, IEnumerable<string>? excludedPaths, List<string> skippedFiles)
    {
        if (!Directory.Exists(sourcePath))
        {
            skippedFiles.Add($"{archiveFolder}/ (folder was not found)");
            return;
        }

        string[] normalizedExcludedPaths = (excludedPaths ?? Array.Empty<string>())
            .Where(path => !string.IsNullOrWhiteSpace(path))
            .Select(path => Path.GetFullPath(path).TrimEnd(Path.DirectorySeparatorChar) + Path.DirectorySeparatorChar)
            .ToArray();

        foreach (string filePath in Directory.EnumerateFiles(sourcePath, "*", SearchOption.AllDirectories))
        {
            string fullFilePath = Path.GetFullPath(filePath);
            if (normalizedExcludedPaths.Any(path => fullFilePath.StartsWith(path, StringComparison.OrdinalIgnoreCase)))
                continue;

            string relativePath = Path.GetRelativePath(sourcePath, filePath).Replace(Path.DirectorySeparatorChar, '/');
            string entryName = $"{archiveFolder}/{relativePath}";
            try
            {
                archive.CreateEntryFromFile(filePath, entryName, CompressionLevel.Fastest);
            }
            catch (Exception ex) when (ex is IOException or UnauthorizedAccessException)
            {
                skippedFiles.Add($"{entryName} ({ex.Message})");
                this.Monitor.Log($"Skipped backup file '{filePath}': {ex.Message}", LogLevel.Warn);
            }
        }
    }

    private void AddReport(ZipArchive archive, string fileName, string mode, string dateKey, List<string> skippedFiles)
    {
        ZipArchiveEntry reportEntry = archive.CreateEntry("BackupInfo.txt", CompressionLevel.Fastest);
        using StreamWriter writer = new(reportEntry.Open(), Encoding.UTF8);
        writer.WriteLine($"Archive: {fileName}");
        writer.WriteLine($"Mode: {mode}");
        writer.WriteLine($"Created: {DateTime.Now:yyyy-MM-dd HH:mm:ss}");
        writer.WriteLine($"Save: {Constants.SaveFolderName}");
        writer.WriteLine($"Date: {dateKey}");
        writer.WriteLine("Contents: Mods and Saves");
        writer.WriteLine("Note: mod configuration files may contain private API keys. Keep this archive private.");
        writer.WriteLine();
        if (skippedFiles.Count == 0)
        {
            writer.WriteLine("Result: Complete; no files were skipped.");
            return;
        }

        writer.WriteLine($"Result: Incomplete; skipped {skippedFiles.Count} file(s):");
        foreach (string skippedFile in skippedFiles)
            writer.WriteLine($"- {skippedFile}");
    }

    private void PruneAutomaticBackups(string autoBackupsPath)
    {
        foreach (string filePath in Directory.EnumerateFiles(autoBackupsPath, "*.zip", SearchOption.TopDirectoryOnly))
        {
            string name = Path.GetFileName(filePath);
            if (name is "SMAPI-AUTO-BACKUP-1.zip" or "SMAPI-AUTO-BACKUP-2.zip")
                continue;

            try
            {
                File.Delete(filePath);
            }
            catch (Exception ex)
            {
                this.Monitor.Log($"Could not delete old automatic backup '{filePath}': {ex.Message}", LogLevel.Warn);
            }
        }
    }

    private bool TryBeginExport()
    {
        lock (this.exportLock)
        {
            if (this.exporting)
                return false;

            this.exporting = true;
            return true;
        }
    }

    private void EndExport()
    {
        lock (this.exportLock)
            this.exporting = false;
    }

    private void QueueHudMessage(string message)
    {
        lock (this.pendingHudMessages)
            this.pendingHudMessages.Enqueue(message);
    }

    private void QueueMainThreadAction(Action action)
    {
        lock (this.pendingMainThreadActions)
            this.pendingMainThreadActions.Enqueue(action);
    }

    private static string GetSaveKey()
    {
        return string.IsNullOrWhiteSpace(Constants.SaveFolderName)
            ? Game1.uniqueIDForThisGame.ToString()
            : Constants.SaveFolderName;
    }

    private static string GetDateKey()
    {
        return $"Y{Game1.year}-{Game1.currentSeason}-D{Game1.dayOfMonth}";
    }

    private static bool CanOpenMenu()
    {
        return Context.IsWorldReady
            && Game1.currentLocation is not null
            && Game1.activeClickableMenu is null
            && Game1.currentMinigame is null
            && !Game1.eventUp;
    }

    private sealed class ModState
    {
        public Dictionary<string, string> LastAutoBackupDateBySave { get; set; } = new(StringComparer.OrdinalIgnoreCase);
        public Dictionary<string, int> NextAutoBackupSlotBySave { get; set; } = new(StringComparer.OrdinalIgnoreCase);
    }
}
