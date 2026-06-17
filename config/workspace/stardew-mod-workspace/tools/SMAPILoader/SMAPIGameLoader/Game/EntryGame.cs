using Android.App;
using Android.Content;
using SMAPIGameLoader.Launcher;
using System;

namespace SMAPIGameLoader;
internal static class EntryGame
{
    public static void LaunchGameActivity(Activity launcherActivity)
    {
        TaskTool.Run(launcherActivity, async () =>
        {
            LaunchGameActivityInternal(launcherActivity);
        });
    }

    static void LaunchGameActivityInternal(Activity launcherActivity)
    {
        //ToastNotifyTool.Notify("Starting Game..");
        //check game it's can launch with version

        try
        {
            if (StardewApkTool.IsGameVersionSupport == false)
            {
                ToastNotifyTool.Notify("不支持当前游戏版本：" + StardewApkTool.CurrentGameVersion + "，请更新游戏");
                return;
            }

            if (SMAPIInstaller.IsInstalled is false)
            {
                ToastNotifyTool.Notify("请先安装 SMAPI");
                return;
            }

            GameCloner.Setup();

#if DEBUG
            ToastNotifyTool.Notify("Error can't start game on Debug Mode");
            return;
#endif

            StartSMAPIActivity(launcherActivity);
        }
        catch (Exception ex)
        {
            ToastNotifyTool.Notify("启动游戏失败：" + ex.Message);
        }
    }
    //prevent Load Game Assembly in scope function LaunchGameActivityInternal()
    static void StartSMAPIActivity(Activity launcherActivity)
    {
        var intent = new Intent(launcherActivity, typeof(SMAPIActivity));
        intent.AddFlags(ActivityFlags.ClearTask);
        intent.AddFlags(ActivityFlags.NewTask);
        launcherActivity.StartActivity(intent);
        launcherActivity.Finish();
    }
}
