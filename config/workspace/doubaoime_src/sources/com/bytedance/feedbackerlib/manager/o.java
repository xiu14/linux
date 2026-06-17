package com.bytedance.feedbackerlib.manager;

import android.view.MotionEvent;
import com.bytedance.feedbackerlib.view.CustomScrollView;

/* loaded from: classes.dex */
class o implements CustomScrollView.a {
    final /* synthetic */ k a;

    o(k kVar) {
        this.a = kVar;
    }

    @Override // com.bytedance.feedbackerlib.view.CustomScrollView.a
    public boolean a(MotionEvent motionEvent) {
        boolean z;
        k.v(this.a, motionEvent);
        z = this.a.S;
        if (z) {
            return false;
        }
        this.a.k.onTouchEvent(motionEvent);
        return this.a.k.a();
    }
}
