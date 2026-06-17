package com.bytedance.feedbackerlib.manager;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
class p implements View.OnTouchListener {
    final /* synthetic */ k a;

    p(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        k.v(this.a, motionEvent);
        z = this.a.S;
        if (z) {
            return false;
        }
        return this.a.k.onTouchEvent(motionEvent);
    }
}
