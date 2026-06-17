using Octokit;
using SMAPIGameLoader.Tool;
using StardewValley.Network;
using System;
using System.Collections.Generic;
using System.IO;
using System.IO.Compression;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Essentials;

namespace SMAPIGameLoader.Launcher;

internal static class SMAPIInstaller
{
    public const string GithubOwner = "NRTnarathip";
    public const string GithubRepoName = "SMAPI-Android-1.6";
    public static long GetBuildCode()
    {
        try
        {
            if (IsInstalled is false)
            {
                return 0;
            }

            using var stream = File.OpenRead(GetInstallFilePath);
            var assembly = Mono.Cecil.AssemblyDefinition.ReadAssembly(stream);
            var SMAPIAndroidBuild = assembly.MainModule.Types.Single(t => t.FullName == "StardewModdingAPI.Mobile.SMAPIAndroidBuild");
            string buildString = SMAPIAndroidBuild.Fields.Single(p => p.Name == "BuildCode").Constant as string;
            return long.Parse(buildString);
        }
        catch (Exception ex)
        {
            //ErrorDialogTool.Show(ex);
            return 0;
        }
    }

    public static Version GetCurrentVersion()
    {
        try
        {
            if (IsInstalled is false)
            {
                return null;
            }

            using var stream = File.OpenRead(GetInstallFilePath);
            var assembly = Mono.Cecil.AssemblyDefinition.ReadAssembly(stream);
            var constantsType = assembly.MainModule.Types.Single(t => t.FullName == "StardewModdingAPI.EarlyConstants");
            var RawApiVersionForAndroidField = constantsType.Fields.Single(p => p.Name == "RawApiVersionForAndroid");
            string version = RawApiVersionForAndroidField.Constant as string;
            return new Version(version);
        }
        catch
        {
            return new Version(0, 0, 0, 0);
        }
    }


#if false
    public static async void OnClickInstallSMAPIOnline()
    {
        try
        {
            TaskTool.Run(ActivityTool.CurrentActivity, async () =>
            {
                try
                {
                    TaskTool.SetTitle("Install SMAPI Online");
                    var github = new GitHubClient(new ProductHeaderValue("SMPAI-Installer"));
                    TaskTool.NewLine("try get all release..");
                    var releases = await github.Repository.Release.GetAll(GithubOwner, GithubRepoName);
                    TaskTool.NewLine("found release count: " + releases.Count);
                    var latestRelease = releases.FirstOrDefault();
                    if (latestRelease is null)
                    {
                        ErrorDialogTool.Show(new Exception("Failed install SMAPI, not found any release file"));
                        return;
                    }

                    var smapiAssetFile = latestRelease.Assets.FirstOrDefault(
                         asset => asset.Name.StartsWith("SMAPI-")
                         && asset.Name.EndsWith(".zip"));

                    if (smapiAssetFile != null)
                    {
                        TaskTool.NewLine("found SMAPI latest file: " + smapiAssetFile.Name);
                        var smapiZipFilePath = Path.Combine(FileTool.ExternalFilesDir, smapiAssetFile.Name);
                        TaskTool.NewLine("starting download & install");
                        TaskTool.NewLine($"file size: {FileTool.ConvertBytesToMB(smapiAssetFile.Size):F2} MB");

                        using (var netClient = new HttpClient())
                        {
                            Console.WriteLine($"Retrieving {smapiAssetFile.Name}");
                            var fileData = await netClient.GetByteArrayAsync(smapiAssetFile.BrowserDownloadUrl);
                            File.WriteAllBytes(smapiZipFilePath, fileData);
                            Console.WriteLine("done save zip file at: " + smapiZipFilePath + ", file size: " + fileData.Length);
                        }

                        InstallSMAPIFromZipFile(smapiZipFilePath);

                        TaskTool.NewLine("Successfully install SMAPI: " + smapiAssetFile.Name);
                        DialogTool.Show("Successfully Install SMAPI",
                            $"done install zip: {smapiAssetFile.Name}." +
                            $"\nyou can close this");
                    }
                    else
                    {
                        TaskTool.NewLine("Not found any SMAPI");
                    }

                    await Task.Delay(1000);
                }
                catch (Exception ex)
                {
                    ErrorDialogTool.Show(ex);
                    Console.WriteLine("error try to install SMAPI Zip: " + ex);
                }
            });
        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex);
            Console.WriteLine("error try to install SMAPI Zip: " + ex);
        }
    }
