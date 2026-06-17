using Android.App;
using Android.OS;
using Android.Widget;
using AndroidX.AppCompat.App;
using SMAPIGameLoader.Tool;
using System;
using System.Collections.Generic;
using System.IO;
using Xamarin.Essentials;

namespace SMAPIGameLoader.Launcher;

[Activity(
    Label = "MOD 管理器",
    Theme = "@style/AppTheme"
)]
internal class ModManagerActivity : AppCompatActivity
{
    private ModAdapter modAdapter;
    private readonly List<ModItemView> mods = new();

    protected override void OnCreate(Bundle savedInstanceState)
    {
        base.OnCreate(savedInstanceState);
        Platform.Init(this, savedInstanceState);
        SetContentView(Resource.Layout.ModManagerLayout);
        ActivityTool.Init(this);
        this.SetupPage();
    }

    private void SetupPage()
    {
        ListView modsListView = FindViewById<ListView>(Resource.Id.modsListViews);
        modsListView.Adapter = this.modAdapter = new ModAdapter(this, this.mods, this.OnToggleMod);
        modsListView.ItemClick += (sender, e) => this.OnClickModItemView(e);

        FindViewById<Button>(Resource.Id.InstallModBtn).Click += (sender, e) => ModInstaller.OnClickInstallMod(this.RefreshMods);
        FindViewById<Button>(Resource.Id.OpenFolderModsBtn).Click += (sender, e) => FileTool.OpenAppFilesExternalFilesDir("Mods");
        this.RefreshMods();
    }

    private void RefreshMods()
    {
        this.mods.Clear();
        try
        {
            List<string> enabledManifests = new();
            List<string> disabledManifests = new();
            ModTool.FindManifestFile(ModTool.ModsDir, enabledManifests);
            ModTool.FindManifestFile(ModTool.DisabledModsDir, disabledManifests);
            foreach (string manifest in enabledManifests)
                this.mods.Add(new ModItemView(manifest, this.mods.Count, isEnabled: true));
            foreach (string manifest in disabledManifests)
                this.mods.Add(new ModItemView(manifest, this.mods.Count, isEnabled: false));
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "刷新 MOD 列表失败");
        }

        this.modAdapter.RefreshMods();
        int enabledCount = this.mods.FindAll(mod => mod.IsEnabled).Count;
        FindViewById<TextView>(Resource.Id.foundModsText).Text = $"已安装 MOD：{this.mods.Count}（启用 {enabledCount}）";
    }

    private void OnToggleMod(ModItemView mod, bool enabled)
    {
        if (ModTool.SetEnabled(mod, enabled, out string error))
        {
            ToastNotifyTool.Notify(enabled ? "已启用：" + mod.modName : "已停用：" + mod.modName);
            this.RefreshMods();
            return;
        }

        DialogTool.Show("切换失败", error ?? "无法移动 MOD 文件夹");
        this.RefreshMods();
    }

    private void OnClickModItemView(AdapterView.ItemClickEventArgs e)
    {
        ModItemView mod = this.modAdapter.GetModOnClick(e);
        if (mod is null)
            return;

        new AndroidX.AppCompat.App.AlertDialog.Builder(this)
            .SetTitle(mod.NameText)
            .SetItems(["编辑中文备注", "导出该 MOD 调试日志", "删除 MOD"], (sender, args) =>
            {
                switch (args.Which)
                {
                    case 0:
                        this.EditChineseNote(mod);
                        break;
                    case 1:
                        LogExportTool.ExportLatest(mod);
                        break;
                    case 2:
                        this.ConfirmDelete(mod);
                        break;
                }
            })
            .SetNegativeButton("取消", (sender, args) => { })
            .Show();
    }

    private void EditChineseNote(ModItemView mod)
    {
        EditText input = new(this)
        {
            Text = ModNotesStore.Get(mod.modUniqueId),
            Hint = "例如：头像美化、伙伴系统"
        };
        new AndroidX.AppCompat.App.AlertDialog.Builder(this)
            .SetTitle("中文备注：" + mod.modName)
            .SetView(input)
            .SetPositiveButton("保存", (sender, args) =>
            {
                ModNotesStore.Set(mod.modUniqueId, input.Text);
                this.RefreshMods();
            })
            .SetNegativeButton("取消", (sender, args) => { })
            .Show();
    }

    private void ConfirmDelete(ModItemView mod)
    {
        DialogTool.Show(
            "删除 MOD",
            $"确定删除“{mod.modName}”吗？\n\n此操作会删除该 MOD 文件夹。",
            buttonOKName: "确认删除",
            buttonCancelName: "取消",
            onClickYes: () =>
            {
                if (ModInstaller.TryDeleteMod(mod.modFolderPath, true))
                {
                    ToastNotifyTool.Notify("已删除：" + mod.modName);
                    this.RefreshMods();
                }
            },
            onClickCancel: () => { }
        );
    }
}
