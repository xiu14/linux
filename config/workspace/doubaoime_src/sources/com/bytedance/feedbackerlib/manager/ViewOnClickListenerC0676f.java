package com.bytedance.feedbackerlib.manager;

import android.view.View;
import androidx.annotation.RequiresApi;

/* renamed from: com.bytedance.feedbackerlib.manager.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ViewOnClickListenerC0676f implements View.OnClickListener {
    final /* synthetic */ k a;

    ViewOnClickListenerC0676f(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    @RequiresApi(api = 21)
    public void onClick(View view) {
        k.q(this.a);
    }
}