#endif

    static bool IsSMAPIZipFromPickFile(FileResult pick)
    {
        var fileName = pick.FileName;

        if (fileName.EndsWith(".zip", StringComparison.OrdinalIgnoreCase) is false)
            return false;

        if (fileName.Contains("SMAPI-Android", StringComparison.OrdinalIgnoreCase))
        {
            //check file size should less than PC
            //on PC SMAPI-4.1.10-installer-for-developers.zip
            //file size 40mb

            //on Android SMAPI-4.1.10.2-(1735397682).zip
            //file size 1.5mb
            if (File.Exists(pick.FullPath))
            {
                var fileInfo = new FileInfo(pick.FullPath);

                //less than 30mb
                return FileTool.ConvertBytesToMB(fileInfo.Length) <= 10;
            }

            return true;
        }


        return false;
    }

    public static Action OnInstalledSMAPI;
    public static async void OnClickInstallSMAPIZip(object sender, EventArgs eventArgs)
    {
        try
        {

            var pick = await FilePickerTool.PickZipFile(title: "请选择 Android 版 SMAPI ZIP 文件");
            if (pick == null)
                return;

            //assert SMAPI it's android
            if (IsSMAPIZipFromPickFile(pick) is false)
            {
                DialogTool.Show("SMAPI 安装失败", "请选择名称包含 SMAPI-Android 的安卓版本 ZIP 文件");
                return;
            }

            using var stream = await pick.OpenReadAsync();
            InstallSMAPIFromZipStream(stream);

            DialogTool.Show("SMAPI 安装完成",
                "已从 ZIP 安装：" + pick.FileName);
            OnInstalledSMAPI?.Invoke();

        }
        catch (Exception ex)
        {
            ErrorDialogTool.Show(ex, "SMAPI 安装失败");
            Console.WriteLine(ex);
        }
    }
    static void InstallSMAPIFromZipFile(string smapiZipFilePath)
    {
        using var stream = File.OpenRead(smapiZipFilePath);
        InstallSMAPIFromZipStream(stream);
    }

    static void InstallSMAPIFromZipStream(Stream smapiZipStream)
    {
        using (var zip = new ZipArchive(smapiZipStream, ZipArchiveMode.Read))
        {
            var stardewDir = GameAssemblyManager.AssembliesDirPath;
            var stardewRoot = Path.GetFullPath(stardewDir);
            if (stardewRoot.EndsWith(Path.DirectorySeparatorChar.ToString()) is false)
                stardewRoot += Path.DirectorySeparatorChar;

            foreach (var entry in zip.Entries)
            {
                if (FileTool.IsEntryDirectory(entry) || string.IsNullOrWhiteSpace(entry.Name))
                    continue;

                //remove first dir name
                //example
                //from 'SMAPI-4.1.10.2/Hello.dll'
                //to 'Hello.dll'

                string fullName = entry.FullName.Replace('\\', '/');
                int separatorIndex = fullName.IndexOf('/');
                if (separatorIndex < 0 || separatorIndex == fullName.Length - 1)
                    continue;

                var newEntryFileName = fullName.Substring(separatorIndex + 1);
                var destExtractFilePath = Path.GetFullPath(Path.Combine(stardewDir, newEntryFileName));
                if (destExtractFilePath.StartsWith(stardewRoot, StringComparison.Ordinal) is false)
                    throw new InvalidOperationException("SMAPI ZIP 中包含不安全路径：" + entry.FullName);

                ZipFileTool.Extract(entry, destExtractFilePath);
            }
        }

        FileTool.ClearCache();
    }
    public const string StardewModdingAPIFileName = "StardewModdingAPI.dll";
    public static string GetInstallFilePath => Path.Combine(GameAssemblyManager.AssembliesDirPath, StardewModdingAPIFileName);
    public static bool IsInstalled => File.Exists(GetInstallFilePath);
}
