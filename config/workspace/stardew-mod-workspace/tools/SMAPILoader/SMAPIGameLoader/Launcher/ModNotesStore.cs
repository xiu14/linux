using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;

namespace SMAPIGameLoader.Launcher;

internal static class ModNotesStore
{
    private static readonly string NotesPath = Path.Combine(FileTool.ExternalFilesDir, "LauncherData", "mod-notes.json");

    public static string Get(string uniqueId)
    {
        Dictionary<string, string> notes = Load();
        return notes.TryGetValue(uniqueId ?? "", out string note) ? note : "";
    }

    public static void Set(string uniqueId, string note)
    {
        if (string.IsNullOrWhiteSpace(uniqueId))
            return;

        Dictionary<string, string> notes = Load();
        if (string.IsNullOrWhiteSpace(note))
            notes.Remove(uniqueId);
        else
            notes[uniqueId] = note.Trim();

        Directory.CreateDirectory(Path.GetDirectoryName(NotesPath)!);
        File.WriteAllText(NotesPath, JsonConvert.SerializeObject(notes, Formatting.Indented));
    }

    private static Dictionary<string, string> Load()
    {
        try
        {
            if (File.Exists(NotesPath))
                return JsonConvert.DeserializeObject<Dictionary<string, string>>(File.ReadAllText(NotesPath))
                    ?? new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase);
        }
        catch
        {
        }

        return new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase);
    }
}
