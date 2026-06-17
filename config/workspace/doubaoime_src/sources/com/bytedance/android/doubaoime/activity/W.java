package com.bytedance.android.doubaoime.activity;

import android.database.DataSetObserver;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceScreen;
import com.bytedance.android.doubaoime.activity.SettingsActivity;

/* loaded from: classes.dex */
class W extends DataSetObserver {
    final /* synthetic */ SettingsActivity.a a;

    W(SettingsActivity.a aVar) {
        this.a = aVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        PreferenceScreen preferenceScreen;
        CheckBoxPreference checkBoxPreference;
        super.onChanged();
        preferenceScreen = this.a.i;
        checkBoxPreference = this.a.j;
        preferenceScreen.setSummary(checkBoxPreference.getTitle());
    }
}
