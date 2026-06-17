package com.bytedance.android.doubaoime.activity;

import android.view.View;
import com.bytedance.android.doubaoime.activity.SettingsActivity;

/* loaded from: classes.dex */
class Z implements View.OnClickListener {
    final /* synthetic */ SettingsActivity.a a;

    Z(SettingsActivity.a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SettingsActivity.a.h(this.a);
    }
}
