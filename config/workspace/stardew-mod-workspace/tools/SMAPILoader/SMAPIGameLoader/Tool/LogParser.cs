using SMAPIGameLoader.Launcher;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Essentials;

namespace SMAPIGameLoader.Tool;
internal static class LogParser
{
    static async Task<HttpResponseMessage> PostHTTPRequestAsync(this HttpClient client,
       string url, Dictionary<string, string> data)
    {
        using HttpContent formContent = new FormUrlEncodedContent(data);
        return await client.PostAsync(url, formContent).ConfigureAwait(false);
    }

    const string SMAPILogUrl = "https://smapi.io/log";
    const string SMAPILogFileName = "SMAPI-latest.txt";

    public static async void OnClickUploadLog(object sender, EventArgs eventArgs)
    {
        TaskTool.Run(ActivityTool.CurrentActivity, async () =>
        {
            try
            {
                TaskTool.SetTitle("正在上传 SMAPI 日志...");
                await TaskUploadLog();
            }
            catch (Exception ex)
            {
                ErrorDialogTool.Show(ex);
            }
        });
    }
    static async Task TaskUploadLog()
    {
        TaskTool.NewLine("starting task upload log");

        string logFilePath = Path.Combine(FileTool.ExternalFilesDir, "ErrorLogs", SMAPILogFileName);
        if (File.Exists(logFilePath) is false)
        {
            ErrorDialogTool.Show(new Exception($"没有找到日志文件：{logFilePath}"), "没有可上传的日志");
            return;
        }

        TaskTool.NewLine("read log from path: " + logFilePath);
        using HttpClient client = new();
        client.BaseAddress = new Uri(SMAPILogUrl);
        var logStringContent = File.ReadAllText(logFilePath);
        var fileSize = new FileInfo(logFilePath).Length / 1024f;
        TaskTool.NewLine($"file size: {fileSize:F2}kb");

        TaskTool.NewLine("please wait for uploading..");
        var response = await client.PostHTTPRequestAsync(SMAPILogUrl, new()
        {
            { "input", logStringContent }
        });
        TaskTool.NewLine($"response status code: ${response.StatusCode}");
        await Clipboard.SetTextAsync("");
        if (response.IsSuccessStatusCode)
        {
            var clipboardString = new StringBuilder();

            var logUrl = response.RequestMessage.RequestUri.ToString();

            clipboardString.AppendLine($"### SMAPI Log Latest");
            clipboardString.AppendLine($"> ## [Click Link Log Here]({logUrl})");
            clipboardString.AppendLine($"### Current App Info");
            clipboardString.AppendLine($"> Game {StardewApkTool.CurrentGameVersion}");
            var appBuildCode = ApkTool.LauncherBuildCode;
            clipboardString.AppendLine($"> Launcher {ApkTool.AppVersion} - {appBuildCode}");
            clipboardString.AppendLine($"> SMAPI {SMAPIInstaller.GetCurrentVersion()} - {SMAPIInstaller.GetBuildCode()}");

            await Clipboard.SetTextAsync(clipboardString.ToString());
            DialogTool.Show("SMAPI 日志已上传",
                $"日志链接：{logUrl}" +
                $"\n链接内容已复制，可以直接粘贴分享");
        }
        else
        {
            DialogTool.Show("SMAPI 日志上传失败", $"服务器返回状态：{response.StatusCode}");
        }
    }
}
