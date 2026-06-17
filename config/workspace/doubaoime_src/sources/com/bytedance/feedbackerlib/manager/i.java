package com.bytedance.feedbackerlib.manager;

import android.view.View;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
class i implements View.OnClickListener {
    final /* synthetic */ k a;

    i(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    @RequiresApi(api = 19)
    public void onClick(View view) {
        k.r(this.a);
    }
}
