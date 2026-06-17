package com.bytedance.android.doubaoime.activity;

import android.view.View;
import com.bytedance.android.doubaoime.activity.SettingsActivity;

/* loaded from: classes.dex */
class Y implements View.OnClickListener {
    final /* synthetic */ SettingsActivity.a a;

    Y(SettingsActivity.a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SettingsActivity.a.g(this.a);
        SettingsActivity.a.f(this.a);
    }
}
