package com.bytedance.feedbackerlib.manager;

import android.view.View;

/* loaded from: classes.dex */
class m implements View.OnClickListener {
    final /* synthetic */ k a;

    m(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k.t(this.a);
    }
}
