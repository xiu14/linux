using Android.App;
using Android.Views;
using Android.Widget;
using SMAPIGameLoader.Tool;
using System;
using Xamarin.Essentials;

namespace SMAPIGameLoader;

internal static class ErrorDialogTool
{
    // you will got error when you alert.Show() & Finish() it
    //example case
    // android.view.WindowLeaked: Activity crc644389b739a03c2b33.SMAPIActivity has leaked window DecorView@fd80140[Error Dialog] that was originally added here
    public static void Show(Exception exception, string title = "错误详情")
    {

        if (exception is null)
            return;

        Console.WriteLine("try show error dialog: " + exception);

        if (MainThread.IsMainThread == false)
        {
            TaskTool.RunMainThread(() =>
            {
                Show(exception, title);
            });
            return;
        }

        var dialog = new AlertDialog.Builder(ActivityTool.CurrentActivity);
        var alert = dialog.Create();
        alert.SetTitle(title);
        var text = new TextView(ActivityTool.CurrentActivity)
        {
            Text = exception.ToString()
        };
        text.SetTextIsSelectable(true);
        text.SetPadding(32, 24, 32, 24);

        var scroll = new ScrollView(ActivityTool.CurrentActivity);
        scroll.AddView(text, new ScrollView.LayoutParams(
            ViewGroup.LayoutParams.MatchParent,
            ViewGroup.LayoutParams.WrapContent));

        alert.SetView(scroll);
        alert.SetButton("确定", (c, ev) =>
        {
            // Ok button click task  
        });
        alert.Show();

        Clipboard.SetTextAsync(exception.ToString());
    }
}
