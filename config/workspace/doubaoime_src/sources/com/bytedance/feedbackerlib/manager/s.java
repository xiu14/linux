package com.bytedance.feedbackerlib.manager;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.feedbackerlib.manager.k;

/* loaded from: classes.dex */
class s implements View.OnTouchListener {
    final /* synthetic */ k.m a;
    final /* synthetic */ k b;

    s(k kVar, k.m mVar) {
        this.b = kVar;
        this.a = mVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        k.v(this.b, motionEvent);
        return this.a.onTouchEvent(motionEvent);
    }
}
