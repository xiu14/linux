package com.bytedance.feedbackerlib.manager;

import android.view.View;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
class g implements View.OnClickListener {
    final /* synthetic */ k a;

    g(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    @RequiresApi(api = 21)
    public void onClick(View view) {
        k.q(this.a);
    }
}
