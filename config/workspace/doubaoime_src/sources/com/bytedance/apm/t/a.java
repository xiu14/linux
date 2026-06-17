package com.bytedance.apm.t;

import android.view.FrameMetrics;
import androidx.annotation.CallSuper;

/* loaded from: classes.dex */
public abstract class a {
    private boolean a = false;

    @CallSuper
    public void c(String str) {
        this.a = true;
    }

    @CallSuper
    public void d(long j, long j2, long j3, long j4, boolean z) {
        this.a = false;
    }

    public boolean e() {
        return this.a;
    }

    public void f(String str, long j, int i) {
    }

    public void g(String str, FrameMetrics frameMetrics, int i) {
    }
}
