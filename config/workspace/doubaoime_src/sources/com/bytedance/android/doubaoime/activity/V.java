package com.bytedance.android.doubaoime.activity;

import android.database.DataSetObserver;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivity;

/* loaded from: classes.dex */
class V extends DataSetObserver {
    final /* synthetic */ SettingsActivity.a a;

    V(SettingsActivity.a aVar) {
        this.a = aVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        PreferenceScreen preferenceScreen;
        SwitchPreference switchPreference;
        super.onChanged();
        preferenceScreen = this.a.f1943g;
        switchPreference = this.a.h;
        preferenceScreen.setSummary(switchPreference.isChecked() ? this.a.getString(C0838R.string.option_open_status) : this.a.getString(C0838R.string.option_close_status));
    }
}
