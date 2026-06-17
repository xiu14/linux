using Android.App;
using Android.Widget;
using System.Collections.Generic;

namespace SMAPIGameLoader.Launcher;

public class ModAdapter : BaseAdapter<ModItemView>
{
    private readonly Activity context;
    private readonly List<ModItemView> items;
    private readonly System.Action<ModItemView, bool> onEnabledChanged;

    public ModAdapter(Activity context, List<ModItemView> items, System.Action<ModItemView, bool> onEnabledChanged)
    {
        this.context = context;
        this.items = items;
        this.onEnabledChanged = onEnabledChanged;
    }

    public override ModItemView this[int position] => items[position];

    public override int Count => items.Count;

    public override long GetItemId(int position) => position;

    public override Android.Views.View GetView(int position, Android.Views.View convertView, Android.Views.ViewGroup parent)
    {
        var item = items[position];
        var view = convertView ?? context.LayoutInflater.Inflate(Resource.Layout.ModItemViewLayout, null);

        view.FindViewById<TextView>(Resource.Id.modName).Text = item.NameText;
        view.FindViewById<TextView>(Resource.Id.version).Text = item.VersionText;
        view.FindViewById<TextView>(Resource.Id.folderPath).Text = item.FolderPathText;
        var enabledSwitch = view.FindViewById<Switch>(Resource.Id.modEnabledSwitch);
        enabledSwitch.CheckedChange -= OnSwitchChanged;
        enabledSwitch.Tag = new Java.Lang.Integer(position);
        enabledSwitch.Checked = item.IsEnabled;
        enabledSwitch.CheckedChange += OnSwitchChanged;

        return view;
    }

    private void OnSwitchChanged(object sender, CompoundButton.CheckedChangeEventArgs e)
    {
        if (sender is not Switch toggle || toggle.Tag is not Java.Lang.Integer position)
            return;
        int index = position.IntValue();
        if (index < 0 || index >= items.Count || items[index].IsEnabled == e.IsChecked)
            return;

        this.onEnabledChanged(items[index], e.IsChecked);
    }

    public void RefreshMods()
    {
        NotifyDataSetChanged();
    }
    public ModItemView GetModOnClick(AdapterView.ItemClickEventArgs click)
    {
        if (items.Count == 0)
            return null;
        if (click.Position >= items.Count)
            return null;

        return items[click.Position];
    }
}
