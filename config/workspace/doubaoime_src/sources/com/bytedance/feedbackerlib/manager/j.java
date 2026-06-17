package com.bytedance.feedbackerlib.manager;

import android.view.View;

/* loaded from: classes.dex */
class j implements View.OnClickListener {
    final /* synthetic */ k a;

    j(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k.s(this.a);
    }
}
