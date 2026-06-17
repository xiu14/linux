using Newtonsoft.Json.Linq;
using System;
using System.IO;

namespace SMAPIGameLoader.Launcher;

public class ModItemView
{
    public string NameText { get; private set; } = "未知 MOD";
    public string VersionText { get; private set; } = "未知版本";
    public string FolderPathText { get; private set; } = "未知路径";
    public string modName { get; private set; } = "未知 MOD";
    public string modVersion { get; private set; } = "未知版本";
    public string modUniqueId { get; private set; } = "";
    public string modFolderPath { get; private set; } = "";
    public bool IsEnabled { get; }

    public ModItemView(string manifestFilePath, int modListIndex, bool isEnabled)
    {
        this.IsEnabled = isEnabled;
        this.modFolderPath = Path.GetDirectoryName(manifestFilePath) ?? "";
        try
        {
            JObject manifest = JObject.Parse(File.ReadAllText(manifestFilePath));
            this.modName = manifest["Name"]?.ToString() ?? Path.GetFileName(this.modFolderPath);
            this.modVersion = manifest["Version"]?.ToString() ?? "未知版本";
            this.modUniqueId = manifest["UniqueID"]?.ToString() ?? this.modName;
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "读取 MOD 信息失败：" + this.modFolderPath);
        }

        this.RefreshText(modListIndex);
    }

    public void RefreshText(int modListIndex)
    {
        string alias = ModNotesStore.Get(this.modUniqueId);
        string displayName = string.IsNullOrWhiteSpace(alias) ? this.modName : $"{alias} ({this.modName})";
        this.NameText = $"[{modListIndex + 1}] {displayName}";
        this.VersionText = $"版本：{this.modVersion}  |  {(this.IsEnabled ? "已启用" : "已停用")}";
        string rootName = this.IsEnabled ? "Mods" : "DisabledMods";
        this.FolderPathText = $"{rootName}/{Path.GetFileName(this.modFolderPath)}";
    }
}
