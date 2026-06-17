package com.bytedance.feedbackerlib.manager;

import android.view.MotionEvent;
import com.bytedance.feedbackerlib.manager.k;
import com.bytedance.feedbackerlib.view.SupportCustomInterceptLinearLayout;

/* loaded from: classes.dex */
class r implements SupportCustomInterceptLinearLayout.a {
    final /* synthetic */ k.m a;
    final /* synthetic */ k b;

    r(k kVar, k.m mVar) {
        this.b = kVar;
        this.a = mVar;
    }

    @Override // com.bytedance.feedbackerlib.view.SupportCustomInterceptLinearLayout.a
    public boolean a(MotionEvent motionEvent) {
        k.v(this.b, motionEvent);
        this.a.onTouchEvent(motionEvent);
        return this.a.a();
    }
}
