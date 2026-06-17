using Android.App;
using Android.OS;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using Org.Json;
using SMAPIGameLoader.Game.Rewriter;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Text.Json.Nodes;
using System.Threading.Tasks;
using Xamarin.Essentials;
using static SMAPIGameLoader.Launcher.GameCloner;

namespace SMAPIGameLoader.Launcher;

internal static class GameCloner
{
    public const string ClonerStateFileName = "cloner_state.json";
    public static string ClonerStateFilePath => Path.Combine(FileTool.ExternalFilesDir, ClonerStateFileName);

    public sealed class ClonerState
    {
        //for detect should Cloner again
        public int LastLauncherBuildCode { get; set; } = 0;
        public string LastGameVersionString { get; set; } = "0.0.0.0";

        public void SaveToFile()
        {
            string jsonString = JsonConvert.SerializeObject(this, Formatting.Indented);
            File.WriteAllText(ClonerStateFilePath, jsonString);
            Console.WriteLine("done save ClonerState into file");
        }
        public void MarkCloenGameDone()
        {
            this.LastLauncherBuildCode = ApkTool.LauncherBuildCode;
            this.LastGameVersionString = StardewApkTool.CurrentGameVersion.ToString();
        }
        public bool IsNeedToCloneGame()
        {
            //check if you have edit logic or new launcher version
            Console.WriteLine("last build code: " + LastLauncherBuildCode);
            if (ApkTool.LauncherBuildCode != LastLauncherBuildCode)
                return true;

            //check if has new update game
            if (StardewApkTool.CurrentGameVersion != new Version(LastGameVersionString))
                return true;

            //don't clone game again
            return false;
        }
    }
    public static ClonerState GetClonerState()
    {
        try
        {
            //throw exception here if file never crate
            var jsonString = File.ReadAllText(ClonerStateFilePath);
            var clonerState = JsonConvert.DeserializeObject<ClonerState>(jsonString);
            return clonerState ?? new ClonerState();
        }
        catch (Exception ex)
        {
            //Recreate Game Cloner State always
            return new ClonerState();
        }
    }
    public static void Setup()
    {
        ClonerState clonerState = GetClonerState();
        TaskTool.NewLine("正在检查游戏数据");

        bool isNeedCloenGame = clonerState.IsNeedToCloneGame();

        //clone each section

        if (isNeedCloenGame)
        {
            TaskTool.NewLine("正在提取游戏素材");
            //clone game assets
            GameAssetManager.VerifyAssets();
            TaskTool.NewLine("游戏素材提取完成");
            GameAssemblyManager.VerifyAssemblies();
            TaskTool.NewLine("游戏程序集提取完成");
            GameAssemblyManager.VerifyLibs();
            TaskTool.NewLine("原生组件准备完成");
        }

        //Load MonoGame.Framework.dll into reference
        GameAssemblyManager.LoadAssembly(GameAssemblyManager.MonoGameDLLFileName);

        //Rewrite StardewValley.dll
        if (isNeedCloenGame)
        {
            TaskTool.NewLine("正在适配游戏程序集");
            using (var monoGameAssemblyStream = File.Open(Path.Combine(GameAssemblyManager.AssembliesDirPath, GameAssemblyManager.MonoGameDLLFileName),
                FileMode.Open, FileAccess.ReadWrite))
            {
                TaskTool.NewLine("正在应用 MonoGame 安卓适配...");
                var monoGameAssemblyDef = StardewGameRewriter.ReadAssembly(monoGameAssemblyStream);
                MonoGameFrameworkRewriter.Rewrite(monoGameAssemblyDef);
                monoGameAssemblyDef.Write();
                TaskTool.NewLine("MonoGame 安卓适配完成");
            }

            using (var stardewAssemblyStream = File.Open(GameAssemblyManager.StardewValleyFilePath,
                FileMode.Open, FileAccess.ReadWrite))
            {

                TaskTool.NewLine("正在应用安卓 SMAPI 适配...");
                var stardewAssemblyDef = StardewGameRewriter.ReadAssembly(stardewAssemblyStream);
                StardewGameRewriter.Rewrite(stardewAssemblyDef);
                StardewAudioRewriter.Rewrite(stardewAssemblyDef);

                TaskTool.NewLine("正在保存适配后的游戏程序集");
                stardewAssemblyDef.Write();
                TaskTool.NewLine("游戏程序集适配完成");
            }

            //Don't load StardewValley assembly here
            //you should load at SMAPIActivity
            //Assembly.LoadFrom(stardewDllFilePath);
        }

        //Finally
        if (isNeedCloenGame)
        {
            //mark
            clonerState.MarkCloenGameDone();
            clonerState.SaveToFile();
            TaskTool.NewLine("已保存游戏准备状态");
        }

        TaskTool.NewLine("游戏启动准备完成");
    }
}
