package com.bytedance.android.doubaoime.activity;

import android.content.Context;
import android.view.View;
import com.bytedance.android.doubaoime.activity.SettingsActivity;

/* loaded from: classes.dex */
class a0 implements View.OnClickListener {
    final /* synthetic */ SettingsActivity.a a;

    a0(SettingsActivity.a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context;
        context = this.a.b;
        com.bytedance.android.input.common.j.l(context).b();
        SettingsActivity.a.h(this.a);
    }
}
