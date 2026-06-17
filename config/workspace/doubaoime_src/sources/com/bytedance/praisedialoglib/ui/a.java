package com.bytedance.praisedialoglib.ui;

import android.view.View;

/* loaded from: classes.dex */
class a implements View.OnClickListener {
    final /* synthetic */ PraiseDialogActivity a;

    a(PraiseDialogActivity praiseDialogActivity) {
        this.a = praiseDialogActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.finish();
    }
}
