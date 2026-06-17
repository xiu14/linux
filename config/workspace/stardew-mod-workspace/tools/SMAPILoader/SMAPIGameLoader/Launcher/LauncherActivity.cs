using System;
using _Microsoft.Android.Resource.Designer;
using Android.App;
using Android.Content.PM;
using Android.OS;
using Android.Widget;
using SMAPIGameLoader.Tool;
using Xamarin.Essentials;
using AndroidX.AppCompat.App;
using System.Text;


namespace SMAPIGameLoader.Launcher;

[Activity(
    Label = "SMAPI启动器",
    MainLauncher = true,
    Theme = "@style/AppTheme",
    AlwaysRetainTaskState = true,
    LaunchMode = LaunchMode.SingleInstance,
    ScreenOrientation = ScreenOrientation.FullSensor
)]
public class LauncherActivity : AppCompatActivity
{
    public static LauncherActivity Instance { get; private set; }

    private static bool IsDeviceSupport => IntPtr.Size == 8;

    protected override void OnCreate(Bundle? savedInstanceState)
    {
        Instance = this;
        base.OnCreate(savedInstanceState);

        SetContentView(ResourceConstant.Layout.LauncherLayout);

        Platform.Init(this, savedInstanceState);
        ActivityTool.Init(this);

        //assert
        AssertRequirement();

        //ready
        OnReadyToSetupLayoutPage();
        SetDarkMode();

        //run utils scripts
        ProcessAdbExtras();
    }

    private void SetDarkMode()
    {
        AppCompatDelegate.DefaultNightMode = AppCompatDelegate.ModeNightYes;
    }

    /// <summary>
    ///     Receive argument launch activity
    /// </summary>
    private void ProcessAdbExtras()
    {
        if (AdbExtraTool.IsClickStartGame(this))
        {
            OnClickStartGame();
        }
    }

    private static bool AssetGameVerify()
    {
        try
        {
            if (StardewApkTool.IsInstalled == false)
            {
                var currentPackage = StardewApkTool.CurrentPackageInfo;
                if (currentPackage != null)
                    switch (currentPackage.PackageName)
                    {
                        case StardewApkTool.GamePlayStorePackageName:
                            ToastNotifyTool.Notify("请先从 Play 商店安装星露谷物语");
                            break;
                        case StardewApkTool.GameGalaxyStorePackageName:
                            ToastNotifyTool.Notify("请先从 Galaxy Store 安装星露谷物语");
                            break;
                    }
                else
                    ToastNotifyTool.Notify("请先安装正版星露谷物语");

                return false;
            }
        }
        catch (Exception ex)
        {
            ToastNotifyTool.Notify("检查游戏安装失败：" + ex.Message);
            return false;
        }

        return true;
    }

    private void AssertRequirement()
    {
        //check if 32bit not support
        if (IsDeviceSupport is false)
        {
            ToastNotifyTool.Notify("此启动器不支持 32 位设备");
            Finish();
            return;
        }

        //Assert Game Requirement
        if (AssetGameVerify() == false)
        {
            Finish();
            return;
        }

    }


    private void OnReadyToSetupLayoutPage()
    {

        //setup bind events
        try
        {
            FindViewById<Button>(ResourceConstant.Id.InstallSMAPIZip).Click += SMAPIInstaller.OnClickInstallSMAPIZip;
            FindViewById<Button>(ResourceConstant.Id.UploadLog).Click += (sender, e) => LogExportTool.ExportLatest();
            FindViewById<Button>(Resource.Id.ImportBackup).Click += (sender, e) => BackupManagerTool.PickAndImportCompleteBackup();
            FindViewById<Button>(Resource.Id.InstallModBtn).Click += (sender, e) => ModInstaller.OnClickInstallMod(() => { });

            var startGameBtn = FindViewById<Button>(ResourceConstant.Id.StartGame);
            startGameBtn.Click += (sender, e) => { OnClickStartGame(); };
            var modManagerBtn = FindViewById<Button>(ResourceConstant.Id.ModManagerBtn);
            modManagerBtn.Click += (sender, e) => { ActivityTool.SwapActivity<ModManagerActivity>(this, false); };

            SMAPIInstaller.OnInstalledSMAPI += NotifyInstalledSMAPIInfo;
        }
        catch (Exception ex)
        {
            ToastNotifyTool.Notify("初始化页面按钮失败");
            ErrorDialogTool.Show(ex);
            return;
        }

        //set launcher text info
        try
        {
            var launcherInfoLines = new StringBuilder();
            //set app version
            launcherInfoLines.AppendLine("启动器版本：" + AppInfo.VersionString);

            var buildDateTimeOffset = DateTimeOffset.FromUnixTimeSeconds(int.Parse(AppInfo.BuildString));
            var localDateTimeOffset = buildDateTimeOffset.ToLocalTime();
            var localDateTimeString = localDateTimeOffset.ToString("HH:mm:ss dd/MM/yyyy");
            launcherInfoLines.AppendLine($"构建时间：{localDateTimeString} (日/月/年)");

            //set support game version
            launcherInfoLines.AppendLine($"支持游戏版本：{StardewApkTool.GameVersionSupport} 或更高");
            launcherInfoLines.AppendLine("当前游戏版本：" + StardewApkTool.CurrentGameVersion);
            launcherInfoLines.AppendLine("基础项目：Stardew SMAPI Thailand");
            launcherInfoLines.AppendLine("定制功能：libala");

            FindViewById<TextView>(ResourceConstant.Id.launcherInfoTextView).Text = launcherInfoLines.ToString();

        }
        catch (Exception ex)
        {
            ToastNotifyTool.Notify("读取启动器信息失败：" + ex.Message);
            ErrorDialogTool.Show(ex);
        }

        //init ui info
        NotifyInstalledSMAPIInfo();


    }

    private void NotifyInstalledSMAPIInfo()
    {
        var smapiInstallInfo = FindViewById<TextView>(ResourceConstant.Id.SMAPIInstallInfoTextView);
        if (SMAPIInstaller.IsInstalled is false)
        {
            smapiInstallInfo.Text = "尚未安装 SMAPI";
            return;
        }

        var lines = new StringBuilder();
        lines.AppendLine($"SMAPI 版本：{SMAPIInstaller.GetCurrentVersion()}");
        lines.AppendLine($"SMAPI 构建号：{SMAPIInstaller.GetBuildCode()}");
        smapiInstallInfo.Text = lines.ToString();
    }

    private void OnClickStartGame()
    {
        Console.WriteLine("On click start game");
        EntryGame.LaunchGameActivity(this);
        Console.WriteLine("done continue UI runner");
    }
}
