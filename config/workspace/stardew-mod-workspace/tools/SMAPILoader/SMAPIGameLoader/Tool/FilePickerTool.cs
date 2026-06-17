using Android;
using Android.Content.PM;
using Android.OS;
using AndroidX.Core.App;
using AndroidX.Core.Content;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Essentials;

namespace SMAPIGameLoader;

internal static class FilePickerTool
{
    public static FilePickerFileType FileTypeZip = new FilePickerFileType(new Dictionary<DevicePlatform, IEnumerable<string>>
    {
        { DevicePlatform.Android, new[] { "application/zip" } },
    });
    public static FilePickerFileType FileTypeArchive = new FilePickerFileType(new Dictionary<DevicePlatform, IEnumerable<string>>
    {
        { DevicePlatform.Android, new[] { "*/*" } },
    });
    public static async Task<FileResult> PickZipFile(string title = null)
    {
        if (title == null)
            title = "请选择 ZIP 文件";

        //TODO check permission
        //android 6 --> 10 need to request External read write storage
        var activity = SMAPIGameLoader.Launcher.LauncherActivity.Instance;
        if (Build.VERSION.SdkInt >= BuildVersionCodes.M && Build.VERSION.SdkInt <= BuildVersionCodes.Q)
        {
            if (ContextCompat.CheckSelfPermission(activity, Manifest.Permission.ReadExternalStorage) != Permission.Granted
                || ContextCompat.CheckSelfPermission(activity, Manifest.Permission.WriteExternalStorage) != Permission.Granted)
            {
                ToastNotifyTool.Notify("请允许访问文件后重试");
                // Request the permissions
                ActivityCompat.RequestPermissions(activity,
                    [Manifest.Permission.ReadExternalStorage, Manifest.Permission.WriteExternalStorage],
                    1000); // 100 is a request code (you can choose any integer)
                return null;
            }
        }

        var options = new PickOptions
        {
            PickerTitle = title,
            FileTypes = FileTypeZip,
        };
        return await FilePicker.PickAsync(options);
    }

    public static async Task<IEnumerable<FileResult>> PickArchiveFiles(string title = null)
    {
        if (title == null)
            title = "请选择一个或多个 MOD 压缩包";

        var activity = SMAPIGameLoader.Launcher.LauncherActivity.Instance;
        if (Build.VERSION.SdkInt >= BuildVersionCodes.M && Build.VERSION.SdkInt <= BuildVersionCodes.Q)
        {
            if (ContextCompat.CheckSelfPermission(activity, Manifest.Permission.ReadExternalStorage) != Permission.Granted
                || ContextCompat.CheckSelfPermission(activity, Manifest.Permission.WriteExternalStorage) != Permission.Granted)
            {
                ToastNotifyTool.Notify("请允许访问文件后重试");
                ActivityCompat.RequestPermissions(activity,
                    [Manifest.Permission.ReadExternalStorage, Manifest.Permission.WriteExternalStorage],
                    1000);
                return Enumerable.Empty<FileResult>();
            }
        }

        var options = new PickOptions
        {
            PickerTitle = title,
            FileTypes = FileTypeArchive,
        };
        return await FilePicker.PickMultipleAsync(options) ?? Enumerable.Empty<FileResult>();
    }
}
